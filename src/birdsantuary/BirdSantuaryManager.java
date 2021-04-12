package birdsantuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSantuaryManager {
	
     List<Bird> birdList = new ArrayList<Bird>();
	
	public void add(Bird bird) {
	     birdList.add(bird);
	     bird.incrementCount();
	} 
	
	public void remove(Bird bird) {
		birdList.add(bird);
		bird.decrementCount();
		
	}
	
	public void printEatingBirds() {
    		for (Bird bird: birdList) {
    			bird.eat();
    		}
	}
    
	public void printFlayableBirds() {
        	for (Bird bird: birdList) {
        		if(bird instanceof Flyable) {
        			((Flyable)bird).Fly();
        	}
    }
}
   
	public void printSwimableBirds() {
            for (Bird bird: birdList) {
            	if(bird instanceof Swimmable) {
            		((Swimmable)bird).Swim();
            	}
            }
            	   	
            
	}

}
