import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[][] matriz = new int[10][3];
        int[] pioresnotas = new int[10];
        int[] alunos = new int[3];
        Random gerador = new Random();

        System.out.println();

        System.out.println("Notas das provas");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                int x = gerador.nextInt(10) + 1;
                matriz[i][j] = x;
            }
        }
        // imprimir a matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // quebra de linha
        }
        // checar as piores notas e onde estao
        int p;
        for (p = 0; p < 10; p++) {
            int s, r;
            for (r = s = 0; s < 3; s++) {
                if (matriz[p][s] < matriz[p][r]) {
                    r = s;
                }
            }
            pioresnotas[p] = r;
        }
        // contar quantos alunos tiveram a pior nota
        System.out.println();
        int i;
        for (i = 0; i < 10; i++) {
            alunos[pioresnotas[i]]++;
        }
        System.out.println("Piores notas na prova 1: " + alunos[0] + " alunos.");
        System.out.println("Piores notas na prova 2: " + alunos[1] + " alunos.");
        System.out.println("Piores notas na prova 3: " + alunos[2] + " alunos.");
    }

}