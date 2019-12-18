package com.baobao.service.impl;

import com.baobao.dao.IAccountDao;
import com.baobao.domain.Account;
import com.baobao.service.IAccountService;

/**
 * @author baobao
 * @create 2019-11-25 0:13
 * @description
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public Account findById(int id) {
        return accountDao.findAccountById(id);
    }

    public void transfer(String sName, String tName, float money) {
        Account source = accountDao.findAccountByName(sName);
        Account target = accountDao.findAccountByName(tName);
        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney() + money);
        accountDao.updateAccount(source);
//        int i = 1 / 0;
        accountDao.updateAccount(target);
    }
}
