package p107.p108.p109.p110.p121.p125.p126;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import p034.p050.p053.C1216;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p121.p125.p126.p127.C1950;
import p107.p108.p109.p110.p121.p125.p126.p127.InterfaceC1955;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: てぜきぽく.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.へぬ〴づぞ.なぎぱいぢぎ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1947 implements Runnable {

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final int f8502 = App.f3762.getInt(Crypt.a(Crypt.xrc("KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b")), 10);

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public byte[] f8505;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public C1950 f8507;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public InterfaceC1955 f8508;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Socket f8511;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f8512;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public String f8514;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public RunnableC1945 f8515;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f8516;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Thread f8510 = null;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Socket f8513 = null;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public InputStream f8503 = null;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public OutputStream f8517 = null;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public InputStream f8506 = null;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public OutputStream f8518 = null;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public C1946 f8509 = null;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Object f8504 = this;

    public RunnableC1947(RunnableC1945 runnableC1945, Socket socket) {
        this.f8515 = null;
        this.f8511 = null;
        this.f8505 = null;
        this.f8512 = false;
        this.f8514 = null;
        this.f8516 = 0;
        this.f8515 = runnableC1945;
        this.f8511 = socket;
        if (socket != null) {
            try {
                socket.setSoTimeout(f8502);
            } catch (SocketException unused) {
                C1948.m4064(Crypt.a(Crypt.xrc("J0>\u001ak:Idj\u00190;\u001e1jJ7nAghNkmKgiJ0g@elIjmJeo\u001bglA6h\u001dal\u0019chNj;@0kK0gA`mMgn@el\u001a4gI7nIbgA1fJ1:Ic>\u001bj;Hb;\u001ca:")));
            }
        }
        RunnableC1945 runnableC19452 = this.f8515;
        this.f8512 = runnableC19452.f8477;
        this.f8514 = runnableC19452.f8480;
        this.f8516 = runnableC19452.f8488;
        this.f8505 = new byte[NotificationCompat.FLAG_BUBBLE];
    }

    @Override // java.lang.Runnable
    public void run() {
        byte m4062;
        C1946 c1946;
        this.f8504 = this;
        Socket socket = this.f8511;
        boolean z = false;
        if (socket != null) {
            try {
                this.f8503 = socket.getInputStream();
                this.f8517 = this.f8511.getOutputStream();
                z = true;
            } catch (IOException e) {
                C1948.m4064("Proxy - can't get I/O streams!");
                C1948.m4066(e);
            }
        }
        if (!z) {
            C1948.m4064(Crypt.a(Crypt.xrc("I09A1hA`iH7=IfgM1;J`<\u001d1f@ci\u001abi@7=Jb9\u001cjgN1mN4gJfgHjlKf9\u001b6<K7kI3jI")));
            return;
        }
        try {
            m4062 = m4062();
        } catch (Exception e2) {
            C1948.m4066(e2);
        }
        if (m4062 == 4) {
            c1946 = new C1946(this);
        } else {
            if (m4062 != 5) {
                C1948.m4064(Crypt.a(Crypt.xrc("JemK19Kbh\u001a`fH6;O7n\u001b1o\u001c1fA1;\u001ba<Ie9K7iO7fM1:J3k\u001e3iH4j\u0019fo\u001b4jN4m\u001ea9\u001c")) + ((int) m4062));
                m4056();
            }
            c1946 = new C1956(this);
        }
        this.f8509 = c1946;
        C1948.m4069(Crypt.a(Crypt.xrc("KgfI7m\u0019jm\u001d4k@6f\u001a6hIao\u001dgfK0o\u001be=Hk")) + ((int) m4062) + Crypt.a(Crypt.xrc("\u001bgmLd;Ob>Ikg\u001b`=A6n\u001cdjA4:M6<Nbm\u0019`")));
        this.f8509.mo4046(m4062);
        this.f8509.mo4041();
        C1946 c19462 = this.f8509;
        byte b = c19462.f8494;
        if (b == 1) {
            c19462.m4047();
        } else {
            if (b != 2) {
                if (b == 3) {
                    c19462.mo4054();
                }
                m4056();
            }
            c19462.m4045();
        }
        m4057();
        m4056();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m4055(byte[] bArr, int i) {
        OutputStream outputStream = this.f8517;
        if (outputStream != null && i > 0 && i <= bArr.length) {
            try {
                outputStream.write(bArr, 0, i);
                this.f8517.flush();
            } catch (IOException unused) {
                C1948.m4064(Crypt.a(Crypt.xrc("\u001c4gA3fA`hN`kL1hKfnJ`hIdjMgh\u001d7kL6;\u001cc=Kj9MblO`<Jjg\u001c3>\u001c`kI4n\u001bagAdj\u0019")));
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4056() {
        try {
            OutputStream outputStream = this.f8517;
            if (outputStream != null) {
                outputStream.flush();
                this.f8517.close();
            }
        } catch (IOException unused) {
        }
        try {
            OutputStream outputStream2 = this.f8518;
            if (outputStream2 != null) {
                outputStream2.flush();
                this.f8518.close();
            }
        } catch (IOException unused2) {
        }
        try {
            Socket socket = this.f8511;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException unused3) {
        }
        try {
            Socket socket2 = this.f8513;
            if (socket2 != null) {
                socket2.close();
            }
        } catch (IOException unused4) {
        }
        this.f8513 = null;
        this.f8511 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        if (r4 < 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0152 A[SYNTHETIC] */
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4057() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107.p108.p109.p110.p121.p125.p126.RunnableC1947.m4057():void");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m4058(String str, int i) {
        if (str.equals("")) {
            m4056();
            C1948.m4064(Crypt.a(Crypt.xrc("\u0019e;Mb:I1j\u001ab<\u001a1f\u001b4n\u001aj<Nfn@bmK`iI0=AeoKcoJflHj>\u001cj=H7o\u001ego\u001ac=Kdl\u001bfn\u001c1:\u001d`:\u001d1=Ig;M6h\u001ac:NdoLd;Jb:H3>L1l")));
            return;
        }
        if (this.f8512) {
            this.f8513 = new Socket();
            String str2 = this.f8515.f8487;
            if (str2 != null) {
                try {
                    if (str2.startsWith(Crypt.a(Crypt.xrc("IcnL1mA0fHff\u001c0jNfh\u001c0<Ab9\u001egh@4gM3"))) || this.f8515.f8487.startsWith(Crypt.a(Crypt.xrc("A1:K1;O39MkkKk;\u0019`h\u001e3nO3=\u001bak@`:\u001dg")))) {
                        String str3 = this.f8514;
                        int i2 = this.f8516;
                        RunnableC1945 runnableC1945 = this.f8515;
                        C1950 c1950 = new C1950(C1950.EnumC1951.f8526, str3, i2, runnableC1945.f8483, runnableC1945.f8485);
                        this.f8507 = c1950;
                        InterfaceC1955 interfaceC1955 = c1950.f8523;
                        this.f8508 = interfaceC1955;
                        interfaceC1955.mo4070(this.f8513, this.f8509.f8490.getHostAddress(), this.f8509.f8500, f8502 * 1000);
                    } else if (this.f8515.f8487.startsWith(Crypt.a(Crypt.xrc("Jdm\u001edk\u001b7nIg:KjfOj;A0hAdm\u001cd9J7lN3"))) || this.f8515.f8487.startsWith(Crypt.a(Crypt.xrc("\u001d4;OkmL4j\u001e6l\u001bk:\u001ec:\u00194h\u001dk=\u001dd9\u001ddkN1")))) {
                        String str4 = this.f8514;
                        int i3 = this.f8516;
                        RunnableC1945 runnableC19452 = this.f8515;
                        C1950 c19502 = new C1950(C1950.EnumC1951.f8528, str4, i3, runnableC19452.f8483, runnableC19452.f8485);
                        this.f8507 = c19502;
                        InterfaceC1955 interfaceC19552 = c19502.f8523;
                        this.f8508 = interfaceC19552;
                        interfaceC19552.mo4070(this.f8513, this.f8509.f8490.getHostAddress(), this.f8509.f8500, f8502 * 1000);
                    }
                } catch (IOException unused) {
                }
            }
            m4060();
        } else {
            this.f8513 = new Socket(str, i);
        }
        this.f8513.setSoTimeout(f8502);
        boolean z = false;
        InterfaceC1837 interfaceC1837 = App.f3760;
        if (Boolean.parseBoolean(((C1216) interfaceC1837).m2744(((C1216) interfaceC1837).m2739())[2])) {
            InterfaceC1837 interfaceC18372 = App.f3760;
            if (Boolean.parseBoolean(((C1216) interfaceC18372).m2744(((C1216) interfaceC18372).m2739())[15])) {
                z = true;
            }
        }
        StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("M`n@f:\u001bgnM1g\u001909\u00190<\u001ejiAaiIfhKfk\u0019f")));
        m4207.append(z ? Crypt.a(Crypt.xrc("\u001ckk\u001ccj\u001bjh\u001cdj\u001c0j\u001bc>M`<M1f\u001cb<Hk;@3")) : C1948.m4068(this.f8513));
        C1948.m4069(m4207.toString());
        m4061();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m4059() {
        synchronized (this.f8504) {
            InputStream inputStream = this.f8503;
            if (inputStream == null) {
                return -1;
            }
            try {
                int read = inputStream.read(this.f8505, 0, NotificationCompat.FLAG_BUBBLE);
                if (read < 0) {
                    m4056();
                }
                return read;
            } catch (InterruptedIOException unused) {
                return 0;
            } catch (IOException unused2) {
                m4056();
                return -1;
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m4060() {
        String str = this.f8514;
        int i = this.f8516;
        RunnableC1945 runnableC1945 = this.f8515;
        C1950 c1950 = new C1950(C1950.EnumC1951.f8525, str, i, runnableC1945.f8483, runnableC1945.f8485);
        this.f8507 = c1950;
        InterfaceC1955 interfaceC1955 = c1950.f8523;
        this.f8508 = interfaceC1955;
        try {
            interfaceC1955.mo4070(this.f8513, this.f8509.f8490.getHostAddress(), this.f8509.f8500, f8502 * 1000);
        } catch (IOException unused) {
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m4061() {
        synchronized (this.f8504) {
            this.f8506 = this.f8513.getInputStream();
            this.f8518 = this.f8513.getOutputStream();
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public byte m4062() {
        while (this.f8511 != null) {
            try {
                return (byte) this.f8503.read();
            } catch (InterruptedIOException unused) {
                Thread.yield();
            }
        }
        throw new Exception(Crypt.a(Crypt.xrc("Mdk\u001dfjI3j\u001ccf\u00197iM19K1>Ibl\u001d69L7o\u001djn@4=\u00196=\u001b7;\u001b4;Jbh\u001cdi@0:\u0019gjN`hMd;Le:@7fM0:\u001e0f@3>H0iL6g\u001d4k\u001909\u001egk@kl")));
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m4063() {
        Thread thread = new Thread(this);
        this.f8510 = thread;
        thread.start();
    }
}
