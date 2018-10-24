package javaprojetgesecole.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;




import java.sql.Date;



public class Fen_ajout_Eleve extends JFrame implements ActionListener {
	
	JTextField txtnom,txtpren,txtdat,txtnum,txttel,txtclass;
	JButton bten,supp,modif,rech,fer,tel,clas;
	Statement st;
	private javax.swing.JFormattedTextField daten =new javax.swing.JFormattedTextField(DateFormat.getDateInstance());
	
	/*connection k=new connection();*/
	
	public Fen_ajout_Eleve()
	{ 
	  this.setTitle("Enregistrement");
	  this.setSize(400,350);
	  this.setLocation(500, 200);
	  	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
      
     JPanel p=new JPanel();  p.setBackground(Color.white);
     p.setLayout(null);
     JLabel lbnum=new JLabel("Num identifiant");
     JLabel lbnom=new JLabel("Nom d'eleve");
     JLabel lbpren=new JLabel("Prenom d'eleve");
     JLabel lbdat=new JLabel("Date de Naissance"); lbdat.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\calendar.png"));
     JLabel lbtel=new JLabel("numero tel");
     JLabel lbclass=new JLabel("Nom classe");
     JLabel lbT=new JLabel("AJout D'un Nouveau Eleve");
     
     
     
     txtnum=new JTextField();
     txtnom=new JTextField();
     txtpren=new JTextField();
     txtdat=new JTextField("zzzz-xx-yy");
     txttel=new JTextField();
     txtclass=new JTextField();
     
     
     bten=new JButton("Sauver");
     tel=new JButton("Terminer");
     
     bten.addActionListener(this);
     tel.addActionListener(this);
     clas.addActionListener(this);
     
     
     //boutton
     Font fe=new Font("gramound",0,15);
     
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
     lbT.setBounds(15,0,340,20); p.add(lbT);
     
     
      lbnum.setBounds(30,40,110,25);  p.add(lbnum);  lbnum.setFont(fe);
     txtnum.setBounds(200,40,120,25);p.add(txtnum);
     
     lbnom.setBounds(30,70,120,25);  p.add(lbnom);  lbnom.setFont(fe);
      txtnom.setBounds(200,70,120,25);p.add(txtnom);
     
     lbpren.setBounds(30,100,120,25);  p.add(lbpren);  lbpren.setFont(fe);
     txtpren.setBounds(200,100,120,25);p.add(txtpren);
     
     lbdat.setBounds(30,130,120,25);  p.add(lbdat);  lbdat.setFont(fe);
     txtdat.setBounds(200,130,120,25);  p.add(txtdat);
     
     lbtel.setBounds(30,160,120,25); p.add(lbtel);  lbtel.setFont(fe);
     txttel.setBounds(200,160,120,25);p.add(txttel);
     
     lbclass.setBounds(30,190,120,25); p.add(lbclass);  lbclass.setFont(fe);
     txtclass.setBounds(200,190,120,25);p.add(txtclass);
     
     
     
    // txtrec.setBounds(180,150,110,20);p.add(txtrec);
 
     
     
     //ajout buttons
     
    bten.setBounds(50,230,130,27); p.add(bten); bten.setFont(fe); bten.setBackground(Color.CYAN);  bten.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\save.png"));
    tel.setBounds(200,230,130,27); p.add(tel);  tel.setFont(fe);  tel.setBackground(Color.CYAN);   tel.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\fer.gif"));
    		
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
		
		
		
		//fermeture fenetre Enregistrement
  //JOptionPane.showConfirmDialog(this, "Etes vous sure d'avoir Terminier","Incident Majeur",JOptionPane.YES_NO_OPTION);
			//dispose();
		
		
			if(e.getSource()==tel)
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
	

/*public static void main(String[] args) {
	
	Fen_ajout_Eleve f=new Fen_ajout_El�ve();
	f.setVisible(true);
	
	

}*/
	
}
