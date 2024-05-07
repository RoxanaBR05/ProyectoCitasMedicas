/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.appointmentregistration.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.appointmentregistration.model.ArrayUser;
import ucr.ac.cr.appointmentregistration.view.GUIPatientData;
import ucr.ac.cr.appointmentregistration.view.GUIUser;

/**
 *
 * @author Camila PB
 */
public class ControllerUser implements ActionListener {
    private GUIUser guiUser;
    private ArrayUser arrayUser;
    private ControllerRegistredUser controller;
    private GUIPatientData guiPatientData;
    
    
    public ControllerUser() {
        this.guiUser = new GUIUser();
        this.arrayUser = new ArrayUser();
        this.guiUser.Listen(this);
        this.guiUser.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         switch (e.getActionCommand()) {
            case "LogIn":
                if(arrayUser.userFound(guiUser.getIdentificationCard()) != null){
                    JOptionPane.showInternalMessageDialog(null,"Paciente ");
                    //Condicion para saber si es medico o paciente
                    //Si es medico
                    
                    //Si es paciente
                    //Gui citaMedica
                    
                    guiUser.clean();

                }else{
                   JOptionPane.showInternalMessageDialog(null,"An error occurred in the recorded data","Access error",JOptionPane.ERROR_MESSAGE);
                   guiUser.clean();
                }
                break;
                
            case "SignUp":
                controller = new ControllerRegistredUser(arrayUser);
                
                
                break;
                 
            case "Exit":
                System.exit(0);
                break;
         
         }
    }
    
}
