package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.UserModel;

import jakarta.transaction.Transactional;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

	@Query(value="select * from user_table where skills=:s",nativeQuery = true)
	public List<UserModel> getinfobyskills(@Param("s") String wskills);
	
	@Query(value="select * from user_table where uid=:s or uname=:sn",nativeQuery=true)
	public List<UserModel> getinfobygen(@Param("s") int uid,@Param("sn") String uname);
	

	@Query(value="delete from user_table where uid=:s",nativeQuery = true)
	public int deleteUserInfo(@Param("s") int uid);
	
	@Modifying
	@Transactional
	@Query(value="update user_table set uid=?1 where uid=?2",nativeQuery=true)
	public int updateUserInfo(int newid,int oldid);
	
}
