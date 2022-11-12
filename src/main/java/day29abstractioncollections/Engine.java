package day29abstractioncollections;

import javax.swing.text.AsyncBoxView;

public interface Engine extends Vehicle{

    //    PARENT YAPARKEN KULLANILAN KOMUT    //

  // CHİLD-------PARENT
    //Class ---->Interface====>implements kullanılır
    //Class ---->Class========>extens kullanılır
    //Interface->Interface==>extends
    //Interface--->Class=====>mümkün değil

    //interfacelerdeki tüm variableler otomatik(default) olarak publictir.
    //interfacede variable oluşturduğumuzda değer atamak zorundayız. dolayısıyla bütün variableler final dır.
    //İnterfacedeki tüm variableler otomatik olarak statictir.

    int price=2000;
    double weight=23.5;
    void run();

}
