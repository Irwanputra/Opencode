package dev.epro.r0;

import java.io.Closeable;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class W1119940155978524832 implements Closeable {
    public static final Z11244019023321623390 g;
    public final String a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final String e;
    public final byte[] f;

    static {
        int iYwiqadejfqol;
        izmyclvb.qgayjvbiagej2(253);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iYwiqadejfqol = ywiqadejfqol(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iYwiqadejfqol != 0) {
                switch (iYwiqadejfqol) {
                    case 1:
                        g = (Z11244019023321623390) objArr[1];
                        break;
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void hyynalygwnvm(String str, String str2, byte[] bArr, byte[] bArr2, String str3, byte[] bArr3);

    private native void jwankdnmrqig(String str, String str2, byte[] bArr, byte[] bArr2, String str3, byte[] bArr3, O18369580107802500074 o18369580107802500074);

    private static native int ywiqadejfqol(Object[] objArr);

    public final native JSONObject b(byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final native void close();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(853);
        }

        private native void bpbyfzoqrech();

        private native void ddqoucqbgrns(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            ddqoucqbgrns(o18369580107802500074);
        }

        private Z11244019023321623390() {
            bpbyfzoqrech();
        }
    }

    private W1119940155978524832(String str, String str2, byte[] bArr, byte[] bArr2, String str3, byte[] bArr3) {
        hyynalygwnvm(str, str2, bArr, bArr2, str3, bArr3);
    }

    public /* synthetic */ W1119940155978524832(String str, String str2, byte[] bArr, byte[] bArr2, String str3, byte[] bArr3, O18369580107802500074 o18369580107802500074) {
        this(str, str2, bArr, bArr2, str3, bArr3);
        jwankdnmrqig(str, str2, bArr, bArr2, str3, bArr3, o18369580107802500074);
    }
}
