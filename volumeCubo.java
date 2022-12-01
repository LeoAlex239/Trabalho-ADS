 import java.util.Scanner;

public class volumeCubo {
  public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		
		Scanner scanner = new Scanner(System.in);
		
	
		double N1, N2;
	
				System.out.print("Digite o valor: ");
			N1 = scanner.nextDouble();
		
			N2 = 3;

      System.out.println(calculadora.expo(N1, N2));
				scanner.close();
        
			}
			
			
      }
  

