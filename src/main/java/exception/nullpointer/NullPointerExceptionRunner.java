package exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        }catch (MessageNotSentException e){
            System.out.println("Message was not send, but program is still working");
        }
    }
}