package com.ux.gs2n.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class MapperJsonImp implements IMapperJson {
    private static MapperJsonImp mapperJson;
    private ObjectMapper mapper;
    public static MapperJsonImp getInstance() {
        return mapperJson == null ? (mapperJson = new MapperJsonImp()) : mapperJson;
    }

    public String mapToJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            System.out.println("MapperJsonImp >> Lỗi khi chuyển đổi sang json");
            throw new RuntimeException(e);
        }
    }
}
