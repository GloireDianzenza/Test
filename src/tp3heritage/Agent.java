/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3heritage;

/**
 *
 * @author Jacques
 */
public class Agent implements Comparable<Agent>
{
    protected int numAgent;
    protected String nomAgent;
    protected boolean marie;
    protected int salaire;

    
    public Agent(int unNum, String unNom, boolean  estMarie, int unSalaire)
    {
        numAgent = unNum;
        nomAgent = unNom;
        marie = estMarie;
        salaire = unSalaire;
    }
    
    public String afficherInfo()
    {
        return ("Numéro = " + numAgent + " \nNom = " + nomAgent + " \nMarié = " + marie + " \nSalaire = " + salaire);
    }

    public double calculerImpot()
    {
        double nbPart = 1;
        double revImp;
        double coeffFam;
        double impot;

        if(marie)
        {
            nbPart = 2;
        }
//        else
//        {
//            nbPart = 1;
//        }
        revImp = salaire * 0.72;
        coeffFam = revImp / nbPart;
        impot =  coeffFam  - 0.15 * revImp;
        return impot;
    }

    /**
     * @return the numAgent
     */
    public int getNumAgent() {
        return numAgent;
    }

    /**
     * @param numAgent the numAgent to set
     */
    public void setNumAgent(int numAgent) {
        this.numAgent = numAgent;
    }

    /**
     * @return the nomAgent
     */
    public String getNomAgent() {
        return nomAgent;
    }

    /**
     * @param nomAgent the nomAgent to set
     */
    public void setNomAgent(String nomAgent) {
        this.nomAgent = nomAgent;
    }

    /**
     * @return the marie
     */
    public boolean isMarie() {
        return marie;
    }

    /**
     * @param marie the marie to set
     */
    public void setMarie(boolean marie) {
        this.marie = marie;
    }

    /**
     * @return the salaire
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * @param salaire the salaire to set
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public int compareTo(Agent o) {
        return Boolean.compare(o.marie,this.marie);
    }

    
}
