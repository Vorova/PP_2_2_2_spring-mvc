package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping()
    public String countCars(ModelMap model, HttpServletRequest request) {
        String parameter = request.getParameter("count");
        List<Car> cars = new CarService().getListOfParam(parameter);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
