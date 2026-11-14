package dev.epro.r0;

import java.io.Closeable;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class F11224443307656300820 implements Closeable {
    public static final Z11244019023321623390 g;
    public final String a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final String e;
    public final byte[] f;

    static {
        int iHhdzcrmftonn;
        izmyclvb.dpqpjfpoanwt1(372);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                iHhdzcrmftonn = hhdzcrmftonn(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (iHhdzcrmftonn != 0) {
                switch (iHhdzcrmftonn) {
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

    private static native int hhdzcrmftonn(Object[] objArr);

    private native void pfrzcglkdpek(String str, String str2, byte[] bArr, byte[] bArr2, String str3, byte[] bArr3, O18369580107802500074 o18369580107802500074);

    private native void sfxzdxxkelbe(String str, String str2, byte[] bArr, byte[] bArr2, String str3, byte[] bArr3);

    public final native JSONObject b(byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final native void close();

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(2185);
        }

        public static native F11224443307656300820 a(W11116729843002712799 w11116729843002712799, JSONObject jSONObject);

        private native void nuydrxgsrypw();

        private native void qfqnaqipbauy(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            qfqnaqipbauy(o18369580107802500074);
        }

        private Z11244019023321623390() {
            nuydrxgsrypw();
        }
    }

    private F11224443307656300820(String str, String str2, byte[] bArr, byte[] bArr2, String str3, byte[] bArr3) {
        sfxzdxxkelbe(str, str2, bArr, bArr2, str3, bArr3);
    }

    public /* synthetic */ F11224443307656300820(String str, String str2, byte[] bArr, byte[] bArr2, String str3, byte[] bArr3, O18369580107802500074 o18369580107802500074) {
        this(str, str2, bArr, bArr2, str3, bArr3);
        pfrzcglkdpek(str, str2, bArr, bArr2, str3, bArr3, o18369580107802500074);
    }
}
