package Urok5.ATM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Storage_ATM_write_in_txt {
    static void writeData() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("balance.txt"), "UTF-8"));
            String Balance = in.readLine();
            UI_Atm.balance = Float.parseFloat(Balance);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

