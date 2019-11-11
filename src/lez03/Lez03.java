/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez03;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Lez03 {

    static String nomeEsame;
    static String[] listaNomi;
    static String[] listaCognomi;
    static int[] listaVoti;
    static int sogliaAmmissione;
    static String esameOk;
    static String esameNotOk;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        preparaEsame();
        sessioneEsame();
        correzioneEsame();
        visTabellone();

    }

    static void preparaEsame() {
        nomeEsame = Utils.AskString("Inserisci nome esame: ");
        sogliaAmmissione = Utils.AskInt("Inserisci valore soglia di ammissione: ", 1, 100);
        esameOk = Utils.AskString("Inserisci sigla per indicare superamento esame: ");
        esameNotOk = Utils.AskString("Inserisci sigla per indicare il non superamento esame: ");
        int quanti = Utils.AskInt("inserisci numero alunni", 1, 100);
        listaNomi = new String[quanti];
        listaCognomi = new String[quanti];
        listaVoti = new int[quanti];
    }

    private static void sessioneEsame() {
        for (int i = 0; i < listaCognomi.length; i++) {
            listaCognomi[i] = Utils.initCase(Utils.AskString("Inserisci cognome esaminando " + (i + 1) + " di " + listaCognomi.length + ": "));
            listaNomi[i] = Utils.initCase(Utils.AskString("Inserisci nome esaminando " + (i + 1) + " di " + listaNomi.length + ": "));
        }
    }

    private static void correzioneEsame() {
        for (int i = 0; i < listaCognomi.length; i++) {
            listaVoti[i] = Utils.AskInt("Inserisci il voto di " + listaCognomi[i] + " " + listaNomi[i] + ": ", 0, 100);
        }
    }

    private static void visTabellone() {
        String ris = null;
        for (int i = 0; i < listaCognomi.length; i++) {
            ris += listaCognomi[i] + " " + listaNomi[i] + " voto: " + listaVoti[i];
            if (listaVoti[i] >= sogliaAmmissione) {
                ris += " " + esameOk;
            } else {
                ris += " " + esameNotOk;
            }
            ris += "\n";
        }
        JOptionPane.showMessageDialog(null, ris);
    }

}
