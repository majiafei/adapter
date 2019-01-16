package cn.e3mall.apdapter.adapter;

import cn.e3mall.apdapter.adapter.HandlerAdapter;
import cn.e3mall.apdapter.handler.Handler;

/**
 * @ProjectName: house
 * @Package: cn.e3mall.apdapter
 * @ClassName: RequestMappingHandlerAdapter
 * @Author: majiafei
 * @Description:
 * @Date: 2019/1/16 11:11
 */
public class RequestMappingHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean support(Object handler) {
        return (handler instanceof Handler);
    }

    @Override
    public void handler(Object handler) {
        ((Handler)handler).handler();
    }

}
