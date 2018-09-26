package com.infinium.rasheen.rainbowopapi.util;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CORSFilter extends GenericFilterBean implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        httpResponse.setHeader("Access-Control-Allow-Origin","*");
        httpResponse.setHeader("Access-Control-Allow-Methods","*");
        httpResponse.setHeader("Access-Control-Allow-Headers","*");
        httpResponse.setHeader("Access-Control-Allow-Credentials","false");
        httpResponse.setHeader("Access-Control-Max-Age","3600");

filterChain.doFilter(servletRequest,servletResponse);


    }
}
