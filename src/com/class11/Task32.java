package com.class11;

public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//task 2
	
		String[] array= {"USA","Russia","Turkey","Spain"};
	  
		for (int i=0;i<array.length;i++) {
			if (array[i].equals("USA")) {
              System.out.println("W DC");
			}else if(array[i].equals("Russia")){
				System.out.println("Moscow");
				
			}else if(array[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if (array[i].equals("Spain")) {
				System.out.println("Madrid");
			}
		 
			
		 
	  }
	//-------------------------------------------------switch
		String[] countries= {"USA","Afghanistan","Kazakhstan","Ukraine"};
	
		for(String county:countries) {
             switch(county) {
		        case"USA":System.out.println("W DC");
		             break;
		        case"Afghanistan":
		        	System.out.println("Kabul");
		            break;    
		        case"Kazakhstan":
		        	System.out.println("Astana");
		        	break;
		        case"Ukraine":
		        	System.out.println("Kiev");
		        	break;//no need for default no empty values
		     
		     }
	}
	
	
	
	
	
	
	
	}

}
