package com.electricity.controller;

import com.electricity.model.Bill;
import com.electricity.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping
    public List<Bill> getAllBills() {
        return billService.getAllBills();
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable("id") int id) {
        return billService.getBillById(id);
    }

    @PostMapping
    public Bill addBill(@RequestBody Bill bill) {
        return billService.addBill(bill);
    }

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable("id") int id, @RequestBody Bill bill) {
        return billService.updateBill(id, bill);
    }

    @DeleteMapping("/{id}")
    public String deleteBill(@PathVariable("id") int id) {
        billService.deleteBill(id);
        return "Bill deleted!";
    }
}
