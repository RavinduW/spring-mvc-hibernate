package com.wdr.springmvc.controllers;

import com.wdr.springmvc.models.Customer;
import com.wdr.springmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model){

        List<Customer> listOfCustomers = customerService.getCustomers();

        model.addAttribute("customers",listOfCustomers);

        return "listCustomers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        Customer newCustomer = new Customer();

        model.addAttribute("customer",newCustomer);

        return "addCustomerForm";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){

        customerService.saveCustomer(customer);

        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String getUpdateForm(@RequestParam("customerId") int id, Model model){

        Customer customer = customerService.getCustomerById(id);

        model.addAttribute("customer",customer);

        return "updateFormCustomer";
    }

    @PostMapping("updateCustomer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer){

        customerService.updateCustomer(customer);

        return "redirect:/customer/list";
    }

}
