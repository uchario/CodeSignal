package stringsrearrangement;

public class Main {
    public static void main(String[] args) {
        String[] inputArray = {"ab", "bb", "aa"};
        System.out.println(dcole(inputArray));
    }

    public static boolean stringsRearrangement(String[] inputArray) {
        return false;
    }

    public static boolean dcole(String[] inputArray) {
        boolean[] used = new boolean[inputArray.length];
        findSequence(inputArray, null, used, 0);
        return success;
    }

    public static boolean success = false; // modified by findSequence

    // recursive backtracking procedure to find admissible
// sequence of strings in the array. String prev is the
// previous string in the sequence, used[] keeps track
// of which strings have been used so far, and n is the
// current length of the sequence.
    public static void findSequence(String[] a, String prev, boolean[] used, int n) {
        if (n == a.length) {
            success = true;
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!used[i] && (prev == null || differByOne(prev, a[i]))) {
                used[i] = true;
                findSequence(a, a[i], used, n+1);
                used[i] = false;
            }
        }
    }

    public static boolean differByOne(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }

    public static boolean thucnguyen(String[] a) {
        int n = a.length;
        //boolean [][] matrix = new matrix[n][n];

        int [] degree = new int[n];

        // check if this graph has Hamiltonian path
        // based on theorem: A simple graph with n vertices (n >= 3) is Hamiltonian if every vertex has degree n / 2 or greater
        // and theorem: A graph is Hamiltonian if and only if its closure is Hamiltonian
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (diffByOneChar(a[i], a[j]))
                    degree[i] ++;
            }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (!diffByOneChar(a[i], a[j]) && degree[i] + degree[j] >= n) {
                    degree[i] ++;
                    degree[j] ++;
                }
            }


        for (int d : degree)
            if (d<n/2) return false;

        return true;
    }

    public static boolean diffByOneChar(String s1, String s2) {
        int count = 0;

        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) count ++;

        return count == 1;
    }
}
