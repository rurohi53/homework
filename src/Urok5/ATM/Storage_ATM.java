package Urok5.ATM;

import java.io.FileOutputStream;
import java.io.IOException;


public class Storage_ATM {
    static void saveData() {
        String Balance = String.valueOf(UI_Atm.balance);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("balance.txt");
            fileOutputStream.write(Balance.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
