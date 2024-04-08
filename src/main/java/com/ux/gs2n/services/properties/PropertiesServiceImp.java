package com.ux.gs2n.services.properties;

import com.ux.gs2n.dao.properties.IManagerEnumPath;
import com.ux.gs2n.dao.properties.PathApiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertiesServiceImp implements IPropertiesService {
    @Autowired
    private PathApiDao dao;
    private static PropertiesServiceImp service;
    private PropertiesServiceImp() {}
    public static PropertiesServiceImp getInstance() {
        return service == null ? (service = new PropertiesServiceImp()) : service;
    }

    public String getPathApi(IManagerEnumPath e) {
        return dao.getPath(e);
    }
}
