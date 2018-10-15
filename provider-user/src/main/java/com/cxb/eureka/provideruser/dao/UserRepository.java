package com.cxb.eureka.provideruser.dao;

import com.cxb.eureka.provideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author chenxiaobin
 * @description
 * @create 2018/10/12
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
