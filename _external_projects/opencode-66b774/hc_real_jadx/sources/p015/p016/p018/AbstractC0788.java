package p015.p016.p018;

import p015.p016.p020.C0956;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;

/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0788 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public EnumC0792 f5014;

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$〳ぜぞぜべっ, reason: contains not printable characters */
    public static final class C0789 extends AbstractC0798 {
        public C0789() {
            this.f5032 = new C0956();
            this.f5014 = EnumC0792.StartTag;
        }

        public String toString() {
            StringBuilder m4207;
            String m2125;
            C0956 c0956 = this.f5032;
            if (c0956 == null || c0956.f5266 <= 0) {
                m4207 = C2098.m4207("<");
                m2125 = m2125();
            } else {
                m4207 = C2098.m4207("<");
                m4207.append(m2125());
                m4207.append(" ");
                m2125 = this.f5032.toString();
            }
            return C2098.m4198(m4207, m2125, ">");
        }

        @Override // p015.p016.p018.AbstractC0788.AbstractC0798, p015.p016.p018.AbstractC0788
        /* renamed from: ぁごぐすすぃ */
        public /* bridge */ /* synthetic */ AbstractC0788 mo2117() {
            mo2117();
            return this;
        }

        @Override // p015.p016.p018.AbstractC0788.AbstractC0798
        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        public AbstractC0798 mo2117() {
            super.mo2117();
            this.f5032 = new C0956();
            return this;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
    public static final class C0790 extends C0793 {
        public C0790(String str) {
            this.f5022 = str;
        }

        @Override // p015.p016.p018.AbstractC0788.C0793
        public String toString() {
            return C2098.m4198(C2098.m4207("<![CDATA["), this.f5022, "]]>");
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$ぁごぐすすぃ, reason: contains not printable characters */
    public static final class C0791 extends AbstractC0798 {
        public C0791() {
            this.f5014 = EnumC0792.EndTag;
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("</");
            m4207.append(m2125());
            m4207.append(">");
            return m4207.toString();
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$いいにぽつ, reason: contains not printable characters */
    public enum EnumC0792 {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0793 extends AbstractC0788 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f5022;

        public C0793() {
            super(null);
            this.f5014 = EnumC0792.Character;
        }

        public String toString() {
            return this.f5022;
        }

        @Override // p015.p016.p018.AbstractC0788
        /* renamed from: ぁごぐすすぃ */
        public AbstractC0788 mo2117() {
            this.f5022 = null;
            return this;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$づざかべべ, reason: contains not printable characters */
    public static final class C0795 extends AbstractC0788 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final StringBuilder f5023;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public String f5024;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final StringBuilder f5025;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f5026;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final StringBuilder f5027;

        public C0795() {
            super(null);
            this.f5023 = new StringBuilder();
            this.f5024 = null;
            this.f5027 = new StringBuilder();
            this.f5025 = new StringBuilder();
            this.f5026 = false;
            this.f5014 = EnumC0792.Doctype;
        }

        @Override // p015.p016.p018.AbstractC0788
        /* renamed from: ぁごぐすすぃ */
        public AbstractC0788 mo2117() {
            AbstractC0788.m2115(this.f5023);
            this.f5024 = null;
            AbstractC0788.m2115(this.f5027);
            AbstractC0788.m2115(this.f5025);
            this.f5026 = false;
            return this;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$なぎぱいぢぎ, reason: contains not printable characters */
    public static final class C0796 extends AbstractC0788 {
        public C0796() {
            super(null);
            this.f5014 = EnumC0792.EOF;
        }

        @Override // p015.p016.p018.AbstractC0788
        /* renamed from: ぁごぐすすぃ */
        public AbstractC0788 mo2117() {
            return this;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$びぐびあび, reason: contains not printable characters */
    public static final class C0797 extends AbstractC0788 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final StringBuilder f5028;

        public C0797() {
            super(null);
            this.f5028 = new StringBuilder();
            this.f5014 = EnumC0792.Comment;
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("<!--");
            m4207.append(this.f5028.toString());
            m4207.append("-->");
            return m4207.toString();
        }

        @Override // p015.p016.p018.AbstractC0788
        /* renamed from: ぁごぐすすぃ */
        public AbstractC0788 mo2117() {
            AbstractC0788.m2115(this.f5028);
            return this;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.づざかべべ.〳ぜぞぜべっ$ぺぁあねじ, reason: contains not printable characters */
    public static abstract class AbstractC0798 extends AbstractC0788 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public boolean f5029;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f5030;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f5031;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public C0956 f5032;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public String f5033;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public StringBuilder f5034;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public String f5035;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public String f5036;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public boolean f5037;

        public AbstractC0798() {
            super(null);
            this.f5034 = new StringBuilder();
            this.f5031 = false;
            this.f5029 = false;
            this.f5037 = false;
        }

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public final void m2124(char c) {
            m2127();
            this.f5034.append(c);
        }

        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public final String m2125() {
            String str = this.f5030;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Must be false");
            }
            return this.f5030;
        }

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public final AbstractC0798 m2126(String str) {
            this.f5030 = str;
            this.f5033 = C1687.m3717(str);
            return this;
        }

        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public final void m2127() {
            this.f5029 = true;
            String str = this.f5035;
            if (str != null) {
                this.f5034.append(str);
                this.f5035 = null;
            }
        }

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public final void m2128() {
            if (this.f5032 == null) {
                this.f5032 = new C0956();
            }
            String str = this.f5036;
            if (str != null) {
                String trim = str.trim();
                this.f5036 = trim;
                if (trim.length() > 0) {
                    this.f5032.m2266(this.f5036, this.f5029 ? this.f5034.length() > 0 ? this.f5034.toString() : this.f5035 : this.f5031 ? "" : null);
                }
            }
            this.f5036 = null;
            this.f5031 = false;
            this.f5029 = false;
            AbstractC0788.m2115(this.f5034);
            this.f5035 = null;
        }

        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public final void m2129(int[] iArr) {
            m2127();
            for (int i : iArr) {
                this.f5034.appendCodePoint(i);
            }
        }

        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public final void m2130(char c) {
            m2131(String.valueOf(c));
        }

        @Override // p015.p016.p018.AbstractC0788
        /* renamed from: は〲ぱなで, reason: merged with bridge method [inline-methods] */
        public AbstractC0798 mo2117() {
            this.f5030 = null;
            this.f5033 = null;
            this.f5036 = null;
            AbstractC0788.m2115(this.f5034);
            this.f5035 = null;
            this.f5031 = false;
            this.f5029 = false;
            this.f5037 = false;
            this.f5032 = null;
            return this;
        }

        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public final void m2131(String str) {
            String str2 = this.f5030;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f5030 = str;
            this.f5033 = C1687.m3717(str);
        }

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public final void m2132(char c) {
            String valueOf = String.valueOf(c);
            String str = this.f5036;
            if (str != null) {
                valueOf = str.concat(valueOf);
            }
            this.f5036 = valueOf;
        }

        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public final void m2133(String str) {
            m2127();
            if (this.f5034.length() == 0) {
                this.f5035 = str;
            } else {
                this.f5034.append(str);
            }
        }
    }

    public AbstractC0788(C0794 c0794) {
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static void m2115(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m2116() {
        return this.f5014 == EnumC0792.Comment;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public abstract AbstractC0788 mo2117();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m2118() {
        return this.f5014 == EnumC0792.Doctype;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean m2119() {
        return this.f5014 == EnumC0792.Character;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean m2120() {
        return this.f5014 == EnumC0792.EndTag;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean m2121() {
        return this.f5014 == EnumC0792.StartTag;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean m2122() {
        return this.f5014 == EnumC0792.EOF;
    }
}
