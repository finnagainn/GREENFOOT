import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class H1N1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class H1N1 extends Actor
{
    /**
     * Act - do whatever the H1N1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage h1n1clicked = new GreenfootImage("h1n1clicked.png");
    double rNaught =  1.5;
    GreenfootImage h1n1Clicked = new GreenfootImage("h1n1clicked.png");
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            setImage(h1n1Clicked);
            if (this.getImage() == h1n1Clicked) {

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
                if (!getWorld().getObjects(PatientZero.class).isEmpty()) {
                    for (PatientZero p : getWorld().getObjects(PatientZero.class)){
                        p.reset();
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
                
                if (!getWorld().getObjects(Ebola.class).isEmpty()) {
                    for (Ebola e : getWorld().getObjects(Ebola.class)){
                        e.setImage("ebola.png");
                    }
                    
                }                
                if (!getWorld().getObjects(Polio.class).isEmpty()) {
                    for (Polio p : getWorld().getObjects(Polio.class)){
                        p.setImage("polio.png");
                    }
                    
                }                  
            }
            
            
        }
        // Add your action code here.
    }

}
