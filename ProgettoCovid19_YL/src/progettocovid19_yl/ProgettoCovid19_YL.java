/*
    Project made by Yanchuk Bohdan and Luce Gabriele
    A programm
 */
//packege + import 
package progettocovid19_yl;


import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


// start of main class
public class ProgettoCovid19_YL {

    public static void main(String[] args) {
        //creation of object ArrayList type Paziente     
        ArrayList<Paziente> vettPat = new ArrayList<>();
        // variable of user choose
      
        // support variable for insert of data type "STRING"
        String appname = null, appsurname = null, appplace_of_birth = null, appdate_of_birth = null, appresidential_address = null,
                appdate_of_arival = null, apptime_of_arival = null, apppathologies = null;
        String appcf, appcellphone_number;
        // support variable for insert of data type "FLOAT"
        float appblood = 0, apptemperature = 0;
        // support variable for insert of data type "BOOLEAN"
        boolean apptampon;
        // data decided by programmer just to make an example
        vettPat.add(new Paziente("Mira", "Abba", "Dubai", "25/07/1993", "Milano", "13/03/2020", "15:33", "Canco allo stomaco", 30, 38, true, "BBAMRI93L65G388N", "3333333333"));
        vettPat.add(new Paziente("Kaid", "Loli", "Istambul", "02/01/1970", "Codogno", "01/09/2020", "11:03", "Cadavere", 57, 45, true, " LLOKDA70A02G388C", "1111111111"));
        vettPat.add(new Paziente("Clash", "Cancer", "Londra", "16/09/1985", "Pavia", "19/10/2020", "20:17", "Canco al corpo", 10, 70, true, "CNCCSH85P16F205G", "6666666666"));
        // cycle for to view previous data
        for (int i = 0; i < vettPat.size(); i++) {
            // function call 
            vettPat.get(i).mostra();
        }
        int scelta;
        // cycle "do{}while();" to repeat program until user do not push a botton "Cancel" to close the programm
        do {
            //view of moltiple choise
            scelta = Integer.parseInt(JOptionPane.showInputDialog(
                    "1- Nuovo paziente\n"
                    + "2- Cerca cartella clinica tramite cidice fiscale\n"
                    + "3- Cancella paziente\n"
                    + "4- Lista e numero pazienti\n"
                    + "0- Exit"));
            switch (scelta) {
                case 1:
                    // insertion of data by user
                    appname = JOptionPane.showInputDialog("Inserisci nome:");
                    appsurname = JOptionPane.showInputDialog("Inserisci cognome:");
                    appplace_of_birth = JOptionPane.showInputDialog("Inserisci luogo di nascita:");
                    appdate_of_birth = JOptionPane.showInputDialog("Inserisci data di nascita:");
                    appresidential_address = JOptionPane.showInputDialog("Inserisci indirizzo di residenza:");
                    appdate_of_arival = JOptionPane.showInputDialog("Inserisci data di arrivo:");
                    apptime_of_arival = JOptionPane.showInputDialog("Inserisci ora di arrivo:");
                    apppathologies = JOptionPane.showInputDialog("Inserisci patologie:");
                    // check of data type exception                   
                    boolean check = true;
                    //  cycle insertion of data by user
                    do {
                        check = true;
                        try {
                            appblood = Float.parseFloat(JOptionPane.showInputDialog("Inserisci saturazione del sangue: "));
                        } catch (NumberFormatException e) {
                            check = false;
                        JOptionPane.showMessageDialog(null, "\n" + "NON é UN NUMERO " + "\n" + "Inserire un valore verosimile");
                    }
                        //  control of data         
                        if (appblood >= 101 || appblood <= -1) {
                            // error message 
                            JOptionPane.showMessageDialog(null, "Inserire un valore verosimile");
                        }
                    } while ((appblood >= 101 || appblood <= -1) || !check);
                    
                    do {
                        check = true;
                        try {
                        apptemperature = Float.parseFloat(JOptionPane.showInputDialog("Inserisci la temperatura del paziente all'arrivo in nosocomio:"));
                        }catch(NumberFormatException e){
                            check = true;
                            JOptionPane.showMessageDialog(null, "\n" + "NON é UN NUMERO " + "\n" + "Inserire un valore verosimile");
                        }
                        //  control of data 
                        if (apptemperature >= 42 || apptemperature <= 34) {
                            // error message
                            JOptionPane.showMessageDialog(null, "Inseririre un valore verosimile");
                        }
                    } while (apptemperature >= 42 || apptemperature <= 34);

                    apptampon = true;
                    appcf = JOptionPane.showInputDialog("Inserisci codice fiscale:");
                    //CONTOLLO  
                    do {
                        appcellphone_number = JOptionPane.showInputDialog("Inserisci numero di telefono:");
                        if (appcellphone_number.length() != 10) {
                            JOptionPane.showMessageDialog(null, "Inserire un valore verosimile");
                        }
                    } while (appcellphone_number.length() != 10);

                    vettPat.add(new Paziente(appname, appsurname, appplace_of_birth, appdate_of_birth, appresidential_address,
                            appdate_of_arival, apptime_of_arival, apppathologies, appblood, apptemperature, apptampon, appcf, appcellphone_number));
                    break;
                
                case 2:
                    appcf = JOptionPane.showInputDialog("Inserisci codice fiscale per consultare cartella clinica:");
                    for (int i = 0; i < vettPat.size(); i++) {
                        if (appcf.equals(vettPat.get(i).getCf())) {
                            JOptionPane.showMessageDialog(null, "Cartella clinica : ");
                            vettPat.get(i).mostra();
                        }/*
                        aggiungere messaggio di errore se non troviamo il pazziente 
                        if(appcf){
                        }
                        */
                    }
                    break;
                case 3:
                    appcf = JOptionPane.showInputDialog("Inserisci codice fiscale per cancellare il paziente guarito:");
                    for (int i = 0; i < vettPat.size(); i++) {
                        if (appcf.equals(vettPat.get(i).getCf())) {
                            JOptionPane.showMessageDialog(null, "Pazziente " + vettPat.get(i).getCf() + "ha lasciato reparto COVID");
                            vettPat.remove(i);
                        }
                    }
                    break;
                case 4:
                    Collections.sort(vettPat, (Paziente p1, Paziente p2) -> p1.getSurname().compareToIgnoreCase(p2.getSurname()));
                    int iCount;
                    int appCount = 0;
                    for (iCount = 0; iCount < vettPat.size(); iCount++) {
                        appCount = iCount + 1;
                        JOptionPane.showMessageDialog(null, "Paziente numero : " + appCount);
                        vettPat.get(iCount).mostra();
                    }
                    JOptionPane.showMessageDialog(null, "Numero totale pazienti : " + appCount);
                    break;
                case 0:
                    System.exit(scelta);
                break;
            }
            
        }while (scelta != 0);
    }
        
    private static int size(String appcellphone_number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
