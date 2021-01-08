package progettocovid19_yl;

import javax.swing.JOptionPane;

/**
 *
 * @author Yanchuk e Luce
 */

public class Paziente {
    // default attributes
    String name, surname, place_of_birth, date_of_birth, residential_address, 
           date_of_arival, time_of_arival, pathologies;
    float blood, temperature;
    boolean tampon;
    private String cf, cellphone_number;

    public Paziente() {
    }

    public Paziente(String name, String surname, String place_of_birth, String date_of_birth, String residential_address, String date_of_arival, String time_of_arival, String pathologies, float blood,float temperature, boolean tampon, String cf, String cellphone_number ) {
        this.name = name;
        this.surname = surname;
        this.place_of_birth = place_of_birth;
        this.date_of_birth = date_of_birth;
        this.residential_address = residential_address;
        this.date_of_arival = date_of_arival;
        this.time_of_arival = time_of_arival;
        this.pathologies = pathologies;
        this.blood = blood;
        this.temperature = temperature;
        this.tampon = tampon;
        this.cf = cf;
        this.cellphone_number = cellphone_number;
    }


    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getCellphone_number() {
        return cellphone_number;
    }

    public void setCellphone_number(String cellphone_number) {
        this.cellphone_number = cellphone_number;
    }
    public void mostra(){
        if(tampon==true){
            JOptionPane.showMessageDialog(null,"Nome : "+name+"\n"+
                "Cognome : "+surname+"\n"+
                "Luogo di nascita : "+place_of_birth+"\n"+
                "Data di nascita : "+date_of_birth+"\n"+
                "Indirizzo di residenza : "+residential_address+"\n"+
                "Data dell'arrivo : "+date_of_arival+"\n"+
                "Ora dell'arrivo : "+time_of_arival+"\n"+
                "Patologie : "+pathologies+"\n"+
                "Saturazione del sangue : "+blood+"%\n"+
                "Temperatura all'arrivo in nosocomio : "+temperature+" gradi\n"+
                "Risultato tampone : Positivo\n"+
                "Codice fiscale : "+cf+"\n"+
                "Numero di telefono : "+cellphone_number+"\n");
        }else{
            JOptionPane.showMessageDialog(null,"Nome : "+name+"\n"+
                "Cognome : "+surname+"\n"+
                "Luogo di nascita : "+place_of_birth+"\n"+
                "Data di nascita : "+date_of_birth+"\n"+
                "Indirizzo di residenza : "+residential_address+"\n"+
                "Data dell'arrivo : "+date_of_arival+"\n"+
                "Ora dell'arrivo : "+time_of_arival+"\n"+
                "Patologie : "+pathologies+"\n"+
                "Saturazione del sangue : "+blood+"%\n"+
                "Temperatura all'arrivo in nosocomio : "+temperature+" gradi\n"+
                "Risultato tampone : Negativo\n"+
                "Codice fiscale : "+cf+"\n"+
                "Numero di telefono : "+cellphone_number+"\n");
        }
    }
    public String getSurname(){
        return surname;
    }
    
}
