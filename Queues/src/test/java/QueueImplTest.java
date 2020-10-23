
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueImplTest {
    Queue<String> q;

    @Before
    public void setUp() throws Exception
    {
        this.q = new QueueImpl<String>(5);
        this.q.push("1");
        this.q.push("2");
        this.q.push("3");

    }

    @After
    public void tearDown()
    {
        this.q = null;
    }

    @Test
    public void testPush1() throws Exception
    {
        Assert.assertEquals(3, this.q.size());
        this.q.push("4");
        Assert.assertEquals(4,this.q.size());
        this.q.push("5");
        Assert.assertEquals(5,this.q.size());

    }

    @Test
    public void TestPush2() throws Exception
    {
        Assert.assertEquals(3, this.q.size());
    }

    @Test
    public void TestPop1() throws Exception{
        Assert.assertEquals(3,this.q.size());
        String un= this.q.pop();
        Assert.assertEquals(2,this.q.size());
        Assert.assertEquals("1",un);
        String dos = this.q.pop();
        String tres= this.q.pop();

    }

}
