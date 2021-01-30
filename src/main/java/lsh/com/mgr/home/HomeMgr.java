/* ***********************************************************************
* Copyright 2017-2020 by SHProjcet Corp.,
* All rights reserved.
*
* This software is the confidential and proprietary information
* of SHProjcet Corp. ("Confidential Information").
************************************************************************** */
/**************************************************************************
 * 1. Package	: cofl.mgr
 * 2. FileName  : HomeMgr.java
 * 3. Comment	:	
 * 4. Author	: SeungHo
 * 5. DateTime	: 2020. 9. 6 오후 2:47:00
 * 6. History	:
 * -----------------------------------------------------------------------
 *	변경일자		 |	수정자		|	 버전		|	변경내역
 * -----------------------------------------------------------------------
 * 2020. 9. 6 | SeungHo		|	1.0		|	최초작성
 * -----------------------------------------------------------------------
 *************************************************************************/
package lsh.com.mgr.home;

import java.util.HashMap;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lsh.com.model.home.CLNA001;

/*
 * 1. 클래스명	: 
 * 2. 파일명	: HomeMgr.java
 * 3. 패키지명	: cofl.mgr
 * 4. 작성자명	: SeungHo
 * 5. 작성시간	: 2020. 9. 6 오후 2:47:00
 */
/**
 * <PRE>
 * 1. 설명
 * 
 * </PRE>
 */

public class HomeMgr implements IHomeMgr {



	private static final Logger logger = LoggerFactory.getLogger(HomeMgr.class);
	
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {

		this.sqlSession = sqlSession;
	}

	/*
	 * 1. 메소드명: mainContents
	 * 2. 클래스명: IHomeMgr
	 * 3. 작성자명: SeungHo
	 * 4. 작성시간: 2020. 9. 13. 오후 2:30:19
	 */
	/**
	 * <PRE>
	 * 1. 설명
	 *		
	 * </PRE>
	 *   @param uid
	 *   @return	
	 */
	
	@Override
	public CLNA001 mainContents(String clnn) {
		
		logger.info( "sqlSession ====>" );
		logger.info( sqlSession.toString() );
		Map<String,Object> iClna001 = new HashMap<String,Object>();
		iClna001.put("CLNN", clnn);
		
		CLNA001 rClna001 = sqlSession.selectOne( "xmlquery.home.readMemberIf" , iClna001);
		
		logger.info( "rMembers ====>" );
		logger.info( rClna001.toString() );
		
		return rClna001;
	}

	
}
