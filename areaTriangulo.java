import java.util.Scanner;

public class areaTriangulo {
  public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		
		Scanner scanner = new Scanner(System.in);
		
	
		double N1, N2;
	
				System.out.print("Digite o valor da base: ");
			N1 = scanner.nextDouble();
			
			System.out.print("Digite o valor da altura: ");
			N2 = scanner.nextDouble();

				System.out.println(calculadora.multi(N1, N2)/2);
				scanner.close();
        
			}
			
			
      }
      
			
	
    