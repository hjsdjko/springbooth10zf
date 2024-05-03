package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongshimeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongshimeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongshimeishiView;


/**
 * 中式美食
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
public interface ZhongshimeishiService extends IService<ZhongshimeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongshimeishiVO> selectListVO(Wrapper<ZhongshimeishiEntity> wrapper);
   	
   	ZhongshimeishiVO selectVO(@Param("ew") Wrapper<ZhongshimeishiEntity> wrapper);
   	
   	List<ZhongshimeishiView> selectListView(Wrapper<ZhongshimeishiEntity> wrapper);
   	
   	ZhongshimeishiView selectView(@Param("ew") Wrapper<ZhongshimeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongshimeishiEntity> wrapper);
   	

}

