package fpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fpt.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	@Query("select a from Account a where a.accountId LIKE :accountId")
	Account findOneByAccountId( @Param("accountId") String accountId );
	
	Account findOneByAccountIdAndPassword( String accountId, String password );
	
	@Query("select a from AccountInfo a where a.Name LIKE :accountName")
	List<Account> findAllByAccountName( @Param("accountName") String accountName );
}
