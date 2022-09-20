public class Contagem {

    public static void main(String[] args) {
        Scanner leitor;
        leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade notas: ");
        int n = dado.nextInt();
        int nota;
        int contador = 0;
        int i = 0;

        while (i < n) {
            System.out.print("Informe uma nota: ");
            nota = dado.nextInt();

            if (nota >= 50) {
                contador = contador + 1;
            }

            i = i + 1;
        }

        System.out.println("Número de alunos que passaram no exame: " + contador);
    }

}
