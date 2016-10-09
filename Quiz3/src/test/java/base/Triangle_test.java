package base;
 
import static org.junit.Assert.*;

import org.junit.Test;

public class Triangle_test {


		@Test
		public void test() {
			Triangle tri_1 = new Triangle();
			assertEquals(tri_1.getArea(), 0.43, 2);
			assertEquals(tri_1.getPerimeter(),3,0);
		}
		
		@Test
		public void test2() throws TriangleException{
			Triangle tri_2 = new Triangle(3, 4, 5);
			String x = tri_2.toString();
			
			assertEquals(tri_2.getArea(),6,0);
			assertEquals(tri_2.getPerimeter(),12,0);
			assertEquals(tri_2.getSide1(),3,0);
			assertEquals(tri_2.getSide2(),4,0);
			assertEquals(tri_2.getSide3(),5,0);
			System.out.println(x);
			//assertEquals(x, "base.Triangle@46238e3f");
		}

		@Test(expected=TriangleException.class)
		public void exception_test() throws TriangleException  {
			
			Triangle tri_1 = new Triangle(2, 2, 5);
			tri_1.getSide1();
			
			Triangle tri_2 = new Triangle(2, 5, 2);
			tri_2.getSide1();
			
			Triangle tri_3 = new Triangle(5, 2, 2);
			tri_3.getSide1();
			
			
		 	
			
		}
}
