package Urok5.ATM;

public class Service_Atm {

    public static boolean service() {
        float ostatok = UI_Atm.amount % 100;
        float math = ostatok - 50;
        if (UI_Atm.amount % 20 == 0 || UI_Atm.amount % 50 == 0) {
            return true;
        } else if (ostatok == 0) {
            return  true;
        } else if (ostatok != 0 &&  ostatok > 50) {
            if (math % 20 == 0) {
                return  true;
            } else if (ostatok != 0 &&  ostatok > 50 && UI_Atm.amount>50) {
                if ((UI_Atm.amount-50) % 20 == 0) {
                    return  true;
                }
                else {
                    return false;
                }
            }
            else {
                return false; }
        } else if (ostatok !=0 && ostatok < 50 && UI_Atm.amount>50) {
            if ((UI_Atm.amount-50) % 20 == 0) {
                return true;
            }
            else {
                return false;
            }
        }   else {
            return false;
        }


    }
}