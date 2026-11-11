package p015.p016.p020;

import p015.p016.p017.C0784;
import p015.p016.p020.C0958;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.びぐびあび.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0955 extends AbstractC0970 {
    public C0955(String str, String str2, String str3) {
        C1687.m3701(str);
        C1687.m3701(str2);
        C1687.m3701(str3);
        mo2281("name", str);
        mo2281("publicId", str2);
        if (!C0784.m2109(mo2278("publicId"))) {
            mo2281("pubSysKey", "PUBLIC");
        }
        mo2281("systemId", str3);
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public String mo2252() {
        return "#doctype";
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void mo2253(Appendable appendable, int i, C0958.C0960 c0960) {
        appendable.append((c0960.f5277 != C0958.C0960.EnumC0961.html || (C0784.m2109(mo2278("publicId")) ^ true) || (C0784.m2109(mo2278("systemId")) ^ true)) ? "<!DOCTYPE" : "<!doctype");
        if (!C0784.m2109(mo2278("name"))) {
            appendable.append(" ").append(mo2278("name"));
        }
        if (!C0784.m2109(mo2278("pubSysKey"))) {
            appendable.append(" ").append(mo2278("pubSysKey"));
        }
        if (!C0784.m2109(mo2278("publicId"))) {
            appendable.append(" \"").append(mo2278("publicId")).append('\"');
        }
        if (!C0784.m2109(mo2278("systemId"))) {
            appendable.append(" \"").append(mo2278("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // p015.p016.p020.AbstractC0974
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void mo2254(Appendable appendable, int i, C0958.C0960 c0960) {
    }
}
