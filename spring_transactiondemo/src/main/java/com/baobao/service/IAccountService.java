package com.baobao.service;

import com.baobao.domain.Account;

/**
 * @author baobao
 * @create 2019-11-25 0:09
 * @description
 */
public interface IAccountService {
    Account findById(int id);

    void transfer(String sName,String tName,float money);
}
