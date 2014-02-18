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
		
		/*public static int max(int[] i){
			if(i != null && i.length >0){
				int max=0;
				for(int j=0; j < i.length; j++){
					if(max<i[j]){
						max = i[j];
					}
				}
				return max;
			}
		}*/
	}

}
