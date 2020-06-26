package com.bezkoder.springjwt.Database.HibernateAdaptation;


import com.bezkoder.springjwt.Database.Identifiers.TenantContext;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

/**
 * CurrentTenantIdentifierResolver: It tells hibernate which
 * is the current configured tenant. It uses the previous ThreadLocal
 * variable set by the interceptor. If no Tenant id is found then the Public
 * schema is used as default tenant.
 */

@Component
public class TenantSchemaResolver implements CurrentTenantIdentifierResolver {

    private String defaultTenant ="testdb1";

    @Override
    public String resolveCurrentTenantIdentifier() {
        String t =  TenantContext.getCurrentTenant();
        if(t!=null){
            return t;
        } else {
            return defaultTenant;
        }
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
