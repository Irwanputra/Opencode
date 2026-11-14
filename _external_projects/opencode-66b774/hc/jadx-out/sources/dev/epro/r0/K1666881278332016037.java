package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K1666881278332016037 extends J2215566372910931965 implements F16971278462881137815 {
    public final Q686808008070211503 A;
    public boolean q;
    public D5961215468735357278 r;
    public float s = 2.0f;
    public float t = 1.0f;
    public boolean u;
    public X7175349259954592591 v;
    public M15706644554150934798 w;
    public U16834965109098959004 x;
    public I5573661370475160895 y;
    public final U16834965109098959004 z;

    public K1666881278332016037(boolean z, D5961215468735357278 d5961215468735357278, M15706644554150934798 m15706644554150934798, I5573661370475160895 i5573661370475160895) {
        this.q = z;
        this.r = d5961215468735357278;
        this.w = m15706644554150934798;
        this.y = i5573661370475160895;
        this.z = new U16834965109098959004(new A891803927997771281((this.u && z) ? 2.0f : 1.0f), D15913187640519482289.j, null, 12);
        Q686808008070211503 q686808008070211503 = new Q686808008070211503(new W15170032298606046665(), new S16262227471297796850(this, (byte) 8));
        h1(q686808008070211503);
        this.A = q686808008070211503;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final boolean W0() {
        return false;
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void Z0() {
        this.v = R7033599853981556291.E(V0(), null, null, new Z15623011445117113174(this, null, (byte) 2), 3);
        if (this.x == null) {
            M15706644554150934798 m15706644554150934798M = this.w;
            if (m15706644554150934798M == null) {
                m15706644554150934798M = B14824868959299866349.m((J3745674191043464657) B11964701839924937722.o(this, J5654975781851244064.a), (E8171957064035740491) B11964701839924937722.o(this, L9437793152864500530.a));
            }
            long jC = m15706644554150934798M.c(this.q, false, this.u);
            this.x = new U16834965109098959004(new U10174709222559481877(jC), new O3410298526443296213(J6249063375258466235.f315o, new J3227772737003951788(U10174709222559481877.e(jC), (byte) 8)), null, 12);
        }
    }

    public final void k1() {
        R7033599853981556291.E(V0(), null, null, new Z15623011445117113174(this, null, (byte) 0), 3);
        R7033599853981556291.E(V0(), null, null, new Z15623011445117113174(this, null, (byte) 1), 3);
    }

    public final Object l1(R14062301455140331524 r14062301455140331524) {
        this.u = false;
        Object objCollect = this.r.a().collect(new Z10733167746954993267(new ArrayList(), this, (byte) 4), r14062301455140331524);
        return objCollect == Z3437138737604933638.a ? objCollect : O9245300239821758723.a;
    }
}
