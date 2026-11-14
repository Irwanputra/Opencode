package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A12579232015529019125 extends dev.epro.r0.J17338357039098224162 {
    public final android.os.IBinder g;
    public final /* synthetic */ dev.epro.r0.E1636901823844057514 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A12579232015529019125(dev.epro.r0.E1636901823844057514 e1636901823844057514, int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(e1636901823844057514, i, bundle);
        this.h = e1636901823844057514;
        this.g = iBinder;
    }

    public final boolean a() {
        java.lang.String interfaceDescriptor;
        dev.epro.r0.E1636901823844057514 e1636901823844057514;
        android.os.IBinder iBinder = this.g;
        try {
            dev.epro.r0.M18113111391818111737.v(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e1636901823844057514 = this.h;
        } catch (android.os.RemoteException unused) {
        }
        if (!e1636901823844057514.c().equals(interfaceDescriptor)) {
            new java.lang.StringBuilder(e1636901823844057514.c().length() + 34 + java.lang.String.valueOf(interfaceDescriptor).length());
            return false;
        }
        android.os.IInterface iInterfaceB = e1636901823844057514.b(iBinder);
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

    public final void b(dev.epro.r0.B6867906687934285025 b6867906687934285025) {
        dev.epro.r0.E1636901823844057514 e1636901823844057514 = this.h;
        if (e1636901823844057514.zzl() != null) {
            e1636901823844057514.zzl().onConnectionFailed(b6867906687934285025);
        }
        java.lang.System.currentTimeMillis();
    }
}
