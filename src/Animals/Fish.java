package Animals;

/**
 * Created by zleha_000 on 09.05.2016.
 */
public class Fish extends Animal{


    public Fish(double ves, String sex, int age) {
        super(1, "М", 2, 20);
        zapolnenieVibor();
        if (vibor == true) {
            zapolnenieAge();
            zapolnenieSex();
            zapolnenieVes();
            zapolnenieDlina();
        }
    }
    public void action(Human human){
        if (this.getAge()>human.getAge()){
            System.out.println("Огромный шанс что рыбка, окажется волшебной старушкой исполняющей желания");
        }else System.out.println("Человек точно съест рыбку");
    }
    public void action(Ape ape) {
        if (this.getDlina() > ape.getDlina()) {
            System.out.println("Рыба сможет проглотить обезьяну");
        } else System.out.println("К сожалению, рыба не проглотит обезьянуы");
    }
}
