package Animals;

import java.io.*;

/*Захаров Алексей 1541б
* 1. Написать два класса: Horse(лошадь) - в конструкторе задается кличка лошади и Pegas(пегас)
 * - релизующий метод полет(сообщает какая лошадь летит). Унаследовать пегаса от лошади.
2. Написать три класса: Pet(домашнее животное) - с полями вес, пол, возраст, Cat(кот)
 с полем имя и Dog(собака) с полем имя. Унаследовать кота и собаку от животного.
  В классах кот и собака реализовать методы вывода информации и о животных
3. Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human(Человек).
 Унаследовать рыб от животных, обезьян от животных и человека от обезьян. Поля и методы разработать самостоятельно.
4. Скрыть все внутренние переменные класса Cat, добавить методы работы с этими переменными
*/
public class Main {


    public static void main(String[] args) throws IOException {
//        Horse h1 = new Horse();
//        Pegas p1 = new Pegas();
//        p1.flyPegas();
//        Cat c1 = new Cat();
//        c1.info();
//               Dog d1 = new Dog();
//        d1.info();
        System.out.println("Человек");
        Human hum = new Human(10, "М", 50, 180, 60);
        System.out.println("Обезьяна");
        Ape a = new Ape(50, "М", 20, 150, 30);
        System.out.println("Рыба");
        Fish f = new Fish(15, "М", 90,900);
        System.out.println();
        hum.action(f);
        hum.action(a);
        System.out.println();
        a.action(hum);
        a.action(f);
        System.out.println();
        f.action(hum);
        f.action(a);
    }
}
