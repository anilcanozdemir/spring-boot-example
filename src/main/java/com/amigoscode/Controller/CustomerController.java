package com.amigoscode.Controller;


import com.amigoscode.Core.Result.DataResult;
import com.amigoscode.Core.Result.Result;
import com.amigoscode.DTO.CustomerResponseDto;
import com.amigoscode.DTO.CustomerSaveRequestDTO;
import com.amigoscode.DTO.CustomerUpdateDTO;
import com.amigoscode.Service.Contrats.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController implements CRUDController<CustomerResponseDto, CustomerSaveRequestDTO, CustomerUpdateDTO> {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/add")
    @Override
    public ResponseEntity<Result> add(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO) {

        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.add(customerSaveRequestDTO));

    }

    @GetMapping("/getAll")
    @Override
    public ResponseEntity<DataResult<List<CustomerResponseDto>>> getAll() {

        return ResponseEntity.status(HttpStatus.FOUND).body(customerService.getAll());

    }

    @GetMapping("/getById")
    @Override
    public ResponseEntity<DataResult<CustomerResponseDto>> getById(@RequestParam Integer id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(customerService.getById(id));
    }

    @PutMapping("/updateById")
    @Override
    public ResponseEntity<Result> updateById(@RequestBody CustomerUpdateDTO customerUpdateDTO) {

        return ResponseEntity.status(HttpStatus.OK).body(customerService.updateById(customerUpdateDTO));
    }
    @DeleteMapping("deleteById")
    @Override
    public ResponseEntity<DataResult<CustomerResponseDto>> deleteById(@RequestParam Integer id) {
        /*TODO*/
        return ResponseEntity.status(HttpStatus.OK).body(customerService.deleteById(id));

    }
}
