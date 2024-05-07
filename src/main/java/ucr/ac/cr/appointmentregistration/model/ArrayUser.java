/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.appointmentregistration.model;

import java.util.ArrayList;

/**
 *
 * @author Camila PB
 */
public class ArrayUser {
    private ArrayList <User> listUser;

    public ArrayUser() {
        listUser = new ArrayList<>();
    }
    
    
    //Metodo que agrega al array: hay que cambiarlo para que tambien agregue al archivo JSON
    public void addUser( User user){
           if(user != null){      
                this.listUser.add(user);
            }else{
           
           }
    }
    
    //Metodo que busca el usuario
    public User userFound(int identificationCard){
        for (User user : listUser) {
            if(user.getIdentificationCard() == identificationCard){
                return user;
            }
        }
        return null;
    }
    
    
    
    
}
