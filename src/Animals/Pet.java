package Animals;

import java.io.*;

/**
 * Created by zleha_000 on 19.04.2016.
 */
public class Pet {
    //Кострукция ввода данных с клавиатуры
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //поля вес, пол, возраст
    private double ves = 0;
    private String sex = null;
    private int age = 0;

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Конструктор
    public Pet() throws IOException {
        System.out.println("Введите вес");
        String a_str = null;
        
        //Алгоритм ввода веса
        while (true) {
            try {
                a_str = bufferedReader.readLine();
                setVes(Double.parseDouble(a_str));
                break;
            } catch (Exception e) {
                System.out.println("Ошибка ввода веса, введите цифры(через точку)");
            }
        }

        //Алгоритм ввода возраста
        System.out.println("Введите возраст");
        while (true) {
            try {
                a_str = bufferedReader.readLine();
                setAge(Integer.parseInt(a_str));
                break;
            } catch (Exception e) {
                System.out.println("Ошибка ввода возраста, введите цифры");
            }
        }

        //Алгоритм ввода пола
        System.out.println("Введите пол животного (М/Ж)");
        while (true) {
            try {
                setSex(bufferedReader.readLine());
                System.out.println(getSex());
                if (getSex().equals("М") || getSex().equals("Ж") || getSex().equals("м") || getSex().equals("ж")) {
                    break;
                } else System.out.println("Ошибка ввода пола, введите пол М или Ж");
            } catch (Exception e) {
            }
        }


    }
}
