public class Lane {
    private String laneCode;

    public Lane(Vehicle v) {
        this.laneCode = v.getLaneCode();
    }
    
    public String getLaneCode(){
        return  laneCode;
    }
    public void setLaneCode(String laneCode){
        this.laneCode = laneCode;
    }
}