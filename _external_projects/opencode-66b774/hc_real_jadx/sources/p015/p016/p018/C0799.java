package p015.p016.p018;

import java.util.ArrayList;
import java.util.List;
import org.jasypt.intf.cli.ArgumentNaming;
import p015.p016.p017.C0784;
import p015.p016.p018.AbstractC0788;
import p015.p016.p020.C0956;
import p015.p016.p020.C0965;
import p015.p016.p020.C0969;
import p015.p016.p020.C0971;
import p015.p016.p020.C0973;
import p015.p016.p020.C0976;
import p015.p016.p020.C0979;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;

/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0799 extends AbstractC0829 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public ArrayList<C0976> f5045;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public List<String> f5046;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C0979 f5047;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f5048;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public String[] f5049 = {null};

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public AbstractC0788.C0791 f5050;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public EnumC0802 f5051;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f5052;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f5053;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public C0976 f5054;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public EnumC0802 f5055;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final String[] f5041 = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final String[] f5044 = {"ol", "ul"};

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static final String[] f5038 = {"button"};

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static final String[] f5040 = {"html", "table"};

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final String[] f5039 = {"optgroup", "option"};

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static final String[] f5043 = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static final String[] f5042 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", ArgumentNaming.ARG_INPUT, "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    public String toString() {
        StringBuilder m4207 = C2098.m4207("TreeBuilder{currentToken=");
        m4207.append(this.f5150);
        m4207.append(", state=");
        m4207.append(this.f5055);
        m4207.append(", currentElement=");
        m4207.append(m2214());
        m4207.append('}');
        return m4207.toString();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m2134() {
        m2138("tbody", "tfoot", "thead", "template");
    }

    @Override // p015.p016.p018.AbstractC0829
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean mo2135(AbstractC0788 abstractC0788) {
        this.f5150 = abstractC0788;
        return this.f5055.mo2183(abstractC0788, this);
    }

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public void m2136() {
        EnumC0802 enumC0802;
        boolean z = false;
        for (int size = this.f5151.size() - 1; size >= 0; size--) {
            C0976 c0976 = this.f5151.get(size);
            if (size == 0) {
                c0976 = null;
                z = true;
            }
            String mo2252 = c0976.mo2252();
            if ("select".equals(mo2252)) {
                enumC0802 = EnumC0802.f5100;
            } else if ("td".equals(mo2252) || ("th".equals(mo2252) && !z)) {
                enumC0802 = EnumC0802.f5098;
            } else if ("tr".equals(mo2252)) {
                enumC0802 = EnumC0802.f5101;
            } else if ("tbody".equals(mo2252) || "thead".equals(mo2252) || "tfoot".equals(mo2252)) {
                enumC0802 = EnumC0802.f5114;
            } else if ("caption".equals(mo2252)) {
                enumC0802 = EnumC0802.f5107;
            } else if ("colgroup".equals(mo2252)) {
                enumC0802 = EnumC0802.f5110;
            } else if ("table".equals(mo2252)) {
                enumC0802 = EnumC0802.f5096;
            } else {
                if (!"head".equals(mo2252) && !"body".equals(mo2252)) {
                    if ("frameset".equals(mo2252)) {
                        enumC0802 = EnumC0802.f5103;
                    } else if ("html".equals(mo2252)) {
                        enumC0802 = EnumC0802.f5112;
                    } else if (!z) {
                    }
                }
                enumC0802 = EnumC0802.f5092;
            }
            this.f5055 = enumC0802;
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2137(p015.p016.p020.AbstractC0974 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "table"
            いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ r0 = r7.m2160(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ r3 = r0.f5308
            r4 = r3
            いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ r4 = (p015.p016.p020.C0976) r4
            if (r4 == 0) goto L15
            いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ r3 = (p015.p016.p020.C0976) r3
            r4 = 1
            goto L23
        L15:
            いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ r3 = r7.m2154(r0)
            goto L22
        L1a:
            java.util.ArrayList<いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ> r3 = r7.f5151
            java.lang.Object r3 = r3.get(r2)
            いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ r3 = (p015.p016.p020.C0976) r3
        L22:
            r4 = 0
        L23:
            if (r4 == 0) goto L72
            p034.p095.C1687.m3701(r0)
            p034.p095.C1687.m3701(r8)
            いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ r3 = r0.f5308
            p034.p095.C1687.m3701(r3)
            いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ r3 = r0.f5308
            int r0 = r0.f5309
            いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ[] r4 = new p015.p016.p020.AbstractC0974[r1]
            r4[r2] = r8
            r3.getClass()
            r8 = 0
        L3c:
            if (r8 >= r1) goto L4d
            r5 = r4[r8]
            if (r5 == 0) goto L45
            int r8 = r8 + 1
            goto L3c
        L45:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Array must not contain any null objects"
            r8.<init>(r0)
            throw r8
        L4d:
            java.util.List r8 = r3.mo2280()
        L51:
            if (r2 >= r1) goto L67
            r5 = r4[r2]
            r5.getClass()
            p034.p095.C1687.m3701(r3)
            いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ r6 = r5.f5308
            if (r6 == 0) goto L62
            r6.mo2294(r5)
        L62:
            r5.f5308 = r3
            int r2 = r2 + 1
            goto L51
        L67:
            java.util.List r1 = java.util.Arrays.asList(r4)
            r8.addAll(r0, r1)
            r3.m2292(r0)
            goto L75
        L72:
            r3.m2307(r8)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.C0799.m2137(いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ):void");
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m2138(String... strArr) {
        int size = this.f5151.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C0976 c0976 = this.f5151.get(size);
            if (C0784.m2110(c0976.mo2252(), strArr) || c0976.mo2252().equals("html")) {
                return;
            } else {
                this.f5151.remove(size);
            }
        }
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m2139(EnumC0802 enumC0802) {
        if (this.f5145.m2212()) {
            this.f5145.add(new C0831(this.f5148.m2207(), "Unexpected token [%s] when in state [%s]", this.f5150.getClass().getSimpleName(), enumC0802));
        }
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean m2140(C0976 c0976) {
        return m2159(this.f5151, c0976);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2141(p015.p016.p020.AbstractC0974 r2) {
        /*
            r1 = this;
            java.util.ArrayList<いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ> r0 = r1.f5151
            int r0 = r0.size()
            if (r0 != 0) goto Le
            いいにぽつ.〺つふすそ.びぐびあび.ぁごぐすすぃ r0 = r1.f5147
        La:
            r0.m2307(r2)
            goto L1b
        Le:
            boolean r0 = r1.f5048
            if (r0 == 0) goto L16
            r1.m2137(r2)
            goto L1b
        L16:
            いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ r0 = r1.m2214()
            goto La
        L1b:
            boolean r0 = r2 instanceof p015.p016.p020.C0976
            if (r0 == 0) goto L30
            いいにぽつ.〺つふすそ.びぐびあび.ぺぁあねじ r2 = (p015.p016.p020.C0976) r2
            いいにぽつ.〺つふすそ.づざかべべ.ぁごぐすすぃ r0 = r2.f5317
            boolean r0 = r0.f5064
            if (r0 == 0) goto L30
            いいにぽつ.〺つふすそ.びぐびあび.ぺふねづ〺 r0 = r1.f5047
            if (r0 == 0) goto L30
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.くし〴〺ぅ r0 = r0.f5320
            r0.add(r2)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.C0799.m2141(いいにぽつ.〺つふすそ.びぐびあび.へぬ〴づぞ):void");
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean m2142(String str) {
        for (int size = this.f5151.size() - 1; size >= 0; size--) {
            String mo2252 = this.f5151.get(size).mo2252();
            if (mo2252.equals(str)) {
                return true;
            }
            if (!C0784.m2107(mo2252, f5039)) {
                return false;
            }
        }
        throw new IllegalArgumentException("Should not be reachable");
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void m2143() {
        this.f5045.add(null);
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final boolean m2144(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f5151.size() - 1;
        int i = size > 100 ? size - 100 : 0;
        while (size >= i) {
            String mo2252 = this.f5151.get(size).mo2252();
            if (C0784.m2107(mo2252, strArr)) {
                return true;
            }
            if (C0784.m2107(mo2252, strArr2)) {
                return false;
            }
            if (strArr3 != null && C0784.m2107(mo2252, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public boolean m2145(AbstractC0788 abstractC0788, EnumC0802 enumC0802) {
        this.f5150 = abstractC0788;
        return enumC0802.mo2183(abstractC0788, this);
    }

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public boolean m2146(C0976 c0976) {
        for (int size = this.f5151.size() - 1; size >= 0; size--) {
            if (this.f5151.get(size) == c0976) {
                this.f5151.remove(size);
                return true;
            }
        }
        return false;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean m2147(String str) {
        String[] strArr = f5041;
        String[] strArr2 = this.f5049;
        strArr2[0] = str;
        return m2144(strArr2, strArr, null);
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public void m2148(C0976 c0976) {
        int size = this.f5045.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.f5045.get(size) != c0976);
        this.f5045.remove(size);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m2149(AbstractC0788.C0793 c0793) {
        String str = m2214().f5317.f5068;
        String str2 = c0793.f5022;
        m2214().m2307(c0793 instanceof AbstractC0788.C0790 ? new C0973(str2) : (str.equals("script") || str.equals("style")) ? new C0971(str2) : new C0965(str2));
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m2150(AbstractC0788.C0797 c0797) {
        m2141(new C0969(c0797.f5028.toString()));
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean m2151(String str) {
        String[] strArr = f5040;
        String[] strArr2 = this.f5049;
        strArr2[0] = str;
        return m2144(strArr2, strArr, null);
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public C0976 m2152() {
        return this.f5151.remove(this.f5151.size() - 1);
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public void m2153(C0976 c0976) {
        int size = this.f5045.size() - 1;
        int i = 0;
        while (true) {
            if (size >= 0) {
                C0976 c09762 = this.f5045.get(size);
                if (c09762 == null) {
                    break;
                }
                if (c0976.mo2252().equals(c09762.mo2252()) && c0976.mo2287().equals(c09762.mo2287())) {
                    i++;
                }
                if (i == 3) {
                    this.f5045.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.f5045.add(c0976);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C0976 m2154(C0976 c0976) {
        for (int size = this.f5151.size() - 1; size >= 0; size--) {
            if (this.f5151.get(size) == c0976) {
                return this.f5151.get(size - 1);
            }
        }
        return null;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C0976 m2155(String str) {
        for (int size = this.f5045.size() - 1; size >= 0; size--) {
            C0976 c0976 = this.f5045.get(size);
            if (c0976 == null) {
                return null;
            }
            if (c0976.mo2252().equals(str)) {
                return c0976;
            }
        }
        return null;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public C0976 m2156(AbstractC0788.C0789 c0789) {
        C0800 m2169 = C0800.m2169(c0789.m2125(), this.f5143);
        C0976 c0976 = new C0976(m2169, this.f5149, c0789.f5032);
        m2141(c0976);
        if (c0789.f5037) {
            if (!C0800.f5056.containsKey(m2169.f5068)) {
                m2169.f5070 = true;
            } else if (!m2169.f5069) {
                this.f5144.m2179("Tag cannot be self closing; not a void tag");
            }
        }
        return c0976;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public boolean m2157(C0976 c0976) {
        return C0784.m2107(c0976.mo2252(), f5042);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m2158() {
        while (!this.f5045.isEmpty()) {
            int size = this.f5045.size();
            if ((size > 0 ? this.f5045.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final boolean m2159(ArrayList<C0976> arrayList, C0976 c0976) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == c0976) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C0976 m2160(String str) {
        C0976 c0976;
        int size = this.f5151.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            c0976 = this.f5151.get(size);
        } while (!c0976.mo2252().equals(str));
        return c0976;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public C0976 m2161(AbstractC0788.C0789 c0789) {
        if (c0789.f5037) {
            C0976 m2156 = m2156(c0789);
            this.f5151.add(m2156);
            C0801 c0801 = this.f5144;
            c0801.f5082 = EnumC0833.f5165;
            AbstractC0788.C0791 c0791 = this.f5050;
            c0791.mo2117();
            c0791.m2126(m2156.f5317.f5068);
            c0801.m2177(c0791);
            return m2156;
        }
        C0800 m2169 = C0800.m2169(c0789.m2125(), this.f5143);
        String str = this.f5149;
        C0830 c0830 = this.f5143;
        C0956 c0956 = c0789.f5032;
        if (!c0830.f5155) {
            for (int i = 0; i < c0956.f5266; i++) {
                String[] strArr = c0956.f5267;
                strArr[i] = C1687.m3717(strArr[i]);
            }
        }
        C0976 c0976 = new C0976(m2169, str, c0956);
        m2141(c0976);
        this.f5151.add(c0976);
        return c0976;
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public C0976 m2162(String str) {
        C0976 c0976 = new C0976(C0800.m2169(str, this.f5143), this.f5149, null);
        m2141(c0976);
        this.f5151.add(c0976);
        return c0976;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public C0979 m2163(AbstractC0788.C0789 c0789, boolean z) {
        C0979 c0979 = new C0979(C0800.m2169(c0789.m2125(), this.f5143), this.f5149, c0789.f5032);
        this.f5047 = c0979;
        m2141(c0979);
        if (z) {
            this.f5151.add(c0979);
        }
        return c0979;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public void m2164() {
        C0976 c0976;
        if (this.f5045.size() > 0) {
            c0976 = this.f5045.get(r0.size() - 1);
        } else {
            c0976 = null;
        }
        if (c0976 == null || m2159(this.f5151, c0976)) {
            return;
        }
        boolean z = true;
        int size = this.f5045.size() - 1;
        int i = size;
        while (i != 0) {
            i--;
            c0976 = this.f5045.get(i);
            if (c0976 == null || m2159(this.f5151, c0976)) {
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i++;
                c0976 = this.f5045.get(i);
            }
            C1687.m3701(c0976);
            C0976 m2162 = m2162(c0976.mo2252());
            m2162.mo2287().m2257(c0976.mo2287());
            this.f5045.set(i, m2162);
            if (i == size) {
                return;
            } else {
                z = false;
            }
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean m2165(String str) {
        String[] strArr = f5038;
        String[] strArr2 = f5041;
        String[] strArr3 = this.f5049;
        strArr3[0] = str;
        return m2144(strArr3, strArr2, strArr);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m2166() {
        m2138("table");
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public void m2167(String str) {
        for (int size = this.f5151.size() - 1; size >= 0; size--) {
            C0976 c0976 = this.f5151.get(size);
            this.f5151.remove(size);
            if (c0976.mo2252().equals(str)) {
                return;
            }
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m2168(String str) {
        while (str != null && !m2214().mo2252().equals(str) && C0784.m2107(m2214().mo2252(), f5043)) {
            m2152();
        }
    }
}
