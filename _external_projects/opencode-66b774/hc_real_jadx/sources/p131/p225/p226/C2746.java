package p131.p225.p226;

import com.trilead.ssh2.crypto.CryptoWishList;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import p034.p095.C1687;
import p131.p225.p226.p228.C2731;
import p131.p225.p226.p230.C2749;
import p131.p225.p226.p231.C2754;
import p131.p225.p226.p232.C2760;
import p131.p225.p226.p232.C2761;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2746 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final int f10317;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2754 f10318;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final String f10319;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public SecureRandom f10322;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C2760 f10325;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C2731 f10326;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f10321 = false;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public CryptoWishList f10323 = new CryptoWishList();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2772 f10324 = new C2772();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public InterfaceC2700 f10320 = null;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public Vector f10327 = new Vector();

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public final class C2747 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f10329 = false;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f10328 = false;

        public C2747(C2746 c2746) {
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC2748 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ C2747 f10330;

        public RunnableC2748(C2747 c2747) {
            this.f10330 = c2747;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f10330) {
                C2747 c2747 = this.f10330;
                if (c2747.f10329) {
                    return;
                }
                c2747.f10328 = true;
                C2746.this.f10326.m4673(new SocketTimeoutException(Crypt.a(Crypt.xrc("H6mLeo\u001a79\u001bfjAa=\u001a0m\u0019j;I6kI4:L4=Lj:H0jJ3=Lak\u001abgIglH`j\u001cgfMa;\u001bd<Odk@"))), false);
            }
        }
    }

    public C2746(String str, int i) {
        this.f10319 = str;
        this.f10317 = i;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public synchronized void m4714(InterfaceC2700 interfaceC2700) {
        this.f10320 = interfaceC2700;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public synchronized boolean m4715(String str, String str2) {
        boolean m4724;
        C2731 c2731 = this.f10326;
        if (c2731 == null) {
            throw new IllegalStateException(Crypt.a(Crypt.xrc("MakO`hK4lJeg\u001e3nMkh\u001bg=Lf<\u001d3kLagHa;\u0019g>K7gI`nH3;M4gNjk@3iM7i@3oIj:O")));
        }
        if (this.f10321) {
            throw new IllegalStateException(Crypt.a(Crypt.xrc("KkiLjnK1m\u001cegH4hKcmJcf@7o\u001d1>K0jO6=N`;\u001ecg\u001b7i\u001cclOfl\u001c1=\u001ekg\u001ck:\u001db:Jck@j:Me>H6=A`hOj9N4f\u001b`;\u00196jKbg\u001ccgJfi")));
        }
        if (this.f10318 == null) {
            this.f10318 = new C2754(c2731);
        }
        if (this.f10325 == null) {
            this.f10325 = new C2760(this.f10326);
        }
        if (str == null) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("\u001b1nN`9@79L0=@ko\u001bbnJbj\u001b0nO3<L7>Ib=\u001c0>\u001dejAkk\u001cdjAb9A3m\u001bbi\u001ck9JdnIg;I")));
        }
        if (str2 == null) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("NdgLcf\u001c7g\u001a1kM1n\u001c3h@ef\u001efg\u001bk=AdoO1:IdkNdg\u001c4;Kg:@49N3f\u001aen\u001c3g\u001dgnIakK")));
        }
        m4724 = this.f10318.m4724(str, str2);
        this.f10321 = m4724;
        return m4724;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public synchronized String[] m4716(String str) {
        C2754 c2754;
        try {
            if (str == null) {
                throw new IllegalArgumentException(Crypt.a(Crypt.xrc("\u001eemI1<OkjO7gNj>I7hOc:Oj>Ie=\u001dkk\u001afmL0k\u001c`j\u001d4fJ1n@`;\u00190:\u001b`i@a:N3mO3mK")));
            }
            C2731 c2731 = this.f10326;
            if (c2731 == null) {
                throw new IllegalStateException(Crypt.a(Crypt.xrc("MakO`hK4lJeg\u001e3nMkh\u001bg=Lf<\u001d3kLagHa;\u0019g>K7gI`nH3;M4gNjk@3iM7i@3oIj:O")));
            }
            if (this.f10321) {
                throw new IllegalStateException(Crypt.a(Crypt.xrc("KkiLjnK1m\u001cegH4hKcmJcf@7o\u001d1>K0jO6=N`;\u001ecg\u001b7i\u001cclOfl\u001c1=\u001ekg\u001ck:\u001db:Jck@j:Me>H6=A`hOj9N4f\u001b`;\u00196jKbg\u001ccgJfi")));
            }
            if (this.f10318 == null) {
                this.f10318 = new C2754(c2731);
            }
            if (this.f10325 == null) {
                this.f10325 = new C2760(this.f10326);
            }
            c2754 = this.f10318;
            c2754.m4725(str);
        } catch (Throwable th) {
            throw th;
        }
        return c2754.f10342;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m4717(Throwable th, boolean z) {
        Vector vector;
        C2760 c2760 = this.f10325;
        if (c2760 != null) {
            c2760.getClass();
            C2773 c2773 = C2760.f10361;
            c2773.getClass();
            c2773.m4754(50, Crypt.a(Crypt.xrc("KakHc<\u001dc>Md;L`n\u001d0hLgo\u001adfLdh\u001ec<@ffJeh\u001e0mI6:Jg;\u00196gJ4iIgk\u001e1f@0:Lan\u001a")));
            synchronized (c2760.f10365) {
                vector = (Vector) c2760.f10365.clone();
            }
            for (int i = 0; i < vector.size(); i++) {
                try {
                    c2760.m4739((C2761) vector.elementAt(i), Crypt.a(Crypt.xrc("KakHc<\u001dc>Md;L`n\u001d0hLgo\u001adfLdh\u001ec<@ffJeh\u001e0mI6:Jg;\u00196gJ4iIgk\u001e1f@0:Lan\u001a")), true);
                } catch (IOException unused) {
                }
            }
        }
        C2731 c2731 = this.f10326;
        if (c2731 != null) {
            c2731.m4673(th, !z);
            this.f10326 = null;
        }
        this.f10318 = null;
        this.f10325 = null;
        this.f10321 = false;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public synchronized void m4718(InterfaceC2745 interfaceC2745) {
        this.f10327.addElement(interfaceC2745);
        C2731 c2731 = this.f10326;
        if (c2731 != null) {
            Vector vector = this.f10327;
            synchronized (c2731) {
                c2731.f10275 = (Vector) vector.clone();
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public synchronized C2753 m4719(int i) {
        if (this.f10326 == null) {
            throw new IllegalStateException(Crypt.a(Crypt.xrc("Mgl@c;M1gOch\u00197kK3nIbo\u001d1mK`;\u001e3m\u001ee;I7=\u001aj=M4>Ofg\u001bekMe=\u0019a=I7l\u001e`>@`k\u001c`m\u001b0j\u0019kf\u001dbg\u001d7:\u001dklLk;\u001c`<Njl\u001djkHkfKenL4fM1kL3l\u0019c<L1oI6<\u001a`9\u001ef=\u001b0<\u001e7")));
        }
        if (!this.f10321) {
            throw new IllegalStateException(Crypt.a(Crypt.xrc("Mgl@c;M1gOch\u00197kK3nIbo\u001d1mK`;\u001e3m\u001eelOc=Od:\u001ebl\u001b0m\u001eko\u001b1;@1<\u001b7jK1kLdg\u001a0hA7m\u001a0iNgo\u001b7mNd=\u001e`>AgiHg<@1=\u001aj<JdgA`oI0g\u001dbgM`9\u001cgi\u001c0;A7f\u001d1l\u001b6lHc")));
        }
        return new C2753(this.f10325, i);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final SecureRandom m4720() {
        SecureRandom secureRandom;
        if (this.f10322 == null) {
            try {
                secureRandom = SecureRandom.getInstance(Crypt.a(Crypt.xrc("Ka>\u001bal\u001a4=\u001e6mH1:IgfAahI1j\u0019bhI7kMj")));
            } catch (NoSuchAlgorithmException unused) {
                secureRandom = new SecureRandom();
            }
            this.f10322 = secureRandom;
        }
        return this.f10322;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public synchronized C2698 m4721(InterfaceC2775 interfaceC2775, int i, int i2, int i3) {
        C2698 m4680;
        if (this.f10326 != null) {
            throw new IOException(Crypt.a(Crypt.xrc("I7kM3l\u001dg:Ad>\u001ed=MkgN`>\u001a3;\u001djiL79K`")) + this.f10319 + Crypt.a(Crypt.xrc("O1g\u0019g9\u001ce>\u001b`oNb:\u001e`l\u001dek\u001efjMf=J`:AglJa:Jdj\u001ae:L4>L4:Og<IdlA7m\u001djo\u001d3:\u001e")));
        }
        if (i < 0) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("J`=A0iJ7m\u001be;\u001df=\u001afgL6o\u001c3mAk:J49I`l\u001cggObn\u001e0oJb<\u0019d<\u001a6jM3gJ7g\u00191:K7nO3jObj\u001dcn\u001cj9J1=\u001b0<\u001ce:Md>Hk:La=\u001e7<")));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("LjhKkfMko\u001c1g\u001dbjAa:\u001b09L1i\u001ck<Kj>\u001a7hL4iHaf\u001b7;@dgNakN4nA7iO7i\u001d0jN6g\u00197:\u001b0=Nj;Nc;@0i\u001e0:\u001cd:Ngo\u001bg=\u0019diJdf")));
        }
        C2747 c2747 = new C2747(this);
        C2749.C2751 c2751 = null;
        C2731 c2731 = new C2731(this.f10319, this.f10317, null);
        this.f10326 = c2731;
        Vector vector = this.f10327;
        synchronized (c2731) {
            c2731.f10275 = (Vector) vector.clone();
        }
        synchronized (this.f10326) {
        }
        if (i3 > 0) {
            try {
                try {
                    c2751 = C2749.m4723(System.currentTimeMillis() + i3, new RunnableC2748(c2747));
                } catch (SocketTimeoutException e) {
                    throw e;
                }
            } catch (IOException e2) {
                m4717(new Throwable(Crypt.a(Crypt.xrc("Ig:\u001b1>\u001e7kOef@eo\u001de:J6i\u001ejlJ0h\u001den\u001cfi\u001egfAa=K3:Jfm\u0019gnOahJ4mKki\u001bdm\u001afk\u001e1fMao\u0019gn\u00194nN3n@3mH1j\u001c0kO0iKc:Lfn"))).initCause(e2), false);
                synchronized (c2747) {
                    if (c2747.f10328) {
                        throw new SocketTimeoutException(Crypt.a(Crypt.xrc("\u001eaj\u00191o\u00190lK1h\u001eggNkjAfl\u001ed;NaiNa=\u001cjl\u001cjh@jgA19Nf>M6iMj:HbmIjj\u001ecl\u001c4:\u0019")) + i3 + Crypt.a(Crypt.xrc("Lcn\u001d3iH1n\u001dfnJkoN6h\u001cjhMj:I0kKggAa")));
                    }
                    if (e2 instanceof C2699) {
                        throw e2;
                    }
                    throw ((IOException) new IOException(Crypt.a(Crypt.xrc("Ig:\u001b1>\u001e7kOef@eo\u001de:J6i\u001ejlJ0h\u001den\u001cf:KbkL7m\u001akl\u001cki\u001b3l\u001cj;\u001cbmN6=Abi\u001bgi\u001b7;\u001cd<LdgL3kJd<\u001bfiO`jMjnHgoL3hMkm")) + this.f10319 + Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")) + this.f10317).initCause(e2));
                }
            }
        }
        C2749.C2751 c27512 = c2751;
        try {
            this.f10326.m4672(this.f10323, interfaceC2775, this.f10324, i, i2, m4720(), this.f10320);
            this.f10326.f10272.setTcpNoDelay(false);
            m4680 = this.f10326.m4680(1);
            if (c27512 != null) {
                C2749.m4722(c27512);
                synchronized (c2747) {
                    if (c2747.f10328) {
                        throw new IOException(Crypt.a(Crypt.xrc("Hjk\u001bjmJ4nIbl\u0019ah\u001a4=Ldn\u001a3=Jd=Jk>Kdn@3iAf=\u001eki@en\u0019jjO`>H4lK79\u001a1hA1:Ha9LcfAfhJ`;\u001e`i\u001a0lN6<Agk\u001d3fKkfOko@4=\u001ee>J`i\u0019fj\u001ekh\u00190>\u001e`=Oa9K`n@e;\u001da")));
                    }
                    c2747.f10329 = true;
                }
            }
            C1687.m3666("", Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("Nbh\u001b7l\u001cfiOd9\u001efkJd9MafK3=KkmHdlJjn\u001ekjKf:\u001a1m\u001b3;\u001d1<\u001a4;I1hMd9@fi\u001ddjN")) + m4680.f10194);
            C1687.m3666("", Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")) + new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("AdlA3o\u0019`g\u001e6;KkgN6nJ4i\u0019b<K7n\u001eg<Je<\u001d6g\u001d3f\u001d1lLkn\u001c7n\u001ej=O7o@boA7g\u001a6fI")) + m4680.f10192 + Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd")) + m4680.f10193);
        } catch (SocketTimeoutException e3) {
            throw ((SocketTimeoutException) new SocketTimeoutException(Crypt.a(Crypt.xrc("\u00197mAgl\u001e`>\u001db>\u001abn\u001aj>@d:AfjNfm\u001d`o\u001a4:O`gN3iHei\u0019cj\u0019e9\u001dgl\u001cflO4nLdgIdj@foObi\u001beiM0i\u001ec9I19HcmM0<L0j\u001ea<KcnO3j\u001a7f\u001dfgLg=\u001b3mL1<O09\u001bfl\u001cb:JkoOg"))).initCause(e3));
        }
        return m4680;
    }
}
