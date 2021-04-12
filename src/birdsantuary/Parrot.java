package birdsantuary;

public  class Parrot extends Bird implements Flyable {
       public static int Count;
	
		public void eat() {
		System.out.println("parrot can eating");
		
	}
	
	   public void fly() {
		System.out.println("parrot can flying");
	}

	@Override
	public void Fly() {
	}
		
		public int getCount() {
			return Count;
		}
			
		public void incrementCount() {
			Count ++;
			
		}
		public void decrementCount() {	
			Count --;
		}
		
	}

	  