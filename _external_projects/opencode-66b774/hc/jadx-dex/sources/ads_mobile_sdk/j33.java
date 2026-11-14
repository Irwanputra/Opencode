package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class j33 implements android.content.ServiceConnection {
    public final /* synthetic */ ads_mobile_sdk.k33 a;

    public j33(ads_mobile_sdk.k33 k33Var) {
        this.a = k33Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        ads_mobile_sdk.k33 k33Var = this.a;
        k33Var.b.getClass();
        k33Var.b(new ads_mobile_sdk.h33(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        ads_mobile_sdk.k33 k33Var = this.a;
        k33Var.b.getClass();
        k33Var.b(new ads_mobile_sdk.f33(this, (byte) 1));
    }
}
