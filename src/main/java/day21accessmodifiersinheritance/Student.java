package day21accessmodifiersinheritance;

public class Student {

    /*
    1)public         2)protected     3)default(Access modifieri default yapmak için acces modifier yazmayız)   4)private

Not: Access Modifierleri genişten dara doğru sayınız
publi>protected>default>Private

Not: Access Modifierleri birer birer açıklayınız
    Public olanlar her classtan kullanılabilir
    protected olanlar protected olanlar başka packagelerden kullanılamaz ancak başka package de child class içinden kullanılabilir
    default olanlar başka package den kullanılamazlar
    Private olanlar sadece oluşturuldukları class içinde kullanılabilirler

    Not: Protected ve default arasındaki fark
    protected olanlar protected olanlar başka packagelerden kullanılamaz ancak başka package de child class içinden kullanılabilir
    default olanlar başka package den kullanılamazlar

    Not:Class lar için hangi access modifier kullanılabilir
    Public ve default kullanılır ama protected ve private kullanılamaz


     */

    //Public her classtan kullanılabilir
    public String stdName="TomHanks";

    //protected olanlar başka packagelerden kullanılamaz ancak başka package de child class içinden kullanılabilir
    protected String adress="Miami";

    //default olanlar başka package den kullanılamazlar
    String email="th@gmail.com";

    //Private olanlar sadece oluşturuldukları class içinde kullanılabilirler
    private String stdId="20206517004";

}
