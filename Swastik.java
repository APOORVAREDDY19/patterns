public class Swastik {
    public static void main(String[] args) {
        int n = 5; // Must be an odd number
        int mid = n / 2; // Middle index

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                
                // Top row: print * in middle and right half
                if (row == 0 && (col >= mid || col == 0)) {
                    System.out.print("*");
                }

                // Middle row: full row of *
                else if (row == mid) {
                    System.out.print("*");
                }

                // Bottom row: print * in left half and last column
                else if (row == n - 1 && (col <= mid || col == n - 1)) {
                    System.out.print("*");
                }

                // First column: from middle to bottom
                else if (col == 0 && row >= mid) {
                    System.out.print("*");
                }

                // Last column: from top to middle
                else if (col == n - 1 && row <= mid) {
                    System.out.print("*");
                }

                // Middle column: full column of *
                else if (col == mid) {
                    System.out.print("*");
                }

                // All other positions: print space
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Go to next line after each row
        }
    }
}
