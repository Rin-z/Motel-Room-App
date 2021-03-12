package fpt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fpt.model.Account;
import fpt.repository.AccountRepository;

public class LoginService {

	@Autowired
	private AccountRepository accountRepository;
	
	private String login(Account account) {
		return accountRepository.findOneByAccountIdAndPassword(account.getAccountId(), account.getPassword()).getAccountId();
	}
	
	private String findOneByAccountId(String accountId) {
		return accountRepository.findOneByAccountId(accountId).getAccountId();
	}
	
	//private List<Account>
}
