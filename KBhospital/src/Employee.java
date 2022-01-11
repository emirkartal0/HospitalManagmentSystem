
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public abstract class Employee extends Person {

    private String password;
    private String job;
    private int offDay;
    private int watchDay;


    public Employee(String name, String gender, String birthday, String tcno, String bloodGroup
            , String password, String job, int offDay, int watchDay) {

        super(name, gender, birthday, tcno, bloodGroup);

        this.password = password;
        this.job = job;
        this.offDay = offDay;
        this.watchDay = watchDay;
    }
    
   public Employee(){
       
   }
    
    public abstract ArrayList getEmployees();

    public abstract double calculateSalary();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getOffDay() {
        return offDay;
    }

    public void setOffDay(int offDay) {
        this.offDay = offDay;
    }

    public int getWatchDay() {
        return watchDay;
    }

    public void setWatchDay(int watchDay) {
        this.watchDay = watchDay;
    }
}
