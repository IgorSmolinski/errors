package good.patterns.challanges.Food2Door.Producers.services;

public class PossibleDto {
    private MakeAOrder makeAOrder;
    private boolean possible;

    public PossibleDto(MakeAOrder makeAOrder, boolean possible) {
        this.makeAOrder = makeAOrder;
        this.possible = possible;
    }

    public MakeAOrder getMakeAOrder() {
        return makeAOrder;
    }

    public boolean isPossible() {
        return possible;
    }
}
