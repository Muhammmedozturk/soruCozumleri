package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class soruBank {
    public static void main(String[] args) {


        try {
            m(9);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void m(int x) {
        if(x<0 || x>9) {
            throw new IllegalArgumentException("Good");
        }else {
            System.out.println(x);
        }
    }}