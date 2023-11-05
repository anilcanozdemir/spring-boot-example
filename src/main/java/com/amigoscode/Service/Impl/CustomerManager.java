package com.amigoscode.Service.Impl;

import com.amigoscode.Core.Result.DataResult;
import com.amigoscode.Core.Result.Result;
import com.amigoscode.Core.Result.SuccessDataResult;
import com.amigoscode.Core.Result.SuccessResult;
import com.amigoscode.DTO.CustomerResponseDto;
import com.amigoscode.DTO.CustomerSaveRequestDTO;
import com.amigoscode.DTO.CustomerUpdateDTO;
import com.amigoscode.Entity.Customer;
import com.amigoscode.ModelMapper.CustomerMapper;
import com.amigoscode.Repository.CustomerRepository;
import com.amigoscode.Service.Contrats.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerManager implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerManager(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public Result add(CustomerSaveRequestDTO customerSaveRequestDTO) {


        return new SuccessDataResult<>((customerRepository.save(customerMapper.saveRequestDtoToEntity(customerSaveRequestDTO))));

    }

    @Override
    public DataResult<CustomerResponseDto> deleteById(Integer id) {
        Optional<Customer> customer = this.customerRepository.findById(id);
        if (customer.isPresent()) {
            this.customerRepository.deleteById(id);
            return new SuccessDataResult<>(customerMapper.entitytoResponseDto(customer.get()));
        }
        return null;
    }

    @Override
    public DataResult<List<CustomerResponseDto>> getAll() {

        return new SuccessDataResult<>("Customer list called.", this.customerRepository.findAll().stream().map(customerMapper::entitytoResponseDto).toList());
    }

    @Override
    public DataResult<CustomerResponseDto> getById(Integer id) {
        /*TODO*/
        return this.customerRepository.findById(id).
                map(value -> new SuccessDataResult<>(customerMapper.entitytoResponseDto(value))).orElse(null);
    }

    @Override
    public Result updateById(CustomerUpdateDTO customerUpdateDTO) {
        /*TODO*/
        this.customerRepository.findById(customerUpdateDTO.getId()).
                map(customer -> customerRepository.save(customerMapper.updateRequestDtoEntity(customerUpdateDTO)));
        return new SuccessResult("Customer with id:"+customerUpdateDTO.getId()+" is updated.");

    }
}
