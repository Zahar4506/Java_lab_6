package Animals;

/**
 * Created by zleha_000 on 09.05.2016.
 */
public class Human extends Ape {

    public Human(double ves, String sex, int age, double dlina, int agility) {
        super(ves,sex,age,dlina,agility);
        System.out.println();
//        zapolnenieVibor();
//        if (vibor == true) {
//            zapolnenieAge();
//            zapolnenieSex();
//            zapolnenieVes();
//            zapolnenieDlina();
//            zapolnenieAgility();
//        }
    }
    @Override
    public void action(Fish fish) {
        if (this.getDlina() > fish.getDlina()) {
            System.out.println("Рыба не сможет проглотить человека");
        } else System.out.println("К сожалению, рыба проглотит человека");

        if (this.getAge() > fish.getAge()) {
            System.out.println("Огромный шанс что рыбка, окажется волшебной старушкой исполняющей желания");
        } else System.out.println("Человек точно съест рыбку");
    }

    public void action(Ape ape) {
        if (this.getDlina() > ape.getDlina()) {
            System.out.println("Человек сможет посмотреть на макушку обезьяны");
        } else System.out.println("К сожалению, человек не сможет посмотреть на макушку обезьяны");

        if (this.getAgility() > ape.getAgility()){
            System.out.println("Человек ловчее обезьяы, значит он сможет печатать на клавиатуре");
        } else System.out.println("Этот человек очень странный, даже обезьяна сможет печатать на клавиатуре в отличии от него");
    }

}

