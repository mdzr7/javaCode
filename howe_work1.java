package payilagam.homeWork;

public class howe_work1 {
    void Method_1() {
        System.err.println("1. How to compare two strings are same or not ?");
        String white = "same", black = "not same";
        if (white.equals(black))
            System.out.println("both are same");
        else
            System.out.println("not same");
    }

    void Method_2() {
        System.err.println("2. How to find the index of the first occurrence of a character from reverse direction without using lastIndexOf() method ?");
        char[] alpha = {'y', 'o', 'u', '=', 'a', 'r', 'e'};
        int totalChar = alpha.length - 1;
        System.out.println(alpha[totalChar] + " = is the last character " + "and " + (int) alpha[totalChar] + " = is decimal value");
    }

    void Method_3() {
        System.err.println("3. How to remove a particular character from a string?");
        String name = "I hate codhing";
        String upperName = name.toUpperCase();
        int count = 0;
        int whichCharCount = 0;
        int particularCharCount = 0;
        char whichChar = 'h';
        int whichPosition = 2;


        if (whichPosition == 0) {
            for (int particularCount = 0; particularCount < name.length(); particularCount++) {
                if ((whichChar == name.charAt(particularCount)) || (whichChar == upperName.charAt(particularCount))) {
                    particularCharCount++;
                }
            }
            char[] allChar = new char[name.length() - particularCharCount];
            for (int times = 0; times < allChar.length; times++) {

                if ((whichChar == name.charAt(count)) || (whichChar == upperName.charAt(count))) {
                    count++;
                    times = times - 1;
                    continue;
                }
                allChar[times] = name.charAt(count);
                System.out.print(allChar[times]);
                count++;
            }
        } else {
            char[] allChar1 = new char[name.length() - 1];
            for (int times = 0; times < allChar1.length; times++) {
                if ((whichChar == name.charAt(times)) || (whichChar == upperName.charAt(times))) {
                    whichCharCount++;
                    if (whichCharCount == whichPosition) {
                        count++;
                        times = times - 1;
                        continue;
                    }
                }
                allChar1[times] = name.charAt(count);
                count++;
                System.out.print(allChar1[times]);
            }

        }
    }

    void Method_4() {
        System.err.println("4. How to find individual vowels count in given string?");
        String words = "this is not suitable for me i guess";
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int times = 0; times < words.length(); times++) {
            char compare = words.charAt(times);
            if (compare == 97) a++;
            if (compare == 101) e++;
            if (compare == 105) i++;
            if (compare == 111) o++;
            if (compare == 117) u++;
        }
        System.out.println(a + " = a" + '\n' + e + " = e" + '\n' + i + " = i" + '\n' + o + " = o" + '\n' + u + " = u");
    }

    void Method_5() {
        System.err.println("5. How to reverse a String in order to check given String is palindrome or not ?");
        String palindrome = "kayak";
        char[] reverseChar = new char[palindrome.length()];
        int reverseCount = 0;
        for (int times = palindrome.length() - 1; times >= 0; times--) {
            reverseChar[reverseCount] = palindrome.charAt(times);
            reverseCount++;
        }
        String reversePalindrome = new String(reverseChar);
        System.out.println("does given string is palindrome ? "+ palindrome.equals(reversePalindrome));
    }

    void Method_6() {
        System.err.println("6. How to search a word inside a string?");
        String words = "now i'm going to search a word in this string";
        String[] splitWords = words.split(" ");
        String findWord = "search";
        for (String s : splitWords) {
            if (s.equals(findWord)) {
                System.out.println(findWord + " = this word is present");
                break;
            }
        }
    }

    void Method_7() {
        System.err.println("7. How to split a string into a number of substrings ?");
        String subString = "substring";
        int subCount = subString.length();

        for (int times = 0; times < subCount; times++) {
            for (int times1 = 0; times1 <= times; times1++) {
                System.out.print(subString.charAt(times1));
            }
            System.out.println();
        }
    }

    void Method_8() {
        System.err.println("8. How to convert a string totally into upper case without using toUpperCase() method ?");
        String lowerCase = "i am in lower case";
        for (int times = 0; times < lowerCase.length(); times++) {
            char singleChar = lowerCase.charAt(times);
            if (!(singleChar == ' ')) {
                System.out.print((char) (lowerCase.charAt(times) - 32));
            } else {
                System.out.print(" ");
            }
        }
    }

    void Method_9() {
        System.err.println("9. How to concatenate two strings without using concat() method ?");
        String word = "concate() method";
        String word2 = " not used";
        String stringConcate = new String(word + word2);
        System.out.println(stringConcate);
    }

    void Method_10() {
        System.err.println("10. How to get unicode of strings without using getBytes() method ?");
        String unicodeString = "peace";
        for (int times = 0; times < unicodeString.length(); times++) {
            System.out.println(unicodeString.charAt(times) + " = " + (int) unicodeString.charAt(times));
        }
    }

    public static void main(String[] args) {
        new howe_work1().Method_9();
    }
}
