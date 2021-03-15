package fpt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fpt.model.Account;
import fpt.repository.AccountRepository;

public class LoginService {

	@Autowired
	private AccountRepository accountRepository;
	
//	public Account login(String username, String password) {
//		return accountRepository.findOneByAccountUsernameAndPassword(username, password);
//	}
//	
	public Account find(int id) {
		return accountRepository.findOne(id);
	}
	
//	public Account findOneByAccountId(int accountId) {
//		return accountRepository.findOneByAccountId(accountId).get(0);
//	}
	
	
}
