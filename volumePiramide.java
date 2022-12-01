import java.util.Scanner;

public class volumePiramide {
  public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		
		Scanner scanner = new Scanner(System.in);
		
	
		double N1, N2, N3;
	
				System.out.print("Digite o valor do lado da base : ");
			N1 = scanner.nextDouble();
			
			System.out.print("Digite o valor da altura: ");
			N2 = scanner.nextDouble();

      N3 = 2;

				System.out.println(calculadora.expo(N1, N3)*N2/3);
				scanner.close();
        
			}
			
			
      }
      
			
	
    