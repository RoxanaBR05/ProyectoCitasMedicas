/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.appointmentregistration.model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArrayMedicines {
    private ArrayList<Medicine>arrayMedicines;

    public ArrayMedicines() {
        arrayMedicines= new ArrayList<>();
    }
    
    public void addMedicines(){
        arrayMedicines.add(new Medicine("Aspirina",2770));
        arrayMedicines.add(new Medicine("Omeprazol ",744));
        arrayMedicines.add(new Medicine("Paracetamol  ",500));
        arrayMedicines.add(new Medicine("Amlodipina  ",3555.65));
        arrayMedicines.add(new Medicine("Simvastatina  ",34285.90));
        arrayMedicines.add(new Medicine("Acetaminofen", 500));
        arrayMedicines.add(new Medicine("Ibuprofeno", 800));
        arrayMedicines.add(new Medicine("Amoxicilina", 1200));
        arrayMedicines.add(new Medicine("Dipirona", 600));
    }
    
    public String[][] getMatrixMedicine(){
        String[][] matrizMedicines = new String[arrayMedicines.size()][Medicine.TITLE_MEDICINES.length];
        for (int f = 0; f< matrizMedicines.length; f++) {
                for (int c = 0; c < matrizMedicines[f].length; c++) {
                        matrizMedicines[f][c]= arrayMedicines.get(f).dateMedicine(c);

            }
            
        }
        return matrizMedicines;
    }
    
}
