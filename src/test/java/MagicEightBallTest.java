import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class MagicEightBallTest {
    MagicEightBall magiceightBall;

    @Before
    public void before() {
        magiceightBall = new MagicEightBall();
        magiceightBall.addAnswer("aye");
        magiceightBall.addAnswer("yer a chancer");
        magiceightBall.addAnswer("a dinnae ken");
    }

    @Test
    public void hasAnswer(){
      assertEquals(3, magiceightBall.getWordCount());
    }

    @Test
    public void AddWord(){
        assertEquals(3, magiceightBall.getWordCount());
    }

    @Test
    public void getRandomAnswer(){
        magiceightBall.getAnswer();
        System.out.println(magiceightBall.getAnswer());
        assertNotNull(magiceightBall.getAnswer());
        }
    }