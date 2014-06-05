package com.pedronveloso.outjazz2014.outjazz.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.pedronveloso.outjazz2014.outjazz.R;
import com.pedronveloso.outjazz2014.outjazz.logic.EventLocation;
import com.pedronveloso.outjazz2014.outjazz.logic.JazzEvent;
import com.pedronveloso.outjazz2014.outjazz.utils.DateUtils;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class EventsAdapter extends BaseAdapter implements Filterable {

    private LayoutInflater mInflater;
    private ArrayList<JazzEvent> mJazzEventsFiltered;
    private ArrayList<JazzEvent> mJazzEventsOriginal;
    private FilterHere filter;

    private int mActiveTitle;
    private int mInactiveTitle;

    private GregorianCalendar mDateNow;

    public EventsAdapter(Context ctx, ArrayList<JazzEvent> jazzEvents) {
        mInflater = LayoutInflater.from(ctx);
        mJazzEventsFiltered = (ArrayList<JazzEvent>) jazzEvents.clone();
        mJazzEventsOriginal = (ArrayList<JazzEvent>) jazzEvents.clone();
        filter = new FilterHere();

        // get colors
        mActiveTitle = ctx.getResources().getColor(R.color.medium_blue);
        mInactiveTitle = ctx.getResources().getColor(R.color.grayed_blue);

        // current date
        mDateNow = new GregorianCalendar();
    }

    @Override
    public int getCount() {
        return mJazzEventsFiltered.size();
    }

    @Override
    public Object getItem(int position) {
        return mJazzEventsFiltered.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.jazz_item, null, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.tv_artist);
            holder.location = (TextView) convertView.findViewById(R.id.tv_place);
            holder.date = (TextView) convertView.findViewById(R.id.tv_date);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        holder.name.setText(mJazzEventsFiltered.get(position).getArtists());
        holder.location.setText(EventLocation.getEventLocationName(mJazzEventsFiltered.get
                (position).getLocation()));
        holder.date.setText(DateUtils.getShortSmartDate(mJazzEventsFiltered.get(position).getDate
                ()));

        // set artist name color according to event availability
        if (mJazzEventsFiltered.get(position).getDate().compareTo(mDateNow) == -1) {
            holder.name.setTextColor(mInactiveTitle);
        } else {
            holder.name.setTextColor(mActiveTitle);
        }

        return convertView;
    }


    @Override
    public Filter getFilter() {
        return filter;
    }

    class ViewHolder {
        TextView name;
        TextView location;
        TextView date;
    }


    private class FilterHere extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            if (constraint == null) {
                return null;
            }

            FilterResults result = new FilterResults();
            ArrayList<JazzEvent> jazzEventsResult = new ArrayList<JazzEvent>();

            // only search after 2 chars long
            if (constraint.length() >= 2) {
                String searchStr = constraint.toString().toLowerCase();

                for (JazzEvent jazzEvent : mJazzEventsOriginal) {
                    if (jazzEvent.getArtists().toLowerCase().contains(searchStr)
                            || jazzEvent.getLocation().toString().toLowerCase().contains(searchStr)) {
                        // element is according to filtering parameters
                        // add it to result
                        jazzEventsResult.add(jazzEvent);
                    }
                }
            } else {
                // search string too short, present all
                jazzEventsResult = (ArrayList<JazzEvent>) mJazzEventsOriginal.clone();
            }

            result.values = jazzEventsResult;
            return result;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            if (results != null) {
                mJazzEventsFiltered = (ArrayList<JazzEvent>) results.values;
                notifyDataSetChanged();
            }
        }
    }
}