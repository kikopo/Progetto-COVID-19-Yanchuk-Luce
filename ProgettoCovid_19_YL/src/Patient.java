
import java.util.ArrayList;

/**
 *
 * @author Yanchuk e Luce
 */

public class Patient {
    // default attributes
    protected String name, surname, place_of_birth, date_of_birth, residential_address;
    private String cf, cellphone_number;
    
    ArrayList<Patient> vettPat=new ArrayList<>();
    
    public Patient(String name, String surname, String place_of_birth, String date_of_birth, String residential_address) {
        this.name = name;
        this.surname = surname;
        this.place_of_birth = place_of_birth;
        this.date_of_birth = date_of_birth;
        this.residential_address = residential_address;
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
    
    void insertPat(){
        for(int i=0;i<vettPat.size();i++){
            
        }
    }
    void searchPat(){
        for(int i=0;i<vettPat.size();i++){
            
        }
    }
}
