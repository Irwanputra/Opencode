package dev.epro.r0;

import android.net.Network;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collection;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class D10134974485008251909 {
    public static final D10134974485008251909 a;

    static {
        int iBzqgphqnnbit;
        izmyclvb.oeynnivvrnts0(477);
        Object[] objArr = new Object[3];
        while (true) {
            try {
                iBzqgphqnnbit = bzqgphqnnbit(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iBzqgphqnnbit != 0) {
                switch (iBzqgphqnnbit) {
                    case 1:
                        a = (D10134974485008251909) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public static native void a(D10134974485008251909 d10134974485008251909, Socket socket, Z11244019023321623390 z11244019023321623390, int i, F4096073349764486348 f4096073349764486348, V14513365896667116290 v14513365896667116290, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, int i2);

    public static native void b(D10134974485008251909 d10134974485008251909, Socket socket, Z11244019023321623390 z11244019023321623390, int i);

    private static native int bzqgphqnnbit(Object[] objArr);

    public static native Z11244019023321623390 c(D10134974485008251909 d10134974485008251909, String str, int i, Collection collection, V14513365896667116290 v14513365896667116290, int i2);

    private native void cengjdgczbzm();

    public static final class Z11244019023321623390 {
        public final Network a;
        public final InetSocketAddress b;
        public final String c;

        static {
            izmyclvb.oeynnivvrnts0(672);
        }

        public /* synthetic */ Z11244019023321623390(Network network, InetSocketAddress inetSocketAddress, String str, int i, O18369580107802500074 o18369580107802500074) {
            this(network, inetSocketAddress, (String) deuutrdpeazl(network, inetSocketAddress, str, i, o18369580107802500074)[0]);
            ivssubcnwegu();
        }

        private native void anaqtjdkqpvb(Network network, InetSocketAddress inetSocketAddress, String str);

        private static native Object[] deuutrdpeazl(Network network, InetSocketAddress inetSocketAddress, String str, int i, O18369580107802500074 o18369580107802500074);

        private native void ivssubcnwegu();

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Z11244019023321623390(Network network, InetSocketAddress inetSocketAddress, String str) {
            inetSocketAddress.getClass();
            str.getClass();
            anaqtjdkqpvb(network, inetSocketAddress, str);
        }
    }

    private D10134974485008251909() {
        cengjdgczbzm();
    }
}
