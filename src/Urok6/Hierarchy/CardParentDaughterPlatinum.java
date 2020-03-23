package Urok6.Hierarchy;

public class CardParentDaughterPlatinum extends NFC_CardParent_Daughter {
    private boolean paymentAbroad;
    private int airFlightsDiscount;
    private int hotelsBookingDiscount;

    public CardParentDaughterPlatinum(int validity, int taxesPerMonth, boolean paymentAbroad, int airFlightsDiscount, int hotelsBookingDiscount) {
        super(validity, taxesPerMonth);
        this.paymentAbroad = paymentAbroad;
        this.airFlightsDiscount = airFlightsDiscount;
        this.hotelsBookingDiscount = hotelsBookingDiscount;
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

    public int getHotelsBookingDiscount() {
        return hotelsBookingDiscount;
    }

    public void setHotelsBookingDiscount(int hotelsBookingDiscount) {
        this.hotelsBookingDiscount = hotelsBookingDiscount;
    }
    CardParentDaughterPlatinum cardPlatinum = new CardParentDaughterPlatinum(11,12,true,5,7);
}
