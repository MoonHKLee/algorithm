package JavaThreadTest;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class ThreadTest extends Thread {
    private String 음악;
    private String 이름;
    private int 나이;

    public ThreadTest(String 음악, String 이름, int 나이) {
        this.나이 = 나이;
        this.음악 = 음악;
        this.이름 = 이름;
    }

    public void run() {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("C:\\Users\\mf311\\OneDrive\\Desktop\\001.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            sleep(1000);
//            clip.stop();
        } catch (Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }

    }
}