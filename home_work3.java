package payilagam.homeWork;

public class home_work3 {
    void Method1() {
        System.err.println("Generate number series: 0, 1, 8, 27 , 256, …. ( upto 10 term )");
        for (int times = 0; times < 10; times++) {
            int numberSeries = times * times * times;
            System.out.println(numberSeries);
        }
    }

    void Method2() {
        System.err.println("Check which is greater: 5 to the power of 2 vs 2 to the power of 5 (do this program in 2 ways, one way by using pre defined method & another way by not using pre defined method");
        int base1 = 2, power1 = 5;
        int base2 = 5, power2 = 2;
        int powerPredefined1 = (int) Math.pow(base1, power1);
        int powerPredefined2 = (int) Math.pow(base2, power2);
        int result1 = 1, result2 = 1;
        for (int times = 0; times < power1; times++) {
            result1 = result1 * base1;
            if (times == 3 || times == 4) {
                result2 = result2 * base2;
            }
            if (times == 4) {
                if (result1 > result2) {
                    System.err.println("2 to the power of 5 is greater");
                } else {
                    System.err.println("5 to the power of 2 is greater");
                }
            }
        }
    }

    void Method3() {
        System.err.println("Print acute or obtuse or right or straight angle based on the input data teta");
        int degreeOf_a = 20, degreeOf_b = 30, teta = Math.abs(180 - degreeOf_a + degreeOf_b);
        System.out.println(teta);

        if (teta < 180) {
            System.out.println("this is acute angle");
        } else {
            System.out.println("this is obtuse angle");
        }
    }

    void Method4() {
        System.err.println("Area of circle is 16π, find the circumference of a circle");
        int areaOf_circle = 16 / 4;
        int radius = 2 * areaOf_circle;
        System.out.println("the area of circumference is = " + radius);
    }

    void Method5() {
        System.err.println("Program for currency conversion ( INR to USD & INR to IDR");
        int IND = 5;
        double USD = 82.54;
        double IDR = 15374.00;
        double indTOusd = IND * USD;
        double indTOidr = IND * IDR;
        System.out.println(IND + " x " + USD + " = " + (float) indTOusd + " $");
        System.out.println(IND + " x " + IDR + " = " + (float) indTOidr + " Rp");
    }

    void Method6() {
        System.err.println(" try to generate number series 2, 3, 5, 9, 17, 33 ……….");
        int initializeValue = 2, incrementValue = 1;
        for (int times = 0; times < 10; times++) {
            initializeValue = initializeValue + incrementValue;
            System.out.println(initializeValue);
            incrementValue = incrementValue * 2;
        }
    }


}
