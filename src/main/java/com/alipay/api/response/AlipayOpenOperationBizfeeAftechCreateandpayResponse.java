package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.bizfee.aftech.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-08 21:12:16
 */
public class AlipayOpenOperationBizfeeAftechCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5587226136639268651L;

	/** 
	 * 费用订单号
	 */
	@ApiField("fee_order_no")
	private String feeOrderNo;

	/** 
	 * 动账支付时间
	 */
	@ApiField("gmt_pay")
	private String gmtPay;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setFeeOrderNo(String feeOrderNo) {
		this.feeOrderNo = feeOrderNo;
	}
	public String getFeeOrderNo( ) {
		return this.feeOrderNo;
	}

	public void setGmtPay(String gmtPay) {
		this.gmtPay = gmtPay;
	}
	public String getGmtPay( ) {
		return this.gmtPay;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
