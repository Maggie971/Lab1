public class l11 {
    public static void main(String[] args) {
        // Initiate arrays x and y
        int[] x = {3, 6, 9, 12, 15};
        int[] y = {5, 10, 15, 20, 25};

        // Calculate array z
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Output arrays
        System.out.print("Array x = {");
        printArray(x);
        System.out.print("}\n");

        System.out.print("Array y = {");
        printArray(y);
        System.out.print("}\n");

        System.out.print("Array z = x + y = {");
        printArray(z);
        System.out.print("}\n");
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}