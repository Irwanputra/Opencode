package p015.p016.p020;

import p015.p016.p020.C0958;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0969 extends AbstractC0970 {
    public C0969(String str) {
        this.f5306 = str;
    }

    @Override // p015.p016.p020.AbstractC0974
    public String toString() {
        return mo2268();
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ぇぬぎばつ */
    public String mo2252() {
        return "#comment";
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ざとぅぼこ〺 */
    public void mo2253(Appendable appendable, int i, C0958.C0960 c0960) {
        if (c0960.f5282) {
            m2295(appendable, i, c0960);
        }
        appendable.append("<!--").append(m2288()).append("-->");
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: は〲ぱなで */
    public void mo2254(Appendable appendable, int i, C0958.C0960 c0960) {
    }
}
