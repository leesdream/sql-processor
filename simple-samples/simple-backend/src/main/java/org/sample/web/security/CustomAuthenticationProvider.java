package org.sample.web.security;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import org.sample.model.User;
import org.sample.web.app.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private UserService userService;
    public static final String ALGORITHM_MD5 = "MD5";

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        logger.info("Authentication user:" + username);
        User user;

        try {
            user = userService.getUser(new User()._setUsername(username), null);
        } catch (Exception e) {
            throw new AuthenticationServiceException(e.getMessage());
        }

        if (user == null) {
            throw new UsernameNotFoundException("Username not found");
        }
        if (user.getPassword().equals(encryptUserPassword(password))) {
            logger.info("Authentication successful");
            List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
            grantedAuths.add(new SimpleGrantedAuthority(user.getRole().getName()));
            Authentication auth = new UsernamePasswordAuthenticationToken(username, password, grantedAuths);
            return auth;
        } else {
            throw new BadCredentialsException("The username or password you entered is incorrect.");
        }
    }

    public String encryptUserPassword(String password) {
        try {
            final MessageDigest md = MessageDigest.getInstance(ALGORITHM_MD5);
            md.update(password.getBytes("UTF-8"));
            byte[] securePassword = md.digest();
            return bytes2hex(securePassword);
        } catch (Exception e) {
            logger.error("!! ERROR encrypt password", e);
            throw new RuntimeException(e);
        }
    }

    private final String bytes2hex(byte[] value) {
        if (value == null)
            return null;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            if ((value[i] <= 0x0F) && (value[i] >= 0))
                result.append('0');
            result.append(Integer.toHexString(value[i] & 0xFF));
        }
        return result.toString();
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    @Required
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}