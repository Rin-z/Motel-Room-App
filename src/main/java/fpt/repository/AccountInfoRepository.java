package fpt.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import fpt.model.AccountInfo;



public interface AccountInfoRepository extends JpaRepository<AccountInfo, Integer> {

	
	@Transactional
	@Modifying
	@Query("update AccountInfo set name = :name , acountInfoId = :acountInfoId,birthday = :birthday,email = :email, gender = :gender, phone = :phone "
			+ " where accountInfoId =:accountInfoId")
	Integer updateAccountInfo(@Param("accountInfoId") int accountInfoId,@Param("name") String name,@Param("birthday") Date birthday,
			@Param("email") String email,@Param("phone") String phone,@Param("gender") int gender);


	


	
}
