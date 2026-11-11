package p015.p016.p018;

import java.util.ArrayList;
import p015.p016.p018.AbstractC0788;
import p015.p016.p020.C0958;
import p015.p016.p020.C0976;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0829 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C0830 f5143;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C0801 f5144;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C0828 f5145;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C0958 f5147;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C0827 f5148;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f5149;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public AbstractC0788 f5150;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ArrayList<C0976> f5151;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public AbstractC0788.C0789 f5152 = new AbstractC0788.C0789();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public AbstractC0788.C0791 f5146 = new AbstractC0788.C0791();

    /* renamed from: 〺つふすそ */
    public abstract boolean mo2135(AbstractC0788 abstractC0788);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m2213(String str) {
        AbstractC0788 abstractC0788 = this.f5150;
        AbstractC0788.C0791 c0791 = this.f5146;
        if (abstractC0788 == c0791) {
            AbstractC0788.C0791 c07912 = new AbstractC0788.C0791();
            c07912.f5030 = str;
            c07912.f5033 = C1687.m3717(str);
            return mo2135(c07912);
        }
        c0791.mo2117();
        c0791.f5030 = str;
        c0791.f5033 = C1687.m3717(str);
        return mo2135(c0791);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C0976 m2214() {
        int size = this.f5151.size();
        if (size > 0) {
            return this.f5151.get(size - 1);
        }
        return null;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean m2215(String str) {
        AbstractC0788 abstractC0788 = this.f5150;
        AbstractC0788.C0789 c0789 = this.f5152;
        if (abstractC0788 == c0789) {
            AbstractC0788.C0789 c07892 = new AbstractC0788.C0789();
            c07892.f5030 = str;
            c07892.f5033 = C1687.m3717(str);
            C0799 c0799 = (C0799) this;
            c0799.f5150 = c07892;
            return c0799.f5055.mo2183(c07892, c0799);
        }
        c0789.mo2117();
        c0789.f5030 = str;
        c0789.f5033 = C1687.m3717(str);
        C0799 c07992 = (C0799) this;
        c07992.f5150 = c0789;
        return c07992.f5055.mo2183(c0789, c07992);
    }
}
