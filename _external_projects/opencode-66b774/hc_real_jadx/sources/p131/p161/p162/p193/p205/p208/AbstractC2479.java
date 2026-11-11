package p131.p161.p162.p193.p205.p208;

import java.util.ArrayList;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.くし〴〺ぅ.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2479<TListener> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f9811 = false;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ AbstractC2501 f9812;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public TListener f9813;

    public AbstractC2479(AbstractC2501 abstractC2501, TListener tlistener) {
        this.f9812 = abstractC2501;
        this.f9813 = tlistener;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract void mo4509(TListener tlistener);

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m4510() {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this) {
            this.f9813 = null;
        }
        arrayList = this.f9812.zzfyo;
        synchronized (arrayList) {
            arrayList2 = this.f9812.zzfyo;
            arrayList2.remove(this);
        }
    }
}
