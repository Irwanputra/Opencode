package dev.epro.r0;

import dev.epro.r0.R8506001224295282223;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class K4771592576423649304 implements AutoCloseable {

    /* renamed from: o, reason: collision with root package name */
    public static final char[] f332o;
    public final int a;
    public final int b;
    public final boolean c;
    public final P17638734969945972448 d;
    public final A2789795882633926065 e;
    public final InetSocketAddress f;
    public volatile ServerSocket g;
    public volatile DatagramSocket h;
    public final Y11460403151847909905 i;
    public final Object j;
    public final HashMap k;
    public final HashMap l;
    public int m;
    public final Set n;

    public final class Y11460403151847909905 {
        public final Object a;
        public Socket b;
        public OutputStream c;
        public boolean d;

        static {
            izmyclvb.dpqpjfpoanwt1(521);
        }

        private native void dteeuajapsjs(K4771592576423649304 k4771592576423649304);

        public final native void a();

        public final native OutputStream b();

        public final native Object c(Socket socket, K14749510448791472029 k14749510448791472029);

        public Y11460403151847909905() {
            dteeuajapsjs(K4771592576423649304.this);
        }
    }

    static {
        int iqbpbktmikmn;
        izmyclvb.dpqpjfpoanwt1(1029);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iqbpbktmikmn = iqbpbktmikmn(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iqbpbktmikmn != 0) {
                switch (iqbpbktmikmn) {
                    case 1:
                        f332o = (char[]) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ K4771592576423649304(int r28, int r29, int r30, boolean r31, dev.epro.r0.P17638734969945972448 r32, int r33, dev.epro.r0.O18369580107802500074 r34) {
        /*
            r27 = this;
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = r33
            r17 = r34
            r18 = r10
            java.lang.Object[] r0 = jekuuvadkhbj(r28, r29, r30, r31, r32, r33, r34)
            r1 = 0
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5 = r2
            r1 = 1
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6 = r2
            r1 = 2
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7 = r2
            r1 = 3
            r2 = r0[r1]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8 = r2
            r1 = 4
            r2 = r0[r1]
            dev.epro.r0.P17638734969945972448 r2 = (dev.epro.r0.P17638734969945972448) r2
            r9 = r2
            r4 = r18
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r19.<init>(r20, r21, r22, r23, r24)
            r19 = r4
            r19.cmojtmdvbsjs()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K4771592576423649304.<init>(int, int, int, boolean, dev.epro.r0.P17638734969945972448, int, dev.epro.r0.O18369580107802500074):void");
    }

    private native void cmojtmdvbsjs();

    private static native int iqbpbktmikmn(Object[] objArr);

    private static native Object[] jekuuvadkhbj(int i, int i2, int i3, boolean z, P17638734969945972448 p17638734969945972448, int i4, O18369580107802500074 o18369580107802500074);

    private native void pltaydpcjtsw(int i, int i2, int i3, boolean z, P17638734969945972448 p17638734969945972448);

    public final native Object b(DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress, int i, byte[] bArr, int i2, byte[] bArr2, K14749510448791472029 k14749510448791472029);

    public final native void c(Socket socket);

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native int d();

    public final native void e(Socket socket, OutputStream outputStream, R8506001224295282223.Z11244019023321623390 z11244019023321623390);

    public final native void g();

    public final native void h();

    public final native Object j(K14749510448791472029 k14749510448791472029);

    public static final class Y6921797927338498306 {
        public final int a;
        public final InetSocketAddress b;
        public final int c;
        public final byte[] d;
        public final int e;
        public String f;
        public long g;
        public boolean h;

        static {
            izmyclvb.dpqpjfpoanwt1(2194);
        }

        private native void yazycsibftwo(int i, InetSocketAddress inetSocketAddress, int i2, byte[] bArr, int i3, boolean z);

        public Y6921797927338498306(int i, InetSocketAddress inetSocketAddress, int i2, byte[] bArr, int i3, boolean z) {
            inetSocketAddress.getClass();
            bArr.getClass();
            yazycsibftwo(i, inetSocketAddress, i2, bArr, i3, z);
        }
    }

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1747);
        }

        private native void bnsgumzojwid(O18369580107802500074 o18369580107802500074);

        private native void laiyjlxevjos();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            bnsgumzojwid(o18369580107802500074);
        }

        private Z11244019023321623390() {
            laiyjlxevjos();
        }
    }

    public K4771592576423649304(int i, int i2, int i3, boolean z, P17638734969945972448 p17638734969945972448) {
        pltaydpcjtsw(i, i2, i3, z, p17638734969945972448);
    }
}
