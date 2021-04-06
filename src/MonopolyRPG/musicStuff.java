package MonopolyRPG;

import java.io.File;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

public class musicStuff {

    void bgm(String musicLocation) {

        try {
            File musicPath = new File(musicLocation);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip=AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
                JOptionPane.showMessageDialog(null,"Press OK to stop playing");
            }
            else{
                System.out.println("Can't find file");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
