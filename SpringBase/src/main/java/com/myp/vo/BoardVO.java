package com.myp.vo;

public class BoardVO {
	
	private String empno;
	private	String ename;
	private	String job;
	private	String mgr;
	private	String hiredate;
	private	String sal;
	private	String signal;
	private	String deptno;
	private String id;
	
	@Override
	public String toString() {
		return "MemberVO [empno=" + empno + ", ename=" + ename + ", job=" +job + ", mgr=" + mgr + ", "
				+ "hiredate=" + hiredate + ", sal=" + sal + ", signal=" + signal + ", deptno=" + deptno +"]";
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}