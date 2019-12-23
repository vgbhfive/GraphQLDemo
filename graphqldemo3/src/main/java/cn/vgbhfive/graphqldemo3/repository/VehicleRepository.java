package cn.vgbhfive.graphqldemo3.repository;

import cn.vgbhfive.graphqldemo3.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Vgbh
 * @date: 2019/12/23 17:41
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
