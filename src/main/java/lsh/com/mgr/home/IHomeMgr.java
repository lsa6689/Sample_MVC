 /* ***********************************************************************
 * Copyright 2017-2020 by SHProjcet Corp.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of SHProjcet Corp. ("Confidential Information").
 ************************************************************************** */
/**************************************************************************
 * 1. Package	: cofl.mgr
 * 2. FileName  : IHomeMgr.java
 * 3. Comment	:	
 * 4. Author	: SeungHo
 * 5. DateTime	: 2020. 9. 6 오후 2:45:54
 * 6. History	:
 * -----------------------------------------------------------------------
 *	변경일자		 |	수정자		|	 버전		|	변경내역
 * -----------------------------------------------------------------------
 * 2020. 9. 6 | SeungHo		|	1.0		|	최초작성
 * -----------------------------------------------------------------------
 *************************************************************************/
package lsh.com.mgr.home;

import lsh.com.model.home.CLNA001;

/*
 * 1. 클래스명	: 
 * 2. 파일명	: IHomeMgr.java
 * 3. 패키지명	: cofl.mgr
 * 4. 작성자명	: SeungHo
 * 5. 작성시간	: 2020. 9. 6 오후 2:45:54
 */
/**
 * <PRE>
 * 1. 설명
 *		
 * </PRE>
 */
public interface IHomeMgr {
	public CLNA001 mainContents( String Clnn );
}
