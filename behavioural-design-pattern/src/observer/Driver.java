package observer;

public class Driver {
    public static void main(String[] args) {
        Subject bhadipa = new SubjectImpl();
        Observer pratik = new ObserverImpl("Pratik");
        Observer vikram = new ObserverImpl("Vikram");
        Observer karan = new ObserverImpl("Karan");
        Observer kedar = new ObserverImpl("Kedar");
        bhadipa.register(pratik);
        bhadipa.register(vikram);
        bhadipa.register(karan);

        pratik.setSubject(bhadipa);
        vikram.setSubject(bhadipa);
        karan.setSubject(bhadipa);


        bhadipa.postMessage("Hello guys ...This is first messege from Bhadipa");
    }
}
