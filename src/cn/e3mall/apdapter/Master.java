package cn.e3mall.apdapter;

import cn.e3mall.apdapter.handler.Handler;
import cn.e3mall.apdapter.handler.MethodHandler;
import cn.e3mall.apdapter.handler.RequestMappingHandler;
import cn.e3mall.apdapter.servlet.DispacherServlet;

/**
 * @ProjectName: house
 * @Package: cn.e3mall.apdapter
 * @ClassName: Master
 * @Author: majiafei
 * @Description:
 * @Date: 2019/1/16 11:19
 */
public class Master {

    public static void main(String[] args) throws Exception{
        Handler handler = new MethodHandler();
        DispacherServlet dispacherServlet = new DispacherServlet();
        dispacherServlet.doDispacher(handler);
    }

}
