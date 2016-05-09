package Animals;

import java.io.*;

/**
 * Created by zleha_000 on 19.04.2016.
 */
public class Cat extends Pet {
    private String nameCat = null;//имя кошака


    //Конструктор
    public Cat() throws IOException {
        System.out.println("Введите имя кошака");
        try {
            nameCat = bufferedReader.readLine();
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
        System.out.println("\nКошака зовут - " + nameCat + " весит " + getVes() + " живет уже " + getAge() + " пол " + getSex()+"\n");
    }
}
