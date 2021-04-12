package birdsantuary;


public class Main {
	
    public static void main(String[] args) {
	   System.out.println("welcome to bird santuary");
	
		BirdSantuaryManager birdSantuaryManager = new BirdSantuaryManager();
		
		Duck duck = new Duck();
		Duck duck2 = new Duck();
		Parrot parrot = new Parrot();
		Pegwin pegwin = new Pegwin();
		
		birdSantuaryManager.add(duck);
		birdSantuaryManager.add(duck2);
		birdSantuaryManager.add(parrot);
		birdSantuaryManager.add(pegwin);
		
		birdSantuaryManager.remove(pegwin);
		
		
		
		birdSantuaryManager.printEatingBirds();
		birdSantuaryManager.printFlayableBirds();
		birdSantuaryManager.printSwimableBirds();
		
		System.out.println("Duck count : "+ Duck.Count);
		System.out.println("Parrot count : "+ Parrot.Count);
		System.out.println("Pegwin count : "+ Pegwin.Count);
 }

}
