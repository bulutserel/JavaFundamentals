package homework3;
import java.util.ArrayList;
public class Teacher extends Person{
    public Teacher()
    {
        super();
    }
    int coursenumber=1;
    ArrayList<Course> numberofcourseteacher=new ArrayList<>();
    public void teachercourse (Course courseteacher)
    {
        if(coursenumber<3){
            for(int i=3; i>coursenumber; coursenumber++)
            {
                numberofcourseteacher.add(courseteacher);
            }
        }
        else
            System.out.println("Maximum course number is 3 for teacher");
    }
}

