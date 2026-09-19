class Question8_DuplicateIntegerArray {
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = ConsoleInput.getInt();
        }

        System.out.println("Duplicate values:");

        for (int i = 0; i < size; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}

