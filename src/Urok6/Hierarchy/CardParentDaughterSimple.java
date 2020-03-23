package Urok6.Hierarchy;

public class CardParentDaughterSimple extends Offline_CardParent_Daughter {
    private boolean paymentAbroad;

    public CardParentDaughterSimple(int validity, int taxesPerMonth, boolean paymentAbroad) {
        super(validity, taxesPerMonth);
        this.paymentAbroad = paymentAbroad;
    }

    public boolean isPaymentAbroad() {
        return paymentAbroad;
    }

    public void setPaymentAbroad(boolean paymentAbroad) {
        this.paymentAbroad = paymentAbroad;
    }
    CardParentDaughterSimple cardSimple = new CardParentDaughterSimple(11,34,false);
}
