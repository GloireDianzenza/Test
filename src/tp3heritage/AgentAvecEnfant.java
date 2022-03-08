/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3heritage;

import java.util.Date;

/**
 *
 * @author Jacques
 */
public class AgentAvecEnfant extends Agent
{
    private int nbEnfant;
    
    public AgentAvecEnfant(int unNum, String unNom, boolean  estMarie,int unSalaire, int unNb)
    {
        super(unNum, unNom, estMarie,unSalaire);
        nbEnfant = unNb;
    }

    @Override
    public String afficherInfo()
    {
        return super.afficherInfo() + "\nNb Enfants = " + nbEnfant;
        //return (numAgent + " - " + nomAgent + " - " + marie + " - " + salaire + " - " + nbEnfant);
    }

    @Override
    public double calculerImpot()
    {
        double nbPart;
        double revImp;
        double coeffFam;
        double impot;

        if (marie)
        {
            nbPart = (nbEnfant/2)+ 2;
        }
        else
        {
            nbPart = (nbEnfant/2) + 1;
        }
        revImp = salaire * 0.72;
        coeffFam = revImp / nbPart;
        impot = coeffFam - 0.15 * revImp;
        return impot;
    }
}
