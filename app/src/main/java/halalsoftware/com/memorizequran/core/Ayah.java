package halalsoftware.com.memorizequran.core;

import java.io.File;

/**
 * Created by Abdurahman on 12/28/2014.
 */
public class Ayah {
    private String content;
    private File audioFile;
    private int ayahAbsolutePosition;

    public int getAyahAbsolutePosition() {
        return ayahAbsolutePosition;
    }

    public void setAyahAbsolutePosition(int ayahAbsolutePosition) {
        this.ayahAbsolutePosition = ayahAbsolutePosition;
    }
}
