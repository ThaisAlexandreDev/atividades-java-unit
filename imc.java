import java.util.Scanner;
public class imc {
    public static void main (String[]args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("======DADOS======");
        
        System.out.println("\nInforme Peso= ");
        float peso = input.nextFloat();
        System.out.println("Informe altura= ");
        float altura = input.nextFloat();
        
        final float alturaTotal = (altura*altura);
        float resultado = (peso/alturaTotal);
        
        if (resultado >=30) {
            System.out.println("Consule um endocrinologista");
            
        }
        input.close();
    }
    
}