package p131.p161.p162.p193.p194.p199;

import com.google.android.gms.ads.internal.zzag;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2439 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzjj f9782;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzag f9783;

    public RunnableC2439(zzag zzagVar, zzjj zzjjVar) {
        this.f9783 = zzagVar;
        this.f9782 = zzjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9783.f2674) {
            zzag zzagVar = this.f9783;
            zzagVar.getClass();
            if (((Boolean) zzkb.zzif().zzd(zznh.zzblk)).booleanValue() && zzagVar.f2666 != null) {
                zzag.m1221(this.f9783, this.f9782);
            } else {
                zzag.m1222(this.f9783, this.f9782, 1);
            }
        }
    }
}
