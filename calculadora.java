import java.util.Scanner;
public class calculadora {
        
 Scanner scan = new Scanner(System.in);
    public double soma( double N1, double N2) {
		return N1 + N2;
	}
	
	public double sub(double N1, double N2) {
		return N1 - N2;
	}
	
	public double div(double N1, double N2) {
		return N1 / N2;
	}
	
	public double multi(double N1, double N2) {
		return N1 * N2;
    }
    
    public double expo(double N1, double N2){
        return Math.pow( N1, N2);
    }    
    
    public double raiz(double N1){
        return Math.sqrt(N1);
    }
    public double teto(double N1){
        return Math.ceil(N1);
    }
    public double piso(double N1){
        return Math.floor(N1);
    }
}
