package com.amigoscode.Service.Impl;

import com.amigoscode.Core.Result.DataResult;
import com.amigoscode.Core.Result.Result;
import com.amigoscode.DTO.CustomerResponseDto;
import com.amigoscode.DTO.CustomerSaveRequestDTO;
import com.amigoscode.DTO.CustomerUpdateDTO;
import com.amigoscode.Service.Contrats.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {
    @Override
    public Result add(CustomerSaveRequestDTO customerSaveRequestDTO) {
        /*TODO*/
        return null;
    }

    @Override
    public DataResult<CustomerResponseDto> deleteById(Long id) {
        /*TODO*/

        return null;
    }

    @Override
    public DataResult<List<CustomerResponseDto>> getAll() {
        /*TODO*/

        return null;
    }

    @Override
    public DataResult<CustomerResponseDto> getById(Long id) {
        /*TODO*/

        return null;
    }

    @Override
    public Result updateById(CustomerUpdateDTO customerUpdateDTO) {
        /*TODO*/

        return null;
    }
}
