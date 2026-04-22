package com.electricity.service;

import com.electricity.model.Bill;
import com.electricity.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    BillRepository billRepository;

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    public Bill getBillById(int id) {
        return billRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bill not found with id: " + id));
    }

    public Bill addBill(Bill bill) {
        return billRepository.save(bill);
    }

    public Bill updateBill(int id, Bill bill) {
        bill.setId(id);
        return billRepository.save(bill);
    }

    public void deleteBill(int id) {
        billRepository.deleteById(id);
    }
}
