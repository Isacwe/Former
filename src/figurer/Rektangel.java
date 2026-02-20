package figurer;
import java.awt.Color;
import java.awt.Graphics;

public class Rektangel extends Figurer{
    private int bredd;
    private int höjd;
    private final int startX;
    private final int startY;
    public Rektangel(int x, int y, int b, int h){
        super(x, y);
        bredd = b;
        höjd = h;
        startX = x -(b/2);
        startY = y - (h/2);
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
        return (bredd*höjd);
    }
    @Override
    public void rita(Graphics g){
        g.setColor(färg);
        g.fillRect(startY, startX, höjd, bredd);
    }
    @Override
    public String whatAmI(){
        return "Rektangel";
    }
}
