package com.sai.service;

import java.util.List;

import com.sai.model.EBill;

public interface EBillService {

	public EBill savBill(EBill ebill);
	public EBill updateBill(EBill ebill,int cid);
	public EBill getOneBill(int cid);
	public void deleteBill(int cid);
	public List<EBill> getAllBills();
}
