package interfaces;

class Phone{
    void call(){
        System.out.println("Call using Phone");
    }
    void SMS(){
        System.out.println("SMS using Phone");
    }
}
interface Camera{
    void click();
    void record();
}
interface MusicPlayer{
    void play();
    void pause();
    void stop();
}
class SmartPhone extends Phone implements Camera, MusicPlayer{
    void VideoCall(){
        System.out.println("Video call using Smartphone");
    }
    public void click(){
        System.out.println("Click using Smartphone");
    }
    public void record(){
        System.out.println("Record using Smartphone");
    }
    public void play(){
        System.out.println("Play using Smartphone");
    }
    public void pause(){
        System.out.println("Pause using Smartphone");
    }
    public void stop(){
        System.out.println("Stop using Smartphone");
    }
}

public class Example_1 {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.click();
        s.play();
        System.out.println("------------------------------");
        Phone p = new SmartPhone();
        p.call();
        p.SMS();
        System.out.println("------------------------------");
        Camera c = new SmartPhone();
        c.click();
        c.record();
        System.out.println("------------------------------");
        MusicPlayer m = new SmartPhone();
        m.play();
        m.pause();
        m.stop();
    }
}
