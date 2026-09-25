public abstract class vehicle {
	private String plateNumber;
	private String vehicleType;

	public vehicle(String plateNumber, String vehicleType) {
		this.plateNumber = plateNumber;
		this.vehicleType = vehicleType;
	}

	public String getPlateNumber() {
		return plateNumber;
	}
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

	public String getVehicleType() {
		return vehicleType;
	}
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;   
    }

    public abstract double computeToll();
    public abstract String getLaneCode();
}

class motorcycle extends vehicle {
    private int engineCC;

	motorcycle(String plateNumber, String vehicleType, int engineCC) {
		super(plateNumber, vehicleType);
		this.engineCC = engineCC;
	}

    public int getEngineCC() {
        return engineCC;
    }
    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public double computeToll() {
        if (engineCC < 400) {
            return 0.00;
        }
        int ccPrice = (engineCC - 400) / 50;
        return 50.00 + (ccPrice * 2);
    }

    @Override 
    public String getLaneCode(){
        return "L1";
    }
}

class car extends vehicle {
    private String carModel;
	car(String plateNumber, String vehicleType, String carModel) {
		super(plateNumber, vehicleType);
		this.carModel = carModel;
	}

    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public double computeToll() {
        if (carModel.equalsIgnoreCase("sedan")) {
            return 100.00;
        } else if (carModel.equalsIgnoreCase("SUV")) {
            return 110.00;
        } else if (carModel.equalsIgnoreCase("sport")) {
            return 150.00;
        } else {
            return 0.00;
        }
    }

    @Override 
    public String getLaneCode(){
        return "L2";
    }
}

class bus extends vehicle {
    private String serviceType;
    private String comfortClass;

	bus(String plateNumber, String vehicleType, String serviceType, String comfortClass) {
		super(plateNumber, vehicleType);
		this.serviceType = serviceType;
		this.comfortClass = comfortClass;
	}

    public String getServiceType() {
        return serviceType;
    }
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getComfortClass() {
        return comfortClass;
    }
    public void setComfortClass(String comfortClass) {
        this.comfortClass = comfortClass;
    }

    @Override
    public double computeToll() {
        if (serviceType.equalsIgnoreCase("public") && comfortClass.equalsIgnoreCase("economy")) {
            return 100.00;
        } else if (serviceType.equalsIgnoreCase("public") && comfortClass.equalsIgnoreCase("business")) {
            return 110.00;
        } else if (serviceType.equalsIgnoreCase("private") && comfortClass.equalsIgnoreCase("economy")) {
            return 150.00;
        } else if (serviceType.equalsIgnoreCase("private") && comfortClass.equalsIgnoreCase("business")) {
            return 160.00;
        } else {
            return 0.00;
        }
    }

    @Override 
    public String getLaneCode(){
        return "L3";
    }
}
class truck extends vehicle {
    private int numberOfAxles;
    private double cargoWeight;
	truck(String plateNumber, String vehicleType, int numberOfAxles, double cargoWeight) {
		super(plateNumber, vehicleType);
		this.numberOfAxles = numberOfAxles;
		this.cargoWeight = cargoWeight;
	}

    public int getNumberOfAxles() {
        return numberOfAxles;
    }
    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }
    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double computeToll() {
        double toll = 0.0;
        if (numberOfAxles <= 2) {
            toll = 100.00;
        } else if (numberOfAxles == 3) {
            toll = 120.00;
        } else if (numberOfAxles >= 4) {
            toll = 150.00;
        }

        if (cargoWeight > 1000) {
            toll += 50.00; 
        }
        return toll;
    }

    @Override 
    public String getLaneCode(){
        return "L4";
    }
}