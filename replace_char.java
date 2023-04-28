package payilagam.homeWork;

class replace_char {
    static void Method_Three(char thisChar, int thisPosition) {
        String name = "I hate codhing";
        String upperName = name.toUpperCase();
        int count = 0;
        int whichCharCount = 0;
        int particularCharCount = 0;
        char whichChar = thisChar;
        int whichPosition = thisPosition;


        if (whichPosition == 0) {
            for (int particularCount = 0; particularCount < name.length(); particularCount++) {
                if ((whichChar == name.charAt(particularCount)) || (whichChar == upperName.charAt(particularCount))) {
                    particularCharCount++;
                }
            }
            char[] allChar = new char[name.length() - particularCharCount];
            for (int times = 0; times < allChar.length; times++) {

                if ((whichChar == name.charAt(count))||(whichChar == upperName.charAt(count))) {
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

    public static void main(String[] args) {
        char chars = 'h';
        int ints = 2;
        replace_char.Method_Three(chars, ints);
    }
}