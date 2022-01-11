public class Request {
    private String tc;
    private int offDay;
    private int watchDay;
    private String explanation;
    private int idRequest;

    
    public Request(String tc, int offDay, int watchDay, String explanation) {
        this.setTc(tc);
        this.setOffDay(offDay);
        this.setWatchDay(watchDay);
        this.setExplanation(explanation);
        
    }
    
    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }
    
    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
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

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
