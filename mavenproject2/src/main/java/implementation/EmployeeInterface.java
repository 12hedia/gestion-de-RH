/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implementation;
import model.employee;
/**
 *
 * @author Hedia
 */
public interface EmployeeInterface {
    public boolean authentification(String email,String password);
    public void ajoutEmployee(employee employee);
    public void SupprimerEmployee(int id);
    public void updateSalaire(int id,double salaire);
    
}