package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WaiguomeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WaiguomeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WaiguomeishiView;


/**
 * 外国美食
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface WaiguomeishiService extends IService<WaiguomeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WaiguomeishiVO> selectListVO(Wrapper<WaiguomeishiEntity> wrapper);
   	
   	WaiguomeishiVO selectVO(@Param("ew") Wrapper<WaiguomeishiEntity> wrapper);
   	
   	List<WaiguomeishiView> selectListView(Wrapper<WaiguomeishiEntity> wrapper);
   	
   	WaiguomeishiView selectView(@Param("ew") Wrapper<WaiguomeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WaiguomeishiEntity> wrapper);
   	

}

