/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Hedia
 */
public class employee {
    
  private int id;
    private String nom;
    private String email;
    private String mdp,grade,adresse, teleph;
    private double salaire;

    public void setTeleph(String teleph) {
        this.teleph = teleph;
    }

    public String getTeleph() {
        return teleph;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", nom=" + nom + ", email=" + email + ", mdp=" + mdp + ", grade=" + grade + ", adresse=" + adresse + ", salaire=" + salaire + '}';
    }

    public employee() {
    }

    public employee(int id, String nom, String email, String mdp, String grade, String adresse, double salaire) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.mdp = mdp;
        this.grade = grade;
        this.adresse = adresse;
        this.salaire = salaire;
    }

    public employee(String nom, String email, String mdp, String grade, String adresse, String teleph ,double salaire) {
        this.nom = nom;
        this.email = email;
        this.mdp = mdp;
        this.grade = grade;
        this.adresse = adresse;
        this.teleph=teleph;
        this.salaire = salaire;
    }
    



}
