package com.st;

import com.st.a.A;
import com.st.a.model.Areq;
import com.st.a.model.Aresp;

public class Aclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		Areq areq=new Areq();
		areq.setOname("koti");
		areq.setOid("12334");
		Aresp aresp=a.m1(areq);
		System.out.println("asresof   :"+aresp);

	}

}
