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


import com.dao.DiscusszhongshimeishiDao;
import com.entity.DiscusszhongshimeishiEntity;
import com.service.DiscusszhongshimeishiService;
import com.entity.vo.DiscusszhongshimeishiVO;
import com.entity.view.DiscusszhongshimeishiView;

@Service("discusszhongshimeishiService")
public class DiscusszhongshimeishiServiceImpl extends ServiceImpl<DiscusszhongshimeishiDao, DiscusszhongshimeishiEntity> implements DiscusszhongshimeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhongshimeishiEntity> page = this.selectPage(
                new Query<DiscusszhongshimeishiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhongshimeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhongshimeishiEntity> wrapper) {
		  Page<DiscusszhongshimeishiView> page =new Query<DiscusszhongshimeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhongshimeishiVO> selectListVO(Wrapper<DiscusszhongshimeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhongshimeishiVO selectVO(Wrapper<DiscusszhongshimeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhongshimeishiView> selectListView(Wrapper<DiscusszhongshimeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhongshimeishiView selectView(Wrapper<DiscusszhongshimeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
