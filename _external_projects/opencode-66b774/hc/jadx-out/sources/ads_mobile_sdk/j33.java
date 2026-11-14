package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class j33 implements ServiceConnection {
    public final /* synthetic */ k33 a;

    public j33(k33 k33Var) {
        this.a = k33Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k33 k33Var = this.a;
        k33Var.b.getClass();
        k33Var.b(new h33(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k33 k33Var = this.a;
        k33Var.b.getClass();
        k33Var.b(new f33(this, (byte) 1));
    }
}
