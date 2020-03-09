package study.com.hacker.question;

public class Questoin {

//    フィボナッチ数列その１
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
    //    フィボナッチ数列その2
    public void fibo2(int repeat, int first, int second) {
        if (repeat == 10) {
            return;
        } else {
            int sum = first + second;
            System.out.println("sum : "+sum);
            fibo2(++repeat,second,sum);
        }
    }

//     階乗
    public void factorial(int fac,int sum) {
        if(fac==0){
            return;
        }else{
            sum=fac*(fac-1);
            --fac;
            factorial(fac,sum);
        }
    }



}
