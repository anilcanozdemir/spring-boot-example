package com.amigoscode.Controller;


import com.amigoscode.Entity.Customer;
import com.amigoscode.Repository.CustomerRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping("/add")
    void addCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }
}
