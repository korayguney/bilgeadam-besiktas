package com.bilgeadam.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(
        dispatcherTypes = {
                DispatcherType.REQUEST,
                DispatcherType.FORWARD,
                DispatcherType.ERROR,
                DispatcherType.INCLUDE
        }, urlPatterns = {"/secure/*"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Object session = ((HttpServletRequest)servletRequest).getSession().getAttribute("sessionScopeBean");
        if(session != null){
            filterChain.doFilter(servletRequest,servletResponse);
        } else {
            ((HttpServletResponse)servletResponse).sendRedirect("../index.xhtml");
        }
    }
}
