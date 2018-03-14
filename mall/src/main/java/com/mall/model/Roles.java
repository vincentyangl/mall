package com.mall.model;

import java.util.List;

public class Roles {

	private int roleId;
	private String roleName;
	private List<Powers> powers;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<Powers> getPowers() {
		return powers;
	}
	public void setPowers(List<Powers> powers) {
		this.powers = powers;
	}
	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", powers=" + powers + "]";
	}
	
	
}
