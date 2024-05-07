/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.appointmentregistration.model;

/**
 *
 * @author Usuario
 */
public class Medicine {
     private String nameMedicine;
     private double priceMedicine;
     public static final String[] TITLE_MEDICINES={"Nombre de medicina","Precio de medicina"};
     
    public Medicine() {
        nameMedicine="";
       priceMedicine=0;
    }

    public Medicine(String nameMedicine, double priceMedicine) {
        this.nameMedicine = nameMedicine;
        this.priceMedicine = priceMedicine;
    }
    
    public String dateMedicine(int colum){
        switch( colum){
            case 0: return this.getNameMedicine();
            case 1: return String.valueOf(this.getPriceMedicine());
        }
        return "";
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public double getPriceMedicine() {
        return priceMedicine;
    }

    public void setPriceMedicine(double priceMedicine) {
        this.priceMedicine = priceMedicine;
    }

    @Override
    public String toString() {
        return "Medicine{" + "nameMedicine=" + nameMedicine + ", priceMedicine=" + priceMedicine + '}';
    }
     
    
     
     
}
