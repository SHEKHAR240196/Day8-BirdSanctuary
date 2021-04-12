package birdsantuary;

public  class Duck extends Bird implements Flyable,Swimmable {
	  public static int Count;
	
	 public void swim() {
		 System.out.println("duck can swimming");
	}
	
	public void eat() {
		System.out.println("duck can eating");
	}
	
	public void fly() {
		System.out.println("duck can flyimg");
	}

	@Override
	public void Swim() {
		
	}

	@Override
	public void Fly() {
	}
		public int getcount() {
			return Count;
		}
		public int incrementcount() {
			return Count+=1;
			
		}
		
	  public int decrement() {
			return Count--;
		}

	@Override
	public int getCount() {
				return 0;
	}

	@Override
	public void incrementCount() {
				
	}

	@Override
	public void decrementCount() {
				
	}
 }

