package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswaiguomeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswaiguomeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswaiguomeishiView;


/**
 * 外国美食评论表
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface DiscusswaiguomeishiService extends IService<DiscusswaiguomeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswaiguomeishiVO> selectListVO(Wrapper<DiscusswaiguomeishiEntity> wrapper);
   	
   	DiscusswaiguomeishiVO selectVO(@Param("ew") Wrapper<DiscusswaiguomeishiEntity> wrapper);
   	
   	List<DiscusswaiguomeishiView> selectListView(Wrapper<DiscusswaiguomeishiEntity> wrapper);
   	
   	DiscusswaiguomeishiView selectView(@Param("ew") Wrapper<DiscusswaiguomeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswaiguomeishiEntity> wrapper);
   	

}

