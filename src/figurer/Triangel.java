package figurer;

import java.awt.Graphics;

public class Triangel extends Figurer{
    private int bredd;
    private int höjd;

    public Triangel(int x, int y, int b, int h){
        super(x, y);
        b = bredd;
        h = höjd;
        
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
        g.fillPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
    }
}
