public class snow extends human{
    String iceSkill;
    snow(String n, double h, int w, int s, String g, String skill) {
        super(n, h, w, s, g);
        iceSkill = skill;
    }

    @Override
    void show() {
        super.show();
        System.out.print( " | " + this.iceSkill);
    }

    @Override
    double distance(int x, double y) {
        if (y == 0) {
            return (x * this.speed)*2;
        }
        return (x * y * this.speed)*2;
    }
}
