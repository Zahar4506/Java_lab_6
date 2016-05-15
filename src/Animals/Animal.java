package Animals;

/**
 * Created by zleha_000 on 09.05.2016.
 */
public class Animal extends Pet{
        private double dlina = 0;
    public Animal(double ves, String sex, int age, double dlina) {
        super(1, "М", 2);
        this.dlina = dlina;
        zapolnenieVibor();
        if (vibor == true) {
            zapolnenieAge();
            zapolnenieSex();
            zapolnenieVes();
            zapolnenieDlina();
        }
    }

    //Алгоритм ввода веса
    public void zapolnenieDlina() {
        System.out.println("Введите длинну");
        while (true) {
            try {
                a_str = bufferedReader.readLine();
                setDlina(Double.parseDouble(a_str));
                break;
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
