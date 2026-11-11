package p131.p161.p162.p193.p194.p199;

import com.google.android.gms.ads.internal.zzag;
import com.google.android.gms.internal.zzjj;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2387 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzjj f9702;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ int f9703;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public /* synthetic */ zzag f9704;

    public RunnableC2387(zzag zzagVar, zzjj zzjjVar, int i) {
        this.f9704 = zzagVar;
        this.f9702 = zzjjVar;
        this.f9703 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9704.f2674) {
            zzag.m1222(this.f9704, this.f9702, this.f9703);
        }
    }
}
