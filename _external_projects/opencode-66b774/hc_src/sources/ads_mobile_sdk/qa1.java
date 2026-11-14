package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import dev.epro.r0.M7525836972106262407;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z12988921718439051032;
import dev.epro.r0.Z15241293964366332233;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qa1 {
    public byte a = 0;
    public final Context b;
    public final String c;
    public M7525836972106262407 d;
    public pa1 e;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r3.intValue() >= r1.intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r0.compareTo(r1) >= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r3 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qa1(android.content.Context r9) {
        /*
            r8 = this;
            r8.<init>()
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r8.a = r0
            android.content.Context r0 = r9.getApplicationContext()
            r8.b = r0
            int r0 = dev.epro.r0.W10400873721744725500.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r0 >= r2) goto L7b
            r2 = 33
            if (r0 < r2) goto L9f
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r2 = "REL"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2b
            goto L9f
        L2b:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = r0.toUpperCase(r2)
            r3.getClass()
            java.lang.String r4 = "BAKLAVA"
            boolean r3 = r3.equals(r4)
            r5 = 0
            if (r3 == 0) goto L3f
            r3 = r1
            goto L40
        L3f:
            r3 = r5
        L40:
            java.lang.String r6 = "UpsideDownCake"
            java.lang.String r7 = r6.toUpperCase(r2)
            r7.getClass()
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L50
            goto L51
        L50:
            r1 = r5
        L51:
            if (r3 == 0) goto L60
            if (r1 == 0) goto L60
            int r0 = r3.intValue()
            int r1 = r1.intValue()
            if (r0 < r1) goto L9f
            goto L7b
        L60:
            if (r3 != 0) goto L79
            if (r1 != 0) goto L79
            java.lang.String r0 = r0.toUpperCase(r2)
            r0.getClass()
            java.lang.String r1 = r6.toUpperCase(r2)
            r1.getClass()
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L9f
            goto L7b
        L79:
            if (r3 == 0) goto L9f
        L7b:
            int r0 = dev.epro.r0.F11474578038339593445.a()
            r1 = 8
            if (r0 < r1) goto L9f
            boolean r0 = dev.epro.r0.H6918874287707076857.j()
            if (r0 == 0) goto L9a
            java.lang.Class r0 = dev.epro.r0.J14472086795230312938.p()
            java.lang.Object r9 = r9.getSystemService(r0)
            android.app.sdksandbox.sdkprovider.SdkSandboxController r9 = dev.epro.r0.J14472086795230312938.g(r9)
            java.lang.String r9 = dev.epro.r0.R15650466363454246972.a(r9)
            goto La3
        L9a:
            java.lang.String r9 = r9.getPackageName()
            goto La3
        L9f:
            java.lang.String r9 = r9.getPackageName()
        La3:
            r8.c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qa1.<init>(android.content.Context):void");
    }

    public final c7 a() {
        Parcelable parcelable = null;
        if (this.a != 2 || this.d == null || this.e == null) {
            S10973172697741180971.m("Service not connected. Please start a connection before using the service.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.c);
        try {
            Z12988921718439051032 z12988921718439051032 = (Z12988921718439051032) this.d;
            z12988921718439051032.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(z12988921718439051032.c);
            int i = Z15241293964366332233.a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            Parcel a = z12988921718439051032.a(obtain, 1);
            Parcelable.Creator creator = Bundle.CREATOR;
            if (a.readInt() != 0) {
                parcelable = (Parcelable) creator.createFromParcel(a);
            }
            a.recycle();
            return new c7((Bundle) parcelable, (byte) 19);
        } catch (RemoteException e) {
            this.a = (byte) 0;
            throw e;
        }
    }
}
