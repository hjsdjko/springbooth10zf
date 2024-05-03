package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RemencaipinEntity;
import com.entity.view.RemencaipinView;

import com.service.RemencaipinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 热门菜品
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
@RestController
@RequestMapping("/remencaipin")
public class RemencaipinController {
    @Autowired
    private RemencaipinService remencaipinService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RemencaipinEntity remencaipin,
		HttpServletRequest request){
        EntityWrapper<RemencaipinEntity> ew = new EntityWrapper<RemencaipinEntity>();
		PageUtils page = remencaipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remencaipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RemencaipinEntity remencaipin, 
		HttpServletRequest request){
        EntityWrapper<RemencaipinEntity> ew = new EntityWrapper<RemencaipinEntity>();
		PageUtils page = remencaipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remencaipin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RemencaipinEntity remencaipin){
       	EntityWrapper<RemencaipinEntity> ew = new EntityWrapper<RemencaipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( remencaipin, "remencaipin")); 
        return R.ok().put("data", remencaipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RemencaipinEntity remencaipin){
        EntityWrapper< RemencaipinEntity> ew = new EntityWrapper< RemencaipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( remencaipin, "remencaipin")); 
		RemencaipinView remencaipinView =  remencaipinService.selectView(ew);
		return R.ok("查询热门菜品成功").put("data", remencaipinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RemencaipinEntity remencaipin = remencaipinService.selectById(id);
        return R.ok().put("data", remencaipin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RemencaipinEntity remencaipin = remencaipinService.selectById(id);
        return R.ok().put("data", remencaipin);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        RemencaipinEntity remencaipin = remencaipinService.selectById(id);
        if(type.equals("1")) {
        	remencaipin.setThumbsupnum(remencaipin.getThumbsupnum()+1);
        } else {
        	remencaipin.setCrazilynum(remencaipin.getCrazilynum()+1);
        }
        remencaipinService.updateById(remencaipin);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RemencaipinEntity remencaipin, HttpServletRequest request){
    	remencaipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(remencaipin);
        remencaipinService.insert(remencaipin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody RemencaipinEntity remencaipin, HttpServletRequest request){
    	remencaipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(remencaipin);
        remencaipinService.insert(remencaipin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RemencaipinEntity remencaipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(remencaipin);
        remencaipinService.updateById(remencaipin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        remencaipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<RemencaipinEntity> wrapper = new EntityWrapper<RemencaipinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = remencaipinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
