package com.ty.ContactApp;

import java.util.Objects;

public class Contact {
String cname;
long cno;
public Contact(String cname, long cno) {
	super();
	this.cname = cname;
	this.cno = cno;
}
@Override
public String toString() {
	return "Contact [cname=" + cname + ", cno=" + cno + "]";
}
@Override
public int hashCode() {
	return Objects.hash(cname, cno);
}
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!(obj instanceof Contact)) {
		return false;
	}
	Contact other = (Contact) obj;
	return Objects.equals(cname, other.cname) && cno == other.cno;
}
}
