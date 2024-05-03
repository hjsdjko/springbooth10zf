package com.dao;

import com.entity.DiscusszhongshimeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhongshimeishiVO;
import com.entity.view.DiscusszhongshimeishiView;


/**
 * 中式美食评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface DiscusszhongshimeishiDao extends BaseMapper<DiscusszhongshimeishiEntity> {
	
	List<DiscusszhongshimeishiVO> selectListVO(@Param("ew") Wrapper<DiscusszhongshimeishiEntity> wrapper);
	
	DiscusszhongshimeishiVO selectVO(@Param("ew") Wrapper<DiscusszhongshimeishiEntity> wrapper);
	
	List<DiscusszhongshimeishiView> selectListView(@Param("ew") Wrapper<DiscusszhongshimeishiEntity> wrapper);

	List<DiscusszhongshimeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhongshimeishiEntity> wrapper);
	
	DiscusszhongshimeishiView selectView(@Param("ew") Wrapper<DiscusszhongshimeishiEntity> wrapper);
	

}
