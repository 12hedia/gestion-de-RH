/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementation;

/**
 *
 * @author Hedia
 */
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conges;
import model.employee;

/**
 *
 * @author khali
 */
public abstract class EmployeeImplement implements EmployeeInterface {
Connect cx = new Connect();
    @Override
    public boolean authentification(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
}

    @Override
    public void ajoutEmployee(employee employee) {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
try {
String sql = "INSERT INTO employee (nom, email, mdp, adresse, grade, telephone, salaire) VALUES ( ?, ? ,  ?, ? , ?, ?, ?)";
System.out.print(cx.conn);
PreparedStatement statement = cx.conn.prepareStatement(sql);
if(employee.getNom()!="" && employee.getEmail()!="" &&  employee.getMdp()!="" && employee.getAdresse()!="" && employee.getGrade() !="" && employee.getTeleph()!="" ){
statement.setString(1, employee.getNom());
statement.setString(2, employee.getEmail());
statement.setString(3, employee.getMdp());
statement.setString(4, employee.getGrade());
statement.setString(5, employee.getAdresse());
statement.setString(6, employee.getTeleph());
statement.setDouble(7, employee.getSalaire());

int rowsInserted = statement.executeUpdate();
JOptionPane.showMessageDialog(null , "ajouté avec success");
}else
{
JOptionPane.showMessageDialog(null , "les champs sont obligatoire");
}
} catch (SQLException ex) {
System.out.println("exception"+ex);
}        

}

    @Override
    public void SupprimerEmployee(int id) {
      // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         try {
String sql = "DELETE FROM `employee` WHERE `id`=?";
System.out.print(cx.conn);
PreparedStatement statement = cx.conn.prepareStatement(sql);

statement.setInt(1,id);
statement.executeUpdate();
JOptionPane.showMessageDialog(null , "suppression avec success");
} catch (SQLException ex) {
System.out.println("exception"+ex);
}       
    } 


    @Override
    public void updateSalaire(int id, double salaire) {
       try {
String sql = "UPDATE `employee` SET `salaire`= ? WHERE `id`= ? ";
System.out.print(cx.conn);
PreparedStatement statement = cx.conn.prepareStatement(sql);
statement.setDouble(1,salaire);
statement.setInt(2,id);
statement.executeUpdate();
JOptionPane.showMessageDialog(null , "modifié avec success");
} catch (SQLException ex) {
System.out.println("exception"+ex);
}       
    }
    
}