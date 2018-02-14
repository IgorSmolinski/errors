package exception.test;

import java.io.IOException;

public class FirstChallange {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }



    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */

    public static void main(String[] args) {

        FirstChallange firstChallange = new FirstChallange();

        try{
            double result = firstChallange.divide(3, 0);

        }catch (ArithmeticException e){
            System.out.println("Smth goes wrong " + e);
        }finally{
            System.out.println("Shouldn't try to devided by zero");
        }



    }
}
