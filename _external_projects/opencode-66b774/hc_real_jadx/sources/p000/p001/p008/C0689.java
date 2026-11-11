package p000.p001.p008;

import p000.p001.AbstractRunnableC0607;
import p000.p001.p008.InterfaceC0682;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0689 extends AbstractRunnableC0607 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f4586;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ C0654 f4587;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ EnumC0653 f4588;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0689(C0654 c0654, String str, Object[] objArr, int i, EnumC0653 enumC0653) {
        super(str, objArr);
        this.f4587 = c0654;
        this.f4586 = i;
        this.f4588 = enumC0653;
    }

    @Override // p000.p001.AbstractRunnableC0607
    /* renamed from: げつ〴ぬぐ */
    public void mo1725() {
        ((InterfaceC0682.C0683) this.f4587.f4452).getClass();
        synchronized (this.f4587) {
            this.f4587.f4442.remove(Integer.valueOf(this.f4586));
        }
    }
}
