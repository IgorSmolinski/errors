package good.patterns.challanges;

public class OrderDto {

    private User user;
    private boolean isInProgress;

    public OrderDto(User user, boolean isInProgress) {
        this.user = user;
        this.isInProgress = isInProgress;
    }

    public User getUser() {
        return user;
    }

    public boolean isInProgress() {
        return isInProgress;
    }

}
