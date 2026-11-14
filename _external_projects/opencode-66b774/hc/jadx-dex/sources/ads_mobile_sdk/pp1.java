package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pp1 implements dev.epro.r0.G18207276409179303092 {
    public final ads_mobile_sdk.g a;

    public pp1(ads_mobile_sdk.g gVar) {
        this.a = gVar;
    }

    public final ads_mobile_sdk.cu0 a() {
        ads_mobile_sdk.g gVar = this.a;
        if (gVar instanceof ads_mobile_sdk.cu0) {
            return (ads_mobile_sdk.cu0) ((ads_mobile_sdk.cu0) gVar).a(4, (ads_mobile_sdk.cu0) null);
        }
        ads_mobile_sdk.au0 au0Var = (ads_mobile_sdk.au0) ((ads_mobile_sdk.cu0) gVar).a(5, (ads_mobile_sdk.cu0) null);
        boolean zJ = au0Var.b.j();
        ads_mobile_sdk.cu0 cu0Var = au0Var.b;
        if (!zJ) {
            return cu0Var;
        }
        cu0Var.k();
        return au0Var.b;
    }

    public final int b(ads_mobile_sdk.cu0 cu0Var) {
        ads_mobile_sdk.bm3 bm3Var = cu0Var.b;
        int i = bm3Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < bm3Var.a; i3++) {
            int i4 = bm3Var.b[i3] >>> 3;
            ads_mobile_sdk.sq sqVar = (ads_mobile_sdk.sq) bm3Var.c[i3];
            int i5 = ads_mobile_sdk.yu.i(i4) + ads_mobile_sdk.yu.h(2) + (ads_mobile_sdk.yu.h(1) * 2);
            int iH = ads_mobile_sdk.yu.h(3);
            int size = sqVar.size();
            i2 += ads_mobile_sdk.yu.i(size) + size + iH + i5;
        }
        bm3Var.d = i2;
        return i2;
    }

    public final void c(java.lang.Object obj) {
        ads_mobile_sdk.bm3 bm3Var = ((ads_mobile_sdk.cu0) obj).b;
        if (bm3Var.e) {
            bm3Var.e = false;
        }
        throw dev.epro.r0.G6547577305291411977.m(obj);
    }

    public final int d(ads_mobile_sdk.cu0 cu0Var) {
        return cu0Var.b.hashCode();
    }

    public final boolean a(java.lang.Object obj) {
        throw dev.epro.r0.G6547577305291411977.m(obj);
    }

    public final void a(java.lang.Object obj, dev.epro.r0.E17564419012940707302 e17564419012940707302, ads_mobile_sdk.nl0 nl0Var) {
        ads_mobile_sdk.cu0 cu0Var = (ads_mobile_sdk.cu0) obj;
        if (cu0Var.b == ads_mobile_sdk.bm3.f) {
            cu0Var.b = ads_mobile_sdk.bm3.b();
        }
        throw dev.epro.r0.G6547577305291411977.m(obj);
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        ads_mobile_sdk.xv.a(obj, obj2);
    }

    public final void a(java.lang.Object obj, byte[] bArr, int i, int i2, dev.epro.r0.D15735805680132151670 d15735805680132151670) {
        ads_mobile_sdk.cu0 cu0Var = (ads_mobile_sdk.cu0) obj;
        if (cu0Var.b == ads_mobile_sdk.bm3.f) {
            cu0Var.b = ads_mobile_sdk.bm3.b();
        }
        throw dev.epro.r0.G6547577305291411977.m(obj);
    }

    public final void a(java.lang.Object obj, ads_mobile_sdk.w8 w8Var) {
        throw dev.epro.r0.G6547577305291411977.m(obj);
    }

    public final boolean b(ads_mobile_sdk.cu0 cu0Var, ads_mobile_sdk.cu0 cu0Var2) {
        return cu0Var.b.equals(cu0Var2.b);
    }
}
