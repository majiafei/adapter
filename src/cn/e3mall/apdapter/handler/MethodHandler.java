package cn.e3mall.apdapter.handler;

/**
 * @ProjectName: house
 * @Package: cn.e3mall.apdapter.handler
 * @ClassName: MethodHandler
 * @Author: majiafei
 * @Description:
 * @Date: 2019/1/16 11:29
 */
public class MethodHandler implements Handler {
    @Override
    public void handler() {
        System.out.println("hello" + MethodHandler.class.getName());
    }
}
