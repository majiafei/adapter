package cn.e3mall.apdapter.handler;

/**
 * @ProjectName: house
 * @Package: cn.e3mall.apdapter.handler
 * @ClassName: RequestMappingHandler
 * @Author: majiafei
 * @Description:
 * @Date: 2019/1/16 11:15
 */
public class RequestMappingHandler implements  Handler{

    @Override
    public void handler() {
        System.out.println("我是"+ RequestMappingHandler.class.getName()+"， 很开心见到大家");
    }
}
