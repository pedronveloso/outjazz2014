package com.pedronveloso.outjazz2014.outjazz.screens;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.fscz.util.TextJustifyUtils.TextViewEx;
import com.pedronveloso.outjazz2014.outjazz.R;

public class AboutActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextViewEx tvIntro = (TextViewEx) findViewById(R.id.tv_about_intro);
        tvIntro.setText(Html.fromHtml(getString(R.string.about_text)).toString(), true);
        //TextJustifyUtils.justify(tvIntro);

        TextViewEx tvAuthor = (TextViewEx) findViewById(R.id.tv_about_me_text);
        tvAuthor.setText(getString(R.string.about_me_text), true);

        Button btnAux = (Button) findViewById(R.id.btn_email);
        btnAux.setOnClickListener(this);
        btnAux = (Button) findViewById(R.id.btn_github);
        btnAux.setOnClickListener(this);
        btnAux = (Button) findViewById(R.id.btn_gplus);
        btnAux.setOnClickListener(this);
        btnAux = (Button) findViewById(R.id.btn_license);
        btnAux.setOnClickListener(this);
        btnAux = (Button) findViewById(R.id.btn_source);
        btnAux.setOnClickListener(this);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent reusableIntent;
        switch (v.getId()) {
            case R.id.btn_email:
                reusableIntent = new Intent(Intent.ACTION_SEND);
                reusableIntent.setType("text/plain");
                reusableIntent.putExtra(Intent.EXTRA_EMAIL, "pedro.n.veloso@gmail.com");

                startActivity(Intent.createChooser(reusableIntent, getString(R.string.send_email)));
                break;

            case R.id.btn_github:
                reusableIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/pedronveloso/"));
                startActivity(reusableIntent);
                break;

            case R.id.btn_gplus:
                reusableIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/+PedroVeloso/posts"));
                startActivity(reusableIntent);
                break;

            case R.id.btn_source:
                reusableIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/pedronveloso/outjazz2014"));
                startActivity(reusableIntent);
                break;

            default:
            case R.id.btn_license:
                reusableIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.apache.org/licenses/LICENSE-2.0.html"));
                startActivity(reusableIntent);
                break;
        }

    }
}
