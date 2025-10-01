public class UndergraduateStudent extends Student
{
    public static final double UNDERGRAD_TUITION = 4000;
    public static final String UND_CLASSIFY = "Undergraduate";
    
    public UndergraduateStudent(int pID, String pName)
    {
        super(pID, pName); // initialize super class, Student.java for 'pID' and 'Student' values
        // initialize the Student.java's 'tuition' and 'classification' values
        setTuition();
        setClassification();
    }
    public void setTuition()
    {
        tuition = UNDERGRAD_TUITION;
    }
    public void setClassification()
    {
        classification = UND_CLASSIFY;
    }
}