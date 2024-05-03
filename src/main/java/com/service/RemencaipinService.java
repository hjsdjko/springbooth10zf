package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemencaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemencaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemencaipinView;


/**
 * 热门菜品
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface RemencaipinService extends IService<RemencaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemencaipinVO> selectListVO(Wrapper<RemencaipinEntity> wrapper);
   	
   	RemencaipinVO selectVO(@Param("ew") Wrapper<RemencaipinEntity> wrapper);
   	
   	List<RemencaipinView> selectListView(Wrapper<RemencaipinEntity> wrapper);
   	
   	RemencaipinView selectView(@Param("ew") Wrapper<RemencaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemencaipinEntity> wrapper);
   	

}

