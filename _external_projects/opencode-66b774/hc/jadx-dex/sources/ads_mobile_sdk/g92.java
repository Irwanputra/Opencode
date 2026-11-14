package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class g92 extends dev.epro.r0.X9877988182490498425 {
    public final /* synthetic */ ads_mobile_sdk.m92 a;
    public final /* synthetic */ android.app.Activity b;
    public final /* synthetic */ android.net.Uri c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.util.Map e;

    public g92(ads_mobile_sdk.m92 m92Var, android.app.Activity activity, android.net.Uri uri, java.lang.String str, java.util.Map map) {
        this.a = m92Var;
        this.b = activity;
        this.c = uri;
        this.d = str;
        this.e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCustomTabsServiceConnected(android.content.ComponentName componentName, dev.epro.r0.W8455343525638953052 w8455343525638953052) {
        dev.epro.r0.H10456395662455432781 h10456395662455432781 = (dev.epro.r0.F11625739791267273945) w8455343525638953052.b;
        componentName.getClass();
        try {
            h10456395662455432781.c();
        } catch (android.os.RemoteException unused) {
        }
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = null;
        dev.epro.r0.F4673815160636847046 f4673815160636847046 = new dev.epro.r0.F4673815160636847046((dev.epro.r0.I3887072968740112330) null);
        try {
            if (h10456395662455432781.b(f4673815160636847046)) {
                q7316561721656982910 = new dev.epro.r0.Q7316561721656982910(h10456395662455432781, f4673815160636847046, (android.content.ComponentName) w8455343525638953052.c);
            }
        } catch (android.os.RemoteException unused2) {
        }
        java.lang.String str = this.d;
        java.util.Map map = this.e;
        this.a.a(q7316561721656982910, this.b, this.c, str, map);
        this.b.unbindService(this);
    }

    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        componentName.getClass();
    }
}
