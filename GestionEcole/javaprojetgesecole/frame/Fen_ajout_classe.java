package javaprojetgesecole.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Fen_ajout_classe extends JFrame implements ActionListener {
	
	JTextField txtnom,txtnum,txtdat,txttel;
	JButton bten,supp,modif,rech,fer,ann;
	Statement st;
	
	
	/*connection k=new connection();*/
	
	public Fen_ajout_classe()
	{ 
	  this.setTitle("Enregistrement_classe");
	  this.setSize(400,300);
	  this.setLocation(500, 200);
	  	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
      
     JPanel p=new JPanel();  p.setBackground(Color.white);
     p.setLayout(null);
     JLabel lbnum=new JLabel("Numero de la classe :");
     JLabel lbnom=new JLabel("Nom de la classe :");
     
     JLabel lbT=new JLabel("INFORMATION classe :");
     
     
     txtnum=new JTextField();
     txtnom=new JTextField();
     txtdat=new JTextField("ZZZZ-YY-XX");
     txttel=new JTextField("");
    
     
     
     bten=new JButton("Sauver");
     ann=new JButton("Terminer");
     
     bten.addActionListener(this);
     ann.addActionListener(this);
     
     
     //boutton
     Font fe=new Font("Serif",0,15);
     
     /*supp=new JButton("Supprimer");
     
     modif=new JButton("Modifier");
     
     rech=new JButton("Rechercher");
     
     fer=new JButton("Terminez");
     
     
     
     supp.addActionListener(this);
     modif.addActionListener(this);
     rech.addActionListener(this);
     */
    // fer.addActionListener(this);
     
     
     
     //ajouts dans le panel
    lbT.setBounds(130,1,170,30); p.add(lbT);
    lbT.setForeground(Color.black); lbT.setPreferredSize(new Dimension( 400 , 200));
     
      lbnum.setBounds(30,40,170,25);  p.add(lbnum);  lbnum.setFont(fe);
     txtnum.setBounds(200,40,120,25);p.add(txtnum);
     
     lbnom.setBounds(30,70,120,25);  p.add(lbnom);  lbnom.setFont(fe);
      txtnom.setBounds(200,70,120,25);p.add(txtnom);
     
   
      
    
     
     
     
     
     
    // txtrec.setBounds(180,150,110,20);p.add(txtrec);
 
     
     
     //ajout buttons
     
    bten.setBounds(50,180,120,27); p.add(bten); bten.setFont(fe); bten.setBackground(Color.CYAN);   bten.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\save.png"));
    ann.setBounds(200,180,120,27); p.add(ann);  ann.setFont(fe);  ann.setBackground(Color.CYAN);
    		
     /*supp.setBounds(180,80,110,20); p.add(supp);
     modif.setBounds(180,110,110,20); p.add(modif);
     rech.setBounds(30,150,110,20);  p.add(rech);*/
     //fer.setBounds(100,190,110,20); p.add(fer);*/
     
     //CONTENU DU PANEL
     
     add(p); 
       
		
		
	}
	
	
	

  
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//enregistrement
		
		if(e.getSource()==bten)
		{
			String nu,n,p,t;
			nu=txtnum.getText(); 
			n=txtnom.getText();
			p=txtdat.getText();
			t=txttel.getText();
			
			
			String query="Insert into classes values('"+nu+"','"+n+"','"+p+"','"+t+"')";
			
			
			
			
		try {
			  
			/* st=k.etablirconnection().createStatement();
			 
 if(JOptionPane.showConfirmDialog(this,"Voulez Vous Enregistrez","Attention",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);*/
 
			 
			 if(txtnum.getText().length()!=0)
				 
			 { 
				 st.executeUpdate(query);
			   
			 JOptionPane.showMessageDialog(this,"Enregistrez avec succes");
			 
			   txtnum.setText("");
			   txtnom.setText("");
			   txtdat.setText("");
			   txttel.setText("");
			 
			 }  else {JOptionPane.showMessageDialog (null,"veuillez remplire les champs !");}
			 
			
			 } catch (SQLException e1) {
		
			//e1.printStackTrace();
				JOptionPane.showMessageDialog(this,"errure d'ajout");
		}
	
		
		}
		
		//fermeture fenetre Enregistrement

		if(e.getSource()==ann)
		{
            //JOptionPane.showConfirmDialog(this, "Etes vous sure d'avoir Terminier","Incident Majeur",JOptionPane.YES_NO_OPTION);
			//dispose();
		
		
		   if(JOptionPane.showConfirmDialog(this, "Etes vous sure d'avoir Terminier","Incident Majeur",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
		   {
			   dispose();
		   }
		}
	}
		  
		/*else 
		   {
			   
		   }
			   
		
		
	              // suppression
		if(e.getSource()==supp)
		{
			String n;
			n=txtnom.getText(); 
			
		String query="DELETE FROM db WHERE nom='"+n+"'";
		
		
			
		try {
			 st=k.etablirconnection().createStatement();
			 
			 if(JOptionPane.showConfirmDialog(this,"Voulez Vous vraiment Supprimez","Attention",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION & (n==txtnom.getText()))
				 
			 {   st.executeUpdate(query);
			    JOptionPane.showMessageDialog(this,"Suppression effectuez avec succ�s");
				
			}  
			 
		
				 
		}
			 
	  catch (SQLException e2) {
			   JOptionPane.showMessageDialog(null, "Erreur de suppresion");
		
			
			}
			
       	
	
		}
		
		
		//Modification
		if(e.getSource()==modif)
		{
			String n,p,a;
			n=txtnom.getText(); 
			p=txtpren.getText();
			a=txtage.getText();
			
			String query="UPDATE  db  SET  prenom='"+p+"', age="+a+"  where  nom='"+n+"'";
			
			
		try {
			st=	k.etablirconnection().createStatement();
			
			st.executeUpdate(query);
			JOptionPane.showMessageDialog(this,"Modifier avec succ�s");
			
			System.out.println("Enregistrement Succeful");
			
			
			
			} catch (SQLException e1) {
		
			 JOptionPane.showMessageDialog(this,"Vous Devez remplir les champs");
				
		}
	
		
		}
		
		//recherche
		if(e.getSource()==rech)
		{ String n;
			n=txtrec.getText(); 
			
   String query="SELECT * FROM db  WHERE nom='"+n+"'";
			
			
		try {
			st=	k.etablirconnection().createStatement();
			
			ResultSet rst =st.executeQuery(query);
			
			if(rst.next())
			{
				txtnom.setText(rst.getString("nom"));
				txtpren.setText(rst.getString("prenom"));
				txtage.setText(String.valueOf(rst.getInt("age")));
				
			} 
			else 
				JOptionPane.showMessageDialog(this,"INTROUVABLE","Erreur",JOptionPane.ERROR_MESSAGE);
		    } catch (SQLException e1)
		
		{
	        
			}
	
		
		

		}	
		
	}
	
	
	*/
	

/**
 * @param args
 */
public static void main(String[] args) {
	
	Fen_ajout_classe f=new Fen_ajout_classe();
	f.setVisible(true);
	
	

}
	
}
