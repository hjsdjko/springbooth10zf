package com.dao;

import com.entity.DiscusswaiguomeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswaiguomeishiVO;
import com.entity.view.DiscusswaiguomeishiView;


/**
 * 外国美食评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface DiscusswaiguomeishiDao extends BaseMapper<DiscusswaiguomeishiEntity> {
	
	List<DiscusswaiguomeishiVO> selectListVO(@Param("ew") Wrapper<DiscusswaiguomeishiEntity> wrapper);
	
	DiscusswaiguomeishiVO selectVO(@Param("ew") Wrapper<DiscusswaiguomeishiEntity> wrapper);
	
	List<DiscusswaiguomeishiView> selectListView(@Param("ew") Wrapper<DiscusswaiguomeishiEntity> wrapper);

	List<DiscusswaiguomeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswaiguomeishiEntity> wrapper);
	
	DiscusswaiguomeishiView selectView(@Param("ew") Wrapper<DiscusswaiguomeishiEntity> wrapper);
	

}
