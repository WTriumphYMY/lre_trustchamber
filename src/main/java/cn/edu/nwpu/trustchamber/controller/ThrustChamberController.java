package cn.edu.nwpu.trustchamber.controller;

import cn.edu.nwpu.trustchamber.domain.dto.ThrustChamberDTO;
import cn.edu.nwpu.trustchamber.service.ThrustChamberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ClientController
 * @Author: wkx
 * @Date: 2019/7/20 09:44
 * @Version: v1.0
 * @Description: 客户端Controller对外暴露接口
 */
@RestController
public class ThrustChamberController {

    @Autowired
    private ThrustChamberService thrustChamberService;

    @PostMapping("thrustChamberSim")
    public Map<String, List<Double>> thrustChamberSim(@RequestBody ThrustChamberDTO thrustChamberDTO){
        return thrustChamberService.thrustChamberSim(thrustChamberDTO);
    }

    @PostMapping("saveThrustChamber")
    public void saveThrustChamber(@RequestBody ThrustChamberDTO thrustChamberDTO){
        thrustChamberService.saveThrustChamber(thrustChamberDTO);
    }

    @PostMapping("findThrustChamberByName")
    ThrustChamberDTO findThrustChamberByName(@RequestBody String thrustChamberName){
        return thrustChamberService.findByThrustChamberName(thrustChamberName);
    }

    @PostMapping("findAllThrustChamber")
    List<ThrustChamberDTO> findAllThrustChamber(){
        return thrustChamberService.findAllThrustChamber();
    }

}
