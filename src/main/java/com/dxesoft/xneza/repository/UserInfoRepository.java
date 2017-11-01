package com.dxesoft.xneza.repository;

import com.dxesoft.xneza.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * xneza, com.dxesoft.xneza.repository . UserInfoRepository
 * Created by ernesto on 29/10/17.
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    Optional<UserInfo> findByUserNameAndEnabled(String userName, Boolean enabled);
}
