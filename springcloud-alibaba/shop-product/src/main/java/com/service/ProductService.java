package com.service;

import com.Product;

/**
 * @program: springcloud-alibaba
 * @Date: 2020-06-12 21:46
 * @Author: code1990
 * @Description:
 */
public interface ProductService {

    public Product getProductByPid(Integer pid);
}
