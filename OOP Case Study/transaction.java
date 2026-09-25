public class transaction {
    private String transactionID;
    private double vehicleToll;
    private double destinationAmount;
    private double totalAmount;
    private double paymentAmount;
    private double change;

    public transaction(String transactionID, double vehicleToll, double destinationAmount) {
        this.transactionID = transactionID;
        this.vehicleToll = vehicleToll;
        this.destinationAmount = destinationAmount;
        this.totalAmount = vehicleToll + destinationAmount;
    }

    public String getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public double getVehicleToll() {
        return vehicleToll;
    }
    public void setVehicleToll(double vehicleToll) {
        this.vehicleToll = vehicleToll;
    }

    public double getDestinationAmount() {
        return destinationAmount;
    }
    public void setDestinationAmount(double destinationAmount) {
        this.destinationAmount = destinationAmount;
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public double getPaymentAmount(){
        return paymentAmount;
    }
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public double getChange(){
        return change;
    }
    public void setChange(double change){
        this.change = change;
    }
}
