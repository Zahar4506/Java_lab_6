package Animals;

/**
 * Created by zleha_000 on 09.05.2016.
 */
public class Human extends Ape {

    public Human(double ves, String sex, int age, double dlina) {
        super(ves, sex, age, dlina);
        zapolnenieVibor();
        if (vibor == true) {
            zapolnenieAge();
            zapolnenieSex();
            zapolnenieVes();
            zapolnenieDlina();
        }
    }
    @Override
    public void action(Fish fish) {
        if (this.getDlina() > fish.getDlina()) {
            System.out.println("Рыба не сможет проглотить человека");
        } else System.out.println("К сожалению, рыба проглотит человека");
    }
    @Override
    public void action(Ape ape) {
        if (this.getDlina() > ape.getDlina()) {
            System.out.println("Человек сможет посмотреть на макушку обезьяны");
        } else System.out.println("К сожалению, человек не сможет посмотреть на макушку обезьяны");
    }

}

