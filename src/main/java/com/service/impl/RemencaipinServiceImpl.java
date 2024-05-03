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


import com.dao.RemencaipinDao;
import com.entity.RemencaipinEntity;
import com.service.RemencaipinService;
import com.entity.vo.RemencaipinVO;
import com.entity.view.RemencaipinView;

@Service("remencaipinService")
public class RemencaipinServiceImpl extends ServiceImpl<RemencaipinDao, RemencaipinEntity> implements RemencaipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemencaipinEntity> page = this.selectPage(
                new Query<RemencaipinEntity>(params).getPage(),
                new EntityWrapper<RemencaipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemencaipinEntity> wrapper) {
		  Page<RemencaipinView> page =new Query<RemencaipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemencaipinVO> selectListVO(Wrapper<RemencaipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemencaipinVO selectVO(Wrapper<RemencaipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemencaipinView> selectListView(Wrapper<RemencaipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemencaipinView selectView(Wrapper<RemencaipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
