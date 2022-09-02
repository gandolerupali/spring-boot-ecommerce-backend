package org.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Authorities {

	@Id
	@GeneratedValue
	private int authorityId;
	private String authorityName;  //ADMIN
	private String authority;   //ADMIN_ROLE
	
	@ManyToOne
	@JoinColumn(name="username",referencedColumnName = "username")
	private User user;

	public int getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Authorities(int authorityId, String authorityName, String authority, User user) {
		super();
		this.authorityId = authorityId;
		this.authorityName = authorityName;
		this.authority = authority;
		this.user = user;
	}

	public Authorities() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
