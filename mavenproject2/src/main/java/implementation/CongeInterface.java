/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implementation;

/**
 *
 * @author Hedia
 */
import model.Conges;

/**
 *
 * @author khali
 */
public interface CongeInterface {
    public void ajouterConge(Conges conge);
    public void updateConge(Conges conge);
    public void deleteConge(int id);
}