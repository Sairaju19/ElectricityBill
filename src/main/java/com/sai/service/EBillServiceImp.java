package com.sai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.model.EBill;
import com.sai.repo.EBillRepo;
@Service
public class EBillServiceImp implements EBillService {

	@Autowired
	private EBillRepo repo;
	@Override
	public EBill savBill(EBill ebill) {
		int units=0;
		double s_charge=120.0,total=0.0;
		units=ebill.getCurrent_reading()-ebill.getPrevious_reading();
		if(units<300)
		{
			total=units*1.75;
		}
		else if(units>=300 && units<700)
		{
			total=units*5.75;
		}
		else if(units>=700)
		{
			total=units*9.75;
		}
		ebill.setUnits(units);
		ebill.setService_charge(s_charge);
		ebill.setTotal_bill(total);
		EBill save=repo.save(ebill);
		return save;
	}

	@Override
	public EBill updateBill(EBill ebill, int cid) {
		EBill oldBill=repo.findById(cid).get();
		int units=0;
		double s_charge=120.0,total=0.0;
		units=ebill.getCurrent_reading()-ebill.getPrevious_reading();
		if(units<300)
		{
			total=units*1.75;
		}
		else if(units>=300 && units<500)
		{
			total=units*5.75;
		}
		else if(units>=500)
		{
			total=units*9.75;
		}
		oldBill.setCid(cid);
		oldBill.setCname(ebill.getCname());
		oldBill.setCurrent_reading(ebill.getCurrent_reading());
		oldBill.setPrevious_reading(ebill.getPrevious_reading());
		oldBill.setUnits(units);
		oldBill.setService_charge(s_charge);
		oldBill.setTotal_bill(total);
		return repo.save(oldBill);
	}

	@Override
	public EBill getOneBill(int cid) {
		EBill getOne=repo.findById(cid).get();
		return getOne;
	}

	@Override
	public void deleteBill(int cid) {
		repo.deleteById(cid);

	}

	@Override
	public List<EBill> getAllBills() {
		 List<EBill> getAll=repo.findAll();
		return getAll;
	}

}
