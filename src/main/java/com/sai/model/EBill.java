package com.sai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EBill {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cname;
	private int current_reading;
	private int previous_reading;
	private int units;
	private double total_bill;
	private double service_charge;
	public EBill() {
		super();
	}
	public EBill(int cid, String cname, int current_reading, int previous_reading, int units, double total_bill,
			double service_charge) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.current_reading = current_reading;
		this.previous_reading = previous_reading;
		this.units = units;
		this.total_bill = total_bill;
		this.service_charge = service_charge;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCurrent_reading() {
		return current_reading;
	}
	public void setCurrent_reading(int current_reading) {
		this.current_reading = current_reading;
	}
	public int getPrevious_reading() {
		return previous_reading;
	}
	public void setPrevious_reading(int previous_reading) {
		this.previous_reading = previous_reading;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(double total_bill) {
		this.total_bill = total_bill;
	}
	public double getService_charge() {
		return service_charge;
	}
	public void setService_charge(double service_charge) {
		this.service_charge = service_charge;
	}
	@Override
	public String toString() {
		return "EBill [cid=" + cid + ", cname=" + cname + ", current_reading=" + current_reading + ", previous_reading="
				+ previous_reading + ", units=" + units + ", total_bill=" + total_bill + ", service_charge="
				+ service_charge + "]";
	}
}
