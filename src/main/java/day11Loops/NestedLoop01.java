package day11Loops;

public class NestedLoop01 {
    public static void main(String[] args) {
        //Example 1: Aşağıdaki çıktıyı verecek kodu yazınız
      /*
       week 1
        Day: 1
        Day: 2
        Day: 3

       Week: 2
        Day: 1
        Day: 2
        Day: 3

       Week: 3
        Day: 1
        Day: 2
        Day: 3

         */

for (int i=1; i<5; i++){
    System.out.println("week: "+i);
    for (int k=1; k<8; k++){
        System.out.println("Day: "+k);
    }
}

    }
}
