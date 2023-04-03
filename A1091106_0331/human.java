public class human extends animal {
    String gender;
    human(String n, double h, int w, int s, String g) {
        super(n, h, w, s);
        gender = g;
    }

    @Override
    void show() {
        super.show();
        System.out.print( " | " + this.gender);
    }
}
