package dev.epro.r0;

import com.trilead.ssh2.crypto.cipher.CipherInputStream;
import com.trilead.ssh2.crypto.cipher.CipherOutputStream;
import com.trilead.ssh2.crypto.cipher.NullCipher;
import com.trilead.ssh2.crypto.digest.MessageMac;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O3808217931002834139 {
    public final CipherInputStream c;
    public final CipherOutputStream d;
    public MessageMac f;
    public byte[] g;
    public MessageMac i;
    public byte[] j;
    public byte[] k;
    public J15730374346044043770 l;
    public J15730374346044043770 m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f406o;
    public boolean p;
    public final SecureRandom u;
    public int a = 0;
    public int b = 0;
    public boolean e = false;
    public int h = 8;
    public final byte[] q = new byte[256];
    public final byte[] r = new byte[5];
    public final byte[] s = new byte[256];
    public final byte[] t = new byte[5];

    public O3808217931002834139(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        this.c = new CipherInputStream(new NullCipher(), inputStream);
        this.d = new CipherOutputStream(new NullCipher(), outputStream);
        this.u = secureRandom;
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        if (i == 0) {
            return;
        }
        Q11088980322693754445.h("Remote sent corrupt MAC.");
    }

    public static int b(byte[] bArr, boolean z) {
        int i = (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        if (i <= T1177712003054613961.r) {
            if (i >= (z ? 8 : 12)) {
                return i;
            }
        }
        Q11088980322693754445.h(G6547577305291411977.o(i, "Illegal packet size! (", ")"));
        return 0;
    }

    public final void c(byte[] bArr) {
        int length = bArr.length;
        J15730374346044043770 j15730374346044043770 = this.l;
        if (j15730374346044043770 != null) {
            byte[] bArr2 = (byte[]) j15730374346044043770.e;
            Deflater deflater = (Deflater) j15730374346044043770.c;
            deflater.setInput(bArr, 0, length);
            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) j15730374346044043770.b;
            byteArrayOutputStream.reset();
            while (true) {
                int deflate = deflater.deflate(bArr2, 0, bArr2.length, 2);
                if (deflate <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr2, 0, deflate);
                }
            }
            if (!deflater.needsInput()) {
                Q11088980322693754445.h("SSH compression failed.");
                return;
            } else {
                bArr = byteArrayOutputStream.toByteArray();
                length = bArr.length;
            }
        }
        MessageMac messageMac = this.f;
        boolean z = messageMac != null && messageMac.isEncryptThenMac();
        int i = (z ? 1 : 5) + length + 4;
        int i2 = this.h;
        int i3 = i % i2;
        if (i3 != 0) {
            i += i2 - i3;
        }
        if (i < 16) {
            i = 16;
        }
        int i4 = i - ((z ? 1 : 5) + length);
        boolean z2 = this.e;
        byte[] bArr3 = this.q;
        if (z2) {
            for (int i5 = 0; i5 < i4; i5 += 4) {
                int nextInt = this.u.nextInt();
                bArr3[i5] = (byte) nextInt;
                bArr3[i5 + 1] = (byte) (nextInt >> 8);
                bArr3[i5 + 2] = (byte) (nextInt >> 16);
                bArr3[i5 + 3] = (byte) (nextInt >> 24);
            }
        } else {
            for (int i6 = 0; i6 < i4; i6++) {
                bArr3[i6] = 0;
            }
        }
        int i7 = z ? i : i - 4;
        byte[] bArr4 = this.r;
        bArr4[0] = (byte) (i >> 24);
        bArr4[1] = (byte) (i7 >> 16);
        bArr4[2] = (byte) (i7 >> 8);
        bArr4[3] = (byte) i7;
        bArr4[4] = (byte) i4;
        MessageMac messageMac2 = this.f;
        CipherOutputStream cipherOutputStream = this.d;
        if (messageMac2 == null || !messageMac2.isEncryptThenMac()) {
            cipherOutputStream.write(bArr4, 0, 5);
        } else {
            cipherOutputStream.writePlain(bArr4, 0, 4);
            cipherOutputStream.startRecording();
            cipherOutputStream.write(bArr4, 4, 1);
        }
        cipherOutputStream.write(bArr, 0, length);
        cipherOutputStream.write(bArr3, 0, i4);
        MessageMac messageMac3 = this.f;
        if (messageMac3 != null) {
            messageMac3.initMac(this.a);
            boolean isEncryptThenMac = this.f.isEncryptThenMac();
            MessageMac messageMac4 = this.f;
            if (isEncryptThenMac) {
                messageMac4.update(bArr4, 0, 4);
                byte[] recordedOutput = cipherOutputStream.getRecordedOutput();
                this.f.update(recordedOutput, 0, recordedOutput.length);
            } else {
                messageMac4.update(bArr4, 0, 5);
                this.f.update(bArr, 0, length);
                this.f.update(bArr3, 0, i4);
            }
            this.f.getMac(this.g, 0);
            byte[] bArr5 = this.g;
            cipherOutputStream.writePlain(bArr5, 0, bArr5.length);
        }
        cipherOutputStream.flush();
        this.a++;
    }
}
