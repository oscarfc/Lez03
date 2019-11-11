/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez03;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * metodo per far comparire finestra di input caricamento numeri interi
 *
 * @author tss
 */
public class Utils {

    static int AskInt(String testo) {
        //contiene il numero come testo
        String strInt;
        //dichiaro la variabile di ritorno e la inizializzo:
        int ris = 0;
        //contiene info su qualità di strInt
        boolean schifezza = true;
        while (schifezza) {
            //elaboro ris:
            //-chiedo all'utente una frase che contiene l'intero:
            strInt = JOptionPane.showInputDialog(testo);
            //trasformo stringa in intero:
            //questa riga puo creare errori allora la circondo con try catch:
            try {
                ris = Integer.parseInt(strInt);
                schifezza = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "inserisci un numero e non una frase");
            }
        }
        //ritorno il sisultato risp: 
        return ris;

    }

    static int AskInt(String testo, int min, int max) {
        //contiene il numero come testo
        String strInt;
        //dichiaro la variabile di ritorno e la inizializzo:
        int ris = 0;
        //contiene info su qualità di strInt
        boolean schifezza = true;
        while (schifezza) {
            //elaboro ris:
            //-chiedo all'utente una frase che contiene l'intero:
            strInt = JOptionPane.showInputDialog(testo + " - minimo " + min + " e massimo " + max);
            //trasformo stringa in intero:
            //questa riga puo creare errori allora la circondo con try catch:
            try {
                ris = Integer.parseInt(strInt);
                if (ris > min && ris <= max) {
                    schifezza = false;
                } else {
                    JOptionPane.showMessageDialog(null, "numero non corretto");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "numero non corretto");
            }
        }
        //ritorno il sisultato risp: 
        return ris;

    }

    static float AskFloat(String testo, int min, int max) {
        //contiene il numero come testo
        String strfloat;
        //dichiaro la variabile di ritorno e la inizializzo:
        float ris = 0;
        //contiene info su qualità di strInt
        boolean schifezza = true;
        while (schifezza) {
            //elaboro ris:
            //-chiedo all'utente una frase che contiene l'intero:
            strfloat = JOptionPane.showInputDialog(testo + " - minimo" + min + "e massimo" + max);
            //trasformo stringa in intero:
            //questa riga puo creare errori allora la circondo con try catch:
            try {
                ris = Float.parseFloat(strfloat);
                if (ris > min && ris <= max) {
                    schifezza = false;
                } else {
                    JOptionPane.showMessageDialog(null, "numero non corretto");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "numero non corretto");
            }
        }
        //ritorno il risultato risp: 
        return ris;
    }

    static float calcolaSconto(float prezzo, float sconto) {

        float ris = 0;
        float cento = 100;
        //float cento=100;
        ris = prezzo - prezzo * sconto / 100;
        return ris;
    }

    static float scorporaPercentuale(float prezzo, float percentuale) {

        float ris = 0;
        float cento = 100;
        float sconto;
        //float cento=100;
        ris = prezzo - prezzo * percentuale / 100;
        //ris=math.round(ris*100)/cento;
        return ris;
    }

    static float AskFloat(String dimmi_il_prezzo_in_euro_es_50_o_9999) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static String AskString(String testo) {
        return JOptionPane.showInputDialog(testo);
    }

    static int[] loadNumeri(int quanti) {
        int[] contenitore = new int[quanti];

        for (int i = 0; i < quanti; i++) {
            contenitore[i] = AskInt("Inserisci " + i + " valore: ");
        }
        return contenitore;
    }

    static float calcolaMedia(int[] voti) {
        float somma = 0;
        for (int i = 0; i < voti.length; i++) {
            somma += voti[i];
        }

        return somma / voti.length;
    }

    static String creaTabelloneHTML(int[] elencoVoti) {
        String testo = "table border 1";

        for (int i = 0; i < elencoVoti.length; i++) {
            testo += "<tr><td>#" + (i + 1) + "</td><td><b>" + elencoVoti[i] + "</b></td></tr>";
        }
        testo += "/table";

        return testo;
    }

    static String initCase(String str) {
        return (str.substring(0, 11).toUpperCase() + str.substring(1));
    }

}
