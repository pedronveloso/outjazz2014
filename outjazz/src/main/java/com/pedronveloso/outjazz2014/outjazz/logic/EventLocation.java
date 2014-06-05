package com.pedronveloso.outjazz2014.outjazz.logic;

/**
 * the various event locations and utility methods
 */
public enum EventLocation {

    PRACA_MARTINS_MONIZ,
    JARDIM_CONSELHEIRO_F_DE_SOUSA,
    PARQUE_QUINTA_DAS_CONCHAS,
    JARDIM_DO_CAMPO_GRANDE,
    MATA_DE_ALVALADE,
    ZONA_J,
    MIRADOURO_DO_TOREL,
    JARDIM_BOTTO_MACHADO,
    FEIRA_DA_LADRA,
    VALE_DO_SILENCIO,
    TERREIRO_DO_PACO,
    JARDIM_LADO_OCEANARIO,
    JARDIM_AMALIA_RODRIGUES,
    BICA_ESCADARIAS,
    JARDIM_DA_GRACA,
    JARDIM_DO_MIRADOURO_DE_S_PEDRO_ALCANTARA,
    JARDIM_TORRE_DE_BELEM,
    ANFITEATRO_KEIL_DO_AMARAL_MONSANTO,
    JARDIM_DA_TAPADA_DAS_NECESSIDADES,
    JARDIM_DA_ESTRELA,
    PARQUE_TEJO;

    /**
     * @param eventLocation location of an event
     * @return produce the user visible name for a given location, or empty string if description wasn't found
     */
    public static String getEventLocationName(EventLocation eventLocation) {
        switch (eventLocation) {
            case PRACA_MARTINS_MONIZ:
                return "Praça do Martim Moniz";

            case JARDIM_CONSELHEIRO_F_DE_SOUSA:
                return "Jardim Conselheiro Fernando de Sousa";

            case PARQUE_QUINTA_DAS_CONCHAS:
                return "Parque Quinta das Conchas";

            case JARDIM_DO_CAMPO_GRANDE:
                return "Jardim do Campo Grande";

            case MATA_DE_ALVALADE:
                return "Mata de Alvalade";

            case ZONA_J:
                return "Zona J";

            case MIRADOURO_DO_TOREL:
                return "Miradouro do Torel";

            case JARDIM_BOTTO_MACHADO:
                return "Jardim Botto Machado";

            case FEIRA_DA_LADRA:
                return "Feira da Ladra";

            case VALE_DO_SILENCIO:
                return "Vale do Silêncio";

            case TERREIRO_DO_PACO:
                return "Terreiro do Paço";

            case JARDIM_LADO_OCEANARIO:
                return "Jardim da Água (Oceanário)";

            case JARDIM_AMALIA_RODRIGUES:
                return "Jardim Amália Rodrigues";

            case BICA_ESCADARIAS:
                return "Bica - escadarias";

            case JARDIM_DA_GRACA:
                return "Jardim da Graça";

            case JARDIM_DO_MIRADOURO_DE_S_PEDRO_ALCANTARA:
                return "Jardim do Miradouro de S. Pedro de Alcântara";

            case JARDIM_TORRE_DE_BELEM:
                return "Jardim da Torre de Belém";

            case ANFITEATRO_KEIL_DO_AMARAL_MONSANTO:
                return "Anfiteatro Keil do Amaral";

            case JARDIM_DA_TAPADA_DAS_NECESSIDADES:
                return "Jardim da Tapada das Necessidades";

            case JARDIM_DA_ESTRELA:
                return "Jardim da Estrela";

            case PARQUE_TEJO:
                return "Parque Tejo";

            default:
                return "";
        }
    }

    /**
     * @param eventLocation location of an event
     * @return an usable location that can be opened by mapping apps, null if not found
     */
    public static String getEventLocationMapLink(EventLocation eventLocation) {
        // final URI should look like this "geo:47.6,-122.3?z=11"

        switch (eventLocation) {
            case PRACA_MARTINS_MONIZ:
                return "38.715971, -9.136345";

            case JARDIM_CONSELHEIRO_F_DE_SOUSA:
                return "38.726234, -9.160393";

            case PARQUE_QUINTA_DAS_CONCHAS:
                return "38.769169, -9.156697";

            case JARDIM_DO_CAMPO_GRANDE:
                return "38.754439, -9.150832";

            case MATA_DE_ALVALADE:
                return "38.759875, -9.132573";

            case ZONA_J:
                return "38.747502, -9.112580";

            case MIRADOURO_DO_TOREL:
                return "38.719319, -9.141433";

            case JARDIM_BOTTO_MACHADO:
                return "38.715882, -9.124324";

            case FEIRA_DA_LADRA:
                return "38.715622, -9.125376";

            case VALE_DO_SILENCIO:
                return "38.765920, -9.118737";

            case TERREIRO_DO_PACO:
                return "38.707277, -9.136316";

            case JARDIM_LADO_OCEANARIO:
                return "38.761975, -9.094101";

            case JARDIM_AMALIA_RODRIGUES:
                return "38.731521, -9.154922";

            case BICA_ESCADARIAS:
                return "38.710081, -9.146681";

            case JARDIM_DA_GRACA:
                return "38.716038, -9.130998";

            case JARDIM_DO_MIRADOURO_DE_S_PEDRO_ALCANTARA:
                return "38.713717, -9.186759";

            case JARDIM_TORRE_DE_BELEM:
                return "38.692945, -9.215569";

            case ANFITEATRO_KEIL_DO_AMARAL_MONSANTO:
                return "38.720422, -9.192687";

            case JARDIM_DA_TAPADA_DAS_NECESSIDADES:
                return "38.708992, -9.169833";

            case JARDIM_DA_ESTRELA:
                return "38.714720, -9.159076";

            case PARQUE_TEJO:
                return "38.782973, -9.092080";

            default:
                return "";
        }
    }
}
