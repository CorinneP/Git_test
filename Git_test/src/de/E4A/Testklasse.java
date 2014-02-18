package de.E4A;

public class Testklasse {

	public static void main(String[] args) {
		int [] zahlen = {1,2,3,4,5};
		
		//Ausgabe mit foreach
		for (int i : zahlen) {
			System.out.println(i);
		}
		
		//Ausgabe mit for
		for(int i=0; i < zahlen.length; i++){
			System.out.println(zahlen[i]);
		}
		
		//Ausgabe mit while
		int i=0;
		while(i < zahlen.length){
			System.out.println(zahlen[i]);
			i++;
		}
		
		int maximum = max(zahlen);
		int minimum = min(zahlen);
		System.out.println("Max: " + maximum+ "\nMin: " + minimum);
		
		
	}


	public static int max(int[] i){
		int max = i[0];
		for(int j = 1 ; j < i.length; j++){
			if(max < i[j]){
				max = i[j];
			}
		}
		return max;
	}

	public static int min(int[] i){
		int min = i[0];
		for(int j = 0; j < i.length; j++){
			if (min > i [j]){
				min = i [j];
			}
		}
		return min;
	}
	

	
}