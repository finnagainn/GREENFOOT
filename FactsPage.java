import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FactsPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactsPage extends World
{

    /**
     * Constructor for objects of class FactsPage.
     * 
     */
    public FactsPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 646, 1, false);
           /**
        //addObject(new PatientZero(), 90, 150);
        GreenfootImage zero = new GreenfootImage("patientzerowell.png");
        getBackground().drawImage(zero, 90, 150);
        addObject(new H1N1(), 90, 250);
        addObject(new Ebola(), 90, 350);
        addObject(new Polio(), 90, 450);
        addObject(new Measles(), 90, 550);
        
        getBackground().drawImage(new GreenfootImage("Facts Page: ", 50, null, null), (90), 50);
        getBackground().drawImage(new GreenfootImage("Patient Zero: ", 15, null, null), 150, 130);
        getBackground().drawImage(new GreenfootImage("H1N1: ", 15, null, null), 150, 230);        
        getBackground().drawImage(new GreenfootImage("Ebola:", 15, null, null), 150, 330);   
        getBackground().drawImage(new GreenfootImage("Polio: ", 15, null, null), 150, 430);
        getBackground().drawImage(new GreenfootImage("Measles: ", 15, null, null), 150, 530);        
          */ 
        GreenfootImage home = new GreenfootImage("home.png");
        getBackground().drawImage(home, 25, 15);
        getBackground().drawImage(new GreenfootImage("Home Page", 15, null, null), 15, 65); 
                                               
        addObject(new Human(), 50, 100);
       getBackground().drawImage(new GreenfootImage("Simulator", 15, null, null), 20, 125);        
        
    }
    
    public void act() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (Greenfoot.mouseClicked(null)) {
            if (mouse.getX() >= 25 && mouse.getX() <= 70 && mouse.getY() >= 25 && mouse.getY() <= 70) {
                Greenfoot.setWorld(new TitleScreen());
            }
        }
        
        if (Greenfoot.mouseClicked(null)) {
            if (mouse.getX() >= 25 && mouse.getX() <= 70 && mouse.getY() >= 90 && mouse.getY() <= 150) {
                Greenfoot.setWorld(new MyWorld());
            }
        }             
    }
}
