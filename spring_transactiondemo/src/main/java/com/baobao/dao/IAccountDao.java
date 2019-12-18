package com.baobao.dao;

import com.baobao.domain.Account;

/**
 * @author baobao
 * @create 2019-11-25 0:14
 * @description
 */
public interface IAccountDao {
    Account findAccountById(Integer id);

    Account findAccountByName(String name);

    void updateAccount(Account account);
}
