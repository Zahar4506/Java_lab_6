package Animals;

import java.io.*;


/**
 * Created by zleha_000 on 19.04.2016.
 */
public class Dog extends Pet {
    public String nameDog = null;

    //Конструктор
    public Dog() throws IOException {
        super(2, "М", 3);
        zapolnenieNameDog();
        zapolnenieVibor();
        if (vibor == true) {
            zapolnenieAge();
            zapolnenieSex();
            zapolnenieVes();
        }
    }

    //Алгоритм введения имени кошки
    public void zapolnenieNameDog() {
        System.out.println("Введите имя псюги");
        try {
            nameDog = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("Введено не корректное имя");
        }
    }

    public void info() {
        System.out.println("\nПса зовут - " + nameDog + " весит " + getVes() + " живет уже " + getAge() + " пол " + getSex() + "\n");
    }
}
