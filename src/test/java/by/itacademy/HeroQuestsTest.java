package by.itacademy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HeroQuestsTest {

    private static SessionFactory SESSION_FACTORY = null;

    @BeforeClass
    public static void init() {
        SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
    }

    @Test
    public void test() {

    }

    @AfterClass
    public static void destroy() {
        SESSION_FACTORY.close();
    }
}
