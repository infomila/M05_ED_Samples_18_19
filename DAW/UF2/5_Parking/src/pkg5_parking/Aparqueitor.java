/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_parking;

/**
 *
 * @author Usuari
 */
public class Aparqueitor {

    public static int ERROR = -2;
    public static int NO_HI_HA_LLOC = -1;
    public static int CODI_NO_CLIENT = 0;

    /**
     * La funció busca una plaça de pàrquing lliure per un client, donada la
     * informació de l’estructura del pàrquing i de l’ocupació actual.
     *
     * @param codiClient És codi del client que vol aparcar (p.ex. 175) . Si el
     * client no és soci, s’indica amb un codi zero ( Parking.CODI_NO_CLIENT=0)
     * @param longitudCotxeCm longitud en cm del cotxe que volem aparcar (p.ex.
     * 400)
     * @param placesCodiClient taula amb tantes posicions com places té el
     * pàrquing. Cada posició de la taula conté el codi de client al que esta
     * assignada la plaça, o zero (Parking.CODI_NO_CLIENT=0) si és una plaça
     * disponible per a tothom. Per exemple, un parking de 3 places tindria
     * placesCodiClient = { 123, 0, 300 }, la primera assignada al client 123,
     * la segona és oberta per tothom, i la tercera exclusiva pel client 300.
     * @param placesLongitudCm taula amb tantes posicions com places té el
     * pàrquing. Cada posició de la taula conté la longitud en cm d’una plaça.
     * @param placesOcupades taula amb tantes posicions com places té el
     * pàrquing. Cada posició de la taula indica si la plaça ja està ocupada per
     * un cotxe (true)
     * @return
     */
    public static int buscaLlocLliure(
            int codiClient,
            int longitudCotxeCm,
            int placesCodiClient[],
            int placesLongitudCm[],
            boolean placesOcupades[]
    ) {
        try {

            //------------ Asserts --------------------------
            if (codiClient < 0) {
                return ERROR;
            }
            if (longitudCotxeCm <= 0) {
                return ERROR;
            }
            if (placesLongitudCm == null) {
                return ERROR;
            }
            if (placesCodiClient == null) {
                return ERROR;
            }
            if (placesOcupades == null) {
                return ERROR;
            }
            if (placesLongitudCm.length == 0) {
                return ERROR;
            }
            if (placesLongitudCm.length != placesCodiClient.length) {
                return ERROR;
            }
            if (placesLongitudCm.length != placesOcupades.length) {
                return ERROR;
            }
            for (int lon : placesLongitudCm) {
                if (lon <= 0) {
                    return ERROR;
                }
            }
            for (int tip : placesCodiClient) {
                if (tip < 0) {
                    return ERROR;
                }
            }
            //-----------------------------------------------
            if (codiClient == CODI_NO_CLIENT) {

                for (int i = 0; i < placesLongitudCm.length; i++) {
                    if (!placesOcupades[i]) {
                        if (longitudCotxeCm < placesLongitudCm[i]) {
                            if (placesCodiClient[i] == CODI_NO_CLIENT) {
                                placesOcupades[i] = true;
                                return i;
                            }
                        }
                    }
                }
                return NO_HI_HA_LLOC;
            } else {
                for (int i = 0; i < placesLongitudCm.length; i++) {
                    if (!placesOcupades[i]) {
                        if (longitudCotxeCm < placesLongitudCm[i]) {
                            if (placesCodiClient[i] == codiClient) {
                                placesOcupades[i] = true;
                                return i;

                            }
                        }
                    }
                }
                for (int i = 0; i < placesLongitudCm.length; i++) {
                    if (!placesOcupades[i]) {
                        if (longitudCotxeCm < placesLongitudCm[i]) {
                            if (placesCodiClient[i] == CODI_NO_CLIENT) {
                                placesOcupades[i] = true;
                                return i;
                            }
                        }
                    }
                }
                return NO_HI_HA_LLOC;
            }
        } catch (Exception ex) {
            return ERROR;
        }
    }
}
