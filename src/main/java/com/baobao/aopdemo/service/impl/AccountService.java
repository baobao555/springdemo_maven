package com.baobao.aopdemo.service.impl;

import com.baobao.aopdemo.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * @author baobao
 * @create 2019-11-24 10:39
 * @description
 */
@Service("accountService")
public class AccountService implements IAccountService {
    public void saveAccount() {
        System.out.println("保存账户");
        //int i = 1 / 0;
    }
}
