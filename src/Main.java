public class Main {
    public static void main(String[] args) {
        Phone iPhone = new iPhone();
        Phone galaxy = new Galaxy();
        StevenJobs jobs = new StevenJobs();
        JaeyongLee lee = new JaeyongLee();

        jobs.buy(iPhone);
        jobs.turnOn(iPhone);
        jobs.bootingUp(iPhone);

        lee.buy(galaxy);
        lee.turnOn(galaxy);
        lee.bootingUp(galaxy);

    }
}