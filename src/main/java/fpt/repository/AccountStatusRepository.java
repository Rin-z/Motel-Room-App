package fpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fpt.model.AccountStatus;

public interface AccountStatusRepository extends JpaRepository<AccountStatus, Integer> {
	
	@Query("select a from AccountStatus a where a.accountStatusName LIKE :accstatusId")
	AccountStatus findOneByAccountstatusid( @Param("accstatusId") String id);
	
}
