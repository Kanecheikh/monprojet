package javaprojetgesecole.GESTION;

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


public class ges_eleve extends JFrame implements ActionListener {
	
	JTextField txtnom,txtpren,txtdat,txtnum,txttel,txtpd,txtrec;
	JButton btModif,supp,rech,fer,tel;
	Statement st;
	private javax.swing.JFormattedTextField daten =new javax.swing.JFormattedTextField(DateFormat.getDateInstance());
	
	/*connection k=new connection();*/
	
	public ges_eleve()
	{ 
	  this.setTitle("");
	  this.setSize(400,350);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
     JPanel p=new JPanel();  p.setBackground(Color.white);
     p.setLayout(null);
     JLabel lbnum=new JLabel("Numero d'eleve");
     JLabel lbnom=new JLabel("Nom d'eleve");
     JLabel lbpren=new JLabel("Prenom d'eleve");
     JLabel lbdat=new JLabel("Date de Naissance"); lbdat.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\calendar.png"));
     JLabel lbtel=new JLabel("classe");
     JLabel lbT=new JLabel("AJout D'un Nouveau Eleve");
     
     
     
     txtnum=new JTextField();
     txtnom=new JTextField();
     txtpren=new JTextField();
     txtdat=new JTextField("ZZZZ-YY-XX");
     txttel=new JTextField();
     txtrec=new JTextField(""); txtrec.setBackground(Color.WHITE);
     btModif=new JButton("Modifiez");
     tel=new JButton("Terminer"); tel.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\fer.gif"));
     
     btModif.addActionListener(this);
     tel.addActionListener(this);      
     
     
     //boutton
     Font fe=new Font("gramound",0,15);
     
     supp=new JButton("Supprimer");
     supp.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\Originals\\supp.png"));
    // modif=new JButton("Modifier");
     
     rech=new JButton("Rechercher");
     rech.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\reche.png"));
     
     fer=new JButton("Terminez");
     
     
     
     supp.addActionListener(this);
    // modif.addActionListener(this);
     rech.addActionListener(this);
     
    // fer.addActionListener(this);
     
     
     
     //ajouts dans le panel
    // lbT.setBounds(15,0,340,20); p.add(lbT);
     
     
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
     
    //ajout buttons
     
    btModif.setBounds(50,230,130,27); p.add(btModif); btModif.setFont(fe); btModif.setBackground(Color.CYAN); 
    tel.setBounds(50,270,120,27); p.add(tel);  tel.setFont(fe);  tel.setBackground(Color.CYAN);
      txtrec.setBounds(210, 10, 40, 25); p.add(txtrec);	
     rech.setBounds(50,5,130,25);  p.add(rech);
    supp.setBounds(200,230,130,25); p.add(supp); supp.setBackground(Color.cyan);
    supp.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\supp.png"));
    btModif.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\modif.png"));
    
     //modif.setBounds(180,110,110,20); p.add(modif);
     
     //fer.setBounds(100,190,110,20); p.add(fer);*/
     
     //CONTENU DU PANEL
     
     add(p); 
       
		
		
	}
	
	
	

  
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//enregistrement
		
		/*if(e.getSource()==bten)
		{
			String nu,n,p,a1;
			nu=txtnum.getText(); 
			n=txtnom.getText();
			p=txtpren.getText();
			String d=txtdat.getText();
			float pd = Float.valueOf(txtpd.getText());

			a1=txttel.getText();
			
			String query="Insert into eleve values('"+nu+"','"+n+"','"+p+"','"+d+"','"+pd+"','"+a1+"')";
			
			
		try {
			  
			 st=k.etablirconnection().createStatement();
			 
 if(JOptionPane.showConfirmDialog(this,"Voulez Vous Enregistrez","Attention",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
 
			 
			 if(txtnum.getText().length()!=0)
				 
			 { 
				 st.executeUpdate(query);
			   
			 JOptionPane.showMessageDialog(this,"Enregistrez avec succ�s");
			 
			 txtnum.setText("");
			   txtnom.setText("");
			   txtpren.setText("");
			   txtdat.setText("");
			 
				
			 }  else {JOptionPane.showMessageDialog (null,"veuillez remplire les champs !");}
			 
			
			 } catch (SQLException e1) {
		
			//e1.printStackTrace();
				JOptionPane.showMessageDialog(this,"errure d'ajout");
		}
	
		
		}
		*/
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
	
 //suppression
			
		/*if(e.getSource()==supp)
		{
			String n;
			n=txtnum.getText(); 
			
		String query="DELETE FROM eleve WHERE num_elv='"+n+"'";
		
		try {
			 st=k.etablirconnection().createStatement();
			 
			 if(JOptionPane.showConfirmDialog(this, "Voulez vraiment supprimez ",null, JOptionPane.OK_OPTION)==JOptionPane.OK_OPTION)
			 {
			    st.executeUpdate(query);
			    JOptionPane.showMessageDialog(this,"Suppression effectuez avec succ�s");
			 } 
			 else if (JOptionPane.OK_CANCEL_OPTION==JOptionPane.NO_OPTION){ 
				}
				
			 }
			   
		
	     catch (SQLException e2) {
			   JOptionPane.showMessageDialog(null, "Erreur de suppresion verifiez le lien ou n'existe pas");
		
			
			}
			
       	}
		
		
		//Modification
		if(e.getSource()==btModif)
		{
			String n,p,a,pr;
			
			n=txtnum.getText(); 
			p=txtnom.getText();
			pr=txtpren.getText();
			String d=txtdat.getText();
			float pd = Float.valueOf(txtpd.getText());
			String tel=txttel.getText();
			
			String query="UPDATE  eleve  SET nom_elv='"+p+"', pren='"+pr+"',datNais='"+d+"',num_tel="+tel+" where  num_elv="+n+"";
			
			
			try {
				 st=k.etablirconnection().createStatement();
				 
				 if(JOptionPane.showConfirmDialog(this, "Voulez vraiment Modifiez ? ",null, JOptionPane.OK_OPTION)==JOptionPane.OK_OPTION)
				 {
				    st.executeUpdate(query);
				    JOptionPane.showMessageDialog(this,"Modification effectuez avec succ�s");
				 } 
				 else if (JOptionPane.OK_CANCEL_OPTION==JOptionPane.NO_OPTION){ 
					}
			}
			 catch (SQLException e2) {
				   JOptionPane.showMessageDialog(null, "Erreur de suppresion verifiez le lien ou n'existe pas");
			
				
				}
					}
				 
				   
		
		//recherche
		if(e.getSource()==rech)
		{ String n;
			n=txtrec.getText(); 
			
   String query="SELECT * FROM eleve  WHERE num_elv='"+n+"'";
			
		try {
			st=	k.etablirconnection().createStatement();
			
			ResultSet rst =st.executeQuery(query);
			
			if(rst.next())
			{   txtnum.setText(rst.getString("num_elv"));
				txtnom.setText(rst.getString("nom_elv"));
				txtpren.setText(rst.getString("pren"));
				txtdat.setText(rst.getString("datNais"));
				txttel.setText(String.valueOf(rst.getInt("telee")));
				
			} 
			else 
				JOptionPane.showMessageDialog(this,"INTROUVABLE","Erreur",JOptionPane.ERROR_MESSAGE);
		    } catch (SQLException e1)
		
		{
	        
			}*/
	
		
		

		}	
		
	}
	
	
	
	

/*public static void main(String[] args) {
	
	ges_eleve ge=new ges_eleve();
	ge.setVisible(true);
	*/
	
