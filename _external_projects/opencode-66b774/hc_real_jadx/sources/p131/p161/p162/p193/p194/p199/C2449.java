package p131.p161.p162.p193.p194.p199;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzak;
import com.google.android.gms.ads.internal.zzao;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzagb;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2449 extends zzagb {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ zzak f9797;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int f9798;

    public C2449(zzak zzakVar, int i) {
        this.f9797 = zzakVar;
        this.f9798 = i;
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void zzdm() {
        zzak zzakVar = this.f9797;
        boolean z = zzakVar.zzano.f2786;
        boolean m1226 = zzakVar.m1226();
        zzak zzakVar2 = this.f9797;
        boolean z2 = zzakVar2.f2705;
        float f = zzakVar2.f2706;
        zzbt zzbtVar = zzakVar2.zzano;
        zzao zzaoVar = new zzao(z, m1226, z2, f, zzbtVar.f2786 ? this.f9798 : -1, zzakVar2.f2702, zzbtVar.zzaud.zzaqv);
        int requestedOrientation = this.f9797.zzano.zzaud.zzciy.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f9797.zzano.zzaud.orientation;
        }
        int i = requestedOrientation;
        zzak zzakVar3 = this.f9797;
        zzbt zzbtVar2 = zzakVar3.zzano;
        zzafo zzafoVar = zzbtVar2.zzaud;
        zzahn.zzdaw.post(new RunnableC2389(this, new AdOverlayInfoParcel(zzakVar3, zzakVar3, zzakVar3, zzafoVar.zzciy, i, zzbtVar2.zzaty, zzafoVar.zzcpb, zzaoVar)));
    }
}
