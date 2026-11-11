package p000.p001.p008;

import java.io.IOException;
import p000.p001.AbstractRunnableC0607;
import p000.p001.p008.InterfaceC0682;
import p243.C2819;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぺぁあねじ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0662 extends AbstractRunnableC0607 {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ C0654 f4472;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ int f4473;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ int f4474;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4475;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C2819 f4476;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0662(C0654 c0654, String str, Object[] objArr, int i, C2819 c2819, int i2, boolean z) {
        super(str, objArr);
        this.f4472 = c0654;
        this.f4473 = i;
        this.f4476 = c2819;
        this.f4474 = i2;
        this.f4475 = z;
    }

    @Override // p000.p001.AbstractRunnableC0607
    /* renamed from: げつ〴ぬぐ */
    public void mo1725() {
        try {
            InterfaceC0682 interfaceC0682 = this.f4472.f4452;
            C2819 c2819 = this.f4476;
            int i = this.f4474;
            ((InterfaceC0682.C0683) interfaceC0682).getClass();
            c2819.mo4864(i);
            this.f4472.f4448.m1900(this.f4473, EnumC0653.CANCEL);
            synchronized (this.f4472) {
                this.f4472.f4442.remove(Integer.valueOf(this.f4473));
            }
        } catch (IOException unused) {
        }
    }
}
