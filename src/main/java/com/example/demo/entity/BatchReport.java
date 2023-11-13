package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "R_101_BATCH_REPORT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchReport {
	@Id
	@Column(name="batch_no")
	private String batchNo;
	@Column(name="date_time")
	private LocalDate dateTime;
	@Column(name="reactor_name")
	private String reactorName;
	@Column(name="product_name")
	private String productName;
	@Column(name="batch_size")
	private String batchSize;
	@Column(name="rt_hdmw_sp")
	private BigDecimal rtHdmwSp;
	@Column(name="rt_hdmw_pv")
	private BigDecimal rtHdmwPv;
	@Column(name="rt_dmw_sp")
	private BigDecimal rtDmwSp;
	@Column(name="rt_dmw_pv")
	private BigDecimal rtDmwPv;
	@Column(name="rt_hdmw_rmbn")
	private String rtHdmwRmbn;
	@Column(name="rt_dmw_rmbn")
	private String rtDmwRmbn;
	@Column(name = "ini_material1")
	private String iniMaterial1;
	@Column(name = "ini_material2")
	private String iniMaterial2;
	@Column(name = "ini_material3")
	private String iniMaterial3;
	@Column(name = "ini_material4")
	private String iniMaterial4;
	@Column(name = "ini_material5")
	private String iniMaterial5;
	@Column(name = "ini_material6")
	private String iniMaterial6;
	@Column(name = "ini_material7")
	private String iniMaterial7;
	@Column(name = "ini_material8")
	private String iniMaterial8;
	@Column(name = "ini_material9")
	private String iniMaterial9;
	@Column(name = "ini_material10")
	private String iniMaterial10;
	@Column(name="ini_sp_i1")
	private BigDecimal iniSpI1;
	@Column(name="ini_sp_i2")
	private BigDecimal iniSpI2;
	@Column(name="ini_sp_i3")
	private BigDecimal iniSpI3;
	@Column(name="ini_sp_i4")
	private BigDecimal iniSpI4;
	@Column(name="ini_sp_i5")
	private BigDecimal iniSpI5;
	@Column(name="ini_sp_i6")
	private BigDecimal iniSpI6;
	@Column(name="ini_sp_i7")
	private BigDecimal iniSpI7;
	@Column(name="ini_sp_i8")
	private BigDecimal iniSpI8;
	@Column(name="ini_sp_i9")
	private BigDecimal iniSpI9;
	@Column(name="ini_sp_i10")
	private BigDecimal iniSpI10;
	@Column(name ="ini_pv_i1")
	private BigDecimal iniPvI1;
	@Column(name ="ini_pv_i2")
	private BigDecimal iniPvI2;
	@Column(name ="ini_pv_i3")
	private BigDecimal iniPvI3;
	@Column(name ="ini_pv_i4")
	private BigDecimal iniPvI4;
	@Column(name ="ini_pv_i5")
	private BigDecimal iniPvI5;
	@Column(name ="ini_pv_i6")
	private BigDecimal iniPvI6;
	@Column(name ="ini_pv_i7")
	private BigDecimal iniPvI7;
	@Column(name ="ini_pv_i8")
	private BigDecimal iniPvI8;
	@Column(name ="ini_pv_i9")
	private BigDecimal iniPvI9;
	@Column(name ="ini_pv_i10")
	private BigDecimal iniPvI10;
	@Column(name="ini_rmbn_i1")
	private String iniRmbnI1;
	@Column(name="ini_rmbn_i2")
	private String iniRmbnI2;
	@Column(name="ini_rmbn_i3")
	private String iniRmbnI3;
	@Column(name="ini_rmbn_i4")
	private String iniRmbnI4;
	@Column(name="ini_rmbn_i5")
	private String iniRmbnI5;
	@Column(name="ini_rmbn_i6")
	private String iniRmbnI6;
	@Column(name="ini_rmbn_i7")
	private String iniRmbnI7;
	@Column(name="ini_rmbn_i8")
	private String iniRmbnI8;
	@Column(name="ini_rmbn_i9")
	private String iniRmbnI9;
	@Column(name="ini_rmbn_i10")
	private String iniRmbnI10;
	@Column(name="et_material1")
	private String etMaterial1;
	@Column(name="et_material2")
	private String etMaterial2;
	@Column(name="et_material3")
	private String etMaterial3;
	@Column(name="et_material4")
	private String etMaterial4;
	@Column(name="et_material5")
	private String etMaterial5;
	@Column(name="et_material6")
	private String etMaterial6;
	@Column(name="et_material7")
	private String etMaterial7;
	@Column(name="et_material8")
	private String etMaterial8;
	@Column(name="et_material9")
	private String etMaterial9;
	@Column(name="et_material10")
	private String etMaterial10;
	@Column(name="et_material11")
	private String etMaterial11;
	@Column(name="et_material12")
	private String etMaterial12;
	@Column(name = "et_sp_i1")
	private BigDecimal etSpI1;
	@Column(name = "et_sp_i2")
	private BigDecimal etSpI2;
	@Column(name = "et_sp_i3")
	private BigDecimal etSpI3;
	@Column(name = "et_sp_i4")
	private BigDecimal etSpI4;
	@Column(name = "et_sp_i5")
	private BigDecimal etSpI5;
	@Column(name = "et_sp_i6")
	private BigDecimal etSpI6;
	@Column(name = "et_sp_i7")
	private BigDecimal etSpI7;
	@Column(name = "et_sp_i8")
	private BigDecimal etSpI8;
	@Column(name = "et_sp_i9")
	private BigDecimal etSpI9;
	@Column(name = "et_sp_i10")
	private BigDecimal etSpI10;
	@Column(name = "et_sp_i11")
	private BigDecimal etSpI11;
	@Column(name = "et_sp_i12")
	private BigDecimal etSpI12;
	@Column(name = "et_pv_i1")
	private BigDecimal etPvI1;
	@Column(name = "et_pv_i2")
	private BigDecimal etPvI2;
	@Column(name = "et_pv_i3")
	private BigDecimal etPvI3;
	@Column(name = "et_pv_i4")
	private BigDecimal etPvI4;
	@Column(name = "et_pv_i5")
	private BigDecimal etPvI5;
	@Column(name = "et_pv_i6")
	private BigDecimal etPvI6;
	@Column(name = "et_pv_i7")
	private BigDecimal etPvI7;
	@Column(name = "et_pv_i8")
	private BigDecimal etPvI8;
	@Column(name = "et_pv_i9")
	private BigDecimal etPvI9;
	@Column(name = "et_pv_i10")
	private BigDecimal etPvI10;
	@Column(name = "et_pv_i11")
	private BigDecimal etPvI11;
	@Column(name = "et_pv_i12")
	private BigDecimal etPvI12;
	@Column(name="et_rmbn_i1")
	private String etRmbnI1;
	@Column(name="et_rmbn_i2")
	private String etRmbnI2;
	@Column(name="et_rmbn_i3")
	private String etRmbnI3;
	@Column(name="et_rmbn_i4")
	private String etRmbnI4;
	@Column(name="et_rmbn_i5")
	private String etRmbnI5;
	@Column(name="et_rmbn_i6")
	private String etRmbnI6;
	@Column(name="et_rmbn_i7")
	private String etRmbnI7;
	@Column(name="et_rmbn_i8")
	private String etRmbnI8;
	@Column(name="et_rmbn_i9")
	private String etRmbnI9;
	@Column(name="et_rmbn_i10")
	private String etRmbnI10;
	@Column(name="et_rmbn_i11")
	private String etRmbnI11;
	@Column(name="et_rmbn_i12")
	private String etRmbnI12;
	@Column(name="pps1_hdmw_sp")
	private BigDecimal pps1HdmwSp;
	@Column(name="pps1_dmw_sp")
	private BigDecimal pps1DmwSp;
	@Column(name="pps1_pps_sp")
	private BigDecimal pps1PpsSp;
	@Column(name="pps1_hdmw_pv")
	private BigDecimal pps1HdmwPv;
	@Column(name="pps1_dmw_pv")
	private BigDecimal pps1DmwPv;
	@Column(name="pps1_pps_pv")
	private BigDecimal pps1PpsPv;
	@Column(name="pps1_hdmw_rmbn")
	private String pps1HdmwRmbn;
	@Column(name="pps1_dmw_rmbn")
	private String pps1DmwRmbn;
	@Column(name="pps1_pps_rmbn")
	private BigDecimal pps1PpsRmbn;
	@Column(name="pps2_dmw_pps_sp")
	private BigDecimal pps2DmwPpsSp;
	@Column(name="pps2_dmw_pps_pv")
	private BigDecimal pps2DmwPpsPv;
	@Column(name="pps2_dmw_pps_rmbn")
	private String pps2DmwPpsRmbn;
	@Column(name="pps_after_feeding_hdmw_sp")
	private BigDecimal ppsAfterFeedingHdmwSp;
	@Column(name="pps_after_feeding_dmw_sp")
	private BigDecimal ppsAfterFeedingDmwSp;
	@Column(name="pps_after_feeding_pps_sp")
	private BigDecimal ppsAfterFeedingPpsSp;
	@Column(name="pps_after_feeding_hdmw_pv")
	private BigDecimal ppsAfterFeedingHdmwPv;
	@Column(name="pps_after_feeding_dmw_pv")
	private BigDecimal ppsAfterFeedingDmwPv;
	@Column(name="pps_after_feeding_pps_pv")
	private BigDecimal ppsAfterFeedingPpsPv;
	@Column(name="pps_after_feeding_hdmw_rmbn")
	private String ppsAfterFeedingHdmwRmbn;
	@Column(name="pps_after_feeding_dmw_rmbn")
	private String ppsAfterFeedingDmwRmbn;
	@Column(name="pps_after_feeding_pps_rmbn")
	private String ppsAfterFeedingPpsRmbn;
	@Column(name="cnt_pps_dmw_sp")
	private BigDecimal cntPpsDmwSp;
	@Column(name="cnt_pps_pps_sp")
	private BigDecimal cntPpsPpsSp;
	@Column(name="cnt_pps_dmw_pv")
	private BigDecimal cntPpsDmwPv;
	@Column(name="cnt_pps_pps_pv")
	private BigDecimal cntPpsPpsPv;
	@Column(name="cnt_pps_dmw_rmbn")
	private String cntPpsDmwRmbn;
	@Column(name="cnt_pps_pps_rmbn")
	private String cntPpsPpsRmbn;
	@Column(name="post_ad_material1")
	private String postAdMaterial1;
	@Column(name="post_ad_material2")
	private String postAdMaterial2;
	@Column(name="post_ad_material3")
	private String postAdMaterial3;
	@Column(name="post_ad_material4")
	private String postAdMaterial4;
	@Column(name="post_ad_material5")
	private String postAdMaterial5;
	@Column(name="post_ad_material6")
	private String postAdMaterial6;
	@Column(name="post_ad_material7")
	private String postAdMaterial7;
	@Column(name="post_ad_material8")
	private String postAdMaterial8;
	@Column(name="post_ad_material9")
	private String postAdMaterial9;
	@Column(name="post_ad_material10")
	private String postAdMaterial10;
	@Column(name="post_ad_sp_i1")
	private BigDecimal postAdSpI1;
	@Column(name="post_ad_sp_i2")
	private BigDecimal postAdSpI2;
	@Column(name="post_ad_sp_i3")
	private BigDecimal postAdSpI3;
	@Column(name="post_ad_sp_i4")
	private BigDecimal postAdSpI4;
	@Column(name="post_ad_sp_i5")
	private BigDecimal postAdSpI5;
	@Column(name="post_ad_sp_i6")
	private BigDecimal postAdSpI6;
	@Column(name="post_ad_sp_i7")
	private BigDecimal postAdSpI7;
	@Column(name="post_ad_sp_i8")
	private BigDecimal postAdSpI8;
	@Column(name="post_ad_sp_i9")
	private BigDecimal postAdSpI9;
	@Column(name="post_ad_sp_i10")
	private BigDecimal postAdSpI10;
	@Column(name="post_ad_pv_i1")
	private BigDecimal postAdPvI1;
	@Column(name="post_ad_pv_i2")
	private BigDecimal postAdPvI2;
	@Column(name="post_ad_pv_i3")
	private BigDecimal postAdPvI3;
	@Column(name="post_ad_pv_i4")
	private BigDecimal postAdPvI4;
	@Column(name="post_ad_pv_i5")
	private BigDecimal postAdPvI5;
	@Column(name="post_ad_pv_i6")
	private BigDecimal postAdPvI6;
	@Column(name="post_ad_pv_i7")
	private BigDecimal postAdPvI7;
	@Column(name="post_ad_pv_i8")
	private BigDecimal postAdPvI8;
	@Column(name="post_ad_pv_i9")
	private BigDecimal postAdPvI9;
	@Column(name="post_ad_pv_i10")
	private BigDecimal postAdPvI10;
	@Column(name="post_ad_i1_rmbn")
	private String postAdI1Rmbn;
	@Column(name="post_ad_i2_rmbn")
	private String postAdI2Rmbn;
	@Column(name="post_ad_i3_rmbn")
	private String postAdI3Rmbn;
	@Column(name="post_ad_i4_rmbn")
	private String postAdI4Rmbn;
	@Column(name="post_ad_i5_rmbn")
	private String postAdI5Rmbn;
	@Column(name="post_ad_i6_rmbn")
	private String postAdI6Rmbn;
	@Column(name="post_ad_i7_rmbn")
	private String postAdI7Rmbn;
	@Column(name="post_ad_i8_rmbn")
	private String postAdI8Rmbn;
	@Column(name="post_ad_i9_rmbn")
	private String postAdI9Rmbn;
	@Column(name="post_ad_i10_rmbn")
	private String postAdI10Rmbn;
	@Column(name="qc_dmw_sp")
	private BigDecimal qcDmwSp;
	@Column(name="qc_nh3_sp")
	private BigDecimal qcNh3Sp;
	@Column(name="qc_dmw_pv")
	private BigDecimal qcDmwPv;
	@Column(name="qc_nh3_pv")
	private BigDecimal qcNh3Pv;
	@Column(name="qc_dmw_rmbn")
	private String qcDmwRmbn;
	@Column(name="qc_nh3_rmbn")
	private String qcNh3Rmbn;
	@Column(name="white_water_qty")
	private BigDecimal whiteWaterQty;
	@Column(name="blending_material")
	private String blendingMaterial;
	@Column(name="remarks")
	private String remarks;
	@Column(name="spare1")
	private String spare1;
	@Column(name="spare2")
	private String spare2;
	@Column(name="spare3")
	private String spare3;
	@Column(name="spare4")
	private String spare4;
	@Column(name="spare5")
	private String spare5;
}
