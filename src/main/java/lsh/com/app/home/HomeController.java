 /* ***********************************************************************
 * Copyright 2017-2020 by SHProjcet Corp;
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of SHProjcet Corp. ("Confidential Information").
 ************************************************************************** */
/**************************************************************************
 * 1. Package	: cofl.app.home
 * 2. FileName  : HelloController.java
 * 3. Comment	:	
 * 4. Author	: SeungHo
 * 5. DateTime	: 2020. 9. 6 오후 1:43:59
 * 6. History	:
 * -----------------------------------------------------------------------
 *	변경일자		 |	수정자		|	 버전		|	변경내역
 * -----------------------------------------------------------------------
 * 2020. 9. 6 | SeungHo		|	1.0		|	최초작성
 * -----------------------------------------------------------------------
 *************************************************************************/
package lsh.com.app.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lsh.com.mgr.home.IHomeMgr;
import lsh.com.model.home.CLNA001;


/*
 * 1. 클래스명	: 
 * 2. 파일명	: HelloController.java
 * 3. 패키지명	: lsh.com.app.home
 * 4. 작성자명	: SeungHo
 * 5. 작성시간	: 2020. 9. 6 오후 1:43:59
 */
/**
 * <PRE>
 * 1. 설명
 *		
 * </PRE>
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	IHomeMgr homeMgr;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		
		logger.info( "Welcome home!" );
		
		String messege = "";
		CLNA001 rCln = homeMgr.mainContents("PCLN000001");
        messege = rCln.getClnNm();
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		mv.addObject( "messege" , messege );
		mv.addObject( "members" , rCln );
		
		return mv;
	}

}
