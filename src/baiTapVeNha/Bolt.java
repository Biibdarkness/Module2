package baiTapVeNha;

public class Bolt extends  Animal implements Barkable,Runable{
    @Override
    public String bark() {
        return "gáy lên";
    }

    @Override
    public String run() {
        return "how let the dogs out";
    }
}
