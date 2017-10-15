package xin.jannchie;

public class AddDigits {

    public int addDigits(int num) {
        // write your code
        if (num == 0) {
            return 0;
        } else {
            int digit;
            digit = digitJudge(num);

            int answer = num / ((int) Math.pow(10, digit - 1));
            for (int i = digit - 2; i >= 0; i--) {
                int a = num / ((int) Math.pow(10, i));
                int b = num / ((int) Math.pow(10, i + 1)) * 10;

                answer += a - b;
            }
            if (answer / 10 == 0) {
                return answer;
            } else {
                return addDigits(answer);
            }
        }
    }

    public int digitJudge(int num) {
        int digit = 0;
        while (num > 0) {
            num = num / 10;
            digit++;
        }
        return digit;
    }
}
