package p015.p016.p020;

import java.io.IOException;
import p015.p016.C0783;
import p015.p016.p020.C0958;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0973 extends C0965 {
    public C0973(String str) {
        super(str);
    }

    @Override // p015.p016.p020.C0965, p015.p016.p020.AbstractC0974
    /* renamed from: ぇぬぎばつ */
    public String mo2252() {
        return "#cdata";
    }

    @Override // p015.p016.p020.C0965, p015.p016.p020.AbstractC0974
    /* renamed from: ざとぅぼこ〺 */
    public void mo2253(Appendable appendable, int i, C0958.C0960 c0960) {
        appendable.append("<![CDATA[").append(m2288());
    }

    @Override // p015.p016.p020.C0965, p015.p016.p020.AbstractC0974
    /* renamed from: は〲ぱなで */
    public void mo2254(Appendable appendable, int i, C0958.C0960 c0960) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new C0783(e);
        }
    }
}
