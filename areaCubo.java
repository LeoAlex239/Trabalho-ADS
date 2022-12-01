import java.util.Scanner;

public class areaCubo {
  public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		
		Scanner scanner = new Scanner(System.in);
		
	
		double N1, N2;
	
				System.out.print("Digite o valor: ");
			N1 = scanner.nextDouble();
		
			N2 = N1;

				System.out.println(calculadora.multi(N1, N2)*6);
				scanner.close();
        
			}
			
			
      }
  
		
		
	



