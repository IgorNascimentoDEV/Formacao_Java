package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {
	
		int[] idade = new int[50];
	
		for(int i = 0; i <= 49; i++) {
			idade[i] = i;
			
		}
		
		   for(int item : idade){
			   if(item %2==0) {
					System.out.println(item);				
				}
	         
	        }
		
		
		System.out.println(idade.length);
	}

}
