package dev.epro.r0;

import java.io.OutputStream;
import java.net.InetAddress;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W93717663648739973 extends S7384666539529547401 {
    public byte[] g;

    public W93717663648739973(int i, int i2, InetAddress inetAddress, int i3, String str) {
        super(i2, inetAddress, i3);
        this.f = str;
        this.b = i;
        byte[] bArr = new byte[str == null ? 8 : str.length() + 9];
        this.g = bArr;
        bArr[0] = (byte) i;
        bArr[1] = (byte) this.d;
        bArr[2] = (byte) (i3 >> 8);
        bArr[3] = (byte) i3;
        System.arraycopy(inetAddress != null ? inetAddress.getAddress() : new byte[]{0, 0, 0, 0}, 0, this.g, 4, 4);
        if (str != null) {
            byte[] bytes = str.getBytes();
            System.arraycopy(bytes, 0, this.g, 8, bytes.length);
            byte[] bArr2 = this.g;
            bArr2[bArr2.length - 1] = 0;
        }
    }

    @Override // dev.epro.r0.S7384666539529547401
    public final void b(OutputStream outputStream) {
        byte[] bArr = this.g;
        if (bArr == null) {
            bArr = new W93717663648739973(this.b, this.d, this.a, this.c, this.f).g;
            this.g = bArr;
        }
        outputStream.write(bArr);
    }

    public W93717663648739973() {
        super(91, null, 0);
        this.f = null;
        this.g = new byte[]{0, 91};
    }
}
