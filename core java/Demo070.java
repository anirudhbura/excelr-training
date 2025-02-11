class Demo070 {
    public static void main(String[] args) {

        int[] arr = { 11, 22, 31, 46, 15, 60, 17, 36 };
        System.out.println("Prime numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);

            if (arr[i] % 2 != 0 && i % 1 == 0) {

                System.out.println(arr[i]);
            }

        }

    }
}