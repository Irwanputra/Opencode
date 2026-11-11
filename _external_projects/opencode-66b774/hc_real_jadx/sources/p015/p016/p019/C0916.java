package p015.p016.p019;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p015.p016.p017.C0784;
import p015.p016.p018.C0832;
import p015.p016.p019.AbstractC0901;
import p015.p016.p019.AbstractC0909;
import p015.p016.p019.AbstractC0917;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0916 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f5244;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public List<AbstractC0917> f5245 = new ArrayList();

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C0832 f5246;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final String[] f5243 = {",", ">", "+", "~", " "};

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final String[] f5241 = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final Pattern f5242 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final Pattern f5240 = Pattern.compile("([+-])?(\\d+)");

    public C0916(String str) {
        this.f5244 = str;
        this.f5246 = new C0832(str);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static AbstractC0917 m2242(String str) {
        try {
            return new C0916(str).m2244();
        } catch (IllegalArgumentException e) {
            throw new C0912(e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int m2243() {
        String trim = this.f5246.m2219(")").trim();
        String[] strArr = C0784.f5013;
        boolean z = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (!Character.isDigit(trim.codePointAt(i))) {
                    break;
                }
                i++;
            }
        }
        if (z) {
            return Integer.parseInt(trim);
        }
        throw new IllegalArgumentException("Index must be numeric");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
    
        m2247();
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0041 -> B:5:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:4:0x0019). Please report as a decompilation issue!!! */
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p015.p016.p019.AbstractC0917 m2244() {
        /*
            r3 = this;
            いいにぽつ.〺つふすそ.づざかべべ.ぺぁあねじ r0 = r3.f5246
            r0.m2226()
            いいにぽつ.〺つふすそ.づざかべべ.ぺぁあねじ r0 = r3.f5246
            java.lang.String[] r1 = p015.p016.p019.C0916.f5243
            boolean r0 = r0.m2221(r1)
            if (r0 == 0) goto L23
            java.util.List<いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび> r0 = r3.f5245
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$ぁごぐすすぃ r1 = new いいにぽつ.〺つふすそ.なぎぱいぢぎ.〳ぜぞぜべっ$ぁごぐすすぃ
            r1.<init>()
            r0.add(r1)
        L19:
            いいにぽつ.〺つふすそ.づざかべべ.ぺぁあねじ r0 = r3.f5246
            char r0 = r0.m2222()
        L1f:
            r3.m2246(r0)
            goto L26
        L23:
            r3.m2247()
        L26:
            いいにぽつ.〺つふすそ.づざかべべ.ぺぁあねじ r0 = r3.f5246
            boolean r0 = r0.m2220()
            if (r0 != 0) goto L44
            いいにぽつ.〺つふすそ.づざかべべ.ぺぁあねじ r0 = r3.f5246
            boolean r0 = r0.m2226()
            いいにぽつ.〺つふすそ.づざかべべ.ぺぁあねじ r1 = r3.f5246
            java.lang.String[] r2 = p015.p016.p019.C0916.f5243
            boolean r1 = r1.m2221(r2)
            if (r1 == 0) goto L3f
            goto L19
        L3f:
            if (r0 == 0) goto L23
            r0 = 32
            goto L1f
        L44:
            java.util.List<いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび> r0 = r3.f5245
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L57
            java.util.List<いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび> r0 = r3.f5245
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび r0 = (p015.p016.p019.AbstractC0917) r0
            return r0
        L57:
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.〺つふすそ$げつ〴ぬぐ r0 = new いいにぽつ.〺つふすそ.なぎぱいぢぎ.〺つふすそ$げつ〴ぬぐ
            java.util.List<いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび> r1 = r3.f5245
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p019.C0916.m2244():いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m2245(boolean z) {
        List<AbstractC0917> list;
        AbstractC0917 c0951;
        this.f5246.m2227(z ? ":containsOwn" : ":contains");
        String m2217 = C0832.m2217(this.f5246.m2223('(', ')'));
        C1687.m3687(m2217, ":contains(text) query must not be empty");
        if (z) {
            list = this.f5245;
            c0951 = new AbstractC0917.C0945(m2217);
        } else {
            list = this.f5245;
            c0951 = new AbstractC0917.C0951(m2217);
        }
        list.add(c0951);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2246(char r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p019.C0916.m2246(char):void");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m2247() {
        List<AbstractC0917> list;
        AbstractC0917 c0928;
        List<AbstractC0917> list2;
        AbstractC0917 c0918;
        List<AbstractC0917> list3;
        AbstractC0917 c0919;
        if (this.f5246.m2218("#")) {
            String m2224 = this.f5246.m2224();
            C1687.m3654(m2224);
            this.f5245.add(new AbstractC0917.C0925(m2224));
            return;
        }
        if (this.f5246.m2218(".")) {
            String m22242 = this.f5246.m2224();
            C1687.m3654(m22242);
            this.f5245.add(new AbstractC0917.C0954(m22242.trim()));
            return;
        }
        if (this.f5246.m2229() || this.f5246.m2228("*|")) {
            C0832 c0832 = this.f5246;
            int i = c0832.f5159;
            while (!c0832.m2220() && (c0832.m2229() || c0832.m2221("*|", "|", "_", "-"))) {
                c0832.f5159++;
            }
            String substring = c0832.f5160.substring(i, c0832.f5159);
            C1687.m3654(substring);
            if (substring.startsWith("*|")) {
                this.f5245.add(new AbstractC0909.C0910(new AbstractC0917.C0932(C1687.m3689(substring)), new AbstractC0917.C0929(C1687.m3689(substring.replace("*|", ":")))));
                return;
            }
            if (substring.contains("|")) {
                substring = substring.replace("|", ":");
            }
            this.f5245.add(new AbstractC0917.C0932(substring.trim()));
            return;
        }
        if (this.f5246.m2228("[")) {
            C0832 c08322 = new C0832(this.f5246.m2223('[', ']'));
            String[] strArr = f5241;
            int i2 = c08322.f5159;
            while (!c08322.m2220() && !c08322.m2221(strArr)) {
                c08322.f5159++;
            }
            String substring2 = c08322.f5160.substring(i2, c08322.f5159);
            C1687.m3654(substring2);
            c08322.m2226();
            if (c08322.m2220()) {
                if (substring2.startsWith("^")) {
                    list3 = this.f5245;
                    c0919 = new AbstractC0917.C0948(substring2.substring(1));
                } else {
                    list3 = this.f5245;
                    c0919 = new AbstractC0917.C0919(substring2);
                }
                list3.add(c0919);
                return;
            }
            if (c08322.m2218("=")) {
                list2 = this.f5245;
                c0918 = new AbstractC0917.C0939(substring2, c08322.m2225());
            } else if (c08322.m2218("!=")) {
                list2 = this.f5245;
                c0918 = new AbstractC0917.C0952(substring2, c08322.m2225());
            } else if (c08322.m2218("^=")) {
                list2 = this.f5245;
                c0918 = new AbstractC0917.C0922(substring2, c08322.m2225());
            } else if (c08322.m2218("$=")) {
                list2 = this.f5245;
                c0918 = new AbstractC0917.C0921(substring2, c08322.m2225());
            } else if (c08322.m2218("*=")) {
                list2 = this.f5245;
                c0918 = new AbstractC0917.C0943(substring2, c08322.m2225());
            } else {
                if (!c08322.m2218("~=")) {
                    throw new C0912("Could not parse attribute query '%s': unexpected token at '%s'", this.f5244, c08322.m2225());
                }
                list2 = this.f5245;
                c0918 = new AbstractC0917.C0918(substring2, Pattern.compile(c08322.m2225()));
            }
            list2.add(c0918);
            return;
        }
        if (this.f5246.m2218("*")) {
            this.f5245.add(new AbstractC0917.C0933());
            return;
        }
        if (this.f5246.m2218(":lt(")) {
            this.f5245.add(new AbstractC0917.C0934(m2243()));
            return;
        }
        if (this.f5246.m2218(":gt(")) {
            this.f5245.add(new AbstractC0917.C0946(m2243()));
            return;
        }
        if (this.f5246.m2218(":eq(")) {
            this.f5245.add(new AbstractC0917.C0927(m2243()));
            return;
        }
        if (this.f5246.m2228(":has(")) {
            this.f5246.m2227(":has");
            String m2223 = this.f5246.m2223('(', ')');
            C1687.m3687(m2223, ":has(el) subselect must not be empty");
            this.f5245.add(new AbstractC0901.C0905(m2242(m2223)));
            return;
        }
        if (this.f5246.m2228(":contains(")) {
            m2245(false);
            return;
        }
        if (this.f5246.m2228(":containsOwn(")) {
            m2245(true);
            return;
        }
        if (this.f5246.m2228(":containsData(")) {
            this.f5246.m2227(":containsData");
            String m2217 = C0832.m2217(this.f5246.m2223('(', ')'));
            C1687.m3687(m2217, ":containsData(text) query must not be empty");
            this.f5245.add(new AbstractC0917.C0940(m2217));
            return;
        }
        if (this.f5246.m2228(":matches(")) {
            m2248(false);
            return;
        }
        if (this.f5246.m2228(":matchesOwn(")) {
            m2248(true);
            return;
        }
        if (this.f5246.m2228(":not(")) {
            this.f5246.m2227(":not");
            String m22232 = this.f5246.m2223('(', ')');
            C1687.m3687(m22232, ":not(selector) subselect must not be empty");
            this.f5245.add(new AbstractC0901.C0908(m2242(m22232)));
            return;
        }
        if (this.f5246.m2218(":nth-child(")) {
            m2249(false, false);
            return;
        }
        if (this.f5246.m2218(":nth-last-child(")) {
            m2249(true, false);
            return;
        }
        if (this.f5246.m2218(":nth-of-type(")) {
            m2249(false, true);
            return;
        }
        if (this.f5246.m2218(":nth-last-of-type(")) {
            m2249(true, true);
            return;
        }
        if (this.f5246.m2218(":first-child")) {
            list = this.f5245;
            c0928 = new AbstractC0917.C0941();
        } else if (this.f5246.m2218(":last-child")) {
            list = this.f5245;
            c0928 = new AbstractC0917.C0920();
        } else if (this.f5246.m2218(":first-of-type")) {
            list = this.f5245;
            c0928 = new AbstractC0917.C0949();
        } else if (this.f5246.m2218(":last-of-type")) {
            list = this.f5245;
            c0928 = new AbstractC0917.C0926();
        } else if (this.f5246.m2218(":only-child")) {
            list = this.f5245;
            c0928 = new AbstractC0917.C0923();
        } else if (this.f5246.m2218(":only-of-type")) {
            list = this.f5245;
            c0928 = new AbstractC0917.C0937();
        } else if (this.f5246.m2218(":empty")) {
            list = this.f5245;
            c0928 = new AbstractC0917.C0935();
        } else if (this.f5246.m2218(":root")) {
            list = this.f5245;
            c0928 = new AbstractC0917.C0953();
        } else {
            if (!this.f5246.m2218(":matchText")) {
                throw new C0912("Could not parse query '%s': unexpected token at '%s'", this.f5244, this.f5246.m2225());
            }
            list = this.f5245;
            c0928 = new AbstractC0917.C0928();
        }
        list.add(c0928);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m2248(boolean z) {
        List<AbstractC0917> list;
        AbstractC0917 c0938;
        this.f5246.m2227(z ? ":matchesOwn" : ":matches");
        String m2223 = this.f5246.m2223('(', ')');
        C1687.m3687(m2223, ":matches(regex) query must not be empty");
        if (z) {
            list = this.f5245;
            c0938 = new AbstractC0917.C0950(Pattern.compile(m2223));
        } else {
            list = this.f5245;
            c0938 = new AbstractC0917.C0938(Pattern.compile(m2223));
        }
        list.add(c0938);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0078  */
    /* renamed from: びぐびあび, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2249(boolean r9, boolean r10) {
        /*
            r8 = this;
            いいにぽつ.〺つふすそ.づざかべべ.ぺぁあねじ r0 = r8.f5246
            java.lang.String r1 = ")"
            java.lang.String r0 = r0.m2219(r1)
            java.lang.String r0 = p034.p095.C1687.m3689(r0)
            java.util.regex.Pattern r1 = p015.p016.p019.C0916.f5242
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = p015.p016.p019.C0916.f5240
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "odd"
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L26
            r0 = 1
        L24:
            r4 = 2
            goto L76
        L26:
            java.lang.String r3 = "even"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L30
            r0 = 0
            goto L24
        L30:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "^\\+"
            if (r3 == 0) goto L64
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L4d
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L4d:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L61
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L61:
            r0 = r4
            r4 = r5
            goto L76
        L64:
            boolean r1 = r2.matches()
            if (r1 == 0) goto L9f
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L76:
            if (r10 == 0) goto L8a
            if (r9 == 0) goto L82
            java.util.List<いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび> r9 = r8.f5245
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$なぶひせが r10 = new いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$なぶひせが
            r10.<init>(r4, r0)
            goto L9b
        L82:
            java.util.List<いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび> r9 = r8.f5245
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$どぇぞほだ r10 = new いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$どぇぞほだ
            r10.<init>(r4, r0)
            goto L9b
        L8a:
            if (r9 == 0) goto L94
            java.util.List<いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび> r9 = r8.f5245
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$びえぁぜい r10 = new いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$びえぁぜい
            r10.<init>(r4, r0)
            goto L9b
        L94:
            java.util.List<いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび> r9 = r8.f5245
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぇ〳〲〺すっ r10 = new いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぇ〳〲〺すっ
            r10.<init>(r4, r0)
        L9b:
            r9.add(r10)
            return
        L9f:
            いいにぽつ.〺つふすそ.なぎぱいぢぎ.ぁごぐすすぃ r9 = new いいにぽつ.〺つふすそ.なぎぱいぢぎ.ぁごぐすすぃ
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "Could not parse nth-index '%s': unexpected format"
            r9.<init>(r0, r10)
            goto Lac
        Lab:
            throw r9
        Lac:
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p019.C0916.m2249(boolean, boolean):void");
    }
}
