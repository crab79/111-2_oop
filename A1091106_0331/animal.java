public class animal {
    String name;
    double height;
    int weight;
    int speed;

    animal(String n, double h, int w, int s) {
        name = n;
        height = h;
        weight = w;
        speed = s;
    }

    void show() {
        System.out.println("\nName | height(m) | weight(kg) | speed(m/minutes) | gender | Ice skill");
        System.out.print(this.name + " | " + this.height + " | " + this.weight + " | " + this.speed);
    }

    double distance(int x, double y) {
        if (y == 0) {
            return x * this.speed;
        }
        return x * y * this.speed; //x = time, y = acceleration;
    }

    static void showinfo() {
        System.out.println("\n歡迎進入冰雪奇緣系統");
    }
}
