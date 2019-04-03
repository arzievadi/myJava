package com.class16;

public class Phone {

	
	
	
	
//task1 
	/*create a class "Phone" 
    create 3 objects:
    iphone 
    android 
    nokia
	 * 
	 * with specific attributes and behaviors
	 *  
	 *  
	 * task
	 * /
	 * create "Dog" class and create different objects of it:
	 * husky
	 * Bulldog
	 * Labrador
	 * with specific attributes and behaviors
	 * 
	 * 
	 * 
	 *       push the code
	 */
	
	String brandName,operatingS;
	int storage,battery;
	boolean multipleWindows,wirelessCharging;
	//behaviour:watchMovie,drawPics,playMusic
	
	
	public static void main(String [] args) {
		//phone android
		Phone android=new Phone();
		android.brandName="Android";
		android.operatingS="Linux";
		android.storage=85;
		android.battery=180;
	android.multipleWindows=true;
	android.wirelessCharging=true;
	
	//behavior
	android.watchMovie();
	android.drawPics();
	android.playMusic();
	
	
	
	//phone iphone
	
	Phone iphone=new Phone();
	iphone.brandName="Iphone";
	iphone.operatingS="IOS";
	iphone.storage=75;
	iphone.battery=190;
    iphone.multipleWindows=false;
    iphone.wirelessCharging=false;
	
  //behavior
  	iphone.watchMovie();
  	iphone.drawPics();
  	iphone.playMusic();
  	
	//phonenokia
	
	Phone nokia=new Phone();
	iphone.brandName="Nokia";
	iphone.operatingS="Asha";
	iphone.storage=65;
	iphone.battery=160;
    iphone.multipleWindows=false;
    iphone.wirelessCharging=false;
	
  //behavior
  	nokia.watchMovie();
  	nokia.drawPics();
    nokia.playMusic();
  	
	
	
	
	}
	
void watchMovie() {
	System.out.println("we can watch movie on phone "+brandName);
}	
	void drawPics() {
		System.out.println("we can draw pics on "+brandName);
	}
	void playMusic() {
		System.out.println("we can play music "+brandName);
	}
}
