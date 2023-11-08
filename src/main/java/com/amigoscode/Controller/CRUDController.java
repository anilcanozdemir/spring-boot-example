package com.amigoscode.Controller;

import com.amigoscode.Core.Result.DataResult;
import com.amigoscode.Core.Result.Result;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CRUDController <EntityResponseDto, EntitySaveRequestDto, EntityUpdateRequestDto> {
    public ResponseEntity<Result> add(EntitySaveRequestDto entitySaveRequestDto);

    public ResponseEntity<DataResult<List<EntityResponseDto>>> getAll();

    public ResponseEntity<DataResult<EntityResponseDto>> getById(Integer id);

    public ResponseEntity<Result> updateById(EntityUpdateRequestDto entityUpdateRequestDto);

    public ResponseEntity<DataResult<EntityResponseDto>> deleteById(Integer id);
}
