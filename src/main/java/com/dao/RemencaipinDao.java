package com.dao;

import com.entity.RemencaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemencaipinVO;
import com.entity.view.RemencaipinView;


/**
 * 热门菜品
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface RemencaipinDao extends BaseMapper<RemencaipinEntity> {
	
	List<RemencaipinVO> selectListVO(@Param("ew") Wrapper<RemencaipinEntity> wrapper);
	
	RemencaipinVO selectVO(@Param("ew") Wrapper<RemencaipinEntity> wrapper);
	
	List<RemencaipinView> selectListView(@Param("ew") Wrapper<RemencaipinEntity> wrapper);

	List<RemencaipinView> selectListView(Pagination page,@Param("ew") Wrapper<RemencaipinEntity> wrapper);
	
	RemencaipinView selectView(@Param("ew") Wrapper<RemencaipinEntity> wrapper);
	

}
