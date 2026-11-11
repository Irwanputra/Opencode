package p000.p001.p008;

import java.io.IOException;
import p000.p001.AbstractRunnableC0607;
import p000.p001.p004.C0626;
import p000.p001.p008.C0654;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0678 extends AbstractRunnableC0607 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C0663 f4541;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C0654.C0659 f4542;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0678(C0654.C0659 c0659, String str, Object[] objArr, C0663 c0663) {
        super(str, objArr);
        this.f4542 = c0659;
        this.f4541 = c0663;
    }

    @Override // p000.p001.AbstractRunnableC0607
    /* renamed from: げつ〴ぬぐ */
    public void mo1725() {
        try {
            C0654.this.f4440.mo1857(this.f4541);
        } catch (IOException e) {
            C0626 c0626 = C0626.f4331;
            StringBuilder m4207 = C2098.m4207("Http2Connection.Listener failure for ");
            m4207.append(C0654.this.f4444);
            c0626.mo1793(4, m4207.toString(), e);
            try {
                this.f4541.m1886(EnumC0653.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
