package design.pattern.appearance;

/**
 * @Author:XiaoLang
 * @Date:2019-09-18 07:54
 */
public class Test {
    public static void main(String[] args) {
        Amlifier amlifier = new Amlifier();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Tuner tuner = new Tuner();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amlifier,cdPlayer,
                dvdPlayer,tuner);
        homeTheater.watchMovie("hello");
        homeTheater.endMovie("hello");
    }
}
