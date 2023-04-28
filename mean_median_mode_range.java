package payilagam.homeWork;

public class mean_median_mode_range {
    void mean() {
        int m[] = {9, 3, 1, 8, 3, 6};
        int sum = 0;
        int mean = 0;
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i];
            count++;
        }
        mean = sum / count;
        System.out.println(mean);
    }

    void median() {
        int m[] = {9, 3, 1, 8, 3, 6};
        int a = 0, b = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] > m[j]) {
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        for (int n : m) {
            System.out.print(n);
        }
        System.out.println();
        a = m[m.length / 2];
        b = m[(m.length / 2) - 1];
        float result = (a + b) / 2f;
        System.out.println(result);
    }

    void mode() {
        int mode[] = {9, 3, 1, 8, 3, 6};
        for (int times = 0; times < mode.length; times++) {
            for (int clock = times + 1; clock < mode.length; clock++) {
                if (mode[times] == mode[clock]) {
                    System.out.println("the most common number is = " + mode[times]);
                }
            }
        }
    }

    void range() {
        int range[] = {9, 3, 1, 8, 3, 6};
        for (int times = 0; times < range.length; times++) {
            for (int clock = times + 1; clock < range.length; clock++) {
                if (range[times] < range[clock]) {
                    int transfer = range[clock];
                    range[clock] = range[times];
                    range[times] = transfer;
                }
            }
        }
        int a = range[0] - range[5];
        System.out.println("the difference between the highest number and the lowest number is = " + " " + a);
    }
}
