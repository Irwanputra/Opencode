package p015.p016.p020;

import java.util.Collections;
import java.util.List;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0970 extends AbstractC0974 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final List<AbstractC0974> f5305 = Collections.emptyList();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Object f5306;

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String mo2278(String str) {
        C1687.m3701(str);
        return !(this.f5306 instanceof C0956) ? str.equals(mo2252()) ? (String) this.f5306 : "" : super.mo2278(str);
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final void m2279() {
        Object obj = this.f5306;
        if (obj instanceof C0956) {
            return;
        }
        C0956 c0956 = new C0956();
        this.f5306 = c0956;
        if (obj != null) {
            c0956.m2266(mo2252(), (String) obj);
        }
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public List<AbstractC0974> mo2280() {
        return f5305;
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC0974 mo2281(String str, String str2) {
        if ((this.f5306 instanceof C0956) || !str.equals("#doctype")) {
            m2279();
            super.mo2281(str, str2);
        } else {
            this.f5306 = str2;
        }
        return this;
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public String mo2282(String str) {
        m2279();
        return super.mo2282(str);
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String mo2283() {
        AbstractC0974 abstractC0974 = this.f5308;
        return abstractC0974 != null ? abstractC0974.mo2283() : "";
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean mo2284(String str) {
        m2279();
        return super.mo2284(str);
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int mo2285() {
        return 0;
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final boolean mo2286() {
        return this.f5306 instanceof C0956;
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0956 mo2287() {
        m2279();
        return (C0956) this.f5306;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public String m2288() {
        return mo2278(mo2252());
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void mo2289(String str) {
    }
}
