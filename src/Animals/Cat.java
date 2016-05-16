package Animals;

import java.io.*;

/**
 * Created by zleha_000 on 19.04.2016.
 */

public class Cat extends Pet {
    private String nameCat = null;//имя кошака


    //Конструктор
    public Cat() throws IOException {
        //заполнение автоматом от родителя PET
        super(1, "М", 4);
        zapolnenieNameCat();
        zapolnenieVibor();
        if (vibor == true) {
            zapolnenieAge();
            zapolnenieSex();
            zapolnenieVes();
        }

    }

    //Алгоритм введения имени кошки
    public void zapolnenieNameCat() {
        System.out.println("Введите имя кошака");
        try {
            setNameCat(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println("Введено не корректное имя");
        }
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public void info() {
        System.out.println("\nКошака зовут - " + getNameCat() + " весит " + getVes() + " живет уже " + getAge() + " пол " + getSex() + "\n");
    }
}
