package dev.epro.r0;

import com.trilead.ssh2.crypto.CryptoWishList;
import com.trilead.ssh2.crypto.KeyMaterial;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.cipher.NullCipher;
import com.trilead.ssh2.crypto.digest.MessageMac;
import com.trilead.ssh2.signature.KeyAlgorithm;
import com.trilead.ssh2.signature.KeyAlgorithmManager;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M18133917112013001009 implements Z1784283759719197609 {

    /* renamed from: o, reason: collision with root package name */
    public static final Z17301329922361444493 f366o = Z17301329922361444493.a(M18133917112013001009.class);
    public static final long p = Long.parseLong(System.getProperty(M18133917112013001009.class.getName().concat(".timeout"), "1200000"));
    public static final ArrayList q;
    public M1558259021302697145 a;
    public KeyMaterial c;
    public byte[] d;
    public final D14731132657808549702 e;
    public final T1177712003054613961 j;
    public CryptoWishList k;
    public final M11115334227134251595 m;
    public final SecureRandom n;
    public int b = 0;
    public final Object f = new Object();
    public P10351157897044641494 g = null;
    public boolean h = false;
    public boolean i = false;
    public A4620944990041811311 l = new A4620944990041811311();

    static {
        ArrayList arrayList = new ArrayList();
        Iterator<KeyAlgorithm<PublicKey, PrivateKey>> it = KeyAlgorithmManager.getSupportedAlgorithms().iterator();
        while (it.hasNext()) {
            arrayList.add(arrayList.size(), it.next().getKeyFormat());
        }
        q = arrayList;
    }

    public M18133917112013001009(T1177712003054613961 t1177712003054613961, D14731132657808549702 d14731132657808549702, CryptoWishList cryptoWishList, String str, int i, M11115334227134251595 m11115334227134251595, SecureRandom secureRandom) {
        this.j = t1177712003054613961;
        this.e = d14731132657808549702;
        this.k = cryptoWishList;
        this.m = m11115334227134251595;
        this.n = secureRandom;
    }

    public static boolean c(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null) {
            K2042933864045806308.h();
            return false;
        }
        if (strArr.length == 0 && strArr2.length == 0) {
            return true;
        }
        if (strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        return strArr[0].equals(strArr2[0]);
    }

    public static String e(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null) {
            K2042933864045806308.h();
            return null;
        }
        if (strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (str.equals(str2)) {
                    return str;
                }
            }
        }
        Arrays.sort(strArr);
        String arrays = Arrays.toString(strArr);
        Arrays.sort(strArr2);
        throw new Q16868801474083693584(G6547577305291411977.t("No matching algorithm found. Client: ", arrays, ", Server: ", Arrays.toString(strArr2)));
    }

    public static W5207703045157847348 f(U16120766223385152288 u16120766223385152288, U16120766223385152288 u161207662233851522882) {
        W5207703045157847348 w5207703045157847348 = new W5207703045157847348();
        w5207703045157847348.b = e(u16120766223385152288.b, u161207662233851522882.b);
        f366o.getClass();
        w5207703045157847348.c = e(u16120766223385152288.c, u161207662233851522882.c);
        w5207703045157847348.d = e(u16120766223385152288.d, u161207662233851522882.d);
        w5207703045157847348.e = e(u16120766223385152288.e, u161207662233851522882.e);
        w5207703045157847348.f = e(u16120766223385152288.f, u161207662233851522882.f);
        w5207703045157847348.g = e(u16120766223385152288.g, u161207662233851522882.g);
        w5207703045157847348.h = e(u16120766223385152288.h, u161207662233851522882.h);
        w5207703045157847348.i = e(u16120766223385152288.i, u161207662233851522882.i);
        try {
            e(u16120766223385152288.j, u161207662233851522882.j);
        } catch (Q16868801474083693584 unused) {
        }
        try {
            e(u16120766223385152288.k, u161207662233851522882.k);
        } catch (Q16868801474083693584 unused2) {
        }
        if (c(u16120766223385152288.b, u161207662233851522882.b) && c(u16120766223385152288.c, u161207662233851522882.c)) {
            w5207703045157847348.a = true;
        }
        return w5207703045157847348;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        r0 = new dev.epro.r0.M1558259021302697145();
        r11.a = r0;
        r0.j = r11.l;
        r0 = new dev.epro.r0.V10300877997588547986(r11.k, r11.n);
        r11.a.a = r0;
        r11.j.l(r0.o());
     */
    @Override // dev.epro.r0.Z1784283759719197609
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M18133917112013001009.a(int, byte[]):void");
    }

    @Override // dev.epro.r0.Z1784283759719197609
    public final void b(IOException iOException) {
        synchronized (this.f) {
            this.h = true;
            this.f.notifyAll();
        }
    }

    public final void d() {
        if (this.d == null) {
            this.d = this.a.f;
        }
        try {
            int keyLength = MessageMac.getKeyLength(this.a.c.f);
            int keySize = BlockCipherFactory.getKeySize(this.a.c.d);
            int blockSize = BlockCipherFactory.getBlockSize(this.a.c.d);
            int keyLength2 = MessageMac.getKeyLength(this.a.c.g);
            int keySize2 = BlockCipherFactory.getKeySize(this.a.c.e);
            int blockSize2 = BlockCipherFactory.getBlockSize(this.a.c.e);
            M1558259021302697145 m1558259021302697145 = this.a;
            this.c = KeyMaterial.create(m1558259021302697145.k, m1558259021302697145.f, m1558259021302697145.e, this.d, keySize, blockSize, keyLength, keySize2, blockSize2, keyLength2);
        } catch (IllegalArgumentException unused) {
        }
        T1177712003054613961 t1177712003054613961 = this.j;
        byte[] bArr = new byte[256];
        bArr[0] = 21;
        byte[] bArr2 = new byte[1];
        System.arraycopy(bArr, 0, bArr2, 0, 1);
        t1177712003054613961.l(bArr2);
        try {
            String str = this.a.c.d;
            KeyMaterial keyMaterial = this.c;
            BlockCipher createCipher = BlockCipherFactory.createCipher(str, true, keyMaterial.enc_key_client_to_server, keyMaterial.initial_iv_client_to_server);
            MessageMac messageMac = new MessageMac(this.a.c.f, this.c.integrity_key_client_to_server);
            T1177712003054613961 t11777120030546139612 = this.j;
            String str2 = this.a.c.h;
            O3808217931002834139 o3808217931002834139 = t11777120030546139612.h;
            if (!(createCipher instanceof NullCipher)) {
                o3808217931002834139.e = true;
            }
            o3808217931002834139.d.changeCipher(createCipher);
            o3808217931002834139.f = messageMac;
            o3808217931002834139.g = new byte[messageMac.size()];
            int blockSize3 = createCipher.getBlockSize();
            o3808217931002834139.h = blockSize3;
            if (blockSize3 < 8) {
                o3808217931002834139.h = 8;
            }
            J15730374346044043770 j15730374346044043770 = o3808217931002834139.l;
            if (j15730374346044043770 != null) {
                Deflater deflater = (Deflater) j15730374346044043770.c;
                if (deflater != null) {
                    deflater.end();
                }
                Inflater inflater = (Inflater) j15730374346044043770.d;
                if (inflater != null) {
                    inflater.end();
                }
            }
            o3808217931002834139.l = null;
            o3808217931002834139.n = false;
            if ("zlib".equals(str2) || "zlib@openssh.com".equals(str2)) {
                if (!"zlib@openssh.com".equals(str2) || o3808217931002834139.p) {
                    o3808217931002834139.l = new J15730374346044043770(true);
                } else {
                    o3808217931002834139.n = true;
                }
            }
            T1177712003054613961 t11777120030546139613 = this.j;
            synchronized (t11777120030546139613.e) {
                t11777120030546139613.f = false;
                t11777120030546139613.e.notifyAll();
            }
        } catch (IllegalArgumentException e) {
            Z3383101362411723454.q("Fatal error during MAC startup!", e);
        }
    }

    public final boolean g(byte[] bArr, byte[] bArr2) {
        for (KeyAlgorithm<PublicKey, PrivateKey> keyAlgorithm : KeyAlgorithmManager.getSupportedAlgorithms()) {
            if (keyAlgorithm.getKeyFormat().equals(this.a.c.c)) {
                PublicKey decodePublicKey = keyAlgorithm.decodePublicKey(bArr2);
                return keyAlgorithm.verifySignature(this.a.f, keyAlgorithm.decodeSignature(bArr), decodePublicKey);
            }
        }
        Q11088980322693754445.h(G6547577305291411977.s("Unknown server host key algorithm '", this.a.c.c, "'"));
        return false;
    }
}
