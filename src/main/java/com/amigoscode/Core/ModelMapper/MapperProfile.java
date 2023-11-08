package com.amigoscode.Core.ModelMapper;

public interface MapperProfile<ResponseDto,SaveRequestDto,UpdateRequestDto,Entity>{
    ResponseDto entitytoResponseDto(Entity entity);
    Entity saveRequestDtoToEntity(SaveRequestDto saveRequestDto);

    Entity updateRequestDtoEntity(UpdateRequestDto updateRequestDto);

}
