package androidx.webkit;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import dev.epro.r0.B8791973693277726227;
import dev.epro.r0.H2380759164981958837;
import dev.epro.r0.L5815873079508621496;
import dev.epro.r0.R444033989346135237;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public interface Profile {
    default void addQuicHints(Set<String> set) {
        throw new UnsupportedOperationException("Profile#addQuicHints is not implemented.");
    }

    void clearAllOriginMatchedHeaders();

    void clearOriginMatchedHeader(String str);

    void clearPrefetchAsync(String str, Executor executor, H2380759164981958837 h2380759164981958837);

    CookieManager getCookieManager();

    default Set<R444033989346135237> getCustomHeaders() {
        return Collections.EMPTY_SET;
    }

    GeolocationPermissions getGeolocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    default boolean hasCustomHeader(String str) {
        return false;
    }

    boolean hasOriginMatchedHeader(String str);

    default void preconnect(String str) {
        throw new UnsupportedOperationException("Profile#preconnect is not implemented.");
    }

    void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, H2380759164981958837 h2380759164981958837);

    void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, L5815873079508621496 l5815873079508621496, H2380759164981958837 h2380759164981958837);

    void setOriginMatchedHeader(String str, String str2, Set<String> set);

    void setSpeculativeLoadingConfig(B8791973693277726227 b8791973693277726227);

    void warmUpRendererProcess();

    default void clearCustomHeader(String str, String str2) {
    }

    default Set<R444033989346135237> getCustomHeaders(String str) {
        return Collections.EMPTY_SET;
    }

    default Set<R444033989346135237> getCustomHeaders(String str, String str2) {
        return Collections.EMPTY_SET;
    }

    default void clearAllCustomHeaders() {
    }

    default void addCustomHeader(R444033989346135237 r444033989346135237) {
    }

    default void clearCustomHeader(String str) {
    }
}
