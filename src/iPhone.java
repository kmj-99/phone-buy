public class iPhone implements Phone{
    private String phoneName = "애플폰";
    @Override
    public String turnOn() {
        return phoneName+"을 켰습니다.";
    }

    @Override
    public void bootUp() {
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }

    @Override
    public String getPhoneName() {
        return this.phoneName;
    }
}
