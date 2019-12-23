package cn.vgbhfive.graphqldemo3.mutation;

import cn.vgbhfive.graphqldemo3.entity.Vehicle;
import cn.vgbhfive.graphqldemo3.service.VehicleService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Vgbh
 * @date: 2019/12/23 17:52
 */
@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

}
