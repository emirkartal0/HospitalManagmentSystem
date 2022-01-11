public class Person {
    private String name;
    private String gender;
    private String birthday;
    private String tcno;
    private String bloodGroup;

    public Person(String name, String gender, String birthday, String tcno, String bloodGroup) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.tcno = tcno;
        this.bloodGroup = bloodGroup;
    }
    public Person(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
