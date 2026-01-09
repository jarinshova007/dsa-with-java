// Count total paths in a maze to move from (0,0) to (n,m)
public class CountPaths {
    public static int countPaths(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }

        if (i == m - 1 && j == n - 1) { // ekhane or hbe naki and??
            return 1;
        }
        
        // move right
        int rightPaths = countPaths(i, j + 1, m, n);
        // move downwards
        int downPaths = countPaths(i + 1, j, m, n);

        return rightPaths + downPaths;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;

        int totalPaths = countPaths(0, 0, m, n);
        System.out.println(totalPaths); //6
    }
}
