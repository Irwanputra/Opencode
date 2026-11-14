package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M18374774969436364933 implements F4096073349764486348 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ M18374774969436364933(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        F13711604687869105489 f13711604687869105489 = (F13711604687869105489) obj;
        F12478849263529740365 f12478849263529740365 = f13711604687869105489.g;
        String str = this.a;
        if (f12478849263529740365 != null) {
            long j = f12478849263529740365.a;
            D15445857918358799638.N(f13711604687869105489, (int) (j >> 32), (int) (j & 4294967295L), str);
        } else {
            D15445857918358799638.N(f13711604687869105489, F12478849263529740365.g(f13711604687869105489.f), F12478849263529740365.f(f13711604687869105489.f), str);
        }
        int iG = F12478849263529740365.g(f13711604687869105489.f);
        int i = this.b;
        int length = i > 0 ? (iG + i) - 1 : (iG + i) - str.length();
        f13711604687869105489.d = this.c;
        int iQ = W7808703833045379622.q(length, 0, f13711604687869105489.b.length());
        f13711604687869105489.g(T1335862270807194835.d(iQ, iQ));
        return O9245300239821758723.a;
    }
}
