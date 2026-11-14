package dev.epro.httpcustom.protocol.ssh;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class HcrNativeCodec {
    public static final int $stable = 0;
    public static final dev.epro.httpcustom.protocol.ssh.HcrNativeCodec INSTANCE;

    static {
        int iOjrxijvrgaxo;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1141);
        java.lang.Object[] objArr = new java.lang.Object[3];
        while (true) {
            try {
                iOjrxijvrgaxo = ojrxijvrgaxo(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iOjrxijvrgaxo != 0) {
                switch (iOjrxijvrgaxo) {
                    case 1:
                        INSTANCE = (dev.epro.httpcustom.protocol.ssh.HcrNativeCodec) objArr[1];
                        break;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    private native void hklyyjnormys();

    private static native int ojrxijvrgaxo(java.lang.Object[] objArr);

    public static final native boolean transform(byte[] bArr, byte[] bArr2, int i, long j, boolean z, int i2);

    private HcrNativeCodec() {
        hklyyjnormys();
    }
}
