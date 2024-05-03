package com.dao;

import com.entity.ZhongshimeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongshimeishiVO;
import com.entity.view.ZhongshimeishiView;


/**
 * 中式美食
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface ZhongshimeishiDao extends BaseMapper<ZhongshimeishiEntity> {
	
	List<ZhongshimeishiVO> selectListVO(@Param("ew") Wrapper<ZhongshimeishiEntity> wrapper);
	
	ZhongshimeishiVO selectVO(@Param("ew") Wrapper<ZhongshimeishiEntity> wrapper);
	
	List<ZhongshimeishiView> selectListView(@Param("ew") Wrapper<ZhongshimeishiEntity> wrapper);

	List<ZhongshimeishiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongshimeishiEntity> wrapper);
	
	ZhongshimeishiView selectView(@Param("ew") Wrapper<ZhongshimeishiEntity> wrapper);
	

}
