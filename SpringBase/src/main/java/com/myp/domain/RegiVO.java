package com.myp.domain;



public class RegiVO {
	
	private String id;
	private String pass;
	private String repass;
	
	@Override
	public String toString() {
		return "ReigVo [id=" + id + ", pass=" + pass + ", repass=" + repass + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRepass() {
		return repass;
	}
	public void setRepass(String repass) {
		this.repass = repass;
	}
	
	
	

}
