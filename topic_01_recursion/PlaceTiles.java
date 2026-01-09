//Count total number ways to place tiles of size 1 * m in a floor of size n * m
public class PlaceTiles {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1; // horizontally only
        }

        // vertically
        int vertPlacement = placeTiles(n - m, m);
        // horizontally
        int horPlacement = placeTiles(n - 1, m);

        return vertPlacement + horPlacement;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 2;

        // method call
        int totalNumOfWays = placeTiles(n, m);
        System.out.println(totalNumOfWays); // 5
    }
}
