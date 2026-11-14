package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class yj3 extends dev.epro.r0.L14144435763408236280 implements dev.epro.r0.I8344119817086563006, dev.epro.r0.Z5019126814379845930 {
    public static final /* synthetic */ int j = 0;
    public final dev.epro.r0.W5797197595347441198 a;
    public final android.content.Context b;
    public final ads_mobile_sdk.ci3 c;
    public final dev.epro.r0.G16472559273103586035 d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final java.util.concurrent.atomic.AtomicBoolean f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    public final dev.epro.r0.A18119328133183277592 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj3(dev.epro.r0.W5797197595347441198 w5797197595347441198, android.content.Context context, ads_mobile_sdk.ci3 ci3Var) {
        super("com.google.android.gms.ads.internal.request.ITrustlessTokenListener", (byte) 1);
        w5797197595347441198.getClass();
        context.getClass();
        ci3Var.getClass();
        this.a = w5797197595347441198;
        this.b = context;
        this.c = ci3Var;
        this.d = new dev.epro.r0.G16472559273103586035(8, context, android.os.Looper.getMainLooper(), this, this);
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = new dev.epro.r0.A18119328133183277592();
    }

    public final boolean a(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        dev.epro.r0.A18119328133183277592 a18119328133183277592 = this.h;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f;
        if (i == 1) {
            java.lang.String string = parcel.readString();
            android.os.Parcelable.Creator<ads_mobile_sdk.gg0> creator = ads_mobile_sdk.gg0.CREATOR;
            int i2 = dev.epro.r0.Z15241293964366332233.a;
            ads_mobile_sdk.gg0 gg0Var = (ads_mobile_sdk.gg0) (parcel.readInt() != 0 ? (android.os.Parcelable) creator.createFromParcel(parcel) : null);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new android.os.BadParcelableException(dev.epro.r0.C468629748621011703.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
            }
            string.getClass();
            gg0Var.getClass();
            ads_mobile_sdk.xu0 xu0Var = new ads_mobile_sdk.xu0(string);
            if (!atomicBoolean.getAndSet(true)) {
                a18119328133183277592.S(xu0Var);
            }
        } else {
            if (i != 2) {
                return false;
            }
            android.os.Parcelable.Creator<ads_mobile_sdk.al0> creator2 = ads_mobile_sdk.al0.CREATOR;
            int i3 = dev.epro.r0.Z15241293964366332233.a;
            ads_mobile_sdk.al0 al0Var = (ads_mobile_sdk.al0) (parcel.readInt() != 0 ? (android.os.Parcelable) creator2.createFromParcel(parcel) : null);
            int iDataAvail2 = parcel.dataAvail();
            if (iDataAvail2 > 0) {
                throw new android.os.BadParcelableException(dev.epro.r0.C468629748621011703.e(iDataAvail2, "Parcel data not fully consumed, unread size: "));
            }
            al0Var.getClass();
            ads_mobile_sdk.tu0 tu0Var = new ads_mobile_sdk.tu0(al0Var.a + ". Error code: " + al0Var.b, 1);
            if (!atomicBoolean.getAndSet(true)) {
                a18119328133183277592.S(tu0Var);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final void onConnected() {
        if (this.g.getAndSet(true)) {
            return;
        }
        dev.epro.r0.R7033599853981556291.E(this.a, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.vj3(this, null, (byte) 1), 3);
    }

    public final void onConnectionFailed(dev.epro.r0.B6867906687934285025 b6867906687934285025) {
        b6867906687934285025.getClass();
        ads_mobile_sdk.tu0 tu0Var = new ads_mobile_sdk.tu0("Failed to connect to GMSCore. Code: " + b6867906687934285025.e + ", message: " + b6867906687934285025.g, 1);
        if (this.f.getAndSet(true)) {
            return;
        }
        this.h.S(tu0Var);
    }

    public final void onConnectionSuspended(int i) {
        ads_mobile_sdk.tu0 tu0Var = new ads_mobile_sdk.tu0(dev.epro.r0.G6547577305291411977.n(i, "GMSCore connection suspended. Code: "), 1);
        if (this.f.getAndSet(true)) {
            return;
        }
        this.h.S(tu0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r7 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.uj3
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.uj3 r0 = (ads_mobile_sdk.uj3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.uj3 r0 = new ads_mobile_sdk.uj3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            ads_mobile_sdk.yj3 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            dev.epro.r0.E17665849472693074628.k(r7)
            return r7
        L35:
            dev.epro.r0.E17665849472693074628.k(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.e
            boolean r7 = r7.getAndSet(r4)
            dev.epro.r0.A18119328133183277592 r1 = r6.h
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r7 == 0) goto L4e
            r0.d = r4
            java.lang.Object r6 = r1.y(r0)
            if (r6 != r5) goto L4d
            goto L5d
        L4d:
            return r6
        L4e:
            dev.epro.r0.G16472559273103586035 r7 = r6.d
            r7.checkAvailabilityAndConnect()
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r1.y(r0)
            if (r7 != r5) goto L5e
        L5d:
            return r5
        L5e:
            dev.epro.r0.M16184408391440927034 r7 = (dev.epro.r0.M16184408391440927034) r7
            dev.epro.r0.W5797197595347441198 r0 = r6.a
            ads_mobile_sdk.vj3 r1 = new ads_mobile_sdk.vj3
            r3 = 0
            r1.<init>(r6, r2, r3)
            r6 = 3
            dev.epro.r0.R7033599853981556291.E(r0, r2, r2, r1, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yj3.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
