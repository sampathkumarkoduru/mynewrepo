package com.capg.bankapp.dao;

import com.capg.bankapp.model.Account;
//the comment has been added 
public interface IAccountDao {

	public boolean saveAccount(Account account);

	public Account findAccount(int accountNo);
}
