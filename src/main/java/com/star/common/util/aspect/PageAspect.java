package com.star.common.util.aspect;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.star.common.util.PageBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class PageAspect {

    @Around(value = "execution(* *..*Service.*Pager(..))")
    public Object pagerInvoke(ProceedingJoinPoint pjp) throws Throwable{
        //获取执行参数
        Object[] args = pjp.getArgs();
        //定义pagbean
        PageBean pageBean=null;
        //判断参数是否包含pagebean
        for (Object arg : args) {
            if(arg instanceof PageBean){
                pageBean =(PageBean)arg;
                break;
            }
        }

        //进行分页设置
        if(null!=pageBean&&pageBean.isPagination())
            PageHelper.offsetPage(pageBean.getPage(),pageBean.getRows());

        //执行目标查询返回结果集
        Object returnValue = pjp.proceed();
        //判断分页
        if (null != pageBean)
            if (pageBean.isPagination()) {
                //转换结果集
                List list = (List) returnValue;
                //构建pageHelper插件类
                PageInfo pageInfo = new PageInfo(list);
                //设置pageBean参数
                pageBean.setTotal(Integer.parseInt((pageInfo.getTotal() + "")));
            }
        return returnValue;
    }

}
