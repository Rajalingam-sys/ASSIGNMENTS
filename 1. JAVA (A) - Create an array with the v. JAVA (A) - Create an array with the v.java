import java.util.Random;

public class ArrayShuffler {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Custom shuffle method (without shuffle algorithm or collections)
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int j = i + random.nextInt(n - i); // Generate a random index between i and n-1

            // Swap elements at i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
