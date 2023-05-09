package jp.co.aforce.test;

public class PracticeTest8 {

	
		private Object message;
		

//問１

	public void printHello() {
		System.out.println("Hello");
			
		}

	
//問２

	public void printRandomMessage() {
		
		int n = (int) (3 * Math.random());
		String aisatu = "";

		switch (n) {
		case 0:
			aisatu = "こんばんは";
			break;
		case 1:
			aisatu= "こんにちは";
			break;
		case 2:
			aisatu = "おはよう";
			break;
		}
		System.out.println(aisatu);
				
		
	}


//問３
	public void printMessage(String message) {
		
		System.out.println(message);
		
	}



//問４
		
	public void printMessage(String message, int count) {
			for(int i = 0; i < count; i ++) {
				System.out.println(message);

	}
		}


//問５

	public void printRectangleArea(double width, double height) {
		 System.out.println(width * height);
		 
		 
		
	}	
	
	
//問6
	public String getWeatherForrecast() {
		
		int x = (int) (3 * Math.random());
		int y = (int) (4 * Math.random());
		
		String date;
		switch(x) {
		case 0:
			date = "今日";
			break;
		case 1:
			date = "明日";
			break;
		default:
			date = "明後日";
		}
		
		String weather;
		switch(y) {
		case 0:
			weather = "晴れ";
			break;
		case 1:
			weather = "曇り";
			break;
		case 2:
			weather = "雨";
			break;
		default:
			weather = "雪";
		}
		return date + "の天気は" + weather + "でしょう。";
	}
	
	//練習問題７
	
	public boolean isEvenNumber(int value){
		if(value % 2 == 0) {
			return true;
		}else {
			return false;
	}

	}
	
	
	
	
//問８
	
		String getMessage(String name, boolean isKid) {
			String message = "";
			if (isKid) {
				message = "ちゃん";
			} else {
				message = "さん";
			}
			return ("こんにちは。" + name + message + "。");
	}
	
	
//問９
	
//	//	public  String getLongestString(String[] array){
//			String nekoName = null;
//			int e = array[0].length();
//		
//			for (int i = 1; i < array.length; i++) {
//				if (e < array[i].length()) {
//					e = array[i].length();
//					System.out.println(array[i]);
//					}
//				}
////			return e;
//		   
//		}
	
	
	
//問１０
	
	
	public boolean isAdult(Person person) {
		
		int age = person.getAge(); 
		return age >= 20;
	}
	
	
	}

	
	
	
	
	
	
	
	