//INSTRUÇOES
//Criança, se a idade for até 9 anos.
//Adolescente, se a idade for de 10 aos 15 anos
//Jovem, se a idade for de 16 aos 25 anos
//Adulto, se a idade for de 25 aos 59 anos
//Idoso, se a idade for a partir de 60 anos

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====VERFICACAO FAIXA ETARIA=====");
		
//ENTRADA		
		System.out.println("INSIRA A IDADE");
		int idade = input.nextInt();
		
//POSSIVEIS SAIDAS		
		if (idade <=9) {
		    System.out.println("CRIANÇA");
		}
		else if (idade >= 10 && idade <=15) {
		    System.out.println("ADOLESCENTE");
		}
		else if (idade >=16 && idade<=25) {
		    System.out.println("JOVEM");
		}
		else if (idade>=26 && idade<=59) {
		    System.out.println("ADULTO");
		}
		else if (idade>=60){
		    System.out.println("IDOSO");
		}
		else {
		}
	input.close();
	}
}
