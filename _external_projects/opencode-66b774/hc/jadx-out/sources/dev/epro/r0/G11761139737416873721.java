package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G11761139737416873721 extends Thread {
    public static final Z17301329922361444493 b = Z17301329922361444493.a(G11761139737416873721.class);
    public C16667689525325095505 a;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            C16667689525325095505 c16667689525325095505 = this.a;
            c16667689525325095505.b.r(c16667689525325095505);
            C16667689525325095505 c166676895253250955052 = this.a;
            L6461449118602905387 l6461449118602905387 = c166676895253250955052.c;
            T8548489830177605674 t8548489830177605674 = (T8548489830177605674) c166676895253250955052.d.b;
            byte[] bArr = new byte[6];
            t8548489830177605674.getClass();
            if (t8548489830177605674.read(bArr, 0, 6) != 6) {
                throw new IOException("Unexpected EOF on X11 startup!");
            }
            byte b2 = bArr[0];
            if (b2 != 66 && b2 != 108) {
                throw new IOException("Unknown endian format in X11 message!");
            }
            int i = b2 == 66 ? 0 : 1;
            byte[] bArr2 = new byte[6];
            if (t8548489830177605674.read(bArr2, 0, 6) != 6) {
                throw new IOException("Unexpected EOF on X11 startup!");
            }
            int i2 = ((bArr2[i] & 255) << 8) | (bArr2[1 - i] & 255);
            int i3 = (bArr2[3 - i] & 255) | ((bArr2[i + 2] & 255) << 8);
            if (i2 > 256 || i3 > 256) {
                throw new IOException("Buggy X11 authorization data");
            }
            int i4 = (4 - (i2 % 4)) % 4;
            int i5 = (4 - (i3 % 4)) % 4;
            byte[] bArr3 = new byte[i2];
            byte[] bArr4 = new byte[i3];
            byte[] bArr5 = new byte[4];
            if (t8548489830177605674.read(bArr3, 0, i2) != i2) {
                throw new IOException("Unexpected EOF on X11 startup! (authProtocolName)");
            }
            if (t8548489830177605674.read(bArr5, 0, i4) != i4) {
                throw new IOException("Unexpected EOF on X11 startup! (authProtocolNamePadding)");
            }
            if (t8548489830177605674.read(bArr4, 0, i3) != i3) {
                throw new IOException("Unexpected EOF on X11 startup! (authProtocolData)");
            }
            if (t8548489830177605674.read(bArr5, 0, i5) != i5) {
                throw new IOException("Unexpected EOF on X11 startup! (authProtocolDataPadding)");
            }
            if (!"MIT-MAGIC-COOKIE-1".equals(new String(bArr3, "ISO-8859-1"))) {
                throw new IOException("Unknown X11 authorization protocol!");
            }
            if (i3 != 16) {
                throw new IOException("Wrong data length for X11 authorization data!");
            }
            StringBuffer stringBuffer = new StringBuffer(32);
            for (int i6 = 0; i6 < i3; i6++) {
                String hexString = Integer.toHexString(bArr4[i6] & 255);
                if (hexString.length() != 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            String string = stringBuffer.toString();
            synchronized (this.a) {
                this.a.getClass();
            }
            I13897573759869141187 i13897573759869141187 = this.a.b;
            synchronized (i13897573759869141187.a) {
                try {
                    if (string != null) {
                        if (i13897573759869141187.a.get(string) != null) {
                            throw new ClassCastException();
                        }
                    }
                } finally {
                }
            }
            throw new IOException("Invalid X11 cookie received.");
        } catch (IOException e) {
            b.getClass();
            try {
                C16667689525325095505 c166676895253250955053 = this.a;
                c166676895253250955053.b.d(c166676895253250955053, "IOException in X11 proxy code (" + e.getMessage() + ")");
            } catch (IOException unused) {
            }
        }
    }
}
