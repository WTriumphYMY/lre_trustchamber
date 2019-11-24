package cn.edu.nwpu.trustchamber.domain.dto;

/**
 * @ClassName ThrustChamberDTO
 * @Author: wkx
 * @Date: 2019/7/18 19:26
 * @Version: v1.0
 * @Description: 恒压双组元挤压式系统数据传输类
 */
public class ThrustChamberDTO {
    private String componentName;
    private String thrustChamberV;
    private String thrustChamberTauc;
    private String thrustChamberK;
    private String thrustChamberArea;
    private String thrustChamberPa;
    private String thrustChamberEps;
    private String globalParasTime;
    private String globalParasStep;

    //测试组件用的压强、流量、温度入口与压强出口,推进剂流量入口
    private String pe;
    private String qo;
    private String qf;

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getThrustChamberV() {
        return thrustChamberV;
    }

    public void setThrustChamberV(String thrustChamberV) {
        this.thrustChamberV = thrustChamberV;
    }

    public String getThrustChamberTauc() {
        return thrustChamberTauc;
    }

    public void setThrustChamberTauc(String thrustChamberTauc) {
        this.thrustChamberTauc = thrustChamberTauc;
    }

    public String getThrustChamberK() {
        return thrustChamberK;
    }

    public void setThrustChamberK(String thrustChamberK) {
        this.thrustChamberK = thrustChamberK;
    }

    public String getThrustChamberArea() {
        return thrustChamberArea;
    }

    public void setThrustChamberArea(String thrustChamberArea) {
        this.thrustChamberArea = thrustChamberArea;
    }

    public String getThrustChamberPa() {
        return thrustChamberPa;
    }

    public void setThrustChamberPa(String thrustChamberPa) {
        this.thrustChamberPa = thrustChamberPa;
    }

    public String getThrustChamberEps() {
        return thrustChamberEps;
    }

    public void setThrustChamberEps(String thrustChamberEps) {
        this.thrustChamberEps = thrustChamberEps;
    }

    public String getGlobalParasTime() {
        return globalParasTime;
    }

    public void setGlobalParasTime(String globalParasTime) {
        this.globalParasTime = globalParasTime;
    }

    public String getGlobalParasStep() {
        return globalParasStep;
    }

    public void setGlobalParasStep(String globalParasStep) {
        this.globalParasStep = globalParasStep;
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public String getQo() {
        return qo;
    }

    public void setQo(String qo) {
        this.qo = qo;
    }

    public String getQf() {
        return qf;
    }

    public void setQf(String qf) {
        this.qf = qf;
    }
}
