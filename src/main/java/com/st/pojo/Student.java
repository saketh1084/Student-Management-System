package com.st.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="studenntdata")
public class Student {
	@Id
	private int sid;
	private String fullname;
	private int sub1;
	private int sub2;
	private int sub3;
	private int total;
	private double percentage;
	private String grade;
	public Student() {
		super();
	}
	public Student(int sid, String fullname, int sub1, int sub2, int sub3, int total, double percentage, String grade) {
		super();
		this.sid = sid;
		this.fullname = fullname;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total;
		this.percentage = percentage;
		this.grade = grade;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fullname=" + fullname + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ ", total=" + total + ", percentage=" + percentage + ", grade=" + grade + "]";
	}
	
}
	
