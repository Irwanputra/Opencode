package dev.epro.r0;

import dev.epro.r0.I10641435353074925267;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class U667337960309079714 {
    public static final /* synthetic */ int b = 0;
    public volatile H4191455248956457601 a;

    static {
        izmyclvb.qgayjvbiagej2(1041);
        pxqqrlsyhfir();
    }

    public static native boolean b(H4191455248956457601 h4191455248956457601, int i);

    public static native H4191455248956457601 c(Y6921797927338498306 y6921797927338498306, int i, I10641435353074925267.Z11244019023321623390 z11244019023321623390);

    private native void cqnldquzpjwl();

    private static native void pxqqrlsyhfir();

    public final native void a();

    public static final class H4191455248956457601 {
        public final Y6921797927338498306 a;
        public final Socket b;
        public final DataInputStream c;
        public final DataOutputStream d;

        static {
            izmyclvb.qgayjvbiagej2(862);
        }

        private native void dtxfwcqucbvy(Y6921797927338498306 y6921797927338498306, Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream);

        public H4191455248956457601(Y6921797927338498306 y6921797927338498306, Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
            y6921797927338498306.getClass();
            socket.getClass();
            dataInputStream.getClass();
            dataOutputStream.getClass();
            dtxfwcqucbvy(y6921797927338498306, socket, dataInputStream, dataOutputStream);
        }
    }

    public static final class Y11460403151847909905 {
        public final boolean a;
        public final long b;

        static {
            izmyclvb.qgayjvbiagej2(469);
        }

        private native void qjjiybbexank(boolean z, long j);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y11460403151847909905(boolean z, long j) {
            qjjiybbexank(z, j);
        }
    }

    public static final class Y6921797927338498306 {
        public final String a;
        public final int b;
        public final String c;
        public final Integer d;

        static {
            izmyclvb.qgayjvbiagej2(958);
        }

        private native void gfcpiuyooxev(String str, int i, String str2, Integer num);

        public final native boolean equals(Object obj);

        public final native int hashCode();

        public final native String toString();

        public Y6921797927338498306(String str, int i, String str2, Integer num) {
            str.getClass();
            gfcpiuyooxev(str, i, str2, num);
        }
    }

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(2170);
        }

        private native void huopirscmsnu();

        private native void xjchtvcyfiog(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            xjchtvcyfiog(o18369580107802500074);
        }

        private Z11244019023321623390() {
            huopirscmsnu();
        }
    }

    public U667337960309079714() {
        cqnldquzpjwl();
    }
}
