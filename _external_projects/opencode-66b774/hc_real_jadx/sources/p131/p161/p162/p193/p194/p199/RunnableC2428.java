package p131.p161.p162.p193.p194.p199;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzba;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.internal.zzou;
import java.util.List;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2428 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzou f9758;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ int f9759;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public /* synthetic */ zzba f9760;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public /* synthetic */ List f9761;

    public RunnableC2428(zzba zzbaVar, zzou zzouVar, int i, List list) {
        this.f9760 = zzbaVar;
        this.f9758 = zzouVar;
        this.f9759 = i;
        this.f9761 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzou zzouVar = this.f9758;
            if (zzouVar instanceof zzol) {
                zzba zzbaVar = this.f9760;
                if (zzbaVar.zzano.f2774 != null) {
                    zzbaVar.zzanm = this.f9759 != this.f9761.size() - 1;
                    this.f9760.zzano.f2774.zza((zzol) this.f9758);
                    return;
                }
            }
            if (zzouVar instanceof zzoj) {
                zzba zzbaVar2 = this.f9760;
                if (zzbaVar2.zzano.f2796 != null) {
                    zzbaVar2.zzanm = this.f9759 != this.f9761.size() - 1;
                    this.f9760.zzano.f2796.zza((zzoj) this.f9758);
                    return;
                }
            }
            this.f9760.zzc(3, this.f9759 != this.f9761.size() - 1);
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onAppInstallAdLoaded or onContentAdLoaded method", e);
        }
    }
}
