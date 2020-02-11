
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class PatientZero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PatientZero extends Actor {
    /**
     * Act - do whatever the PatientZero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double rNaughtH1N1 = 2;
    private int rNaughtMeasles = 12;
    private int rNaughtEbola = 3;
    private int rNaughtPolio = 7;
    public static int infected;
    GreenfootImage infectedwhole = new GreenfootImage("infectedwhole.png");

    public void act() {
        if (Greenfoot.mouseClicked(null)) {
            Actor actor = Greenfoot.getMouseInfo().getActor();
                if (actor != null) {
                    if (actor instanceof H1N1) {
                        setImage(infectedwhole);
                        Greenfoot.playSound("cough.wav");
                        resetInfect();
                        Greenfoot.delay(3);

                        
                        /**
                         * The original prblem came from the range. The loop ran beyond
                         * the defined R-naught of the selected disease, because the size
                         * of the arrayList "nearby" is the size of the objects near
                         * PatientZero in the specified radius during the run.
                         * Greenfoot is still Java, so you have access to arrayList style 
                         * methods. I ran another for loop to trim it to the proper 
                         * R-naught. Because the list is the right size, only
                         * one for loop is needed.
                         * */
                        
                        List<Human> nearby = getObjectsInRange(50, Human.class);
                                                   
                        if (nearby.size() > rNaughtH1N1) {
                            for (int i = nearby.size() - 1; i > 0; i--) {
                                nearby.remove(i);
                                if (nearby.size() == rNaughtH1N1) {
                                    break;
                                }
                            }
                        }    
                        
                        for (Human h : nearby) {
                               h.setImage(infectedwhole);
                               Greenfoot.delay(3);
                               infected++;
                               Greenfoot.delay(3); 
                               getWorld().showText("Infected: " + infected, 400, 510);
                               
                        }
                                
                        //getWorld().showText("Infected: " + infected, 400, 510);              
                        Greenfoot.delay(3);
                    }
                    
    /** Measles block */
                    if (actor instanceof Measles) {
                        setImage(infectedwhole);
                        Greenfoot.playSound("cough.wav");
                        resetInfect();
                        Greenfoot.delay(3);

                        
                        List<Human> nearby = getObjectsInRange(100, Human.class);
                                                   
                        if (nearby.size() > rNaughtMeasles) {
                            for (int i = nearby.size() - 1; i > 0; i--) {
                                nearby.remove(i);
                                if (nearby.size() == rNaughtMeasles) {
                                    break;
                                }
                            }
                        }    
                        
                        for (Human h : nearby) {
                               h.setImage(infectedwhole);
                               Greenfoot.delay(3);
                               infected++;
                               Greenfoot.delay(3);   
                               getWorld().showText("Infected: " + infected, 400, 510);
                        }
                                
                        //getWorld().showText("Infected: " + infected, 400, 510);              
                        Greenfoot.delay(3);
                    }
                    
    /** Ebola block */       
    
                    if (actor instanceof Ebola) {
                        setImage(infectedwhole);
                        Greenfoot.playSound("cough.wav");
                        resetInfect();
                        Greenfoot.delay(3);
                        
                        List<Human> nearby = getObjectsInRange(100, Human.class);
                                                   
                        if (nearby.size() > rNaughtEbola) {
                            for (int i = nearby.size() - 1; i > 0; i--) {
                                nearby.remove(i);
                                if (nearby.size() == rNaughtEbola) {
                                    break;
                                }
                            }
                        }    
                        
                        for (Human h : nearby) {
                               h.setImage(infectedwhole);
                               Greenfoot.delay(3);
                               infected++;
                               Greenfoot.delay(3);   
                               getWorld().showText("Infected: " + infected, 400, 510);
                        }
                                
                        //getWorld().showText("Infected: " + infected, 400, 510);              
                        Greenfoot.delay(3);
                    }
                    
    /** Polio Block */                
                    if (actor instanceof Polio) {
                        setImage(infectedwhole);
                        Greenfoot.playSound("cough.wav");
                        resetInfect();
                        Greenfoot.delay(3);
                        
                        List<Human> nearby = getObjectsInRange(100, Human.class);
                                                   
                        if (nearby.size() > rNaughtPolio) {
                            for (int i = nearby.size() - 1; i > 0; i--) {
                                nearby.remove(i);
                                if (nearby.size() == rNaughtPolio) {
                                    break;
                                }
                            }
                        }    
                        
                        for (Human h : nearby) {
                               h.setImage(infectedwhole);
                               Greenfoot.delay(3);
                               infected++;
                               Greenfoot.delay(3);  
                               getWorld().showText("Infected: " + infected, 400, 510);
                        }
                                
                        //getWorld().showText("Infected: " + infected, 400, 510);              
                        Greenfoot.delay(3);
                    }
                }
            }
        }
         
    
  
    public void reset() {
            setImage("patientzerowell.png");
    }
    
    public void deleteAdd() {
        if (!getWorld().getObjects(Human.class).isEmpty()) {
            List<Human> overall = getObjectsInRange(600, Human.class);
                for (Human h : overall) {
                    getWorld().removeObject(h);
                   
                }
                for (int i = 0; i < 50; i++) {
                    getWorld().addObject(new Human(), Greenfoot.getRandomNumber(370 - 125) + 125, 
                        Greenfoot.getRandomNumber(370 - 30) + 30);
                }             
                
            }
    }
    
    public void resetInfect() {
            infected = 0;
    }    



        
}
