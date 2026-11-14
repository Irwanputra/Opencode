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

/* JADX INFO: loaded from: classes3.dex */
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
            int iLntbpzanmooq;
            izmyclvb.qgayjvbiagej2(615);
            Object[] objArr = new Object[3];
            while (true) {
                try {
                    iLntbpzanmooq = lntbpzanmooq(objArr);
                } finally {
                    Arrays.fill(objArr, (Object) null);
                }
                if (iLntbpzanmooq != 0) {
                    switch (iLntbpzanmooq) {
                        case 1:
                            h = (Z11244019023321623390) objArr[1];
                            break;
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
    public /* synthetic */ P17638734969945972448(List list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, B13729205492206812220 b137292054922068122202, int i, O18369580107802500074 o18369580107802500074) {
        Object[] objArrPnxhykhhtkbu = pnxhykhhtkbu(list, f4096073349764486348, b13729205492206812220, l12639328004344855510, b137292054922068122202, i, o18369580107802500074);
        this(list, (F4096073349764486348) objArrPnxhykhhtkbu[0], (B13729205492206812220) objArrPnxhykhhtkbu[1], (L12639328004344855510) objArrPnxhykhhtkbu[2], (B13729205492206812220) objArrPnxhykhhtkbu[3]);
        fgobzpfrhmzm();
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
