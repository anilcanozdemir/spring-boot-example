package com.amigoscode.Service.Contrats;

import com.amigoscode.Core.Result.DataResult;
import com.amigoscode.Core.Result.Result;

import java.util.List;

public interface CRUDService<EntityResponseDto, EntitySaveRequestDto, EntityUpdateRequestDto> {

    Result add(EntitySaveRequestDto entitySaveRequestDto);

    DataResult<EntityResponseDto> deleteById(Integer id);

    DataResult<List<EntityResponseDto>> getAll();

    DataResult<EntityResponseDto> getById(Integer id);

    Result updateById(EntityUpdateRequestDto entityUpdateRequestDto);
}
