package com.st.b;


import com.st.b.model.Breq;
import com.st.b.model.Bresp;
import com.st.c.C;
import com.st.c.model.Creq;
import com.st.c.model.Cresp;

public class B {
	public Bresp m1(Breq breq) {
		System.out.println("entered b");
		//1.get the breq from PROJECT A
		//2.prepare the  Creq using Breq
		Creq creq=new Creq();
		creq.setOid(breq.getOid());
		creq.setOname(breq.getOname());
		//3.call C and get the C response
		C c=new C();
		Cresp cresp=c.m1(creq);

		//4 .prepare the aresp with the help of bresp
		Bresp bresp=new Bresp();
		bresp.setStatus(cresp.getStatus());
		//5.return aresp
		System.out.println("exit b");

		return bresp;
	}

}
