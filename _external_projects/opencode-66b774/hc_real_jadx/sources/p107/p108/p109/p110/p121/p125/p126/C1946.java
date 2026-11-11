package p107.p108.p109.p110.p121.p125.p126;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1946 {

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static byte[] f8489 = {5, -1};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public RunnableC1947 f8491;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public byte f8494;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public byte[] f8496;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public byte[] f8499;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public byte f8495 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public byte[] f8498 = null;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String f8492 = "";

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public InetAddress f8490 = null;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f8500 = 0;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public InetAddress f8493 = null;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f8501 = 0;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public InetAddress f8497 = null;

    public C1946(RunnableC1947 runnableC1947) {
        this.f8491 = null;
        this.f8499 = null;
        this.f8496 = null;
        this.f8491 = runnableC1947;
        this.f8496 = new byte[4];
        this.f8499 = new byte[2];
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m4039(byte b) {
        StringBuilder m4207 = C2098.m4207("Refuse Command: \"");
        m4207.append(m4053(b));
        m4207.append("\"");
        C1948.m4069(m4207.toString());
        mo4042(b);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo4040(byte b, InetAddress inetAddress, int i) {
        byte[] bArr = {0, 0, 0, 0};
        StringBuilder m4207 = C2098.m4207("Reply to Client : \"");
        m4207.append(m4053(b));
        m4207.append("\"");
        C1948.m4069(m4207.toString());
        byte[] bArr2 = new byte[8];
        if (inetAddress != null) {
            bArr = inetAddress.getAddress();
        }
        boolean z = false;
        bArr2[0] = 0;
        bArr2[1] = b;
        bArr2[2] = (byte) ((65280 & i) >> 8);
        bArr2[3] = (byte) (i & Base64.BASELENGTH);
        bArr2[4] = bArr[0];
        bArr2[5] = bArr[1];
        bArr2[6] = bArr[2];
        bArr2[7] = bArr[3];
        RunnableC1947 runnableC1947 = this.f8491;
        if (runnableC1947.f8511 != null && runnableC1947.f8513 != null) {
            z = true;
        }
        if (z) {
            runnableC1947.m4055(bArr2, 8);
        } else {
            C1948.m4069(Crypt.a(Crypt.xrc("\u001d1nHkg\u0019eg\u001ecj\u0019c=\u001afk\u001d1jN39A4=HknH4l@d=LdfK0jK`nL7h\u001e6:Nb>Njm\u001a3=\u001bboM")));
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo4041() {
        this.f8494 = m4049();
        this.f8499[0] = m4049();
        this.f8499[1] = m4049();
        for (int i = 0; i < 4; i++) {
            this.f8496[i] = m4049();
        }
        while (true) {
            byte m4049 = m4049();
            if (m4049 == 0) {
                break;
            }
            this.f8492 += ((char) m4049);
        }
        byte[] bytes = (this.f8492 + Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"))).getBytes();
        this.f8498 = bytes;
        bytes[bytes.length + (-1)] = 0;
        byte b = this.f8494;
        if (b < 1 || b > 2) {
            m4039((byte) 91);
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001b3;Acg\u001ae;\u001bfkK3m\u001e`mNj=H7m\u001e7;\u001c0oL1;N4jHeiKk=\u001c6i\u001e1n\u001bj=Hc9L3m\u001a`hH4=\u001e")));
            m4207.append(m4052(this.f8494));
            throw new Exception(m4207.toString());
        }
        if (!mo4051()) {
            m4039((byte) 92);
            StringBuilder m42072 = C2098.m4207("Unknown Host/IP address '");
            m42072.append(this.f8490.toString());
            throw new Exception(m42072.toString());
        }
        StringBuilder m42073 = C2098.m4207("Accepted SOCKS 4 Command: \"");
        m42073.append(m4052(this.f8494));
        m42073.append("\"");
        C1948.m4069(m42073.toString());
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void mo4042(byte b) {
        StringBuilder m4207 = C2098.m4207("Socks 4 reply: \"");
        m4207.append(m4053(b));
        m4207.append("\"");
        C1948.m4069(m4207.toString());
        byte[] bArr = this.f8499;
        byte[] bArr2 = this.f8496;
        byte[] bArr3 = {0, b, bArr[0], bArr[1], bArr2[0], bArr2[1], bArr2[2], bArr2[3]};
        RunnableC1947 runnableC1947 = this.f8491;
        runnableC1947.getClass();
        runnableC1947.m4055(bArr3, 8);
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public byte mo4043() {
        return (byte) 90;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public byte mo4044() {
        return (byte) 91;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4045() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p121.p125.p126.C1946.m4045():void");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo4046(byte b) {
        this.f8495 = b;
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m4047() {
        C1948.m4069(Crypt.a(Crypt.xrc("MfjI6=\u001ccnKg9\u001eko@bfLe<M1m@di\u001cblI4j\u001b4oNdh@c:\u0019`kLj=@19JgiMk>IahOd=I")));
        try {
            this.f8491.m4058(this.f8490.getHostAddress(), this.f8500);
            mo4042(mo4043());
        } catch (IOException unused) {
            m4039(mo4044());
            StringBuilder m4207 = C2098.m4207("Can't connect to ");
            m4207.append(C1948.m4068(this.f8491.f8513));
            throw new Exception(m4207.toString());
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public InetAddress m4048(byte[] bArr) {
        if (bArr.length < 4) {
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("I1>\u001bfj\u001ad:\u001bd>Hj:Hkg\u001bkgOafKgiM7i\u001bklJ7=@e;@`i\u0019a;\u001cej\u001d6jHgoAb:N7>\u00190k\u001cb>NkfN0fLcjLe=@eoNffJ1;\u001bdh\u001bciJem")));
            m4207.append(bArr.length);
            m4207.append(Crypt.a(Crypt.xrc("\u001ajfN`gKfk\u001e0jKdk\u001d`l\u0019bl\u00193:Mf:\u001cbk\u0019b")));
            C1948.m4064(m4207.toString());
            return null;
        }
        String str = "";
        for (int i = 0; i < 4; i++) {
            StringBuilder m42072 = C2098.m4207(str);
            int i2 = bArr[i];
            if (i2 < 0) {
                i2 += NotificationCompat.FLAG_LOCAL_ONLY;
            }
            m42072.append(i2);
            str = m42072.toString();
            if (i < 3) {
                str = C2098.m4205(str, Crypt.a(Crypt.xrc("K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk")));
            }
        }
        try {
            return InetAddress.getByName(str);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public byte m4049() {
        try {
            return this.f8491.m4062();
        } catch (Exception unused) {
            return (byte) 0;
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int m4050(byte b, byte b2) {
        int i = b;
        if (b < 0) {
            i = b + NotificationCompat.FLAG_LOCAL_ONLY;
        }
        int i2 = i << 8;
        int i3 = b2;
        if (b2 < 0) {
            i3 = b2 + NotificationCompat.FLAG_LOCAL_ONLY;
        }
        return i2 | i3;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean mo4051() {
        this.f8490 = m4048(this.f8496);
        byte[] bArr = this.f8499;
        this.f8500 = m4050(bArr[0], bArr[1]);
        this.f8493 = this.f8491.f8511.getInetAddress();
        this.f8501 = this.f8491.f8511.getPort();
        return this.f8490 != null && this.f8500 >= 0;
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String m4052(byte b) {
        return b != 1 ? b != 2 ? b != 3 ? Crypt.a(Crypt.xrc("@`=M6m\u001e4<\u0019f=Nkg\u001da=\u001ea<\u001akj\u001cgo@cf@b")) : Crypt.a(Crypt.xrc("\u0019fh@diN`i\u001d0>\u001c0=IdkNel\u001b7mManNc<Kd")) : Crypt.a(Crypt.xrc("\u001edg@kh\u001dgo\u001afiI6hH6l\u0019jg\u001a4jKf9\u001e`j\u001bj")) : Crypt.a(Crypt.xrc("K`f\u001c`>\u001b7lLd9\u001ekhHgn@gj\u001b`kLdh\u001ad=\u00193"));
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String m4053(byte b) {
        switch (b) {
            case 0:
                return Crypt.a(Crypt.xrc("\u001d1;Hfh\u001a3<O0l\u0019jjI0m\u001c3gN6gAef\u001aefHj"));
            case 1:
                return Crypt.a(Crypt.xrc("J4=H0mLg:HfiA4;\u001a6jM4kM4<Heh\u001aknHfj\u001e6oJch\u00191f\u00190oJ`9\u001ba9Hgo\u001b3nAg<JfkJ"));
            case 2:
                return Crypt.a(Crypt.xrc("IbgK3gN`l\u001a1i\u001cc>O7lIb:JfhK4kN79L39@`kMciN3h\u0019cjKe>\u001db:\u001aknJd9K6h\u001bkgMbfMd<\u001c6iI6i\u001d0mO`mLd<\u001c6oHkhKgh\u001d`n"));
            case 3:
                return Crypt.a(Crypt.xrc("N`=J6iAdmKf<OamI1hI6f\u001ccnJcn\u001a4nK7=\u001ceoKglIchLjg\u001dd;Keh@4;\u001cc9Mjh\u0019ckL"));
            case 4:
                return Crypt.a(Crypt.xrc("\u001ac<L1k\u001d4:L0>Ik<O7>\u001cgl\u001d`fI0;@joJeg\u0019b<Kgj\u001bcgM3o\u001bg9Mb:Ie:@fn\u001ekf\u001d0lL"));
            case 5:
                return Crypt.a(Crypt.xrc("\u001d4mO0<I19\u00194;@7gK`;\u001e6o\u001919L4=\u001d0>K3=Aei\u001e3<\u001beiKa=\u001b`9HcfHa>Oc9Lf=\u001ef>\u0019"));
            case 6:
                return Crypt.a(Crypt.xrc("N0gK`:A19L6gNfkA1m@flJ19\u001d0l\u0019dkN`"));
            case 7:
                return Crypt.a(Crypt.xrc("\u001agnAegI1:J`iH`;NjkJjo\u001bg=L09A`h\u001e1;N4i\u001a7:L6l\u001cei\u001cj9\u001dk=O6n@bm\u001ekkJ3nK"));
            case 8:
                return Crypt.a(Crypt.xrc("@ciH`l\u001egm\u001b49\u001b0iO0g\u001e`i\u00197lN`n\u001dkj\u0019jgKcn\u001ckoN7lAa<Mc=I4l\u001b`h\u001ej9\u001ek:\u001b7=\u001b"));
            case 9:
                return Crypt.a(Crypt.xrc("HcmO7k@kgJ0hJjfJjm\u001b4h\u001c0j\u0019anHb:Kdi\u00191fOjf\u001bg>\u001bai\u001dek\u00191=A7i\u001a3>A7hKa=L"));
            default:
                switch (b) {
                    case 90:
                        return Crypt.a(Crypt.xrc("\u0019`9@cgJ6i\u001ca>\u001d0lOghK1fMe>\u001bg9\u001dg:\u001aa"));
                    case 91:
                        return Crypt.a(Crypt.xrc("\u001a7m\u001dgfNkgHaoAbf\u001ejgK`f\u001d4:M0gKko@knJfhN`f\u001c4>M7=J0fK6oMki\u001ccmMc>\u001akf\u001a"));
                    case 92:
                        return "Request REJECTED - SOCKS server can't connect to Identd on the client";
                    case 93:
                        return Crypt.a(Crypt.xrc("\u001a7m\u001dgfNkgHaoAbf\u001ejgK`f\u001d4:M0gKko@k9\u00197=Ifj\u001cj>Ie>JaoJ`k\u001cc=\u0019`lJb=\u001a`k\u001db=I6;Ajk@f:Ma<@`j\u001ek=\u001e3<\u001c1f\u001d3:H`;N1l\u001bch\u001919\u001adg\u001ajnKe;\u001bjnLenL6<\u001eg=Kg"));
                    default:
                        return Crypt.a(Crypt.xrc("@`=M6m\u001e4<\u0019f=Nkg\u001da=\u001ea<\u001akj\u001cgo@cf@b"));
                }
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void mo4054() {
        C1948.m4069("Error - Socks 4 don't support UDP Association");
        C1948.m4069(Crypt.a(Crypt.xrc("\u001c4oNemJbjL3jLc:A7jM`9A`fOf=K3l\u001bglO4j\u00190j\u001cb>N6m\u0019bh@en\u001d7;\u001cj9I79Ndl\u001e")));
        m4039((byte) 91);
    }
}
