/**
 * 
 */
package com.dxc.secure.services;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.dxc.secure.entities.Client;

/**
 * @author lenovo
 *
 */
public class ClientPrinciple implements UserDetails {
	
	
	private Client client;
	
	public  ClientPrinciple(Client client) {
		
		this.client = client;
		
		
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		
		
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		
		//System.out.println(client.getPassword());
		// TODO Auto-generated method stub
		return client.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return client.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
