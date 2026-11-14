package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class h33 extends ads_mobile_sdk.e13 {
    public final /* synthetic */ android.os.IBinder b;
    public final /* synthetic */ ads_mobile_sdk.j33 c;

    public h33(ads_mobile_sdk.j33 j33Var, android.os.IBinder iBinder) {
        this.c = j33Var;
        this.b = iBinder;
    }

    @Override // ads_mobile_sdk.e13
    public final void a() {
        dev.epro.r0.S16368912275120420111 g17117010345184598579;
        ads_mobile_sdk.k33 k33Var = this.c.a;
        k33Var.i.getClass();
        int i = dev.epro.r0.W677543363946197278.j;
        android.os.IBinder iBinder = this.b;
        if (iBinder == null) {
            g17117010345184598579 = null;
        } else {
            dev.epro.r0.S16368912275120420111 s16368912275120420111QueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
            g17117010345184598579 = s16368912275120420111QueryLocalInterface instanceof dev.epro.r0.S16368912275120420111 ? s16368912275120420111QueryLocalInterface : new dev.epro.r0.G17117010345184598579(iBinder, "com.google.android.play.core.prewarm.protocol.IPrewarmService", (byte) 1);
        }
        k33Var.n = g17117010345184598579;
        ads_mobile_sdk.d62 d62Var = k33Var.b;
        d62Var.getClass();
        int i2 = 0;
        try {
            k33Var.n.b.linkToDeath(k33Var.k, 0);
        } catch (android.os.RemoteException unused) {
            d62Var.getClass();
        }
        k33Var.g = false;
        java.util.ArrayList arrayList = k33Var.d;
        int size = arrayList.size();
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            ((java.lang.Runnable) obj).run();
        }
        k33Var.d.clear();
    }
}
