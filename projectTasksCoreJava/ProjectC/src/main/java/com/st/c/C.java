package com.st.c;

import com.st.c.model.Creq;
import com.st.c.model.Cresp;

public class C {
	public Cresp m1(Creq creq) {
		System.out.println("entered into c");
		Cresp cresp=new Cresp();
		cresp.setStatus("good");
		System.out.println("exit c");
		return cresp;
		
	}

}
