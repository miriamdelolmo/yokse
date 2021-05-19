import java.util.Scanner;
public class Codigo {
	public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
	       
		String nombre, profesion, sexo, DNI;
		int edad, salario, peso, altura;


	        for(int i=1;i<=3;i++) {
		        System.out.println("¿Cuál es tu nombre?");
		        	nombre= sc.nextLine();
		        	
		        System.out.println("¿Cuál es tu DNI?");
		        	DNI=sc.nextLine();
		        	
		        System.out.println("¿Cuál es tu edad?");
		        	edad= sc.nextInt();
		        	
			    System.out.println("¿Cuál es tu sexo? (M) (H)");
			        sexo= sc.next();
			        	
		        System.out.println("¿Cuál es tu peso?");
		        	peso= sc.nextInt();
		        	
		        System.out.println("¿Cuál es tu altura?");
		        	altura= sc.nextInt();
		        	
		        System.out.println("¿Cuál es tu salario?");
		        	salario=sc.nextInt();
		        	
		        System.out.println("¿Cuál es tu profesión?");
		        	profesion=sc.nextLine();
		        


	        Persona persona = new Persona(nombre, edad, DNI, sexo, profesion, salario, peso, altura);
	        	
	        	System.out.println(persona.toString());
	        	
	        persona.calcularIMC(peso, altura);
	        persona.esMayorDeEdad(edad);
	        persona.esMileurista(salario);


	        }

	    }

}
