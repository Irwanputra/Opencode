package dev.epro.r0;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.webkit.Profile;
import java.lang.reflect.InvocationHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.OriginMatchedHeaderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z12604781490060456085 implements Profile {
    public final ProfileBoundaryInterface a;

    public Z12604781490060456085(ProfileBoundaryInterface profileBoundaryInterface) {
        this.a = profileBoundaryInterface;
    }

    public final HashSet a(String str, String str2) {
        HashSet hashSet = new HashSet();
        Iterator<InvocationHandler> it = this.a.getOriginMatchedHeaders(str, str2).iterator();
        while (it.hasNext()) {
            OriginMatchedHeaderBoundaryInterface originMatchedHeaderBoundaryInterface = (OriginMatchedHeaderBoundaryInterface) K5751602218013079365.w(OriginMatchedHeaderBoundaryInterface.class, it.next());
            hashSet.add(new R444033989346135237(originMatchedHeaderBoundaryInterface.getName(), originMatchedHeaderBoundaryInterface.getValue(), originMatchedHeaderBoundaryInterface.getRules()));
        }
        return hashSet;
    }

    @Override // androidx.webkit.Profile
    public final void addCustomHeader(R444033989346135237 r444033989346135237) {
        if (!Q6344330807969154194.C.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.addOriginMatchedHeader(r444033989346135237.a, r444033989346135237.b, r444033989346135237.c);
    }

    @Override // androidx.webkit.Profile
    public final void addQuicHints(Set set) {
        if (!Q6344330807969154194.E.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.addQuicHints(set);
    }

    @Override // androidx.webkit.Profile
    public final void clearAllCustomHeaders() {
        if (!Q6344330807969154194.C.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.clearAllOriginMatchedHeaders();
    }

    @Override // androidx.webkit.Profile
    public final void clearAllOriginMatchedHeaders() {
        if (!Q6344330807969154194.B.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.clearAllOriginMatchedHeaders();
    }

    @Override // androidx.webkit.Profile
    public final void clearCustomHeader(String str) {
        if (!Q6344330807969154194.C.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.clearOriginMatchedHeader(str, null);
    }

    @Override // androidx.webkit.Profile
    public final void clearOriginMatchedHeader(String str) {
        if (!Q6344330807969154194.B.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.clearOriginMatchedHeader(str);
    }

    @Override // androidx.webkit.Profile
    public final void clearPrefetchAsync(String str, Executor executor, H2380759164981958837 h2380759164981958837) {
        if (!Q6344330807969154194.q.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.clearPrefetch(str, executor, new J15503348699114933825(new Q3419690026111445169(h2380759164981958837)));
    }

    @Override // androidx.webkit.Profile
    public final CookieManager getCookieManager() {
        if (Q6344330807969154194.f456o.b()) {
            return this.a.getCookieManager();
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders() {
        if (Q6344330807969154194.C.b()) {
            return a(null, null);
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final GeolocationPermissions getGeolocationPermissions() {
        if (Q6344330807969154194.f456o.b()) {
            return this.a.getGeoLocationPermissions();
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final String getName() {
        if (Q6344330807969154194.f456o.b()) {
            return this.a.getName();
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final ServiceWorkerController getServiceWorkerController() {
        if (Q6344330807969154194.f456o.b()) {
            return this.a.getServiceWorkerController();
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final WebStorage getWebStorage() {
        if (Q6344330807969154194.f456o.b()) {
            return this.a.getWebStorage();
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final boolean hasCustomHeader(String str) {
        if (Q6344330807969154194.C.b()) {
            return this.a.hasOriginMatchedHeader(str);
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final boolean hasOriginMatchedHeader(String str) {
        if (Q6344330807969154194.B.b()) {
            return this.a.hasOriginMatchedHeader(str);
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final void preconnect(String str) {
        if (!Q6344330807969154194.D.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.preconnect(str);
    }

    @Override // androidx.webkit.Profile
    public final void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, L5815873079508621496 l5815873079508621496, H2380759164981958837 h2380759164981958837) {
        if (!Q6344330807969154194.q.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.prefetchUrl(str, cancellationSignal, executor, new J15503348699114933825(new M10846389789027735899((byte) 29)), new J15503348699114933825(new Q3419690026111445169(h2380759164981958837)));
    }

    @Override // androidx.webkit.Profile
    public final void setOriginMatchedHeader(String str, String str2, Set set) {
        if (!Q6344330807969154194.B.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.setOriginMatchedHeader(str, str2, set);
    }

    @Override // androidx.webkit.Profile
    public final void setSpeculativeLoadingConfig(B8791973693277726227 b8791973693277726227) {
        if (!Q6344330807969154194.v.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.setSpeculativeLoadingConfig(new J15503348699114933825(new J3301701597851028733((byte) 28)));
    }

    @Override // androidx.webkit.Profile
    public final void warmUpRendererProcess() {
        if (!Q6344330807969154194.A.b()) {
            throw Q6344330807969154194.a();
        }
        this.a.warmUpRendererProcess();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders(String str) {
        if (Q6344330807969154194.C.b()) {
            return a(str, null);
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final void clearCustomHeader(String str, String str2) {
        if (Q6344330807969154194.C.b()) {
            this.a.clearOriginMatchedHeader(str, str2);
            return;
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders(String str, String str2) {
        if (Q6344330807969154194.C.b()) {
            return a(str, str2);
        }
        throw Q6344330807969154194.a();
    }

    @Override // androidx.webkit.Profile
    public final void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, H2380759164981958837 h2380759164981958837) {
        if (Q6344330807969154194.q.b()) {
            this.a.prefetchUrl(str, cancellationSignal, executor, new J15503348699114933825(new Q3419690026111445169(h2380759164981958837)));
            return;
        }
        throw Q6344330807969154194.a();
    }
}
