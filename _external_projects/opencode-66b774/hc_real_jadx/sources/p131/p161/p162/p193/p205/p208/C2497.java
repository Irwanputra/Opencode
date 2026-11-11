package p131.p161.p162.p193.p205.p208;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.どぇぞほだ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2497 extends AbstractC2490 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public /* synthetic */ AbstractC2501 f9835;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public IBinder f9836;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497(AbstractC2501 abstractC2501, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC2501, i, bundle);
        this.f9835 = abstractC2501;
        this.f9836 = iBinder;
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2490
    /* renamed from: くし〴〺ぅ */
    public final boolean mo4512() {
        boolean zza;
        InterfaceC2491 interfaceC2491;
        InterfaceC2491 interfaceC24912;
        boolean zza2;
        try {
            String interfaceDescriptor = this.f9836.getInterfaceDescriptor();
            if (!this.f9835.zzhj().equals(interfaceDescriptor)) {
                String.valueOf(this.f9835.zzhj()).length();
                String.valueOf(interfaceDescriptor).length();
                return false;
            }
            IInterface zzd = this.f9835.zzd(this.f9836);
            if (zzd == null) {
                return false;
            }
            zza = this.f9835.zza(2, 4, (int) zzd);
            if (!zza) {
                zza2 = this.f9835.zza(3, 4, (int) zzd);
                if (!zza2) {
                    return false;
                }
            }
            this.f9835.zzfyv = null;
            Bundle zzafi = this.f9835.zzafi();
            interfaceC2491 = this.f9835.zzfyr;
            if (interfaceC2491 != null) {
                interfaceC24912 = this.f9835.zzfyr;
                interfaceC24912.onConnected(zzafi);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2490
    /* renamed from: びぐびあび */
    public final void mo4513(ConnectionResult connectionResult) {
        InterfaceC2496 interfaceC2496;
        InterfaceC2496 interfaceC24962;
        interfaceC2496 = this.f9835.zzfys;
        if (interfaceC2496 != null) {
            interfaceC24962 = this.f9835.zzfys;
            interfaceC24962.onConnectionFailed(connectionResult);
        }
        this.f9835.onConnectionFailed(connectionResult);
    }
}
