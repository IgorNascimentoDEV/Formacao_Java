package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "ORACLE";
		
		String vazio = " ";
		String vazioSemEspaco = vazio.trim();//tira os espaços
		
		//System.out.println(vazioSemEspaco.isEmpty());
		
		//char c = nome.charAt(1);
		
		//String outra = nome.replace("A", "a");
		
		//String outra = nome.toLowerCase();
		
		//int pos = nome.indexOf("CL");
		
		//String sub = nome.substring(1);
		
		//for(int i = 0; i < nome.length(); i++) {
		//	System.out.println(nome.charAt(i));
		//}
		
//		System.out.println(nome);
//		System.out.println(outra);
//		System.out.println(c);
//		System.out.println(pos);
//		System.out.println(sub);
//		System.out.println(nome.length());
		System.out.println(nome.contains("ORA"));
	}

}
