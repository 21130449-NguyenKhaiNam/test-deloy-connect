package com.ux.gs2n.controller;

import com.ux.gs2n.dao.properties.PathApiDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Giúp qui định đường dẫn cha của các api,
 * không gọi trực tiếp các lớp lấy đường dẫn được cần truyền tham số vào annotation
 * dạng biến static final
 */
public interface IPathApi {
    String PATH_AUTH = "/api/auth";
}
