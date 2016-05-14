package Animals;

import java.io.*;

/**
 * Created by zleha_000 on 19.04.2016.
 */
public class Pet extends MyReader {

    //поля вес, пол, возраст, строка заполнения
    private double ves = 0;
    private String sex = null;
    private int age = 0;
    String a_str = null;


    //Конструктор
    public Pet(double ves, String sex, int age) {
        this.ves = ves;
        this.sex = sex;
        this.age = age;
    }

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


    //Алгоритм ввода пола
    public void zapolnenieSex() {
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

    //Алгоритм ввода возраста
    public void zapolnenieAge() {
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
    }

    //Алгоритм ввода веса
    public void zapolnenieVes() {
        System.out.println("Введите вес");
        while (true) {
            try {
                a_str = bufferedReader.readLine();
                setVes(Double.parseDouble(a_str));
                break;
            } catch (Exception e) {
                System.out.println("Ошибка ввода веса, введите цифры(через точку)");
            }
        }
    }

}

