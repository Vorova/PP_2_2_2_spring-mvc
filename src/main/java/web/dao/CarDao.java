package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {

    public List<Car> getListOfParam(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada",     "grey",  2332));
        cars.add(new Car("Kia",      "green", 9675));
        cars.add(new Car("Toyota",   "white", 5546));
        cars.add(new Car("BMW",      "black", 4523));
        cars.add(new Car("Mercedes", "blue",  4531));

        try {
            return cars.subList(0, count);
        } catch(Exception e) {
            return cars;
        }
    }
}
