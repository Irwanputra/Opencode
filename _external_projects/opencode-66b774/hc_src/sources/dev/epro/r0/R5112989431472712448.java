package dev.epro.r0;

import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R5112989431472712448 extends O495105280233203270 {
    public static final AtomicLong p = new AtomicLong(0);

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        Objects.requireNonNull(str, "The hostname cannot be null.");
        Objects.requireNonNull(set, "The set of SHA256 pins cannot be null.");
        Objects.requireNonNull(date, "The pin expiration date cannot be null.");
        if (O495105280233203270.n.matcher(str).matches()) {
            S10973172697741180971.j(G6547577305291411977.s("Hostname ", str, " is illegal. A hostname should not consist of digits and/or dots only."));
            return null;
        }
        if (str.length() > 255) {
            S10973172697741180971.j(G6547577305291411977.s("Hostname ", str, " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
            return null;
        }
        try {
            IDN.toASCII(str, 2);
            HashMap hashMap = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    S10973172697741180971.j("Public key pin is invalid");
                    return null;
                }
                hashMap.put(Base64.encodeToString(bArr, 0), bArr);
            }
            this.d.add(new E17149812035295265804((byte) 8));
            return this;
        } catch (IllegalArgumentException unused) {
            S10973172697741180971.j(G6547577305291411977.s("Hostname ", str, " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
            return null;
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        if (str.contains("/")) {
            S10973172697741180971.j("Illegal QUIC Hint Host: ".concat(str));
            return null;
        }
        this.c.add(new J3301701597851028733((byte) 8));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (this.f == null) {
            this.f = getDefaultUserAgent();
        }
        return new H1871339784523733955(this);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.j = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        a(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.m = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.e = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        this.l = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setProxyOptions(ProxyOptions proxyOptions) {
        if (proxyOptions != null) {
            if (X7410747940286448830.j() < 38) {
                throw new AssertionError(G6547577305291411977.o(X7410747940286448830.j(), "This should have not been created: the Cronet API being used has an ApiLevel of ", ", but setProxyOptions was added in ApiLevel 38"));
            }
            if (proxyOptions.getProxyList().isEmpty()) {
                throw new AssertionError("The list of proxies should never be empty, this is checked in the API layer");
            }
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        if (new File(str).isDirectory()) {
            this.g = str;
            return this;
        }
        S10973172697741180971.j("Storage path must be set to existing directory");
        return null;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
