package com.example.demo.util;

import org.modelmapper.ModelMapper;

public class ConverterHelper {
    private static final ModelMapper modelMapper;
    
    private ConverterHelper(){}
    
    static {
        try{
            modelMapper = new ModelMapper();
        }catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    
    public static <T, V> T convertObject(V sourceObject, Class<T> targetClass){
        return modelMapper.map(sourceObject, targetClass);
    }
}
