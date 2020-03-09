package study.com.hacker.question;

public class Questoin {

    public void fibo(int first, int second) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "回目");

            sum = first + second;
            System.out.println("sum : " + sum);
            first = second;
            second = sum;
        }
    }

    public void fibo2(int repeat, int first, int second) {
        if (repeat == 10) {
            return;
        } else {
            int sum = first + second;
            System.out.println("sum : "+sum);
            fibo2(++repeat,second,sum);
        }
    }


    public void factorial(int fac) {

    }


}
