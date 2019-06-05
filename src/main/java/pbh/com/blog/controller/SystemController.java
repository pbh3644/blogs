package pbh.com.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static pbh.com.blog.util.SystemCommonConstants.INDEX;

/**
 * @author pangbohuan
 * @description 系统基本功能
 * @date 2019-06-05 17:34
 **/
@RestController
public class SystemController {

    @Resource
    private HttpServletRequest request;

    @Resource
    private HttpServletResponse response;

    /**
     * 当访问项目根本路径的时候自动跳转到官网首页
     */
    @GetMapping("/")
    public void root() throws IOException {
        response.sendRedirect(request.getRequestURL() + INDEX);
    }

    @GetMapping("/destroy")
    public void destroy() {
        System.exit(0);
    }
}
