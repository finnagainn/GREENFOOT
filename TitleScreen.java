import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 646, 1, false);
        
        getBackground().drawImage(new GreenfootImage("Corrupted Blood:", 
                                    50, null, null), (70), 50);
        
        getBackground().drawImage(new GreenfootImage("Learn about diseases and their R-naught. ", 
                                    20, null, null), (85), 100);  

        /**
         "In epidemiology, the basic reproduction number" + 
         "(sometimes called basic reproductive ratio," + 
         "or incorrectly basic reproductive rate," +
         "and denoted R0, r nought) of an infection" +
         "can be thought of as the number of cases one" + 
         "case generates on average over the course of" +
         "its infectious period, in an otherwise" + 
         "uninfected population."
         
         
         Today you will learn about
         H1N1, Ebola, Mealses, and Polio
         
         //Adding a home button and virus facts page to extend run time
         */
        getBackground().drawImage(new GreenfootImage( "In epidemiology, the basic reproduction number", 20, null, null), 
                                                    (60), 200); 
        getBackground().drawImage(new GreenfootImage("(sometimes called basic reproductive ratio,", 20, null, null), 
                                                    (60), 220);  
        getBackground().drawImage(new GreenfootImage("or incorrectly basic reproductive rate,", 20, null, null), 
                                                    (60), 240);  
        getBackground().drawImage(new GreenfootImage("and denoted R-sub-0, r naught) of an infection ", 20, null, null), 
                                                    (60), 260);  
        getBackground().drawImage(new GreenfootImage("can be thought of as the number of cases one", 20, null, null), 
                                                    (60), 280);  
        getBackground().drawImage(new GreenfootImage("case generates on average over the course of ", 20, null, null), 
                                                    (60), 300);  
        getBackground().drawImage(new GreenfootImage("its infectious period, in an otherwise", 20, null, null), 
                                                    (60), 320); 
        getBackground().drawImage(new GreenfootImage("uninfected population.", 20, null, null), 
                                                    (60), 340);    
                                                    
        getBackground().drawImage(new GreenfootImage("Today you will learn about: ", 20, null, null), 
                                                    (60), 380);  
                                                    
        getBackground().drawImage(new GreenfootImage("H1N1, Ebola, Mealses, and Polio ", 20, null, null), 
                                                    (60), 400);      
                                                    
        getBackground().drawImage(new GreenfootImage("Click Patient Zero to begin the simulation  ", 20, null, null), 
                                                    (60), 440);   
        getBackground().drawImage(new GreenfootImage("Patient Zero ", 20, null, null), 200, 530);
        
        
        //addObject(new PatientZero(), 250, 500);                                            
        GreenfootImage zero = new GreenfootImage("patientzerowell.png");
        getBackground().drawImage(zero, 245, 490);        
        //getBackground().drawImage(new GreenfootImage("START", 60, null, null), 
                                                    //165, 500);                                                       
    }
       
                                    
  /**  
    public void act() {

        if (Greenfoot.mouseClicked(null)) {
            Actor actor = Greenfoot.getMouseInfo().getActor();
            if (actor != null) {
                if (actor instanceof PatientZero) {
                    //actor.setImage("originalhuman.png");
                    Greenfoot.setWorld(new MyWorld());
                }
            }
            
        }    
    }
    
 **/  
 
    public void act() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (Greenfoot.mouseClicked(null)) {
            if (mouse.getX() >= 230 && mouse.getX() <= 270 && mouse.getY() >= 480 && mouse.getY() <= 520) {
                Greenfoot.setWorld(new MyWorld());
            }
        }    
    }
}
