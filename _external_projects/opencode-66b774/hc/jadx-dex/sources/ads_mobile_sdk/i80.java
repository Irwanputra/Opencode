package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class i80 extends dev.epro.r0.X9877988182490498425 {
    public final android.content.Context a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final ads_mobile_sdk.kz2 c;
    public dev.epro.r0.Q7316561721656982910 d;
    public dev.epro.r0.W8455343525638953052 e;
    public final java.util.concurrent.atomic.AtomicBoolean f;

    public i80(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.kz2 kz2Var) {
        context.getClass();
        w5797197595347441198.getClass();
        kz2Var.getClass();
        this.a = context;
        this.b = w5797197595347441198;
        this.c = kz2Var;
        this.f = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void onCustomTabsServiceConnected(android.content.ComponentName componentName, dev.epro.r0.W8455343525638953052 w8455343525638953052) {
        dev.epro.r0.H10456395662455432781 h10456395662455432781 = (dev.epro.r0.F11625739791267273945) w8455343525638953052.b;
        componentName.getClass();
        this.e = w8455343525638953052;
        try {
            h10456395662455432781.c();
        } catch (android.os.RemoteException unused) {
        }
        dev.epro.r0.F4673815160636847046 f4673815160636847046 = new dev.epro.r0.F4673815160636847046(new ads_mobile_sdk.h80(this));
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = !h10456395662455432781.b(f4673815160636847046) ? null : new dev.epro.r0.Q7316561721656982910(h10456395662455432781, f4673815160636847046, (android.content.ComponentName) w8455343525638953052.c);
        this.d = q7316561721656982910;
    }

    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.d = null;
        this.e = null;
    }
}
