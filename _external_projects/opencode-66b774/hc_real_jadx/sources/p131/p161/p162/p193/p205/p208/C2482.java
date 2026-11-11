package p131.p161.p162.p193.p205.p208;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.ぅみぱぎぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2482 extends AbstractC2490 {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public /* synthetic */ AbstractC2501 f9814;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2482(AbstractC2501 abstractC2501, int i) {
        super(abstractC2501, i, null);
        this.f9814 = abstractC2501;
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2490
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean mo4512() {
        this.f9814.zzfym.mo4514(ConnectionResult.f2853);
        return true;
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2490
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void mo4513(ConnectionResult connectionResult) {
        this.f9814.zzfym.mo4514(connectionResult);
        this.f9814.onConnectionFailed(connectionResult);
    }
}
