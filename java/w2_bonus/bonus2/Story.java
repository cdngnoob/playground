public class Story {
	
	public static void main(String[] args){
		
		// Bitte lass diese Zeile so wie sie ist
		// reversedArray beinhaltet die Wörter in umgekehrter Reihenfolge
		String[] reversedArray = HiddenArray.getArray();
		
		// Schreibe ab hier deine Lösung
		for (int i = reversedArray.length - 1; i >= 0; i--) {
			System.out.print(reversedArray[i] + " ");
			
		}
		
	}


}
