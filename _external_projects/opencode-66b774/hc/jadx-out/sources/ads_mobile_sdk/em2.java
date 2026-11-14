package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.J10256772239794345968;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O5378677881740157249;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class em2 extends th3 {
    public final c7 g;
    public final O16637889491137121389 h;
    public final ci3 i;
    public em2 j;
    public final cc2 k;

    /* JADX WARN: Illegal instructions before constructor call */
    public em2(wv0 wv0Var, List list, UUID uuid, mi3 mi3Var, c7 c7Var, O16637889491137121389 o16637889491137121389, ci3 ci3Var, int i, em2 em2Var, boolean z, int i2) {
        em2 em2Var2 = (i2 & 256) != 0 ? null : em2Var;
        int i3 = (i2 & 512) != 0 ? -1 : 0;
        q22 q22Var = xv.f2a;
        Boolean boolValueOf = q22Var != null ? Boolean.valueOf(q22Var.l.get()) : null;
        o16637889491137121389.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        super(wv0Var, mi3Var, uuid, em2Var2, jCurrentTimeMillis);
        this.g = c7Var;
        this.h = o16637889491137121389;
        this.i = ci3Var;
        int i4 = em2Var2 != null ? em2Var2.k.a : -1;
        long j = jCurrentTimeMillis - J10256772239794345968.c;
        long j2 = J10256772239794345968.d;
        long j3 = j2 < 0 ? -1L : jCurrentTimeMillis - j2;
        q22 q22Var2 = xv.f2a;
        Integer numValueOf = q22Var2 != null ? Integer.valueOf(q22Var2.m.get()) : null;
        q22 q22Var3 = xv.f2a;
        this.k = new cc2(i3, mi3Var, wv0Var, list, uuid, i4, i, jCurrentTimeMillis, j, j3, z, boolValueOf, numValueOf, q22Var3 != null ? Integer.valueOf(q22Var3.n.get()) : null, 536868864);
    }

    @Override // ads_mobile_sdk.th3
    public final th3 a(wv0 wv0Var, List list, boolean z) {
        wv0Var.getClass();
        cc2 cc2Var = this.k;
        UUID uuid = cc2Var.e;
        mi3 mi3Var = this.a;
        int i = cc2Var.g + 1;
        c7 c7Var = this.g;
        em2 em2Var = new em2(wv0Var, list, uuid, mi3Var, c7Var, this.h, this.i, i, this, z, 1536);
        int i2 = cc2Var.x;
        cc2 cc2Var2 = em2Var.k;
        cc2Var2.x = i2;
        AtomicReference atomicReference = (AtomicReference) c7Var.a;
        while (true) {
            Object obj = atomicReference.get();
            obj.getClass();
            em2 em2Var2 = (em2) obj;
            int i3 = em2Var2.k.a + 1;
            if (em2Var.d.get()) {
                xv.a("This trace " + cc2Var2.c.name() + " has already finished");
            } else {
                cc2Var2.a = i3;
                em2Var.j = em2Var2;
            }
            while (!atomicReference.compareAndSet(em2Var2, em2Var)) {
                if (atomicReference.get() != em2Var2) {
                    break;
                }
            }
            return em2Var;
        }
    }

    @Override // ads_mobile_sdk.th3
    public final void a$1() {
        cc2[] cc2VarArr;
        super.a$1();
        cc2 cc2Var = this.k;
        if (cc2Var.a == 0) {
            UUID uuid = cc2Var.e;
            em2 em2Var = (em2) ((AtomicReference) this.g.a).get();
            if (em2Var == null) {
                cc2VarArr = new cc2[0];
            } else {
                cc2[] cc2VarArr2 = new cc2[em2Var.k.a + 1];
                while (em2Var != null) {
                    cc2 cc2Var2 = em2Var.k;
                    cc2VarArr2[cc2Var2.a] = cc2Var2;
                    em2Var = em2Var.j;
                }
                cc2VarArr = (cc2[]) O5378677881740157249.B0(cc2VarArr2).toArray(new cc2[0]);
            }
            cc2VarArr.getClass();
            ci3 ci3Var = this.i;
            ci3Var.getClass();
            ArrayList arrayList = new ArrayList();
            for (cc2 cc2Var3 : cc2VarArr) {
                Boolean bool = (Boolean) ci3Var.f20o.get(String.valueOf(cc2Var3.c.getNumber()));
                if (bool != null ? bool.booleanValue() : ci3Var.k) {
                    arrayList.add(cc2Var3);
                }
            }
            qi3 qi3Var = !arrayList.isEmpty() ? new qi3(uuid, (cc2[]) arrayList.toArray(new cc2[0])) : null;
            if (qi3Var != null) {
                ci3Var.d.a(qi3Var);
                if (ci3Var.n) {
                    for (cc2 cc2Var4 : qi3Var.b) {
                        Throwable th = cc2Var4.f18o;
                        if (th == null) {
                            th = cc2Var4.n;
                        }
                        Throwable th2 = th;
                        if (th2 != null) {
                            ci3Var.e.a(new fl0(th2, cc2Var4.c.name(), cc2Var4.b, true, cc2Var4.h, -1, false));
                        }
                    }
                }
            }
        }
    }

    @Override // ads_mobile_sdk.th3
    public final cc2 e() {
        return this.k;
    }

    @Override // ads_mobile_sdk.th3
    public final void h() {
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        this.k.p = E17093345031926825464.g(M9216324016624295870.a0(jCurrentTimeMillis, n13798149404328803870), M9216324016624295870.a0(this.c, n13798149404328803870));
    }
}
