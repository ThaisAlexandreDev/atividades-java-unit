//valor do odometro
//0,8litros por km rodado
//cronometro dividido por 60 pra ficar em horas
//tempo que ele percorreu 
//distancia percorrida, velocidade media, consumo em litros, valor do consumo
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    final float valorCombust = 6.59f;
	    final float consumoKmOnibus = 0.8f;

	    System.out.println("==".repeat(4) + "INFORMAÇAO DA VIAGEM" + "==".repeat(4));
	    
	    //ENTRADAS
	    
	    System.out.print("\nInsira o valor inicial do odômetro: ");
	    double valorInicial = input.nextDouble();
	    System.out.print("Insira o valor final do odômetro: ");
	    double valorFinal = input.nextDouble();
	    System.out.print("Insira o tempo que foi realizada a viagem: ");
	    double tempoMinutos = input.nextDouble();
	    
	    //PROCESSAMENTO
	    
	    double tempoEmHoras = tempoMinutos/60;
	    double distanciaTotal = (valorFinal - valorInicial);
	    double velocidadeMedia = (distanciaTotal/tempoEmHoras);
	    double consumoTotal = (distanciaTotal*consumoKmOnibus);
	    double valorConsumo = (consumoTotal*valorCombust);
	    
	    //SAIDA
	    
	    System.out.println("==".repeat(4) + "CONCLUSAO DA VIAGEM" + "==".repeat(4));
	    
	    System.out.printf("\nKm percorrido: %.1f Km/h", distanciaTotal);
	    System.out.printf("\nVelocidade Media: %.1f Km/h", velocidadeMedia);
	    System.out.printf("\nConsumo em Litros: %.1fL", consumoTotal);
	    System.out.printf("\nValor do consumo: R$%.2f ", valorConsumo);
	    
	}

}
	    
	    
	    
	   