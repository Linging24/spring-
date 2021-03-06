package com.linging.service;

import com.linging.pojo.Account;

import java.util.List;

public interface AccountService {

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);
    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);
    /**
     * 删除账户
     * @param accountId
     */
    void deleteAccount(Integer accountId);
    /**
     * 根据 id 查询账户
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);
    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 转账
     * @param userA 转出
     * @param userB 转入
     * @param money 钱
     */
     void transfer(String userA, String userB, float money);

}
