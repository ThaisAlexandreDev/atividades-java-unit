import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de dias que serão locados..:");
        double diasLocados = input.nextDouble();
        System.out.println("Insira o valor padrão de locação...............:");
        double valorPadrao = input.nextDouble();
        
        double valorLocacao = calcularValorLocacao(diasLocados,valorPadrao);
        double valorCustoTotal = calcularValorDiariaPeloPeriodo(diasLocados,valorPadrao);
        double valorDesconto = calcularValorDesconto(valorCustoTotal,valorLocacao);
        
        
        System.out.println("-------------------------------------------------");
		System.out.println("Valor da diária para o período......: R$" + valorLocacao);
        System.out.println("Valor do custo total................: R$" + valorCustoTotal);
        System.out.println("Valor do desconto...................: R$" + valorDesconto);
		

	}
	
	
	public static double calcularValorDiariaPeloPeriodo (double diasLocados, double valorLocacao) {
	    return diasLocados * valorLocacao;
	}
	
	public static double calcularValorLocacao (double diasLocados, double valorLocacao) {
	    final double DESCONTO_11_A_20_DIAS = 0.9; //DESCONTO DE 10%
	    final double DESCONTO_ACIMA_20_DIAS = 0.8; //DESCONTO DE 20%
	    
	    if (diasLocados>=11 && diasLocados<=20){
	        return (valorLocacao*diasLocados) * DESCONTO_11_A_20_DIAS;
	    }
	    else if (diasLocados>20) {
	        return (valorLocacao*diasLocados) * DESCONTO_ACIMA_20_DIAS;
	    }
	    return valorLocacao;
	}
	
	public static double calcularValorDesconto (double valorLocacao, double valorTotal){
	    return valorLocacao - valorTotal;
	}
	
}
