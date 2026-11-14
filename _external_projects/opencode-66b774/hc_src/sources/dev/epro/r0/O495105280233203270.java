package dev.epro.r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.ImplVersion;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class O495105280233203270 extends ICronetEngineBuilder {
    public static final Pattern n = Pattern.compile("^[0-9\\.]*$");

    /* renamed from: o, reason: collision with root package name */
    public static final int f410o = X7410747940286448830.j();
    public final O4077903568229246 a;
    public final Context b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public String l;
    public boolean m;

    public O495105280233203270(Context context) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = Z1953481206310471956.C(applicationContext, W13223114868094258148.d);
        try {
            this.h = true;
            this.i = true;
            this.j = false;
            a(0);
            this.m = false;
            this.e = true;
            b(uptimeMillis, true);
        } catch (Throwable th) {
            b(uptimeMillis, false);
            throw th;
        }
    }

    public final void a(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i != 1) {
            i2 = 3;
            if (i != 2) {
                if (i != 3) {
                    S10973172697741180971.j("Unknown public builder cache mode");
                    return;
                }
                i2 = 2;
            }
        } else {
            i2 = 4;
        }
        boolean z = true;
        if (i2 == 1) {
            z = false;
        } else if (i2 != 2 && i2 != 3) {
            if (i2 != 4) {
                throw null;
            }
            z = 2;
        }
        if (z && this.g == null) {
            S10973172697741180971.j("Storage path must be set");
        } else {
            this.k = i2;
        }
    }

    public final void b(long j, boolean z) {
        W13223114868094258148 w13223114868094258148 = W13223114868094258148.d;
        O4077903568229246 o4077903568229246 = this.a;
        if (f410o >= 30) {
            return;
        }
        U10534498473358193554 u10534498473358193554 = new U10534498473358193554();
        u10534498473358193554.e = Boolean.FALSE;
        try {
            u10534498473358193554.b = 2;
            u10534498473358193554.h = Process.myUid();
            u10534498473358193554.g = new K17906237317018138803(ImplVersion.getCronetVersion());
            u10534498473358193554.d = w13223114868094258148;
            u10534498473358193554.f = new K17906237317018138803(ApiVersion.getCronetVersion());
            u10534498473358193554.a = getLogCronetInitializationRef();
            u10534498473358193554.e = Boolean.valueOf(z);
        } finally {
            u10534498473358193554.c = (int) (SystemClock.uptimeMillis() - j);
            o4077903568229246.A(u10534498473358193554);
        }
    }

    public final D11398891543882352014 c() {
        int i;
        int i2;
        boolean z = this.e;
        boolean z2 = this.h;
        boolean z3 = this.i;
        boolean z4 = this.j;
        int A = L11610354117192841236.A(this.k);
        if (A != 0) {
            i = 3;
            if (A != 1) {
                if (A == 2) {
                    i2 = 2;
                } else {
                    if (A != 3) {
                        S10973172697741180971.j("Unknown internal builder cache mode");
                        return null;
                    }
                    i2 = 1;
                }
                return new D11398891543882352014(z, z2, z3, z4, i2, this.l, this.m, getLogCronetInitializationRef());
            }
        } else {
            i = 0;
        }
        i2 = i;
        return new D11398891543882352014(z, z2, z3, z4, i2, this.l, this.m, getLogCronetInitializationRef());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        int i;
        Context context = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (B5998207562248239613.t) {
            i = B5998207562248239613.u;
            if (i == 0) {
                try {
                    i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    B5998207562248239613.u = i;
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append("; Cronet/");
        sb.append(ImplVersion.getCronetVersion());
        sb.append(')');
        return sb.toString();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public long getLogCronetInitializationRef() {
        AtomicLong atomicLong = R5112989431472712448.p;
        atomicLong.compareAndSet(0L, this.a.q());
        return atomicLong.get();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return Collections.unmodifiableSet(hashSet);
    }
}
