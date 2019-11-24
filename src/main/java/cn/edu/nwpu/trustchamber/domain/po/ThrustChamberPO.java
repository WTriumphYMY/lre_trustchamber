package cn.edu.nwpu.trustchamber.domain.po;

import javax.persistence.*;

/**
 * @ClassName ThrustChamberDTO
 * @Author: wkx
 * @Date: 2019/7/18 19:26
 * @Version: v1.0
 * @Description: 恒压双组元挤压式系统数据传输类
 */
@Entity
@Table(name = "tb_thrustchamber")
public class ThrustChamberPO {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer pkId;
    @Column(name = "thrustchamber_name")
    private String thrustChamberName;
    @Column(name = "thrustchamber_v")
    private Double thrustChamberV;
    @Column(name = "thrustchamber_tauc")
    private Double thrustChamberTauc;
    @Column(name = "thrustchamber_k")
    private Double thrustChamberK;
    @Column(name = "thrustchamber_area")
    private Double thrustChamberArea;
    @Column(name = "thrustchamber_eps")
    private Double thrustChamberEps;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getThrustChamberName() {
        return thrustChamberName;
    }

    public void setThrustChamberName(String thrustChamberName) {
        this.thrustChamberName = thrustChamberName;
    }

    public Double getThrustChamberV() {
        return thrustChamberV;
    }

    public void setThrustChamberV(Double thrustChamberV) {
        this.thrustChamberV = thrustChamberV;
    }

    public Double getThrustChamberTauc() {
        return thrustChamberTauc;
    }

    public void setThrustChamberTauc(Double thrustChamberTauc) {
        this.thrustChamberTauc = thrustChamberTauc;
    }

    public Double getThrustChamberK() {
        return thrustChamberK;
    }

    public void setThrustChamberK(Double thrustChamberK) {
        this.thrustChamberK = thrustChamberK;
    }

    public Double getThrustChamberArea() {
        return thrustChamberArea;
    }

    public void setThrustChamberArea(Double thrustChamberArea) {
        this.thrustChamberArea = thrustChamberArea;
    }

    public Double getThrustChamberEps() {
        return thrustChamberEps;
    }

    public void setThrustChamberEps(Double thrustChamberEps) {
        this.thrustChamberEps = thrustChamberEps;
    }
}
