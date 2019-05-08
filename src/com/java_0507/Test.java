package com.java_0507;

import com.java_0508.Test1Interface;
import com.java_0508.TestInterface;

public class Test implements TestInterface, Test1Interface { 
	// class를 상속할때는 extends >> 1개만 가능 
	// 인터페이스를 상속할때는 implements >> 여러개 가능

	@Override // 안에 내용을 재구성하기 위해 override 함
	public int add() {
		return 0;
	}
	
	@Override 
	public void add(int a) {
		System.out.println(a);
	}
	
	public void print() {
		
	}

}
