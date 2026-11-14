package dev.epro.r0;

import java.net.DatagramSocket;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public final class A3366276765765134789 {
    public static final Z11244019023321623390 d;
    public final String a;
    public final DatagramSocket b;
    public final Q15035754882231748864 c;

    static {
        int iZvmucviioxok;
        izmyclvb.oeynnivvrnts0(857);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iZvmucviioxok = zvmucviioxok(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iZvmucviioxok != 0) {
                switch (iZvmucviioxok) {
                    case 1:
                        d = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void owdbgkqaqrdp(String str, DatagramSocket datagramSocket, Q15035754882231748864 q15035754882231748864, O18369580107802500074 o18369580107802500074);

    private native void qsqdpfxabmcp(String str, DatagramSocket datagramSocket, Q15035754882231748864 q15035754882231748864);

    private static native int zvmucviioxok(Object[] objArr);

    public final native void a();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(1110);
        }

        public static native A3366276765765134789 a(W5797197595347441198 w5797197595347441198, L12639328004344855510 l12639328004344855510);

        private native void eplcfzfosvmo(O18369580107802500074 o18369580107802500074);

        private native void qmgnhrovingm();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            eplcfzfosvmo(o18369580107802500074);
        }

        private Z11244019023321623390() {
            qmgnhrovingm();
        }
    }

    private A3366276765765134789(String str, DatagramSocket datagramSocket, Q15035754882231748864 q15035754882231748864) {
        qsqdpfxabmcp(str, datagramSocket, q15035754882231748864);
    }

    public /* synthetic */ A3366276765765134789(String str, DatagramSocket datagramSocket, Q15035754882231748864 q15035754882231748864, O18369580107802500074 o18369580107802500074) {
        this(str, datagramSocket, q15035754882231748864);
        owdbgkqaqrdp(str, datagramSocket, q15035754882231748864, o18369580107802500074);
    }
}
