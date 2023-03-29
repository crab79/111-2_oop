import java.util.Scanner;
public class A1091106_0324_1 {
    public static void main(String[] args) {
        animal[] subject = new animal[4];
        for (int i = 0; i < subject.length; i++) subject[i] = new animal();

        subject[0].name = "Ajax";
        subject[0].height = 1.7;
        subject[0].weight = 60;
        subject[0].speed = 100;

        subject[1].name = "Bob";
        subject[1].height = 1.9;
        subject[1].weight = 70;
        subject[1].speed = 120;

        subject[2].name = "Cindy";
        subject[2].height = 1.6;
        subject[2].weight = 50;
        subject[2].speed = 130;

        subject[3].name = "Dylan";
        subject[3].height = 1.6;
        subject[3].weight = 40;
        subject[3].speed = 140;

        System.out.println("Name | Height | Weight | Speed");
        for (animal sub : subject) {
            sub.show();
        }

        System.out.println("\nPlease enter running time (minutes) and acceleration.");
        System.out.println("Using 'space' to separate, for example,'3 5'(time, acceleration) or only enter the value of 'time'.\n");
        for (animal sub : subject) {
            System.out.print(sub.name + "'s running time (minutes) and acceleration: ");
            Scanner scanner = new Scanner(System.in);
            int time = scanner.nextInt();
            double acceleration = 1;
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                acceleration = Double.parseDouble(input);
            } else {
                System.out.println("Acceleration is skipped");
            }
            System.out.println("Name | Height | Weight | Speed | distance");
            System.out.println(sub.name + " | " + sub.height + " | " + sub.weight + " | " + sub.speed + " | " + sub.distance(time, acceleration) + "\n");

        }
    }
        /* User can enter subjects' info
        for (int i=0; i< subject.length; i++) {
            subject[i] = new animal();
            Scanner scanner = new Scanner(System.in);
            subject[i].name = scanner.next();
            scanner = new Scanner(System.in);
            subject[i].height = scanner.nextInt();
            scanner = new Scanner(System.in);
            subject[i].weight = scanner.nextInt();
            scanner = new Scanner(System.in);
            subject[i].speed = scanner.nextInt();
        }
        */

    static class animal {
        String name;
        double height;
        int weight;
        int speed;
        void show() {
            System.out.println(this.name + " | " + this.height + " | " + this.weight + " | " + this.speed);
        }
        double distance(int x, double y) {
            return x * y * this.speed; //x = time, y = acceleration;
        }
    }
}