package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhongshimeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhongshimeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhongshimeishiView;


/**
 * 中式美食评论表
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface DiscusszhongshimeishiService extends IService<DiscusszhongshimeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhongshimeishiVO> selectListVO(Wrapper<DiscusszhongshimeishiEntity> wrapper);
   	
   	DiscusszhongshimeishiVO selectVO(@Param("ew") Wrapper<DiscusszhongshimeishiEntity> wrapper);
   	
   	List<DiscusszhongshimeishiView> selectListView(Wrapper<DiscusszhongshimeishiEntity> wrapper);
   	
   	DiscusszhongshimeishiView selectView(@Param("ew") Wrapper<DiscusszhongshimeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhongshimeishiEntity> wrapper);
   	

}

