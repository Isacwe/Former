package figurer;
import java.awt.Color;
import java.awt.Graphics;
public abstract class Figurer{
    protected int positionX;
    protected int positionY;
    protected String form;
    protected Color färg;
    
    public Figurer( int x, int y){
        positionX = x;
        
        positionY = y;
    }
    public String getForm(){
        return form;
    }
    public void setForm(String f){
        form = f;
    }
    public int getX(){
        return positionX;
    }
    public int getY(){
        return positionY;
    }
    public abstract String whatAmI();
    
    public abstract double räknaArea();

    public abstract void rita(Graphics g);
    
}
