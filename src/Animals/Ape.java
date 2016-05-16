package Animals;

/**
 * Created by zleha_000 on 09.05.2016.
 */
public class Ape extends Animal {
    private int agility = 10;

    //Конструктор
    public Ape(double ves, String sex, int age, double dlina, int agility) {
        super(30, "М", 2, 120);
        this.agility = agility;
        zapolnenieVibor();
        if (vibor == true) {
            zapolnenieAge();
            zapolnenieSex();
            zapolnenieVes();
            zapolnenieDlina();
            zapolnenieAgility();
        }
    }

    public void zapolnenieAgility() {
        System.out.println("Введите ловкость цифрой от 0 до 100");
        while (true) {
            try {
                a_str = bufferedReader.readLine();
                if (Integer.parseInt(a_str) >= 0 && Integer.parseInt(a_str) <= 100) {
                    setAgility(Integer.parseInt(a_str));
                    break;
                } else {
                    System.out.println("Введите ловкость от 0 до 100");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода ловкости, введите цифры");
            }
        }
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void action(Fish fish) {
        if (this.getDlina() > fish.getDlina()) {
            System.out.println("Рыба не сможет проглотить обезьяну");
        } else System.out.println("К сожалению, рыба проглотит обезьянуы");
    }

    public void action(Human human) {
        if (this.getDlina() > human.getDlina()) {
            System.out.println("Человек не сможет посмотреть на макушку обезьяны");
        } else System.out.println("К сожалению, человек сможет посмотреть на макушку обезьяны");

        if (this.getAgility() > human.getAgility()) {
            System.out.println("Человек ловчее обезьяы, значит он сможет печатать на клавиатуре");
        } else
            System.out.println("Этот человек очень странный, даже обезьяна сможет печатать на клавиатуре в отличии от него");
    }
}
