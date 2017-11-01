package com.dxesoft.xneza.security;

import com.dxesoft.xneza.entity.UserInfo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

/**
 * xneza, com.dxesoft.xneza.security . CustomUserDetails
 * Created by ernesto on 29/10/17.
 */
public class CustomUserDetails extends UserInfo implements UserDetails {

    public CustomUserDetails(UserInfo userInfo) {

    }

    private Set<GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return authorities;
    }

    @Override
    public String getUsername() {
        return super.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.getEnabled();
    }

    @Override
    public boolean isAccountNonLocked() {
        return super.getEnabled();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.getEnabled();
    }

    @Override
    public boolean isEnabled() {
        return super.getEnabled();
    }
}
