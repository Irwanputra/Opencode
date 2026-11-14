package ads_mobile_sdk;

import android.content.Context;
import android.os.HandlerThread;
import dev.epro.r0.B6867906687934285025;
import dev.epro.r0.I8344119817086563006;
import dev.epro.r0.V5431423861497278836;
import dev.epro.r0.Z5019126814379845930;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class lt0 implements I8344119817086563006, Z5019126814379845930 {
    public final rt0 a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public lt0(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        rt0 rt0Var = new rt0(9200000, context, handlerThread.getLooper(), this, this);
        this.a = rt0Var;
        this.d = new LinkedBlockingQueue();
        rt0Var.checkAvailabilityAndConnect();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r2.isConnecting() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        if (r2.isConnecting() != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    @Override // dev.epro.r0.I8344119817086563006
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConnected() {
        /*
            r10 = this;
            android.os.HandlerThread r0 = r10.e
            java.util.concurrent.LinkedBlockingQueue r1 = r10.d
            ads_mobile_sdk.rt0 r2 = r10.a
            r3 = 0
            android.os.IInterface r4 = r2.getService()     // Catch: java.lang.Throwable -> Le
            dev.epro.r0.C13221748483180666768 r4 = (dev.epro.r0.C13221748483180666768) r4     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r4 = r3
        Lf:
            if (r4 == 0) goto Lc8
            java.lang.String r5 = r10.b     // Catch: java.lang.Throwable -> L8a
            java.lang.String r10 = r10.c     // Catch: java.lang.Throwable -> L8a
            dev.epro.r0.E16447877528733527200 r4 = (dev.epro.r0.E16447877528733527200) r4     // Catch: java.lang.Throwable -> L8a
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r4.c     // Catch: java.lang.Throwable -> L8a
            r6.writeInterfaceToken(r7)     // Catch: java.lang.Throwable -> L8a
            int r7 = dev.epro.r0.Z15241293964366332233.a     // Catch: java.lang.Throwable -> L8a
            r7 = 1
            r6.writeInt(r7)     // Catch: java.lang.Throwable -> L8a
            r8 = 20293(0x4f45, float:2.8437E-41)
            int r8 = dev.epro.r0.C468629748621011703.A(r6, r8)     // Catch: java.lang.Throwable -> L8a
            r9 = 4
            dev.epro.r0.C468629748621011703.z(r6, r7, r9)     // Catch: java.lang.Throwable -> L8a
            r6.writeInt(r7)     // Catch: java.lang.Throwable -> L8a
            r9 = 2
            dev.epro.r0.C468629748621011703.v(r6, r5, r9)     // Catch: java.lang.Throwable -> L8a
            r5 = 3
            dev.epro.r0.C468629748621011703.v(r6, r10, r5)     // Catch: java.lang.Throwable -> L8a
            dev.epro.r0.C468629748621011703.D(r6, r8)     // Catch: java.lang.Throwable -> L8a
            android.os.Parcel r10 = r4.a(r6, r7)     // Catch: java.lang.Throwable -> L8a
            android.os.Parcelable$Creator<ads_mobile_sdk.wt0> r4 = ads_mobile_sdk.wt0.CREATOR     // Catch: java.lang.Throwable -> L8a
            int r5 = r10.readInt()     // Catch: java.lang.Throwable -> L8a
            if (r5 != 0) goto L4c
            r4 = r3
            goto L52
        L4c:
            java.lang.Object r4 = r4.createFromParcel(r10)     // Catch: java.lang.Throwable -> L8a
            android.os.Parcelable r4 = (android.os.Parcelable) r4     // Catch: java.lang.Throwable -> L8a
        L52:
            ads_mobile_sdk.wt0 r4 = (ads_mobile_sdk.wt0) r4     // Catch: java.lang.Throwable -> L8a
            r10.recycle()     // Catch: java.lang.Throwable -> L8a
            ads_mobile_sdk.pd r10 = r4.b     // Catch: java.lang.Throwable -> L8a
            if (r10 == 0) goto L5c
            goto L6a
        L5c:
            byte[] r10 = r4.c     // Catch: java.lang.NullPointerException -> L81 ads_mobile_sdk.yi1 -> L83 java.lang.Throwable -> L8a
            ads_mobile_sdk.nl0 r5 = ads_mobile_sdk.nl0.a()     // Catch: java.lang.NullPointerException -> L81 ads_mobile_sdk.yi1 -> L83 java.lang.Throwable -> L8a
            ads_mobile_sdk.pd r10 = ads_mobile_sdk.pd.a(r10, r5)     // Catch: java.lang.NullPointerException -> L81 ads_mobile_sdk.yi1 -> L83 java.lang.Throwable -> L8a
            r4.b = r10     // Catch: java.lang.NullPointerException -> L81 ads_mobile_sdk.yi1 -> L83 java.lang.Throwable -> L8a
            r4.c = r3     // Catch: java.lang.NullPointerException -> L81 ads_mobile_sdk.yi1 -> L83 java.lang.Throwable -> L8a
        L6a:
            r4.a()     // Catch: java.lang.Throwable -> L8a
            ads_mobile_sdk.pd r10 = r4.b     // Catch: java.lang.Throwable -> L8a
            r1.put(r10)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto Lc5
            boolean r10 = r2.isConnected()
            if (r10 != 0) goto Lc2
            boolean r10 = r2.isConnecting()
            if (r10 == 0) goto Lc5
            goto Lc2
        L81:
            r10 = move-exception
            goto L84
        L83:
            r10 = move-exception
        L84:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8a
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L8a
            throw r3     // Catch: java.lang.Throwable -> L8a
        L8a:
            dev.epro.r0.V5431423861497278836 r10 = ads_mobile_sdk.pd.w()     // Catch: java.lang.Throwable -> L9e java.lang.InterruptedException -> Lb4
            r3 = 32768(0x8000, double:1.61895E-319)
            r10.c(r3)     // Catch: java.lang.Throwable -> L9e java.lang.InterruptedException -> Lb4
            ads_mobile_sdk.cu0 r10 = r10.a()     // Catch: java.lang.Throwable -> L9e java.lang.InterruptedException -> Lb4
            ads_mobile_sdk.pd r10 = (ads_mobile_sdk.pd) r10     // Catch: java.lang.Throwable -> L9e java.lang.InterruptedException -> Lb4
            r1.put(r10)     // Catch: java.lang.Throwable -> L9e java.lang.InterruptedException -> Lb4
            goto Lb4
        L9e:
            r10 = move-exception
            if (r2 == 0) goto Lb0
            boolean r1 = r2.isConnected()
            if (r1 != 0) goto Lad
            boolean r1 = r2.isConnecting()
            if (r1 == 0) goto Lb0
        Lad:
            r2.disconnect()
        Lb0:
            r0.quit()
            throw r10
        Lb4:
            if (r2 == 0) goto Lc5
            boolean r10 = r2.isConnected()
            if (r10 != 0) goto Lc2
            boolean r10 = r2.isConnecting()
            if (r10 == 0) goto Lc5
        Lc2:
            r2.disconnect()
        Lc5:
            r0.quit()
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lt0.onConnected():void");
    }

    @Override // dev.epro.r0.Z5019126814379845930
    public final void onConnectionFailed(B6867906687934285025 b6867906687934285025) {
        try {
            LinkedBlockingQueue linkedBlockingQueue = this.d;
            V5431423861497278836 w = pd.w();
            w.c(32768L);
            linkedBlockingQueue.put((pd) w.a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // dev.epro.r0.I8344119817086563006
    public final void onConnectionSuspended(int i) {
        try {
            LinkedBlockingQueue linkedBlockingQueue = this.d;
            V5431423861497278836 w = pd.w();
            w.c(32768L);
            linkedBlockingQueue.put((pd) w.a());
        } catch (InterruptedException unused) {
        }
    }
}
