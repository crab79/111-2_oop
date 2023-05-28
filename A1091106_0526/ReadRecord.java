import java.io.*;
public class ReadRecord{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println("Please type in the file name for the student record you want to search.");
        System.out.println("->");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();

        int counter = 0;
        double engSum = 0;
        double mathSum = 0;
        double javaSum = 0;
        StudentRecord ss = new StudentRecord();

        System.out.println("Name\tEnglish\tMath\tJava\tAverage");
        System.out.println("---------------------");

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            while (true) {
                ss = (StudentRecord) ois.readObject();
                counter++;

                engSum = ss.getEngSC();
                mathSum = ss.getMathSC();
                javaSum = ss.getJavaSC();

                System.out.println(ss.getName()+'\t'+ss.getEngSC()+'\t'+ss.getMathSC()+'\t'+ss.getJavaSC()+'\t'+ss.getAve());
            }
        } catch(EOFException e) {
            System.out.println("\nAlready read "+counter+" records from the file: "+fileName);
            System.out.println("\nThe Average of English score from all students"+ (engSum/counter));
            System.out.println("\nThe Average of Math score from all students"+ (mathSum/counter));
            System.out.println("\nThe Average of Java score from all students"+ (javaSum/counter));
        }
    }
}
