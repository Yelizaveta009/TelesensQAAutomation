package homework.lesson06;

public class RoundButton extends Button {
    private double e = 3.2;{
    }

    public RoundButton(double e) {
    }

    @Override
    public String toString(){
        return String.valueOf(e); }

    @Override
    public void draw(){
        System.out.println("RoundButton"); }

    @Override
        public void draw3D(){
        System.out.println("RoundButton 3D"); }
}
