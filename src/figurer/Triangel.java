package figurer;
import java.awt.Color;
import java.awt.Graphics;

public class Triangel extends Figurer{
    private int bredd;
    private int höjd;
    private final int startX;
    private final int startY;

    public Triangel(int x, int y, int b, int h){
        super(x, y);
        bredd = b;
        höjd = h;
        startX = x -(b/2);
        startY = y + (h/2);
        färg = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        
    }
    public void setBredd(int b){
        bredd = b;
    }
    public void setHöjd(int h){
        höjd = h;
    }
    @Override
    public double räknaArea(){
        return ((bredd*höjd)/2);
    }
    @Override
    public void rita(Graphics g){
        g.setColor(färg);
        int[] xPoints = {startX, startX + bredd / 2, startX + bredd};
        int[] yPoints = {startY, startY - höjd, startY};
        g.fillPolygon(xPoints, yPoints, 3);
    }
    @Override
    public String whatAmI(){
        return "Triangel";
    }
}