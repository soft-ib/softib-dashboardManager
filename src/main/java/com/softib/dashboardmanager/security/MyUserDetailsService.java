package com.softib.dashboardmanager.security;

import com.softib.dashboardmanager.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService  {


	@Autowired
	private JwtUtil jwtUtil;
	

	@Override
	public UserDetails loadUserByUsername(String jwt) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		   if (jwt == null ) {
	        	throw new UsernameNotFoundException("user not found");
	        }
		   String username =jwtUtil.extractUsername(jwt);
		   String role =jwtUtil.extractRole(jwt);
		   List<GrantedAuthority> authorities = new ArrayList<>();
	       authorities.add(new SimpleGrantedAuthority(role));
		return new User(username, "", authorities);
	}

}
