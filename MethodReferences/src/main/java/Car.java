import java.util.function.Supplier;

/**
 * Created by Pavan_Karasala on 10/15/2016.
 */
public class Car {
    public static Car create(Supplier<Car> supplier){
        return supplier.get();
    }

    public static void collide(final Car car){
        System.out.println("Collided "+car.toString());
    }

    public void follow(final Car another){
        System.out.println("Following the : "+another.toString());
    }

    public void repair(){
        System.out.println("Repaired :"+this.toString());
    }




}
