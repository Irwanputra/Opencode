package p131.p161.p162.p193.p205.p208;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2490 extends AbstractC2479<Boolean> {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Bundle f9824;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public /* synthetic */ AbstractC2501 f9825;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f9826;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2490(AbstractC2501 abstractC2501, int i, Bundle bundle) {
        super(abstractC2501, Boolean.TRUE);
        this.f9825 = abstractC2501;
        this.f9826 = i;
        this.f9824 = bundle;
    }

    @Override // p131.p161.p162.p193.p205.p208.AbstractC2479
    /* renamed from: 〺つふすそ */
    public final /* synthetic */ void mo4509(Boolean bool) {
        ConnectionResult connectionResult;
        int i = this.f9826;
        if (i != 0) {
            if (i == 10) {
                this.f9825.zza(1, (int) null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            this.f9825.zza(1, (int) null);
            Bundle bundle = this.f9824;
            connectionResult = new ConnectionResult(this.f9826, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (mo4512()) {
                return;
            }
            this.f9825.zza(1, (int) null);
            connectionResult = new ConnectionResult(8, null);
        }
        mo4513(connectionResult);
    }

    /* renamed from: くし〴〺ぅ */
    public abstract boolean mo4512();

    /* renamed from: びぐびあび */
    public abstract void mo4513(ConnectionResult connectionResult);
}
