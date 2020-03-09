package study.com.hacker;

import study.com.hacker.question.Questoin;

public class Application {
    public static void main(String[] args) {
        System.out.println("hogehoge");
        try {

            Questoin q1 = new Questoin();
//            q1.fibo2(0,1,1);
            q1.factorial(7,1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
