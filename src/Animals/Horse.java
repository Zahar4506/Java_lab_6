package Animals;

import java.io.*;

/**
 * Created by zleha_000 on 13.04.2016.
 */
public class Horse {
    //Кострукция ввода данных с клавиатуры
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //Имя лошади
    private String nameHorse = null;

    //Конструктор Лошадь
    public Horse() {
        System.out.println("Введите кличку лошади");
        try {
            setNameHorse(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Метод для взятия имени Лошади
    public String getNameHorse() {
        return nameHorse;
    }
    //Метод для установки имени Лошади
    public void setNameHorse(String nameHorse) {
        this.nameHorse = nameHorse;
    }
}
