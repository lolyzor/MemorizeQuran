package halalsoftware.com.memorizequran.test;

import junit.framework.TestCase;

import halalsoftware.com.memorizequran.core.Ayah;
import halalsoftware.com.memorizequran.core.AyahManager;

public class AyahManagerTest extends TestCase {
    public void testReturnAyah(){
        AyahManager ayahManager = new AyahManager();
        assertEquals(Ayah.class, ayahManager.getNextAayah().getClass());
    }
}