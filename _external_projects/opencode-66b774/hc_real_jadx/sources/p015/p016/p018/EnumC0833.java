package p015.p016.p018;

import java.util.Locale;
import p015.p016.p018.AbstractC0788;
import p131.p155.p156.p157.C2098;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class EnumC0833 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final EnumC0833 f5165 = new C0900("Data", 0);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final EnumC0833 f5190 = new EnumC0833("CharacterReferenceInData", 1) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.でどあくず
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2232(c0801, EnumC0833.f5165);
        }
    };

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final EnumC0833 f5223 = new EnumC0833("Rcdata", 2) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぉひのべい
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            char m2196 = c0827.m2196();
            if (m2196 == 0) {
                c0801.m2173(this);
                c0827.m2200();
                c0801.m2178((char) 65533);
                return;
            }
            if (m2196 == '&') {
                enumC0833 = EnumC0833.f5206;
            } else {
                if (m2196 != '<') {
                    if (m2196 != 65535) {
                        c0801.m2176(c0827.m2195('&', '<', 0));
                        return;
                    } else {
                        c0801.m2177(new AbstractC0788.C0796());
                        return;
                    }
                }
                enumC0833 = EnumC0833.f5208;
            }
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final EnumC0833 f5206 = new EnumC0833("CharacterReferenceInRcdata", 3) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ち〴みぎ〻び
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2232(c0801, EnumC0833.f5223);
        }
    };

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final EnumC0833 f5213 = new EnumC0833("Rawtext", 4) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.かづげぃぁ〺
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2230(c0801, c0827, this, EnumC0833.f5184);
        }
    };

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final EnumC0833 f5168 = new EnumC0833("ScriptData", 5) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.びちづぼぬ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2230(c0801, c0827, this, EnumC0833.f5198);
        }
    };

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final EnumC0833 f5163 = new EnumC0833("PLAINTEXT", 6) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぉねぞはがぞ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            char m2196 = c0827.m2196();
            if (m2196 == 0) {
                c0801.m2173(this);
                c0827.m2200();
                c0801.m2178((char) 65533);
            } else if (m2196 != 65535) {
                c0801.m2176(c0827.m2205((char) 0));
            } else {
                c0801.m2177(new AbstractC0788.C0796());
            }
        }
    };

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final EnumC0833 f5230 = new EnumC0833("TagOpen", 7) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.にぢ〱ぁな
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332;
            char m2196 = c0827.m2196();
            if (m2196 == '!') {
                enumC0833 = EnumC0833.f5178;
            } else if (m2196 == '/') {
                enumC0833 = EnumC0833.f5171;
            } else {
                if (m2196 != '?') {
                    if (c0827.m2198()) {
                        c0801.m2174(true);
                        enumC08332 = EnumC0833.f5233;
                    } else {
                        c0801.m2173(this);
                        c0801.m2178('<');
                        enumC08332 = EnumC0833.f5165;
                    }
                    c0801.f5082 = enumC08332;
                    return;
                }
                enumC0833 = EnumC0833.f5205;
            }
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final EnumC0833 f5171 = new EnumC0833("EndTagOpen", 8) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.しぷげへが
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            if (c0827.m2211()) {
                c0801.m2170(this);
                c0801.m2176("</");
                c0801.f5082 = enumC0833;
            } else {
                if (c0827.m2198()) {
                    c0801.m2174(false);
                    c0801.f5082 = EnumC0833.f5233;
                    return;
                }
                boolean m2199 = c0827.m2199('>');
                c0801.m2173(this);
                if (m2199) {
                    c0801.f5083.m2200();
                    c0801.f5082 = enumC0833;
                } else {
                    EnumC0833 enumC08332 = EnumC0833.f5205;
                    c0801.f5083.m2200();
                    c0801.f5082 = enumC08332;
                }
            }
        }
    };

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final EnumC0833 f5233 = new EnumC0833("TagName", 9) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.げつ〴ぬぐ
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            r1 = p015.p016.p018.C0827.m2192(r15.f5138, r15.f5134, r1, r4 - r1);
         */
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo2235(p015.p016.p018.C0801 r14, p015.p016.p018.C0827 r15) {
            /*
                r13 = this;
                いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺 r0 = p015.p016.p018.EnumC0833.f5165
                r15.m2194()
                int r1 = r15.f5139
                int r2 = r15.f5137
                char[] r3 = r15.f5138
            Lb:
                int r4 = r15.f5139
                r5 = 62
                r6 = 47
                r7 = 32
                r8 = 12
                r9 = 13
                r10 = 10
                r11 = 9
                if (r4 >= r2) goto L35
                char r12 = r3[r4]
                if (r12 == r11) goto L35
                if (r12 == r10) goto L35
                if (r12 == r9) goto L35
                if (r12 == r8) goto L35
                if (r12 == r7) goto L35
                if (r12 == r6) goto L35
                if (r12 == r5) goto L35
                if (r12 != 0) goto L30
                goto L35
            L30:
                int r4 = r4 + 1
                r15.f5139 = r4
                goto Lb
            L35:
                if (r4 <= r1) goto L41
                char[] r2 = r15.f5138
                java.lang.String[] r3 = r15.f5134
                int r4 = r4 - r1
                java.lang.String r1 = p015.p016.p018.C0827.m2192(r2, r3, r1, r4)
                goto L43
            L41:
                java.lang.String r1 = ""
            L43:
                いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$ぺぁあねじ r2 = r14.f5090
                r2.m2131(r1)
                char r15 = r15.m2208()
                if (r15 == 0) goto L79
                if (r15 == r7) goto L76
                if (r15 == r6) goto L71
                if (r15 == r5) goto L6d
                r1 = 65535(0xffff, float:9.1834E-41)
                if (r15 == r1) goto L67
                if (r15 == r11) goto L76
                if (r15 == r10) goto L76
                if (r15 == r8) goto L76
                if (r15 == r9) goto L76
                いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$ぺぁあねじ r14 = r14.f5090
                r14.m2130(r15)
                goto L80
            L67:
                r14.m2170(r13)
            L6a:
                r14.f5082 = r0
                goto L80
            L6d:
                r14.m2172()
                goto L6a
            L71:
                いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺 r15 = p015.p016.p018.EnumC0833.f5207
            L73:
                r14.f5082 = r15
                goto L80
            L76:
                いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺 r15 = p015.p016.p018.EnumC0833.f5226
                goto L73
            L79:
                いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$ぺぁあねじ r14 = r14.f5090
                java.lang.String r15 = p015.p016.p018.EnumC0833.f5186
                r14.m2131(r15)
            L80:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.EnumC0833.C0864.mo2235(いいにぽつ.〺つふすそ.づざかべべ.いいにぽつ, いいにぽつ.〺つふすそ.づざかべべ.げつ〴ぬぐ):void");
        }
    };

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final EnumC0833 f5208 = new EnumC0833("RcdataLessthanSign", 10) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.〺つふすそ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            if (c0827.m2199('/')) {
                AbstractC0788.m2115(c0801.f5075);
                EnumC0833 enumC08332 = EnumC0833.f5218;
                c0801.f5083.m2200();
                c0801.f5082 = enumC08332;
                return;
            }
            if (c0827.m2198() && c0801.f5081 != null) {
                StringBuilder m4207 = C2098.m4207("</");
                m4207.append(c0801.f5081);
                String sb = m4207.toString();
                Locale locale = Locale.ENGLISH;
                if (!(c0827.m2202(sb.toLowerCase(locale)) > -1 || c0827.m2202(sb.toUpperCase(locale)) > -1)) {
                    AbstractC0788.AbstractC0798 m2174 = c0801.m2174(false);
                    m2174.m2126(c0801.f5081);
                    c0801.f5090 = m2174;
                    c0801.m2172();
                    c0827.m2201();
                    enumC0833 = EnumC0833.f5165;
                    c0801.f5082 = enumC0833;
                }
            }
            c0801.m2176("<");
            enumC0833 = EnumC0833.f5223;
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final EnumC0833 f5218 = new EnumC0833("RCDATAEndTagOpen", 11) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.くし〴〺ぅ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            if (!c0827.m2198()) {
                c0801.m2176("</");
                c0801.f5082 = EnumC0833.f5223;
                return;
            }
            c0801.m2174(false);
            c0801.f5090.m2130(c0827.m2196());
            c0801.f5075.append(c0827.m2196());
            EnumC0833 enumC0833 = EnumC0833.f5228;
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final EnumC0833 f5228 = new EnumC0833("RCDATAEndTagName", 12) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.びぐびあび
        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final void m2236(C0801 c0801, C0827 c0827) {
            StringBuilder m4207 = C2098.m4207("</");
            m4207.append(c0801.f5075.toString());
            c0801.m2176(m4207.toString());
            c0827.m2201();
            c0801.f5082 = EnumC0833.f5223;
        }

        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            if (c0827.m2198()) {
                String m2203 = c0827.m2203();
                c0801.f5090.m2131(m2203);
                c0801.f5075.append(m2203);
                return;
            }
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                if (c0801.m2180()) {
                    enumC0833 = EnumC0833.f5226;
                    c0801.f5082 = enumC0833;
                    return;
                }
                m2236(c0801, c0827);
            }
            if (m2208 == '/') {
                if (c0801.m2180()) {
                    enumC0833 = EnumC0833.f5207;
                    c0801.f5082 = enumC0833;
                    return;
                }
                m2236(c0801, c0827);
            }
            if (m2208 == '>' && c0801.m2180()) {
                c0801.m2172();
                enumC0833 = EnumC0833.f5165;
                c0801.f5082 = enumC0833;
                return;
            }
            m2236(c0801, c0827);
        }
    };

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final EnumC0833 f5184 = new EnumC0833("RawtextLessthanSign", 13) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.づざかべべ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            if (!c0827.m2199('/')) {
                c0801.m2178('<');
                c0801.f5082 = EnumC0833.f5213;
            } else {
                AbstractC0788.m2115(c0801.f5075);
                EnumC0833 enumC0833 = EnumC0833.f5177;
                c0801.f5083.m2200();
                c0801.f5082 = enumC0833;
            }
        }
    };

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final EnumC0833 f5177 = new EnumC0833("RawtextEndTagOpen", 14) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.なぎぱいぢぎ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2231(c0801, c0827, EnumC0833.f5180, EnumC0833.f5213);
        }
    };

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final EnumC0833 f5180 = new EnumC0833("RawtextEndTagName", 15) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぁごぐすすぃ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2234(c0801, c0827, EnumC0833.f5213);
        }
    };

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final EnumC0833 f5198 = new EnumC0833("ScriptDataLessthanSign", 16) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.〳ぜぞぜべっ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            char m2208 = c0827.m2208();
            if (m2208 == '!') {
                c0801.m2176("<!");
                enumC0833 = EnumC0833.f5197;
            } else if (m2208 != '/') {
                c0801.m2176("<");
                c0827.m2201();
                enumC0833 = EnumC0833.f5168;
            } else {
                AbstractC0788.m2115(c0801.f5075);
                enumC0833 = EnumC0833.f5219;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final EnumC0833 f5219 = new EnumC0833("ScriptDataEndTagOpen", 17) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぺぁあねじ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2231(c0801, c0827, EnumC0833.f5195, EnumC0833.f5168);
        }
    };

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static final EnumC0833 f5195 = new EnumC0833("ScriptDataEndTagName", 18) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.いいにぽつ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2234(c0801, c0827, EnumC0833.f5168);
        }
    };

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static final EnumC0833 f5197 = new EnumC0833("ScriptDataEscapeStart", 19) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.てぜきぽく
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            if (!c0827.m2199('-')) {
                c0801.f5082 = EnumC0833.f5168;
                return;
            }
            c0801.m2178('-');
            EnumC0833 enumC0833 = EnumC0833.f5209;
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final EnumC0833 f5209 = new EnumC0833("ScriptDataEscapeStartDash", 20) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.のぷのちつ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            if (!c0827.m2199('-')) {
                c0801.f5082 = EnumC0833.f5168;
                return;
            }
            c0801.m2178('-');
            EnumC0833 enumC0833 = EnumC0833.f5179;
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public static final EnumC0833 f5225 = new EnumC0833("ScriptDataEscaped", 21) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.へぬ〴づぞ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            if (c0827.m2211()) {
                c0801.m2170(this);
                c0801.f5082 = EnumC0833.f5165;
                return;
            }
            char m2196 = c0827.m2196();
            if (m2196 == 0) {
                c0801.m2173(this);
                c0827.m2200();
                c0801.m2178((char) 65533);
                return;
            }
            if (m2196 == '-') {
                c0801.m2178('-');
                enumC0833 = EnumC0833.f5167;
            } else {
                if (m2196 != '<') {
                    c0801.m2176(c0827.m2195('-', '<', 0));
                    return;
                }
                enumC0833 = EnumC0833.f5174;
            }
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public static final EnumC0833 f5167 = new EnumC0833("ScriptDataEscapedDash", 22) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.おぐぴう〸ず
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5225;
            if (c0827.m2211()) {
                c0801.m2170(this);
                c0801.f5082 = EnumC0833.f5165;
                return;
            }
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '-') {
                    c0801.m2178(m2208);
                    enumC0833 = EnumC0833.f5179;
                } else if (m2208 == '<') {
                    enumC0833 = EnumC0833.f5174;
                }
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            m2208 = 65533;
            c0801.m2178(m2208);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public static final EnumC0833 f5179 = new EnumC0833("ScriptDataEscapedDashDash", 23) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぇぬぎばつ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5225;
            if (c0827.m2211()) {
                c0801.m2170(this);
                c0801.f5082 = EnumC0833.f5165;
                return;
            }
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '-') {
                    c0801.m2178(m2208);
                    return;
                }
                if (m2208 != '<') {
                    c0801.m2178(m2208);
                    if (m2208 == '>') {
                        enumC0833 = EnumC0833.f5168;
                    }
                } else {
                    enumC0833 = EnumC0833.f5174;
                }
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            c0801.m2178((char) 65533);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final EnumC0833 f5174 = new EnumC0833("ScriptDataEscapedLessthanSign", 24) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぉざぅち〻
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            if (c0827.m2198()) {
                AbstractC0788.m2115(c0801.f5075);
                c0801.f5075.append(c0827.m2196());
                c0801.m2176("<" + c0827.m2196());
                enumC0833 = EnumC0833.f5210;
            } else if (!c0827.m2199('/')) {
                c0801.m2178('<');
                c0801.f5082 = EnumC0833.f5225;
                return;
            } else {
                AbstractC0788.m2115(c0801.f5075);
                enumC0833 = EnumC0833.f5222;
            }
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static final EnumC0833 f5222 = new EnumC0833("ScriptDataEscapedEndTagOpen", 25) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ざとぅぼこ〺
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            if (!c0827.m2198()) {
                c0801.m2176("</");
                c0801.f5082 = EnumC0833.f5225;
                return;
            }
            c0801.m2174(false);
            c0801.f5090.m2130(c0827.m2196());
            c0801.f5075.append(c0827.m2196());
            EnumC0833 enumC0833 = EnumC0833.f5214;
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static final EnumC0833 f5214 = new EnumC0833("ScriptDataEscapedEndTagName", 26) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.は〲ぱなで
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2234(c0801, c0827, EnumC0833.f5225);
        }
    };

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static final EnumC0833 f5210 = new EnumC0833("ScriptDataDoubleEscapeStart", 27) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ごづごきえ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2233(c0801, c0827, EnumC0833.f5173, EnumC0833.f5225);
        }
    };

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static final EnumC0833 f5173 = new EnumC0833("ScriptDataDoubleEscaped", 28) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ざっざへづ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            char m2196 = c0827.m2196();
            if (m2196 == 0) {
                c0801.m2173(this);
                c0827.m2200();
                c0801.m2178((char) 65533);
                return;
            }
            if (m2196 == '-') {
                c0801.m2178(m2196);
                enumC0833 = EnumC0833.f5201;
            } else {
                if (m2196 != '<') {
                    if (m2196 != 65535) {
                        c0801.m2176(c0827.m2195('-', '<', 0));
                        return;
                    } else {
                        c0801.m2170(this);
                        c0801.f5082 = EnumC0833.f5165;
                        return;
                    }
                }
                c0801.m2178(m2196);
                enumC0833 = EnumC0833.f5182;
            }
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public static final EnumC0833 f5201 = new EnumC0833("ScriptDataDoubleEscapedDash", 29) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぶでにく〼〳
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5173;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '-') {
                    c0801.m2178(m2208);
                    enumC0833 = EnumC0833.f5232;
                } else if (m2208 == '<') {
                    c0801.m2178(m2208);
                    enumC0833 = EnumC0833.f5182;
                } else if (m2208 == 65535) {
                    c0801.m2170(this);
                    enumC0833 = EnumC0833.f5165;
                }
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            m2208 = 65533;
            c0801.m2178(m2208);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public static final EnumC0833 f5232 = new EnumC0833("ScriptDataDoubleEscapedDashDash", 30) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.〻ぞまぎな〻
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5173;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '-') {
                    c0801.m2178(m2208);
                    return;
                }
                if (m2208 == '<') {
                    c0801.m2178(m2208);
                    enumC0833 = EnumC0833.f5182;
                } else if (m2208 == '>') {
                    c0801.m2178(m2208);
                    enumC0833 = EnumC0833.f5168;
                } else if (m2208 == 65535) {
                    c0801.m2170(this);
                    enumC0833 = EnumC0833.f5165;
                }
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            m2208 = 65533;
            c0801.m2178(m2208);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public static final EnumC0833 f5182 = new EnumC0833("ScriptDataDoubleEscapedLessthanSign", 31) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぉ〲なぱぽた
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            if (!c0827.m2199('/')) {
                c0801.f5082 = EnumC0833.f5173;
                return;
            }
            c0801.m2178('/');
            AbstractC0788.m2115(c0801.f5075);
            EnumC0833 enumC0833 = EnumC0833.f5204;
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public static final EnumC0833 f5204 = new EnumC0833("ScriptDataDoubleEscapeEnd", 32) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぇ〳〲〺すっ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833.m2233(c0801, c0827, EnumC0833.f5225, EnumC0833.f5173);
        }
    };

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static final EnumC0833 f5226 = new EnumC0833("BeforeAttributeName", 33) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.びえぁぜい
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            EnumC0833 enumC08332 = EnumC0833.f5192;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 != ' ') {
                    if (m2208 != '\"' && m2208 != '\'') {
                        if (m2208 == '/') {
                            c0801.f5082 = EnumC0833.f5207;
                            return;
                        }
                        if (m2208 != 65535) {
                            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r') {
                                return;
                            }
                            switch (m2208) {
                                case '>':
                                    c0801.m2172();
                                    break;
                            }
                            return;
                        }
                        c0801.m2170(this);
                        c0801.f5082 = enumC0833;
                        return;
                    }
                    c0801.m2173(this);
                    c0801.f5090.m2128();
                    c0801.f5090.m2132(m2208);
                    c0801.f5082 = enumC08332;
                }
                return;
            }
            c0801.m2173(this);
            c0801.f5090.m2128();
            c0827.m2201();
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static final EnumC0833 f5192 = new EnumC0833("AttributeName", 34) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.なぶひせが
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            AbstractC0788.AbstractC0798 abstractC0798;
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            String m2193 = c0827.m2193(EnumC0833.f5172);
            AbstractC0788.AbstractC0798 abstractC07982 = c0801.f5090;
            String str = abstractC07982.f5036;
            if (str != null) {
                m2193 = str.concat(m2193);
            }
            abstractC07982.f5036 = m2193;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 != ' ') {
                    if (m2208 != '\"' && m2208 != '\'') {
                        if (m2208 != '/') {
                            if (m2208 == 65535) {
                                c0801.m2170(this);
                            } else if (m2208 != '\t' && m2208 != '\n' && m2208 != '\f' && m2208 != '\r') {
                                switch (m2208) {
                                    case '<':
                                        break;
                                    case '=':
                                        enumC0833 = EnumC0833.f5166;
                                        break;
                                    case '>':
                                        c0801.m2172();
                                        break;
                                    default:
                                        abstractC0798 = c0801.f5090;
                                        break;
                                }
                            }
                            c0801.f5082 = enumC08332;
                            return;
                        }
                        enumC0833 = EnumC0833.f5207;
                        c0801.f5082 = enumC0833;
                        return;
                    }
                    c0801.m2173(this);
                    abstractC0798 = c0801.f5090;
                }
                enumC0833 = EnumC0833.f5183;
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            abstractC0798 = c0801.f5090;
            m2208 = 65533;
            abstractC0798.m2132(m2208);
        }
    };

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static final EnumC0833 f5183 = new EnumC0833("AfterAttributeName", 35) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.どぇぞほだ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            EnumC0833 enumC08333 = EnumC0833.f5192;
            char m2208 = c0827.m2208();
            if (m2208 == 0) {
                c0801.m2173(this);
                c0801.f5090.m2132((char) 65533);
            } else {
                if (m2208 == ' ') {
                    return;
                }
                if (m2208 != '\"' && m2208 != '\'') {
                    if (m2208 != '/') {
                        if (m2208 != 65535) {
                            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r') {
                                return;
                            }
                            switch (m2208) {
                                case '<':
                                    break;
                                case '=':
                                    enumC0833 = EnumC0833.f5166;
                                    break;
                                case '>':
                                    c0801.m2172();
                                    break;
                                default:
                                    c0801.f5090.m2128();
                                    c0827.m2201();
                                    break;
                            }
                            return;
                        }
                        c0801.m2170(this);
                        c0801.f5082 = enumC08332;
                        return;
                    }
                    enumC0833 = EnumC0833.f5207;
                    c0801.f5082 = enumC0833;
                    return;
                }
                c0801.m2173(this);
                c0801.f5090.m2128();
                c0801.f5090.m2132(m2208);
            }
            c0801.f5082 = enumC08333;
        }
    };

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static final EnumC0833 f5166 = new EnumC0833("BeforeAttributeValue", 36) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぅみぱぎぎ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            EnumC0833 enumC08333 = EnumC0833.f5212;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 != ' ') {
                    if (m2208 != '\"') {
                        if (m2208 != '`') {
                            if (m2208 == 65535) {
                                c0801.m2170(this);
                            } else {
                                if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r') {
                                    return;
                                }
                                if (m2208 != '&') {
                                    if (m2208 != '\'') {
                                        switch (m2208) {
                                            case '>':
                                                c0801.m2173(this);
                                                break;
                                        }
                                        return;
                                    }
                                    enumC0833 = EnumC0833.f5193;
                                }
                                c0827.m2201();
                            }
                            c0801.m2172();
                            c0801.f5082 = enumC08332;
                            return;
                        }
                        c0801.m2173(this);
                        c0801.f5090.m2124(m2208);
                    } else {
                        enumC0833 = EnumC0833.f5176;
                    }
                    c0801.f5082 = enumC0833;
                    return;
                }
                return;
            }
            c0801.m2173(this);
            c0801.f5090.m2124((char) 65533);
            c0801.f5082 = enumC08333;
        }
    };

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public static final EnumC0833 f5176 = new EnumC0833("AttributeValue_doubleQuoted", 37) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.じぜこほぱ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            AbstractC0788.AbstractC0798 abstractC0798;
            EnumC0833 enumC0833;
            String m2195 = c0827.m2195(EnumC0833.f5227);
            if (m2195.length() > 0) {
                c0801.f5090.m2133(m2195);
            } else {
                c0801.f5090.f5031 = true;
            }
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '\"') {
                    enumC0833 = EnumC0833.f5170;
                } else {
                    if (m2208 == '&') {
                        int[] m2171 = c0801.m2171('\"', true);
                        AbstractC0788.AbstractC0798 abstractC07982 = c0801.f5090;
                        if (m2171 != null) {
                            abstractC07982.m2129(m2171);
                            return;
                        } else {
                            abstractC07982.m2124('&');
                            return;
                        }
                    }
                    if (m2208 != 65535) {
                        abstractC0798 = c0801.f5090;
                    } else {
                        c0801.m2170(this);
                        enumC0833 = EnumC0833.f5165;
                    }
                }
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            abstractC0798 = c0801.f5090;
            m2208 = 65533;
            abstractC0798.m2124(m2208);
        }
    };

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public static final EnumC0833 f5193 = new EnumC0833("AttributeValue_singleQuoted", 38) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぺづげぺが
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            AbstractC0788.AbstractC0798 abstractC0798;
            EnumC0833 enumC0833;
            String m2195 = c0827.m2195(EnumC0833.f5169);
            if (m2195.length() > 0) {
                c0801.f5090.m2133(m2195);
            } else {
                c0801.f5090.f5031 = true;
            }
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == 65535) {
                    c0801.m2170(this);
                    enumC0833 = EnumC0833.f5165;
                } else {
                    if (m2208 == '&') {
                        int[] m2171 = c0801.m2171('\'', true);
                        AbstractC0788.AbstractC0798 abstractC07982 = c0801.f5090;
                        if (m2171 != null) {
                            abstractC07982.m2129(m2171);
                            return;
                        } else {
                            abstractC07982.m2124('&');
                            return;
                        }
                    }
                    if (m2208 != '\'') {
                        abstractC0798 = c0801.f5090;
                    } else {
                        enumC0833 = EnumC0833.f5170;
                    }
                }
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            abstractC0798 = c0801.f5090;
            m2208 = 65533;
            abstractC0798.m2124(m2208);
        }
    };

    /* renamed from: ながふずは, reason: contains not printable characters */
    public static final EnumC0833 f5212 = new EnumC0833("AttributeValue_unquoted", 39) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.せづっ〸ちね
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            AbstractC0788.AbstractC0798 abstractC0798;
            EnumC0833 enumC0833 = EnumC0833.f5165;
            String m2193 = c0827.m2193(EnumC0833.f5203);
            if (m2193.length() > 0) {
                c0801.f5090.m2133(m2193);
            }
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 != ' ') {
                    if (m2208 != '\"' && m2208 != '`') {
                        if (m2208 == 65535) {
                            c0801.m2170(this);
                        } else if (m2208 != '\t' && m2208 != '\n' && m2208 != '\f' && m2208 != '\r') {
                            if (m2208 == '&') {
                                int[] m2171 = c0801.m2171('>', true);
                                AbstractC0788.AbstractC0798 abstractC07982 = c0801.f5090;
                                if (m2171 != null) {
                                    abstractC07982.m2129(m2171);
                                    return;
                                } else {
                                    abstractC07982.m2124('&');
                                    return;
                                }
                            }
                            if (m2208 != '\'') {
                                switch (m2208) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        c0801.m2172();
                                        break;
                                    default:
                                        abstractC0798 = c0801.f5090;
                                        break;
                                }
                            }
                        }
                        c0801.f5082 = enumC0833;
                        return;
                    }
                    c0801.m2173(this);
                    abstractC0798 = c0801.f5090;
                }
                c0801.f5082 = EnumC0833.f5226;
                return;
            }
            c0801.m2173(this);
            abstractC0798 = c0801.f5090;
            m2208 = 65533;
            abstractC0798.m2124(m2208);
        }
    };

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public static final EnumC0833 f5170 = new EnumC0833("AfterAttributeValue_quoted", 40) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぷぞてのほき
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            EnumC0833 enumC08332 = EnumC0833.f5226;
            char m2208 = c0827.m2208();
            if (m2208 != '\t' && m2208 != '\n' && m2208 != '\f' && m2208 != '\r' && m2208 != ' ') {
                if (m2208 == '/') {
                    c0801.f5082 = EnumC0833.f5207;
                    return;
                }
                if (m2208 == '>') {
                    c0801.m2172();
                } else if (m2208 != 65535) {
                    c0801.m2173(this);
                    c0827.m2201();
                } else {
                    c0801.m2170(this);
                }
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public static final EnumC0833 f5207 = new EnumC0833("SelfClosingStartTag", 41) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.けときぜと
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '>') {
                c0801.f5090.f5037 = true;
                c0801.m2172();
            } else {
                if (m2208 != 65535) {
                    c0801.m2173(this);
                    c0827.m2201();
                    c0801.f5082 = EnumC0833.f5226;
                    return;
                }
                c0801.m2170(this);
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public static final EnumC0833 f5205 = new EnumC0833("BogusComment", 42) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.おかぷせ〱
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            c0827.m2201();
            AbstractC0788.C0797 c0797 = new AbstractC0788.C0797();
            c0797.f5028.append(c0827.m2205('>'));
            c0801.m2177(c0797);
            EnumC0833 enumC0833 = EnumC0833.f5165;
            c0801.f5083.m2200();
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public static final EnumC0833 f5178 = new EnumC0833("MarkupDeclarationOpen", 43) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.〺でおいここ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            if (c0827.m2206("--")) {
                AbstractC0788.m2115(c0801.f5089.f5028);
                enumC0833 = EnumC0833.f5221;
            } else if (c0827.m2209("DOCTYPE")) {
                enumC0833 = EnumC0833.f5162;
            } else {
                if (!c0827.m2206("[CDATA[")) {
                    c0801.m2173(this);
                    EnumC0833 enumC08332 = EnumC0833.f5205;
                    c0801.f5083.m2200();
                    c0801.f5082 = enumC08332;
                    return;
                }
                AbstractC0788.m2115(c0801.f5075);
                enumC0833 = EnumC0833.f5229;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public static final EnumC0833 f5221 = new EnumC0833("CommentStart", 44) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぇとしたべど
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            EnumC0833 enumC08332 = EnumC0833.f5194;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '-') {
                    c0801.f5082 = EnumC0833.f5196;
                    return;
                }
                if (m2208 == '>') {
                    c0801.m2173(this);
                } else if (m2208 != 65535) {
                    c0801.f5089.f5028.append(m2208);
                } else {
                    c0801.m2170(this);
                }
                c0801.m2177(c0801.f5089);
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            c0801.f5089.f5028.append((char) 65533);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public static final EnumC0833 f5196 = new EnumC0833("CommentStartDash", 45) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.げがぴうあだ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            EnumC0833 enumC08332 = EnumC0833.f5194;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '-') {
                    c0801.f5082 = EnumC0833.f5196;
                    return;
                }
                if (m2208 == '>') {
                    c0801.m2173(this);
                } else if (m2208 != 65535) {
                    c0801.f5089.f5028.append(m2208);
                } else {
                    c0801.m2170(this);
                }
                c0801.m2177(c0801.f5089);
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            c0801.f5089.f5028.append((char) 65533);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public static final EnumC0833 f5194 = new EnumC0833("Comment", 46) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ながふずは
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            char m2196 = c0827.m2196();
            if (m2196 == 0) {
                c0801.m2173(this);
                c0827.m2200();
                c0801.f5089.f5028.append((char) 65533);
            } else if (m2196 == '-') {
                EnumC0833 enumC0833 = EnumC0833.f5231;
                c0801.f5083.m2200();
                c0801.f5082 = enumC0833;
            } else {
                if (m2196 != 65535) {
                    c0801.f5089.f5028.append(c0827.m2195('-', 0));
                    return;
                }
                c0801.m2170(this);
                c0801.m2177(c0801.f5089);
                c0801.f5082 = EnumC0833.f5165;
            }
        }
    };

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public static final EnumC0833 f5231 = new EnumC0833("CommentEndDash", 47) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぃぜぶの〸ぃ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5194;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '-') {
                    enumC0833 = EnumC0833.f5216;
                } else if (m2208 != 65535) {
                    StringBuilder sb = c0801.f5089.f5028;
                    sb.append('-');
                    sb.append(m2208);
                } else {
                    c0801.m2170(this);
                    c0801.m2177(c0801.f5089);
                    enumC0833 = EnumC0833.f5165;
                }
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            StringBuilder sb2 = c0801.f5089.f5028;
            sb2.append('-');
            sb2.append((char) 65533);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public static final EnumC0833 f5216 = new EnumC0833("CommentEnd", 48) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ておぞぞはね
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            EnumC0833 enumC08332 = EnumC0833.f5194;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '!') {
                    c0801.m2173(this);
                    c0801.f5082 = EnumC0833.f5191;
                    return;
                }
                if (m2208 == '-') {
                    c0801.m2173(this);
                    c0801.f5089.f5028.append('-');
                    return;
                }
                if (m2208 != '>') {
                    if (m2208 != 65535) {
                        c0801.m2173(this);
                        StringBuilder sb = c0801.f5089.f5028;
                        sb.append("--");
                        sb.append(m2208);
                    } else {
                        c0801.m2170(this);
                    }
                }
                c0801.m2177(c0801.f5089);
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            StringBuilder sb2 = c0801.f5089.f5028;
            sb2.append("--");
            sb2.append((char) 65533);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public static final EnumC0833 f5191 = new EnumC0833("CommentEndBang", 49) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.えがぐせほち
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            EnumC0833 enumC08332 = EnumC0833.f5194;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '-') {
                    c0801.f5089.f5028.append("--!");
                    c0801.f5082 = EnumC0833.f5231;
                    return;
                }
                if (m2208 != '>') {
                    if (m2208 != 65535) {
                        StringBuilder sb = c0801.f5089.f5028;
                        sb.append("--!");
                        sb.append(m2208);
                    } else {
                        c0801.m2170(this);
                    }
                }
                c0801.m2177(c0801.f5089);
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            StringBuilder sb2 = c0801.f5089.f5028;
            sb2.append("--!");
            sb2.append((char) 65533);
            c0801.f5082 = enumC08332;
        }
    };

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public static final EnumC0833 f5162 = new EnumC0833("Doctype", 50) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ばおぢでぎか
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5189;
            char m2208 = c0827.m2208();
            if (m2208 != '\t' && m2208 != '\n' && m2208 != '\f' && m2208 != '\r' && m2208 != ' ') {
                if (m2208 != '>') {
                    if (m2208 != 65535) {
                        c0801.m2173(this);
                    } else {
                        c0801.m2170(this);
                    }
                }
                c0801.m2173(this);
                c0801.f5087.mo2117();
                AbstractC0788.C0795 c0795 = c0801.f5087;
                c0795.f5026 = true;
                c0801.m2177(c0795);
                c0801.f5082 = EnumC0833.f5165;
                return;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public static final EnumC0833 f5189 = new EnumC0833("BeforeDoctypeName", 51) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ごまけがぢは
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5202;
            if (c0827.m2198()) {
                c0801.f5087.mo2117();
                c0801.f5082 = enumC0833;
                return;
            }
            char m2208 = c0827.m2208();
            if (m2208 == 0) {
                c0801.m2173(this);
                c0801.f5087.mo2117();
                c0801.f5087.f5023.append((char) 65533);
            } else {
                if (m2208 == ' ') {
                    return;
                }
                if (m2208 == 65535) {
                    c0801.m2170(this);
                    c0801.f5087.mo2117();
                    AbstractC0788.C0795 c0795 = c0801.f5087;
                    c0795.f5026 = true;
                    c0801.m2177(c0795);
                    c0801.f5082 = EnumC0833.f5165;
                    return;
                }
                if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r') {
                    return;
                }
                c0801.f5087.mo2117();
                c0801.f5087.f5023.append(m2208);
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public static final EnumC0833 f5202 = new EnumC0833("DoctypeName", 52) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.こ〲しでおか
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            StringBuilder sb;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC0833 = EnumC0833.f5165;
            if (c0827.m2198()) {
                c0801.f5087.f5023.append(c0827.m2203());
                return;
            }
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 != ' ') {
                    if (m2208 == '>') {
                        c0795 = c0801.f5087;
                    } else if (m2208 == 65535) {
                        c0801.m2170(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    } else if (m2208 != '\t' && m2208 != '\n' && m2208 != '\f' && m2208 != '\r') {
                        sb = c0801.f5087.f5023;
                    }
                    c0801.m2177(c0795);
                    c0801.f5082 = enumC0833;
                    return;
                }
                c0801.f5082 = EnumC0833.f5185;
                return;
            }
            c0801.m2173(this);
            sb = c0801.f5087.f5023;
            m2208 = 65533;
            sb.append(m2208);
        }
    };

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public static final EnumC0833 f5185 = new EnumC0833("AfterDoctypeName", 53) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぺがぅす〹ち
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            if (c0827.m2211()) {
                c0801.m2170(this);
                AbstractC0788.C0795 c0795 = c0801.f5087;
                c0795.f5026 = true;
                c0801.m2177(c0795);
                c0801.f5082 = enumC08332;
                return;
            }
            if (c0827.m2197('\t', '\n', '\r', '\f', ' ')) {
                c0827.m2200();
                return;
            }
            if (c0827.m2199('>')) {
                c0801.m2177(c0801.f5087);
                c0801.f5083.m2200();
                c0801.f5082 = enumC08332;
                return;
            }
            if (c0827.m2209("PUBLIC")) {
                c0801.f5087.f5024 = "PUBLIC";
                enumC0833 = EnumC0833.f5164;
            } else {
                if (!c0827.m2209("SYSTEM")) {
                    c0801.m2173(this);
                    c0801.f5087.f5026 = true;
                    EnumC0833 enumC08333 = EnumC0833.f5200;
                    c0801.f5083.m2200();
                    c0801.f5082 = enumC08333;
                    return;
                }
                c0801.f5087.f5024 = "SYSTEM";
                enumC0833 = EnumC0833.f5217;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public static final EnumC0833 f5164 = new EnumC0833("AfterDoctypePublicKeyword", 54) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.のね〱ばぁぢ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                enumC0833 = EnumC0833.f5220;
            } else if (m2208 == '\"') {
                c0801.m2173(this);
                enumC0833 = EnumC0833.f5161;
            } else {
                if (m2208 != '\'') {
                    if (m2208 == '>') {
                        c0801.m2173(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    } else if (m2208 != 65535) {
                        c0801.m2173(this);
                        c0801.f5087.f5026 = true;
                        enumC0833 = EnumC0833.f5200;
                    } else {
                        c0801.m2170(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    }
                    c0801.m2177(c0795);
                    c0801.f5082 = enumC08332;
                    return;
                }
                c0801.m2173(this);
                enumC0833 = EnumC0833.f5188;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public static final EnumC0833 f5220 = new EnumC0833("BeforeDoctypePublicIdentifier", 55) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.くねねぱす〻
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                return;
            }
            if (m2208 == '\"') {
                enumC0833 = EnumC0833.f5161;
            } else {
                if (m2208 != '\'') {
                    if (m2208 == '>') {
                        c0801.m2173(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    } else if (m2208 != 65535) {
                        c0801.m2173(this);
                        c0801.f5087.f5026 = true;
                        enumC0833 = EnumC0833.f5200;
                    } else {
                        c0801.m2170(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    }
                    c0801.m2177(c0795);
                    c0801.f5082 = enumC08332;
                    return;
                }
                enumC0833 = EnumC0833.f5188;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public static final EnumC0833 f5161 = new EnumC0833("DoctypePublicIdentifier_doubleQuoted", 56) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.〱こか〺ぃせ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            StringBuilder sb;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC0833 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '\"') {
                    c0801.f5082 = EnumC0833.f5211;
                    return;
                }
                if (m2208 == '>') {
                    c0801.m2173(this);
                    c0795 = c0801.f5087;
                    c0795.f5026 = true;
                } else if (m2208 != 65535) {
                    sb = c0801.f5087.f5027;
                } else {
                    c0801.m2170(this);
                    c0795 = c0801.f5087;
                    c0795.f5026 = true;
                }
                c0801.m2177(c0795);
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            sb = c0801.f5087.f5027;
            m2208 = 65533;
            sb.append(m2208);
        }
    };

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public static final EnumC0833 f5188 = new EnumC0833("DoctypePublicIdentifier_singleQuoted", 57) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.くぎぶ〼のそ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            StringBuilder sb;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC0833 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '\'') {
                    c0801.f5082 = EnumC0833.f5211;
                    return;
                }
                if (m2208 == '>') {
                    c0801.m2173(this);
                    c0795 = c0801.f5087;
                    c0795.f5026 = true;
                } else if (m2208 != 65535) {
                    sb = c0801.f5087.f5027;
                } else {
                    c0801.m2170(this);
                    c0795 = c0801.f5087;
                    c0795.f5026 = true;
                }
                c0801.m2177(c0795);
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            sb = c0801.f5087.f5027;
            m2208 = 65533;
            sb.append(m2208);
        }
    };

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public static final EnumC0833 f5211 = new EnumC0833("AfterDoctypePublicIdentifier", 58) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ずまげせび〳
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                enumC0833 = EnumC0833.f5187;
            } else if (m2208 == '\"') {
                c0801.m2173(this);
                enumC0833 = EnumC0833.f5224;
            } else {
                if (m2208 != '\'') {
                    if (m2208 == '>') {
                        c0795 = c0801.f5087;
                    } else if (m2208 != 65535) {
                        c0801.m2173(this);
                        c0801.f5087.f5026 = true;
                        enumC0833 = EnumC0833.f5200;
                    } else {
                        c0801.m2170(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    }
                    c0801.m2177(c0795);
                    c0801.f5082 = enumC08332;
                    return;
                }
                c0801.m2173(this);
                enumC0833 = EnumC0833.f5181;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public static final EnumC0833 f5187 = new EnumC0833("BetweenDoctypePublicAndSystemIdentifiers", 59) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.〴ねぷぐくぼ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                return;
            }
            if (m2208 == '\"') {
                c0801.m2173(this);
                enumC0833 = EnumC0833.f5224;
            } else {
                if (m2208 != '\'') {
                    if (m2208 == '>') {
                        c0795 = c0801.f5087;
                    } else if (m2208 != 65535) {
                        c0801.m2173(this);
                        c0801.f5087.f5026 = true;
                        enumC0833 = EnumC0833.f5200;
                    } else {
                        c0801.m2170(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    }
                    c0801.m2177(c0795);
                    c0801.f5082 = enumC08332;
                    return;
                }
                c0801.m2173(this);
                enumC0833 = EnumC0833.f5181;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public static final EnumC0833 f5217 = new EnumC0833("AfterDoctypeSystemKeyword", 60) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.はつきどっ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                enumC0833 = EnumC0833.f5175;
            } else if (m2208 == '\"') {
                c0801.m2173(this);
                enumC0833 = EnumC0833.f5224;
            } else {
                if (m2208 != '\'') {
                    if (m2208 == '>') {
                        c0801.m2173(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    } else {
                        if (m2208 != 65535) {
                            c0801.m2173(this);
                            AbstractC0788.C0795 c07952 = c0801.f5087;
                            c07952.f5026 = true;
                            c0801.m2177(c07952);
                            return;
                        }
                        c0801.m2170(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    }
                    c0801.m2177(c0795);
                    c0801.f5082 = enumC08332;
                    return;
                }
                c0801.m2173(this);
                enumC0833 = EnumC0833.f5181;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public static final EnumC0833 f5175 = new EnumC0833("BeforeDoctypeSystemIdentifier", 61) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.〱かけばぜぐ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC08332 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                return;
            }
            if (m2208 == '\"') {
                enumC0833 = EnumC0833.f5224;
            } else {
                if (m2208 != '\'') {
                    if (m2208 == '>') {
                        c0801.m2173(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    } else if (m2208 != 65535) {
                        c0801.m2173(this);
                        c0801.f5087.f5026 = true;
                        enumC0833 = EnumC0833.f5200;
                    } else {
                        c0801.m2170(this);
                        c0795 = c0801.f5087;
                        c0795.f5026 = true;
                    }
                    c0801.m2177(c0795);
                    c0801.f5082 = enumC08332;
                    return;
                }
                enumC0833 = EnumC0833.f5181;
            }
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public static final EnumC0833 f5224 = new EnumC0833("DoctypeSystemIdentifier_doubleQuoted", 62) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぎきぁ〱ぢ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            StringBuilder sb;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC0833 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '\"') {
                    c0801.f5082 = EnumC0833.f5215;
                    return;
                }
                if (m2208 == '>') {
                    c0801.m2173(this);
                    c0795 = c0801.f5087;
                    c0795.f5026 = true;
                } else if (m2208 != 65535) {
                    sb = c0801.f5087.f5025;
                } else {
                    c0801.m2170(this);
                    c0795 = c0801.f5087;
                    c0795.f5026 = true;
                }
                c0801.m2177(c0795);
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            sb = c0801.f5087.f5025;
            m2208 = 65533;
            sb.append(m2208);
        }
    };

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public static final EnumC0833 f5181 = new EnumC0833("DoctypeSystemIdentifier_singleQuoted", 63) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.な〱ちぉじ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            StringBuilder sb;
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC0833 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 != 0) {
                if (m2208 == '\'') {
                    c0801.f5082 = EnumC0833.f5215;
                    return;
                }
                if (m2208 == '>') {
                    c0801.m2173(this);
                    c0795 = c0801.f5087;
                    c0795.f5026 = true;
                } else if (m2208 != 65535) {
                    sb = c0801.f5087.f5025;
                } else {
                    c0801.m2170(this);
                    c0795 = c0801.f5087;
                    c0795.f5026 = true;
                }
                c0801.m2177(c0795);
                c0801.f5082 = enumC0833;
                return;
            }
            c0801.m2173(this);
            sb = c0801.f5087.f5025;
            m2208 = 65533;
            sb.append(m2208);
        }
    };

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public static final EnumC0833 f5215 = new EnumC0833("AfterDoctypeSystemIdentifier", 64) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.きぬどぼみ〸
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            AbstractC0788.C0795 c0795;
            EnumC0833 enumC0833 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                return;
            }
            if (m2208 == '>') {
                c0795 = c0801.f5087;
            } else if (m2208 != 65535) {
                c0801.m2173(this);
                c0801.f5082 = EnumC0833.f5200;
                return;
            } else {
                c0801.m2170(this);
                c0795 = c0801.f5087;
                c0795.f5026 = true;
            }
            c0801.m2177(c0795);
            c0801.f5082 = enumC0833;
        }
    };

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public static final EnumC0833 f5200 = new EnumC0833("BogusDoctype", 65) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.のびぶけせ
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            EnumC0833 enumC0833 = EnumC0833.f5165;
            char m2208 = c0827.m2208();
            if (m2208 == '>' || m2208 == 65535) {
                c0801.m2177(c0801.f5087);
                c0801.f5082 = enumC0833;
            }
        }
    };

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public static final EnumC0833 f5229 = new EnumC0833("CdataSection", 66) { // from class: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺.ぇいうげ〱〹
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        public void mo2235(C0801 c0801, C0827 c0827) {
            String m2210;
            int m2202 = c0827.m2202("]]>");
            if (m2202 != -1) {
                m2210 = C0827.m2192(c0827.f5138, c0827.f5134, c0827.f5139, m2202);
                c0827.f5139 += m2202;
            } else {
                m2210 = c0827.m2210();
            }
            c0801.f5075.append(m2210);
            if (c0827.m2206("]]>") || c0827.m2211()) {
                c0801.m2177(new AbstractC0788.C0790(c0801.f5075.toString()));
                c0801.f5082 = EnumC0833.f5165;
            }
        }
    };

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0833[] f5199 = {f5165, f5190, f5223, f5206, f5213, f5168, f5163, f5230, f5171, f5233, f5208, f5218, f5228, f5184, f5177, f5180, f5198, f5219, f5195, f5197, f5209, f5225, f5167, f5179, f5174, f5222, f5214, f5210, f5173, f5201, f5232, f5182, f5204, f5226, f5192, f5183, f5166, f5176, f5193, f5212, f5170, f5207, f5205, f5178, f5221, f5196, f5194, f5231, f5216, f5191, f5162, f5189, f5202, f5185, f5164, f5220, f5161, f5188, f5211, f5187, f5217, f5175, f5224, f5181, f5215, f5200, f5229};

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public static final char[] f5169 = {0, '&', '\''};

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public static final char[] f5227 = {0, '\"', '&'};

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public static final char[] f5172 = {0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public static final char[] f5203 = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public static final String f5186 = String.valueOf((char) 65533);

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺$ぺふねづ〺, reason: contains not printable characters */
    public enum C0900 extends EnumC0833 {
        public C0900(String str, int i) {
            super(str, i, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        
            r9 = p015.p016.p018.C0827.m2192(r9.f5138, r9.f5134, r0, r5 - r0);
         */
        @Override // p015.p016.p018.EnumC0833
        /* renamed from: なぎぱいぢぎ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void mo2235(p015.p016.p018.C0801 r8, p015.p016.p018.C0827 r9) {
            /*
                r7 = this;
                char r0 = r9.m2196()
                if (r0 == 0) goto L56
                r1 = 38
                if (r0 == r1) goto L53
                r2 = 60
                if (r0 == r2) goto L49
                r3 = 65535(0xffff, float:9.1834E-41)
                if (r0 == r3) goto L40
                r9.m2194()
                int r0 = r9.f5139
                int r3 = r9.f5137
                char[] r4 = r9.f5138
            L1c:
                int r5 = r9.f5139
                if (r5 >= r3) goto L2e
                char r6 = r4[r5]
                if (r6 == r1) goto L2e
                if (r6 == r2) goto L2e
                if (r6 != 0) goto L29
                goto L2e
            L29:
                int r5 = r5 + 1
                r9.f5139 = r5
                goto L1c
            L2e:
                if (r5 <= r0) goto L3a
                char[] r1 = r9.f5138
                java.lang.String[] r9 = r9.f5134
                int r5 = r5 - r0
                java.lang.String r9 = p015.p016.p018.C0827.m2192(r1, r9, r0, r5)
                goto L3c
            L3a:
                java.lang.String r9 = ""
            L3c:
                r8.m2176(r9)
                goto L60
            L40:
                いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$なぎぱいぢぎ r9 = new いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$なぎぱいぢぎ
                r9.<init>()
                r8.m2177(r9)
                goto L60
            L49:
                いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺 r9 = p015.p016.p018.EnumC0833.f5230
            L4b:
                いいにぽつ.〺つふすそ.づざかべべ.げつ〴ぬぐ r0 = r8.f5083
                r0.m2200()
                r8.f5082 = r9
                goto L60
            L53:
                いいにぽつ.〺つふすそ.づざかべべ.ぺふねづ〺 r9 = p015.p016.p018.EnumC0833.f5190
                goto L4b
            L56:
                r8.m2173(r7)
                char r9 = r9.m2208()
                r8.m2178(r9)
            L60:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.EnumC0833.C0900.mo2235(いいにぽつ.〺つふすそ.づざかべべ.いいにぽつ, いいにぽつ.〺つふすそ.づざかべべ.げつ〴ぬぐ):void");
        }
    }

    public EnumC0833(String str, int i, C0900 c0900) {
    }

    public static EnumC0833 valueOf(String str) {
        return (EnumC0833) Enum.valueOf(EnumC0833.class, str);
    }

    public static EnumC0833[] values() {
        return (EnumC0833[]) f5199.clone();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m2230(C0801 c0801, C0827 c0827, EnumC0833 enumC0833, EnumC0833 enumC08332) {
        char m2196 = c0827.m2196();
        if (m2196 == 0) {
            c0801.m2173(enumC0833);
            c0827.m2200();
            c0801.m2178((char) 65533);
        } else if (m2196 == '<') {
            c0801.f5083.m2200();
            c0801.f5082 = enumC08332;
        } else if (m2196 != 65535) {
            c0801.m2176(c0827.m2195('<', 0));
        } else {
            c0801.m2177(new AbstractC0788.C0796());
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static void m2231(C0801 c0801, C0827 c0827, EnumC0833 enumC0833, EnumC0833 enumC08332) {
        if (c0827.m2198()) {
            c0801.m2174(false);
            c0801.f5082 = enumC0833;
        } else {
            c0801.m2176("</");
            c0801.f5082 = enumC08332;
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m2232(C0801 c0801, EnumC0833 enumC0833) {
        int[] m2171 = c0801.m2171(null, false);
        if (m2171 == null) {
            c0801.m2178('&');
        } else {
            c0801.m2176(new String(m2171, 0, m2171.length));
        }
        c0801.f5082 = enumC0833;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static void m2233(C0801 c0801, C0827 c0827, EnumC0833 enumC0833, EnumC0833 enumC08332) {
        if (c0827.m2198()) {
            String m2203 = c0827.m2203();
            c0801.f5075.append(m2203);
            c0801.m2176(m2203);
            return;
        }
        char m2208 = c0827.m2208();
        if (m2208 != '\t' && m2208 != '\n' && m2208 != '\f' && m2208 != '\r' && m2208 != ' ' && m2208 != '/' && m2208 != '>') {
            c0827.m2201();
            c0801.f5082 = enumC08332;
        } else {
            if (c0801.f5075.toString().equals("script")) {
                c0801.f5082 = enumC0833;
            } else {
                c0801.f5082 = enumC08332;
            }
            c0801.m2178(m2208);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static void m2234(C0801 c0801, C0827 c0827, EnumC0833 enumC0833) {
        EnumC0833 enumC08332;
        if (c0827.m2198()) {
            String m2203 = c0827.m2203();
            c0801.f5090.m2131(m2203);
            c0801.f5075.append(m2203);
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (c0801.m2180() && !c0827.m2211()) {
            char m2208 = c0827.m2208();
            if (m2208 == '\t' || m2208 == '\n' || m2208 == '\f' || m2208 == '\r' || m2208 == ' ') {
                enumC08332 = f5226;
            } else if (m2208 == '/') {
                enumC08332 = f5207;
            } else if (m2208 != '>') {
                c0801.f5075.append(m2208);
                z = true;
                z2 = z;
            } else {
                c0801.m2172();
                enumC08332 = f5165;
            }
            c0801.f5082 = enumC08332;
            z2 = z;
        }
        if (z2) {
            StringBuilder m4207 = C2098.m4207("</");
            m4207.append(c0801.f5075.toString());
            c0801.m2176(m4207.toString());
            c0801.f5082 = enumC0833;
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public abstract void mo2235(C0801 c0801, C0827 c0827);
}
