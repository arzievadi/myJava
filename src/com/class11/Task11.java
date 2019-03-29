package com.class11;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*1.Create an array of cars : american, 
	 *                           german, 
	 *                           korean, 
	 *                           italian. 
	 * //Then retrieve all values from that array

      2.  Create an array of countries: north america countries, 
                                      south america countries,
                                       europe countries, 
                                       asian countries,
                                        african countries. 
       //Then print all values from that array.
	 * /
	 */
	
	String[][] Cars= {
			{"ford","chevrolet","chrysler","cadillac","jeep"},
			{"audi","bmw","mercedes","opel","porsche","volkswagen"},
			{"hyundai","kia","daewoo"},
			{"ferrari","fiat","lamborghini","maserati"}
			
	};
	for (int i=0;i<Cars.length;i++) {
		for (int j=0;j<Cars[i].length;j++) {
			System.out.println(Cars[i][j]+  " ");
		}
	System.out.println();
	}
	
	
	String[][] countries= {
			{"Bahamas","Barbados","Canada","Costa Rica"},
			{"Argentina","Ecuador","Colombia","Venezuela","Colombia","Peru"},
			{"Russia","Germany","Italy","France","Ukraine","Poland"},
			{"China","Turkey","Pakistan","Iran"},
			{"Algeria","Angola","Chad"}
	};
	
	
	for(int a=0;a<countries.length;a++) {
		for(int b=0;b<countries[a].length;b++) {
			System.out.print(countries[a][b]+"  ");
		}
	System.out.println();
	}
	
	
	
	}

}
