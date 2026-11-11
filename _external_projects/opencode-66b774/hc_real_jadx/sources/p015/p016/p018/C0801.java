package p015.p016.p018;

import java.util.Arrays;
import p015.p016.p018.AbstractC0788;

/* renamed from: いいにぽつ.〺つふすそ.づざかべべ.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0801 {

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final char[] f5073;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final int[] f5074 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0828 f5076;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public String f5081;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0827 f5083;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AbstractC0788 f5088;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public AbstractC0788.AbstractC0798 f5090;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public EnumC0833 f5082 = EnumC0833.f5165;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f5084 = false;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f5086 = null;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public StringBuilder f5077 = new StringBuilder(1024);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public StringBuilder f5075 = new StringBuilder(1024);

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public AbstractC0788.C0789 f5078 = new AbstractC0788.C0789();

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public AbstractC0788.C0791 f5091 = new AbstractC0788.C0791();

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public AbstractC0788.C0793 f5085 = new AbstractC0788.C0793();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public AbstractC0788.C0795 f5087 = new AbstractC0788.C0795();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public AbstractC0788.C0797 f5089 = new AbstractC0788.C0797();

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final int[] f5079 = new int[1];

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final int[] f5080 = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f5073 = cArr;
        Arrays.sort(cArr);
    }

    public C0801(C0827 c0827, C0828 c0828) {
        this.f5083 = c0827;
        this.f5076 = c0828;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m2170(EnumC0833 enumC0833) {
        if (this.f5076.m2212()) {
            this.f5076.add(new C0831(this.f5083.m2207(), "Unexpectedly reached end of file (EOF) in input state [%s]", enumC0833));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d0, code lost:
    
        if (r13.f5083.m2197('=', '-', '_') == false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a2  */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] m2171(java.lang.Character r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.p016.p018.C0801.m2171(java.lang.Character, boolean):int[]");
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m2172() {
        AbstractC0788.AbstractC0798 abstractC0798 = this.f5090;
        if (abstractC0798.f5036 != null) {
            abstractC0798.m2128();
        }
        m2177(this.f5090);
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m2173(EnumC0833 enumC0833) {
        if (this.f5076.m2212()) {
            this.f5076.add(new C0831(this.f5083.m2207(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f5083.m2196()), enumC0833));
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AbstractC0788.AbstractC0798 m2174(boolean z) {
        AbstractC0788.AbstractC0798 abstractC0798;
        if (z) {
            abstractC0798 = this.f5078;
            abstractC0798.mo2117();
        } else {
            abstractC0798 = this.f5091;
            abstractC0798.mo2117();
        }
        this.f5090 = abstractC0798;
        return abstractC0798;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m2175(String str) {
        if (this.f5076.m2212()) {
            this.f5076.add(new C0831(this.f5083.m2207(), "Invalid character reference: %s", str));
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m2176(String str) {
        if (this.f5086 == null) {
            this.f5086 = str;
            return;
        }
        if (this.f5077.length() == 0) {
            this.f5077.append(this.f5086);
        }
        this.f5077.append(str);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m2177(AbstractC0788 abstractC0788) {
        if (this.f5084) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f5088 = abstractC0788;
        this.f5084 = true;
        AbstractC0788.EnumC0792 enumC0792 = abstractC0788.f5014;
        if (enumC0792 == AbstractC0788.EnumC0792.StartTag) {
            this.f5081 = ((AbstractC0788.C0789) abstractC0788).f5030;
        } else {
            if (enumC0792 != AbstractC0788.EnumC0792.EndTag || ((AbstractC0788.C0791) abstractC0788).f5032 == null) {
                return;
            }
            m2179("Attributes incorrectly present on end tag");
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2178(char c) {
        m2176(String.valueOf(c));
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m2179(String str) {
        if (this.f5076.m2212()) {
            this.f5076.add(new C0831(this.f5083.m2207(), str));
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean m2180() {
        return this.f5081 != null && this.f5090.m2125().equalsIgnoreCase(this.f5081);
    }
}
