public class main {
    public static void main(String[] args) {
        cmodel cm = new cmodel();
        cviews cv = new cviews();
        new ccontroller(cm,cv);
    }
}