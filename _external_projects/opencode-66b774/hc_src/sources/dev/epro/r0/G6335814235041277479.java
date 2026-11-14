package dev.epro.r0;

import ads_mobile_sdk.fk;
import ads_mobile_sdk.rt0;
import ads_mobile_sdk.v6;
import ads_mobile_sdk.vm2;
import android.content.Context;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
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
        Z13251062865217617579 z132510628652176175793 = g5020774698099390921.d;
        if (z132510628652176175793 == null) {
            z132510628652176175793 = z132510628652176175792.c();
            g5020774698099390921.d = z132510628652176175793;
        }
        int b = z132510628652176175793.b();
        int i = 0;
        while (true) {
            Z13251062865217617579 z132510628652176175794 = g5020774698099390921.d;
            X6460762560403092052 x6460762560403092052 = g5020774698099390921.a;
            if (i >= b) {
                if (z132510628652176175794 == null) {
                    S10823041268949770285.b0("targetVector");
                    throw null;
                }
                this.e = f4096073349764486348.invoke(z132510628652176175794);
                Z13251062865217617579 z132510628652176175795 = g5020774698099390921.c;
                if (z132510628652176175795 == null) {
                    z132510628652176175795 = z132510628652176175792.c();
                    g5020774698099390921.c = z132510628652176175795;
                }
                int b2 = z132510628652176175795.b();
                long j = 0;
                for (int i2 = 0; i2 < b2; i2++) {
                    z132510628652176175792.getClass();
                    j = Math.max(j, x6460762560403092052.g(z13251062865217617579.a(i2)));
                }
                this.a = j;
                Z13251062865217617579 N = E3422549137300678133.N(((G5020774698099390921) this.b).a(j, (Z13251062865217617579) this.f, z13251062865217617579));
                this.h = N;
                int b3 = N.b();
                for (int i3 = 0; i3 < b3; i3++) {
                    Z13251062865217617579 z132510628652176175796 = (Z13251062865217617579) this.h;
                    float a = z132510628652176175796.a(i3);
                    float f = ((G5020774698099390921) this.b).e;
                    z132510628652176175796.e(i3, W7808703833045379622.p(a, -f, f));
                }
                return;
            }
            if (z132510628652176175794 == null) {
                S10823041268949770285.b0("targetVector");
                throw null;
            }
            z132510628652176175794.e(i, x6460762560403092052.i(z132510628652176175792.a(i), z13251062865217617579.a(i)));
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
        Z13251062865217617579 z132510628652176175793 = g5020774698099390921.b;
        if (z132510628652176175793 == null) {
            z132510628652176175793 = z13251062865217617579.c();
            g5020774698099390921.b = z132510628652176175793;
        }
        int b = z132510628652176175793.b();
        int i = 0;
        while (true) {
            Z13251062865217617579 z132510628652176175794 = g5020774698099390921.b;
            if (i >= b) {
                if (z132510628652176175794 != null) {
                    return f4096073349764486348.invoke(z132510628652176175794);
                }
                S10823041268949770285.b0("valueVector");
                throw null;
            }
            if (z132510628652176175794 == null) {
                S10823041268949770285.b0("valueVector");
                throw null;
            }
            z132510628652176175794.e(i, g5020774698099390921.a.k(z13251062865217617579.a(i), z132510628652176175792.a(i), j));
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        if (r3.isConnecting() != false) goto L25;
     */
    @Override // dev.epro.r0.I8344119817086563006
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onConnected() {
        /*
            r14 = this;
            java.lang.Object r0 = r14.g
            android.os.HandlerThread r0 = (android.os.HandlerThread) r0
            long r1 = r14.a
            java.lang.Object r3 = r14.b
            ads_mobile_sdk.rt0 r3 = (ads_mobile_sdk.rt0) r3
            r4 = 0
            android.os.IInterface r5 = r3.getService()     // Catch: java.lang.Throwable -> L12
            dev.epro.r0.C13221748483180666768 r5 = (dev.epro.r0.C13221748483180666768) r5     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
            r5 = r4
        L13:
            if (r5 == 0) goto Lc3
            java.lang.Object r6 = r14.e     // Catch: java.lang.Throwable -> L8d
            ads_mobile_sdk.fk r6 = (ads_mobile_sdk.fk) r6     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r7 = r14.c     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r8 = r14.d     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L8d
            short r6 = r6.a     // Catch: java.lang.Throwable -> L8d
            dev.epro.r0.E16447877528733527200 r5 = (dev.epro.r0.E16447877528733527200) r5     // Catch: java.lang.Throwable -> L8d
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r10 = r5.c     // Catch: java.lang.Throwable -> L8d
            r9.writeInterfaceToken(r10)     // Catch: java.lang.Throwable -> L8d
            int r10 = dev.epro.r0.Z15241293964366332233.a     // Catch: java.lang.Throwable -> L8d
            r10 = 1
            r9.writeInt(r10)     // Catch: java.lang.Throwable -> L8d
            r11 = 20293(0x4f45, float:2.8437E-41)
            int r11 = dev.epro.r0.C468629748621011703.A(r9, r11)     // Catch: java.lang.Throwable -> L8d
            r12 = 4
            dev.epro.r0.C468629748621011703.z(r9, r10, r12)     // Catch: java.lang.Throwable -> L8d
            r9.writeInt(r10)     // Catch: java.lang.Throwable -> L8d
            r13 = 2
            dev.epro.r0.C468629748621011703.z(r9, r13, r12)     // Catch: java.lang.Throwable -> L8d
            r9.writeInt(r10)     // Catch: java.lang.Throwable -> L8d
            r10 = 3
            dev.epro.r0.C468629748621011703.v(r9, r7, r10)     // Catch: java.lang.Throwable -> L8d
            dev.epro.r0.C468629748621011703.v(r9, r8, r12)     // Catch: java.lang.Throwable -> L8d
            r7 = 5
            dev.epro.r0.C468629748621011703.z(r9, r7, r12)     // Catch: java.lang.Throwable -> L8d
            r9.writeInt(r6)     // Catch: java.lang.Throwable -> L8d
            dev.epro.r0.C468629748621011703.D(r9, r11)     // Catch: java.lang.Throwable -> L8d
            android.os.Parcel r5 = r5.a(r9, r10)     // Catch: java.lang.Throwable -> L8d
            android.os.Parcelable$Creator<ads_mobile_sdk.vm2> r6 = ads_mobile_sdk.vm2.CREATOR     // Catch: java.lang.Throwable -> L8d
            int r7 = r5.readInt()     // Catch: java.lang.Throwable -> L8d
            if (r7 != 0) goto L67
            r6 = r4
            goto L6d
        L67:
            java.lang.Object r6 = r6.createFromParcel(r5)     // Catch: java.lang.Throwable -> L8d
            android.os.Parcelable r6 = (android.os.Parcelable) r6     // Catch: java.lang.Throwable -> L8d
        L6d:
            ads_mobile_sdk.vm2 r6 = (ads_mobile_sdk.vm2) r6     // Catch: java.lang.Throwable -> L8d
            r5.recycle()     // Catch: java.lang.Throwable -> L8d
            r5 = 5011(0x1393, float:7.022E-42)
            r14.a(r5, r1, r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r4 = r14.f     // Catch: java.lang.Throwable -> L8d
            java.util.concurrent.LinkedBlockingQueue r4 = (java.util.concurrent.LinkedBlockingQueue) r4     // Catch: java.lang.Throwable -> L8d
            r4.put(r6)     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto La9
            boolean r14 = r3.isConnected()
            if (r14 != 0) goto La6
            boolean r14 = r3.isConnecting()
            if (r14 == 0) goto La9
            goto La6
        L8d:
            r4 = move-exception
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Throwable -> Lad
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lad
            r4 = 2010(0x7da, float:2.817E-42)
            r14.a(r4, r1, r5)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto La9
            boolean r14 = r3.isConnected()
            if (r14 != 0) goto La6
            boolean r14 = r3.isConnecting()
            if (r14 == 0) goto La9
        La6:
            r3.disconnect()
        La9:
            r0.quit()
            goto Lc3
        Lad:
            r14 = move-exception
            if (r3 == 0) goto Lbf
            boolean r1 = r3.isConnected()
            if (r1 != 0) goto Lbc
            boolean r1 = r3.isConnecting()
            if (r1 == 0) goto Lbf
        Lbc:
            r3.disconnect()
        Lbf:
            r0.quit()
            throw r14
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G6335814235041277479.onConnected():void");
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
