package dev.epro.r0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class O8409066218305708966 implements AutoCloseable {
    public static final /* synthetic */ int f = 0;
    public final B13729205492206812220 a;
    public final ArrayList b;
    public boolean c;
    public long d;
    public long e;

    public static final /* synthetic */ class Z11244019023321623390 extends H4611829575853284164 implements B13729205492206812220 {
        public static final Z11244019023321623390 h;

        static {
            int iVyhxupprpwze;
            izmyclvb.dpqpjfpoanwt1(700);
            Object[] objArr = new Object[3];
            while (true) {
                try {
                    iVyhxupprpwze = vyhxupprpwze(objArr);
                } finally {
                    Arrays.fill(objArr, (Object) null);
                }
                if (iVyhxupprpwze != 0) {
                    switch (iVyhxupprpwze) {
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

        private native void qklpwytyyzth();

        private static native int vyhxupprpwze(Object[] objArr);

        @Override // dev.epro.r0.B13729205492206812220
        public final native Object invoke();

        public Z11244019023321623390() {
            super(0, System.class, izmyclvb.sb250e956f549(255), izmyclvb.sb250e956f549(256), 0);
            qklpwytyyzth();
        }
    }

    static {
        izmyclvb.dpqpjfpoanwt1(1732);
        qmehsmquiybo();
    }

    public /* synthetic */ O8409066218305708966(B13729205492206812220 b13729205492206812220, int i, O18369580107802500074 o18369580107802500074) {
        this((B13729205492206812220) nbdgmzilrumc(b13729205492206812220, i, o18369580107802500074)[0]);
        igblkkqosomb1();
    }

    public static native void b(StringBuilder sb, X7661261485523370262 x7661261485523370262, G8126058084362237837 g8126058084362237837);

    public static native void c(StringBuilder sb, String str, M17934926394694525382 m17934926394694525382);

    private native void igblkkqosomb();

    private native void igblkkqosomb1();

    private static native Object[] nbdgmzilrumc(B13729205492206812220 b13729205492206812220, int i, O18369580107802500074 o18369580107802500074);

    private static native void qmehsmquiybo();

    private native void qmqfyfvosttw(B13729205492206812220 b13729205492206812220);

    @Override // java.lang.AutoCloseable
    public final native synchronized void close();

    public final native synchronized M17934926394694525382 d(C17200701318093115733 c17200701318093115733);

    public final native synchronized void e(M17934926394694525382 m17934926394694525382, IOException iOException);

    public final native T8928359298068510532 g(C17200701318093115733 c17200701318093115733);

    public final native synchronized ArrayList h();

    public static final class Y6921797927338498306 {
        static {
            izmyclvb.dpqpjfpoanwt1(687);
        }

        private native void hfkbvbfftvew(O18369580107802500074 o18369580107802500074);

        private native void ybkzwarvglkw();

        public /* synthetic */ Y6921797927338498306(O18369580107802500074 o18369580107802500074) {
            this();
            hfkbvbfftvew(o18369580107802500074);
        }

        private Y6921797927338498306() {
            ybkzwarvglkw();
        }
    }

    public O8409066218305708966(B13729205492206812220 b13729205492206812220) {
        b13729205492206812220.getClass();
        qmqfyfvosttw(b13729205492206812220);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public O8409066218305708966() {
        this(null, 1, 0 == true ? 1 : 0);
        igblkkqosomb();
    }
}
