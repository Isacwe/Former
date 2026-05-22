package figurer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
/**
 * Abstract klass till alla former
 */
public abstract class Figurer implements Serializable{
    //Variablar som alla former behöver
    protected int positionX;
    protected int positionY;
    protected String form;
    protected Color färg;
    protected int fart = 5;
    /**
     * 
     * @param x start prositionen på x axeln
     * @param y start postionen på y axeln
     */
    public Figurer( int x, int y){ 
        this.positionX = x;
        
        this.positionY = y;
    }
    //Getters och setters
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
    public void setX(int x){
        positionX = x;
    }
    //För att flytta formerna
    public void move(int x, int y){
        this.positionX = this.positionX + fart;
    }
    //För att byta håll när den är vid kanten
    public void flipDirection(){
        this.fart = -this.fart;
    }
    public abstract String whatAmI(); //Säger formen
    
    public abstract double räknaArea();

    public abstract void rita(Graphics g); //För att rita ut formen
    
}
