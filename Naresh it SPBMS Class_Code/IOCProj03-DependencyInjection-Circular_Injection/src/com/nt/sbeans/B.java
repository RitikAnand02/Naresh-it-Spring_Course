package com.nt.sbeans;

public class B {
private A a;

public void setA(A a) {
System.out.println("B:: setA(-)");
this.a=a;
}

//toString()
public String toString() {
return "From B spring bean";
}
}
