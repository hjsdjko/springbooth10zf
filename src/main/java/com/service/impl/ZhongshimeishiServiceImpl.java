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


import com.dao.ZhongshimeishiDao;
import com.entity.ZhongshimeishiEntity;
import com.service.ZhongshimeishiService;
import com.entity.vo.ZhongshimeishiVO;
import com.entity.view.ZhongshimeishiView;

@Service("zhongshimeishiService")
public class ZhongshimeishiServiceImpl extends ServiceImpl<ZhongshimeishiDao, ZhongshimeishiEntity> implements ZhongshimeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongshimeishiEntity> page = this.selectPage(
                new Query<ZhongshimeishiEntity>(params).getPage(),
                new EntityWrapper<ZhongshimeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongshimeishiEntity> wrapper) {
		  Page<ZhongshimeishiView> page =new Query<ZhongshimeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongshimeishiVO> selectListVO(Wrapper<ZhongshimeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongshimeishiVO selectVO(Wrapper<ZhongshimeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongshimeishiView> selectListView(Wrapper<ZhongshimeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongshimeishiView selectView(Wrapper<ZhongshimeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
