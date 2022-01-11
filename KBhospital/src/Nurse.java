
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Nurse extends HealthCare implements  IRequest {

    public Nurse(String name, String gender, String birthday, String tcno,
                 String bloodGroup, String password, String job, int offDay, int watchDay) {
        super(name, gender, birthday, tcno, bloodGroup, password, job, offDay, watchDay);
    }
    public Nurse(){
        
    }
    
    public ArrayList getNurse(){
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
                arr.add(new Nurse(resultSet.getString("name"),
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

    @Override
    public void addDayoffRequest() {

    }


    @Override
    public void addWatchRequest() {

    }
}
