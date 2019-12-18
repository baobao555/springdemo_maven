package com.baobao.demo.service;

import com.baobao.demo.dao.DaoImpl;
import com.baobao.demo.dao.IDao;

/**
 * @author baobao
 * @create 2019-11-23 10:52
 * @description
 */
public class ServiceImpl implements IService {
    private IDao dao = new DaoImpl();

    public void saveData() {
        dao.insert();
    }
}
