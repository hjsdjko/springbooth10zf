package com.entity.view;

import com.entity.ZhongshimeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 中式美食
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
@TableName("zhongshimeishi")
public class ZhongshimeishiView  extends ZhongshimeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhongshimeishiView(){
	}
 
 	public ZhongshimeishiView(ZhongshimeishiEntity zhongshimeishiEntity){
 	try {
			BeanUtils.copyProperties(this, zhongshimeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
