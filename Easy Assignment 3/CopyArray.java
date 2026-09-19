class Question5_CopyArray {
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];
        int[] copy = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = ConsoleInput.getInt();
        }

        for (int i = 0; i < size; i++) {
            copy[i] = arr[i];
        }

        System.out.println("Copied array:");

        for (int i = 0; i < size; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
