
//create a program that will check and print out
//all possible divisors for numbers 2...20


public class checkWhoDivines {
    public static void main(String[] args) {
        System.out.println("\n");
        int rez;
        int dalamais;
        int dalitajs;
        for ( dalamais = 1; dalamais <= 20; dalamais++) {
            if(dalamais<=9)
                System.out.print("\n "+dalamais+ ":  ");
            else {
                System.out.print("\n"+dalamais+ ":  ");
            }

            for (dalitajs = 2; dalitajs<=20; dalitajs++) {
                if (dalamais == 1)
                    System.out.print("|-" + dalitajs + "-|\t");  // with tab I get space between columns
                else {
                    rez = dalamais % dalitajs;
                    if (rez == 0) {
                        System.out.print("-XX-\t"); //with tab I sorted in one columns
                    } else {
                        System.out.print(" -|-\t "); // same there
                    }
                }
            }
        }
    }
}

