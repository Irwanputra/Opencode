package ads_mobile_sdk;

import dev.epro.r0.K2042933864045806308;
import dev.epro.r0.L16390669445741171034;
import dev.epro.r0.T3803022700175900929;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class a {
    public MessageDigest a;
    public final vi3 b;
    public final Object c = new Object();
    public boolean d = false;
    public SecureRandom e;

    public a(vi3 vi3Var) {
        this.b = vi3Var;
    }

    public final byte[] a(byte[] bArr, String str, boolean z) {
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            K2042933864045806308.h();
            return null;
        }
        ByteBuffer put = ByteBuffer.allocate(i + 1).put((byte) bArr.length);
        if (bArr.length < i) {
            int length = i - bArr.length;
            byte[] bArr2 = new byte[length];
            this.e.nextBytes(bArr2);
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length + length);
            System.arraycopy(bArr2, 0, copyOf, bArr.length, length);
            bArr = copyOf;
        }
        byte[] array = put.put(bArr).array();
        if (z) {
            array = ByteBuffer.allocate(256).put(a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (ak0 ak0Var : new gk0().K2) {
            ak0Var.a(array, bArr3);
        }
        if (!T3803022700175900929.a(str)) {
            c cVar = new c(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8), (byte) 0);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                i2 = (i2 + 1) & 255;
                byte[] bArr4 = cVar.a;
                byte b = bArr4[i2];
                i3 = (i3 + b) & 255;
                bArr4[i2] = bArr4[i3];
                bArr4[i3] = b;
                bArr3[i4] = (byte) (bArr4[(bArr4[i2] + b) & 255] ^ bArr3[i4]);
            }
        }
        return bArr3;
    }

    public final byte[] a(byte[] bArr) {
        byte[] digest;
        synchronized (this.c) {
            this.a.reset();
            this.a.update(bArr);
            digest = this.a.digest();
        }
        return digest;
    }

    public final L16390669445741171034 a(String str, byte[] bArr) {
        L16390669445741171034 o2 = le.o();
        byte[] a = a(bArr);
        qq a2 = sq.a(0, a, a.length);
        o2.b();
        ((le) o2.b).b(a2);
        int length = ((bArr.length - 1) / 255) + 1;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (bArr.length <= i3) {
                i3 = bArr.length;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, i3));
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            qq a3 = sq.a(0, a((byte[]) obj, str, false), 256);
            o2.b();
            ((le) o2.b).a(a3);
        }
        return o2;
    }

    public final void a() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        if (z) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            vi3 vi3Var = this.b;
            sh3 sh3Var = new sh3(yk0.EVENT_ID_FALLBACK_INIT_OBFUSCATOR, vi3Var.b, vi3Var.a);
            try {
                try {
                    try {
                        sh3Var.b();
                        this.e = secureRandom;
                        this.a = MessageDigest.getInstance("MD5");
                        this.d = true;
                    } catch (Throwable th) {
                        sh3Var.a(th);
                        throw th;
                    }
                } catch (NoSuchAlgorithmException e) {
                    sh3Var.a(e);
                }
                sh3Var.a();
            } catch (Throwable th2) {
                sh3Var.a();
                throw th2;
            }
        }
    }
}
