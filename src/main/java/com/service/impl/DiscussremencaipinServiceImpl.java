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


import com.dao.DiscussremencaipinDao;
import com.entity.DiscussremencaipinEntity;
import com.service.DiscussremencaipinService;
import com.entity.vo.DiscussremencaipinVO;
import com.entity.view.DiscussremencaipinView;

@Service("discussremencaipinService")
public class DiscussremencaipinServiceImpl extends ServiceImpl<DiscussremencaipinDao, DiscussremencaipinEntity> implements DiscussremencaipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremencaipinEntity> page = this.selectPage(
                new Query<DiscussremencaipinEntity>(params).getPage(),
                new EntityWrapper<DiscussremencaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremencaipinEntity> wrapper) {
		  Page<DiscussremencaipinView> page =new Query<DiscussremencaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremencaipinVO> selectListVO(Wrapper<DiscussremencaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremencaipinVO selectVO(Wrapper<DiscussremencaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremencaipinView> selectListView(Wrapper<DiscussremencaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremencaipinView selectView(Wrapper<DiscussremencaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
