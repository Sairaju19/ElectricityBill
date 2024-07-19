package com.sai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.model.EBill;
@Repository
public interface EBillRepo extends JpaRepository<EBill, Integer> {

}
