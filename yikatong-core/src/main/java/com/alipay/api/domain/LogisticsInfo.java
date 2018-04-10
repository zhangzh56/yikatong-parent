package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 11:24:36
 */
public class LogisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 5784343664872722179L;

	/**
	 * 物流公司code
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

}
