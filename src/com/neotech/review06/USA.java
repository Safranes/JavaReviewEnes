package com.neotech.review06;

public class USA {
	// Access modifiers, we define where these variables can be accessed from
		private String capitalCity = "Washington DC";
		protected String mainState = "New York";
		String normalState = "California";
		public String bestSchool = "Neotech";

		private void selectPresident() {
			System.out.println("Selecting the president only withing USA");
		}
		
		protected void playNBA() {
			System.out.println("There US and Canada teams in NBA");
		}
		
		public  void speakEnglish() {
			System.out.println("English can be spoken everywhere");
		}

		public static void main(String[] args) {
			USA us = new USA();

			System.out.println("Accessing the variables from inside the USA");
			System.out.println("private -> " + us.capitalCity);
			System.out.println("protected -> " + us.mainState);
			System.out.println("default -> " + us.normalState);
			System.out.println("public -> " + us.bestSchool);

			System.out.println();
			
			System.out.println("Accessing the methods from inside the USA");
			us.selectPresident();
			us.playNBA();
			us.speakEnglish();
		}

	}


