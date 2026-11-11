package p131.p225.p226.p231;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Vector;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p034.p095.C1687;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.p228.C2731;
import p131.p225.p226.p228.InterfaceC2737;
import p131.p225.p226.p229.C2742;
import p131.p225.p226.p229.C2744;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.てぜきぽく.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2754 implements InterfaceC2737 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2731 f10341;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String f10344;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Vector f10338 = new Vector();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f10340 = false;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String[] f10342 = new String[0];

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f10343 = false;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f10339 = false;

    public C2754(C2731 c2731) {
        this.f10341 = c2731;
    }

    @Override // p131.p225.p226.p228.InterfaceC2737
    /* renamed from: 〺つふすそ */
    public void mo4665(Throwable th) {
        synchronized (this.f10338) {
            this.f10340 = true;
            this.f10338.notifyAll();
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m4724(String str, String str2) {
        boolean z;
        try {
            m4725(str);
            String[] strArr = this.f10342;
            String a = Crypt.a(Crypt.xrc("M3kN3kJ7mJ6m\u001akm\u0019bj\u0019j;K6o@jjH3;\u0019c"));
            if (strArr != null) {
                for (String str3 : strArr) {
                    if (str3.compareTo(a) == 0) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001bejN1<@3;HgiMjj\u0019ehO4lHbgO7n\u001c4<H`fIe>@afMj9@69OelJ`nI7fOdmH0mM6lL3>Ado\u001dkjK4k@dkNe=\u001c1g\u001ckfLdo\u001a1l\u0019`oI7m\u0019`<\u0019bfLd;Ng=H6n\u001ecnLf<\u001ca>Je9IfkN`o\u001ad>AahLe>\u001efn@1:N1o@jmMbiL0<\u001e")));
            }
            String a2 = Crypt.a(Crypt.xrc("I7l\u001dkjOkkIenHk;\u001af:J7g\u0019ji\u001beo\u001d4oO7"));
            C2731 c2731 = this.f10341;
            C2744 c2744 = new C2744();
            c2744.m4712(50);
            c2744.m4705(str);
            c2744.m4705(a2);
            c2744.m4705(a);
            c2744.m4708(false);
            c2744.m4705(str2);
            c2731.m4683(c2744.m4709());
            byte[] m4726 = m4726();
            if (m4726[0] == 52) {
                this.f10343 = true;
                this.f10341.m4685(this, 0, Base64.BASELENGTH);
                return true;
            }
            byte b = m4726[0];
            String a3 = Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"));
            if (b != 51) {
                throw new IOException(Crypt.a(Crypt.xrc("KblKagK3nAdlIb9I1gO6hK7>A6:K7fM1>Hbo\u001e39MciKffLjoI09K3iI3:Ag;Lam\u001b")) + ((int) m4726[0]) + a3);
            }
            int length = m4726.length;
            System.arraycopy(m4726, 0, new byte[length], 0, length);
            C2742 c2742 = new C2742(m4726, 0, length);
            int m4693 = c2742.m4693();
            if (m4693 != 51) {
                throw new IOException(Crypt.a(Crypt.xrc("M4:\u001dcfMk;N6mLf>H0:\u001b3m\u001e`;Laj\u001aj<M3f\u0019g>@0<\u00196:\u001dbmK4iNc:Ok=N`:K6f\u001c3=O`>\u001ea<\u001c3;\u0019`<\u001a0nOfm\u001egjIf;ManO0iJeo")) + m4693 + a3);
            }
            String[] m4699 = c2742.m4699();
            c2742.m4697();
            if (c2742.m4695() != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("@4;OkgKko\u001ek=Ig=\u00196>HcnM4>LehA`;\u001ag;J69\u001b4iH6h\u001ag<Je<O69\u001cbkIci\u001cd9\u001bjh\u00197=\u001ed:@a>OfgKjmO6hL1gMagMdl\u001e`<\u001cgk")));
            }
            this.f10342 = m4699;
            return false;
        } catch (IOException e) {
            this.f10341.m4673(e, false);
            throw new IOException(Crypt.a(Crypt.xrc("\u001bk;O`=Jg;I7lIb;Mc<OkmLcmMg>\u001e`f\u001aco\u001b7i\u001ccm\u001a19Nfo\u001djo\u001efhKgkH4:J1h\u001e`kO")), e);
        }
    }

    @Override // p131.p225.p226.p228.InterfaceC2737
    /* renamed from: げつ〴ぬぐ */
    public void mo4668(byte[] bArr, int i) {
        synchronized (this.f10338) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            this.f10338.addElement(bArr2);
            this.f10338.notifyAll();
            if (this.f10338.size() > 5) {
                this.f10340 = true;
                throw new IOException(Crypt.a(Crypt.xrc("Jj>\u001b7jK4i\u001aj:\u0019gn\u001dgoMd9L6k\u001bkn\u00194:Mj<Jc;\u001cb<\u001aag\u001a3h\u00191f\u001bj9K6kIenA3j\u001eak@gm\u001eb9M1kN3o\u0019gkMbn\u001b6oHb=\u0019d9L79\u001bbl\u001d7=A7hHb9A4j\u001bfhO0nN79Ha=Hk:Ke9\u001a6")));
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean m4725(String str) {
        if (this.f10339) {
            return this.f10343;
        }
        this.f10341.m4675(this, 0, Base64.BASELENGTH);
        C2731 c2731 = this.f10341;
        C2744 c2744 = new C2744();
        c2744.m4712(5);
        c2744.m4705(Crypt.a(Crypt.xrc("M0k\u001cgoLjoK4:\u001eejK7k\u001ado\u001cg;M4gN4>\u001ba")));
        c2731.m4683(c2744.m4709());
        C2731 c27312 = this.f10341;
        C2744 c27442 = new C2744();
        c27442.m4712(50);
        c27442.m4705(str);
        c27442.m4705(Crypt.a(Crypt.xrc("I7l\u001dkjOkkIenHk;\u001af:J7g\u0019ji\u001beo\u001d4oO7")));
        c27442.m4705(Crypt.a(Crypt.xrc("\u001aaiHg:A4m\u001cb;MakI3lH7i\u001dj:Kj<\u0019kgNj")));
        c27312.m4683(c27442.m4709());
        byte[] m4726 = m4726();
        int length = m4726.length;
        System.arraycopy(m4726, 0, new byte[length], 0, length);
        C2742 c2742 = new C2742(m4726, 0, length);
        int m4693 = c2742.m4693();
        String a = Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"));
        if (m4693 != 6) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("M4:\u001dcfMk;N6mLf>H0:\u001b3m\u001e`;Laj\u001aj<M3iMboH39\u001aj>KjmM7kJ4j\u001e3<L7f\u001ej=\u001e49\u001afl\u001bgl\u0019e9N1jJ7;H69LggMekNkoMb=@1>")), m4693, a));
        }
        if (c2742.m4695() > 0) {
            c2742.m4694();
        }
        if (c2742.m4695() != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("@4;OkgKko\u001ek=Ig=\u00196>HcnM4>LehA`;\u001aglAc9\u00197>N6iHgn\u001ae>\u001dfg@39Oa=M1nOe:Mf;\u001bdj\u001eagA0mLj:\u001b`hLamO3nNcm\u001d`m\u001c0l")));
        }
        byte[] m47262 = m4726();
        this.f10339 = true;
        if (m47262[0] == 52) {
            this.f10343 = true;
            this.f10341.m4685(this, 0, Base64.BASELENGTH);
            return true;
        }
        if (m47262[0] != 51) {
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("KblKagK3nAdlIb9I1gO6hK7>A6:K7fM1>Hbo\u001e39MciKffLjoI09K3iI3:Ag;Lam\u001b")));
            m4207.append((int) m47262[0]);
            m4207.append(a);
            throw new IOException(m4207.toString());
        }
        int length2 = m47262.length;
        System.arraycopy(m47262, 0, new byte[length2], 0, length2);
        C2742 c27422 = new C2742(m47262, 0, length2);
        int m46932 = c27422.m4693();
        if (m46932 != 51) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("M4:\u001dcfMk;N6mLf>H0:\u001b3m\u001e`;Laj\u001aj<M3f\u0019g>@0<\u00196:\u001dbmK4iNc:Ok=N`:K6f\u001c3=O`>\u001ea<\u001c3;\u0019`<\u001a0nOfm\u001egjIf;ManO0iJeo")), m46932, a));
        }
        String[] m4699 = c27422.m4699();
        c27422.m4697();
        if (c27422.m4695() != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("@4;OkgKko\u001ek=Ig=\u00196>HcnM4>LehA`;\u001ag;J69\u001b4iH6h\u001ag<Je<O69\u001cbkIci\u001cd9\u001bjh\u00197=\u001ed:@a>OfgKjmO6hL1gMagMdl\u001e`<\u001cgk")));
        }
        this.f10342 = m4699;
        return false;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public byte[] m4726() {
        byte[] bArr;
        while (true) {
            synchronized (this.f10338) {
                while (this.f10338.size() == 0) {
                    if (this.f10340) {
                        throw new IOException(Crypt.a(Crypt.xrc("AjmOa9\u001ej9\u001acgKgmJ0m\u001adk@4l\u00190hL4iK0fO1oM6iK1l\u0019a<LkkM79\u001c7;M39\u001dkk\u001de=\u0019")), this.f10341.m4674());
                    }
                    try {
                        this.f10338.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                bArr = (byte[]) this.f10338.firstElement();
                this.f10338.removeElementAt(0);
            }
            if (bArr[0] != 53) {
                return bArr;
            }
            int length = bArr.length;
            System.arraycopy(bArr, 0, new byte[length], 0, length);
            C2742 c2742 = new C2742(bArr, 0, length);
            int m4693 = c2742.m4693();
            if (m4693 != 53) {
                throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("M4:\u001dcfMk;N6mLf>H0:\u001b3m\u001e`;Laj\u001aj<M3l\u00193jM0>\u001e`g@c:\u001eao\u001ddiJfj@kn\u001d3g@c<\u001aei\u00197hIch\u001d6gNdfIk<Agk\u001bf;\u00196fN3kAbj")), m4693, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
            }
            String m4692 = c2742.m4692(Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")));
            c2742.m4694();
            if (c2742.m4695() != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("@4;OkgKko\u001ek=Ig=\u00196>HcnM4>LehA`;\u001ag=\u0019g9Af>Kef\u001ddlOkhObmJcoNjoLf>J`i\u001b0>N4hM`m\u001b4:\u001a4g\u001dcjNcj\u001be:I4;\u001ae>J1=")));
            }
            this.f10344 = m4692;
            if (!m4692.isEmpty()) {
                String a = Crypt.a(Crypt.xrc("@kl\u001c0n\u001ckfIfgJj=Igj\u001d4jK7l\u001a0=NjjKk"));
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                C2098.m4199(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()), m4207, Crypt.a(Crypt.xrc("I`jJ`>@7:N6=I1=Oj;\u001ddn\u001aem\u00193nKd:Ik;\u001bagJ`:A0;La9Ja9La9LfiJfl\u001adgL6hJ")));
                m4207.append(this.f10344.trim());
                C1687.m3666(a, m4207.toString());
            }
        }
    }
}
