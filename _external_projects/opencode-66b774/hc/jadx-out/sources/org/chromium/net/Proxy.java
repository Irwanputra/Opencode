package org.chromium.net;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.L15510417080911867038;
import dev.epro.r0.S10973172697741180971;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Proxy {
    public static final int HTTP = 0;
    public static final int HTTPS = 1;
    private final Callback mCallback;
    private final Executor mExecutor;
    private final String mHost;
    private final int mPort;
    private final int mScheme;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Scheme {
    }

    public Proxy(int i, String str, int i2, Executor executor, Callback callback) {
        if (i != 0 && i != 1) {
            S10973172697741180971.j(G6547577305291411977.n(i, "Unknown scheme "));
            throw null;
        }
        this.mScheme = i;
        Objects.requireNonNull(str);
        this.mHost = str;
        this.mPort = i2;
        Objects.requireNonNull(executor);
        this.mExecutor = executor;
        Objects.requireNonNull(callback);
        this.mCallback = callback;
    }

    public Callback getCallback() {
        return this.mCallback;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public String getHost() {
        return this.mHost;
    }

    public int getPort() {
        return this.mPort;
    }

    public int getScheme() {
        return this.mScheme;
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static abstract class Callback {

        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public static abstract class Request implements AutoCloseable {
            @Override // java.lang.AutoCloseable
            public abstract void close();

            public abstract void proceed(List<Map.Entry<String, String>> list);
        }

        public void onBeforeTunnelRequest(Request request) {
            try {
                List<Map.Entry<String, String>> listOnBeforeTunnelRequest = onBeforeTunnelRequest();
                if (listOnBeforeTunnelRequest != null) {
                    request.proceed(listOnBeforeTunnelRequest);
                }
                if (request != null) {
                    request.close();
                }
            } catch (Throwable th) {
                if (request != null) {
                    try {
                        request.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public abstract boolean onTunnelHeadersReceived(List<Map.Entry<String, String>> list, int i);

        @Deprecated
        public List<Map.Entry<String, String>> onBeforeTunnelRequest() {
            throw new UnsupportedOperationException("At least one overload of onBeforeTunnelRequest must be overridden");
        }
    }

    @Deprecated
    public Proxy(int i, String str, int i2, Callback callback) {
        this(i, str, i2, new L15510417080911867038((byte) 3), callback);
    }
}
