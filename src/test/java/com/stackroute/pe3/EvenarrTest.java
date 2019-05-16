import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class EvenarrTest {




    Evenarr p=new Evenarr();
    int[] as={2,21,32};

    @Test
    public void evenTest1()
    {

        String[] s=p.isEven(as);
        String[] a={"even","odd","even"};

        assertArrayEquals(a,s);

    }

    @Test
    public void primeTest2()
    {
        int[] pr={4,17,19};
        int[] s=p.isPrim(pr);
        int[] c={4};
        assertArrayEquals(c,s);
    }
    @Test
    public void reverseTest3()
    {
        int[] s=p.isRev(as);
        int[] a={32,21,2};
        assertArrayEquals(a,s);
    }

}