package Urok6.Hierarchy;

public class Offline_CardParent_Daughter extends MasterCardParent {
    private int taxesPerMonth;

    public Offline_CardParent_Daughter(int validity, int taxesPerMonth) {
        super(validity);
        this.taxesPerMonth = taxesPerMonth;
    }

    public int getTaxesPerMonth() {
        return taxesPerMonth;
    }

    public void setTaxesPerMonth(int taxesPerMonth) {
        this.taxesPerMonth = taxesPerMonth;
    }
}
