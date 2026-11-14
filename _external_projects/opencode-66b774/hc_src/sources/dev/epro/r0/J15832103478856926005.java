package dev.epro.r0;

import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J15832103478856926005 implements L12639328004344855510 {
    public final /* synthetic */ I1722681268793429505 a;
    public final /* synthetic */ M15706644554150934798 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ F4096073349764486348 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ S16571168858015125610 f;
    public final /* synthetic */ W17015830374102496917 g;
    public final /* synthetic */ O12013896688000893502 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ H14763425654620554740 l;
    public final /* synthetic */ S9385204271696540760 m;
    public final /* synthetic */ L12639328004344855510 n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I5573661370475160895 f307o;

    /* JADX WARN: Multi-variable type inference failed */
    public J15832103478856926005(I1722681268793429505 i1722681268793429505, M15706644554150934798 m15706644554150934798, String str, F4096073349764486348 f4096073349764486348, boolean z, S16571168858015125610 s16571168858015125610, W17015830374102496917 w17015830374102496917, O12013896688000893502 o12013896688000893502, boolean z2, int i, int i2, H14763425654620554740 h14763425654620554740, S9385204271696540760 s9385204271696540760, L12639328004344855510 l12639328004344855510, I5573661370475160895 i5573661370475160895) {
        this.a = i1722681268793429505;
        this.b = m15706644554150934798;
        this.c = str;
        this.d = f4096073349764486348;
        this.e = z;
        this.f = s16571168858015125610;
        this.g = w17015830374102496917;
        this.h = o12013896688000893502;
        this.i = z2;
        this.j = i;
        this.k = i2;
        this.l = h14763425654620554740;
        this.m = s9385204271696540760;
        this.n = l12639328004344855510;
        this.f307o = i5573661370475160895;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
        int intValue = ((Number) obj2).intValue();
        if (m3727281027331139839.R(intValue & 1, (intValue & 3) != 2)) {
            H4776669175763245653.h(R.string.default_error_message, m3727281027331139839);
            I1722681268793429505 a = V16747615581620678882.a(this.a, 280.0f, 56.0f);
            M15706644554150934798 m15706644554150934798 = this.b;
            H10765568533039107979 h10765568533039107979 = new H10765568533039107979(m15706644554150934798.i);
            L12639328004344855510 l12639328004344855510 = this.n;
            I5573661370475160895 i5573661370475160895 = this.f307o;
            String str = this.c;
            boolean z = this.e;
            boolean z2 = this.i;
            H14763425654620554740 h14763425654620554740 = this.l;
            S9385204271696540760 s9385204271696540760 = this.m;
            G16769124785875698659.d(str, this.d, a, z, false, this.f, this.g, this.h, z2, this.j, this.k ? 1 : 0, h14763425654620554740, null, s9385204271696540760, h10765568533039107979, S10823041268949770285.T(1451491557, new A3018954577962390442(str, z, z2, h14763425654620554740, s9385204271696540760, l12639328004344855510, i5573661370475160895, m15706644554150934798), m3727281027331139839), m3727281027331139839, 0, 196608, 4096);
        } else {
            m3727281027331139839.U();
        }
        return O9245300239821758723.a;
    }
}
