/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Expert implements Serializable{
  private static final long serialVersionUID = 1;  
    private String name;
    private AreaOfExpertiseList expertiseAreas;

    /**
     *
     * @param name
     * @param expertiseArea
     */
    public Expert(String name, AreaOfExpertiseList expertiseArea) {
            this.name = name;
            this.expertiseAreas = expertiseArea;
        }

    /**
     *
     * @return
     */
    public AreaOfExpertiseList getExpertiseAreas() {
        return expertiseAreas;
    }

    /**
     *
     * @param expertiseAreas
     */
    public void setExpertiseAreas(AreaOfExpertiseList expertiseAreas) {
        this.expertiseAreas = expertiseAreas;
    }
    

}
