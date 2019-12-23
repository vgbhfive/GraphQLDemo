package cn.vgbhfive.graphqldemo3.controller;

import cn.vgbhfive.graphqldemo3.entity.Vehicle;
import cn.vgbhfive.graphqldemo3.service.VehicleService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author: Vgbh
 * @date: 2019/12/23 17:48
 */
@Component
public class VehhicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }
    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }

}
