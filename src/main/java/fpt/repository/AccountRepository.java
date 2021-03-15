package fpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fpt.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	@Query("select * from Account a where a.accountId LIKE :accountId")
	List<Account> findOneByAccountId( @Param("accountId") int accountId );
	
	Account findOneByAccountUsernameAndPassword( String username, String password );
	
	@Query("select a from AccountInfo a where a.Name LIKE :accountName")
	List<Account> findAllByAccountName( @Param("accountName") String accountName );
}
