package fpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fpt.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	@Query(value="select * from Account a where a.accountId LIKE :accountId", nativeQuery = true)
	List<Account> findOneByAccountId( @Param("accountId") int accountId );
	
	@Query(value="select * from Account a where a.name LIKE :accountName", nativeQuery = true)
	List<Account> findAllByAccountName( @Param("accountName") String accountName );
	
	@Query(value="select * from Account a where a.username LIKE :username and a.password LIKE :password", nativeQuery = true)
	List<Account> findAllByUsernameAndPassword( @Param("username") String username, @Param("password") String password);
	
	@Query(value="select * from Account a where a.username LIKE :username and a.password LIKE :password and a.deleteBy is null", nativeQuery = true)
	List<Account> findOneByUsernameAndPassword( @Param("username") String username, @Param("password") String password);
	
}
