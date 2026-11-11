package p000;

import javax.annotation.Nullable;
import p000.C0597;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉ〲なぱぽた, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0595 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f4246;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C0597 f4247;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0698 f4248;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Object f4249;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public volatile C0693 f4250;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    @Nullable
    public final AbstractC0719 f4251;

    /* renamed from: 〳ぜぞぜべっ.ぉ〲なぱぽた$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0596 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f4252;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C0597.C0598 f4253;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0698 f4254;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Object f4255;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public AbstractC0719 f4256;

        public C0596() {
            this.f4252 = "GET";
            this.f4253 = new C0597.C0598();
        }

        public C0596(C0595 c0595) {
            this.f4254 = c0595.f4248;
            this.f4252 = c0595.f4246;
            this.f4256 = c0595.f4251;
            this.f4255 = c0595.f4249;
            this.f4253 = c0595.f4247.m1742();
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0595 m1734() {
            if (this.f4254 != null) {
                return new C0595(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C0596 m1735(String str, String str2) {
            C0597.C0598 c0598 = this.f4253;
            c0598.m1747(str, str2);
            c0598.m1749(str);
            c0598.f4258.add(str);
            c0598.f4258.add(str2.trim());
            return this;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0596 m1736(String str, String str2) {
            C0597.C0598 c0598 = this.f4253;
            c0598.m1747(str, str2);
            c0598.f4258.add(str);
            c0598.f4258.add(str2.trim());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
        /* renamed from: づざかべべ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public p000.C0595.C0596 m1737(java.lang.String r9) {
            /*
                r8 = this;
                if (r9 == 0) goto L59
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 3
                java.lang.String r3 = "ws:"
                r0 = r9
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L17
                java.lang.String r0 = "http:"
                java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
                r1 = 3
                goto L2b
            L17:
                r3 = 1
                r4 = 0
                r6 = 0
                r7 = 4
                java.lang.String r5 = "wss:"
                r2 = r9
                boolean r0 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r0 == 0) goto L36
                java.lang.String r0 = "https:"
                java.lang.StringBuilder r0 = p131.p155.p156.p157.C2098.m4207(r0)
                r1 = 4
            L2b:
                java.lang.String r9 = r9.substring(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
            L36:
                〳ぜぞぜべっ.ざとぅぼこ〺$げつ〴ぬぐ r0 = new 〳ぜぞぜべっ.ざとぅぼこ〺$げつ〴ぬぐ
                r0.<init>()
                r1 = 0
                〳ぜぞぜべっ.ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ r2 = r0.m1964(r1, r9)
                〳ぜぞぜべっ.ざとぅぼこ〺$げつ〴ぬぐ$げつ〴ぬぐ r3 = p000.C0698.C0699.EnumC0700.SUCCESS
                if (r2 != r3) goto L48
                〳ぜぞぜべっ.ざとぅぼこ〺 r1 = r0.m1965()
            L48:
                if (r1 == 0) goto L4d
                r8.f4254 = r1
                return r8
            L4d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "unexpected url: "
                java.lang.String r9 = p131.p155.p156.p157.C2098.m4205(r1, r9)
                r0.<init>(r9)
                throw r0
            L59:
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r0 = "url == null"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0595.C0596.m1737(java.lang.String):〳ぜぞぜべっ.ぉ〲なぱぽた$げつ〴ぬぐ");
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public C0596 m1738(C0698 c0698) {
            if (c0698 == null) {
                throw new NullPointerException("url == null");
            }
            this.f4254 = c0698;
            return this;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C0596 m1739(String str, @Nullable AbstractC0719 abstractC0719) {
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (abstractC0719 != null && !C1687.m3711(str)) {
                throw new IllegalArgumentException(C2098.m4187("method ", str, " must not have a request body."));
            }
            if (abstractC0719 == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    throw new IllegalArgumentException(C2098.m4187("method ", str, " must have a request body."));
                }
            }
            this.f4252 = str;
            this.f4256 = abstractC0719;
            return this;
        }
    }

    public C0595(C0596 c0596) {
        this.f4248 = c0596.f4254;
        this.f4246 = c0596.f4252;
        this.f4247 = new C0597(c0596.f4253);
        this.f4251 = c0596.f4256;
        Object obj = c0596.f4255;
        this.f4249 = obj == null ? this : obj;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Request{method=");
        m4207.append(this.f4246);
        m4207.append(", url=");
        m4207.append(this.f4248);
        m4207.append(", tag=");
        Object obj = this.f4249;
        if (obj == this) {
            obj = null;
        }
        m4207.append(obj);
        m4207.append('}');
        return m4207.toString();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C0693 m1733() {
        C0693 c0693 = this.f4250;
        if (c0693 != null) {
            return c0693;
        }
        C0693 m1942 = C0693.m1942(this.f4247);
        this.f4250 = m1942;
        return m1942;
    }
}
