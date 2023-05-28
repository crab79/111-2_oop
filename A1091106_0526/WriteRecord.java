import java.io.*;
public class WriteRecord {
    public static void main(String[] args) throws IOException{
        System.out.println("Please type in the file name for the student record.");
        System.out.println("->");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));

        String str;
        int counter = 0;

        do {
            counter++;

            System.out.println("Please type in the name of the student.");
            String name = br.readLine();

            System.out.println("Please type in the score of English.");
            str = br.readLine();
            short engSC = Short.parseShort(str);

            System.out.println("Please type in the score of Math.");
            str = br.readLine();
            short mathSC = Short.parseShort(str);

            System.out.println("Please type in the score of Java.");
            str = br.readLine();
            short javaSC = Short.parseShort(str);

            StudentRecord ss = new StudentRecord(name, engSC, mathSC, javaSC);

            os.writeObject(ss);

            System.out.println("Do you want to enter other records? (y/n)");
            str = br.readLine();
        }while (str.equalsIgnoreCase("y"));

        os.flush();
        os.close();

        System.out.println("\nAlready write "+ counter+" student's record in the file: "+ fileName);

    }
}

