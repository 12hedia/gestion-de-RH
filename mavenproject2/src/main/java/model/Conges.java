/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hedia
 */
public class Conges {
        private int id,duree;
    private int demandeur;
    private String debut,type,etat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getDemandeur() {
        return demandeur;
    }

    public void setDemandeur(int demandeur) {
        this.demandeur = demandeur;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Conges() {
    }

    public Conges(int id, int duree, int demandeur, String debut, String type, String etat) {
        this.id = id;
        this.duree = duree;
        this.demandeur = demandeur;
        this.debut = debut;
        this.type = type;
        this.etat = etat;
    }

    public Conges(int duree, int demandeur, String debut, String type, String etat) {
        this.duree = duree;
        this.demandeur = demandeur;
        this.debut = debut;
        this.type = type;
        this.etat = etat;
    }

    public Conges(int duree, int demandeur, String debut, String type) {
        this.duree = duree;
        this.demandeur = demandeur;
        this.debut = debut;
        this.type = type;
    }
}
