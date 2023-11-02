package com.amigoscode.Repository;

import com.amigoscode.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository<Customer,Integer> {

}
