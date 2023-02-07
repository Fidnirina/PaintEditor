import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

     //Appel zonne du dessin

@SuppressWarnings({ "serial", "unused" })
       public class PrincipaleBase extends javax.swing.JFrame {
	    private PanneauDeDessin zonedessin = new PanneauDeDessin(this);
	    private final String listOfPolice[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

	// declaration variable
	
    private JButton ChoixColeur;
    private javax.swing.JCheckBox contour;
    private JMenu Edit;
    private JMenu File;
    private JButton tailleCrayon;
    private JButton repete;
    private JButton enregistre;
    private JButton annul;
    private JToolBar pan2;
    private JComboBox<String> comboTaille;
    private JMenuItem quitter;
    private javax.swing.JCheckBox replissage;
    private JMenuBar pan1;
    private JMenuItem nouveau_1;
    private JMenuItem ouvrir_1;
    private JPanel Panne;
    private JMenuItem refaire;
    private JMenuItem sauve;
    private JButton ouvrir;
    private JMenuItem annuler;
    private JButton nouveau;
    private JButton couleur1;
    private JButton pinceau;
    private JButton line;
    private JButton rectangle;
    private JButton cercle;
    private JButton carre;
    private JButton courbe;
    private JButton arc;
    private JButton isocel;
    private JButton triangleRect;
    private JButton losange;
    private JButton hexagone;
    private JButton polygone;
    private JButton orange;
    private JButton rose;
    private JButton Blanche;
    private JButton gri;
    private JButton noir;
    private JButton varie;
    private JMenuItem supprime;
    private JButton gomme;
	private JButton couleur;
	private JComboBox<String> choixFont;
	private AbstractButton boldBut;
	private AbstractButton italicBut;
   
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipaleBase window = new PrincipaleBase();
				   
					window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
    
    public PrincipaleBase() {
    	getContentPane().setBackground(new Color(255, 255, 240));
        listOfPolice[0] = "Default";
        initComponents();
        
        JPanel Pan_3 = new JPanel();
        Pan_3.setBounds(10, 186, 244, 150);
        Pan_3.setBorder(new TitledBorder(null, "Formes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
        Pan_3.setBackground(new Color(230, 230, 250));
        
        //caracteristique de chaque image
        
        //  ligne
        line = new JButton("");
        line.setBounds(10, 21, 49, 36);
        
        line.setIcon(new ImageIcon("images/ligne.png"));
        line.setBackground(new Color(245, 255, 250));
        line.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefType(2);
        	}
        });

        Pan_3.setLayout(null);
        Pan_3.add(line);
        
        //rectangle
        rectangle = new JButton("");
        rectangle.setBounds(69, 21, 49, 36);
        rectangle.setIcon(new ImageIcon("images/Rectangle.png"));
        rectangle.setBackground(new Color(240, 255, 255));
        rectangle.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefType(3);
        	}
        });
        Pan_3.add(rectangle);
        
        //cecle
        cercle = new JButton("");
        cercle.setBounds(128, 21, 49, 36);
        cercle.setIcon(new ImageIcon("images/Circle.png"));      
        cercle.setBackground(new Color(240, 255, 255));
        cercle.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefType(5);
        	}
        });
        Pan_3.add(cercle);
        
        //carre
        carre = new JButton("");
        carre.setBounds(187, 21, 49, 36);
        carre.setIcon(new ImageIcon("images/Rectangle.png"));
        carre.setBackground(new Color(240, 255, 255));
        carre.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefType(4);
        	}
        });
        Pan_3.add(carre);
        
       //courbe
        courbe = new JButton("");
        courbe.setIcon(new ImageIcon("images/courbe.PNG"));
        courbe.setBounds(40,58,49,37);
        courbe.setBackground(new Color(245, 255, 250));
        courbe.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefType(6);
        	}
        });
        Pan_3.add(courbe);
 
        //arc
        arc = new JButton("");
        arc.setBounds(99, 58, 49, 37);
        arc.setIcon(new ImageIcon("images/arc.png"));      
        arc.setBackground(new Color(240, 255, 255));
        arc.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefType(7);
        	}
        });
        Pan_3.add(arc);
        
       //isocel
        
        isocel = new JButton("");
        isocel.setBounds(158, 58, 49, 37);
        isocel.setIcon(new ImageIcon("images/triangle.png"));      
        isocel.setBackground(new Color(240, 255, 255));
        isocel.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefType(10);
        	}
        });
        Pan_3.add(isocel);
        
       //triangle
        triangleRect = new JButton("");
        triangleRect.setBounds(187, 98, 49, 37);
        triangleRect.setIcon(new ImageIcon("images/triangle (2).PNG"));
        triangleRect.setBackground(new Color(240, 255, 255));
        triangleRect.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		  zonedessin.setRefType(13);
        	}
        });
        Pan_3.add(triangleRect);
       
        //losange
        losange = new JButton("");
        losange.setBounds(10, 98, 49, 36);
        losange.setIcon(new ImageIcon("images/losange.png"));
        losange.setBackground(new Color(240, 255, 255));
        losange.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefType(11);
        	}
        });
        Pan_3.add(losange);
       
        //hexagone
        
        hexagone = new JButton("");
        hexagone.setBounds(69, 98, 49, 36);
        hexagone.setIcon(new ImageIcon("images/pentagon.png"));
        hexagone.setBackground(new Color(240, 255, 255));
        hexagone.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefType(12);
        	}
        });
        Pan_3.add(hexagone);
       
        //polygone
        
        polygone = new JButton("");
        polygone.setIcon(new ImageIcon("images/poligone.png"));
        polygone.setBounds(128, 98, 49, 36);
        polygone.setBackground(new Color(240, 255, 255));
        polygone.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefType(12);
        	}
        });
        Pan_3.add(polygone);
           
        //caracteristique de chaque couleur
        
        Panel Pan_4 = new Panel();
        Pan_4.setBounds(22, 478, 253, 173);
        Pan_4.setForeground(new Color(255, 255, 255));
        
        //blanche
        
        JButton blanche = new JButton("");
        blanche.setBounds(10, 11, 48, 41);
        blanche.setBackground(Color.WHITE);
        blanche.setIcon(null);
        blanche.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefCouleurPointer(Color.WHITE);
        		
        	}
        });
        Pan_4.setLayout(null);
        Pan_4.add(blanche);
        
        //rouge
        
        JButton rouge = new JButton("");
        rouge.setBounds(68, 11, 48, 41);
        rouge.setIcon(null);
        rouge.setBackground(Color.RED);
        rouge.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefCouleurPointer(Color.RED);
        	}
        });
        Pan_4.add(rouge);
        
        //bleu
        
        JButton bleu = new JButton("");
        bleu.setBounds(126, 11, 48, 41);
        bleu.setBackground(Color.BLUE);
        bleu.setIcon(null);
        bleu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefCouleurPointer(Color.BLUE);
        	}
        });
        Pan_4.add(bleu);
        
        //verte
        
        JButton verte = new JButton("");
        verte.setBounds(184, 11, 48, 41);
        verte.setBackground(Color.GREEN);
        verte.setIcon(null);
        verte.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefCouleurPointer(Color.GREEN);
        	}
        });
        Pan_4.add(verte);
        
        //jaune
        
        JButton jaune = new JButton("");
        jaune.setBounds(10, 63, 48, 41);
        jaune.setBackground(Color.YELLOW);
        jaune.setIcon(null);
        jaune.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefCouleurPointer(Color.YELLOW);
        	}
        });
        Pan_4.add(jaune);
        
        //violet
        
        JButton violet = new JButton("");
        violet.setBounds(184, 63, 48, 41);
        violet.setBackground(Color.MAGENTA);
        violet.setIcon(null);
        violet.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefCouleurPointer(Color.MAGENTA);
        	}
        });
        Pan_4.add(violet);
        
        //orange
        
        orange = new JButton("");
        orange.setBounds(10, 115, 48, 41);
        orange.setBackground(Color.ORANGE);
        orange.setIcon(null);
        orange.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefCouleurPointer(Color.ORANGE);
        	}
        });
        Pan_4.add(orange);
        
        //rose
        
        rose = new JButton("");
        rose.setBounds(68, 115, 48, 41);
        rose.setBackground(Color.PINK);
        rose.setIcon(null);
        rose.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefCouleurPointer(Color.PINK);
        	}
        });
        Pan_4.add(rose);
        
        //bleu ciel
        
        AbstractButton bleuCiel = new JButton("");
        bleuCiel.setBounds(68, 63, 48, 41);
        bleuCiel.setBackground(Color.CYAN);
        bleuCiel.setIcon(null);
        bleuCiel.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefCouleurPointer(Color.CYAN);
        	}
        });
        Pan_4.add(bleuCiel);
        
        //gri
        
        gri = new JButton("");
        gri.setBounds(126, 63, 48, 41);
        gri.setBackground(Color.GRAY);
        gri.setIcon(null);
        gri.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefCouleurPointer(Color.LIGHT_GRAY);
        	}
        });
        Pan_4.add(gri);
        
        //noir
        
        noir = new JButton("");
        noir.setBounds(126, 115, 48, 41);
        noir.setBackground(Color.BLACK);
        noir.setIcon(null);
        noir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefCouleurPointer(Color.BLACK);
        	}
        });
        Pan_4.add(noir);
        
        //varie
        
        varie = new JButton("");
        varie.setBounds(184, 115, 48, 41);
        varie.setBackground(Color.WHITE);
        varie.setIcon(new ImageIcon("images/col.png"));
        varie.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 Color col = JColorChooser.showDialog(PrincipaleBase.this, "", Color.BLUE);
                 System.out.println(col);
                 zonedessin.setRefCouleurPointer(col);
        	}
        });
        Pan_4.add(varie);
        
       JPanel Pan_1 = new JPanel();
       Pan_1.setBorder(new TitledBorder(null, "Outils ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
        Pan_1.setBounds(22, 63, 216, 93);
        Pan_1.setBackground(new Color(230, 230, 250));
        
        JButton crayon = new JButton("");
        crayon.setBounds(19, 19, 49, 44);
        crayon.setBackground(new Color(245, 245, 245));
        crayon.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 zonedessin.setRefType(1);
        	}
        });
        crayon.setIcon(new ImageIcon("images/crayon1.PNG"));
        
        
   getContentPane().add(Panne, java.awt.BorderLayout.LINE_START);
       
        JButton gomme = new JButton("");
        gomme.setBounds(146, 19, 46, 44);
        gomme.setBackground(Color.WHITE);
        gomme.setIcon(new ImageIcon("images/gomme2.png"));
        gomme.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.setRefType(8);
        	}
        });
        tailleCrayon = new javax.swing.JButton();
        tailleCrayon.setBounds(86, 19, 48, 44);
        tailleCrayon.setBackground(Color.WHITE);
        tailleCrayon.setIcon(new ImageIcon("images/widthpencil.png"));
        
                tailleCrayon.setToolTipText("Size");
                tailleCrayon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                tailleCrayon.setFocusable(false);
                tailleCrayon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                tailleCrayon.setPreferredSize(new java.awt.Dimension(0, 0));
                tailleCrayon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                tailleCrayon.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    	 actionPerformed(evt);
                    }
                });
        
        //couleur contoure
                
        contour = new javax.swing.JCheckBox();
        contour.setBounds(35, 372, 85, 23);
        
                contour.setForeground(new Color(128, 0, 128));
                contour.setSelected(true);
                contour.setText("Contoure");
                contour.setContentAreaFilled(false);
                contour.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ContourCheckerActionPerformed(evt);
                    }
                });
                
  //remplissage
                
        replissage = new javax.swing.JCheckBox();
        replissage.setBounds(35, 421, 85, 23);
        
                replissage.setForeground(new Color(128, 0, 128));
                replissage.setText("Remplissage");
                replissage.setContentAreaFilled(false);
                replissage.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        fillCheckerActionPerformed(evt);
                    }
                });
                
        ChoixColeur = new javax.swing.JButton();
        ChoixColeur.setBounds(167, 393, 36, 31);
        ChoixColeur.setIcon(new ImageIcon("images/colorchoose.png"));
        
                ChoixColeur.setContentAreaFilled(false);
                ChoixColeur.setOpaque(true);
                ChoixColeur.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        ColBackGActionPerformed(evt);
                    }
                });
                
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(Panne, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(zonedessin, GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE))
        		.addComponent(pan2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
        );
        zonedessin.setBackground(new Color(255, 255, 240));
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(pan2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(Panne, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        				.addComponent(zonedessin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)))
        );
        
        zonedessin.setLayout(null);
        Panne.setLayout(null);
        Panne.add(contour);
        Panne.add(replissage);
        Panne.add(ChoixColeur);
        Panne.add(Pan_1);
        Pan_1.setLayout(null);
        Pan_1.add(crayon);
        Pan_1.add(tailleCrayon);
        Pan_1.add(gomme);
        Panne.add(Pan_4);
        Panne.add(Pan_3);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Couleures");
        mntmNewMenuItem.setFont(new Font("Times New Roman", Font.BOLD, 14));
        mntmNewMenuItem.setForeground(new Color(128, 0, 0));
        mntmNewMenuItem.setBackground(new Color(230, 230, 250));
        mntmNewMenuItem.setBounds(165, 456, 110, 22);
        Panne.add(mntmNewMenuItem);
        getContentPane().setLayout(groupLayout);
        
        this.barMenuclique();

    }

//couleur de pinceau
    
    private void barMenuclique() {

        ChoixColeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color col = JColorChooser.showDialog(PrincipaleBase.this, "" , Color.GREEN);
                System.out.println(col);
                zonedessin.setRefCouleurBackground(col);
                System.out.println(zonedessin.getRefCouleurBackground());
                System.out.println(col);
                ChoixColeur.setBackground(col);
                ChoixColeur.setOpaque(true);
            }
        });
        
  //taille de point
        
        tailleCrayon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String[] taillerefPinceauToolx = {"2", "4", "6", "8", "10", "12", "14",
                    "16", "18", "20", "22", "24", "26", "28", "36", "48", "72", "84", "90"};

                String chaineTaille = (String) JOptionPane.showInputDialog(PrincipaleBase.this, "choose the your size", "Size Chooser",
                        JOptionPane.QUESTION_MESSAGE,
                        null, taillerefPinceauToolx, taillerefPinceauToolx[1]);
                int taille = Integer.parseInt(chaineTaille);
                System.err.println(zonedessin.getRefPointerTaille());
                zonedessin.setRefPointerTaille(taille);
                System.out.println(zonedessin.getRefPointerTaille());
            }
        });

    }

    private void initComponents() {
    		
        Panne = new javax.swing.JPanel();
        pan2 = new javax.swing.JToolBar();
        pan2.setBackground(new Color(230, 230, 250));
        pan2.setRollover(true);
        pan2.setFloatable(false);
        nouveau = new javax.swing.JButton();
        nouveau.setIcon(new ImageIcon("images/newdoc.png"));
        enregistre = new javax.swing.JButton();
        enregistre.setIcon(new ImageIcon("images/savedoc.png"));
        ouvrir = new javax.swing.JButton();
        ouvrir.setIcon(new ImageIcon("images/s7.PNG"));
        repete = new javax.swing.JButton();
        repete.setIcon(new ImageIcon("images/saa.PNG"));
        annul = new javax.swing.JButton();
        annul.setIcon(new ImageIcon("images/as.PNG"));
        pan1 = new javax.swing.JMenuBar();
        pan1.setBackground(new Color(248, 248, 255));
        File = new javax.swing.JMenu();
        File.setBackground(new Color(255, 255, 255));
        File.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        File.setForeground(new Color(0, 0, 139));
        nouveau_1 = new javax.swing.JMenuItem();
        nouveau_1.setIcon(null);
        ouvrir_1 = new javax.swing.JMenuItem();
        ouvrir_1.setIcon(null);
        sauve = new javax.swing.JMenuItem();
        sauve.setIcon(null);
        quitter = new javax.swing.JMenuItem();
        quitter.setIcon(null);
        Edit = new javax.swing.JMenu();
        Edit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        Edit.setHorizontalAlignment(SwingConstants.CENTER);
        Edit.setBackground(new Color(255, 255, 255));
        Edit.setForeground(new Color(0, 0, 128));
        annuler = new javax.swing.JMenuItem();
        refaire = new javax.swing.JMenuItem();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("");
        setMinimumSize(new java.awt.Dimension(990, 790));
        setVisible(true);
        

        Panne.setBackground(new Color(230, 230, 250));
        pan2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nouveau.setToolTipText("New file");
        nouveau.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nouveau.setFocusable(false);
        nouveau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nouveau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauActionPerformed(evt);
            }
        });
        pan2.add(nouveau);
        

        enregistre.setToolTipText("Save image");
        enregistre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        enregistre.setContentAreaFilled(false);
        enregistre.setFocusable(false);
        enregistre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enregistre.setOpaque(true);
        enregistre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        enregistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistreActionPerformed(evt);
            }
        });
        pan2.add(enregistre);

        ouvrir.setToolTipText("Open file");
        ouvrir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ouvrir.setFocusable(false);
        ouvrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ouvrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ouvrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouvrirActionPerformed(evt);
            }
        });
        pan2.add(ouvrir);

        repete.setToolTipText("Redo");
        repete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        repete.setFocusable(false);
        repete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        repete.setMaximumSize(new java.awt.Dimension(37, 37));
        repete.setMinimumSize(new java.awt.Dimension(37, 37));
        repete.setPreferredSize(new java.awt.Dimension(0, 0));
        repete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        repete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               repeteActionPerformed(evt);
            }
        });
        pan2.add(repete);

        annul.setToolTipText("Undo");
        annul.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        annul.setFocusable(false);
        annul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        annul.setMaximumSize(new java.awt.Dimension(37, 37));
        annul.setMinimumSize(new java.awt.Dimension(37, 37));
        annul.setPreferredSize(new java.awt.Dimension(0, 0));
        annul.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        annul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               annulActionPerformed(evt);
            }
        });
        pan2.add(annul);

        File.setText("   Fichier");

        nouveau_1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        nouveau_1.setText("Nouveau");
        nouveau_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });
        File.add(nouveau_1);

        ouvrir_1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ouvrir_1.setText("Ouvrir");
        ouvrir_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        File.add(ouvrir_1);

        sauve.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sauve.setText("Sauvegarder");
        sauve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        File.add(sauve);

        quitter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        File.add(quitter);

        pan1.add(File);

        Edit.setText("      Editer");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        annuler.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoMenuActionPerformed(evt);
            }
        });
        Edit.add(annuler);

        refaire.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        refaire.setText("Refaire");
        refaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoMenuActionPerformed(evt);
            }
        });
        Edit.add(refaire);

        pan1.add(Edit);
        supprime = new JMenuItem("Supprimer Tout");
        supprime.addActionListener(new ActionListener() {  	
        	public void actionPerformed(ActionEvent arg0) {
        		zonedessin.clear();
        	}
        });
 
        Edit.add(supprime);

        setJMenuBar(pan1);
        
        JMenu mnAProposDe = new JMenu();
        mnAProposDe.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        mnAProposDe.setText("    A propos de Paint");
        mnAProposDe.setHorizontalAlignment(SwingConstants.CENTER);
        mnAProposDe.setForeground(new Color(0, 0, 128));
        mnAProposDe.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        mnAProposDe.setBackground(Color.WHITE);
        pan1.add(mnAProposDe);
        
        JMenuItem mntmCestUnLogiciele = new JMenuItem();
        mntmCestUnLogiciele.setIcon(new ImageIcon("images\\col.png"));
        mntmCestUnLogiciele.setText("C'est un logiciele pour dessiner des images ou des formes geometriques\r\n");
        mnAProposDe.add(mntmCestUnLogiciele);

        pack();
    }

    protected void nouveauActionPerformed(ActionEvent evt) {
    	zonedessin.clearPan();
	}

	protected void enregistreActionPerformed(ActionEvent evt) {
		zonedessin.SaveImage();
		
	}

	protected void ouvrirActionPerformed(ActionEvent evt) {
		 try {
	            zonedessin.OpenImage();
	        } catch (IOException ex) {
	            Logger.getLogger(PrincipaleBase.class.getName()).log(Level.SEVERE, null, ex);
	        }
		
	}

	private void ContourCheckerActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.setCcolF(contour.isSelected());
    }

    private void fillCheckerActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.setRColF(replissage.isSelected());
    }

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void redoMenuActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.ControlY();
    }

    private void undoMenuActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.ControlZ();
    }
    //bouton ecrit
    
    private void texteButtActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.setRefType(9);
    }
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.SaveImage();
    }

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.clearPan();
    }

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.Exit();
    }

    private void openActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            zonedessin.OpenImage();
        } catch (IOException ex) {
            Logger.getLogger(PrincipaleBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void taillActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void annulActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.ControlZ();
    }

    private void repeteActionPerformed(java.awt.event.ActionEvent evt) {
        zonedessin.ControlY();
    }

    private void ColBackGActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void setPolice() {
        Font pol = new Font(choixFont.getSelectedItem().toString(),
                boldBut.isSelected() ? Font.BOLD
                : (italicBut.isSelected() ? Font.ITALIC : Font.PLAIN),
                Integer.parseInt(comboTaille.getSelectedItem().toString()));
        zonedessin.setPoliceF(pol);
    }

    public PanneauDeDessin getzonedessin() {
        return zonedessin;
    }

    public JButton getTailleCrayon() {
        return tailleCrayon;
    }

    public JButton getrepete() {
        return repete;
    }

    public JButton getenregistre() {
        return enregistre;
    }

    public JButton getannul() {
        return annul;
    }

    public JToolBar getBarMenu() {
        return pan2;
    }

    public JButton getgomme() {
        return gomme;
    }

    public JMenu getFile() {
        return File;
    }

    public JMenu getEdit() {
        return Edit;
    }

    public JMenuBar getpan1() {
        return pan1;
    }

    public JButton getcouleur() {
        return couleur;
    }

    public JButton getpinceau() {
        return pinceau;
    }

    public JPanel getPanne() {
        return Panne;
    }

    public JButton getblanche() {
        return Blanche;
    }

    public JButton getouvrir() {
        return ouvrir;
    }

    public JButton getnouveau() {
        return nouveau;
    }
}