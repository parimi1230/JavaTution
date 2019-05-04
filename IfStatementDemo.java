public class IfStatementDemo {

    public static void main(String[] args) {

        // < - less than
        // > - greater than
        // == - equals
        // <= - less than or equal to
        // >= - greater than or equal to
        if(Integer.parseInt(args[0]) == 10 ){
            System.out.println("Value enetered is equal to 10");
        }else if(Integer.parseInt(args[0]) == 20){
		    System.out.println("Value enetered is  equal to 20");
		}else if(Integer.parseInt(args[0]) == 30){
		    System.out.println("Value enetered is  equal to 30");
		}else{
			System.out.println("Value enetered is greater than 30 not cought in any condition");
		}
		
		if(Integer.parseInt(args[0]) <= 10){
			if(Integer.parseInt(args[0]) <=5){
				System.out.println("Value enetered is  less than equal to 5");
			}else if(Integer.parseInt(args[0]) >=5){
				System.out.println("Value enetered is  less than equal to 30");
			}
		}
		

    }

}