public class JaeyongLee implements Person{
    private String name = "재용";

    @Override
    public void buy(Phone phone) {
        System.out.println(name + "님이 "+phone.getPhoneName()+"을 구매했습니다.");
    }

    @Override
    public void turnOn(Phone phone) {
        System.out.println(name + "님이 "+phone.turnOn());


    }

    @Override
    public void bootingUp(Phone phone) {
        phone.bootUp();
    }
}
