import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Polio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polio extends Actor {
    /**
     * Act - do whatever the Polio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage polioclicked = new GreenfootImage("polioclicked.png");
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            
            setImage(polioclicked);
            
           
            
            if (this.getImage() == polioclicked) {
                
                if (!getWorld().getObjects(PatientZero.class).isEmpty()) {
                    for (PatientZero p : getWorld().getObjects(PatientZero.class)) {
                        p.reset();
                        Greenfoot.delay(2);
                        p.deleteAdd();
                    }
                    
                }                 
                if (!getWorld().getObjects(Human.class).isEmpty()) {
                    for (Human h : getWorld().getObjects(Human.class)){
                        h.reset();
                        
                    }
                    
                }                
                if (!getWorld().getObjects(Ebola.class).isEmpty()) {
                    for (Ebola e : getWorld().getObjects(Ebola.class)){
                        e.setImage("ebola.png");
                    }
                    
                }
                
                if (!getWorld().getObjects(H1N1.class).isEmpty()) {
                    for (H1N1 h : getWorld().getObjects(H1N1.class)){
                        h.setImage("h1n1.png");
                    }
                    
                }                
                if (!getWorld().getObjects(Measles.class).isEmpty()) {
                    for (Measles m : getWorld().getObjects(Measles.class)){
                        m.setImage("measles.png");
                    }
                    
                }                 
            }              

        }
        
        
        
        //infection loop
        //set image after loop
        //reset stage         // Add your action code here.
    }    
}
