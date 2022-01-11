
import java.util.ArrayList;
import java.sql.*;

public class HealthCare extends Employee {

    public HealthCare(String name, String gender, String birthday, String tcno, String bloodGroup, String password,
                      String job, int offDay, int watchDay) {
        super(name, gender, birthday, tcno, bloodGroup, password, job, offDay, watchDay);

    }

    /**
     *
     */
    public HealthCare(){
        
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public ArrayList getEmployees() {
     return null;
    }


}
