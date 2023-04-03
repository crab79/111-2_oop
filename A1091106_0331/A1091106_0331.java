import java.util.Scanner;
public class A1091106_0331 {
    public static void main(String[] args) {
        animal.showinfo();

        animal[] subA = new animal[2];
        human[] subH = new human[3];
        snow[] subS = new snow[1];

        subA[0] = new animal("雪寶", 1.1, 52, 100);
        subA[1] = new animal("驢子", 1.5, 99, 200);
        subH[0] = new human("阿克", 1.9, 80, 150, "Male");
        subH[1] = new human("漢斯", 1.8, 78, 130, "Male");
        subH[2] = new human("安那", 1.7, 48, 120, "Female");
        subS[0] = new snow("愛莎", 1.7, 50, 120, "Female", "Yes");

        for (animal sub : subA) {
            sub.show();
        }
        for (human sub : subH) {
            sub.show();
        }
        for(snow sub : subS) {
            sub.show();
        }

        for (animal sub : subA) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n"+sub.name + "'s running time (minutes):");
            int x = scanner.nextInt();
            System.out.println(sub.name + "'s acceleration:");
            double y = scanner.nextDouble();
            System.out.println(sub.name+"的奔跑距離為"+sub.distance(x, y)+"公尺");
        }
        for (animal sub : subH) {
            Scanner scanner = new Scanner(System.in);
            System.out.println('\n'+sub.name + "'s running time (minutes):");
            int x = scanner.nextInt();
            System.out.println(sub.name + "'s acceleration:");
            double y = scanner.nextDouble();
            System.out.println(sub.name+"的奔跑距離為"+sub.distance(x, y)+"公尺");
        }
        for (animal sub : subS) {
            Scanner scanner = new Scanner(System.in);
            System.out.println('\n'+sub.name + "'s running time (minutes):");
            int x = scanner.nextInt();
            System.out.println(sub.name + "'s acceleration:");
            double y = scanner.nextDouble();
            System.out.println(sub.name+"的奔跑距離為"+sub.distance(x, y)+"公尺");
        }
    }
}

