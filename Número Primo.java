import java.util.Scanner;

public class Primo {
 
  public static void main(String[] args){
    
	Scanner leitor = new Scanner(System.in);    
        
	int N = leitor.nextInt();
        
	int X; 
        
	int cont;
        
	for (var i = 0; i < N; i++) {
        	
	cont = 0;
        	
	X = leitor.nextInt();
        	
		for (var j = 2; j < X; j++) {
        		
			if (X % j == 0) 
        		
				cont++;
			}

        
	if (cont == 0)
        
	System.out.println(X + " é primo/ ");
        
	else
        
	System.out.println(X + " nao é primo/ ");

		}
 
    
	}
 

}
