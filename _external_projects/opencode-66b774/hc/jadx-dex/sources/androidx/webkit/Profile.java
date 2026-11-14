package androidx.webkit;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public interface Profile {
    default void addQuicHints(java.util.Set<java.lang.String> set) {
        throw new java.lang.UnsupportedOperationException("Profile#addQuicHints is not implemented.");
    }

    void clearAllOriginMatchedHeaders();

    void clearOriginMatchedHeader(java.lang.String str);

    void clearPrefetchAsync(java.lang.String str, java.util.concurrent.Executor executor, dev.epro.r0.H2380759164981958837 h2380759164981958837);

    android.webkit.CookieManager getCookieManager();

    default java.util.Set<dev.epro.r0.R444033989346135237> getCustomHeaders() {
        return java.util.Collections.EMPTY_SET;
    }

    android.webkit.GeolocationPermissions getGeolocationPermissions();

    java.lang.String getName();

    android.webkit.ServiceWorkerController getServiceWorkerController();

    android.webkit.WebStorage getWebStorage();

    default boolean hasCustomHeader(java.lang.String str) {
        return false;
    }

    boolean hasOriginMatchedHeader(java.lang.String str);

    default void preconnect(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Profile#preconnect is not implemented.");
    }

    void prefetchUrlAsync(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, dev.epro.r0.H2380759164981958837 h2380759164981958837);

    void prefetchUrlAsync(java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, dev.epro.r0.L5815873079508621496 l5815873079508621496, dev.epro.r0.H2380759164981958837 h2380759164981958837);

    void setOriginMatchedHeader(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set);

    void setSpeculativeLoadingConfig(dev.epro.r0.B8791973693277726227 b8791973693277726227);

    void warmUpRendererProcess();

    default void clearCustomHeader(java.lang.String str, java.lang.String str2) {
    }

    default java.util.Set<dev.epro.r0.R444033989346135237> getCustomHeaders(java.lang.String str) {
        return java.util.Collections.EMPTY_SET;
    }

    default java.util.Set<dev.epro.r0.R444033989346135237> getCustomHeaders(java.lang.String str, java.lang.String str2) {
        return java.util.Collections.EMPTY_SET;
    }

    default void clearAllCustomHeaders() {
    }

    default void addCustomHeader(dev.epro.r0.R444033989346135237 r444033989346135237) {
    }

    default void clearCustomHeader(java.lang.String str) {
    }
}
