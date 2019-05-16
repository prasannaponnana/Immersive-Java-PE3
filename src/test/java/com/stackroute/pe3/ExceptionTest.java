import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExceptionTest {
    Exception app;


    @Before
    public void setUp() {
        //arrange
        app = new Exception();


    }

    @After
    public void tearDown() {
        //arrange
        app = null;


    }

    @Test
    public void ArithmeticException() { //Not asked in P.e 3


        //act
        String result = app.ArithmeticException(3, 0);

        //assert
        assertEquals("Can't divide a number by 0", result);
    }

    @Test
    public void NegativeArraySizeException() { ////Not asked in P.e 3


        //act
        String result = app.NegativeArraySizeException(-8);

        //assert
        assertEquals("Can't create array of negative size", result);
    }


    @Test
    public void NullPointerException() {


        //act
        String result = app.NullPointerException(0);
        //assert
        assertEquals("NullPointerException..", result);
    }

    @Test
    public void ArrayIndexOutOfBound() {


        //act
        String result = app.ArrayIndexOutOfBound(5);
        //assert
        assertEquals("Wrong index number, please enter correct number. ", result);
    }
    @Test
    public void StringIndexOutOfBoundsException() {


        //act
        String result = app.StringIndexOutOfBoundsException(5);
        //assert
        assertEquals("Wrong character index number, please enter correct number. ", result);
    }




}