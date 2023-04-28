package payilagam.homeWork;

public class home_work4 {
    void hw1() {
        System.err.println("Given an array of N integers, and a number sum, the task is to find the number of pairs of integers in the array whose sum is equal to sum.");
        int[] arrNumbers = {1, 5, 7, -1};
        int sum = 6;
        for (int times = 0; times < arrNumbers.length; times++) {
            for (int clock = times + 1; clock < arrNumbers.length; clock++) {
                if ((arrNumbers[times] + arrNumbers[clock]) == sum) {
                    System.out.println(arrNumbers[times] + " " + arrNumbers[clock]);
                }
            }
        }
    }

    void hw2() {
        System.err.println("Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.");
        int[] missingNumber = {1, 2, 4, 6, 3, 7, 8};
        int totalMissingNumbers = 0;
        int asciiCount = 1;
        int totalNumbers = 0;
        for (int times = 0; times <= 7; times++) {
            if (times < 7) {
                totalMissingNumbers = totalMissingNumbers + missingNumber[times];
            }
            totalNumbers = totalNumbers + asciiCount;
            asciiCount++;
        }
        System.out.println(totalNumbers - totalMissingNumbers);
    }

    void hw3() {
        System.err.println("Given an array of integers arr[], The task is to find the index of first repeating element in it i.e. the element that occurs more than once and whose index of the first occurrence is the smallest. ");
        int[] firstOccurrence = {10, 5, 3, 4, 3, 5, 6};
        abc:
        for (int times = 0; times < firstOccurrence.length; times++) {
            for (int clock = times + 1; clock < firstOccurrence.length; clock++) {
                if (firstOccurrence[times] == firstOccurrence[clock]) {
                    System.out.println(firstOccurrence[times] + " " + "index is = " + "" + times);
                    break abc;
                }
            }
        }
    }

    void hw4() {
        System.err.println("Given an array of integers of size N, the task is to find the first non-repeating element in this array. ");
        int[] nonRepeat = {9, 4, 9, 6, 7, 4};
        int duplicate = 0;

        for (int times = 0; times < nonRepeat.length; times++) {
            for (int clock = times + 1; clock < nonRepeat.length; clock++) {
                if (nonRepeat[times] == nonRepeat[clock]) {
                    nonRepeat[clock] = 0;
                    duplicate = nonRepeat[times];
                }
            }
            if (duplicate != nonRepeat[times]) {
                System.out.println(nonRepeat[times]);
                break;
            }
        }
    }

    void hw5() {
        System.err.println("Split an array into two - one to store odd numbers and another to store even numbers");
        int split[] = {4, 2, 7, 9, 8, 11, 1, 5};
        int oddArrCount = 0, evenArrCount = 0, oddCount = 0, evenCount = 0;
        for (int times = 0; times < split.length; times++) {
            if (split[times] % 2 == 0) {
                evenArrCount++;
            } else {
                oddArrCount++;
            }
        }
        int odd[] = new int[oddArrCount];
        int even[] = new int[evenArrCount];
        for (int clock = 0; clock < split.length; clock++) {

            if (split[clock] % 2 == 0) {
                even[evenCount] = split[clock];
                evenCount++;
            } else {
                odd[oddCount] = split[clock];
                oddCount++;
            }
        }
        System.out.print("odd numbers are = ");
        for (int allOdd : odd) {
            System.out.print(allOdd + " ");
        }
        System.out.println();
        System.out.print("even numbers are = ");
        for (int allEven : even) {
            System.out.print(allEven + " ");
        }
    }
}
