package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T10311863586179033906 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ B13729205492206812220 b;
    public final /* synthetic */ B13729205492206812220 c;

    public /* synthetic */ T10311863586179033906(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, byte b) {
        this.a = b;
        this.b = b13729205492206812220;
        this.c = b137292054922068122202;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        B13729205492206812220 b13729205492206812220 = this.c;
        B13729205492206812220 b137292054922068122202 = this.b;
        S9686291038205059113 s9686291038205059113 = (S9686291038205059113) obj;
        switch (b) {
            case 0:
                b137292054922068122202.invoke();
                if (b13729205492206812220 != null ? ((Boolean) b13729205492206812220.invoke()).booleanValue() : true) {
                    s9686291038205059113.close();
                }
                break;
            default:
                b137292054922068122202.invoke();
                if (b13729205492206812220 != null ? ((Boolean) b13729205492206812220.invoke()).booleanValue() : true) {
                    s9686291038205059113.close();
                }
                break;
        }
        return o9245300239821758723;
    }
}
