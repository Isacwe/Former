package figurer;

import java.awt.Graphics;

public class Cirkel extends Figurer{
    private int radie;
    public Cirkel(int x, int y, int r) {
        super(x, y);
        this.radie = r;
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
        g.fillOval(super.positionX, super.positionY, radie, radie);
    }
}