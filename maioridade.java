import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("===VERIFICAR VOTO OBRIGATORIO===");
		
		System.out.println("\nInsira a idade");
		double idadeUsuario = input.nextDouble();
		
		if (idadeUsuario >= 18 && idadeUsuario <= 69){
		    System.out.println("VOTO OBRIGATORIO");
		}
		else {
		    
		}
		input.close();
	}
}
