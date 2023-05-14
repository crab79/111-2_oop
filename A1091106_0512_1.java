import java.util.Random;
import java.util.Scanner;

public class A1091106_0512_1 {
    private static int porkDumplings = 5000;
    private static int beefDumplings = 3000;
    private static int veggieDumplings = 1000;

    public static synchronized void sellDumplings(String type, int quantity) {
        switch (type) {
            case "pork" -> {
                if (quantity <= porkDumplings) {
                    porkDumplings -= quantity;
                    System.out.println(quantity + " pork dumplings sold.");
                } else if ((porkDumplings - quantity) < 0 && porkDumplings != 0) {
                    System.out.println(porkDumplings + " pork dumplings sold.");
                    while (porkDumplings != 0) {
                        porkDumplings -= porkDumplings;
                    }
                } else {
                    System.out.println("Sorry, pork dumplings are sold out.");
                }
            }
            case "beef" -> {
                if (quantity <= beefDumplings) {
                    beefDumplings -= quantity;
                    System.out.println(quantity + " beef dumplings sold.");
                } else if ((beefDumplings - quantity) < 0 && beefDumplings != 0) {
                    System.out.println(beefDumplings + " beef dumplings sold.");
                    while (beefDumplings != 0) {
                        beefDumplings -= beefDumplings;
                    }
                } else {
                    System.out.println("Sorry, beef dumplings are sold out.");
                }
            }
            case "veggie" -> {
                if (quantity <= veggieDumplings) {
                    veggieDumplings -= quantity;
                    System.out.println(quantity + " veggie dumplings sold.");
                } else if ((veggieDumplings - quantity) < 0 && veggieDumplings != 0) {
                    System.out.println(veggieDumplings + " veggie dumplings sold.");
                    while (veggieDumplings != 0) {
                        veggieDumplings -= veggieDumplings;
                    }
                } else {
                    System.out.println("Sorry, veggie dumplings are sold out.");
                }
            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int numCustomers = scanner.nextInt();

        Thread[] threads = new Thread[numCustomers];
        for (int i = 0; i < numCustomers; i++) {
            threads[i] = new Thread(new Customer());
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }

    private static class Customer implements Runnable {
        private final Random random = new Random();

        @Override
        public void run() {
            int numDumplings = random.nextInt(41) + 10; // Generate random number between 10 and 50
            int dumplingType = random.nextInt(3); // 0 for pork, 1 for beef, 2 for veggie

            String type = switch (dumplingType) {
                case 0 -> "pork";
                case 1 -> "beef";
                case 2 -> "veggie";
                default -> "";
            };

            sellDumplings(type, numDumplings);
        }
    }
}

