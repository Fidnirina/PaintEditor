import java.awt.Color;
import java.awt.Font;


public class Textes extends Forme_Geometrique{
    
    private Font police;
    private String texte;

    public Textes(double x, double y, int taille, Color countourColor, Color insideColor, int refforme, boolean b, boolean bol, Font font, String txt) {
        super(x, y, taille, countourColor, insideColor, refforme, b, bol);
        police = font;
        texte = txt;
    }

    public Font getPolice() {
        return police;
    }

    public void setPolice(Font police) {
        this.police = police;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
    
    
}
