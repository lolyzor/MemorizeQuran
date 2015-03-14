package halalsoftware.com.memorizequran.core;

import java.util.List;

/**
 * Created by Abdurahman on 12/28/2014.
 */
public class AyahManager {
    public AyahManager() {
        restore();
    }

    private int lastAyahPosition;

    public Ayah getNextAayah() {
        Ayah ayah = returnNewAyahWithIndex(getLastAyahIndex());
        incrementLastAyahIndex();
        return ayah;
    }

    private void incrementLastAyahIndex() {
        lastAyahPosition++;
    }

    private int getLastAyahIndex() {
        return lastAyahPosition;
    }

    private Ayah returnNewAyahWithIndex(int lastAyahPosition) {
        Ayah ayah = new Ayah();
        ayah.setAyahAbsolutePosition(lastAyahPosition);
        return ayah;
    }

    private void restore() {
        lastAyahPosition = 1;
    }
}
