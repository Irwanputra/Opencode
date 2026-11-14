package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O5378677881740157249;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class em2 extends th3 {
    public final c7 g;
    public final O16637889491137121389 h;
    public final ci3 i;
    public em2 j;
    public final cc2 k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public em2(ads_mobile_sdk.wv0 r29, java.util.List r30, java.util.UUID r31, ads_mobile_sdk.mi3 r32, ads_mobile_sdk.c7 r33, dev.epro.r0.O16637889491137121389 r34, ads_mobile_sdk.ci3 r35, int r36, ads_mobile_sdk.em2 r37, boolean r38, int r39) {
        /*
            r28 = this;
            r0 = r39
            r1 = r0 & 256(0x100, float:3.59E-43)
            r7 = 0
            if (r1 == 0) goto L9
            r4 = r7
            goto Lb
        L9:
            r4 = r37
        Lb:
            r0 = r0 & 512(0x200, float:7.175E-43)
            r8 = -1
            if (r0 == 0) goto L12
            r10 = r8
            goto L14
        L12:
            r0 = 0
            r10 = r0
        L14:
            ads_mobile_sdk.q22 r0 = ads_mobile_sdk.xv.f2a
            if (r0 == 0) goto L25
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.l
            boolean r0 = r0.get()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r24 = r0
            goto L27
        L25:
            r24 = r7
        L27:
            r34.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            r0 = r28
            r1 = r29
            r3 = r31
            r2 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r33
            r0.g = r1
            r1 = r34
            r0.h = r1
            r1 = r35
            r0.i = r1
            ads_mobile_sdk.cc2 r9 = new ads_mobile_sdk.cc2
            if (r4 == 0) goto L4d
            ads_mobile_sdk.cc2 r1 = r4.k
            int r8 = r1.a
        L4d:
            r15 = r8
            long r1 = dev.epro.r0.J10256772239794345968.c
            long r19 = r5 - r1
            long r1 = dev.epro.r0.J10256772239794345968.d
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5f
            r1 = -1
        L5c:
            r21 = r1
            goto L62
        L5f:
            long r1 = r5 - r1
            goto L5c
        L62:
            ads_mobile_sdk.q22 r1 = ads_mobile_sdk.xv.f2a
            if (r1 == 0) goto L73
            java.util.concurrent.atomic.AtomicInteger r1 = r1.m
            int r1 = r1.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r25 = r1
            goto L75
        L73:
            r25 = r7
        L75:
            ads_mobile_sdk.q22 r1 = ads_mobile_sdk.xv.f2a
            if (r1 == 0) goto L83
            java.util.concurrent.atomic.AtomicInteger r1 = r1.n
            int r1 = r1.get()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L83:
            r26 = r7
            r27 = 536868864(0x1ffff800, float:1.0840698E-19)
            r12 = r29
            r13 = r30
            r14 = r31
            r11 = r32
            r16 = r36
            r23 = r38
            r17 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r24, r25, r26, r27)
            r0.k = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.em2.<init>(ads_mobile_sdk.wv0, java.util.List, java.util.UUID, ads_mobile_sdk.mi3, ads_mobile_sdk.c7, dev.epro.r0.O16637889491137121389, ads_mobile_sdk.ci3, int, ads_mobile_sdk.em2, boolean, int):void");
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
        long currentTimeMillis = System.currentTimeMillis();
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        this.k.p = E17093345031926825464.g(M9216324016624295870.a0(currentTimeMillis, n13798149404328803870), M9216324016624295870.a0(this.c, n13798149404328803870));
    }
}
