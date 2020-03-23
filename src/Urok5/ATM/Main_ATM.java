package Urok5.ATM;

public class Main_ATM {
    public static void main(String[] args) {
        Storage_ATM_write_in_txt.writeData();
        UI_Atm.transaction();
        Storage_ATM.saveData();
    }
}







