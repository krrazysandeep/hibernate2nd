package com.nt.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
private int hno;
private String hname;
private String hlandmark;
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public String getHlandmark() {
	return hlandmark;
}
public void setHlandmark(String hlandmark) {
	this.hlandmark = hlandmark;
}
@Override
public String toString() {
	return "Address [hno=" + hno + ", hname=" + hname + ", hlandmark=" + hlandmark + "]";
}



}
