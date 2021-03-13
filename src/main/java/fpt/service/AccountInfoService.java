package fpt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.model.AccountInfo;
import fpt.repository.AccountInfoRepository;


@Service
public class AccountInfoService {
	
	
	@Autowired
	private AccountInfoRepository accountInforepository;
	
	public List<AccountInfo> findAllAccountInfo(){
		return accountInforepository.findAll();
	}
	public AccountInfo findOneAccountInfoById(int accountInfoId) {
		return accountInforepository.findOne(accountInfoId);
	}
	public boolean addAccountInfo(AccountInfo accountInfo) {
		accountInfo.setAccountInfoId(0);
		return (accountInforepository.save(accountInfo) != null);
	}
	public boolean deleteAccountInfo(int accountInfoId) {
		if(accountInforepository.findOne(accountInfoId)!= null) {
			accountInforepository.delete(accountInfoId);
			return true;
		}
		else {
			return false;
		}	
	}
	public boolean  updateAccountInfo(AccountInfo accountinfo) {
		Integer result = accountInforepository.updateAccountInfo(accountinfo.getAccountInfoId(), accountinfo.getName(),
				java.sql.Date.valueOf(accountinfo.getBirthday().toString()), accountinfo.getEmail(), accountinfo.getPhone(),
				accountinfo.getGender());
		return result > 0 ? true :false;
	}
	

}
