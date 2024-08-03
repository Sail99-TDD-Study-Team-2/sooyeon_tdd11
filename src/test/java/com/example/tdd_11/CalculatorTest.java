package com.example.tdd_11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.*;

@SpringBootTest
class CalculatorTest {

	@Test
	//void contextLoads() {
	//}
	void plus(){
		int result=Calculator.plus(1,2);
        //system.out.println(result);
		assertEquals(3,result);
	}


}
