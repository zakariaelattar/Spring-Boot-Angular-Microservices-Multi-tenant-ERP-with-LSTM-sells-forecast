package com.bezkoder.springjwt.Database.Filters;



/*
@Component
public class IncomeRequestFromAuthJwtFilter implements Filter {

    public static final String X_TenantID = "X-Clacks-Overhead";

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) res;
        if (req instanceof HttpServletRequest) {

            String url = ((HttpServletRequest)req).getRequestURL().toString();
            String queryString = ((HttpServletRequest)req).getQueryString();

            System.out.println("incoming request from:"+url);
         if(url =="http://localhost:8005/api/auth/signin")
            {
                req.getRequestDispatcher("http://localhost:8005/api/auth/signin").forward(req, response);

               // ((HttpServletResponse) res).setHeader("X-TenantID","TENANT TEST");
               // ((HttpServletResponse) res).getHeader("X-TenantID");
               // TenantContext.setCurrentTenant("testdb");
            }
        else{
        chain.doFilter(req, res);
            }

        }
    }

    @Override
    public void destroy() {}

    @Override
    public void init(FilterConfig arg0) throws ServletException {}

}
*/
