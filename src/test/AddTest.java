package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import misc.Add;

class AddTest {

	
	Add add;

    @BeforeEach                                         
    void setUp() {
        add = new Add();
    }
    
	@Test
	void test() {
		assertEquals(add.add(2, 5), 7);
	}

}
