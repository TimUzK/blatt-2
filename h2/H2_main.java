public class H2_main {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int k = 15;
        int min = 1;
        int max = 100;

        min = i;
        max = i;

        if (j < i && j < k) {
            min = j;
        }

        if (k < i && k < j) {
            min = k;
        }

        if (j > i && j > k) {
            max = j;
        }

        if (k > i && k > j) {
            max = k;
        }

    }
}
