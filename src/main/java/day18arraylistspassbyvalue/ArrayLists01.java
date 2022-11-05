package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static <Lists> void main(String[] args) {
       // example 1: bir integer arrayListteki 7 hariç tüm elemanları iki arttırınız

        List<Integer> ages=new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);
        for (Integer w:ages){
            if (w==7){
                continue;
            }//w=w+2  ==>Listler bu şekilde update edilemezler
            ages.set(ages.indexOf(w),w+2);
        }
        System.out.println(ages);
        //example 2: size verilen array listte 8 ve 8 den önceki tüm elemanları iki katına çıkarınız
        List<Integer> age=new ArrayList<>();
        age.add(12);
        age.add(7);
        age.add(8);
        age.add(78);
        age.add(9);

        for (Integer w:age){
            age.set(age.indexOf(w),w*2);
            if (w==8){

                break;
            }
        }
        System.out.println(age);
    }
}
