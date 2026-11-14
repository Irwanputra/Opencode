package dev.epro.r0;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N14053612894154340932 extends S7384666539529547401 {
    public int g;
    public byte[] h;

    public N14053612894154340932(int i, InetAddress inetAddress, int i2) {
        super(i, inetAddress, i2);
        this.e = inetAddress == null ? "0.0.0.0" : inetAddress.getHostName();
        this.b = 5;
        byte[] address = inetAddress == null ? new byte[]{0, 0, 0, 0} : inetAddress.getAddress();
        int i3 = address.length == 4 ? 1 : 4;
        this.g = i3;
        byte[] bArr = new byte[address.length + 6];
        this.h = bArr;
        bArr[0] = 5;
        bArr[1] = (byte) this.d;
        bArr[2] = 0;
        bArr[3] = (byte) i3;
        System.arraycopy(address, 0, bArr, 4, address.length);
        byte[] bArr2 = this.h;
        bArr2[bArr2.length - 2] = (byte) (i2 >> 8);
        bArr2[bArr2.length - 1] = (byte) i2;
    }

    @Override // dev.epro.r0.S7384666539529547401
    public final void b(OutputStream outputStream) {
        N14053612894154340932 n14053612894154340932;
        byte[] bArr = this.h;
        if (bArr == null) {
            if (this.g == 3) {
                int i = this.d;
                String str = this.e;
                int i2 = this.c;
                n14053612894154340932 = new N14053612894154340932(i, null, i2);
                n14053612894154340932.e = str;
                n14053612894154340932.b = 5;
                n14053612894154340932.g = 3;
                byte[] bytes = str.getBytes();
                byte[] bArr2 = new byte[bytes.length + 7];
                n14053612894154340932.h = bArr2;
                bArr2[0] = 5;
                bArr2[1] = (byte) n14053612894154340932.d;
                bArr2[2] = 0;
                bArr2[3] = 3;
                bArr2[4] = (byte) bytes.length;
                System.arraycopy(bytes, 0, bArr2, 5, bytes.length);
                byte[] bArr3 = n14053612894154340932.h;
                bArr3[bArr3.length - 2] = (byte) (i2 >> 8);
                bArr3[bArr3.length - 1] = (byte) i2;
            } else {
                InetAddress inetAddress = this.a;
                if (inetAddress == null) {
                    try {
                        inetAddress = InetAddress.getByName(this.e);
                        this.a = inetAddress;
                    } catch (UnknownHostException unused) {
                        throw new T18240948269476143335(393216);
                    }
                }
                n14053612894154340932 = new N14053612894154340932(this.d, inetAddress, this.c);
            }
            bArr = n14053612894154340932.h;
            this.h = bArr;
        }
        outputStream.write(bArr);
    }

    @Override // dev.epro.r0.S7384666539529547401
    public final String toString() {
        int i = this.b;
        int i2 = this.d;
        int i3 = this.g;
        String str = this.e;
        int i4 = this.c;
        StringBuilder p = E12098517352909843120.p(i, i2, "Socks5Message:\nVN   ", "\nCMD  ", "\nATYP ");
        p.append(i3);
        p.append("\nADDR ");
        p.append(str);
        p.append("\nPORT ");
        return E12098517352909843120.n(p, i4, "\n");
    }

    public N14053612894154340932(int i) {
        super(i, null, 0);
        this.h = new byte[]{5, (byte) i, 0};
    }
}
