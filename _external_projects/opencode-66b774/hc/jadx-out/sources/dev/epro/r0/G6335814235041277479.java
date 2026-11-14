package dev.epro.r0;

import ads_mobile_sdk.fk;
import ads_mobile_sdk.rt0;
import ads_mobile_sdk.v6;
import ads_mobile_sdk.vm2;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G6335814235041277479 implements I8344119817086563006, Z5019126814379845930, E1725159089660790042 {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public G6335814235041277479(X14364139104409853146 x14364139104409853146, R3937090736490516115 r3937090736490516115, Object obj, Z13251062865217617579 z13251062865217617579) {
        G5020774698099390921 g5020774698099390921 = new G5020774698099390921(x14364139104409853146.a);
        this.b = g5020774698099390921;
        this.c = r3937090736490516115;
        this.d = obj;
        O3410298526443296213 o3410298526443296213 = (O3410298526443296213) r3937090736490516115;
        Z13251062865217617579 z132510628652176175792 = (Z13251062865217617579) o3410298526443296213.a.invoke(obj);
        this.f = z132510628652176175792;
        this.g = E3422549137300678133.N(z13251062865217617579);
        F4096073349764486348 f4096073349764486348 = o3410298526443296213.b;
        Z13251062865217617579 z13251062865217617579C = g5020774698099390921.d;
        if (z13251062865217617579C == null) {
            z13251062865217617579C = z132510628652176175792.c();
            g5020774698099390921.d = z13251062865217617579C;
        }
        int iB = z13251062865217617579C.b();
        int i = 0;
        while (true) {
            Z13251062865217617579 z132510628652176175793 = g5020774698099390921.d;
            X6460762560403092052 x6460762560403092052 = g5020774698099390921.a;
            if (i >= iB) {
                if (z132510628652176175793 == null) {
                    S10823041268949770285.b0("targetVector");
                    throw null;
                }
                this.e = f4096073349764486348.invoke(z132510628652176175793);
                Z13251062865217617579 z13251062865217617579C2 = g5020774698099390921.c;
                if (z13251062865217617579C2 == null) {
                    z13251062865217617579C2 = z132510628652176175792.c();
                    g5020774698099390921.c = z13251062865217617579C2;
                }
                int iB2 = z13251062865217617579C2.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    z132510628652176175792.getClass();
                    jMax = Math.max(jMax, x6460762560403092052.g(z13251062865217617579.a(i2)));
                }
                this.a = jMax;
                Z13251062865217617579 z13251062865217617579N = E3422549137300678133.N(((G5020774698099390921) this.b).a(jMax, (Z13251062865217617579) this.f, z13251062865217617579));
                this.h = z13251062865217617579N;
                int iB3 = z13251062865217617579N.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    Z13251062865217617579 z132510628652176175794 = (Z13251062865217617579) this.h;
                    float fA = z132510628652176175794.a(i3);
                    float f = ((G5020774698099390921) this.b).e;
                    z132510628652176175794.e(i3, W7808703833045379622.p(fA, -f, f));
                }
                return;
            }
            if (z132510628652176175793 == null) {
                S10823041268949770285.b0("targetVector");
                throw null;
            }
            z132510628652176175793.e(i, x6460762560403092052.i(z132510628652176175792.a(i), z13251062865217617579.a(i)));
            i++;
        }
    }

    public void a(int i, long j, Exception exc) {
        v6 v6Var = (v6) this.h;
        if (v6Var != null) {
            v6Var.a(i, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // dev.epro.r0.E1725159089660790042
    public Object b(long j) {
        if (g(j)) {
            return this.e;
        }
        F4096073349764486348 f4096073349764486348 = ((O3410298526443296213) ((R3937090736490516115) this.c)).b;
        G5020774698099390921 g5020774698099390921 = (G5020774698099390921) this.b;
        Z13251062865217617579 z13251062865217617579 = (Z13251062865217617579) this.f;
        Z13251062865217617579 z132510628652176175792 = (Z13251062865217617579) this.g;
        Z13251062865217617579 z13251062865217617579C = g5020774698099390921.b;
        if (z13251062865217617579C == null) {
            z13251062865217617579C = z13251062865217617579.c();
            g5020774698099390921.b = z13251062865217617579C;
        }
        int iB = z13251062865217617579C.b();
        int i = 0;
        while (true) {
            Z13251062865217617579 z132510628652176175793 = g5020774698099390921.b;
            if (i >= iB) {
                if (z132510628652176175793 != null) {
                    return f4096073349764486348.invoke(z132510628652176175793);
                }
                S10823041268949770285.b0("valueVector");
                throw null;
            }
            if (z132510628652176175793 == null) {
                S10823041268949770285.b0("valueVector");
                throw null;
            }
            z132510628652176175793.e(i, g5020774698099390921.a.k(z13251062865217617579.a(i), z132510628652176175792.a(i), j));
            i++;
        }
    }

    @Override // dev.epro.r0.E1725159089660790042
    public long c() {
        return this.a;
    }

    @Override // dev.epro.r0.E1725159089660790042
    public R3937090736490516115 d() {
        return (R3937090736490516115) this.c;
    }

    @Override // dev.epro.r0.E1725159089660790042
    public Object e() {
        return this.e;
    }

    @Override // dev.epro.r0.E1725159089660790042
    public Z13251062865217617579 f(long j) {
        return !g(j) ? ((G5020774698099390921) this.b).a(j, (Z13251062865217617579) this.f, (Z13251062865217617579) this.g) : (Z13251062865217617579) this.h;
    }

    @Override // dev.epro.r0.I8344119817086563006
    public void onConnected() {
        C13221748483180666768 c13221748483180666768;
        HandlerThread handlerThread = (HandlerThread) this.g;
        long j = this.a;
        rt0 rt0Var = (rt0) this.b;
        try {
            c13221748483180666768 = (C13221748483180666768) rt0Var.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            c13221748483180666768 = null;
        }
        if (c13221748483180666768 != null) {
            try {
                fk fkVar = (fk) this.e;
                String str = (String) this.c;
                String str2 = (String) this.d;
                short s = fkVar.a;
                E16447877528733527200 e16447877528733527200 = (E16447877528733527200) c13221748483180666768;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(e16447877528733527200.c);
                int i = Z15241293964366332233.a;
                parcelObtain.writeInt(1);
                int iA = C468629748621011703.A(parcelObtain, 20293);
                C468629748621011703.z(parcelObtain, 1, 4);
                parcelObtain.writeInt(1);
                C468629748621011703.z(parcelObtain, 2, 4);
                parcelObtain.writeInt(1);
                C468629748621011703.v(parcelObtain, str, 3);
                C468629748621011703.v(parcelObtain, str2, 4);
                C468629748621011703.z(parcelObtain, 5, 4);
                parcelObtain.writeInt(s);
                C468629748621011703.D(parcelObtain, iA);
                Parcel parcelA = e16447877528733527200.a(parcelObtain, 3);
                vm2 vm2VarCreateFromParcel = parcelA.readInt() == 0 ? null : vm2.CREATOR.createFromParcel(parcelA);
                parcelA.recycle();
                a(5011, j, null);
                ((LinkedBlockingQueue) this.f).put(vm2VarCreateFromParcel);
            } catch (Throwable th) {
                try {
                    a(2010, j, new Exception(th));
                } finally {
                    if (rt0Var != null && (rt0Var.isConnected() || rt0Var.isConnecting())) {
                        rt0Var.disconnect();
                    }
                    handlerThread.quit();
                }
            }
            if (rt0Var != null && (rt0Var.isConnected() || rt0Var.isConnecting())) {
            }
        }
    }

    @Override // dev.epro.r0.Z5019126814379845930
    public void onConnectionFailed(B6867906687934285025 b6867906687934285025) {
        try {
            a(4012, this.a, null);
            ((LinkedBlockingQueue) this.f).put(new vm2(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // dev.epro.r0.I8344119817086563006
    public void onConnectionSuspended(int i) {
        try {
            a(4011, this.a, null);
            ((LinkedBlockingQueue) this.f).put(new vm2(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // dev.epro.r0.E1725159089660790042
    public boolean a() {
        return false;
    }

    public G6335814235041277479(Context context, fk fkVar, String str, String str2, v6 v6Var) {
        this.c = str;
        this.e = fkVar;
        this.d = str2;
        this.h = v6Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.g = handlerThread;
        handlerThread.start();
        this.a = System.currentTimeMillis();
        rt0 rt0Var = new rt0(19621000, context, handlerThread.getLooper(), this, this);
        this.b = rt0Var;
        this.f = new LinkedBlockingQueue();
        rt0Var.checkAvailabilityAndConnect();
    }
}
