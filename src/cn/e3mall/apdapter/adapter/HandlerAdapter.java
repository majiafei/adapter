package cn.e3mall.apdapter.adapter;

/**
 * @ProjectName: house
 * @Package: cn.e3mall.apdapter
 * @ClassName: HandlerAdapter
 * @Author: majiafei
 * @Description:
 * @Date: 2019/1/16 11:07
 */
public interface HandlerAdapter {

    boolean support(Object handler);

    void handler(Object handler);

}
