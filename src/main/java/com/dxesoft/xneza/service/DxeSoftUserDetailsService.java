package com.dxesoft.xneza.service;

import com.dxesoft.xneza.entity.UserInfo;
import com.dxesoft.xneza.repository.UserInfoRepository;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * xneza, com.dxesoft.xneza.service . DxeSoftUserDetailsService
 * Created by ernesto on 29/10/17.
 */
@Service
public class DxeSoftUserDetailsService implements UserDetailsService {

    private final Logger log = LoggerFactory.getLogger(DxeSoftUserDetailsService.class);

    private final UserInfoRepository userInfoRepository;

    @Autowired
    public DxeSoftUserDetailsService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        log.debug("Request to loadUserByUserName with userName: {}", userName);
        Validate.notBlank(userName, "userName can not be null nor empty");

        Optional<UserInfo> optionalUserInfo = userInfoRepository.findByUserNameAndEnabled(userName, Boolean.TRUE);

        if (optionalUserInfo.isPresent()) {
            UserInfo userInfo = optionalUserInfo.get();

            final Set<GrantedAuthority> authorities = new HashSet<>(userInfo.getRoles().size());

            userInfo.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getRoleName())));

            return new User(userInfo.getUserName(), userInfo.getPassword(), authorities);

        } else {
            throw new UsernameNotFoundException("No user present with username: " + userName);
        }
    }
}
