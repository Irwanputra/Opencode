package p131.p225.p226.p232;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.Vector;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.p228.C2731;
import p131.p225.p226.p228.InterfaceC2737;
import p131.p225.p226.p229.C2742;
import p131.p225.p226.p229.C2744;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.のぷのちつ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2760 implements InterfaceC2737 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final C2773 f10361 = new C2773(C2760.class);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2731 f10363;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public HashMap f10366 = new HashMap();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Vector f10365 = new Vector();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f10369 = 100;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f10367 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f10368 = 0;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public HashMap f10364 = new HashMap();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Vector f10362 = new Vector();

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f10370 = true;

    public C2760(C2731 c2731) {
        this.f10363 = c2731;
        c2731.m4675(this, 80, 100);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m4728(byte[] bArr, int i) {
        if (i <= 9) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001db>JfkIa>I7i\u001bdj@fgAknJkh@blHejAci@`hJgg\u001a`m\u001ekg\u001c3l\u001d3>\u001ajh\u0019`<Ad<AklH6h")), i, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        int i2 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i3 = (bArr[8] & Base64.BASELENGTH) | ((bArr[5] & Base64.BASELENGTH) << 24) | ((bArr[6] & Base64.BASELENGTH) << 16) | ((bArr[7] & Base64.BASELENGTH) << 8);
        C2761 m4735 = m4735(i2);
        if (m4735 == null) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3=N3=\u001b0>\u001e7kL7fK0<\u001e1;\u001bkg@ej\u001c7iIbj\u001dcjJ3=\u001cajKb;Nko\u001c`>I6o@b9KgfL`lK6g\u001aalH3j\u001a3:\u001c`;LekLclOkk\u001cki\u001b1hM4:A19@3=\u0019c>IbjJ4f\u001c6i\u001cakObkJe>Hao\u001bkk\u0019")), i2));
        }
        int i4 = i - 9;
        if (i3 != i4) {
            throw new IOException(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001db>JfkIa>I7i\u001bdj@fgAknJkh@blHejAci@`=MflJfg\u001c4h\u001d6g\u001cbfI0m\u001b1<\u0019f>L3>Jeg\u001d3nM3f\u001c4=K0nH4gH`l\u001d4:\u001b0hIjiJ1h\u001a`")) + i4 + Crypt.a(Crypt.xrc("Hc;\u001cg;@dnAbn\u001bgnO`=\u001e7h@jn\u001a7>\u001b3gJ6")) + i3 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
        }
        C2773 c2773 = f10361;
        c2773.getClass();
        c2773.m4754(80, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@kn@1n\u001cf<A0h\u001bkmM7iI6l\u001cdiOel\u001c6mHgkAdn@3<\u0019efIa<@a<AkgAejM7g\u001ea;K`kLao")) + i2 + Crypt.a(Crypt.xrc("\u001ej=\u001cdmNj<\u001ed<\u001cjfLfg\u001dc;L3k\u001cg>H3mKb")) + i3 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
        synchronized (m4735) {
            int i5 = m4735.f10392;
            if (i5 == 4) {
                return;
            }
            if (i5 != 2) {
                throw new IOException(Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@kk\u001agmMcm\u001d3gN`kOfh\u001cbn\u001eb<A6l\u001bb<\u001cg;Jg>N1=\u0019dfN3jJ`m\u001ca=M1mJ1n\u001a6hJf9Ab=@7=\u001e6kJfmMaoO`fKcoI7=\u001e`nHg>I3kOg")) + m4735.f10392 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
            }
            int i6 = m4735.f10390;
            if (i6 < i3) {
                throw new IOException(Crypt.a(Crypt.xrc("L`gK4=K6f\u001a4lMgiOa>OdmO69\u001b`9\u001bagOjhO3h\u001d3hLjhIdiO`nA1:Nf>JehOc;\u001d`oAdfOe<J`oA0j\u001e`9@3g\u001cb9\u0019jiIa:KbgL3:\u001dkf\u001eeg@g=\u001delOgk\u001d6jAd9HbgO4hK6f\u001a7")));
            }
            m4735.f10390 = i6 - i3;
            C2766 c2766 = m4735.f10389.f10393;
            c2766.getClass();
            try {
                c2766.m4749(bArr, 9, i3);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
    }

    @Override // p131.p225.p226.p228.InterfaceC2737
    /* renamed from: 〺つふすそ */
    public void mo4665(Throwable th) {
        C2773 c2773 = f10361;
        c2773.getClass();
        c2773.m4754(50, Crypt.a(Crypt.xrc("Ie<I0g\u0019`j\u001b4;Hgm@ai\u0019d:IalH4j\u001b4j\u001dcfK6;@3i\u001a6=\u001a3>MffN3fLjf\u00193m\u0019b=\u001a4;@")));
        synchronized (this.f10362) {
            for (int i = 0; i < this.f10362.size(); i++) {
                ((InterfaceC2758) this.f10362.elementAt(i)).mo4727();
            }
            this.f10370 = false;
        }
        synchronized (this.f10365) {
            for (int i2 = 0; i2 < this.f10365.size(); i2++) {
                C2761 c2761 = (C2761) this.f10365.elementAt(i2);
                synchronized (c2761) {
                    c2761.m4745();
                    c2761.f10392 = 4;
                    Throwable initCause = new IOException(Crypt.a(Crypt.xrc("AjmOa9\u001ej9\u001acgKgmJ0m\u001adk@4l\u00190hL4iK0i\u001cdl\u001a6k\u001e4f\u001bg>\u001b4;@dlLkj\u00193>\u001e1mMf:M0g\u001e1lKg=Hch\u001939Hgm\u001cf:Nbo\u001c0oN1n\u001dd="))).initCause(th);
                    synchronized (c2761.f10388) {
                        if (c2761.f10382 == null) {
                            c2761.f10382 = initCause;
                        }
                    }
                    c2761.notifyAll();
                }
            }
            this.f10365.setSize(0);
            this.f10365.trimToSize();
            this.f10365.notifyAll();
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m4729(byte[] bArr, int i) {
        if (i != 5) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001dbiNdlL0<K0<Aj:Ob>\u001bkm\u001bci\u001b6>L`nHck@0>A4h@a=K4gJd=M39\u001cgkL7f\u001a3nK`i@j;")), i, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        int i2 = (bArr[4] & 255) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8);
        C2761 m4735 = m4735(i2);
        if (m4735 == null) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3:O1<\u001d1;N7f@eiKklH4h\u001cj9\u001cg<I4h\u001ek;@`o\u001ekg\u001aflIflObfAfl\u001dd>@1i\u001c0f\u001eegJejLa;O`l\u001b3<@4nK6;Nd:\u001e0=\u001ack\u001bg;H3hKkfJk>Hgg\u001d7f\u001bf=@3<O4:KkfH0nHgm\u001bam\u001b")), i2));
        }
        synchronized (m4735) {
            m4735.m4745();
            m4735.f10392 = 4;
            m4735.m4744(Crypt.a(Crypt.xrc("N`<N3j\u0019`<\u0019gm\u001cf:I0n\u001b0:Ia:Och@khK4jK6g@g;\u001c1<Ak>Lfg\u001c39L7g\u0019f=\u001b7>Ig=L")));
            m4731(m4735.f10386);
            m4735.notifyAll();
        }
        C2773 c2773 = f10361;
        c2773.getClass();
        c2773.m4754(50, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@khHao@f=@1>\u00196<\u00196:\u001dgjAgfLej\u001e6lKd:A1:KfkA6iI3hIjl\u001d0l@`j\u001ck;Ig<\u001bgj@a;")) + i2 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m4730(byte[] bArr, int i) {
        if (i != 5) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001db<\u00193i\u001bki\u001bei\u001acnH3>\u001cbkHg<\u0019efK`o\u001dagMbfJ3hK1n\u001a3iI1fJciKc<A3l\u001dgnJ0fJehAa;K3>HgjAfo\u001ee=L0<\u001dai@ckJf:HegK3")), i, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        int i2 = (bArr[4] & 255) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8);
        C2761 m4735 = m4735(i2);
        if (m4735 == null) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3h\u0019bkH19Ifh\u001b7mNdo\u001e4<Lco@amIef@0:@jf\u001e3fKamHaf\u0019g>K`kIfh\u001c6<NknN4jLf;\u001dk;\u001afj\u00190lMei\u00194n\u001a1gHd;\u001ak=OjhAd<L0;M1=\u0019fhOajM1g\u001egjLe9\u00196gL7g\u00194=J7mL")), i2));
        }
        synchronized (m4735) {
            m4735.f10387++;
            m4735.notifyAll();
        }
        C2773 c2773 = f10361;
        c2773.getClass();
        c2773.m4754(50, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@k=\u001dan\u001c0m\u001cdn\u001ekjI0hJ3<\u00196o\u001a3n@7mH`=IjkIgfAfl\u001dg;\u001edo\u0019b;\u001dj;\u001bgl\u0019b;O4iJd<")) + i2 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final void m4731(int i) {
        synchronized (this.f10365) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f10365.size()) {
                    break;
                }
                if (((C2761) this.f10365.elementAt(i2)).f10386 == i) {
                    this.f10365.removeElementAt(i2);
                    break;
                }
                i2++;
            }
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void m4732(C2761 c2761) {
        synchronized (c2761) {
            if (c2761.f10392 != 1) {
                return;
            }
            c2761.f10392 = 2;
            int i = c2761.f10375;
            int i2 = c2761.f10386;
            int i3 = c2761.f10390;
            int i4 = c2761.f10377;
            synchronized (c2761.f10373) {
                if (c2761.f10391) {
                    return;
                }
                C2731 c2731 = this.f10363;
                C2744 c2744 = new C2744();
                c2744.m4712(91);
                c2744.m4713(i);
                c2744.m4713(i2);
                c2744.m4713(i3);
                c2744.m4713(i4);
                c2731.m4683(c2744.m4709());
            }
        }
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C2761 m4733(String str, int i, String str2, int i2) {
        int m4734;
        int i3;
        C2761 c2761 = new C2761(this);
        synchronized (c2761) {
            m4734 = m4734(c2761);
            c2761.f10386 = m4734;
        }
        int i4 = c2761.f10390;
        int i5 = c2761.f10377;
        C2731 c2731 = this.f10363;
        C2744 c2744 = new C2744();
        c2744.m4712(90);
        c2744.m4705(Crypt.a(Crypt.xrc("O1;H7k\u00193j@1jO1i\u001bdo@dgIfj\u001cgfOg;L7")));
        c2744.m4713(m4734);
        c2744.m4713(i4);
        c2744.m4713(i5);
        c2744.m4705(str);
        c2744.m4713(i);
        c2744.m4705(str2);
        c2744.m4713(i2);
        c2731.m4683(c2744.m4709());
        synchronized (c2761) {
            while (true) {
                i3 = c2761.f10392;
                if (i3 != 1) {
                    break;
                }
                try {
                    c2761.wait();
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                }
            }
            if (i3 != 2) {
                m4731(c2761.f10386);
                throw m4737(Crypt.a(Crypt.xrc("J7g\u0019k=A3iJ`jI1iIbn\u001b3=Ag;@1=\u001be9AgmNjkOkl\u001bekIekLdl\u001b3kH1l@6f\u001a7>\u001ajiA")) + c2761.f10392 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")), c2761);
            }
        }
        return c2761;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int m4734(C2761 c2761) {
        int i;
        synchronized (this.f10365) {
            this.f10365.addElement(c2761);
            i = this.f10369;
            this.f10369 = i + 1;
        }
        return i;
    }

    @Override // p131.p225.p226.p228.InterfaceC2737
    /* renamed from: げつ〴ぬぐ */
    public void mo4668(byte[] bArr, int i) {
        byte b = bArr[0];
        switch (b) {
            case 80:
                C2742 c2742 = new C2742(bArr, 0, i);
                c2742.m4693();
                String m4694 = c2742.m4694();
                if (c2742.m4697()) {
                    this.f10363.m4679(new byte[]{82});
                }
                C2773 c2773 = f10361;
                c2773.getClass();
                c2773.m4754(80, Crypt.a(Crypt.xrc("If:\u001c0>@jlHf;Hcf@7n\u001a3>A6fMknNgoOjo\u001bfoAa:Kal\u001dfi\u0019cg\u001cfg\u001b4g\u001b`mL`9K7g\u001d")) + m4694 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
                return;
            case 81:
                synchronized (this.f10365) {
                    this.f10367++;
                    this.f10365.notifyAll();
                }
                C2773 c27732 = f10361;
                c27732.getClass();
                c27732.m4754(80, Crypt.a(Crypt.xrc("\u001dkhJjo@4j\u001d1>LemIg>Nb<\u00196oMgi@0lKflL1lL1fN3jJbk\u00193mO4gJ1>J0;Lal\u001dehM")));
                return;
            case 82:
                synchronized (this.f10365) {
                    this.f10368++;
                    this.f10365.notifyAll();
                }
                C2773 c27733 = f10361;
                c27733.getClass();
                c27733.m4754(80, Crypt.a(Crypt.xrc("\u001dkhJjo@4j\u001d1>LemIg>Nb<\u00196oMgi@0lKfn\u001ea<\u001e6h\u001dblK`kI1mNfnM0:@bgJ3fJjn\u001e")));
                return;
            default:
                switch (b) {
                    case 90:
                        m4742(bArr, i);
                        return;
                    case 91:
                        System.arraycopy(bArr, 0, new byte[i], 0, i);
                        C2742 c27422 = new C2742(bArr, 0, i);
                        int m4693 = c27422.m4693();
                        if (m4693 != 91) {
                            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("M4:\u001dcfMk;N6mLf>H0:\u001b3m\u001e`;Laj\u001aj<M3oO09\u001bf=A3i\u001a`lAdhJ4>Kek@6h@1hMehI0hMe:Hj;He9\u001e6;Ae<\u00194g\u001bjmH3>O`hNkkO1oMb<Ib;\u001bfl\u001d3>\u001a3hMg>A4i@g;H4nA6")), m4693, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
                        }
                        int m4701 = c27422.m4701();
                        int m47012 = c27422.m4701();
                        int m47013 = c27422.m4701();
                        int m47014 = c27422.m4701();
                        if (c27422.m4695() != 0) {
                            throw new IOException(Crypt.a(Crypt.xrc("@4;OkgKko\u001ek=Ig=\u00196>HcnM4>LehA`;\u001agiAd>L4i\u001d3fLag\u001c6:\u001d`k@eg@dhIgl\u001d0l@kmAklI4o\u001aff\u001a6>\u001denO3hMjkNbh\u001bbjAfnMe9\u001eel\u00193n\u001acjO6;Kk=\u001bk<\u0019c9\u001db;\u0019a<O1")));
                        }
                        C2761 m4735 = m4735(m4701);
                        if (m4735 == null) {
                            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3:Nk<Lg=Hcf@1<@ai\u001b`fHcj@e<\u001bjoNa<\u00191k\u0019fnAkm@`>M0:\u00196m\u0019ghA39M3fMj>Kb<@`j\u001bkh@09J0kMeo\u001d1lIcj@ckMck\u001edhMem\u001ej=\u0019fl\u001b1gJ6jOf9\u001bcnIdmK4=\u001e1fKgnJ")), m4701));
                        }
                        synchronized (m4735) {
                            if (m4735.f10392 != 1) {
                                throw new IOException(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3:Nk<Lg=Hcf@1<@ai\u001b`fHcj@e<\u001bjoNa<\u00191k\u0019fnAkm@`>M0:\u00196m\u0019ghA39M3fMj>Kb<\u001ed>\u001af=Ng>Jcg\u00190h@f:\u001a7fI3fN7k\u001c39O`j\u001aj=JbmJgoAboLkmM0iI09Ia:\u001ag;Abk\u001b")) + m4701);
                            }
                            m4735.f10375 = m47012;
                            m4735.f10379 = m47013 & 4294967295L;
                            m4735.f10378 = m47014;
                            m4735.f10392 = 2;
                            m4735.notifyAll();
                        }
                        C2773 c27734 = f10361;
                        c27734.getClass();
                        c27734.m4754(50, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@k:\u001bam\u001be9Jkf\u001djh\u001d0<H`;La;Nk:M4h\u001df9Nej\u001bjgI1mOj9@1fLa<\u001c1kI1fA6>Mgo\u001ekg")) + m4701 + Crypt.a(Crypt.xrc("Md:M0j\u001c4jN4lHd<\u0019jn\u001be9\u001a`lM6o\u001e1m\u001d1")) + m47012 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
                        return;
                    case 92:
                        if (i < 5) {
                            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001dbo\u001bc>I6=@7:Mfg\u001b6>\u001c4lO`lLghJkjKc;Kjh\u001cgo\u001c1fOa>Oeh@1gK`>Ng:\u001ck;\u001cjkO3k\u0019d>Aen\u001a1:Meg\u001b`oAk<K3<Hgk\u001bchMemIk")), i, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
                        }
                        C2742 c27423 = new C2742(bArr, 0, i);
                        c27423.m4693();
                        int m47015 = c27423.m4701();
                        C2761 m47352 = m4735(m47015);
                        if (m47352 == null) {
                            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3:Nk<Lg=Hcf@1<@ai\u001b`fHcj@e<\u001bjoNa<\u00194g@a9A0h\u001b3mO`i\u001b0jAc>O69@k=@`m\u001bdmOe:L`=\u0019k<\u001ccoMf>\u001c1iHg=@dfKblLjn\u001a3:JgmHe9\u001beh\u001afl\u001akiLfi\u001c09\u001a0;\u001b7=\u00193j\u001d")), m47015));
                        }
                        int m47016 = c27423.m4701();
                        String m4692 = c27423.m4692(Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")));
                        String m4185 = m47016 != 1 ? m47016 != 2 ? m47016 != 3 ? m47016 != 4 ? C2098.m4185(Crypt.a(Crypt.xrc("HfoJkj\u001ckgHflKd=M`;Ng:\u001a7m\u001abg\u001b`:\u001cc>\u001d1nL19\u001bgnAd;OakKcg\u001af<Og<N0;\u00191nL")), m47016, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))) : Crypt.a(Crypt.xrc("H0g\u001c0=\u001b0=@f:\u001b`fNcm\u001e4g\u001e3fK6:I1iAg9Kf=Mah\u001b0=Hb9\u001bknH3<\u00197lO4=I3g\u00190jO")) : Crypt.a(Crypt.xrc("JdjH0=\u001b3j\u001bjm\u001bag\u001ekhLk;Mg9\u001b4=JdjH3nNdj\u001ac>Hjf\u0019b<\u001bc>J6j\u001aeh\u001eam@fhOalA")) : Crypt.a(Crypt.xrc("Ng;H6oKj9\u001agfHkiO79Kff\u00190<KfjMk:O3m\u001cj>\u001agk\u001c1=\u001e3:@1i\u001djlAa:\u001baf\u00193i\u001ajiI")) : Crypt.a(Crypt.xrc("MelKfkJfiH3j\u001cc<\u001c4oO4n\u001c0iAf9Laj\u001aa<Ja:@djHc=Lch\u001b`j@6gO6iJgk\u001ekgL6fMd>\u001bc:Af:Oc:LggKek@ch\u001ag9\u001a`;H3<Oj;"));
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(m4692);
                        for (int i2 = 0; i2 < stringBuffer.length(); i2++) {
                            char charAt = stringBuffer.charAt(i2);
                            if (charAt < ' ' || charAt > '~') {
                                stringBuffer.setCharAt(i2, (char) 65533);
                            }
                        }
                        synchronized (m47352) {
                            m47352.m4745();
                            m47352.f10392 = 4;
                            m47352.m4744(Crypt.a(Crypt.xrc("\u0019`k\u0019foH0>N6;IgmIcg\u001a0i@6g@djO4oNkoMe:NemL7fMahAg;H1m\u001adl\u001b4nK6mO4iLa;O6:Okg\u001d0>O3oMf<K4nMj9M6lJkm\u001cb<")) + m4185 + ", '" + stringBuffer.toString() + "')");
                            m47352.notifyAll();
                        }
                        C2773 c27735 = f10361;
                        c27735.getClass();
                        c27735.m4754(50, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@k=Kj:I`9O3fJ7>\u001a0<\u001db<\u001c1hIa>\u001b`:KjkAa<Lgi\u001ddo\u001dknNfn\u001edm\u001a19\u001c69Ka:M4j\u001akm")) + m47015 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
                        return;
                    case 93:
                        m4740(bArr, i);
                        return;
                    case 94:
                        m4728(bArr, i);
                        return;
                    case 95:
                        m4741(bArr, i);
                        return;
                    case 96:
                        String a = Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"));
                        if (i != 5) {
                            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001dbgLjk\u0019k>Ib9Agk\u001a0fI0i\u001bdmL3h\u001aai\u001dekN3>\u0019a<\u001b3hJ6m\u001d`gH69@6>IamMagL3nIkg")), i, a));
                        }
                        int i3 = (bArr[4] & 255) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8);
                        C2761 m47353 = m4735(i3);
                        if (m47353 == null) {
                            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3jHafM`iNjjIa;Hgo@e9H0k@1i\u001b3kIc;Ido\u001ed9\u001a4n\u001a6i\u0019b>\u001bki\u001eb<K`<Ocf\u0019cgJa=I1g@3iNf;Ok=@d>L0j\u0019g=\u001ddo@`mNal\u001ek>\u00197>LjfLboHcjIjlLaf@19N`kO`=HknI")), i3));
                        }
                        m47353.m4745();
                        C2773 c27736 = f10361;
                        c27736.getClass();
                        c27736.m4754(50, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@k<Kfg\u001cdk\u001ddhL0=\u001b`nH7;Hkm\u001e1nLj9J7i@f>O4k\u001e7;Odf\u001d0j\u001df9\u001dcjO79\u001d0>\u001c0lLaf")) + i3 + a);
                        return;
                    case 97:
                        m4729(bArr, i);
                        return;
                    case 98:
                        m4736(bArr, i);
                        return;
                    case 99:
                        m4738(bArr, i);
                        return;
                    case 100:
                        m4730(bArr, i);
                        return;
                    default:
                        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("NfjJeiOd=O7oNc=MckHahAfl\u001den\u001e0nJch\u001adiIb=Kaf\u001b3fManIck\u001b0iK`i\u001balN6;Kdn\u001c0>Of;\u001b0l\u00194>\u001aa=IdoKcfIcjJgj\u0019e;")));
                        m4207.append(bArr[0] & 255);
                        throw new IOException(m4207.toString());
                }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C2761 m4735(int i) {
        synchronized (this.f10365) {
            for (int i2 = 0; i2 < this.f10365.size(); i2++) {
                C2761 c2761 = (C2761) this.f10365.elementAt(i2);
                if (c2761.f10386 == i) {
                    return c2761;
                }
            }
            return null;
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m4736(byte[] bArr, int i) {
        String m4187;
        StringBuilder sb;
        C2742 c2742 = new C2742(bArr, 0, i);
        c2742.m4693();
        int m4701 = c2742.m4701();
        C2761 m4735 = m4735(m4701);
        if (m4735 == null) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3=NemI6m\u001ag:Of>Mek\u001c0>KgmMgfLd9\u001ac>\u001aj;OagA4=J7<LelKc>\u001bfnLb9NklKj:HaiJkjHfhAf<J0j\u0019ch\u00197kI`f\u001b6kJ7lHe<L6:JchAbg\u001ac;H7lK1fAb;Ab>MdlH`=\u001dbkK")), m4701));
        }
        String m4692 = c2742.m4692(Crypt.a(Crypt.xrc("J0;If:J`k\u0019d:\u001ba9H3g\u001e6kM`:@g=@6:\u001af")));
        boolean m4697 = c2742.m4697();
        C2773 c2773 = f10361;
        c2773.getClass();
        c2773.m4754(80, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@kgKfhKgg\u001c4>KklM`:\u001dgh\u001a4:\u001ejf\u001dd<\u001e0l\u001dbj@eo\u001b69A0l@gj\u001cf:Me:\u001cfh@efMdjM0k")) + m4701 + ", '" + m4692 + "')");
        if (m4692.equals(Crypt.a(Crypt.xrc("J7=Kkn\u0019ekHfiJ0iAeg\u001admLb>JchM4l@c")))) {
            if (m4697) {
                throw new IOException("Badly formatted SSH_MSG_CHANNEL_REQUEST message, 'want reply' is true");
            }
            int m47012 = c2742.m4701();
            if (c2742.m4695() != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001dei\u001eag@4=\u001bk9\u001b7mIcn\u001bch\u0019f:\u001a1oJb:\u001dj>\u001d`k\u00194hOd:\u001b6gMcjAclMef\u001eef\u001eb9\u001bj<\u001efgLam\u001bg>I4f\u001acf@7o@bkLe<Adl\u001acm\u001e7=")));
            }
            synchronized (m4735) {
                new Integer(m47012);
                m4735.notifyAll();
            }
            sb = new StringBuilder();
            sb.append(Crypt.a(Crypt.xrc("IgkHe=K4jIkgH1nNkhJ1<Jf;@`<\u0019bo\u001bbkN4g\u001bklLk9\u001cd>\u001effM6f\u0019el\u0019cgIb>KfhN")));
            sb.append(m4701);
            sb.append(Crypt.a(Crypt.xrc("OdhIbi\u001dgm\u001ac<Af=\u001adi@e<M3k\u001agnI7=Ha")));
            sb.append(m47012);
        } else {
            if (!m4692.equals(Crypt.a(Crypt.xrc("OalO6=K4k\u001d7hK0oLbf\u001ejiKa>O3m\u001a39\u0019g")))) {
                if (m4697) {
                    int i2 = m4735.f10375;
                    this.f10363.m4679(new byte[]{100, (byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2});
                }
                m4187 = C2098.m4187("Channel request '", m4692, "' is not known, ignoring it");
                c2773.m4754(50, m4187);
            }
            if (m4697) {
                throw new IOException("Badly formatted SSH_MSG_CHANNEL_REQUEST message, 'want reply' is true");
            }
            String m46922 = c2742.m4692(Crypt.a(Crypt.xrc("J0;If:J`k\u0019d:\u001ba9H3g\u001e6kM`:@g=@6:\u001af")));
            c2742.m4697();
            c2742.m4694();
            c2742.m4694();
            if (c2742.m4695() != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001dei\u001eag@4=\u001bk9\u001b7mIcn\u001bch\u0019f:\u001a1oJb:\u001dj>\u001d`k\u00194hOd:\u001b6gMcjAclMef\u001eef\u001eb9\u001bj<\u001efgLam\u001bg>I4f\u001acf@7o@bkLe<Adl\u001acm\u001e7=")));
            }
            synchronized (m4735) {
                m4735.notifyAll();
            }
            sb = new StringBuilder();
            sb.append(Crypt.a(Crypt.xrc("\u001ba;Hf:\u001ea<\u001bfiJ3j\u001bk:HejJak\u001dg>M4g\u001e`l@3>\u001cg;I1oH0m\u001a0n\u001bef\u001c3j\u001d0>IbgOgkI")));
            sb.append(m4701);
            sb.append(Crypt.a(Crypt.xrc("\u001b1=HfkI3=\u001aflI7l\u001egl\u001a3g@ji\u001dcoIk=\u001be")));
            sb.append(m46922);
        }
        sb.append(Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
        m4187 = sb.toString();
        c2773.m4754(50, m4187);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final IOException m4737(String str, C2761 c2761) {
        Throwable th;
        IOException iOException = new IOException(str);
        synchronized (c2761.f10388) {
            th = c2761.f10382;
        }
        return (IOException) iOException.initCause(th);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m4738(byte[] bArr, int i) {
        if (i != 5) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001db=Odn\u001cjf\u001e4hO4:OkmM3mK7iO`k\u001bag\u001d`9He>AcgI`g@chIb>H4=A`iH3o@e<J0nH`gAfiH1lKkn@4:N0fJ79Ma:\u001eg;JjnAdnJg")), i, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        int i2 = (bArr[4] & 255) | ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8);
        C2761 m4735 = m4735(i2);
        if (m4735 == null) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3;N6i\u00190f\u001ef;K4kI1kI0<\u001ckfJcoM0o\u001c6fJe=\u001adj\u001cco\u001d`mJ7jAd;\u0019cmOjn\u001c0<@1=O69Ac=\u001bdm\u001e4jJkh\u00191nK3g\u001a0f\u001d6iAk<L4o\u001c`i\u001e0h\u001c7>\u001e6nHalNd9\u001agjAbi\u001c7jH1gJ`f\u001e")), i2));
        }
        synchronized (m4735) {
            m4735.f10385++;
            m4735.notifyAll();
        }
        C2773 c2773 = f10361;
        c2773.getClass();
        c2773.m4754(80, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@k=Lf>Nbm\u00197<\u001b6fNa>\u001bkoLgjNf:I`gMff\u001bemL4o\u001b1:Ke>\u001e6j\u0019c>I3gJ0;@ko\u001ad=Jdh")) + i2 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m4739(C2761 c2761, String str, boolean z) {
        byte[] bArr = new byte[5];
        synchronized (c2761) {
            if (z) {
                c2761.f10392 = 4;
                c2761.m4745();
            }
            c2761.m4744(str);
            bArr[0] = 97;
            int i = c2761.f10375;
            bArr[1] = (byte) (i >> 24);
            bArr[2] = (byte) (i >> 16);
            bArr[3] = (byte) (i >> 8);
            bArr[4] = (byte) i;
            c2761.notifyAll();
        }
        synchronized (c2761.f10373) {
            if (c2761.f10391) {
                return;
            }
            this.f10363.m4683(bArr);
            c2761.f10391 = true;
            C2773 c2773 = f10361;
            c2773.getClass();
            c2773.m4754(50, Crypt.a(Crypt.xrc("\u001e`;I0>\u001d1f\u001e1jJe9H69H19\u001akf\u001a4oN0:Ob=LkhN`k\u001e7mMe<L4m\u0019jj@f;\u001d6mMalJ`j\u001c0gMb>OkjO1<Ac<O7n\u00190>Hei\u001af<IjiH0j")) + c2761.f10386 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m4740(byte[] bArr, int i) {
        if (i != 9) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001dboLbf\u0019b:@bm\u001d7nLk:M7;JanKgf\u001aj>\u001c7=\u001e7gK1>Lj<Adi\u001b3n\u001ebmAcfM6m\u001ak<\u001d1gN3kM19Hag\u001aahH6<H4l\u00197g\u001be<\u001dk=\u001bg>M0nJ7")), i, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        int i2 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i3 = (bArr[8] & 255) | ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8);
        C2761 m4735 = m4735(i2);
        if (m4735 == null) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3l\u001bck\u001a3gHcl\u001afk\u001afkA4f\u001c1>K4j\u001djo\u001ck>Hj9Kg:L3=M0j\u001e4>Jkg\u0019j=\u001c7jM`iJjjL39\u0019`>Af:N7i\u00196:Ngf\u001ak=Nf;Nbi\u001e7mMa;\u00196kN0hOeo@4kJbiK4h\u001dffIe>L1fHdmL`lJ")), i2));
        }
        synchronized (m4735) {
            long j = m4735.f10379 + (i3 & 4294967295L);
            m4735.f10379 = j;
            if (j > 4294967295L) {
                m4735.f10379 = 4294967295L;
            }
            m4735.notifyAll();
        }
        C2773 c2773 = f10361;
        c2773.getClass();
        c2773.m4754(80, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@khKdoA1jIbgH4i\u001daiNk<LdlN1k\u00193;J4k\u001a1m@jo@j9H3:M1:\u001b0lH6fMfiM49Kek\u001bjh")) + i2 + Crypt.a(Crypt.xrc("\u001ej=\u001cdmNj<\u001ed<\u001cjfLfg\u001dc;L3k\u001cg>H3mKb")) + i3 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m4741(byte[] bArr, int i) {
        if (i <= 13) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001db=\u001d6lA`;\u001eck@akL0f\u001cbiJ3iH3=\u001b1l\u001bfk\u001agm\u001c6lNkhHdkAg;L`iMbmJ4k\u00194;\u0019e;H7:@79\u001abhL7f\u001efhO6<\u001djhLdgObk\u001b69\u001acm\u001ef")), i, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        int i2 = ((bArr[1] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 8) | (bArr[4] & 255);
        int i3 = (bArr[8] & 255) | ((bArr[5] & 255) << 24) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 8);
        int i4 = ((bArr[9] & Base64.BASELENGTH) << 24) | ((bArr[10] & Base64.BASELENGTH) << 16) | ((bArr[11] & Base64.BASELENGTH) << 8) | (bArr[12] & Base64.BASELENGTH);
        C2761 m4735 = m4735(i2);
        if (m4735 == null) {
            throw new IOException(C2098.m4208(Crypt.a(Crypt.xrc("\u001c0;\u0019j<IagAcnMak\u001e3g\u001edkN4k\u001cbg\u0019c9@3>Jc9\u00190n\u001ebh\u001bb;\u001a0;\u001ego\u0019ai\u001bcg\u001e`;I3h@am\u0019`;\u001e1kJdo\u0019a;N3;\u001ad;\u001eki\u001eek\u001cjjKdoIkf\u001c`mK`nOfn\u001agfOak\u001dal\u001c0mM1mN`=LjfAd9L1n\u0019j9OaoNfm\u001c1h\u0019a:A7;L6l\u001d1nJ")), i2));
        }
        if (i3 != 1) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001db=\u001d6lA`;\u001eck@akL0f\u001cbiJ3iH3=\u001b1l\u001bfk\u001a`;\u001a3:Hcl\u001d7nNb;\u001djm\u001d7<Kjm\u001ee<Mg:Ak:@d>KjhM4n\u001djj@1mOd;\u001cjiI4;JkjL1=\u001dj")), i3, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        int i5 = i - 13;
        if (i4 != i5) {
            throw new IOException(Crypt.a(Crypt.xrc("Ka;Kc=\u001ef;Ad<O0<@gmHff\u001dco\u001bkoLf=\u001db=\u001d6lA`;\u001eck@akL0f\u001cbiJ3iH3=\u001b1l\u001bfk\u001agm\u001c6lNkhHdkAg;L`iMbmJ4k\u00194;\u0019e;H7:NaoObk\u001c4<\u001afnJbkKjk@f>\u00190<\u001e19H1=\u001dam\u001c6iHj=A3>\u001ed9\u0019a9M7mAf<\u001bamJeoOfkL")) + i5 + Crypt.a(Crypt.xrc("Hc;\u001cg;@dnAbn\u001bgnO`=\u001e7h@jn\u001a7>\u001b3gJ6")) + i4 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
        }
        C2773 c2773 = f10361;
        c2773.getClass();
        c2773.m4754(80, Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@khNagH0lK4k\u001969\u001ek<@1jO`=Mf<@ahIaj\u001d4hKal\u00191=N0gHj>\u00197;H1>\u001ca=Hd9\u001d1o@ji")) + i2 + Crypt.a(Crypt.xrc("\u001ej=\u001cdmNj<\u001ed<\u001cjfLfg\u001dc;L3k\u001cg>H3mKb")) + i4 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
        synchronized (m4735) {
            int i6 = m4735.f10392;
            if (i6 == 4) {
                return;
            }
            if (i6 != 2) {
                throw new IOException(Crypt.a(Crypt.xrc("Ig=\u001ebkL4l@df\u00191:\u001ec=OekLfiH1:\u001a3j@khNagH0lK4k\u001969\u001ek<@1jO`=Mf<@ahIaj\u001d6jJ`m@`fKag\u001ca:\u0019djJ7=\u001aah\u001b6iKk:M3nK1fL0k\u001ee9\u001ca<K6=K0fMdhNgg\u001b7=J0>N1gO7<@4nAfnOkh\u001cd<Jfl\u001dajAg>H`;\u001cj:\u001e")) + m4735.f10392 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
            }
            int i7 = m4735.f10390;
            if (i7 < i4) {
                throw new IOException(Crypt.a(Crypt.xrc("L`gK4=K6f\u001a4lMgiOa>OdmO69\u001b`9\u001bagOjhO3h\u001d3hLjhIdiO`nA1:Nf>JehOc;\u001d`oAdfOe<J`oA0j\u001e`9@3g\u001cb9\u0019jiIa:KbgL3:\u001dkf\u001eeg@g=\u001delOgk\u001d6jAd9HbgO4hK6f\u001a7")));
            }
            m4735.f10390 = i7 - i4;
            C2766 c2766 = m4735.f10384.f10393;
            c2766.getClass();
            try {
                c2766.m4749(bArr, 13, i4);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m4742(byte[] bArr, int i) {
        C2770 c2770;
        C2742 c2742 = new C2742(bArr, 0, i);
        c2742.m4693();
        String m4694 = c2742.m4694();
        int m4701 = c2742.m4701();
        int m47012 = c2742.m4701();
        int m47013 = c2742.m4701();
        if (Crypt.a(Crypt.xrc("\u001ac9\u001bcl\u001akjKdgAf>\u001c1kNfh\u001b7k\u001ec:M7lK3")).equals(m4694)) {
            synchronized (this.f10366) {
                if (this.f10366.size() != 0) {
                    String m46942 = c2742.m4694();
                    int m47014 = c2742.m4701();
                    C2761 c2761 = new C2761(this);
                    synchronized (c2761) {
                        c2761.f10375 = m4701;
                        c2761.f10379 = m47012 & 4294967295L;
                        c2761.f10378 = m47013;
                        c2761.f10386 = m4734(c2761);
                    }
                    C2759 c2759 = new C2759(c2761, m46942, m47014);
                    c2759.setDaemon(true);
                    c2759.start();
                    return;
                }
                String a = Crypt.a(Crypt.xrc("M3g\u001abn\u001eg=K1=Oci\u0019e<\u001ckk\u001d7;Oki\u001ck:@6fL1<Jf9\u001af:L4jLcj\u001bjkKki\u001a7gKfo\u001ednH"));
                C2731 c2731 = this.f10363;
                C2744 c2744 = new C2744();
                c2744.m4712(92);
                c2744.m4713(m4701);
                c2744.m4713(1);
                c2744.m4705(a);
                c2744.m4705("");
                c2731.m4679(c2744.m4709());
                C2773 c2773 = f10361;
                c2773.getClass();
                c2773.m4754(20, Crypt.a(Crypt.xrc("\u001dkgJboNf=\u001d7j@0g\u0019knHfkLg>\u001dg;\u001bfj\u001c49\u00196oHeh\u001ddh\u001a`9HggH3nHkh@0lH`;\u0019fgN1fKjmM`nNc;N1f\u001bkf\u001agf\u001cf<\u001ejlJbgHdh")));
                return;
            }
        }
        if (!Crypt.a(Crypt.xrc("Ic9K6>O7nNfoK`gJg:\u001dc9\u001b6h\u001bg<Mgm\u00193")).equals(m4694)) {
            String a2 = Crypt.a(Crypt.xrc("\u001cgm\u0019ag\u001bklKk=J0iOagK4l\u001ekl\u001agmOfj\u001akgJ3kK1f@7lM3i\u001a`<\u001a1o@j=Kdj\u001cahLg;K"));
            C2731 c27312 = this.f10363;
            C2744 c27442 = new C2744();
            c27442.m4712(92);
            c27442.m4713(m4701);
            c27442.m4713(3);
            c27442.m4705(a2);
            c27442.m4705("");
            c27312.m4679(c27442.m4709());
            C2773 c27732 = f10361;
            c27732.getClass();
            c27732.m4754(20, Crypt.a(Crypt.xrc("Ac9Ngh\u001e1<O7k\u00191o\u001ddf\u001edl\u001af:\u0019k<NknO1lMj9\u001d3kNcn\u001b0<Kc<\u001e0n\u001admJ3lMam\u001d3:\u001aa<\u0019j=M0;JfnOcg@a>@kfM4j\u001c1lH0kN6jIjiI7m\u001bkf\u001bahK1k\u001db<\u001b7iI0f\u0019`gJejMk")) + m4694 + Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc")));
            return;
        }
        String m46943 = c2742.m4694();
        int m47015 = c2742.m4701();
        String m46944 = c2742.m4694();
        int m47016 = c2742.m4701();
        synchronized (this.f10364) {
            c2770 = (C2770) this.f10364.get(new Integer(m47015));
        }
        if (c2770 != null) {
            C2761 c27612 = new C2761(this);
            synchronized (c27612) {
                c27612.f10375 = m4701;
                c27612.f10379 = m47012 & 4294967295L;
                c27612.f10378 = m47013;
                c27612.f10386 = m4734(c27612);
            }
            C2756 c2756 = new C2756(c27612, m46943, m47015, m46944, m47016, null, 0);
            c2756.setDaemon(true);
            c2756.start();
            return;
        }
        String a3 = Crypt.a(Crypt.xrc("\u0019j=J0g\u001abkI7;H`=IbjLb9Jj<\u001d7kH3m\u001eahJdg\u0019kjHfoMa>@7oK3gNj:Md:\u001c3m\u001c6jJk:Jk=\u001ecmA0oKkoI6>\u001ee=\u001bg<\u001b1g\u001bj<KelKf:A1=\u001d39\u001a7<M`nAd=N1m\u001c0;I`i\u001dj<\u001b7"));
        C2731 c27313 = this.f10363;
        C2744 c27443 = new C2744();
        c27443.m4712(92);
        c27443.m4713(m4701);
        c27443.m4713(1);
        c27443.m4705(a3);
        c27443.m4705("");
        c27313.m4679(c27443.m4709());
        C2773 c27733 = f10361;
        c27733.getClass();
        c27733.m4754(20, Crypt.a(Crypt.xrc("IajLaoMefNeiL`=Jj9\u001c`;\u001c`k\u001cg;JbhJf=Lem\u001a1g@6n\u001adjAf:\u001ebgI`mLc>JbjI0gNkf\u001cb>Jd<\u001a`j@`<Ka9Lfo\u001d6>\u0019jf\u001bco\u001ajn")));
    }
}
