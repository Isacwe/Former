package figurer;
import java.awt.Color;
import java.awt.Graphics;

public class Cirkel extends Figurer {
    private int diameter; // Döpte om från radie till diameter då det matchar hur du skapar den i panelen

    public Cirkel(int x, int y, int d) {
        super(x, y); // Sparar x och y i superklassens positionX och positionY
        this.diameter = d;
        this.färg = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    public void setDiameter(int d) {
        this.diameter = d;
    }

    @Override
    public double räknaArea() {
        double radie = diameter / 2.0;
        return (radie * radie * Math.PI);
    }

    @Override
    public void rita(Graphics g) {
        g.setColor(färg);
        
        // Räkna ut övre vänstra hörnet baserat på den AKTUELLA rörliga positionX
        int drawX = positionX - (diameter / 2);
        int drawY = positionY - (diameter / 2);
        
        // rita med korrekt ordning: X först, sen Y
        g.fillOval(drawX, drawY, diameter, diameter);
    }

    @Override
    public String whatAmI() {
        return "Cirkel";
    }
    
    // getX() är borttagen härifrån så att superklassens fungerande getX() används istället!
}