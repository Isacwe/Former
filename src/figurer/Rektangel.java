package figurer;

import java.awt.Graphics;

public class Rektangel extends Figurer{
    private int bredd;
    private int höjd;
    private final int startX;
    private final int startY;
    public Rektangel(int x, int y, int b, int h){
        super(x, y);
        b = bredd;
        h = höjd;
        startX = x;
        startY = y;
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
        g.fillRect(startX, startY, bredd, höjd);
    }
    @Override
    public String whatAmI(){
        return "Rektangel";
    }
}
