 /* ***********************************************************************
 * Copyright 2017-2021 by SHProjcet Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of SHProjcet Corp. ("Confidential Information").
 ************************************************************************** */
/**************************************************************************
 * 1. Package	: lsh.com.model.home
 * 2. FileName  : CLNA001.java
 * 3. Comment	:	
 * 4. Author	: lsa66
 * 5. DateTime	: 2021. 1. 9. 오후 7:46:52
 * 6. History	:
 * -----------------------------------------------------------------------
 *	변경일자		 |	수정자		|	 버전		|	변경내역
 * -----------------------------------------------------------------------
 * 2021. 1. 9. | SeungHo		|	1.0		|	최초작성
 * -----------------------------------------------------------------------
 *************************************************************************/
package lsh.com.model.home;

/*
 * 1. 클래스명	: 
 * 2. 파일명	: CLNA001.java
 * 3. 패키지명	: lsh.com.model.home
 * 4. 작성자명	: lsa66
 * 5. 작성시간	: 2021. 1. 9. 오후 7:46:52
 */
/**
 * <PRE>
 * 1. 설명
 *		
 * </PRE>
 */
public class CLNA001 {

	String clnn;      // 고객번호
	String clnNm;     // 고객명
	String clnUnqN;   // 고객고유번호
	
	public String getClnn() {
		return clnn;
	}
	public void setClnn(String clnn) {
		this.clnn = clnn;
	}
	public String getClnNm() {
		return clnNm;
	}
	public void setClnNm(String clnNm) {
		this.clnNm = clnNm;
	}
	public String getClnUnqN() {
		return clnUnqN;
	}
	public void setClnUnqN(String clnUnqN) {
		this.clnUnqN = clnUnqN;
	}
}
