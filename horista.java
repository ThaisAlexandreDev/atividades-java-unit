//receber horas trabalhadar
//mostrar salário
//informar se trabalhou 0 horas, encerrar programa


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double valorHora = 50.00;
		
		System.out.println("INFORME HORAS TRABALHADAS: ");
		double horasTrabalhadas = input.nextDouble();
		
		double valorSalario = (valorHora*horasTrabalhadas);
		
		if (valorSalario != 0) {
		    System.out.printf("Salário: R$ %.2f" , valorSalario);
		}
		else {
		    
		}
		input.close();
	}
}
