package ads_mobile_sdk;

import dev.epro.r0.Q12322214121031392374;
import dev.epro.r0.T10029384717875810847;
import dev.epro.r0.X4856437766232407902;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class c implements T10029384717875810847 {
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

    @Override // dev.epro.r0.T10029384717875810847
    public Object a(FileInputStream fileInputStream) {
        try {
            return X4856437766232407902.b(fileInputStream);
        } catch (IOException e) {
            throw new Q12322214121031392374("Cannot read bytes.", e);
        }
    }

    @Override // dev.epro.r0.T10029384717875810847
    public Object a() {
        return this.a;
    }

    @Override // dev.epro.r0.T10029384717875810847
    public void a(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }
}
