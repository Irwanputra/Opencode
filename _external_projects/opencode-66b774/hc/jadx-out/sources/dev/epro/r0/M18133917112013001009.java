package dev.epro.r0;

import com.trilead.ssh2.crypto.CryptoWishList;
import com.trilead.ssh2.crypto.KeyMaterial;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.cipher.NullCipher;
import com.trilead.ssh2.crypto.dh.Curve25519Exchange;
import com.trilead.ssh2.crypto.dh.DhGroupExchange;
import com.trilead.ssh2.crypto.dh.GenericDhExchange;
import com.trilead.ssh2.crypto.digest.MessageMac;
import com.trilead.ssh2.signature.KeyAlgorithm;
import com.trilead.ssh2.signature.KeyAlgorithmManager;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M18133917112013001009 implements Z1784283759719197609 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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

    public static String e(String[] strArr, String[] strArr2) throws Q16868801474083693584 {
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
        String string = Arrays.toString(strArr);
        Arrays.sort(strArr2);
        throw new Q16868801474083693584(G6547577305291411977.t("No matching algorithm found. Client: ", string, ", Server: ", Arrays.toString(strArr2)));
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

    @Override // dev.epro.r0.Z1784283759719197609
    public final synchronized void a(int i, byte[] bArr) {
        M1558259021302697145 m1558259021302697145;
        byte[] bytes;
        byte[] bytes2;
        byte[] bytes3;
        byte[] bytes4;
        byte b;
        try {
            m1558259021302697145 = this.a;
            if (m1558259021302697145 == null && (b = bArr[0]) != 20) {
                throw new IOException("Unexpected KEX message (type " + ((int) b) + ")");
            }
        } catch (Throwable th) {
            throw th;
        }
        if (this.i) {
            this.i = false;
            return;
        }
        byte b2 = bArr[0];
        if (b2 == 20) {
            if (m1558259021302697145 != null && m1558259021302697145.d != 0) {
                throw new IOException("Unexpected SSH_MSG_KEXINIT message during on-going kex exchange!");
            }
            if (m1558259021302697145 == null) {
                M1558259021302697145 m15582590213026971452 = new M1558259021302697145();
                this.a = m15582590213026971452;
                m15582590213026971452.j = this.l;
                V10300877997588547986 v10300877997588547986 = new V10300877997588547986(this.k, this.n);
                this.a.a = v10300877997588547986;
                this.j.l(v10300877997588547986.o());
            }
            V10300877997588547986 v103008779975885479862 = new V10300877997588547986(bArr, i);
            M1558259021302697145 m15582590213026971453 = this.a;
            m15582590213026971453.b = v103008779975885479862;
            try {
                m15582590213026971453.c = f((U16120766223385152288) m15582590213026971453.a.c, (U16120766223385152288) v103008779975885479862.c);
                if (this.a.b.s() && !this.a.c.a) {
                    this.i = true;
                }
                if (!this.a.c.b.equals("diffie-hellman-group-exchange-sha1") && !this.a.c.b.equals("diffie-hellman-group-exchange-sha256")) {
                    if (!this.a.c.b.equals("diffie-hellman-group1-sha1") && !this.a.c.b.equals(Curve25519Exchange.NAME) && !this.a.c.b.equals(Curve25519Exchange.ALT_NAME) && !this.a.c.b.equals("diffie-hellman-group14-sha1") && !this.a.c.b.equals("ecdh-sha2-nistp521") && !this.a.c.b.equals("ecdh-sha2-nistp384") && !this.a.c.b.equals("ecdh-sha2-nistp256")) {
                        throw new IllegalStateException("Unkown KEX method!");
                    }
                    M1558259021302697145 m15582590213026971454 = this.a;
                    m15582590213026971454.h = GenericDhExchange.getInstance(m15582590213026971454.c.b);
                    M1558259021302697145 m15582590213026971455 = this.a;
                    m15582590213026971455.h.init(m15582590213026971455.c.b);
                    M1558259021302697145 m15582590213026971456 = this.a;
                    m15582590213026971456.k = m15582590213026971456.h.getHashAlgo();
                    byte[] e = this.a.h.getE();
                    T1177712003054613961 t1177712003054613961 = this.j;
                    T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
                    t17032536773975598836.o(30);
                    t17032536773975598836.s(0, e, e.length);
                    t1177712003054613961.l(t17032536773975598836.f());
                    this.a.d = 1;
                    return;
                }
                this.a.j.getClass();
                this.a.j.getClass();
                T1177712003054613961 t11777120030546139612 = this.j;
                T17032536773975598836 t170325367739755988362 = new T17032536773975598836();
                t170325367739755988362.o(34);
                t170325367739755988362.u(1024);
                t170325367739755988362.u(2048);
                t170325367739755988362.u(4096);
                t11777120030546139612.l(t170325367739755988362.f());
                M1558259021302697145 m15582590213026971457 = this.a;
                m15582590213026971457.d = 1;
                boolean zEndsWith = m15582590213026971457.c.b.endsWith("sha1");
                M1558259021302697145 m15582590213026971458 = this.a;
                if (zEndsWith) {
                    m15582590213026971458.k = "SHA1";
                } else {
                    m15582590213026971458.k = "SHA-256";
                }
                return;
            } catch (Q16868801474083693584 e2) {
                throw new IOException("Cannot negotiate algorithms, proposals do not match.", e2);
            }
        }
        if (b2 == 21) {
            KeyMaterial keyMaterial = this.c;
            if (keyMaterial == null) {
                throw new IOException("Peer sent SSH_MSG_NEWKEYS, but I have no key material ready!");
            }
            try {
                this.j.a(BlockCipherFactory.createCipher(m1558259021302697145.c.e, false, keyMaterial.enc_key_server_to_client, keyMaterial.initial_iv_server_to_client), new MessageMac(this.a.c.g, this.c.integrity_key_server_to_client), this.a.c.i);
                P10351157897044641494 p10351157897044641494 = new P10351157897044641494();
                int i2 = this.b + 1;
                this.b = i2;
                W5207703045157847348 w5207703045157847348 = this.a.c;
                p10351157897044641494.a = w5207703045157847348.b;
                p10351157897044641494.d = i2;
                p10351157897044641494.b = w5207703045157847348.d;
                p10351157897044641494.c = w5207703045157847348.f;
                synchronized (this.f) {
                    this.g = p10351157897044641494;
                    this.f.notifyAll();
                }
                this.a = null;
                return;
            } catch (IllegalArgumentException unused) {
                throw new IOException("Fatal error during MAC startup!");
            }
        }
        if (m1558259021302697145 == null || m1558259021302697145.d == 0) {
            throw new IOException("Unexpected Kex submessage!");
        }
        if (!m1558259021302697145.c.b.equals("diffie-hellman-group-exchange-sha1") && !this.a.c.b.equals("diffie-hellman-group-exchange-sha256")) {
            if ((!this.a.c.b.equals("diffie-hellman-group1-sha1") && !this.a.c.b.equals("diffie-hellman-group14-sha1") && !this.a.c.b.equals("ecdh-sha2-nistp256") && !this.a.c.b.equals("ecdh-sha2-nistp384") && !this.a.c.b.equals("ecdh-sha2-nistp521") && !this.a.c.b.equals(Curve25519Exchange.NAME) && !this.a.c.b.equals(Curve25519Exchange.ALT_NAME)) || this.a.d != 1) {
                throw new IllegalStateException("Unkown KEX method! (" + this.a.c.b + ")");
            }
            System.arraycopy(bArr, 0, new byte[i], 0, i);
            C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr, i);
            int iB = c9142879380583651391.b();
            if (iB != 31) {
                throw new IOException("This is not a SSH_MSG_KEXDH_REPLY! (" + iB + ")");
            }
            byte[] bArrC = c9142879380583651391.c();
            byte[] bArrC2 = c9142879380583651391.c();
            byte[] bArrC3 = c9142879380583651391.c();
            if (c9142879380583651391.j() != 0) {
                throw new IOException("PADDING IN SSH_MSG_KEXDH_REPLY!");
            }
            M1558259021302697145 m15582590213026971459 = this.a;
            m15582590213026971459.g = bArrC;
            try {
                this.m.b(m15582590213026971459.c.c, bArrC);
                this.a.h.setF(bArrC2);
                try {
                    M1558259021302697145 m155825902130269714510 = this.a;
                    GenericDhExchange genericDhExchange = m155825902130269714510.h;
                    try {
                        bytes3 = "SSH-2.0-TrileadSSH2Java_213".getBytes("ISO-8859-1");
                    } catch (UnsupportedEncodingException unused2) {
                        bytes3 = "SSH-2.0-TrileadSSH2Java_213".getBytes();
                    }
                    byte[] bArr2 = bytes3;
                    String str = this.e.b;
                    try {
                        bytes4 = str.getBytes("ISO-8859-1");
                    } catch (UnsupportedEncodingException unused3) {
                        bytes4 = str.getBytes();
                    }
                    m155825902130269714510.f = genericDhExchange.calculateH(bArr2, bytes4, this.a.a.o(), this.a.b.o(), bArrC);
                    if (!g(bArrC3, this.a.g)) {
                        throw new IOException("Hostkey signature sent by remote is wrong!");
                    }
                    M1558259021302697145 m155825902130269714511 = this.a;
                    m155825902130269714511.e = m155825902130269714511.h.getK();
                    d();
                    this.a.d = -1;
                    return;
                } catch (IllegalArgumentException e3) {
                    throw new IOException("KEX error.", e3);
                }
            } catch (Exception e4) {
                throw new IOException("The server hostkey was not accepted by the verifier callback.", e4);
            }
        }
        int i3 = this.a.d;
        if (i3 == 1) {
            System.arraycopy(bArr, 0, new byte[i], 0, i);
            C9142879380583651391 c91428793805836513912 = new C9142879380583651391(bArr, i);
            int iB2 = c91428793805836513912.b();
            if (iB2 != 31) {
                throw new IllegalArgumentException("This is not a SSH_MSG_KEX_DH_GEX_GROUP! (" + iB2 + ")");
            }
            BigInteger bigIntegerE = c91428793805836513912.e();
            BigInteger bigIntegerE2 = c91428793805836513912.e();
            if (c91428793805836513912.j() != 0) {
                throw new IOException("PADDING IN SSH_MSG_KEX_DH_GEX_GROUP!");
            }
            this.a.i = new DhGroupExchange(bigIntegerE, bigIntegerE2);
            this.a.i.init(this.n);
            BigInteger e5 = this.a.i.getE();
            T1177712003054613961 t11777120030546139613 = this.j;
            T17032536773975598836 t170325367739755988363 = new T17032536773975598836();
            t170325367739755988363.o(32);
            t170325367739755988363.q(e5);
            t11777120030546139613.l(t170325367739755988363.f());
            this.a.d = 2;
            return;
        }
        if (i3 != 2) {
            throw new IllegalStateException("Illegal State in KEX Exchange!");
        }
        System.arraycopy(bArr, 0, new byte[i], 0, i);
        C9142879380583651391 c91428793805836513913 = new C9142879380583651391(bArr, i);
        int iB3 = c91428793805836513913.b();
        if (iB3 != 33) {
            throw new IOException("This is not a SSH_MSG_KEX_DH_GEX_REPLY! (" + iB3 + ")");
        }
        byte[] bArrC4 = c91428793805836513913.c();
        BigInteger bigIntegerE3 = c91428793805836513913.e();
        byte[] bArrC5 = c91428793805836513913.c();
        if (c91428793805836513913.j() != 0) {
            throw new IOException("PADDING IN SSH_MSG_KEX_DH_GEX_REPLY!");
        }
        M1558259021302697145 m155825902130269714512 = this.a;
        m155825902130269714512.g = bArrC4;
        try {
            this.m.b(m155825902130269714512.c.c, bArrC4);
            this.a.i.setF(bigIntegerE3);
            try {
                M1558259021302697145 m155825902130269714513 = this.a;
                DhGroupExchange dhGroupExchange = m155825902130269714513.i;
                String str2 = m155825902130269714513.k;
                try {
                    bytes = "SSH-2.0-TrileadSSH2Java_213".getBytes("ISO-8859-1");
                } catch (UnsupportedEncodingException unused4) {
                    bytes = "SSH-2.0-TrileadSSH2Java_213".getBytes();
                }
                byte[] bArr3 = bytes;
                String str3 = this.e.b;
                try {
                    bytes2 = str3.getBytes("ISO-8859-1");
                } catch (UnsupportedEncodingException unused5) {
                    bytes2 = str3.getBytes();
                }
                m155825902130269714513.f = dhGroupExchange.calculateH(str2, bArr3, bytes2, this.a.a.o(), this.a.b.o(), bArrC4, this.a.j);
                if (!g(bArrC5, this.a.g)) {
                    throw new IOException("Hostkey signature sent by remote is wrong!");
                }
                M1558259021302697145 m155825902130269714514 = this.a;
                m155825902130269714514.e = m155825902130269714514.i.getK();
                d();
                this.a.d = -1;
                return;
            } catch (IllegalArgumentException e6) {
                throw new IOException("KEX error.", e6);
            }
        } catch (Exception e7) {
            throw new IOException("The server hostkey was not accepted by the verifier callback.", e7);
        }
        throw th;
    }

    @Override // dev.epro.r0.Z1784283759719197609
    public final void b(IOException iOException) {
        synchronized (this.f) {
            this.h = true;
            this.f.notifyAll();
        }
    }

    public final void d() throws IOException {
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
            BlockCipher blockCipherCreateCipher = BlockCipherFactory.createCipher(str, true, keyMaterial.enc_key_client_to_server, keyMaterial.initial_iv_client_to_server);
            MessageMac messageMac = new MessageMac(this.a.c.f, this.c.integrity_key_client_to_server);
            T1177712003054613961 t11777120030546139612 = this.j;
            String str2 = this.a.c.h;
            O3808217931002834139 o3808217931002834139 = t11777120030546139612.h;
            if (!(blockCipherCreateCipher instanceof NullCipher)) {
                o3808217931002834139.e = true;
            }
            o3808217931002834139.d.changeCipher(blockCipherCreateCipher);
            o3808217931002834139.f = messageMac;
            o3808217931002834139.g = new byte[messageMac.size()];
            int blockSize3 = blockCipherCreateCipher.getBlockSize();
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

    public final boolean g(byte[] bArr, byte[] bArr2) throws IOException {
        for (KeyAlgorithm<PublicKey, PrivateKey> keyAlgorithm : KeyAlgorithmManager.getSupportedAlgorithms()) {
            if (keyAlgorithm.getKeyFormat().equals(this.a.c.c)) {
                PublicKey publicKeyDecodePublicKey = keyAlgorithm.decodePublicKey(bArr2);
                return keyAlgorithm.verifySignature(this.a.f, keyAlgorithm.decodeSignature(bArr), publicKeyDecodePublicKey);
            }
        }
        Q11088980322693754445.h(G6547577305291411977.s("Unknown server host key algorithm '", this.a.c.c, "'"));
        return false;
    }
}
