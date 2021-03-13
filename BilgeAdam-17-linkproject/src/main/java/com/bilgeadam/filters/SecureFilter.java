package com.bilgeadam.filters;

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
        }, urlPatterns = {("/secure/*")}
)
public class SecureFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        if(((HttpServletRequest)servletRequest).getSession().getAttribute("username") == null) {
            ((HttpServletRequest)servletRequest).getRequestDispatcher("/index").forward(servletRequest,servletResponse);
        }

        filterChain.doFilter(servletRequest,servletResponse);
    }

}
