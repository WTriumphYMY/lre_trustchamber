package cn.edu.nwpu.trustchamber.service.impl;


import cn.edu.nwpu.trustchamber.algorithm.ThrustChamberCalc;
import cn.edu.nwpu.trustchamber.domain.DO.ThrustChamberDO;
import cn.edu.nwpu.trustchamber.domain.dto.ThrustChamberDTO;
import cn.edu.nwpu.trustchamber.domain.po.ThrustChamberPO;
import cn.edu.nwpu.trustchamber.repository.ThrustChamberRepository;
import cn.edu.nwpu.trustchamber.service.ThrustChamberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName ConstDualSystemServiceImpl
 * @Author: wkx
 * @Date: 2019/7/20 10:04
 * @Version: v1.0
 * @Description: 液发仿真实现
 */
@Service
public class ThrustChamberImpl implements ThrustChamberService {

    @Autowired
    ThrustChamberRepository thrustChamberRepository;

    @Override
    public Map<String, List<Double>> thrustChamberSim(ThrustChamberDTO thrustChamberDTO) {
        double calTime = Double.parseDouble(thrustChamberDTO.getGlobalParasTime());
        double timeStep = Double.parseDouble(thrustChamberDTO.getGlobalParasStep());

        ThrustChamberDO thrustChamberDO = transformDTOtoDO(thrustChamberDTO);
        ThrustChamberCalc thrustChamberCalc = new ThrustChamberCalc(thrustChamberDO);

        double qo = Double.parseDouble(thrustChamberDTO.getQo());
        double qf = Double.parseDouble(thrustChamberDTO.getQf());
        double time = 0.0;
        List<Double> t = new ArrayList<>();
        t.add(time);
        while (time < calTime){
            thrustChamberCalc.execute(qo, qf);//0.18, 0.15 0.0388625, 0.0189286
            time += timeStep;
            t.add(time);
        }
        Map<String, List<Double>> resultMap = new HashMap<>();
        resultMap.put("t", t);
        resultMap.put("p", thrustChamberCalc.getP());
        resultMap.put("r", thrustChamberCalc.getR());
        resultMap.put("f", thrustChamberCalc.getF());
        resultMap.put("q", thrustChamberCalc.getQ());
        return resultMap;
    }

    @Override
    public void saveThrustChamber(ThrustChamberDTO thrustChamberDTO) {
        ThrustChamberPO thrustChamberPO = transformPOtoDO(thrustChamberDTO);
        thrustChamberRepository.save(thrustChamberPO);
    }

    @Override
    public ThrustChamberDTO findByThrustChamberName(String thrustChamberName) {
        ThrustChamberPO thrustChamberPO = thrustChamberRepository.findByThrustChamberName(thrustChamberName);
        ThrustChamberDTO thrustChamberDTO = transformPOtoDTO(thrustChamberPO);
        return thrustChamberDTO;
    }

    private ThrustChamberDTO transformPOtoDTO(ThrustChamberPO thrustChamberPO) {
        ThrustChamberDTO thrustChamberDTO = new ThrustChamberDTO();
        thrustChamberDTO.setComponentName(thrustChamberPO.getThrustChamberName());
        thrustChamberDTO.setThrustChamberV(String.valueOf(thrustChamberPO.getThrustChamberV()));
        thrustChamberDTO.setThrustChamberTauc(String.valueOf(thrustChamberPO.getThrustChamberTauc()));
        thrustChamberDTO.setThrustChamberK(String.valueOf(thrustChamberPO.getThrustChamberK()));
        thrustChamberDTO.setThrustChamberArea(String.valueOf(thrustChamberPO.getThrustChamberArea()));
        thrustChamberDTO.setThrustChamberEps(String.valueOf(thrustChamberPO.getThrustChamberEps()));
        return thrustChamberDTO;
    }

    @Override
    public List<ThrustChamberDTO> findAllThrustChamber() {
        List<ThrustChamberPO> thrustChamberPOList = thrustChamberRepository.findAll();
        List<ThrustChamberDTO> thrustChamberDTOList = new ArrayList<>();
        for (ThrustChamberPO thrustChamberPO : thrustChamberPOList) {
            thrustChamberDTOList.add(transformPOtoDTO(thrustChamberPO));
        }
        return thrustChamberDTOList;
    }

    private ThrustChamberPO transformPOtoDO(ThrustChamberDTO thrustChamberDTO) {
        ThrustChamberPO thrustChamberPO = new ThrustChamberPO();
        thrustChamberPO.setThrustChamberName(thrustChamberDTO.getComponentName());
        thrustChamberPO.setThrustChamberV(Double.parseDouble(thrustChamberDTO.getThrustChamberV()));
        thrustChamberPO.setThrustChamberTauc(Double.parseDouble(thrustChamberDTO.getThrustChamberTauc()));
        thrustChamberPO.setThrustChamberK(Double.parseDouble(thrustChamberDTO.getThrustChamberK()));
        thrustChamberPO.setThrustChamberArea(Double.parseDouble(thrustChamberDTO.getThrustChamberArea()));
        thrustChamberPO.setThrustChamberEps(Double.parseDouble(thrustChamberDTO.getThrustChamberEps()));
        return thrustChamberPO;
    }


    private ThrustChamberDO transformDTOtoDO(ThrustChamberDTO thrustChamberDTO){
        ThrustChamberDO thrustChamberDO = new ThrustChamberDO();
        thrustChamberDO.setVc(Double.parseDouble(thrustChamberDTO.getThrustChamberV()));
        thrustChamberDO.setTauc(Double.parseDouble(thrustChamberDTO.getThrustChamberTauc()));
        thrustChamberDO.setK(Double.parseDouble(thrustChamberDTO.getThrustChamberK()));
        thrustChamberDO.setArea_throat(Double.parseDouble(thrustChamberDTO.getThrustChamberArea()));
        thrustChamberDO.setEps(Double.parseDouble(thrustChamberDTO.getThrustChamberEps()));
        thrustChamberDO.setPa(Double.parseDouble(thrustChamberDTO.getThrustChamberPa()));
        return thrustChamberDO;
    }
}
