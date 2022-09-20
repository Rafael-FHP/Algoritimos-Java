import java.util.Scanner;

public class Somatorio{
	public static void main(String[] args){
	Scanner leitor = new Scanner(System.in);
	System.out.println("Quantidade de números?")
	int n = leitor.nextInt();
  int num;
  int soma = leitor.nextInt();
  int i = leitor.nextInt();
while(i<n){
	i=i+1;
	System.out.println("Número " + (i) + " :");
	num = leitor.nextInt();
	soma = soma + num;
}
  System.out.println("A soma de " + n + " números é " + soma);
    }
}
