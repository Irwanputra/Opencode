package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import dev.epro.r0.M7525836972106262407;
import dev.epro.r0.X9949926171547611756;
import dev.epro.r0.Z12988921718439051032;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class pa1 implements ServiceConnection {
    public final c7 a;
    public final /* synthetic */ qa1 b;

    public pa1(qa1 qa1Var, c7 c7Var) {
        this.b = qa1Var;
        this.a = c7Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        M7525836972106262407 z12988921718439051032;
        int i = X9949926171547611756.j;
        if (iBinder == null) {
            z12988921718439051032 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            z12988921718439051032 = queryLocalInterface instanceof M7525836972106262407 ? (M7525836972106262407) queryLocalInterface : new Z12988921718439051032(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", (byte) 1);
        }
        qa1 qa1Var = this.b;
        qa1Var.d = z12988921718439051032;
        qa1Var.a = (byte) 2;
        this.a.a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qa1 qa1Var = this.b;
        qa1Var.d = null;
        qa1Var.a = (byte) 0;
    }
}
