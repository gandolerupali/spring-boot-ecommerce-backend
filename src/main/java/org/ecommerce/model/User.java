package org.ecommerce.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
public class User implements Serializable{

	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String email;
	private String userType;
	private String password;
	private boolean isEnabled;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade =CascadeType.ALL)
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})

	private List<Authorities> roles;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade =CascadeType.ALL)
	private Address address;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public List<Authorities> getRoles() {
		return roles;
	}

	public void setRoles(List<Authorities> roles) {
		this.roles = roles;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(int userId, String userName, String email, String userType, String password, boolean isEnabled,
			List<Authorities> roles, Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.userType = userType;
		this.password = password;
		this.isEnabled = isEnabled;
		this.roles = roles;
		this.address = address;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", userType=" + userType
				+ ", password=" + password + ", isEnabled=" + isEnabled + ", roles=" + roles + ", address=" + address
				+ "]";
	}
	
	
	
	
}
