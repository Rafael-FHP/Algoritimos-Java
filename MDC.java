import java.util.Scanner;

public class MDC {
   
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int A,B,mdc,maior;
       
        mdc=1;
       
        System.out.printf("MAXIMO DIVISOR COMUM DE A e B\n\n");
       
          System.out.printf(" A..: \n");
          A = leitor.nextInt();
    
          System.out.printf(" B..: \n");
          B = leitor.nextInt();
    
          System.out.printf("\n\n");
         
          maior=A;
           if (A>B) maior=A;
           if (B>A) maior=B;
         
          System.out.printf(" MDC (%d,%d): ",A,B);
         
            for(int i=2; i<=maior;++i){
                while ((A % i==0)&&(B % i==0)){
                    A=A/i;
                    B=B/i;
                    mdc=mdc*i;
                }
            }
          System.out.printf("%d\n",mdc);
    }  
}
