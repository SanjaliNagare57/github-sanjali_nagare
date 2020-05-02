/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Businesslab2;

import java.util.ArrayList;

/**
 *
 * @author sanjalinagare
 */
public class VitalSignHistory {
    private ArrayList <VitalSign>vitalSignHistory;//VitalSign is class name and vitalSignHistoy is our varible

    public VitalSignHistory() //Constuctor
    {
        vitalSignHistory = new ArrayList<VitalSign>();//VitalDign is a class name here.
    
    }
    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    public VitalSign addVitals()
    {
    VitalSign vs= new VitalSign();
    vitalSignHistory.add(vs) ;
    return vs;
    
    }

    public void deletVitals(VitalSign vs) {

        vitalSignHistory.remove(vs);
    }
    
}
