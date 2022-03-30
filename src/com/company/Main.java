package com.company;

public class Main {

    public static void main(String[] args) {
        int skaiciai = 123;                                                                                               //Skaičių įvedimui;
        System.out.println("Orginali skaičių seka: " + skaiciai);
        System.out.println("Skaičių seka atvirkščiai: " + apversti(skaiciai));
    }

    public static int apversti(int num) {
        int rezultatas = 0;
        while (num != 0)                                                                                                //-Apima ir neigiamus ir teigiamus skaičius;
        {
            int uodega = num % 10;                                                                                      //-Gaunamas paskutinis skaičius (liekana);
            int naujasRezultatas = rezultatas * 10 + uodega;                                                            //-Sukamasi ciklas, susiformuoja nauja seka;
            if ((naujasRezultatas - uodega) / 10 != rezultatas) {                                                       //-Overflow metu gaunamas random skaičius, todėl pabndant grąžinti
                return 0;                                                                                               //skaičius atgal, gausime nebe tokį patį;
            }
            rezultatas = naujasRezultatas;
            num = num / 10;
        }
        return rezultatas;
    }
}

/*  1)
    num = 123;
    uodega = 123 % 10 (==3);
    naujasRezultatas = 0 * 10 + 3; (==3)
    num = 123 / 10 (==12)

    2)
    num = 12;
    uodega = 12 % 10 (==2)
    naujasRezultatas = 3 * 10 + 2; (==32)
    num = 12 / 10 (==1)

    3)
    num = 1;
    uodega = 1 % 10 (==1)
    naujasRezultatas = 32 * 10 + 1 (==321)
    num = 1 / 10 (==0)

    123
    0

 */
