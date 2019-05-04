class SwitchDemo{
  
  //switch - Condition, cases, break, default.
  
  public static void main(String args[]){
	if(Integer.parseInt(args[0]) == 10 ){
            System.out.println("Value enetered is equal to 10");
        }else if(Integer.parseInt(args[0]) == 20){
		    System.out.println("Value enetered is  equal to 20");
		}else if(Integer.parseInt(args[0]) == 30){
		    System.out.println("Value enetered is  equal to 30");
		}else{
			System.out.println("Value enetered is greater than 30 not cought in any condition");
		}
		
		switch(Integer.parseInt(args[0])){
			case 10: 
			 System.out.println("Value enetered is equal to 10");
			 break;
			case 20:
			 System.out.println("Value enetered is  equal to 20");
			 break;
			case 30:
			 System.out.println("Value enetered is  equal to 30"); 
			 break;
			default:
			  System.out.println("Value enetered is greater than 30 not cought in any condition");
			  break;
		}	
  } 
}