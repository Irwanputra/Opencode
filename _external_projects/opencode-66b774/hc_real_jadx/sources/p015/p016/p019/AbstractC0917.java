package p015.p016.p019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p015.p016.p018.C0800;
import p015.p016.p018.C0830;
import p015.p016.p020.AbstractC0974;
import p015.p016.p020.C0955;
import p015.p016.p020.C0956;
import p015.p016.p020.C0958;
import p015.p016.p020.C0965;
import p015.p016.p020.C0966;
import p015.p016.p020.C0967;
import p015.p016.p020.C0968;
import p015.p016.p020.C0969;
import p015.p016.p020.C0976;
import p034.p095.C1687;

/* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC0917 {

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$〳ぜぞぜべっ, reason: contains not printable characters */
    public static final class C0918 extends AbstractC0917 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Pattern f5247;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5248;

        public C0918(String str, Pattern pattern) {
            this.f5248 = C1687.m3689(str);
            this.f5247 = pattern;
        }

        public String toString() {
            return String.format("[%s~=%s]", this.f5248, this.f5247.toString());
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.mo2284(this.f5248) && this.f5247.matcher(c09762.mo2278(this.f5248)).find();
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$〺つふすそ, reason: contains not printable characters */
    public static final class C0919 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5249;

        public C0919(String str) {
            this.f5249 = str;
        }

        public String toString() {
            return String.format("[%s]", this.f5249);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.mo2284(this.f5249);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$〻ぞまぎな〻, reason: contains not printable characters */
    public static final class C0920 extends AbstractC0917 {
        public String toString() {
            return ":last-child";
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            C0976 c09763 = (C0976) c09762.f5308;
            return (c09763 == null || (c09763 instanceof C0958) || c09762.m2305() != c09763.m2300().size() - 1) ? false : true;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぁごぐすすぃ, reason: contains not printable characters */
    public static final class C0921 extends AbstractC0931 {
        public C0921(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.f5255, this.f5254);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.mo2284(this.f5255) && C1687.m3717(c09762.mo2278(this.f5255)).endsWith(this.f5254);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$いいにぽつ, reason: contains not printable characters */
    public static final class C0922 extends AbstractC0931 {
        public C0922(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.f5255, this.f5254);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.mo2284(this.f5255) && C1687.m3717(c09762.mo2278(this.f5255)).startsWith(this.f5254);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぅみぱぎぎ, reason: contains not printable characters */
    public static final class C0923 extends AbstractC0917 {
        public String toString() {
            return ":only-child";
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            C0913 c0913;
            AbstractC0974 abstractC0974 = c09762.f5308;
            C0976 c09763 = (C0976) abstractC0974;
            if (c09763 == null || (c09763 instanceof C0958)) {
                return false;
            }
            if (abstractC0974 == null) {
                c0913 = new C0913(0);
            } else {
                List<C0976> m2301 = ((C0976) abstractC0974).m2301();
                C0913 c09132 = new C0913(m2301.size() - 1);
                for (C0976 c09764 : m2301) {
                    if (c09764 != c09762) {
                        c09132.add(c09764);
                    }
                }
                c0913 = c09132;
            }
            return c0913.size() == 0;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final class C0924 extends AbstractC0930 {
        public C0924(int i, int i2) {
            super(i, i2);
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int mo2250(C0976 c0976, C0976 c09762) {
            return c09762.m2305() + 1;
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public String mo2251() {
            return "nth-child";
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぇぬぎばつ, reason: contains not printable characters */
    public static final class C0925 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5250;

        public C0925(String str) {
            this.f5250 = str;
        }

        public String toString() {
            return String.format("#%s", this.f5250);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return this.f5250.equals(c09762.mo2287().m2258("id"));
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぉ〲なぱぽた, reason: contains not printable characters */
    public static final class C0926 extends C0944 {
        public C0926() {
            super(0, 1);
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        public String toString() {
            return ":last-of-type";
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぉざぅち〻, reason: contains not printable characters */
    public static final class C0927 extends AbstractC0936 {
        public C0927(int i) {
            super(i);
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f5257));
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.m2305() == this.f5257;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぉひのべい, reason: contains not printable characters */
    public static final class C0928 extends AbstractC0917 {
        public String toString() {
            return ":matchText";
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            if (c09762 instanceof C0966) {
                return true;
            }
            c09762.getClass();
            ArrayList arrayList = new ArrayList();
            for (AbstractC0974 abstractC0974 : c09762.f5316) {
                if (abstractC0974 instanceof C0965) {
                    arrayList.add((C0965) abstractC0974);
                }
            }
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                C0965 c0965 = (C0965) it.next();
                C0966 c0966 = new C0966(C0800.m2169(c09762.f5317.f5068, C0830.f5154), c09762.f5313, c09762.mo2287());
                c0965.getClass();
                C1687.m3701(c0966);
                C1687.m3701(c0965.f5308);
                AbstractC0974 abstractC09742 = c0965.f5308;
                abstractC09742.getClass();
                C1687.m3722(c0965.f5308 == abstractC09742);
                C1687.m3701(c0966);
                AbstractC0974 abstractC09743 = c0966.f5308;
                if (abstractC09743 != null) {
                    abstractC09743.mo2294(c0966);
                }
                int i = c0965.f5309;
                abstractC09742.mo2280().set(i, c0966);
                c0966.f5308 = abstractC09742;
                c0966.f5309 = i;
                c0965.f5308 = null;
                c0966.m2307(c0965);
            }
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$おかぷせ〱, reason: contains not printable characters */
    public static final class C0929 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5251;

        public C0929(String str) {
            this.f5251 = str;
        }

        public String toString() {
            return String.format("%s", this.f5251);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.f5317.f5068.endsWith(this.f5251);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$おぐぴう〸ず, reason: contains not printable characters */
    public static abstract class AbstractC0930 extends AbstractC0917 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f5252;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int f5253;

        public AbstractC0930(int i, int i2) {
            this.f5253 = i;
            this.f5252 = i2;
        }

        public String toString() {
            return this.f5253 == 0 ? String.format(":%s(%d)", mo2251(), Integer.valueOf(this.f5252)) : this.f5252 == 0 ? String.format(":%s(%dn)", mo2251(), Integer.valueOf(this.f5253)) : String.format(":%s(%dn%+d)", mo2251(), Integer.valueOf(this.f5253), Integer.valueOf(this.f5252));
        }

        /* renamed from: 〺つふすそ */
        public abstract int mo2250(C0976 c0976, C0976 c09762);

        /* renamed from: くし〴〺ぅ */
        public abstract String mo2251();

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            C0976 c09763 = (C0976) c09762.f5308;
            if (c09763 == null || (c09763 instanceof C0958)) {
                return false;
            }
            int mo2250 = mo2250(c0976, c09762);
            int i = this.f5253;
            if (i == 0) {
                return mo2250 == this.f5252;
            }
            int i2 = this.f5252;
            return (mo2250 - i2) * i >= 0 && (mo2250 - i2) % i == 0;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$くし〴〺ぅ, reason: contains not printable characters */
    public static abstract class AbstractC0931 extends AbstractC0917 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f5254;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5255;

        public AbstractC0931(String str, String str2) {
            C1687.m3654(str);
            C1687.m3654(str2);
            this.f5255 = C1687.m3689(str);
            if ((str2.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'"))) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            this.f5254 = C1687.m3689(str2);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$けときぜと, reason: contains not printable characters */
    public static final class C0932 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5256;

        public C0932(String str) {
            this.f5256 = str;
        }

        public String toString() {
            return String.format("%s", this.f5256);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.f5317.f5068.equalsIgnoreCase(this.f5256);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0933 extends AbstractC0917 {
        public String toString() {
            return "*";
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return true;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ごづごきえ, reason: contains not printable characters */
    public static final class C0934 extends AbstractC0936 {
        public C0934(int i) {
            super(i);
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f5257));
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c0976 != c09762 && c09762.m2305() < this.f5257;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ざっざへづ, reason: contains not printable characters */
    public static final class C0935 extends AbstractC0917 {
        public String toString() {
            return ":empty";
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            for (AbstractC0974 abstractC0974 : Collections.unmodifiableList(c09762.mo2280())) {
                if (!(abstractC0974 instanceof C0969) && !(abstractC0974 instanceof C0955)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ざとぅぼこ〺, reason: contains not printable characters */
    public static abstract class AbstractC0936 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int f5257;

        public AbstractC0936(int i) {
            this.f5257 = i;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$じぜこほぱ, reason: contains not printable characters */
    public static final class C0937 extends AbstractC0917 {
        public String toString() {
            return ":only-of-type";
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            C0976 c09763 = (C0976) c09762.f5308;
            if (c09763 == null || (c09763 instanceof C0958)) {
                return false;
            }
            Iterator<C0976> it = c09763.m2300().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().f5317.equals(c09762.f5317)) {
                    i++;
                }
            }
            return i == 1;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$せづっ〸ちね, reason: contains not printable characters */
    public static final class C0938 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Pattern f5258;

        public C0938(Pattern pattern) {
            this.f5258 = pattern;
        }

        public String toString() {
            return String.format(":matches(%s)", this.f5258);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return this.f5258.matcher(c09762.m2304()).find();
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$づざかべべ, reason: contains not printable characters */
    public static final class C0939 extends AbstractC0931 {
        public C0939(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format("[%s=%s]", this.f5255, this.f5254);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.mo2284(this.f5255) && this.f5254.equalsIgnoreCase(c09762.mo2278(this.f5255).trim());
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$てぜきぽく, reason: contains not printable characters */
    public static final class C0940 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5259;

        public C0940(String str) {
            this.f5259 = C1687.m3717(str);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.f5259);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return C1687.m3717(c09762.m2306()).contains(this.f5259);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$でどあくず, reason: contains not printable characters */
    public static final class C0941 extends AbstractC0917 {
        public String toString() {
            return ":first-child";
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            C0976 c09763 = (C0976) c09762.f5308;
            return (c09763 == null || (c09763 instanceof C0958) || c09762.m2305() != 0) ? false : true;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$どぇぞほだ, reason: contains not printable characters */
    public static class C0942 extends AbstractC0930 {
        public C0942(int i, int i2) {
            super(i, i2);
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        /* renamed from: 〺つふすそ */
        public int mo2250(C0976 c0976, C0976 c09762) {
            Iterator<C0976> it = ((C0976) c09762.f5308).m2300().iterator();
            int i = 0;
            while (it.hasNext()) {
                C0976 next = it.next();
                if (next.f5317.equals(c09762.f5317)) {
                    i++;
                }
                if (next == c09762) {
                    break;
                }
            }
            return i;
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        /* renamed from: くし〴〺ぅ */
        public String mo2251() {
            return "nth-of-type";
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$なぎぱいぢぎ, reason: contains not printable characters */
    public static final class C0943 extends AbstractC0931 {
        public C0943(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.f5255, this.f5254);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.mo2284(this.f5255) && C1687.m3717(c09762.mo2278(this.f5255)).contains(this.f5254);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$なぶひせが, reason: contains not printable characters */
    public static class C0944 extends AbstractC0930 {
        public C0944(int i, int i2) {
            super(i, i2);
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        /* renamed from: 〺つふすそ */
        public int mo2250(C0976 c0976, C0976 c09762) {
            C0913 m2300 = ((C0976) c09762.f5308).m2300();
            int i = 0;
            for (int m2305 = c09762.m2305(); m2305 < m2300.size(); m2305++) {
                if (m2300.get(m2305).f5317.equals(c09762.f5317)) {
                    i++;
                }
            }
            return i;
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        /* renamed from: くし〴〺ぅ */
        public String mo2251() {
            return "nth-last-of-type";
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$のぷのちつ, reason: contains not printable characters */
    public static final class C0945 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5260;

        public C0945(String str) {
            this.f5260 = C1687.m3717(str);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.f5260);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return C1687.m3717(c09762.m2303()).contains(this.f5260);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$は〲ぱなで, reason: contains not printable characters */
    public static final class C0946 extends AbstractC0936 {
        public C0946(int i) {
            super(i);
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f5257));
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return c09762.m2305() > this.f5257;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$びえぁぜい, reason: contains not printable characters */
    public static final class C0947 extends AbstractC0930 {
        public C0947(int i, int i2) {
            super(i, i2);
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        /* renamed from: 〺つふすそ */
        public int mo2250(C0976 c0976, C0976 c09762) {
            return ((C0976) c09762.f5308).m2300().size() - c09762.m2305();
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        /* renamed from: くし〴〺ぅ */
        public String mo2251() {
            return "nth-last-child";
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$びぐびあび, reason: contains not printable characters */
    public static final class C0948 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5261;

        public C0948(String str) {
            C1687.m3654(str);
            this.f5261 = C1687.m3717(str);
        }

        public String toString() {
            return String.format("[^%s]", this.f5261);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            C0956 mo2287 = c09762.mo2287();
            mo2287.getClass();
            ArrayList arrayList = new ArrayList(mo2287.f5266);
            for (int i = 0; i < mo2287.f5266; i++) {
                String[] strArr = mo2287.f5268;
                arrayList.add(strArr[i] == null ? new C0967(mo2287.f5267[i]) : new C0968(mo2287.f5267[i], strArr[i], mo2287));
            }
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (it.hasNext()) {
                if (C1687.m3717(((C0968) it.next()).f5302).startsWith(this.f5261)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぶでにく〼〳, reason: contains not printable characters */
    public static final class C0949 extends C0942 {
        public C0949() {
            super(0, 1);
        }

        @Override // p015.p016.p019.AbstractC0917.AbstractC0930
        public String toString() {
            return ":first-of-type";
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぷぞてのほき, reason: contains not printable characters */
    public static final class C0950 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Pattern f5262;

        public C0950(Pattern pattern) {
            this.f5262 = pattern;
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.f5262);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return this.f5262.matcher(c09762.m2303()).find();
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$へぬ〴づぞ, reason: contains not printable characters */
    public static final class C0951 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5263;

        public C0951(String str) {
            this.f5263 = C1687.m3717(str);
        }

        public String toString() {
            return String.format(":contains(%s)", this.f5263);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return C1687.m3717(c09762.m2304()).contains(this.f5263);
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぺぁあねじ, reason: contains not printable characters */
    public static final class C0952 extends AbstractC0931 {
        public C0952(String str, String str2) {
            super(str, str2);
        }

        public String toString() {
            return String.format("[%s!=%s]", this.f5255, this.f5254);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            return !this.f5254.equalsIgnoreCase(c09762.mo2278(this.f5255));
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぺづげぺが, reason: contains not printable characters */
    public static final class C0953 extends AbstractC0917 {
        public String toString() {
            return ":root";
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            if (c0976 instanceof C0958) {
                c0976 = c0976.m2301().get(0);
            }
            return c09762 == c0976;
        }
    }

    /* renamed from: いいにぽつ.〺つふすそ.なぎぱいぢぎ.びぐびあび$ぺふねづ〺, reason: contains not printable characters */
    public static final class C0954 extends AbstractC0917 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public String f5264;

        public C0954(String str) {
            this.f5264 = str;
        }

        public String toString() {
            return String.format(".%s", this.f5264);
        }

        @Override // p015.p016.p019.AbstractC0917
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2237(C0976 c0976, C0976 c09762) {
            String str = this.f5264;
            String m2258 = c09762.mo2287().m2258("class");
            int length = m2258.length();
            int length2 = str.length();
            if (length != 0 && length >= length2) {
                if (length == length2) {
                    return str.equalsIgnoreCase(m2258);
                }
                boolean z = false;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (Character.isWhitespace(m2258.charAt(i2))) {
                        if (!z) {
                            continue;
                        } else {
                            if (i2 - i == length2 && m2258.regionMatches(true, i, str, 0, length2)) {
                                return true;
                            }
                            z = false;
                        }
                    } else if (!z) {
                        i = i2;
                        z = true;
                    }
                }
                if (z && length - i == length2) {
                    return m2258.regionMatches(true, i, str, 0, length2);
                }
            }
            return false;
        }
    }

    /* renamed from: げつ〴ぬぐ */
    public abstract boolean mo2237(C0976 c0976, C0976 c09762);
}
