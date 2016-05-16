package Animals;

/**
 * Created by zleha_000 on 09.05.2016.
 */
public class Animal extends Pet {
    private double dlina = 10;

    public Animal(double ves, String sex, int age, double dlina) {
        super(ves,sex,age);
        this.dlina = dlina;
//        zapolnenieVibor();
//        if (vibor == true) {
//            zapolnenieAge();
//            zapolnenieSex();
//            zapolnenieVes();
//            zapolnenieDlina();
//        }
        System.out.println();
    }

    //Алгоритм ввода веса
    public void zapolnenieDlina() {
        System.out.println("Введите длинну");
        while (true) {
            try {
                a_str = bufferedReader.readLine();
                if (Integer.parseInt(a_str) > 0 && Integer.parseInt(a_str) <= 1000) {
                    setDlina(Double.parseDouble(a_str));
                    break;
                } else System.out.println("Введите длину от 0 до 1000");
            } catch (Exception e) {
                System.out.println("Ошибка ввода длинны, введите цифры(через точку)");
            }
        }
    }

    public double getDlina() {
        return dlina;
    }

    public void setDlina(double dlina) {
        this.dlina = dlina;
    }
}
