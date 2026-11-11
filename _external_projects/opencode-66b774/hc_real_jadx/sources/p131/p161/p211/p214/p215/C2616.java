package p131.p161.p211.p214.p215;

import java.lang.reflect.Field;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p213.C2535;
import p131.p161.p211.p214.p215.C2557;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2616 extends C2557.AbstractC2558 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final /* synthetic */ C2672 f10045;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final /* synthetic */ C2673 f10046;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10047;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2658 f10048;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ Field f10049;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final /* synthetic */ boolean f10050;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2616(C2557 c2557, String str, boolean z, boolean z2, Field field, boolean z3, AbstractC2658 abstractC2658, C2673 c2673, C2672 c2672, boolean z4) {
        super(str, z, z2);
        this.f10049 = field;
        this.f10047 = z3;
        this.f10048 = abstractC2658;
        this.f10046 = c2673;
        this.f10045 = c2672;
        this.f10050 = z4;
    }

    @Override // p131.p161.p211.p214.p215.C2557.AbstractC2558
    /* renamed from: 〺つふすそ */
    public void mo4594(C2534 c2534, Object obj) {
        (this.f10047 ? this.f10048 : new C2615(this.f10046, this.f10048, this.f10045.f10128)).mo4533(c2534, this.f10049.get(obj));
    }

    @Override // p131.p161.p211.p214.p215.C2557.AbstractC2558
    /* renamed from: くし〴〺ぅ */
    public boolean mo4595(Object obj) {
        return this.f9937 && this.f10049.get(obj) != obj;
    }

    @Override // p131.p161.p211.p214.p215.C2557.AbstractC2558
    /* renamed from: げつ〴ぬぐ */
    public void mo4596(C2535 c2535, Object obj) {
        Object mo4534 = this.f10048.mo4534(c2535);
        if (mo4534 == null && this.f10050) {
            return;
        }
        this.f10049.set(obj, mo4534);
    }
}
