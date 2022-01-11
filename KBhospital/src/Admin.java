
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Admin extends Employee implements IViewPatient {

    public Admin(String name, String gender, String birthday, String tcno, String bloodGroup, String password,
                 String job, int offDay, int watchDay) {
        super(name, gender, birthday, tcno, bloodGroup, password, job, offDay, watchDay);
    }

    public void addEmployee() {
    }

    public void answerRequest() {
    }

    public void viewEmployee() {
    }


    @Override
    public void viewPatinent() {

    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public ArrayList getEmployees() {
        Statement statement = null;
        Connection conn = null;
        DbHelper db = new DbHelper();
        ResultSet resultSet;
        ArrayList<Employee> arr = new ArrayList<>();

        try {
            conn = db.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("select * from Staff");

            while (resultSet.next()) {
                arr.add(new Doctor(resultSet.getString("name"),
                        resultSet.getString("gender"),
                        resultSet.getString("birthday"),
                        resultSet.getString("tcno"),
                        resultSet.getString("bloodGroup"),
                        resultSet.getString("password"),
                        resultSet.getString("job"),
                        resultSet.getInt("offDay"),
                        resultSet.getInt("watchDay")));
            }
        } catch (SQLException ex) {
            db.showError(ex);
        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException ex) {
                db.showError(ex);
            }
        }
        return arr;
    }
}
