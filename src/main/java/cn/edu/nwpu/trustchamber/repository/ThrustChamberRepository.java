package cn.edu.nwpu.trustchamber.repository;

import cn.edu.nwpu.trustchamber.domain.po.ThrustChamberPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName ThrustChamberRepository
 * @Author: wkx
 * @Date: 2019/10/28 10:50
 * @Version: v1.0
 * @Description:
 */
@Repository
public interface ThrustChamberRepository extends JpaRepository<ThrustChamberPO, Integer> {

    ThrustChamberPO findByThrustChamberName(String thrustChamberName);

    List<ThrustChamberPO> findAll();
}
