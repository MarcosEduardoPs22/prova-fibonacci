public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // Quantidade de números Fibonacci a serem gerados
        int[] fibonacciSequence = generateFibonacciSequence(n);

        System.out.println("Sequência de Fibonacci com " + n + " termos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }

    public static int[] generateFibonacciSequence(int n) {
        int[] sequence = new int[n];
        if (n >= 1) {
            sequence[0] = 0;
        }
        if (n >= 2) {
            sequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence;
    }
}
