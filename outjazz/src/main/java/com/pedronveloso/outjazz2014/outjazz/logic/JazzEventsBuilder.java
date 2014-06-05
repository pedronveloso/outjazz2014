package com.pedronveloso.outjazz2014.outjazz.logic;

import com.pedronveloso.outjazz2014.outjazz.utils.JazzEventComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

/**
 * Builds a list of all the Jazz Events
 */
public final class JazzEventsBuilder {

    public static ArrayList<JazzEvent> buildEvents() {
        ArrayList<JazzEvent> events = new ArrayList<JazzEvent>();

        JazzEvent tmpEvent = new JazzEvent("Carlos Martins Quarteto + DJ Johnny",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.MAY, 2, 18));

        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Wack + DJ Nokin",
                EventLocation.JARDIM_CONSELHEIRO_F_DE_SOUSA,
                newDate(GregorianCalendar.MAY, 9, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Trisonte + DJ Miguel Sá",
                EventLocation.PARQUE_QUINTA_DAS_CONCHAS,
                newDate(GregorianCalendar.MAY, 16, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Rocky Marsiano + DJ D-Mars",
                EventLocation.JARDIM_DO_CAMPO_GRANDE,
                newDate(GregorianCalendar.MAY, 23, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Adilan Ferreira",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.MAY, 30, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Cachupa Psicadélica + Dj Rycardo",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.MAY, 3, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Goove 4Tet + Dj John Player Special",
                EventLocation.JARDIM_TORRE_DE_BELEM,
                newDate(GregorianCalendar.MAY, 4, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Tributo a Jenny Miller + Dj Azza",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.MAY, 10, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("NBC + Dj Glue",
                EventLocation.JARDIM_TORRE_DE_BELEM,
                newDate(GregorianCalendar.MAY, 11, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Khayalan Trio + Dj Manu",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.MAY, 17, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("The Mingus Project + Dj John Holmes",
                EventLocation.JARDIM_TORRE_DE_BELEM,
                newDate(GregorianCalendar.MAY, 18, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Writers Delight ",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.MAY, 24, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Orlanda Guillande + Dj Casal Maravilha",
                EventLocation.JARDIM_TORRE_DE_BELEM,
                newDate(GregorianCalendar.MAY, 25, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Aidilan Ferreira",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.MAY, 30, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Bob Figurante e Convidados",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.MAY, 31, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Fresh Fred And Friends + Dj Rui Miguel Abreu ",
                EventLocation.ANFITEATRO_KEIL_DO_AMARAL_MONSANTO,
                newDate(GregorianCalendar.JUNE, 1, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Miguel Martins Trio + Dj Mr. Bird",
                EventLocation.MATA_DE_ALVALADE,
                newDate(GregorianCalendar.JUNE, 6, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Cooltour + Dj Violeta",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JUNE, 7, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("The Zany Dislexic Band + Dj Alcides",
                EventLocation.ANFITEATRO_KEIL_DO_AMARAL_MONSANTO,
                newDate(GregorianCalendar.JUNE, 8, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Daniel Lima Trio + Dj João Dinis",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JUNE, 13, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("I Love Baile Funk",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JUNE, 14, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Zuulnation + Dj Paulo Nupi",
                EventLocation.ANFITEATRO_KEIL_DO_AMARAL_MONSANTO,
                newDate(GregorianCalendar.JUNE, 15, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Blues and Swing Trio + Dj Nebur + Rare Grooves/Disco e Afins",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JUNE, 20, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("João Lencastre Trio + Dj Dedydread ",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JUNE, 21, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Caixa Cubo + Dj Rita Maia ",
                EventLocation.ANFITEATRO_KEIL_DO_AMARAL_MONSANTO,
                newDate(GregorianCalendar.JUNE, 22, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Dj Kope",
                EventLocation.ZONA_J,
                newDate(GregorianCalendar.JUNE, 27, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Macacos do Chinês + Dj X-Acto",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JUNE, 28, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Tugoslavik Orkestar + Dj Camboja",
                EventLocation.ANFITEATRO_KEIL_DO_AMARAL_MONSANTO,
                newDate(GregorianCalendar.JUNE, 29, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Wack + DJ Nokin",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JULY, 1, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Hombres com Hambre + Dj andy",
                EventLocation.MIRADOURO_DO_TOREL,
                newDate(GregorianCalendar.JULY, 4, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Francisco Pais Lotus Project + Dj Zef",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JULY, 5, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Julio Resende + Dj Twofold",
                EventLocation.JARDIM_DA_TAPADA_DAS_NECESSIDADES,
                newDate(GregorianCalendar.JULY, 6, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Betight + Dj Kamala",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JULY, 11, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Ngoma Moçambique + Dj Irmãos Makossa",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JULY, 12, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("M-Pex + Dj Kwan",
                EventLocation.JARDIM_DA_TAPADA_DAS_NECESSIDADES,
                newDate(GregorianCalendar.JULY, 13, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Andre Santos + Dj Isaac",
                EventLocation.FEIRA_DA_LADRA,
                newDate(GregorianCalendar.JULY, 18, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Madjezz + Dj Nuno Di Rosso",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JULY, 19, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Wonder Whell + Dj Mãe Dela",
                EventLocation.JARDIM_DA_TAPADA_DAS_NECESSIDADES,
                newDate(GregorianCalendar.JULY, 20, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Maskoff + Dj Ijahnheco Meet Goodvibes",
                EventLocation.VALE_DO_SILENCIO,
                newDate(GregorianCalendar.JULY, 25, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Cacique 97 + Dj Tiago Santos",
                EventLocation.JARDIM_DA_TAPADA_DAS_NECESSIDADES,
                newDate(GregorianCalendar.JULY, 27, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Oco + Dj Selecta Alice",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.JULY, 26, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Experimentalist Duo",
                EventLocation.TERREIRO_DO_PACO,
                newDate(GregorianCalendar.AUGUST, 1, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Gonçalo Marques Quarteto + Dj Tiago Fonseca",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.AUGUST, 2, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Quarteto Daniel Hewson &amp; Selma Uamusse + Dj Pan Sorbe",
                EventLocation.JARDIM_DA_ESTRELA,
                newDate(GregorianCalendar.AUGUST, 3, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Chibanga Groove + Dj Novo Major",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.AUGUST, 8, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Kilu - Frequência + Dj KajoKolodabanda",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.AUGUST, 9, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Quinteto Ricardo Pinto - Landscape + Dj Lucky",
                EventLocation.JARDIM_DA_ESTRELA,
                newDate(GregorianCalendar.AUGUST, 10, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Dj Orange Evolution",
                EventLocation.JARDIM_LADO_OCEANARIO,
                newDate(GregorianCalendar.AUGUST, 15, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Hikari + Dj Master Marghuerita",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.AUGUST, 16, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("João Hasselberg + Dj Isilda Sanches",
                EventLocation.JARDIM_DA_ESTRELA,
                newDate(GregorianCalendar.AUGUST, 17, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Jack Nkanga + Dj Kilu",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.AUGUST, 22, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("The Bagattels + Dj Ayala",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.AUGUST, 23, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("António Nruheim Trio + Dj Pedro Simões",
                EventLocation.JARDIM_AMALIA_RODRIGUES,
                newDate(GregorianCalendar.AUGUST, 29, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Calu Moreira + Dj Celeste/ Mariposa",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.AUGUST, 30, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Silk + Dj Mr Mute",
                EventLocation.JARDIM_DA_ESTRELA,
                newDate(GregorianCalendar.AUGUST, 31, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("TrackPack + Dj Stereossauro",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.SEPTEMBER, 5, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("The amplectors + Dj Kaspar",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.SEPTEMBER, 6, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Veecious + Dj Nery",
                EventLocation.PARQUE_TEJO,
                newDate(GregorianCalendar.SEPTEMBER, 7, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Gileno Santana Trio + Dj Rui Pragal da Cunha",
                EventLocation.BICA_ESCADARIAS,
                newDate(GregorianCalendar.SEPTEMBER, 12, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Open source",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.SEPTEMBER, 13, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Filipe Melo Trio + Dj Switchst(D)ance",
                EventLocation.PARQUE_TEJO,
                newDate(GregorianCalendar.SEPTEMBER, 14, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Lisbon Lab Francisco Sales + Dj Mary B",
                EventLocation.JARDIM_DO_MIRADOURO_DE_S_PEDRO_ALCANTARA,
                newDate(GregorianCalendar.SEPTEMBER, 19, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Gapura + Dj Mike Stellar",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.SEPTEMBER, 20, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Catarina dos Santos + DJ Ride",
                EventLocation.PARQUE_TEJO,
                newDate(GregorianCalendar.SEPTEMBER, 21, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Francisco Sales + DJ Mary B",
                EventLocation.JARDIM_DO_MIRADOURO_DE_S_PEDRO_ALCANTARA,
                newDate(GregorianCalendar.SEPTEMBER, 26, 18));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Mão na Massa",
                EventLocation.PRACA_MARTINS_MONIZ,
                newDate(GregorianCalendar.SEPTEMBER, 27, 17));
        events.add(tmpEvent);

        // ---------------------
        tmpEvent = new JazzEvent("Maloca - Mo Francesco Quintetto + Dj Vitória Régia",
                EventLocation.PARQUE_TEJO,
                newDate(GregorianCalendar.SEPTEMBER, 28, 17));
        events.add(tmpEvent);


        // re-order jazz events by date
        Collections.sort(events, new JazzEventComparator());

        return events;
    }


    private static GregorianCalendar newDate(int month, int day, int hour) {
        return new GregorianCalendar(2014, month, day, hour, 0);
    }
}
