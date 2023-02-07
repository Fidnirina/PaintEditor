import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings({ "serial", "unused" })

public class PanneauDeDessin extends JPanel {

    private int rfPointe = 4;
    private int refType = 1;
    private Color refColp;
    private Color refColb= Color.white;
    private Cursor curs = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
    private JButton realise = new JButton();
    protected boolean CcolF = true, RColF = false;
    BufferedImage soamage;

    //*********tableau enregistrer action
    
    private ArrayList<Forme_Geometrique> frmList = new ArrayList<>();
    private ArrayList<Forme_Geometrique> frmListRedo = new ArrayList<>();

    Simple_edit d2, eraser;
    Forme_Geometrique frmtout;
    private Font policeF = new Font("", Font.PLAIN, 12);
    private Frame frame;
    private int Xpt, Ypts, resizeX = -50, resizeY = -50;

    public PanneauDeDessin(Frame frame) {
        this.frame = frame;
        setRefCouleurPointer(Color.BLACK);
        realise.setContentAreaFilled(false);
        realise.setOpaque(true);
        realise.setBackground(Color.RED);
        add(realise);
        realise.setLocation(-50, -50);
        realise.setPreferredSize(new Dimension(5, 5));
        realise.setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                if (getCursor().equals(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR))) {
                    Xpt = evt.getXOnScreen() - (int) frmtout.getX();
                    Ypts = evt.getYOnScreen() - (int) frmtout.getY();
                    if (frmtout.getRefForme() == 2) {
                    	frmtout.setWidth(frmtout.getLastX() - frmtout.getX());
                    	frmtout.setHeight(frmtout.getLastY() - frmtout.getY());
                    }
                } else {
                    resizeX = -25;
                    resizeY = -25;
                    realise.setLocation(resizeX, resizeY);
                    switch (refType) {
                        case 1:
                            d2 = new Simple_edit(evt.getX(), evt.getY(),  rfPointe , refColp, refColb, 1);
                            frmList.add(d2);
                            break;
                        case 2:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(),  rfPointe , refColp, refColb, 2, CcolF, RColF);
                        	frmtout.setLastX(evt.getX());
                        	frmtout.setLastY(evt.getY());
                            frmList.add(frmtout);
                            break;
                        case 3:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(),  rfPointe , refColp, refColb, 3, CcolF, RColF);
                            frmList.add(frmtout);
                            break;
                        case 4:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(),  rfPointe , refColp, refColb, 4, CcolF, RColF);
                            frmList.add(frmtout);
                            break;
                        case 5:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(), rfPointe, refColp, refColb, 5, CcolF, RColF);
                            frmList.add(frmtout);
                            break;
                        case 6:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(), rfPointe, refColp, refColb, 6, CcolF, RColF);
                        	frmtout.setLastX(evt.getX());
                        	frmtout.setLastY(evt.getY());
                            frmList.add(frmtout);
                            break;
                        case 7:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(), rfPointe, refColp, refColb, 7, CcolF, RColF);
                            frmList.add(frmtout);
                            break;
                        case 8:
                            eraser = new Simple_edit(evt.getX(), evt.getY(), rfPointe, Color.WHITE, Color.WHITE, 8);
                            frmList.add(eraser);
                            break;
                        case 9:
                            TexteDialog txtD = new TexteDialog(frame);
                            txtD.setVisible(true);
                            if (txtD.getTExte() != null) {
                                System.out.println(txtD.getTExte());
                                frmtout = new Textes(evt.getX(), evt.getY(),   rfPointe , refColp, refColb, 9, CcolF, RColF, policeF, txtD.getTExte());
                               
                                frmtout.setWidth(50);
                                frmtout.setHeight(50);
                                frmList.add(frmtout);
                            }
                            break;
                        case 10:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(),  rfPointe, refColp, refColb, 10, CcolF, RColF);
                            frmList.add(frmtout);
                            break;
                        case 11:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(),  rfPointe, refColp, refColb, 11, CcolF, RColF);
                            frmList.add(frmtout);
                            break;
                        case 12:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(),  rfPointe, refColp, refColb, 12, CcolF, RColF);
                            frmList.add(frmtout);
                            break;
                        case 13:
                        	frmtout = new Forme_Geometrique(evt.getX(), evt.getY(),  rfPointe, refColp, refColb, 13, CcolF, RColF);
                            frmList.add(frmtout);
                            break;

                    }
                    repaint();
                    frmListRedo.clear();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (getCursor().equals(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR))) {

                } else {
                    if (frmtout instanceof Forme_Geometrique) {
                        realise.setLocation(e.getX(), e.getY());
                    }
                    resizeX = e.getX();
                    resizeY = e.getY();
                }
                System.out.println(resizeX + "         " + resizeY);
            }

        });

        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent evt) {
                if (frmtout instanceof Forme_Geometrique) {
                    if (frmtout.getRefForme() == 2) {
                        Rectangle2D lin = new Rectangle2D.Double(frmtout.getX(), frmtout.getY(), frmtout.getLastX() - frmtout.getX(), frmtout.getLastY() - frmtout.getY());
                        if (lin.contains(evt.getX(), evt.getY())) {
                            setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                        } else {
                            setCursor(curs);
                        }
                    } else {
                        Rectangle2D r = new Rectangle2D.Double(frmtout.getX(), frmtout.getY(), frmtout.getWidth(), frmtout.getHeight());
                        if (r.contains(evt.getX(), evt.getY())) {
                            setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                        } else {
                            setCursor(curs);
                        }
                    }
                }
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
                if (getCursor().equals(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR))) {
                	frmtout.setX(evt.getXOnScreen() - Xpt);
                	frmtout.setY(evt.getYOnScreen() - Ypts);
                	frmtout.setLastX(frmtout.getX() + frmtout.getHeight());
                	frmtout.setLastY(frmtout.getY() + frmtout.getWidth());
                    if (frmtout.getRefForme() == 2) {
                        resizeX = (int) frmtout.getLastX();
                        resizeY = (int) frmtout.getLastY();
                    } else {
                        resizeX = (int) (frmtout.getX() + frmtout.getWidth());
                        resizeY = (int) (frmtout.getY() + frmtout.getHeight());
                    }
                    realise.setLocation(resizeX, resizeY);
                } else {
                    switch (refType) {
                        case 1:
                            d2.AddPoint(evt.getX(), evt.getY());
                            break;
                        case 2:
                            if (frmtout != null) {
                            	frmtout.setLastX(evt.getX());
                            	frmtout.setLastY(evt.getY());
                            }
                            break;
                        case 3:
                            if (frmtout != null) {
                            	frmtout.setWidth(evt.getX() - frmtout.getX());
                            	frmtout.setHeight(evt.getY() - frmtout.getY());
                            }
                            break;
                        case 4:
                            if (frmtout != null) {
                            	frmtout.setHeight(evt.getY() - frmtout.getY());
                            	frmtout.setWidth(frmtout.getHeight());
                            }
                            break;
                        case 5:
                            if (frmtout != null) {
                            	frmtout.setWidth(evt.getX() - frmtout.getX());
                            	frmtout.setHeight(evt.getY() - frmtout.getY());
                            }
                            break;
                        case 6:
                            if (frmtout != null) {
                            	frmtout.setLastX(evt.getX());
                            	frmtout.setLastY(evt.getY());
                            }
                            break;
                        case 7:
                            if (frmtout != null) {
                            	frmtout.setWidth(evt.getX());
                            	frmtout.setHeight(evt.getY());
                            }
                            break;
                        case 8:
                            eraser.AddPoint(evt.getX(), evt.getY());
                            break;
                        case 10:
                            if (frmtout != null) {
                            	frmtout.setWidth(evt.getX());
                            	frmtout.setHeight(evt.getY());
                            }
                        case 11:
                            if (frmtout != null) {
                            	frmtout.setWidth(evt.getX());
                            	frmtout.setHeight(evt.getY());
                            }
                        case 12:
                            if (frmtout != null) {
                            	frmtout.setWidth(evt.getX());
                            	frmtout.setHeight(evt.getY());
                            }
                        case 13:
                            if (frmtout != null) {
                            	frmtout.setWidth(evt.getX());
                            	frmtout.setHeight(evt.getY());
                            }
                    }

                }
                repaint();
            }
        });
        
        realise.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                resizeX = evt.getXOnScreen() - Xpt;
                resizeY = evt.getYOnScreen() - Ypts;
                realise.setLocation(resizeX, resizeY);
                if (frmtout instanceof Forme_Geometrique) {
                    if (frmtout.getRefForme() == 2) {
                    	frmtout.setLastX(realise.getLocation().x);
                    	frmtout.setLastY(realise.getLocation().y);
                    } else {
                    	frmtout.setWidth(realise.getLocation().x - frmtout.getX());
                    	frmtout.setHeight(realise.getLocation().y - frmtout.getY());
                    }
                }
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent evt) {

            }
        });
        realise.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                Xpt = evt.getXOnScreen() - realise.getLocation().x;
                Ypts = evt.getYOnScreen() - realise.getLocation().y;
                realise.setLocation(Xpt, Ypts);
                if (frmtout instanceof Forme_Geometrique) {
                    if (frmtout.getRefForme() == 2) {
                    	frmtout.setLastX(realise.getLocation().x);
                    	frmtout.setLastY(realise.getLocation().y);
                    } else {
                    	frmtout.setWidth(realise.getLocation().x - frmtout.getX());
                    	frmtout.setHeight(realise.getLocation().y - frmtout.getY());
                    }
                }
                repaint();
            }
        });

    }

    // realisation et proprieter du grqphe
    
    @Override
    protected void paintComponent(Graphics graph) {
        Graphics2D graph2 = (Graphics2D) graph;
        graph2.setColor(Color.WHITE);
        graph2.fillRect(0, 0, this.getWidth(), this.getHeight());
        if(soamage!=null){
            graph.drawImage(soamage, 0, 0, null);
        }
        frmList.forEach((list) -> {
            graph2.setColor(list.getCountourColor());
            graph2.setStroke(new BasicStroke(list.getStrokeWidth(), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            switch (list.getRefForme()) {
                case 1:
                    Simple_edit jox = (Simple_edit) list; // consumer.accepte (Toute Form)
                    for (Line2D l : jox.getenregistreLin()) {
                        graph2.draw(l);
                    }
                    break;
                    
                case 2:
                    Line2D ligne2d = new Line2D.Double(list.getX(), list.getY(), list.getLastX(), list.getLastY());
                    graph2.draw(ligne2d);
                    break;
                    
                case 3:
                    Rectangle2D rectangle = new Rectangle2D.Double(list.getX(), list.getY(), list.getWidth(), list.getHeight());
                    graph2.setStroke(new BasicStroke(list.getStrokeWidth(), BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
                    if (list.isRColBJ()) {
                        graph2.setPaint(list.getInsideColor());
                        graph2.fill(rectangle);
                    }
                    if (list.isCcolBJ()) {
                        graph2.setPaint(list.getCountourColor());
                        graph2.draw(rectangle);
                    }
                    break;
                    
                case 4:
                    Rectangle2D carre = new Rectangle2D.Double(list.getX(), list.getY(), list.getHeight(), list.getHeight());
                    graph2.setStroke(new BasicStroke(list.getStrokeWidth(), BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
                    if (list.isRColBJ()) {
                        graph2.setPaint(list.getInsideColor());
                        graph2.fill(carre);
                    }
                    if (list.isCcolBJ()) {
                        graph2.setPaint(list.getCountourColor());
                        graph2.draw(carre);
                    }
                    break;
                    
                case 5:
                    Ellipse2D ellypse = new Ellipse2D.Double(list.getX(), list.getY(), list.getWidth(), list.getHeight());
                    if (list.isRColBJ()) {
                        graph2.setPaint(list.getInsideColor());
                        graph2.fill(ellypse);
                    }
                    if (list.isCcolBJ()) {
                        graph2.setPaint(list.getCountourColor());
                        graph2.draw(ellypse);
                    }
                    break;
                    
                case 6:
                    CubicCurve2D courbe = new CubicCurve2D.Double(list.getX(), list.getY(), list.getWidth(), list.getHeight(), list.getLastX() / 2, list.getLastY() / 2, list.getLastX(), list.getLastY());
                    if (list.isRColBJ()) {
                        graph2.setPaint(list.getInsideColor());
                        graph2.fill(courbe);
                    }
                    if (list.isCcolBJ()) {
                        graph2.setPaint(list.getCountourColor());
                        graph2.draw(courbe);
                    }
                    break;
                    
                case 7:
                    Arc2D arc = new Arc2D.Double(list.getX(), list.getY(), list.getWidth(), list.getHeight(), 30, 60, 0);

                    if (list.isRColBJ()) {
                        graph2.setPaint(list.getInsideColor());
                        graph2.fill(arc);
                    }
                    if (list.isCcolBJ()) {
                        graph2.setPaint(list.getCountourColor());
                        graph2.draw(arc);
                    }
                    break;
                    
                case 8:
                    Simple_edit eraser = (Simple_edit) list;
                    for (Line2D erase : eraser.getenregistreLin()) {
                        graph2.draw(erase);
                    }
                    break;
                    
                case 9:
                    graph2.setFont(((Textes) list).getPolice());
                    graph2.drawString(((Textes) list).getTexte(), (float) list.getX(), (float) list.getY());
                    break;
                    
                case 10:
                    Polygon polygon = new Polygon(
                            new int[]{(int) (list.getWidth() / 2 + list.getX()), (int) (list.getWidth() + list.getX()), (int) list.getX()},
                            new int[]{(int) list.getY(), (int) (list.getHeight() + list.getY()), (int) (list.getHeight() + list.getY())},
                            3);
                    if (list.isRColBJ()) {
                        graph2.setPaint(list.getInsideColor());
                        graph2.fill(polygon);
                    }
                    if (list.isCcolBJ()) {
                        graph2.setPaint(list.getCountourColor());
                        graph2.draw(polygon);
                    }
                    break;
                   
                case 11:
                    Polygon polygo = new Polygon(
                            new int[]{
                                (int) (list.getWidth() / 2 + list.getX()),
                                (int) (list.getWidth() + list.getX()),
                                (int) (list.getWidth() / 2 + list.getX()),
                                (int) list.getX()},
                            new int[]{
                                (int) list.getY(),
                                (int) (list.getHeight() / 2 + list.getY()),
                                (int) (list.getHeight() + list.getY()),
                                (int) (list.getHeight() / 2 + list.getY())},
                            4);
                    if (list.isRColBJ()) {
                        graph2.setPaint(list.getInsideColor());
                        graph2.fill(polygo);
                    }
                    if (list.isCcolBJ()) {
                        graph2.setPaint(list.getCountourColor());
                        graph2.draw(polygo);
                    }
                    break;
                    
                case 12:
                    Polygon polyg = new Polygon(
                            new int[]{
                                (int) (list.getWidth() / 2 + list.getX()),
                                (int) (list.getWidth() + list.getX()),
                                (int) (list.getWidth() + list.getX()),
                                (int) (list.getWidth() / 2 + list.getX()),
                                (int) list.getX(),
                                (int) list.getX()},
                            new int[]{
                                (int) list.getY(),
                                (int) (list.getHeight() / 4 + list.getY()),
                                (int) ((list.getHeight() * 3) / 4 + list.getY()),
                                (int) (list.getHeight() + list.getY()),
                                (int) ((list.getHeight() * 3) / 4 + list.getY()),
                                (int) (list.getHeight() / 4 + list.getY())},
                            6);
                    if (list.isRColBJ()) {
                        graph2.setPaint(list.getInsideColor());
                        graph2.fill(polyg);
                    }
                    if (list.isCcolBJ()) {
                        graph2.setPaint(list.getCountourColor());
                        graph2.draw(polyg);
                    }
                    break;
                    
                case 13:
                    Polygon poly = new Polygon( 
                            new int[]{ (int)list.getX(), (int)((list).getWidth()+list.getX()), (int)list.getX()}, 
                            new int[]{ (int)list.getY(), (int)((list).getHeight()+list.getY()), (int)((list).getHeight()+list.getY())},
                            3);
                    if(list.isRColBJ()){
                        graph2.setPaint( list.getInsideColor());
                        graph2.fill(poly);
                    }
                    if(list.isCcolBJ()){
                        graph2.setPaint( list.getCountourColor());
                        graph2.draw(poly);
                    }
                    break;
                    
                default:
                    break;
            }
        });

        if (frmtout instanceof Forme_Geometrique) {
            if (frmtout.getRefForme() == 2) {

            } else {
                Rectangle2D recta = new Rectangle2D.Double(frmtout.getX(), frmtout.getY(), frmtout.getWidth(), frmtout.getHeight());
                graph2.setPaint(Color.GRAY);
                graph2.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 3f, new float[]{4f, 2f}, 0f));
                graph2.draw(recta);

            }
        }
        realise.setLocation(resizeX, resizeY);
    }

    public static void main(String[] args) {

    }

    public void ControlZ() {
        if (!frmList.isEmpty()) {
            Forme_Geometrique T = frmList.get(frmList.size() - 1);
            frmList.remove(T);
            frmListRedo.add(T);
            repaint();
        }
    }

    public void ControlY() {
        if (!frmListRedo.isEmpty()) {
            Forme_Geometrique T = frmListRedo.get(frmListRedo.size() - 1);
            frmListRedo.remove(T);
            frmList.add(T);
            repaint();
        }
    }

    public int getRefPointerTaille() {
        return  rfPointe;
    }

    public void setRefPointerTaille(int refPointerTaille) {
        this. rfPointe = refPointerTaille;
    }

    public Color getRefCouleurPointer() {
        return refColp;
    }

    public void setRefCouleurPointer(Color refCouleur) {
        this.refColp = refCouleur;
        if (frmtout != null) {
        	frmtout.setCountourColor(refCouleur);
            repaint();
        }
    }

    public Color getRefCouleurBackground() {
        return refColb;
    }

    public void setRefCouleurBackground(Color refCouleurBackground) {
        this.refColb = refCouleurBackground;
        if (frmtout != null) {
        	frmtout.setInsideColor(refCouleurBackground);
            repaint();
        }
    }

    public int getRefType() {
        return refType;
    }

    public void setRefType(int refType) {
        this.refType = refType;
        if (refType == 1 || refType == 8) {
        	frmtout = null;
        }
    }

    public void setCcolF(boolean CcolF) {
        this.CcolF = CcolF;
        if (frmtout != null) {
        	frmtout.setCcolBJ(CcolF);
            repaint();
        }
    }

    public void setRColF(boolean RColF) {
        this.RColF = RColF;
        if (frmtout != null) {
        	frmtout.setRColBJ(RColF);
            repaint();
        }
    }

    public void setPoliceF(Font policeF) {
        this.policeF = policeF;
        if (frmtout != null) {
            ((Textes) frmtout).setPolice(policeF);
            repaint();
        }
    }
    
 //******* boite de dialogue pour choisir le dossier de destination
    
    public void SaveImage() {
        String extension = "JPEG";
        BufferedImage BI = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D graph = BI.createGraphics();
        this.paint(graph);
        File file = new File("Untitled." + extension);
        JFileChooser jfile = new JFileChooser();         
        jfile.setSelectedFile(file);
        int valRetourne = jfile.showSaveDialog(this);
        if (valRetourne == JFileChooser.APPROVE_OPTION) {
            try {

                File fichier = new File(jfile.getSelectedFile().toString() + "." + extension);
                ImageIO.write(BI, "JPEG", fichier);
            } catch (IOException ex) {
                Logger.getLogger(PrincipaleBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            graph.dispose();
        }
    }

    public void OpenImage() throws IOException {
        
        Graphics2D graph = (Graphics2D) this.getGraphics();
        JFileChooser jfile = new JFileChooser();
        int status = jfile.showOpenDialog(this);
        File file = jfile.getSelectedFile();
        if (status == JFileChooser.APPROVE_OPTION) {
        	soamage = ImageIO.read(file);
            graph.drawImage(soamage, 0, 0, null);
            System.out.println("Image Opened: " + file.toString());
            frmList.clear();
        }
    }

    public void newImage() {
       
    }
    public void clearPan(){
        if(frmList.isEmpty()){
            repaint();
        }else{
            if(JOptionPane.showConfirmDialog(this, "Voulez vous enregistrer l'image?", "", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
               SaveImage(); 
               frmList.clear();
            }else{
                frmList.clear();
                repaint();
            }
            
        }
    }
    
        public void Exit(){
        if(frmList.isEmpty()){
            System.exit(0);
        }else{
            if(JOptionPane.showConfirmDialog(this, "Voulez vous enregistrer ce dessin?", "", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
               SaveImage(); 
               frmList.clear();
               System.exit(0);
            }else{
                frmList.clear();
                repaint();
                System.exit(0);
            }
            
        }
    }

    public ArrayList<Forme_Geometrique> getFormeList() {
        return frmList;
    }

    public Forme_Geometrique getFormejiaby() {
        return frmtout;
    }

	public void clear() {
		  if(frmList.isEmpty()){
			  repaint();
	        }else{
	            if(JOptionPane.showConfirmDialog(this, "Voulez vous  le supprimer ?", "", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
	            	frmList.clear();
	            	  repaint();
	           
	                
	            }
	            
	        }
		
	}

	
}
