package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class c implements dev.epro.r0.T10029384717875810847 {
    public final byte[] a;

    public c(byte[] bArr, byte b) {
        switch (b) {
            case 1:
                this.a = bArr;
                break;
            default:
                this.a = new byte[256];
                for (int i = 0; i < 256; i++) {
                    this.a[i] = (byte) i;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < 256; i3++) {
                    byte[] bArr2 = this.a;
                    byte b2 = bArr2[i3];
                    i2 = (i2 + b2 + bArr[i3 % bArr.length]) & 255;
                    bArr2[i3] = bArr2[i2];
                    bArr2[i2] = b2;
                }
                break;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.Q12322214121031392374 */
    public java.lang.Object a(java.io.FileInputStream fileInputStream) throws dev.epro.r0.Q12322214121031392374 {
        try {
            return dev.epro.r0.X4856437766232407902.b(fileInputStream);
        } catch (java.io.IOException e) {
            throw new dev.epro.r0.Q12322214121031392374("Cannot read bytes.", e);
        }
    }

    public java.lang.Object a() {
        return this.a;
    }

    public void a(java.lang.Object obj, java.io.FileOutputStream fileOutputStream) throws java.io.IOException {
        fileOutputStream.write((byte[]) obj);
    }
}
