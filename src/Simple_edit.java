import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Simple_edit extends Forme_Geometrique{
    ArrayList<Line2D> enregistreLin = new ArrayList<>();

    public Simple_edit(double x, double y, int taille, Color countourColor, Color insideColor,int reforme) {
        super(x, y, taille, countourColor, insideColor, reforme,true,false);
        AddPoint(x , y);
    }
    
    public void AddPoint(double X, double Y){
    	enregistreLin.add(new Line2D.Double(x, y, X, Y));
        x = X;
        y = Y;
    }

    public ArrayList<Line2D> getenregistreLin() {
        return enregistreLin;
    }
    
}
