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


import com.dao.DiscusswaiguomeishiDao;
import com.entity.DiscusswaiguomeishiEntity;
import com.service.DiscusswaiguomeishiService;
import com.entity.vo.DiscusswaiguomeishiVO;
import com.entity.view.DiscusswaiguomeishiView;

@Service("discusswaiguomeishiService")
public class DiscusswaiguomeishiServiceImpl extends ServiceImpl<DiscusswaiguomeishiDao, DiscusswaiguomeishiEntity> implements DiscusswaiguomeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswaiguomeishiEntity> page = this.selectPage(
                new Query<DiscusswaiguomeishiEntity>(params).getPage(),
                new EntityWrapper<DiscusswaiguomeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswaiguomeishiEntity> wrapper) {
		  Page<DiscusswaiguomeishiView> page =new Query<DiscusswaiguomeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswaiguomeishiVO> selectListVO(Wrapper<DiscusswaiguomeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswaiguomeishiVO selectVO(Wrapper<DiscusswaiguomeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswaiguomeishiView> selectListView(Wrapper<DiscusswaiguomeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswaiguomeishiView selectView(Wrapper<DiscusswaiguomeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
