package p131.p225.p226.p228;

import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.digest.MAC;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Vector;
import p107.p108.p109.p110.p118.C1862;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.C2698;
import p131.p225.p226.InterfaceC2745;
import p131.p225.p226.p229.C2744;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぉざぅち〻.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2731 {

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final C2773 f10261 = new C2773(C2731.class);

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final int f10262 = Integer.getInteger(C2731.class.getName() + Crypt.a(Crypt.xrc("\u001939Je;\u001c0o\u0019boIcn\u0019ehI3g\u0019gjA7k\u001benOf")), 65536).intValue();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public C2728 f10266;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f10268;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f10270;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Thread f10273;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String f10274;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C2729 f10277;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Vector f10269 = new Vector();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Thread f10264 = null;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Socket f10272 = new Socket();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Object f10265 = new Object();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f10263 = false;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Throwable f10276 = null;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Vector f10271 = new Vector();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Vector f10275 = new Vector();

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f10267 = false;

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぉざぅち〻.いいにぽつ$〺つふすそ, reason: contains not printable characters */
    public class C2732 extends Thread {
        public C2732() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] bArr;
            while (true) {
                synchronized (C2731.this.f10269) {
                    if (C2731.this.f10269.size() == 0) {
                        try {
                            C2731.this.f10269.wait(2000L);
                        } catch (InterruptedException unused) {
                        }
                        if (C2731.this.f10269.size() == 0) {
                            C2731.this.f10264 = null;
                            return;
                        }
                    }
                    bArr = (byte[]) C2731.this.f10269.remove(0);
                }
                try {
                    C2731.this.m4683(bArr);
                } catch (IOException unused2) {
                    return;
                }
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぉざぅち〻.いいにぽつ$くし〴〺ぅ, reason: contains not printable characters */
    public class C2733 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f10279;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f10280;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public InterfaceC2737 f10281;

        public C2733(C2731 c2731) {
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぉざぅち〻.いいにぽつ$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC2734 implements Runnable {
        public RunnableC2734() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C2731.this.m4684();
                throw null;
            } catch (IOException e) {
                C2773 c2773 = C2731.f10261;
                c2773.getClass();
                if (!(C2731.this.m4674() != null)) {
                    c2773.m4753(10, Crypt.a(Crypt.xrc("H4mO0=KkgKalJai\u001een\u001bg<O6;Od=M0nJj9HboM1:Obk\u00197i\u001bei@0o\u001b7=Ogk@6hJ1jJbjM7lI1g\u001c0g\u00190nH3gJ3n\u0019gkK3>\u0019gj\u001dcl")), e);
                }
                C2731.this.m4673(e, false);
                c2773.getClass();
                c2773.m4754(50, Crypt.a(Crypt.xrc("H4mO0=KkgKalJai\u001een\u001bg<O6;Od=M0nJj>Kgj\u001cg;H1lL6kM6:\u001de<@fjLg<Afm\u0019g:Kc>\u001ce=\u001cdiA0l\u001cflMa>Igh\u001b0nNg:O1>\u001bak")));
                C2729 c2729 = C2731.this.f10277;
                if (c2729 != null) {
                    try {
                        c2729.mo4665(e);
                    } catch (IOException unused) {
                    }
                }
                for (int i = 0; i < C2731.this.f10271.size(); i++) {
                    try {
                        ((C2733) C2731.this.f10271.elementAt(i)).f10281.mo4665(e);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    public C2731(String str, int i, String str2) {
        this.f10274 = str;
        this.f10270 = i;
        this.f10268 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02e1, code lost:
    
        if (r5[1] == 0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x058c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4672(com.trilead.ssh2.crypto.CryptoWishList r17, p131.p225.p226.InterfaceC2775 r18, p131.p225.p226.C2772 r19, int r20, int r21, java.security.SecureRandom r22, p131.p225.p226.InterfaceC2700 r23) {
        /*
            Method dump skipped, instructions count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p225.p226.p228.C2731.m4672(com.trilead.ssh2.crypto.CryptoWishList, なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぺふねづ〺, なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.びぐびあび, int, int, java.security.SecureRandom, なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.いいにぽつ):void");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4673(Throwable th, boolean z) {
        Vector vector;
        if (!z) {
            try {
                this.f10272.close();
            } catch (IOException unused) {
            }
        }
        synchronized (this.f10265) {
            if (this.f10276 == null) {
                if (z) {
                    try {
                        String message = th.getMessage();
                        C2744 c2744 = new C2744();
                        c2744.m4712(1);
                        c2744.m4713(11);
                        c2744.m4705(message);
                        c2744.m4705("");
                        byte[] m4709 = c2744.m4709();
                        C2728 c2728 = this.f10266;
                        if (c2728 != null) {
                            c2728.m4664(m4709);
                        }
                    } catch (IOException unused2) {
                    }
                    try {
                        this.f10272.close();
                    } catch (IOException unused3) {
                    }
                }
                if (th == null) {
                    th = new Exception(Crypt.a(Crypt.xrc("@7hHbo\u001ca;Obf\u001bg>H4f\u001cjfK6hHe;\u001dd;\u001dc")));
                }
                this.f10276 = th;
            }
            this.f10265.notifyAll();
        }
        synchronized (this) {
            if (this.f10267) {
                vector = null;
            } else {
                this.f10267 = true;
                vector = (Vector) this.f10275.clone();
            }
        }
        if (vector != null) {
            for (int i = 0; i < vector.size(); i++) {
                try {
                    ((InterfaceC2745) vector.elementAt(i)).mo1667(this.f10276);
                } catch (Exception unused4) {
                }
            }
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Throwable m4674() {
        Throwable th;
        synchronized (this.f10265) {
            th = this.f10276;
        }
        return th;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public void m4675(InterfaceC2737 interfaceC2737, int i, int i2) {
        C2733 c2733 = new C2733(this);
        c2733.f10281 = interfaceC2737;
        c2733.f10279 = i;
        c2733.f10280 = i2;
        synchronized (this.f10271) {
            this.f10271.addElement(c2733);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r7 <= 255) goto L27;
     */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.InetAddress m4676(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            goto L57
        L4:
            r1 = 46
            java.lang.String[] r1 = p034.p095.C1687.m3686(r11, r1)
            int r2 = r1.length
            r3 = 4
            if (r2 == r3) goto Lf
            goto L57
        Lf:
            byte[] r2 = new byte[r3]
            r4 = 0
            r5 = 0
        L13:
            if (r5 >= r3) goto L53
            r6 = r1[r5]
            int r6 = r6.length()
            if (r6 == 0) goto L57
            r6 = r1[r5]
            int r6 = r6.length()
            r7 = 3
            if (r6 <= r7) goto L27
            goto L57
        L27:
            r6 = 0
            r7 = 0
        L29:
            r8 = r1[r5]
            int r8 = r8.length()
            if (r6 >= r8) goto L48
            r8 = r1[r5]
            char r8 = r8.charAt(r6)
            r9 = 48
            if (r8 < r9) goto L57
            r9 = 57
            if (r8 <= r9) goto L40
            goto L57
        L40:
            int r7 = r7 * 10
            int r8 = r8 + (-48)
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L29
        L48:
            r6 = 255(0xff, float:3.57E-43)
            if (r7 <= r6) goto L4d
            goto L57
        L4d:
            byte r6 = (byte) r7
            r2[r5] = r6
            int r5 = r5 + 1
            goto L13
        L53:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r11, r2)
        L57:
            if (r0 == 0) goto L5a
            return r0
        L5a:
            java.net.InetAddress r11 = java.net.InetAddress.getByName(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p225.p226.p228.C2731.m4676(java.lang.String):java.net.InetAddress");
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m4677(BlockCipher blockCipher, MAC mac) {
        C2728 c2728 = this.f10266;
        c2728.f10224.changeCipher(blockCipher);
        c2728.f10232 = mac;
        c2728.f10220 = new byte[mac.size()];
        c2728.f10233 = new byte[mac.size()];
        int blockSize = blockCipher.getBlockSize();
        c2728.f10227 = blockSize;
        if (blockSize < 8) {
            c2728.f10227 = 8;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m4678(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read <= 0) {
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("H7j\u001a`iL4=Jek\u001a6;\u001ecfO3n@e:@enNj>\u001cef\u001aj9\u00190fHclAfo\u001akfHg;\u001akjAjf\u001bb<H`hL")));
                m4207.append(C1862.EnumC1863.f8263.toString());
                m4207.append(Crypt.a(Crypt.xrc("\u001c4>\u001ec:\u001c4kMjk\u001c4gH0nA4kHaiMjg\u001eco\u00190lKd9Hgo\u00197>\u001akjMbgOjiO0o\u001dg>M6iNj<K")));
                throw new IOException(m4207.toString());
            }
            i2 += read;
        }
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public void m4679(byte[] bArr) {
        synchronized (this.f10269) {
            this.f10269.addElement(bArr);
            if (this.f10269.size() > 100) {
                throw new IOException(Crypt.a(Crypt.xrc("KamHjhKbkNcm\u001bc9\u001egf\u001b6>L`;Ljn\u0019e>A3m\u001edf@79Mgl\u001cgoH7k\u001a6=@6g\u001dd<@biM7;\u001dehNd;N3m\u001ekiM3i\u001e3=Oe;\u0019b:L7iJa=\u001aanOji\u001a7hO0nLcj\u001cd;\u001bk9J1kOej\u001bkjIchI4")));
            }
            if (this.f10264 == null) {
                C2732 c2732 = new C2732();
                this.f10264 = c2732;
                c2732.setDaemon(true);
                this.f10264.start();
            }
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2698 m4680(int i) {
        C2698 c2698;
        C2729 c2729 = this.f10277;
        synchronized (c2729.f10246) {
            while (true) {
                c2698 = c2729.f10238;
                if (c2698 == null || c2698.f10195 < i) {
                    if (c2729.f10236) {
                        throw new IOException(Crypt.a(Crypt.xrc("\u001a1>N0gH3=\u001c7nJ6;Kdi\u001cjl\u001b4:\u001ce;\u0019fg\u001969\u001bggA1m\u001acj@`nJfoOc<O0>Hfg\u00196gL19\u001c0gMa;\u001a0iHjmJejMehNkn@4mLfh\u001bdoM6mAjo\u001dk<NbiAbhI4gJk>I1n\u001ajh\u0019kkNkj\u001dc")), c2729.f10239.m4674());
                    }
                    try {
                        c2729.f10246.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
            }
        }
        return c2698;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m4681(byte[] bArr) {
        synchronized (this.f10265) {
            m4682();
            this.f10263 = true;
            try {
                this.f10266.m4664(bArr);
            } catch (IOException e) {
                m4673(e, false);
                throw e;
            }
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m4682() {
        if (this.f10276 != null) {
            throw ((IOException) new IOException(Crypt.a(Crypt.xrc("H7n\u0019e;\u001acnLfn\u001a0oM7k\u001b6jKgi\u001b4>I1:\u001dj=\u00193;\u001cb=\u001b3m\u001adf\u001cd>OknHej\u00190oIa9AcnJ`j\u001d6iIe9@a<KbgL4f\u001b4;Iko\u001effLe<Jjj"))).initCause(this.f10276));
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public void m4683(byte[] bArr) {
        if (Thread.currentThread() == this.f10273) {
            throw new IOException(Crypt.a(Crypt.xrc("M3kJ3oO4jLcoN69\u001c3h\u001b`>\u001c19K1jAb;N`;\u001aemIkf\u001a4k\u001e1hLkg\u001c4<\u00197k\u001bf;H0g\u001ea:Ak:\u001ek:\u001ajlMj<M4:\u001e`l\u001e`n\u001c1n\u001efiO69\u001db;K7kHfhAf<Jd<\u001ebo@4i\u001ba<@4o\u001c6l\u001e1=\u001cbnIbj\u001dgn\u001b0:Oah\u001b09\u001c3iIdkKcn\u001d3kO7m\u001c")));
        }
        synchronized (this.f10265) {
            while (true) {
                m4682();
                if (this.f10263) {
                    try {
                        this.f10265.wait();
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                } else {
                    try {
                        this.f10266.m4664(bArr);
                    } catch (IOException e) {
                        m4673(e, false);
                        throw e;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0136 A[Catch: ParseException | Exception -> 0x01c2, TryCatch #0 {ParseException | Exception -> 0x01c2, blocks: (B:122:0x00ff, B:124:0x0136, B:126:0x01a6), top: B:121:0x00ff }] */
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4684() {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p225.p226.p228.C2731.m4684():void");
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m4685(InterfaceC2737 interfaceC2737, int i, int i2) {
        synchronized (this.f10271) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f10271.size()) {
                    break;
                }
                C2733 c2733 = (C2733) this.f10271.elementAt(i3);
                if (c2733.f10281 == interfaceC2737 && c2733.f10279 == i && c2733.f10280 == i2) {
                    this.f10271.removeElementAt(i3);
                    break;
                }
                i3++;
            }
        }
    }
}
