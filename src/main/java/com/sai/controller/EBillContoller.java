package com.sai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.model.EBill;
import com.sai.service.EBillServiceImp;

@RestController
@CrossOrigin(origins = {"*"})
public class EBillContoller {

	@Autowired
	public EBillServiceImp service;
	@PostMapping("/save")
	public String saveBillData(@RequestBody EBill ebill) {
		EBill saveData=service.savBill(ebill);
		String message=null;
		if(saveData!=null)
		{
			message="Data Saved Successfully";
		}
		else
		{
			message="Data Is Failed";
		}
		return message;
	}
	@PutMapping("/update/{cid}")
	public EBill updateBill(@RequestBody EBill ebill,@PathVariable int cid) {
		EBill update=service.updateBill(ebill, cid);
		return update;
	}
	@GetMapping("/getOne/{cid}")
	public EBill getOneBill(@PathVariable int cid) {
		EBill get=service.getOneBill(cid);
		return get;
	}
	@DeleteMapping("/delete/{cid}")
	public void deleteBill(@PathVariable int cid) {
	service.deleteBill(cid);
	}
	@GetMapping("/getAll")
	public List<EBill> getAllBills(){
		List<EBill> getAllBills=service.getAllBills();
		return getAllBills;
	}
}
