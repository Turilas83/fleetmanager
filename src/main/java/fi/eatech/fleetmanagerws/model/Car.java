package fi.eatech.fleetmanagerws.model;

public class Car {
	Long id;
	String make;
	String model;
	String registration;
	int year;
	String inspectionDate;
	int engineSize;
	int enginePower;
		
	public Car() {}
	
	public Car(Long id, String make, String model, String registration, int year, String inspectionDate, int engineSize, int enginePower) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.registration = registration;
		this.year = year;
		this.inspectionDate = inspectionDate;
		this.engineSize = engineSize;
		this.enginePower = enginePower;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
}
