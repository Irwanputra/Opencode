package p131.p161.p162.p193.p205.p208;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.びえぁぜい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ServiceConnectionC2502 implements ServiceConnection {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ AbstractC2501 f9845;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int f9846;

    public ServiceConnectionC2502(AbstractC2501 abstractC2501, int i) {
        this.f9845 = abstractC2501;
        this.f9846 = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC2501 abstractC2501 = this.f9845;
        if (iBinder == null) {
            abstractC2501.zzcf(16);
            return;
        }
        obj = abstractC2501.zzfyk;
        synchronized (obj) {
            AbstractC2501 abstractC25012 = this.f9845;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            abstractC25012.zzfyl = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC2505)) ? new C2487(iBinder) : (InterfaceC2505) queryLocalInterface;
        }
        this.f9845.zza(0, (Bundle) null, this.f9846);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f9845.zzfyk;
        synchronized (obj) {
            this.f9845.zzfyl = null;
        }
        Handler handler = this.f9845.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.f9846, 1));
    }
}
