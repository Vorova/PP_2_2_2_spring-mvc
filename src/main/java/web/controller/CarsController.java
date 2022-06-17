package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping()
    public String countCars(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        List<Car> cars = carService.getListOfParam(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
