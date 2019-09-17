package design.pattern.appearance;

/**
 * @Author:XiaoLang
 * @Date:2019-09-18 07:49
 */
public class HomeTheaterFacade {
    private Amlifier amp;
    private CdPlayer cd;
    private DvdPlayer dvd;
    private Tuner tuner;

    public HomeTheaterFacade(Amlifier amp, CdPlayer cd, DvdPlayer dvd, Tuner tuner) {
        this.amp = amp;
        this.cd = cd;
        this.dvd = dvd;
        this.tuner = tuner;
    }

    public void watchMovie(String movie){
        System.out.println("watching "+movie);
        amp.on();
        cd.on();
        dvd.on();
        tuner.on();
    }

    public void endMovie(String movie){
        System.out.println("end "+movie);
        amp.off();
        cd.off();
        dvd.off();
        tuner.off();
    }
}
