package exception.test;

public class ExeptionHandling  {

    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(1.5,2);
        }catch (Exception e){
            System.out.println("Exception: " + e);
        }finally {
            System.out.println("Done!");
        }
    }
}
