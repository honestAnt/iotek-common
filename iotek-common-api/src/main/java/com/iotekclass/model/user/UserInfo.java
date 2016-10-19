package com.iotekclass.model.user;

import com.iotekclass.common.BaseEntity;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tb_user")
public class UserInfo extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 730863452165463427L;

	private String username;
	private String password;
	private String teleNumber;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTeleNumber() {
		return teleNumber;
	}

	public void setTeleNumber(String teleNumber) {
		this.teleNumber = teleNumber;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}