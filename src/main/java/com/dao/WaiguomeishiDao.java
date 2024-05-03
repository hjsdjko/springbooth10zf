package com.dao;

import com.entity.WaiguomeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WaiguomeishiVO;
import com.entity.view.WaiguomeishiView;


/**
 * 外国美食
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface WaiguomeishiDao extends BaseMapper<WaiguomeishiEntity> {
	
	List<WaiguomeishiVO> selectListVO(@Param("ew") Wrapper<WaiguomeishiEntity> wrapper);
	
	WaiguomeishiVO selectVO(@Param("ew") Wrapper<WaiguomeishiEntity> wrapper);
	
	List<WaiguomeishiView> selectListView(@Param("ew") Wrapper<WaiguomeishiEntity> wrapper);

	List<WaiguomeishiView> selectListView(Pagination page,@Param("ew") Wrapper<WaiguomeishiEntity> wrapper);
	
	WaiguomeishiView selectView(@Param("ew") Wrapper<WaiguomeishiEntity> wrapper);
	

}
