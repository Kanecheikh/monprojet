package javaprojetgesecole.Acceille;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;



import javaprojetgesecole.frame.Fen_ajout_classe;
import javaprojetgesecole.frame.Jlabel;
import javaprojetgesecole.Affichage.listEleve;
import javaprojetgesecole.frame.Fen_ajout_Eleve;
import javaprojetgesecole.frame.fen_users;




public class Menu_accueil extends JFrame implements ActionListener{
	
	private JMenuItem lisEl,lisclass;
	private JMenuBar menu;
	private JMenu Fich,aff,app,admin,hlp;
	private JMenuItem nv,st,cont;
	private JPanel img,img2,dpimg;
	private JToolBar menubar ;
	private JButton req;

      private JButton b = new JButton("   Liste des eleves          ");
	  private JButton b2 = new  JButton("  Liste des classe");
	 
	  
	  private JTabbedPane onglet=new JTabbedPane(); 
	  
	private JPanel re=new JPanel();
	private JPanel re2=new JPanel();
	
	
	
	
	
	//private JButton enr1;
	//javax.swing.JLabel img2;
	
	public <split, split1> Menu_accueil()
	{ 
		JSplitPane split;
		JSplitPane split1;
		
		 Container c=getContentPane();
		 JLabel ne =  new JLabel();
		 ne.setIcon(new ImageIcon(""));
		 
		 
		 // JLabel nea =  new JLabel();
		  ne.setPreferredSize(new java.awt.Dimension(800,400));
		
		   
		
		 
		
		this.setTitle("Acceuil");
		  this.setSize(900,700);
	      this.setLocation(250,50);
	     
	    b.addActionListener(this);   b.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\list.png"));
	    b2.addActionListener(this); b2.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\list.png"));
	
	      JLabel txt=new JLabel("BIENVENUE");
	      
	    JMenuBar menu=new JMenuBar();
	    setJMenuBar(menu);
	    //menus
	   JMenu Fich=new JMenu("archive");
	    menu.add(Fich);
	    
	    
	    Fich.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\fichier1.png"));
	   Fich.setMnemonic('a');
	   img=new JPanel(); img.add(ne); //img.add(nea); 
	  
	    
	    
	   // b.setBounds(10, 22,100, 20);
	    
	    JLabel fondimg=new JLabel();
	    fondimg.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\Originals\\ecole.jpg"));
	    //
	    fondimg.setSize(900, 800);
	 
	    //ONGLET
	   // re.setSize(10,900);
	    re.setBounds(5, 20,218, 800);
	    onglet.setSize(400, 830);
		 onglet.setBorder(null);
		onglet.setBackground(Color.white);
		 re.setLayout(new BorderLayout());
		 
	  
		  
		 
	    img.setBounds(210,100,1400,625);
	    img.setBackground(Color.white);
	    
	     img.setLayout(new BorderLayout());
	     
	   // img.add(new JLabel("hello"));
	      
	      
	    JButton im2=new JButton("BIENVENUE");
	   // img.add(dpimg);
	    img2=new JPanel(); 
	    img2.setLayout(null);
	    im2.setBounds(240,30, 200, 40);
	    im2.setIcon(new ImageIcon());
	    img2.setBounds(210,2,1400,90); 
	    img2.setBackground(Color.WHITE);	
	    img2.add(im2);
	   
	    
	    //MENU BARE
	    
	    menubar=new JToolBar();
	    menubar.setBounds(5, 2, 1400,19);
	    //button requ�te
	    
	    
	    //sous menu(-
	    
	   JMenu nv=new JMenu("Nouveau");
	    Fich.add(nv);
	    nv.setMnemonic('N');
	    
	   //JLabel image = new JLabel(new ImageIcon("images/ulg.jpg"));
	    
	    JMenuItem enr=new JMenuItem("Nouveau Eleve");  enr.setIcon(new ImageIcon());
	    nv.add(enr);
	   enr.setMnemonic('e');
	   
	    enr.setBounds(0,0,0,20);
	    
	  
	    JMenuItem prf=new JMenuItem("Nouvelle classe"); prf.setMnemonic('p');
	    prf.setIcon(new ImageIcon());
	     nv.add(prf);
	    
	  
	    
	     //image de font
	     
	  //  cr.addActionListener(this);
	     
	  
	    
	    JPanel i=new JPanel(); 
	    i.setLayout(null);
	    
            //enr1=new JButton("Enregistrement");
            // enr1.setBounds(300,150,100,30);
            JMenuItem qt = new JMenuItem("Quitter");
	 qt.setMnemonic('q');
	    Fich.add(qt);
	   qt.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\quit.png"));
	  qt.addActionListener(new ActionListener()
	  {
            @Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
	}
		  
	  });
	    
	    
	   JMenu aff=new JMenu("Consulter");
	    menu.add(aff); aff.setMnemonic('c');
	    aff.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\consulter.png"));
	    
	    
	    JMenu admin=new JMenu("admin");
	    admin.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\admin.png"));
	    menu.add(admin); admin.setMnemonic('d');
	    
	    JMenu NU=new JMenu("Nouveau");
	    admin.add(NU);
	    NU.setMnemonic('n');
	    
	    JMenuItem us=new JMenuItem("User");
	    NU.add(us); us.setMnemonic('u');
	    us.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\users3.png"));
	    
	    JMenu lUS=new JMenu("les Users");
	    admin.add(lUS);
	   
	    JMenuItem luse=new JMenuItem("liste des Utilisateurs"); luse.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\list.png"));
	    lUS.add(luse);
	     
	    
	    JMenu app=new JMenu("apropos"); app.addActionListener(this);
	    app.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\.jpg"));
		 menu.add(app); app.setMnemonic('p');
		 
		 JMenuItem app1=new JMenuItem("App"); app1.addActionListener(this);
		 app.add(app1);  app1.setMnemonic('a');
		 
		 
	    JMenu hlp=new JMenu("aide"); hlp.setMnemonic('h');
	   hlp.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\help1.png"));
	    menu.add(hlp);
  JMenu st=new JMenu ("Structure de table");
	    aff.add(st);
	    
	    lisEl=new JMenuItem("Liste Eleve"); lisEl.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\list.png"));
		 st.add(lisEl);
		 
	    
	  
		 
		lisclass=new JMenuItem("Liste des classe");  lisclass.setIcon(new ImageIcon("C:\\Users\\cheikh\\Desktop\\Edacy Work\\gestion-ecole\\src\\images\\list.png"));
		st.add(lisclass);
		
				
	   /*JMenu cont=new JMenu("Contenu des tables");
	    aff.add(cont);*/
	    
	    i.add(re); 
	    img.add(fondimg); 
	    i.add(menubar);
	    i.add(img); i.add(img2); 
	    
	    add(i); 
	    
	    //ajouts des fenetres et ses evenements
	   app1.addActionListener(new ActionListener()
	   {

		@Override
		public void actionPerformed(ActionEvent a) {
		
			Jlabel lb=new Jlabel();
			lb.setVisible(true);
			
		}}
	   );
	    
	    lisEl.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				listEleve el=new listEleve();
				el.setVisible(true);
				el.setResizable(false);
			}
	    	
	    	
	    	
	    });
	    
	    us.addActionListener(new ActionListener()
	    {@Override
		  public void actionPerformed(ActionEvent arg0) {
				fen_users user=new fen_users();
				user.setVisible(true);
				user.setResizable(true);
				
			} });
	    
	   lisclass.addActionListener(new ActionListener()
	   {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

		/*@Override
		public void actionPerformed(ActionEvent arg0) {
			listclasse pr=new listclasse();
			pr.setVisible(true);}*/
           }		
		);
	   
	   
	  
	   
	   
	   
	   
	   
	   
	   
	    prf.addActionListener(new ActionListener()
	    {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Fen_ajout_classe pr=new Fen_ajout_classe();
				pr.setVisible(true);
				pr.setResizable(false);
				
			}
	    	
	    	
	    });
	    
	 
   
	   
	   enr.addActionListener(new ActionListener()
	   {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Fen_ajout_Eleve fe=new Fen_ajout_Eleve();
			fe.setVisible(true);
			fe.setResizable(false);
			
		}
		   
		   
	   });}
	
	
//affichage onglets et requ�tes

@Override
public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource()==b)
	{
		listEleve el=new listEleve();
		el.setVisible(true);
	}

	
	if(e.getSource()==b2)
	{ 
		/*listclasse pr=new listclasse();
		pr.setVisible(true);*/
		
	}
}

	
	
	

public static void main(String[] args)
 {
	
		Menu_accueil x=new Menu_accueil();
		x.setVisible(true);
		
		x.setResizable(false);
		

	}

	
}


