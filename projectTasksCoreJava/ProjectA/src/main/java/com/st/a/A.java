package com.st.a;

import com.st.a.model.Areq;
import com.st.a.model.Aresp;
import com.st.b.B;
import com.st.b.model.Breq;
import com.st.b.model.Bresp;

public class A {
	public Aresp m1(Areq areq) {
		System.out.println("entered a");
		//1.get the areq from client
		//2.prepare the  breq using areq
		Breq breq=new Breq();
		breq.setOid(areq.getOid());
		breq.setOname(areq.getOname());
		//3.call b and get the b response
		B b=new B();
		Bresp bresp=b.m1(breq);

		//4 .prepare the aresp with the help of bresp
		Aresp aresp=new Aresp();
		aresp.setStatus(bresp.getStatus());
		//5.return aresp
		System.out.println("exit a");

		return aresp;

	}

}
