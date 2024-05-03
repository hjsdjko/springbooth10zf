package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremencaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremencaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremencaipinView;


/**
 * 热门菜品评论表
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface DiscussremencaipinService extends IService<DiscussremencaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremencaipinVO> selectListVO(Wrapper<DiscussremencaipinEntity> wrapper);
   	
   	DiscussremencaipinVO selectVO(@Param("ew") Wrapper<DiscussremencaipinEntity> wrapper);
   	
   	List<DiscussremencaipinView> selectListView(Wrapper<DiscussremencaipinEntity> wrapper);
   	
   	DiscussremencaipinView selectView(@Param("ew") Wrapper<DiscussremencaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremencaipinEntity> wrapper);
   	

}

