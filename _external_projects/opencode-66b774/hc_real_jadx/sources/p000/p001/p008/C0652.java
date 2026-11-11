package p000.p001.p008;

import java.io.IOException;
import java.util.List;
import p000.p001.AbstractRunnableC0607;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0652 extends AbstractRunnableC0607 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f4416;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ C0654 f4417;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ List f4418;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0652(C0654 c0654, String str, Object[] objArr, int i, List list) {
        super(str, objArr);
        this.f4417 = c0654;
        this.f4416 = i;
        this.f4418 = list;
    }

    @Override // p000.p001.AbstractRunnableC0607
    /* renamed from: げつ〴ぬぐ */
    public void mo1725() {
        this.f4417.f4452.getClass();
        try {
            this.f4417.f4448.m1900(this.f4416, EnumC0653.CANCEL);
            synchronized (this.f4417) {
                this.f4417.f4442.remove(Integer.valueOf(this.f4416));
            }
        } catch (IOException unused) {
        }
    }
}
