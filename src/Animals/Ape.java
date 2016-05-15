package Animals;

/**
 * Created by zleha_000 on 09.05.2016.
 */
public class Ape extends Animal {
    public Ape(double ves, String sex, int age, double dlina) {
        super(30, "М", 2, 120);
        zapolnenieVibor();
        if (vibor == true) {
            zapolnenieAge();
            zapolnenieSex();
            zapolnenieVes();
            zapolnenieDlina();
        }
    }

    public void action(Fish fish) {
        if (this.getDlina() > fish.getDlina()) {
            System.out.println("Рыба не сможет проглотить обезьяну");
        } else System.out.println("К сожалению, рыба проглотит обезьянуы");

        if (this.getAge() > fish.getAge()) {
            System.out.println("Огромный шанс что рыбка, окажется волшебной старушкой исполняющей желания");
        } else System.out.println("Человек точно съест рыбку");
    }

    public void action(Ape ape) {
        if (this.getDlina() > ape.getDlina()) {
            System.out.println("Человек не сможет посмотреть на макушку обезьяны");
        } else System.out.println("К сожалению, человек сможет посмотреть на макушку обезьяны");
    }
}
