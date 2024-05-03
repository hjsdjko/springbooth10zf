package com.entity.view;

import com.entity.RemencaipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门菜品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 17:21:19
 */
@TableName("remencaipin")
public class RemencaipinView  extends RemencaipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RemencaipinView(){
	}
 
 	public RemencaipinView(RemencaipinEntity remencaipinEntity){
 	try {
			BeanUtils.copyProperties(this, remencaipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
