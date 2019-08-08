package lesson.six;

public class Label extends Component {
    private String hello ="Hello";{
    }

    public Label(String Hello){
    }

    @Override
    public String toString() {
        return  hello;
    }

    @Override
    public void draw() {
        System.out.println("Label"); }
    @Override
    public void draw3D(){
        System.out.println("Label 3D"); }
}
