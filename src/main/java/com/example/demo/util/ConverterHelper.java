package com.example.demo.util;

import org.modelmapper.ModelMapper;

public class ConverterHelper {
    private static final ModelMapper modelMapper = new ModelMapper();
    
    private ConverterHelper(){}
    
    public static <T, V> T convertDtoToEntity(V dtoObject, Class<T> targetClass){
        return modelMapper.map(dtoObject, targetClass);
    }
}
