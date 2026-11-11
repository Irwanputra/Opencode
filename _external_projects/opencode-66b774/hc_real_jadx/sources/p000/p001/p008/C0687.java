package p000.p001.p008;

import java.io.IOException;
import p000.p001.AbstractRunnableC0607;
import p000.p001.p008.C0654;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0687 extends AbstractRunnableC0607 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C0673 f4580;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C0654.C0659 f4581;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0687(C0654.C0659 c0659, String str, Object[] objArr, C0673 c0673) {
        super(str, objArr);
        this.f4581 = c0659;
        this.f4580 = c0673;
    }

    @Override // p000.p001.AbstractRunnableC0607
    /* renamed from: げつ〴ぬぐ */
    public void mo1725() {
        try {
            C0654.this.f4448.m1902(this.f4580);
        } catch (IOException unused) {
            C0654.m1872(C0654.this);
        }
    }
}
