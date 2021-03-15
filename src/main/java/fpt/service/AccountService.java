package fpt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.model.Account;
import fpt.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public Account findAllByName(String name) {
		if(!accountRepository.findAllByAccountName(name).isEmpty())
			return accountRepository.findAllByAccountName(name).get(0);
		else return null;
	}
	
	public Account findOne(int id) {
		return accountRepository.findOne(id);
	}
	
	public String findOneByAccountId(int accountId) {
		if(!accountRepository.findOneByAccountId(accountId).isEmpty()) {
			return accountRepository.findOneByAccountId(accountId).get(0).getName();
		}
		else return null;
	}
	
	public Account findAllByUsernameAndPassword(String username, String password) {
		if(!accountRepository.findAllByUsernameAndPassword(username, password).isEmpty()) {
			return accountRepository.findAllByUsernameAndPassword(username, password).get(0);
		}
		else return null;
	}
	
	public Account findOneByUsernameAndPassword(String username, String password) {
		if(!accountRepository.findOneByUsernameAndPassword(username, password).isEmpty()) {
			return accountRepository.findOneByUsernameAndPassword(username, password).get(0);
		}
		else return null;
	}
	
}
