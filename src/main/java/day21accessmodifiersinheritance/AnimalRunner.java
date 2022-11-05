package day21accessmodifiersinheritance;

public class AnimalRunner {

    /*
    1)"Inheritance" sayesinde
        --Kod tekrarlarından kurtuluruz
        --Kod tamiri (maintenance) kolay olur
        --Child class ları daha atomik yapmış oluruz

    2)Bir class ı başka bir clasın child clası yapmak için "extends" komuttu kullanılır ilk yazılan class child
    ikinci yazılan class parent olur

    3)Child class objectleri prent class tan metot ve variableleri kullanabilirler

    4)Parent class objectleri child class tan variableleri kullanamazlar

    5)Object class her clasın parentidir

    javada object class hariç her clasın parenti vardır

    javada parenti olmayan tek class objet class tır

    6)Private method ve variableler child classlar tarafından kullanılamazlar

       Protectod method ve variableler child class tarafından kullanılabilir

       Default method ve variableler aynı package dekichild classlar tarafından kullanılabilir

       Public method ve classlar child classlar tarafından kullanılabilir

    Not:Child classlar tarafından kullanılabilir olmak, inherit edilebilir demektir

    7)  4 tip inheritance vardır
            --Multilevel inheritance:java destekler
            --Hierarchical Inheritance: bir parent için çoklu child java bunu da destekler
            --Multiple Inheritance : bir childe çoklu parent demek java bunu desteklemez
            --Single inheritance: bir chide bir parent demektir java bunu destekler
     */
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1=new Dog();
        d1.bark();
        d1.eat();
        d1.drink();



    }
}
