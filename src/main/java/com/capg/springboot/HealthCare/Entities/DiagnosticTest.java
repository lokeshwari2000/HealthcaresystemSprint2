package com.capg.springboot.HealthCare.Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Diagnostic_Test")
public class DiagnosticTest {
@Id
@GeneratedValue
private int id;
private String testName;
private Double testPrice;
private String normalValue;
private String units;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTestName() {
	return testName;
}
public void setTestName(String testName) {
	this.testName = testName;
}
public Double getTestPrice() {
	return testPrice;
}
public void setTestPrice(Double testPrice) {
	this.testPrice = testPrice;
}
public String getNormalValue() {
	return normalValue;
}
public void setNormalValue(String normalValue) {
	this.normalValue = normalValue;
}
public String getUnits() {
	return units;
}
public void setUnits(String units) {
	this.units = units;
}



}

