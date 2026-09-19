class Question10_CommonElements {
    public static void main(String[] args) {
        System.out.println("Enter size of first array:");
        int size1 = ConsoleInput.getInt();

        int[] arr1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.println("Enter element of first array " + (i + 1) + ":");
            arr1[i] = ConsoleInput.getInt();
        }

        System.out.println("Enter size of second array:");
        int size2 = ConsoleInput.getInt();

        int[] arr2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.println("Enter element of second array " + (i + 1) + ":");
            arr2[i] = ConsoleInput.getInt();
        }

        System.out.println("Common elements:");

        for (int i = 0; i < size1; i++) {
            boolean found = false;
            boolean alreadyPrinted = false;

            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (found && !alreadyPrinted) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
