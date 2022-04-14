/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementation;

/**
 *
 * @author Hedia
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conges;

/**
 *
 * @author khali
 */
public abstract  class CongeImplement implements CongeInterface {
Connect cx = new Connect();

    public void ajouterConge(Conges conge) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
try {
String sql = "INSERT INTO conge (etat, debut, duree, type, demandeur) VALUES ( ?, ? , ?, ? , ?);";
System.out.print(cx.conn);
PreparedStatement statement = cx.conn.prepareStatement(sql);
if(conge.getEtat()!="" && conge.getDebut()!="" &&  conge.getType()!="" ){
statement.setString(1, conge.getEtat() );
statement.setString(2, conge.getDebut());
statement.setInt(3, conge.getDuree());
statement.setString(4, conge.getType() );
statement.setInt(5, conge.getDemandeur() );
int rowsInserted = statement.executeUpdate();
JOptionPane.showMessageDialog(null , "ajouté avec success");
}else
{
JOptionPane.showMessageDialog(null , "les champs sont obligatoire");
}
} catch (SQLException ex) {
Logger.getLogger(Conges.class.getName()).log(Level.SEVERE, null, ex);
}    

}

  
    public void updateConge(Conges conge) {
       try {
String sql = "UPDATE conge SET `etat`='"+conge.getEtat()+"',`debut`='"+conge.getDebut()+"',`duree`='"+conge.getDuree()+"',`type`='"+conge.getType()+"',`demandeur`='"+conge.getDemandeur()+"' where `id`= '"+conge.getId()+"' ";
System.out.print(cx.conn);
PreparedStatement statement = cx.conn.prepareStatement(sql);
statement.executeUpdate();
JOptionPane.showMessageDialog(null , "modifié avec success");
} catch (SQLException ex) {
System.out.println("exception"+ex);
}  
    }

    @Override
    public void deleteConge(int id) {
  try {
String sql = "DELETE FROM `conge` WHERE `id`=?";
System.out.print(cx.conn);
PreparedStatement statement = cx.conn.prepareStatement(sql);

statement.setInt(1,id);
statement.executeUpdate();
JOptionPane.showMessageDialog(null , "suppression avec success");
} catch (SQLException ex) {
System.out.println("exception"+ex);
}       

}       


    
    
}