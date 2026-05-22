package figurer;
import java.awt.Color;
import java.awt.Graphics;

public class Triangel extends Figurer {
    private int bredd;
    private int höjd;

    public Triangel(int x, int y, int b, int h){
        super(x, y);
        this.bredd = b;
        this.höjd = h;
        this.färg = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public double räknaArea(){
        return ((bredd * höjd) / 2);
    }

    @Override
    public void rita(Graphics g){
        g.setColor(färg);
        // Räkna ut hörnens positioner dynamiskt baserat på positionX och positionY
        int drawX = positionX - (bredd / 2);
        int drawY = positionY + (höjd / 2);
        
        int[] xPoints = {drawX, drawX + bredd / 2, drawX + bredd};
        int[] yPoints = {drawY, drawY - höjd, drawY};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public String whatAmI(){
        return "Triangel";
    }
}