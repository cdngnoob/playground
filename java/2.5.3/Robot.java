class Robot {
	
	void identifyIP(){
	    Email email = new Email();
	    String[][] array = email.ipaddress;
	    
	    // Schreibe hier deine Lösung
	    for (int i = 0; i < array.length; i++){
    	    for (int k = 0; k < array.length; k++){
    	        System.out.print(array[i][k]);
    	    }
    	    
    	    //System.out.println();
	    }
	}
}
