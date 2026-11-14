package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J12863929547436663269 implements L12639328004344855510 {
    public final /* synthetic */ B13729205492206812220 a;
    public final /* synthetic */ I1722681268793429505 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Z7022156542152740569 d;
    public final /* synthetic */ String e;

    public J12863929547436663269(B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, boolean z, Z7022156542152740569 z7022156542152740569, String str) {
        this.a = b13729205492206812220;
        this.b = i1722681268793429505;
        this.c = z;
        this.d = z7022156542152740569;
        this.e = str;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int intValue = ((Number) obj2).intValue();
        boolean z = false;
        if (m3727281027331139839.R(intValue & 1, (intValue & 3) != 2)) {
            S10823041268949770285.f(this.a, this.b, this.c, null, null, S10823041268949770285.T(-1301085432, new U8464449497680896203(this.d, this.e, z, (byte) 3), m3727281027331139839), m3727281027331139839, 1572864, 56);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
