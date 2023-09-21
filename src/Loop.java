import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual sua nota para o filme: ");
            nota = read.nextDouble();
            media += nota;
        }

        System.out.println("Média de notas: " + media/3);

    }
}
