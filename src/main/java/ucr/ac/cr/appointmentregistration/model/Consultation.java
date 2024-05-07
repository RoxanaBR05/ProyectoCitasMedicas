/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.appointmentregistration.model;

/**
 *
 * @author Usuario
 */
public class Consultation {
    private Medicine medicines;
    private double priceConsultation;
    private int amountMedicine;
    private String observations;

    public Consultation() {
        this.medicines=null;
        this.priceConsultation =0;
        this.amountMedicine = 0;
        this.observations="";
    }

    public Consultation( double priceConsultation, int amountMedicine,Medicine medicine,String observations) {
       this.medicines=medicine;
        this.priceConsultation = priceConsultation;
        this.amountMedicine = amountMedicine;
        this.observations=observations;
    }

    public Medicine getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine medicines) {
        this.medicines = medicines;
    }

    public double getPriceConsultation() {
        return priceConsultation;
    }

    public void setPriceConsultation(double priceConsultation) {
        this.priceConsultation = priceConsultation;
    }

    public int getAmountMedicine() {
        return amountMedicine;
    }

    public void setAmountMedicine(int amountMedicine) {
        this.amountMedicine = amountMedicine;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Consultation{" + "medicines=" + medicines + ", priceConsultation=" + priceConsultation + ", amountMedicine=" + amountMedicine + ", observations=" + observations + '}';
    }
    
    
}
