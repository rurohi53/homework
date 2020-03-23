package Urok6.Hierarchy;

public class CardParentDaughterGold extends NFC_CardParent_Daughter {
    private boolean paymentAbroad;
    private int airFlightsDiscount;

    public CardParentDaughterGold(int validity, int taxesPerMonth, boolean paymentAbroad, int airFlightsDiscount) {
        super(validity, taxesPerMonth);
        this.paymentAbroad = paymentAbroad;
        this.airFlightsDiscount = airFlightsDiscount;
    }

    public boolean isPaymentAbroad() {
        return paymentAbroad;
    }

    public void setPaymentAbroad(boolean paymentAbroad) {
        this.paymentAbroad = paymentAbroad;
    }

    public int getAirFlightsDiscount() {
        return airFlightsDiscount;
    }

    public void setAirFlightsDiscount(int airFlightsDiscount) {
        this.airFlightsDiscount = airFlightsDiscount;
    }

    CardParentDaughterGold cardGold = new CardParentDaughterGold(11,22,true,3);
}
