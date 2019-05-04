class Dog{
  
  private int legs = 4;
  private String tail = "stright";
  
  public void doBark(){
	System.out.println("Barks");
  }
  
  public void swingTail(){
	System.out.println("swingTail");
  }
  
  public int sum(int a, int b){
	return a + b;
  }	 

public int substract(int a, int b){
	return a - b;
  }	  
   
}

class MyTest{
 public static void main(String args[]){
	
	Dog dog = new Dog();
	System.out.println(dog.legs);
	System.out.println(dog.tail);
	dog.doBark();
	dog.swingTail();	
	System.out.println("Sum here a and b is"+ dog.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	System.out.println("substract here a and b is"+ dog.substract(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	System.out.println("Test here");
 }
}

