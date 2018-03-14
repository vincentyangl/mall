package com.mall.model;

import java.util.List;

public class Powers {

	private int pid;
	private String powerName;
	private String url;
	private int type;
	private int powerId;
	private List<Roles> roles;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPowerName() {
		return powerName;
	}
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getPowerId() {
		return powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Powers [pid=" + pid + ", powerName=" + powerName + ", url=" + url + ", type=" + type + ", powerId="
				+ powerId + ", roles=" + roles + "]";
	}
	
	
	
}
