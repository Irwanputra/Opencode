package p015.p016.p020;

import p015.p016.p017.C0784;
import p015.p016.p020.C0958;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0965 extends AbstractC0970 {
    public C0965(String str) {
        this.f5306 = str;
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static boolean m2276(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // p015.p016.p020.AbstractC0974
    public String toString() {
        return mo2268();
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ぇぬぎばつ */
    public String mo2252() {
        return "#text";
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ざとぅぼこ〺 */
    public void mo2253(Appendable appendable, int i, C0958.C0960 c0960) {
        boolean z;
        if (c0960.f5282 && this.f5309 == 0) {
            AbstractC0974 abstractC0974 = this.f5308;
            if ((abstractC0974 instanceof C0976) && ((C0976) abstractC0974).f5317.f5067 && !C0784.m2109(m2288())) {
                m2295(appendable, i, c0960);
            }
        }
        if (c0960.f5282) {
            AbstractC0974 abstractC09742 = this.f5308;
            if ((abstractC09742 instanceof C0976) && !C0976.m2299(abstractC09742)) {
                z = true;
                C0962.m2273(appendable, m2288(), c0960, false, z, false);
            }
        }
        z = false;
        C0962.m2273(appendable, m2288(), c0960, false, z, false);
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: は〲ぱなで */
    public void mo2254(Appendable appendable, int i, C0958.C0960 c0960) {
    }
}
