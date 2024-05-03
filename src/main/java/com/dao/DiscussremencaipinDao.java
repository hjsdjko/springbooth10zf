package com.dao;

import com.entity.DiscussremencaipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremencaipinVO;
import com.entity.view.DiscussremencaipinView;


/**
 * 热门菜品评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface DiscussremencaipinDao extends BaseMapper<DiscussremencaipinEntity> {
	
	List<DiscussremencaipinVO> selectListVO(@Param("ew") Wrapper<DiscussremencaipinEntity> wrapper);
	
	DiscussremencaipinVO selectVO(@Param("ew") Wrapper<DiscussremencaipinEntity> wrapper);
	
	List<DiscussremencaipinView> selectListView(@Param("ew") Wrapper<DiscussremencaipinEntity> wrapper);

	List<DiscussremencaipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremencaipinEntity> wrapper);
	
	DiscussremencaipinView selectView(@Param("ew") Wrapper<DiscussremencaipinEntity> wrapper);
	

}
