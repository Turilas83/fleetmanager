package fi.eatech.fleetmanagerws.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Car {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Long id;
	String make;
	String model;
	String registration;
	Integer year;
	@JsonFormat(pattern = "yyyy-MM-dd")
	Date inspectionDate;
	Integer engineSize;
	Integer enginePower;
		
	public Car() { }
	
	public Car(Long id, String make, String model, String registration, Integer year, Date inspectionDate, Integer engineSize, Integer enginePower) {
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Date getInspectionDate() {
		return inspectionDate;
	}

	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	} 

	public Integer getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(Integer engineSize) {
		this.engineSize = engineSize;
	}

	public Integer getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(Integer enginePower) {
		this.enginePower = enginePower;
	}

}
