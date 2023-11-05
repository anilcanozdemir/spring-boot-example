package com.amigoscode.Service.Contrats;

import com.amigoscode.DTO.CustomerResponseDto;
import com.amigoscode.DTO.CustomerSaveRequestDTO;
import com.amigoscode.DTO.CustomerUpdateDTO;

public interface CustomerService extends CRUDService<CustomerResponseDto, CustomerSaveRequestDTO, CustomerUpdateDTO> {
}
