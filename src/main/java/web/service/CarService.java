package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getListOfParam(String parameter) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "grey", 2332));
        cars.add(new Car("Kia", "green", 9675));
        cars.add(new Car("Toyota", "white", 5546));
        cars.add(new Car("BMW", "black", 4523));
        cars.add(new Car("Mercedes", "blue", 4531));

        int count;
        try {
            count = Math.abs(Integer.parseInt(parameter));
        } catch(NumberFormatException e) {
            count = 5;
        }
        if(count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }

}
