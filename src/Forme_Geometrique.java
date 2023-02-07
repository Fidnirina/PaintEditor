import java.awt.Color;
import java.awt.Shape;
import javax.swing.JButton;

@SuppressWarnings("unused")
public class Forme_Geometrique {

    protected double x,y,lastX,lastY;
    protected double width = 0, height = 0; 
    protected int strokeWidth = 2;
    protected Color countourColor;
    protected Color insideColor;
    protected boolean CcolBJ,RColBJ;
    protected int refForme;
    
	// declaration variable
	
	private JButton blanche;

    public Forme_Geometrique(double x, double y, int taille, Color countCol, Color isdCol,int refforme, boolean b, boolean bol) {
        this.x = x;
        this.y = y;
        this.countourColor = countCol;
        this.insideColor = isdCol;
        this.strokeWidth = taille;
        this.refForme = refforme;
        this.CcolBJ = b;
        this.RColBJ = bol;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    public int getRefForme() {
        return refForme;
    }

    public void setRefForme(int refForme) {
        this.refForme = refForme;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public Color getCountourColor() {
        return countourColor;
    }

    public void setCountourColor(Color countourColor) {
        this.countourColor = countourColor;
    }

    public Color getInsideColor() {
        return insideColor;
    }

    public void setInsideColor(Color insideColor) {
        this.insideColor = insideColor;
    }

    public double getLastX() {
        return lastX;
    }

    public void setLastX(double lastX) {
        this.lastX = lastX;
    }

    public double getLastY() {
        return lastY;
    }

    public void setLastY(double lastY) {
        this.lastY = lastY;
    }

    public boolean isCcolBJ() {
        return CcolBJ;
    }

    public void setCcolBJ(boolean CcolBJ) {
        this.CcolBJ = CcolBJ;
    }

    public boolean isRColBJ() {
        return RColBJ;
    }

    public void setRColBJ(boolean RColBJ) {
        this.RColBJ = RColBJ;
    }
    
    
}
