package fpt.service;

import org.springframework.beans.factory.annotation.Autowired;

import fpt.repository.AccountStatusRepository;

public class AccountStatusService {
	
	@Autowired
	private AccountStatusRepository accountStatusRepository;
	
	public String findNameByAccstatusid( String accStatusId ) {
		return accountStatusRepository.findOneByAccountstatusid(accStatusId).getAccountStatusName();
	}
	
}
