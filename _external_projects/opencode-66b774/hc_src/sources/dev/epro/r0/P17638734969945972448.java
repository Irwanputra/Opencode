package dev.epro.r0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class P17638734969945972448 implements AutoCloseable {
    public static final /* synthetic */ int k = 0;
    public final List a;
    public final F4096073349764486348 b;
    public final B13729205492206812220 c;
    public final L12639328004344855510 d;
    public final B13729205492206812220 e;
    public final A2789795882633926065 f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public final AtomicInteger i;
    public volatile boolean j;

    public static final /* synthetic */ class Z11244019023321623390 extends H4611829575853284164 implements B13729205492206812220 {
        public static final Z11244019023321623390 h;

        static {
            int lntbpzanmooq;
            izmyclvb.qgayjvbiagej2(615);
            Object[] objArr = new Object[3];
            while (true) {
                try {
                    lntbpzanmooq = lntbpzanmooq(objArr);
                } finally {
                    Arrays.fill(objArr, (Object) null);
                }
                if (lntbpzanmooq != 0) {
                    switch (lntbpzanmooq) {
                        case 1:
                            h = (Z11244019023321623390) objArr[1];
                        default:
                            throw null;
                    }
                    Arrays.fill(objArr, (Object) null);
                }
                return;
            }
        }

        private static native int lntbpzanmooq(Object[] objArr);

        private native void vaspxvzlycpn();

        @Override // dev.epro.r0.B13729205492206812220
        public final native Object invoke();

        public Z11244019023321623390() {
            super(0, Socket.class, izmyclvb.sb250e956f549(324), izmyclvb.sb250e956f549(325), 0);
            vaspxvzlycpn();
        }
    }

    static {
        izmyclvb.qgayjvbiagej2(88);
        yjoieawoeajh();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ P17638734969945972448(java.util.List r23, dev.epro.r0.F4096073349764486348 r24, dev.epro.r0.B13729205492206812220 r25, dev.epro.r0.L12639328004344855510 r26, dev.epro.r0.B13729205492206812220 r27, int r28, dev.epro.r0.O18369580107802500074 r29) {
        /*
            r22 = this;
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r5
            java.lang.Object[] r0 = pnxhykhhtkbu(r23, r24, r25, r26, r27, r28, r29)
            r1 = 0
            r2 = r0[r1]
            dev.epro.r0.F4096073349764486348 r2 = (dev.epro.r0.F4096073349764486348) r2
            r7 = r2
            r1 = 1
            r2 = r0[r1]
            dev.epro.r0.B13729205492206812220 r2 = (dev.epro.r0.B13729205492206812220) r2
            r8 = r2
            r1 = 2
            r2 = r0[r1]
            dev.epro.r0.L12639328004344855510 r2 = (dev.epro.r0.L12639328004344855510) r2
            r9 = r2
            r1 = 3
            r2 = r0[r1]
            dev.epro.r0.B13729205492206812220 r2 = (dev.epro.r0.B13729205492206812220) r2
            r10 = r2
            r5 = r13
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r9
            r19 = r10
            r14.<init>(r15, r16, r17, r18, r19)
            r14 = r5
            r14.fgobzpfrhmzm()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P17638734969945972448.<init>(java.util.List, dev.epro.r0.F4096073349764486348, dev.epro.r0.B13729205492206812220, dev.epro.r0.L12639328004344855510, dev.epro.r0.B13729205492206812220, int, dev.epro.r0.O18369580107802500074):void");
    }

    private native void bewzmtzaguwg(List<String> list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, B13729205492206812220 b137292054922068122202);

    private native void fgobzpfrhmzm();

    private static native Object[] pnxhykhhtkbu(List list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, B13729205492206812220 b137292054922068122202, int i, O18369580107802500074 o18369580107802500074);

    private static native void yjoieawoeajh();

    public final native void b(String str, Y6921797927338498306 y6921797927338498306);

    public final native Serializable c(String str, Y6921797927338498306 y6921797927338498306, byte[] bArr, int i, K14749510448791472029 k14749510448791472029);

    @Override // java.lang.AutoCloseable
    public final native synchronized void close();

    public final native Serializable d(String str, byte[] bArr, int i, K14749510448791472029 k14749510448791472029);

    public final native synchronized Y6921797927338498306 e(String str, Y6921797927338498306 y6921797927338498306);

    public final native Object g(String str, K14749510448791472029 k14749510448791472029);

    public final native Object h(String str, K14749510448791472029 k14749510448791472029);

    public final native Serializable j(byte[] bArr, int i, K14749510448791472029 k14749510448791472029);

    public static final class Y11460403151847909905 {
        static {
            izmyclvb.qgayjvbiagej2(2189);
        }

        private native void wmtpmlbmvkde();

        private native void xasekivahnfb(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Y11460403151847909905(O18369580107802500074 o18369580107802500074) {
            this();
            xasekivahnfb(o18369580107802500074);
        }

        private Y11460403151847909905() {
            wmtpmlbmvkde();
        }
    }

    public static final class Y6921797927338498306 {
        public final Socket a;
        public final DataInputStream b;
        public final DataOutputStream c;
        public final ConcurrentHashMap d;
        public final H15186625828076266306 e;
        public X7175349259954592591 f;

        static {
            izmyclvb.qgayjvbiagej2(157);
        }

        private native void wcllvghlhwel(Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream);

        public Y6921797927338498306(Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
            socket.getClass();
            dataInputStream.getClass();
            dataOutputStream.getClass();
            wcllvghlhwel(socket, dataInputStream, dataOutputStream);
        }
    }

    public P17638734969945972448(List<String> list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, B13729205492206812220 b137292054922068122202) {
        list.getClass();
        b13729205492206812220.getClass();
        b137292054922068122202.getClass();
        bewzmtzaguwg(list, f4096073349764486348, b13729205492206812220, l12639328004344855510, b137292054922068122202);
    }
}
