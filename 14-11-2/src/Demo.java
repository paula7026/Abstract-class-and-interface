import model.bus;
import model.car;
import model.plane;
import model.train;

public class Demo {
    public static void main(String [] args){
//        构造函数？
        car car = new car(500);
        train train = new train(400);
        bus bus = new bus(300);
        plane plane = new plane(1000);
        if(car.getFee()<=500){
            System.out.println("car");
        }
        if(train.getFee()<=500){
            System.out.println("train");
        }
        if(bus.getFee()<=500){
            System.out.println("bus");
        }
        if(plane.getFee()<=500){
            System.out.println("plane");
        }
    }
}
