package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuente;

public class Progam {

	

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		List<Contribuente> list = new ArrayList<>();
		
		System.out.print("Digite o CPF do contribuente: ");
	    Integer cpf = sc.nextInt();
		 
	    System.out.print("Nome do contribuente: ");
	    String name = sc.next();
	    
	    System.out.print("Numero de dependentes: ");
	    int nuberContriuente = sc.nextInt();
	    
	    for (int i=0; i<nuberContriuente; i++) {
	    	System.out.print("Nome: ");
	    	name = sc.next();
	    	
	    	
	    	System.out.print("Salario desse contribuente: ");
            double salary = sc.nextDouble();   
            System.out.println();
	    	
	    	Contribuente cont = new Contribuente(cpf, name, nuberContriuente, salary);
	    	
	    	list.add(cont);
	    	
	    }
	    
	    System.out.print("Qual o valor do salario minimo? : ");
	    
	    
		
		
		

		
		sc.close();
	}

}
