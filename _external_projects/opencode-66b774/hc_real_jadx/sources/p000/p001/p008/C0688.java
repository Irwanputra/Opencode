package p000.p001.p008;

import java.io.IOException;
import java.util.List;
import p000.p001.AbstractRunnableC0607;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0688 extends AbstractRunnableC0607 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f4582;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4583;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ C0654 f4584;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ List f4585;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0688(C0654 c0654, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.f4584 = c0654;
        this.f4582 = i;
        this.f4585 = list;
        this.f4583 = z;
    }

    @Override // p000.p001.AbstractRunnableC0607
    /* renamed from: げつ〴ぬぐ */
    public void mo1725() {
        this.f4584.f4452.getClass();
        try {
            this.f4584.f4448.m1900(this.f4582, EnumC0653.CANCEL);
            synchronized (this.f4584) {
                this.f4584.f4442.remove(Integer.valueOf(this.f4582));
            }
        } catch (IOException unused) {
        }
    }
}
