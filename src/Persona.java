import java.util.Scanner;
public class Persona {

		String nombre, DNI, profesion, sexo;
		int edad, salario, peso, altura;
		
		public Persona(String nombre, int edad, String DNI, String sexo, String profesion, int salario, int peso, int altura) {
			this.nombre=nombre;
			this.edad=edad;
			this.DNI=DNI;
			this.sexo=sexo;
			this.profesion=profesion;
			this.salario=salario;
			this.peso=peso;
			this.altura=altura;
		}
		public static void calcularIMC(int peso, int altura) {
			int IMC, condIMC;
			
				IMC=peso/(altura*altura);
			
			if(IMC<20) {
				condIMC=-1;
				System.out.println("Estás por debajo de tu peso ideal");
			
			}else if(20<IMC && IMC<25) {
				condIMC=0;
				System.out.println("Estás en tu peso ideal");
			
			}else {
				condIMC=1;
				System.out.println("Tienes sobrepeso");
			}
		}
		public static void esMayorDeEdad(int edad) {
			boolean condEdad;
			if(edad<18) {
				System.out.println("Eres menor de edad");
					condEdad=false;
			}
		}
		public static void comprobarSexo(char sexo) {
			Scanner sc = new Scanner(System.in);
			String condSexo;
			boolean validez;
			System.out.println("Introduce el sexo (H-Hombre)-(M-Mujer)");
			condSexo=sc.next();
			if(condSexo.equals("H")) {
				validez=true;
				System.out.println(validez);
			}else if(condSexo.equals("M")) {
				validez=true;
				System.out.println(validez);
			}else {
				validez=false;
				System.out.println(validez);
			}
			
		}
		public static void esMileurista(int salario) {
			if(salario>=1000) {
				System.out.println("Eres mileurista");
			}else {
				System.out.println("No eres mileurista");
			}
		}
		
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return nombre;
		}
		

		
		public void setEdad(int edad) {
			this.edad = edad;
		}
			
		public int getEdad() {
			return edad;
		}
		

		
		public void setDNI(String DNI) {
			this.DNI = DNI;
		}
		
		public String getDNI() {
			return DNI;
		}
		

		
		
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		public String getSexo() {
			return sexo;
		}

		
		
		public void setProfesion(String profesion) {
			this.profesion = profesion;
		}
		
		public String getProfesion() {
			return profesion;
		}
		

		
		
		public void setSalario(int salario) {
			this.salario = salario;
		}
		
		public int getSalario() {
			return salario;
		}

		
		
		public void setPeso(int peso) {
			this.peso = peso;
		}
		
		public int getPeso() {
			return peso;
		}
		
		
		
		public void setAltura(int altura) {
			this.altura = altura;
		}
		
		public int getAltura() {
			return altura;
		}
		

		
		
		
		@Override
		public String toString() {
		String resultado="";
		 resultado += nombre + ", " + DNI + ", " + sexo + ", " + edad + ", " + salario + ", " + peso + ", " + altura + ", " + profesion;
		 return resultado;
		}
	}

