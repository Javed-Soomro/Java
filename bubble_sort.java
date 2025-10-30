package abc;

public class bubble_sort {
    public static void main(String[] args) {
        
        int[] d = {2, 4, 1, 5, 3};
        int n = d.length;
        int k = 0;
        
        System.out.println("Original array:");
        for (int o = 0; o < n; o++) {
            System.out.println(" " + d[o]);
        }
        
        // Bubble Sort
        while (k < n - 1) {
            for (int i = 0; i < n - k - 1; i++) {
                if (d[i] > d[i + 1]) {
                    int temp = d[i];
                    d[i] = d[i + 1];
                    d[i + 1] = temp;
                }
            }
            k++;
        }
        
        System.out.println("Sorted array:");
        for (int q = 0; q < n; q++) {
            System.out.println(" " + d[q]);
        }
    }
}
