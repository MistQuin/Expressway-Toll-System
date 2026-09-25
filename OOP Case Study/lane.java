public class lane {
    private String laneCode;

    public lane(vehicle v) {
        this.laneCode = v.getLaneCode();
    }
    
    public String getLaneCode(){
        return  laneCode;
    }
    public void setLaneCode(String laneCode){
        this.laneCode = laneCode;
    }
}