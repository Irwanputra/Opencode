package p131.p161.p162.p193.p205.p208;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.なぶひせが, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2499 implements InterfaceC2485 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ AbstractC2501 f9844;

    public C2499(AbstractC2501 abstractC2501) {
        this.f9844 = abstractC2501;
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2485
    /* renamed from: げつ〴ぬぐ */
    public final void mo4514(ConnectionResult connectionResult) {
        InterfaceC2496 interfaceC2496;
        InterfaceC2496 interfaceC24962;
        if (connectionResult.f2855 == 0) {
            AbstractC2501 abstractC2501 = this.f9844;
            abstractC2501.zza((InterfaceC2506) null, abstractC2501.zzakp());
            return;
        }
        interfaceC2496 = this.f9844.zzfys;
        if (interfaceC2496 != null) {
            interfaceC24962 = this.f9844.zzfys;
            interfaceC24962.onConnectionFailed(connectionResult);
        }
    }
}
