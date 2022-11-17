package day32Maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    1)hashTable bir Map tir
    2)HashTable entrysetleri herhangi bir sıralamaya tabi tutmaz
    3)HashTable HashMaplardan daha yavaştır. Çünkü HashTablelar threatsafe(aynı anda birden fazla iş yapabilme becerisi)
     ve senkronize(çoklu işlerin zamandan kazanacak ve mantıklı şekilde sıraya konmasıdır mesela çorba ateşteyken salata
     yapmak  gibi) dir
    4)HashTablelerde key null olamaz key null olursa nullPoınterException atar.
    5)HashTablelerda value null olamaz value null olursa nullPoınterexception atar.
    Note:  ToString metodu objeleri konsolda detaylari ile görebilmek için classların içinde oluşturulur
     ToString metodunu oluşturmadan objeyi consola yazdırırsanız java o objenin adresini yazdırır.



    HashMap ve HashTable arasındaki farklar
   **** HashTable HashMaplardan daha yavaştır. Çünkü HashTablelar threatsafe(aynı anda birden fazla iş yapabilme becerisi)
     ve senkronize(çoklu işlerin zamandan kazanacak ve mantıklı şekilde sıraya konmasıdır mesela çorba ateşteyken salata
     yapmak  gibi) dir ancak hashMapta bu özellik yok
  ****HashTablelerde key null olamaz key null olursa nullPoınterException atar. HashTablelerda value null
  olamaz value null olursa nullPoınterexception atar. Hashmapte null kabul edilir
     */
    public static void main(String[] args) {

        Hashtable<String, Integer>countryPopulation=new Hashtable<>();
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Turkey", 90000000);
        System.out.println(countryPopulation);

        //countryPopulation.put(null, 90000000);//key null olamaz exception atar
        //countryPopulation.put("France", null);//HashTablelerda value null olamaz

        Hashtable<String, Students> myStudents=new Hashtable<>();
        myStudents.put("Math",new Students("Tom Hanks", "th@gmail.com",21,true));
        System.out.println(myStudents);

        String name=myStudents.get("Math").name;//HashTable ye eklediğimiz dataları birer birer alma metodu(math table ismi)
        int age=myStudents.get("Math").age;
        System.out.println(name+" "+age);

    }

}
