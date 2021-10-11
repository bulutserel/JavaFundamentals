package homework3;
import java.util.ArrayList;
public class Student extends Person{
    int year;
    Student()
    {
        super();
        this.year=year;
    }
    int creditnumber=0;
    ArrayList<Course> course2=new ArrayList<>();
    public void studentcourse (Course coursestudent)
    {
        if(creditnumber<20)
        {
            for(int i=20; i>creditnumber; creditnumber++)
            {
                course2.add(coursestudent);
            }
        }
        else
            System.out.println("Maximum credit is 20 for student.");
    }
}