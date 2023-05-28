import java.io.*;
public class StudentRecord implements Serializable {
    private String name;
    private short engSC;
    private short mathSC;
    private short javaSC;
    public StudentRecord(String n, short e, short m, short j) {
        name = n;
        engSC = e;
        mathSC = m;
        javaSC = j;
    }
    public StudentRecord(){}

    //Return students' record
    public String getName() {
        return name;
    }
    public short getEngSC() {
        return engSC;
    }
    public short getMathSC() {
        return mathSC;
    }
    public short getJavaSC() {
        return javaSC;
    }

    //Return the average of 3 subjects
    public double getAve() {
        return (engSC+mathSC+javaSC)/3.0;
    }
}
