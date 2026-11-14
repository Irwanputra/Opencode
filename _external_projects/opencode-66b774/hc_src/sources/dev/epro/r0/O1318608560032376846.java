package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O1318608560032376846 extends K10678596132709730734 {
    public static final L5727651961827975639 b = new L5727651961827975639(new O1318608560032376846(2), (byte) 0);
    public final int a;

    public O1318608560032376846(int i) {
        this.a = i;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        int H = d13396727227989475489.H();
        int A = L11610354117192841236.A(H);
        if (A == 5 || A == 6) {
            return G6547577305291411977.b(this.a, d13396727227989475489);
        }
        if (A == 8) {
            d13396727227989475489.D();
            return null;
        }
        throw new X13554947934760653097("Expecting number, got: " + G11450220448113054352.x(H) + "; at path " + d13396727227989475489.o(false));
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        y14132333989764804283.C((Number) obj);
    }
}
