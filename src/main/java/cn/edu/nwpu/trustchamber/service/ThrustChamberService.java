package cn.edu.nwpu.trustchamber.service;

import cn.edu.nwpu.trustchamber.domain.dto.ThrustChamberDTO;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName ConstDualSystemService
 * @Author: wkx
 * @Date: 2019/7/20 10:04
 * @Version: v1.0
 * @Description: 液发仿真接口
 */
public interface ThrustChamberService {

    /**
     *
     * @param thrustChamberDTO
     * @return 推力室仿真
     */
    Map<String, List<Double>> thrustChamberSim(ThrustChamberDTO thrustChamberDTO);

    void saveThrustChamber(ThrustChamberDTO thrustChamberDTO);

    ThrustChamberDTO findByThrustChamberName(String thrustChamberName);

    List<ThrustChamberDTO> findAllThrustChamber();
}
