package dev.epro.r0;

import ads_mobile_sdk.i11;
import ads_mobile_sdk.j11;
import android.os.Trace;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class L12449384090336186263 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ L12449384090336186263(j11 j11Var, String str, X627358512999327803 x627358512999327803, boolean z, String str2, byte[] bArr) {
        this.d = j11Var;
        this.b = str;
        this.e = x627358512999327803;
        this.c = z;
        this.f = str2;
        this.g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A6237865184482427403 a6237865184482427403C;
        Throwable th;
        SocketTimeoutException socketTimeoutException;
        byte b = this.a;
        HttpURLConnection httpURLConnection = null;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                S16571168858015125610 s16571168858015125610 = (S16571168858015125610) obj4;
                F10342546226345611902 f10342546226345611902 = (F10342546226345611902) obj3;
                String str = this.b;
                R8540738700654750557 r8540738700654750557 = (R8540738700654750557) obj2;
                U14340554418656580554 u14340554418656580554 = (U14340554418656580554) obj;
                boolean z = this.c;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    M4722199849958580248 m4722199849958580248H = D459204867321966484.h();
                    A6237865184482427403 a6237865184482427403 = m4722199849958580248H instanceof A6237865184482427403 ? (A6237865184482427403) m4722199849958580248H : null;
                    if (a6237865184482427403 == null || (a6237865184482427403C = a6237865184482427403.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        M4722199849958580248 m4722199849958580248J = a6237865184482427403C.j();
                        try {
                            S16571168858015125610 s16571168858015125610L = H4776669175763245653.l(s16571168858015125610, f10342546226345611902);
                            O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
                            D417720124633959953 d417720124633959953 = new D417720124633959953(str, s16571168858015125610L, o2161699089510411363, o2161699089510411363, u14340554418656580554, r8540738700654750557, z);
                            d417720124633959953.c();
                            d417720124633959953.a();
                            a6237865184482427403C.w().h();
                            Trace.endSection();
                            return;
                        } finally {
                            M4722199849958580248.q(m4722199849958580248J);
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                j11 j11Var = (j11) obj4;
                String str2 = this.b;
                X627358512999327803 x627358512999327803 = (X627358512999327803) obj3;
                String str3 = (String) obj2;
                byte[] bArr = (byte[]) obj;
                long j = j11Var.c;
                try {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) URI.create(str2).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection2);
                            C439001677970731857 c439001677970731857 = new C439001677970731857(httpURLConnection2, (byte) 2);
                            ExecutorService executorService = j11Var.a;
                            W8823188230031025271 w8823188230031025271 = x627358512999327803.c;
                            if (w8823188230031025271 != null) {
                                w8823188230031025271.a(c439001677970731857, executorService);
                            }
                            httpURLConnection2.setRequestProperty("User-Agent", j11Var.b);
                            int i = (int) j;
                            httpURLConnection2.setConnectTimeout(i);
                            httpURLConnection2.setReadTimeout(i);
                            if (this.c) {
                                httpURLConnection2.setDoOutput(true);
                                httpURLConnection2.setRequestMethod("POST");
                                if (str3 != null) {
                                    httpURLConnection2.setRequestProperty("Content-Type", str3);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    bufferedOutputStream.close();
                                } finally {
                                }
                            }
                            int responseCode = httpURLConnection2.getResponseCode();
                            x627358512999327803.a(new i11(responseCode, j11.a(httpURLConnection2, responseCode)));
                            httpURLConnection2.disconnect();
                            return;
                        } catch (SocketTimeoutException e) {
                            socketTimeoutException = e;
                            httpURLConnection = httpURLConnection2;
                            x627358512999327803.b(new TimeoutException("Timeout: " + socketTimeoutException.getMessage()));
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            httpURLConnection = httpURLConnection2;
                            x627358512999327803.b(th);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return;
                        }
                    } finally {
                    }
                } catch (SocketTimeoutException e2) {
                    socketTimeoutException = e2;
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
        }
    }

    public /* synthetic */ L12449384090336186263(S16571168858015125610 s16571168858015125610, F10342546226345611902 f10342546226345611902, String str, R8540738700654750557 r8540738700654750557, U14340554418656580554 u14340554418656580554, boolean z) {
        this.d = s16571168858015125610;
        this.e = f10342546226345611902;
        this.b = str;
        this.f = r8540738700654750557;
        this.g = u14340554418656580554;
        this.c = z;
    }
}
