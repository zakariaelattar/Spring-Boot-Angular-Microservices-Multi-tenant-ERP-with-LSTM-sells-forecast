package com.bezkoder.springjwt.Database.Identifiers;


import org.springframework.stereotype.Component;

@Component
public class TenantContext {
    final public static String DEFAULT_TENANT = "hole";
    private static ThreadLocal<String> currentTenant = new InheritableThreadLocal<>();

    public static String getCurrentTenant() {
        return currentTenant.get();
    }

    public static void setCurrentTenant(String tenant) {
        currentTenant.set(tenant);
    }

    public static void clear() {
        currentTenant.set(null);
    }
}
