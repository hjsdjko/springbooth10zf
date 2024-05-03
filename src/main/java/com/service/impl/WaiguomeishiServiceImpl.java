package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WaiguomeishiDao;
import com.entity.WaiguomeishiEntity;
import com.service.WaiguomeishiService;
import com.entity.vo.WaiguomeishiVO;
import com.entity.view.WaiguomeishiView;

@Service("waiguomeishiService")
public class WaiguomeishiServiceImpl extends ServiceImpl<WaiguomeishiDao, WaiguomeishiEntity> implements WaiguomeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WaiguomeishiEntity> page = this.selectPage(
                new Query<WaiguomeishiEntity>(params).getPage(),
                new EntityWrapper<WaiguomeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WaiguomeishiEntity> wrapper) {
		  Page<WaiguomeishiView> page =new Query<WaiguomeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WaiguomeishiVO> selectListVO(Wrapper<WaiguomeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WaiguomeishiVO selectVO(Wrapper<WaiguomeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WaiguomeishiView> selectListView(Wrapper<WaiguomeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WaiguomeishiView selectView(Wrapper<WaiguomeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
