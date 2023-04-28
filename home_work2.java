package payilagam.homeWork;

public class home_work2 {
    void M1() {
        System.err.println("Try to print every 3rd character in this given string");
        String print = "Laziness pays of overnight however hard work pays off throughout your life";
        for (int times = 2; times < print.length(); times = times + 3) {
            System.out.println(print.charAt(times));
        }
    }

    void M2() {
        System.err.println("Count number of punctuation used in this given string");
        String punctuation = "Successful people are not gifted; they just work-hard, then succeed on purpose.";
        int punctuationCount = 0;
        for (int times = 0; times < punctuation.length(); times++) {
            int allChar = punctuation.charAt(times);
            if (allChar >= 33 && allChar <= 47 || allChar >= 58 && allChar <= 64 || allChar >= 91 && allChar <= 96 || allChar >= 123 && allChar <= 126) {
                punctuationCount++;
            }
        }
        System.out.println(punctuationCount);
    }

    void M3() {
        System.err.println("Program to find second maximum element in an array");
        int arr[] = {22, 44, 212, 78, 11, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}
