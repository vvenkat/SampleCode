import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.Before;
import org.junit.Test;

public class BiggestNumberTest {
    
    static BiggestNumber bigNum;
    static int finalVal;
    static int expected;

  /* BiggestNumber bigNum = new BiggestNumber(456527);
   int finalVal = bigNum.execute();
   int expected = 765541;*/
   
  @BeforeClass
  public static void setUp(){
      bigNum = new BiggestNumber(456527);
      finalVal = bigNum.execute();
      expected = 765542;
      
  }
   
   @Test
   public void testExecute() {
       assertEquals(finalVal, expected);
   }
  
   
    @Test
   public void testConvertDigitsToNum() {
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       int num = 1234;
       assertEquals( num, bigNum.convertDigitsToNum(list));
       
       
   }
  

   /* @Test
    //Not sure if this is needed because main method does not do much
    public void testMain() {
        fail("Not yet implemented");
    }

    @Test
    public void testBiggestNumber() {
        fail("Not yet implemented");
    }

    

    @Test
    public void testConvertDigitsToNum() {
        fail("Not yet implemented");
    }

    @Test
    public void testSortDescendingOrder() {
        fail("Not yet implemented");
    }

    @Test
    public void testPrintAllDigits() {
        fail("Not yet implemented");
    }

    @Test
    public void testConvertNumberToDigits() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetDigits() {
        fail("Not yet implemented");
    }*/

}
