package com.streamApi;

public class Employee {
private int eid;
private String eName;
private long eSalary;
public Employee(int eid, String eName, long eSalary) {
	super();
	this.eid = eid;
	this.eName = eName;
	this.eSalary = eSalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", eName=" + eName + ", eSalary=" + eSalary + "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public long geteSalary() {
	return eSalary;
}
public void seteSalary(long eSalary) {
	this.eSalary = eSalary;
}
}
