package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class pa1 implements android.content.ServiceConnection {
    public final ads_mobile_sdk.c7 a;
    public final /* synthetic */ ads_mobile_sdk.qa1 b;

    public pa1(ads_mobile_sdk.qa1 qa1Var, ads_mobile_sdk.c7 c7Var) {
        this.b = qa1Var;
        this.a = c7Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        dev.epro.r0.M7525836972106262407 z12988921718439051032;
        int i = dev.epro.r0.X9949926171547611756.j;
        if (iBinder == null) {
            z12988921718439051032 = null;
        } else {
            dev.epro.r0.M7525836972106262407 m7525836972106262407QueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            z12988921718439051032 = m7525836972106262407QueryLocalInterface instanceof dev.epro.r0.M7525836972106262407 ? m7525836972106262407QueryLocalInterface : new dev.epro.r0.Z12988921718439051032(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", (byte) 1);
        }
        ads_mobile_sdk.qa1 qa1Var = this.b;
        qa1Var.d = z12988921718439051032;
        qa1Var.a = (byte) 2;
        this.a.a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        ads_mobile_sdk.qa1 qa1Var = this.b;
        qa1Var.d = null;
        qa1Var.a = (byte) 0;
    }
}
