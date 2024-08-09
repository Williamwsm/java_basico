package matriz;

public class MatrizDiagonalZigzag {

    // Função para criar uma matriz quadrada de tamanho n x n e preenchê-la com valores sequenciais
    public static int[][] criarMatrizQuadrada(int n) {
        int[][] matriz = new int[n][n];
        int valor = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valor++;
            }
        }
        return matriz;
    }

    // Função para percorrer a matriz em ordem diagonal zigzag
    public static int[] percorrerDiagonalZigzag(int[][] matriz) {
        int n = matriz.length;
        int[] zigzag = new int[n * n];
        int index = 0;

        // Percorrer a matriz em ordem diagonal zigzag
        for (int d = 0; d < 2 * n - 1; d++) {
            if (d % 2 == 0) { // Se a diagonal for par, percorre de cima para baixo
                int i = Math.min(d, n - 1);
                int j = d - i;
                while (i >= 0 && j < n) {
                    zigzag[index++] = matriz[i][j];
                    i--;
                    j++;
                }
            } else { // Se a diagonal for ímpar, percorre de baixo para cima
                int j = Math.min(d, n - 1);
                int i = d - j;
                while (j >= 0 && i < n) {
                    zigzag[index++] = matriz[i][j];
                    i++;
                    j--;
                }
            }
        }

        return zigzag;
    }

    // Método principal para testar as funções
    public static void main(String[] args) {
        int tamanho = 5; // Tamanho da matriz 5x5
        int[][] matriz = criarMatrizQuadrada(tamanho);

        // Exibir a matriz gerada
        System.out.println("Matriz Gerada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Percorrer a matriz na ordem diagonal zigzag e exibir os resultados
        int[] zigzag = percorrerDiagonalZigzag(matriz);
        System.out.println("Elementos percorridos na ordem diagonal zigzag:");
        for (int valor : zigzag) {
            System.out.print(valor + " ");
        }
    }
}
