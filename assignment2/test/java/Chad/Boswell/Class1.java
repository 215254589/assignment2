package ChadBoswell;

import Configuration.AppConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class Class2Test {

    private Collections_Interface class2;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        class2 = (Collections_Interface)ctx.getBean("allCollectionsStartingAt1");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addArrayList() {

        String name = "Chad";
        String sname = "Boswell";

        class2.addArrayList(name);
        class2.addArrayList(sname);

        Assert.assertEquals("Adding", name, sname);
        Assert.assertEquals("Adding", sname, sname);
    }

    @Test
    public void addSet() {

        String achievements = "Higher Certificate";
        String achievements2 = "WP";

        class1.addSet(achievements);
        class1.addSet(achievements2);
        Assert.assertNotSame("Unique Items in set", achievements, achievements2);
    }

    @Test
    public void addMap() {

        String key = "Java";
        String val = null;

        class2.addMap(key, val);
        Assert.assertNotNull(val);
    }
}