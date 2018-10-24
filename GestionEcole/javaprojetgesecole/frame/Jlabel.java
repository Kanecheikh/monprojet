package javaprojetgesecole.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Jlabel extends JFrame {
  
 
private JPanel p;



	
	public Jlabel()
	{    this.setResizable(false);
		 this.setTitle("A Propos");
		 this.setSize(600,300);
		 JPanel p=new JPanel();
		  
		  p.setLayout(null);
	
		 
		  Font fer = new Font("BOLD",0, 16);
		  
		  this.setLocation(500, 200);
		  	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
         
      JLabel ch1=new JLabel("Projet Edacy"); ch1.setBounds(40, 10, 180,  20); p.add(ch1); ch1.setForeground(Color.black);
	  JLabel ch2=new JLabel("M. Demba Sarr, le proviseur a fait appel à un informaticien ");      ch2.setFont(fer); ch2.setBounds(40, 40, 500,  20);   p.add(ch2);
	  JLabel ch3=new JLabel("pour mettre en place une application de gestion de son ecole.");  ch3.setFont(fer);    ch3.setBounds(40, 60, 500,  20);   p.add(ch3);
	  JLabel ch4=new JLabel("Travail a faire: il vous est demandé de réaliser ");   ch4.setFont(fer);   ch4.setBounds(40, 80, 500,  20);   p.add(ch4);
	  JLabel ch=new JLabel("une application pour aider M. Demba Sarr dans la gestion de son école.");   ch.setFont(fer);   ch.setBounds(40, 100, 500,  20);   p.add(ch);
          JLabel ch5=new JLabel("");                                   ch5.setBounds(40, 120, 200, 20);   p.add(ch5);
	  JLabel ch6=new JLabel("concepteur du projet:"
	  		+"               ");                      p.add(ch6); ch6.setBounds(40,200,200,20);
	  		
	   JLabel ch7=new JLabel("Cheikh Kane");                 
	   ch7.setBounds(40, 230, 200,20);  ch7.setFont(fer); ch7.setForeground(Color.BLUE); 
	   
	   
	   
	   p.add(ch7);
	   
	  		                                                     
	  		p.add(ch6);
	
	  	                  

	   
	
	  //ajout contenair
	 
	  add(p);
	  
}
	/*
	public static void main(String[] args) {
  Jlabel jb=new Jlabel(); 
  jb.setVisible(true);

  
	}
*/

}






