package halalsoftware.com.memorizequran.test;

import junit.framework.TestCase;

import halalsoftware.com.memorizequran.core.Ayah;
import halalsoftware.com.memorizequran.core.AyahManager;

public class AyahManagerTest extends TestCase {
    public void testReturnAyah(){
        AyahManager ayahManager = new AyahManager();
        assertEquals(Ayah.class, ayahManager.getNextAayah().getClass());
    }

    public void testFirstAayah(){
        AyahManager ayahManager = new AyahManager();
        Ayah ayah = ayahManager.getNextAayah();
        assertEquals(1, ayah.getAyahAbsolutePosition());
    }

    public void testFirstAndSeconAyah(){
        AyahManager ayahManager = new AyahManager();
        Ayah ayah = ayahManager.getNextAayah();
        assertEquals(1, ayah.getAyahAbsolutePosition());
        Ayah ayah2 = ayahManager.getNextAayah();
        assertEquals(2, ayah2.getAyahAbsolutePosition());
    }
}