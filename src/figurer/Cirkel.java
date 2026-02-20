package figurer;

import java.awt.Color;
import java.awt.Graphics;

public class Cirkel extends Figurer{
    private int startX;
    private int startY;
    private int radie;
    public Cirkel(int x, int y, int r) {
        super(x, y);
        startX = x;
        startY = y;
        this.radie = r;
        färg = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }
    @Override
    public int getX(){
        return startX;
    }
    public void setRadie(int r){
        radie = r;
    }
    @Override
    public double räknaArea(){
        return ((radie)*(radie)*(Math.PI));
    }
    @Override
    public void rita(Graphics g){
        g.setColor(färg);
        g.fillOval(startY, startX, radie, radie);
    }
    @Override
    public String whatAmI(){
        return "Cirkel";
    }
}