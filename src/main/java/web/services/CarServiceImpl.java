package web.services;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList = new ArrayList<>();
        ;
        {
            carList.add(new Car("Volga", 2020, 20));
            carList.add(new Car("BMV", 9, 12));
            carList.add(new Car("Audi", 2213, 10));
            carList.add(new Car("Suzuki", 101, 9));
            carList.add(new Car("Kia", 1070, 21));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}