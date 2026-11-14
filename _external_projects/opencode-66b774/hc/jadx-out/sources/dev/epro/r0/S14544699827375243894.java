package dev.epro.r0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S14544699827375243894 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ E1636901823844057514 b;

    public S14544699827375243894(E1636901823844057514 e1636901823844057514, int i) {
        this.b = e1636901823844057514;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        E1636901823844057514 e1636901823844057514 = this.b;
        if (iBinder == null) {
            e1636901823844057514.zzf();
            return;
        }
        synchronized (e1636901823844057514.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                e1636901823844057514.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Q444194404169614612)) ? new Q444194404169614612(iBinder) : (Q444194404169614612) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        E1636901823844057514 e16369018238440575142 = this.b;
        int i = this.a;
        S7688660466602962762 s7688660466602962762 = new S7688660466602962762(e16369018238440575142, 0, null);
        C4270155929442575666 c4270155929442575666 = e16369018238440575142.zzb;
        c4270155929442575666.sendMessage(c4270155929442575666.obtainMessage(7, i, -1, s7688660466602962762));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        E1636901823844057514 e1636901823844057514 = this.b;
        synchronized (e1636901823844057514.zzh()) {
            e1636901823844057514.zzi(null);
        }
        E1636901823844057514 e16369018238440575142 = this.b;
        int i = this.a;
        C4270155929442575666 c4270155929442575666 = e16369018238440575142.zzb;
        c4270155929442575666.sendMessage(c4270155929442575666.obtainMessage(6, i, 1));
    }
}
