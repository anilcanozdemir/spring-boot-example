package com.amigoscode.Core.ModelMapper;

import com.amigoscode.DTO.CustomerResponseDto;
import com.amigoscode.DTO.CustomerSaveRequestDTO;
import com.amigoscode.DTO.CustomerUpdateDTO;
import com.amigoscode.Entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper implements MapperProfile<CustomerResponseDto, CustomerSaveRequestDTO, CustomerUpdateDTO, Customer>{
    @Override
    public CustomerResponseDto entitytoResponseDto(Customer customer) {
       return new CustomerResponseDto(customer.getId(), customer.getName(), customer.getEmail(), customer.getAge());
    }

    @Override
    public Customer saveRequestDtoToEntity(CustomerSaveRequestDTO customerSaveRequestDTO) {
        Customer customer=new Customer();
        customer.setAge(customerSaveRequestDTO.getAge());
        customer.setEmail(customerSaveRequestDTO.getEmail());
        customer.setName(customerSaveRequestDTO.getName());
        return customer;
    }

    @Override
    public Customer updateRequestDtoEntity(CustomerUpdateDTO customerUpdateDTO) {
        Customer customer=new Customer();
        customer.setId(customerUpdateDTO.getId());
        customer.setAge(customerUpdateDTO.getAge());
        customer.setEmail(customerUpdateDTO.getEmail());
        customer.setName(customerUpdateDTO.getName());
        return customer;
    }
}
