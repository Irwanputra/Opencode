package ads_mobile_sdk;

import dev.epro.r0.D15735805680132151670;
import dev.epro.r0.E17564419012940707302;
import dev.epro.r0.G18207276409179303092;
import dev.epro.r0.G6547577305291411977;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class pp1 implements G18207276409179303092 {
    public final g a;

    public pp1(g gVar) {
        this.a = gVar;
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final cu0 a() {
        g gVar = this.a;
        if (gVar instanceof cu0) {
            return (cu0) ((cu0) gVar).a(4, (cu0) null);
        }
        au0 au0Var = (au0) ((cu0) gVar).a(5, (cu0) null);
        boolean j = au0Var.b.j();
        cu0 cu0Var = au0Var.b;
        if (!j) {
            return cu0Var;
        }
        cu0Var.k();
        return au0Var.b;
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final int b(cu0 cu0Var) {
        bm3 bm3Var = cu0Var.b;
        int i = bm3Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < bm3Var.a; i3++) {
            int i4 = bm3Var.b[i3] >>> 3;
            sq sqVar = (sq) bm3Var.c[i3];
            int i5 = yu.i(i4) + yu.h(2) + (yu.h(1) * 2);
            int h = yu.h(3);
            int size = sqVar.size();
            i2 += yu.i(size) + size + h + i5;
        }
        bm3Var.d = i2;
        return i2;
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void c(Object obj) {
        bm3 bm3Var = ((cu0) obj).b;
        if (bm3Var.e) {
            bm3Var.e = false;
        }
        throw G6547577305291411977.m(obj);
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final int d(cu0 cu0Var) {
        return cu0Var.b.hashCode();
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final boolean a(Object obj) {
        throw G6547577305291411977.m(obj);
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void a(Object obj, E17564419012940707302 e17564419012940707302, nl0 nl0Var) {
        cu0 cu0Var = (cu0) obj;
        if (cu0Var.b == bm3.f) {
            cu0Var.b = bm3.b();
        }
        throw G6547577305291411977.m(obj);
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void a(Object obj, Object obj2) {
        xv.a(obj, obj2);
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void a(Object obj, byte[] bArr, int i, int i2, D15735805680132151670 d15735805680132151670) {
        cu0 cu0Var = (cu0) obj;
        if (cu0Var.b == bm3.f) {
            cu0Var.b = bm3.b();
        }
        throw G6547577305291411977.m(obj);
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void a(Object obj, w8 w8Var) {
        throw G6547577305291411977.m(obj);
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final boolean b(cu0 cu0Var, cu0 cu0Var2) {
        return cu0Var.b.equals(cu0Var2.b);
    }
}
