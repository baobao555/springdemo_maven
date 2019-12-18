package com.baobao.dao.impl;

import com.baobao.dao.IAccountDao;
import com.baobao.domain.Account;

/**
 * @author baobao
 * @create 2019-11-25 0:19
 * @description
 */
public class AccountDaoImpl implements IAccountDao {
    public Account findAccountById(Integer id) {
        return null;
    }

    public Account findAccountByName(String name) {
        return new Account(name,1000);
    }

    public void updateAccount(Account account) {
        float money = account.getMoney();
        String name = account.getName();
        System.out.println("name:" + name + "    money:" + money);
    }
}
