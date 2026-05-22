package figurer;
import java.awt.Color;
import java.awt.Graphics;

public class Rektangel extends Figurer {
    private int bredd;
    private int höjd;

    public Rektangel(int x, int y, int b, int h){
        super(x, y);
        this.bredd = b;
        this.höjd = h;
        this.färg = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public double räknaArea(){
        return (bredd * höjd);
    }

    @Override
    public void rita(Graphics g){
        g.setColor(färg);
        int drawX = positionX - (bredd / 2);
        int drawY = positionY - (höjd / 2);
        g.fillRect(drawX, drawY, bredd, höjd);
    }

    @Override
    public String whatAmI(){
        return "Rektangel";
    }
}