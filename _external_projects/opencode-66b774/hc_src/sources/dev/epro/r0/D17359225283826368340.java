package dev.epro.r0;

import java.security.SecureRandom;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class D17359225283826368340 {
    public static final SecureRandom b;
    public final byte[] a;

    static {
        int sqbenffkxvrs;
        izmyclvb.oeynnivvrnts0(85);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                sqbenffkxvrs = sqbenffkxvrs(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (sqbenffkxvrs != 0) {
                switch (sqbenffkxvrs) {
                    case 1:
                        b = (SecureRandom) objArr[1];
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    public /* synthetic */ D17359225283826368340(byte[] bArr, int i, O18369580107802500074 o18369580107802500074) {
        this((byte[]) klxkrltqkhft(bArr, i, o18369580107802500074)[0]);
        rmpbnlitftow1();
    }

    private static native Object[] klxkrltqkhft(byte[] bArr, int i, O18369580107802500074 o18369580107802500074);

    private native void nduqymejlomn(byte[] bArr);

    private native void rmpbnlitftow();

    private native void rmpbnlitftow1();

    private static native int sqbenffkxvrs(Object[] objArr);

    public final native byte[] a(byte[] bArr, byte[] bArr2);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.oeynnivvrnts0(1092);
        }

        private native void ftdpytixgffr();

        private native void viuatjxyolyz(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            viuatjxyolyz(o18369580107802500074);
        }

        private Z11244019023321623390() {
            ftdpytixgffr();
        }
    }

    public D17359225283826368340(byte[] bArr) {
        bArr.getClass();
        nduqymejlomn(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D17359225283826368340() {
        this(null, 1, 0 == true ? 1 : 0);
        rmpbnlitftow();
    }
}
