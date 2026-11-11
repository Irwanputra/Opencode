package p107.p108.p109.p110.p121.p125.p126;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1956 extends C1946 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public InetAddress f8535;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f8536;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public DatagramPacket f8537;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public byte f8538;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public DatagramSocket f8539;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final int[] f8534 = {-1, 4, -1, -1, 16};

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static final byte[] f8533 = {5, 0};

    public C1956(RunnableC1947 runnableC1947) {
        super(runnableC1947);
        this.f8539 = null;
        this.f8537 = null;
        this.f8535 = null;
        this.f8536 = 0;
        this.f8496 = new byte[Base64.BASELENGTH];
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.C1946
    /* renamed from: 〺つふすそ */
    public void mo4040(byte b, InetAddress inetAddress, int i) {
        byte[] bArr = {0, 0, 0, 0};
        StringBuilder m4207 = C2098.m4207("BIND Reply to Client \"");
        m4207.append(m4053(b));
        m4207.append("\"");
        C1948.m4069(m4207.toString());
        byte[] bArr2 = new byte[10];
        if (inetAddress != null) {
            bArr = inetAddress.getAddress();
        }
        boolean z = false;
        bArr2[0] = 5;
        bArr2[1] = (byte) (b - 90);
        bArr2[2] = 0;
        bArr2[3] = 1;
        bArr2[4] = bArr[0];
        bArr2[5] = bArr[1];
        bArr2[6] = bArr[2];
        bArr2[7] = bArr[3];
        bArr2[8] = (byte) ((65280 & i) >> 8);
        bArr2[9] = (byte) (i & Base64.BASELENGTH);
        RunnableC1947 runnableC1947 = this.f8491;
        if (runnableC1947.f8511 != null && runnableC1947.f8513 != null) {
            z = true;
        }
        if (z) {
            runnableC1947.m4055(bArr2, 10);
        } else {
            C1948.m4069(Crypt.a(Crypt.xrc("\u001dkoL49O0:A1fA1>H7nA0nIdmAcfH1f\u001cdgK`<Hk:\u001a0g\u001ech\u001bj:H0>\u001cegJe=\u001bcnMei\u0019")));
        }
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.C1946
    /* renamed from: ぁごぐすすぃ */
    public void mo4041() {
        this.f8495 = m4049();
        this.f8494 = m4049();
        m4049();
        byte m4049 = m4049();
        this.f8538 = m4049;
        int i = f8534[m4049];
        this.f8496[0] = m4049();
        if (this.f8538 == 3) {
            i = this.f8496[0] + 1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            this.f8496[i2] = m4049();
        }
        this.f8499[0] = m4049();
        this.f8499[1] = m4049();
        if (this.f8495 != 5) {
            String a = Crypt.a(Crypt.xrc("H0i\u001bf<Ik>AehMgk\u001cf:Icg@fjJci\u001d3>K4:@0iK7;\u001b6>\u001eg;M`>M6;@co\u001ek9L0gHggNknJ`k\u001bfk\u001ec<\u001ecnAb=\u001b0<\u001e3=K0fAbmLan"));
            StringBuilder m4207 = C2098.m4207(a);
            m4207.append((int) this.f8495);
            C1948.m4069(m4207.toString());
            m4039((byte) -1);
            StringBuilder m42072 = C2098.m4207(a);
            m42072.append((int) this.f8495);
            throw new Exception(m42072.toString());
        }
        byte b = this.f8494;
        if (b < 1 || b > 3) {
            StringBuilder m42073 = C2098.m4207("GetClientCommand() - Unsupported Command : \"");
            m42073.append(m4052(this.f8494));
            m42073.append("\"");
            C1948.m4064(m42073.toString());
            m4039((byte) 7);
            StringBuilder m42074 = C2098.m4207("Unsupported Command: \"");
            m42074.append((int) this.f8494);
            m42074.append("\"");
            throw new Exception(m42074.toString());
        }
        byte b2 = this.f8538;
        if (b2 == 4) {
            C1948.m4064(Crypt.a(Crypt.xrc("@boA69M4<OkmMg:\u001abgIbkN1;Kdj\u001bcnMglA6lKan\u0019efLdg\u001d0k\u0019c:@cm@4k\u001ccjJafNgl\u001dgk@4n\u001a6jAa9\u001d3kLk:\u001e3lH6;A3:HanOaoJ19\u001c69\u001dkn\u001e4o\u001d3<M6mH0=K7iMdm\u001ee")));
            m4039((byte) 8);
            throw new Exception(Crypt.a(Crypt.xrc("\u001e`m\u001ab<Ok;\u001eb;\u0019k<\u001dgjIb:LalNkf\u001dd<\u00191=\u001c6;@4iKfgA0h\u001bfi\u001cb=L1iA`:\u0019g;A1nH7oLehHko\u001ak<\u001b1>N7nH`>IcgHeoK`jK4>")));
        }
        if (b2 >= 4 || b2 <= 0) {
            StringBuilder m42075 = C2098.m4207(Crypt.a(Crypt.xrc("@boA69M4<OkmMg:\u001abgIbkN1;Kdj\u001bcnMglA6lKan\u0019efLdg\u001d0k\u0019c:@cm@4k\u001ccjJafNe=\u001e3=HdoNf9Jf>\u001beg\u001cehK4lA6h\u001bcg\u001c6>")));
            m42075.append((int) this.f8538);
            C1948.m4064(m42075.toString());
            m4039((byte) 8);
            StringBuilder m42076 = C2098.m4207(Crypt.a(Crypt.xrc("\u001e`m\u001ab<Ok;\u001eb;\u0019k<\u001dgjIb:LalNkf\u001dd<\u00191n@d>I0oK6g\u001d7k\u001bdh\u001bem\u0019alOamKkn\u0019kgI")));
            m42076.append((int) this.f8538);
            throw new Exception(m42076.toString());
        }
        if (mo4051()) {
            StringBuilder m42077 = C2098.m4207("Accepted SOCKS5 Command: \"");
            m42077.append(m4052(this.f8494));
            m42077.append("\"");
            C1948.m4069(m42077.toString());
            return;
        }
        m4039((byte) 4);
        StringBuilder m42078 = C2098.m4207("Unknown Host/IP address '");
        m42078.append(this.f8490.toString());
        m42078.append("'");
        throw new Exception(m42078.toString());
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.C1946
    /* renamed from: いいにぽつ */
    public void mo4042(byte b) {
        int i;
        StringBuilder m4207 = C2098.m4207("Reply to Client \"");
        m4207.append(m4053(b));
        m4207.append("\"");
        C1948.m4069(m4207.toString());
        byte[] bArr = new byte[10];
        byte[] bArr2 = new byte[4];
        Socket socket = this.f8491.f8513;
        if (socket != null) {
            socket.getInetAddress().toString();
            i = this.f8491.f8513.getLocalPort();
        } else {
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            bArr2[3] = 0;
            i = 0;
        }
        bArr[0] = 5;
        bArr[1] = b;
        bArr[2] = 0;
        bArr[3] = 1;
        bArr[4] = bArr2[0];
        bArr[5] = bArr2[1];
        bArr[6] = bArr2[2];
        bArr[7] = bArr2[3];
        bArr[8] = (byte) ((65280 & i) >> 8);
        bArr[9] = (byte) (i & Base64.BASELENGTH);
        RunnableC1947 runnableC1947 = this.f8491;
        runnableC1947.getClass();
        runnableC1947.m4055(bArr, 10);
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.C1946
    /* renamed from: ぇぬぎばつ */
    public byte mo4043() {
        return (byte) 0;
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final void m4071() {
        this.f8539.setSoTimeout(RunnableC1947.f8502);
        RunnableC1947 runnableC1947 = this.f8491;
        runnableC1947.getClass();
        runnableC1947.f8505 = new byte[NotificationCompat.FLAG_BUBBLE];
        RunnableC1947 runnableC19472 = this.f8491;
        byte[] bArr = runnableC19472.f8505;
        runnableC19472.getClass();
        this.f8537 = new DatagramPacket(bArr, NotificationCompat.FLAG_BUBBLE);
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.C1946
    /* renamed from: おぐぴう〸ず */
    public byte mo4044() {
        return (byte) 4;
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.C1946
    /* renamed from: げつ〴ぬぐ */
    public void mo4046(byte b) {
        this.f8495 = b;
        if (b != 5) {
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("H0i\u001bf<Ik>AehMgk\u001cf:Icg@fjJci\u001d3>K4mLdh\u001dek\u0019bmAb;I7:Hb>OfhAk>\u0019j<Ia9I")));
            m4207.append((int) this.f8495);
            m4073(m4207.toString());
            StringBuilder m42072 = C2098.m4207("Not Supported SOCKS Version -'");
            m42072.append((int) this.f8495);
            m42072.append("'");
            throw new Exception(m42072.toString());
        }
        byte m4049 = m4049();
        String str = "";
        for (int i = 0; i < m4049; i++) {
            StringBuilder m4179 = C2098.m4179(str, Crypt.a(Crypt.xrc("Nan\u001aflLam\u001a3jMf;Nkf\u001b6oNei\u001belOd:Of")));
            m4179.append((int) m4049());
            m4179.append('-');
            str = m4179.toString();
        }
        if (!((str.indexOf(Crypt.a(Crypt.xrc("Ob:\u001b`i\u001egm\u001aggAki\u001b`g\u001e4l\u001aj>Hb<@3k\u001ce"))) == -1 && str.indexOf(Crypt.a(Crypt.xrc("I3>\u001akfK0o\u001e1gHkg\u001cg<Jdh\u001bam\u001adoLkgI7"))) == -1) ? false : true)) {
            m4073(Crypt.a(Crypt.xrc("\u001eg:\u001a7oNen\u001agiN7hO3iL3=\u0019e9I1=K19\u001ca:Kei\u001cc=M1nKcnNemI6o\u0019eoAbiN7iKg9H")));
            throw new Exception(Crypt.a(Crypt.xrc("\u001eg:\u001a7oNen\u001agiN7hO3iL3=\u0019e9I1=K19\u001cafMd:\u001ba;\u001b7iIkl@7>@`kO3<A1=\u001ago\u001c3j@")));
        }
        C1948.m4069("Accepts Auth. method 'NO_AUTH'");
        byte[] bArr = f8533;
        bArr[0] = this.f8495;
        RunnableC1947 runnableC1947 = this.f8491;
        runnableC1947.getClass();
        runnableC1947.m4055(bArr, bArr.length);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public InetAddress m4072(byte b, byte[] bArr) {
        if (b == 1) {
            return m4048(bArr);
        }
        if (b != 3) {
            return null;
        }
        if (bArr[0] <= 0) {
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("I1>\u001bfj\u001ad:\u001bd>Hj:Hkg\u001bkgOafKgiM7i\u001bkf\u001bg=NejIb;J`k@ki\u001ej>\u0019kj\u001c0n@0mJe9\u0019ai@ef\u001a7iOfhM`nI4fNeoA1i\u001eegKb;\u001d3j")));
            m4207.append((int) bArr[0]);
            C1948.m4064(m4207.toString());
            return null;
        }
        String str = "";
        for (int i = 1; i <= bArr[0]; i++) {
            StringBuilder m42072 = C2098.m4207(str);
            m42072.append((char) bArr[i]);
            str = m42072.toString();
        }
        try {
            return InetAddress.getByName(str);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void m4073(String str) {
        C1948.m4069("Refuse Authentication: '" + str + "'");
        RunnableC1947 runnableC1947 = this.f8491;
        byte[] bArr = C1946.f8489;
        runnableC1947.getClass();
        runnableC1947.m4055(bArr, bArr.length);
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void m4074(DatagramPacket datagramPacket) {
        String str = datagramPacket.getAddress() + Crypt.a(Crypt.xrc("\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`")) + datagramPacket.getPort() + Crypt.a(Crypt.xrc("A`9@cfA3fK7k@ck\u001ejnNbl\u001cf:Kk<@kgM`")) + datagramPacket.getLength() + Crypt.a(Crypt.xrc("\u001ajfN`gKfk\u001e0jKdk\u001d`l\u0019bl\u00193:Mf:\u001cbk\u0019b"));
        try {
            this.f8539.send(datagramPacket);
        } catch (IOException unused) {
            C1948.m4069(Crypt.a(Crypt.xrc("Akf\u001c0n\u001c1=\u001c3<\u001a3o\u001ekm\u001beo\u001cejOciOeo\u001e`mIk>MemJ`nOe:Af>J1:\u001b7jNaiIe=J1lKc=Hel@aoJdm\u001dd;Nj:Ke=\u001dam\u001c69L4=\u001aa<\u001bahHenIfjHb;\u001cejKjkK3oNd=Jfm\u001d4>N0")) + str);
        }
    }

    @Override // p107.p108.p109.p110.p121.p125.p126.C1946
    /* renamed from: びぐびあび */
    public boolean mo4051() {
        this.f8490 = m4072(this.f8538, this.f8496);
        byte[] bArr = this.f8499;
        this.f8500 = m4050(bArr[0], bArr[1]);
        this.f8493 = this.f8491.f8511.getInetAddress();
        this.f8501 = this.f8491.f8511.getPort();
        return this.f8490 != null && this.f8500 >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    @Override // p107.p108.p109.p110.p121.p125.p126.C1946
    /* renamed from: ぺふねづ〺 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4054() {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p121.p125.p126.C1956.mo4054():void");
    }
}
