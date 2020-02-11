import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ebola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ebola extends Actor
{
    /**
     * Act - do whatever the Ebola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        GreenfootImage ebolaclicked = new GreenfootImage("ebolaclicked.png");

    
        if (Greenfoot.mouseClicked(this)) {
            setImage(ebolaclicked);
 
            if (this.getImage() == ebolaclicked) {
                
                if (!getWorld().getObjects(PatientZero.class).isEmpty()) {
                    for (PatientZero p : getWorld().getObjects(PatientZero.class)){
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
                if (!getWorld().getObjects(Measles.class).isEmpty()) {
                    for (Measles m : getWorld().getObjects(Measles.class)){
                        m.setImage("measles.png");
                    }
                    
                }
                
                if (!getWorld().getObjects(H1N1.class).isEmpty()) {
                    for (H1N1 h : getWorld().getObjects(H1N1.class)){
                        h.setImage("h1n1.png");
                    }
                    
                }                
                if (!getWorld().getObjects(Polio.class).isEmpty()) {
                    for (Polio p : getWorld().getObjects(Polio.class)){
                        p.setImage("polio.png");
                    }
                    
                }                  
            }            
        }// Add your action code here.
    }    
}
