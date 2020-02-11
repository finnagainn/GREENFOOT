import greenfoot.*;
import java.util.List;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    

    public MyWorld() {    
        
        super(500, 646, 1, false);
        
        setPaintOrder(PatientZero.class, Human.class);
        for (int i = 0; i < 50; i++) {
            addObject(new Human(), Greenfoot.getRandomNumber(370 - 125) + 125, 
                                    Greenfoot.getRandomNumber(370 - 30) + 30);
        }
        
        //Counter counter = new Counter();
        //addObject(counter, 400, 500);
        addObject(new PatientZero(), 270, 200);
        addObject(new H1N1(), 70, 580);
        addObject(new Ebola(), 150, 580);
        addObject(new Polio(), 230, 580);
        addObject(new Measles(), 315, 580);
        

        
        getBackground().drawImage(new GreenfootImage("Select an infection:", 
                                    20, null, null), 120, 530);
                                    
        getBackground().drawImage(new GreenfootImage("H1N1", 
                                    15, null, null), 50, 610);
                                    
        getBackground().drawImage(new GreenfootImage("Ebola", 
                                    15, null, null), 130, 610);
        
        getBackground().drawImage(new GreenfootImage("Polio", 
                                    15, null, null), 215, 610);    
                                    
                getBackground().drawImage(new GreenfootImage("Measles", 
                                    15, null, null), 290, 610);   
        GreenfootImage home = new GreenfootImage("home.png");
        GreenfootImage facts = new GreenfootImage("facts.png");
        
        
        getBackground().drawImage(home, 25, 15);
        getBackground().drawImage(new GreenfootImage("Home Page", 15, null, null), 15, 65); 
                                       
                                            
        
        getBackground().drawImage(facts, 25, 80);
        getBackground().drawImage(new GreenfootImage("Facts Page", 15, null, null), 15, 135);         
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
                Greenfoot.setWorld(new FactsPage());
            }
        }        
    }

    
}
