/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Application implements Serializable {

    private static final long serialVersionUID = 1;
    private Enterprise enterprise;
    private ArrayList<Evaluation> evaluationList;
    private String description;
    private int invites;

    /**
     *
     * @param enterprise
     * @param event
     * @param invites
     * @param description
     */
    public Application(Enterprise enterprise, int invites, String description) {
        this.enterprise = enterprise;
        this.description = description;
        this.invites = invites;
        this.evaluationList = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public int getInvites() {
        return invites;
    }

    /**
     *
     * @return
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @param index
     * @return
     */
    public Evaluation getEvaluation(int index) {
        return evaluationList.get(index);
    }

    /**
     *
     * @param evaluation
     */
    public void addEvaluation(Evaluation evaluation) {
        evaluationList.add(evaluation);
    }

    @Override
    public String toString() {
        return enterprise.toString() + "; Invites:" + invites + "; Description:" + description;
    }

}
