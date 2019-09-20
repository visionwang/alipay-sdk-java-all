package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChildCertInfo;
import com.alipay.api.domain.RelationVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-08 11:30:01
 */
public class AlipayCommerceKidsAccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4111544829195323367L;

	/** 
	 * 是否满足开户条件
	 */
	@ApiField("can_open")
	private Boolean canOpen;

	/** 
	 * 小宝账户信息模型，包含儿童业务id等字段
	 */
	@ApiField("child_info")
	private ChildCertInfo childInfo;

	/** 
	 * 关系数量上限
	 */
	@ApiField("relation_limit")
	private Long relationLimit;

	/** 
	 * 亲子关系列表，获取家长关联的所有孩子的列表
	 */
	@ApiListField("relation_list")
	@ApiField("relation_v_o")
	private List<RelationVO> relationList;

	public void setCanOpen(Boolean canOpen) {
		this.canOpen = canOpen;
	}
	public Boolean getCanOpen( ) {
		return this.canOpen;
	}

	public void setChildInfo(ChildCertInfo childInfo) {
		this.childInfo = childInfo;
	}
	public ChildCertInfo getChildInfo( ) {
		return this.childInfo;
	}

	public void setRelationLimit(Long relationLimit) {
		this.relationLimit = relationLimit;
	}
	public Long getRelationLimit( ) {
		return this.relationLimit;
	}

	public void setRelationList(List<RelationVO> relationList) {
		this.relationList = relationList;
	}
	public List<RelationVO> getRelationList( ) {
		return this.relationList;
	}

}