public class destination {
    private String entryPoint;
    private String exitPoint;
    private double distanceAmount;
    

    public destination(String entryPoint, String exitPoint) {
        this.entryPoint = entryPoint;
        this.exitPoint = exitPoint;
        this.distanceAmount = distance();
    }

    public String getEntryPoint() {
        return entryPoint;
    }
    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getExitPoint() {
        return exitPoint;
    }
    public void setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
    }

    public double getDistanceAmount() {
        return distanceAmount;
    }
    public void setDistanceAmount(double distanceAmount) {
        this.distanceAmount = distanceAmount;
    }

    private String route(){
        return entryPoint.toLowerCase() + "-" + exitPoint.toLowerCase();
    }

    private double distance() {
        String routeAmount = route();

        if (routeAmount.equals("tarlac-pampanga") || routeAmount.equals("pampanga-tarlac")) {
            return 50;
        } else if (routeAmount.equals("tarlac-nueva ecija") || routeAmount.equals("nueva ecija-tarlac")) {
            return 60;
        } else if (routeAmount.equals("pampanga-nueva ecija") || routeAmount.equals("nueva ecija-pampanga")) {
            return 80;
        } else {
            return 0;
        }
    }

    public double computeFare() {
        return distance();
    }
}