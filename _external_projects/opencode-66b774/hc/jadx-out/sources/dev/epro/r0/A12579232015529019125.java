package dev.epro.r0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A12579232015529019125 extends J17338357039098224162 {
    public final IBinder g;
    public final /* synthetic */ E1636901823844057514 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A12579232015529019125(E1636901823844057514 e1636901823844057514, int i, IBinder iBinder, Bundle bundle) {
        super(e1636901823844057514, i, bundle);
        this.h = e1636901823844057514;
        this.g = iBinder;
    }

    @Override // dev.epro.r0.J17338357039098224162
    public final boolean a() {
        String interfaceDescriptor;
        E1636901823844057514 e1636901823844057514;
        IBinder iBinder = this.g;
        try {
            M18113111391818111737.v(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e1636901823844057514 = this.h;
        } catch (RemoteException unused) {
        }
        if (!e1636901823844057514.c().equals(interfaceDescriptor)) {
            new StringBuilder(e1636901823844057514.c().length() + 34 + String.valueOf(interfaceDescriptor).length());
            return false;
        }
        IInterface iInterfaceB = e1636901823844057514.b(iBinder);
        if (iInterfaceB != null && (e1636901823844057514.zze(2, 4, iInterfaceB) || e1636901823844057514.zze(3, 4, iInterfaceB))) {
            e1636901823844057514.zzn(null);
            if (e1636901823844057514.zzk() == null) {
                return true;
            }
            e1636901823844057514.zzk().onConnected();
            return true;
        }
        return false;
    }

    @Override // dev.epro.r0.J17338357039098224162
    public final void b(B6867906687934285025 b6867906687934285025) {
        E1636901823844057514 e1636901823844057514 = this.h;
        if (e1636901823844057514.zzl() != null) {
            e1636901823844057514.zzl().onConnectionFailed(b6867906687934285025);
        }
        System.currentTimeMillis();
    }
}
