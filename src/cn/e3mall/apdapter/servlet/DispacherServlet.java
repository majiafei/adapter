package cn.e3mall.apdapter.servlet;

import cn.e3mall.apdapter.adapter.HandlerAdapter;
import cn.e3mall.apdapter.adapter.RequestMappingHandlerAdapter;
import cn.e3mall.apdapter.handler.Handler;
import com.sun.org.apache.xalan.internal.lib.ExsltBase;
import com.sun.xml.internal.ws.util.HandlerAnnotationProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: house
 * @Package: cn.e3mall.apdapter.servlet
 * @ClassName: DispacherServlet
 * @Author: majiafei
 * @Description:
 * @Date: 2019/1/16 11:19
 */
public class DispacherServlet {

    private static final List<HandlerAdapter> HANDLER_ADAPTERS = new ArrayList<>();

    public  DispacherServlet() {
        HANDLER_ADAPTERS.add(new RequestMappingHandlerAdapter());
    }

    public void doDispacher(Handler handler) throws Exception{
        HandlerAdapter handlerAdapter = getHandlerAdapter(handler);

        if (handlerAdapter == null) {
            throw new Exception("适配器不存在");
        }
        handlerAdapter.handler(handler);
    }

    private HandlerAdapter getHandlerAdapter(Handler handler) {
        for (HandlerAdapter handlerAdapter : HANDLER_ADAPTERS) {
            if (handlerAdapter.support(handler)) {
                return handlerAdapter;
            }
        }

        return null;
    }

}
