package dev.epro.r0;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R14289894334981469490 implements I4293432593871965076, J5715778638296486773, M14569441752665048396, F18341548724281518495 {
    public final U9296548531947164180 a;
    public V7801742040189616406 b;
    public final Bundle c;
    public Q14196755420833223976 d;
    public final F6942723054099263096 e;
    public final String f;
    public final Bundle g;
    public boolean i;
    public Q14196755420833223976 m;
    public final V10300877997588547986 h = new V10300877997588547986(new U8000365519789522238(this, new N8306548196372912291(this, (byte) 14)));
    public final O12494175665883759871 j = new O12494175665883759871(new B9178969769697472001((byte) 3));
    public final I1283052979100930176 k = new I1283052979100930176(this, true);
    public final O12494175665883759871 l = new O12494175665883759871(new B9178969769697472001((byte) 4));

    public R14289894334981469490(U9296548531947164180 u9296548531947164180, V7801742040189616406 v7801742040189616406, Bundle bundle, Q14196755420833223976 q14196755420833223976, F6942723054099263096 f6942723054099263096, String str, Bundle bundle2) {
        this.a = u9296548531947164180;
        this.b = v7801742040189616406;
        this.c = bundle;
        this.d = q14196755420833223976;
        this.e = f6942723054099263096;
        this.f = str;
        this.g = bundle2;
        new O12494175665883759871(new W2269277550458425547(this, (byte) 15));
        this.m = Q14196755420833223976.b;
    }

    @Override // dev.epro.r0.F18341548724281518495
    public final V10300877997588547986 b() {
        return (V10300877997588547986) this.h.c;
    }

    public final Bundle c() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleZ = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
        bundleZ.putAll(bundle);
        return bundleZ;
    }

    public final void d() {
        if (!this.i) {
            V10300877997588547986 v10300877997588547986 = this.h;
            ((U8000365519789522238) v10300877997588547986.b).a();
            this.i = true;
            if (this.e != null) {
                C775827382551829194.J(this);
            }
            v10300877997588547986.v(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.m.ordinal();
        I1283052979100930176 i1283052979100930176 = this.k;
        if (iOrdinal < iOrdinal2) {
            i1283052979100930176.g(this.d);
        } else {
            i1283052979100930176.g(this.m);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof R14289894334981469490)) {
            R14289894334981469490 r14289894334981469490 = (R14289894334981469490) obj;
            Bundle bundle = r14289894334981469490.c;
            Bundle bundle2 = this.c;
            boolean zD = S10823041268949770285.t(bundle2, bundle) ? true : (bundle2 == null || bundle == null) ? false : O17574792317020433029.d(bundle2, bundle);
            if (this.f.equals(r14289894334981469490.f) && S10823041268949770285.t(this.b, r14289894334981469490.b) && S10823041268949770285.t(this.k, r14289894334981469490.k) && ((V10300877997588547986) this.h.c) == ((V10300877997588547986) r14289894334981469490.h.c) && zD) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.M14569441752665048396
    public final Q15796038708469204840 f() {
        return (E15463216210730020934) this.j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // dev.epro.r0.M14569441752665048396
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.X8580441079827879338 g() {
        /*
            r4 = this;
            dev.epro.r0.X8580441079827879338 r0 = new dev.epro.r0.X8580441079827879338
            r1 = 0
            r0.<init>(r1)
            dev.epro.r0.J3301701597851028733 r1 = dev.epro.r0.C775827382551829194.j
            java.util.LinkedHashMap r2 = r0.a
            r2.put(r1, r4)
            dev.epro.r0.M10846389789027735899 r1 = dev.epro.r0.C775827382551829194.k
            r2.put(r1, r4)
            android.os.Bundle r1 = r4.c()
            if (r1 == 0) goto L1d
            dev.epro.r0.T15504973625601650233 r3 = dev.epro.r0.C775827382551829194.l
            r2.put(r3, r1)
        L1d:
            r1 = 0
            dev.epro.r0.U9296548531947164180 r4 = r4.a
            if (r4 == 0) goto L33
            android.content.Context r4 = r4.a
            if (r4 == 0) goto L2b
            android.content.Context r4 = r4.getApplicationContext()
            goto L2c
        L2b:
            r4 = r1
        L2c:
            boolean r3 = r4 instanceof android.app.Application
            if (r3 == 0) goto L33
            android.app.Application r4 = (android.app.Application) r4
            goto L34
        L33:
            r4 = r1
        L34:
            if (r4 == 0) goto L37
            r1 = r4
        L37:
            if (r1 == 0) goto L3e
            dev.epro.r0.O12545633033254628644 r4 = dev.epro.r0.T977856106332750807.d
            r2.put(r4, r1)
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R14289894334981469490.g():dev.epro.r0.X8580441079827879338");
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() + (this.f.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null) {
            iHashCode = (iHashCode * 31) + O17574792317020433029.e(bundle);
        }
        int iHashCode2 = this.k.hashCode();
        return ((V10300877997588547986) this.h.c).hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    @Override // dev.epro.r0.J5715778638296486773
    public final L3530692241870850490 i() {
        if (!this.i) {
            S10973172697741180971.m("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.k.h == Q14196755420833223976.a) {
            S10973172697741180971.m("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        F6942723054099263096 f6942723054099263096 = this.e;
        if (f6942723054099263096 == null) {
            S10973172697741180971.m("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        A4559761392562572984 a4559761392562572984 = ((C10251609400980016117) ((O12494175665883759871) ((I1632105416032993715) f6942723054099263096.b).d).getValue()).b;
        String str = this.f;
        Object objG = a4559761392562572984.g(str);
        if (objG == null) {
            objG = new S3214537669496409879(str);
            a4559761392562572984.n(str, objG);
        }
        return ((S3214537669496409879) objG).b;
    }

    @Override // dev.epro.r0.I4293432593871965076
    public final R3192876217964974737 j() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(J17975719213314763068.a(sb.getClass()).c());
        sb.append("(" + this.f + ")");
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
