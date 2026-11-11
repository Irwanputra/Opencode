package com.trilead.ssh2.crypto.dh;

import androidx.core.app.NotificationCompat;
import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import java.math.BigInteger;
import java.security.SecureRandom;
import p131.p225.p226.C2772;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DhGroupExchange {
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private final String hashAlgorithm;
    private BigInteger k;
    private BigInteger p;
    private BigInteger x;

    public DhGroupExchange(String str, BigInteger bigInteger, BigInteger bigInteger2) {
        this.p = bigInteger;
        this.g = bigInteger2;
        this.hashAlgorithm = str;
    }

    @Deprecated
    public DhGroupExchange(BigInteger bigInteger, BigInteger bigInteger2) {
        this(Crypt.a(Crypt.xrc("\u001ea>Ad:N6oAf9Nbn@a<Acl\u001dbhA6h\u001c`h\u001a4")), bigInteger, bigInteger2);
    }

    public byte[] calculateH(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, C2772 c2772) {
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(getHashAlgorithm());
        hashForSSH2Types.updateByteString(bArr);
        hashForSSH2Types.updateByteString(bArr2);
        hashForSSH2Types.updateByteString(bArr3);
        hashForSSH2Types.updateByteString(bArr4);
        hashForSSH2Types.updateByteString(bArr5);
        c2772.getClass();
        hashForSSH2Types.updateUINT32(1024);
        hashForSSH2Types.updateUINT32(2048);
        hashForSSH2Types.updateUINT32(NotificationCompat.FLAG_BUBBLE);
        hashForSSH2Types.updateBigInt(this.p);
        hashForSSH2Types.updateBigInt(this.g);
        hashForSSH2Types.updateBigInt(this.e);
        hashForSSH2Types.updateBigInt(this.f);
        hashForSSH2Types.updateBigInt(this.k);
        return hashForSSH2Types.getDigest();
    }

    public BigInteger getE() {
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            return bigInteger;
        }
        throw new IllegalStateException(Crypt.a(Crypt.xrc("\u00190;LfkK4=\u001e3k\u001ea=N`=Lf9L4iKgiL7hOclNfg\u001djj\u0019d=\u001d1lH6>\u001e4;\u001cjn@ciH1=I7m\u001c")));
    }

    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public BigInteger getK() {
        BigInteger bigInteger = this.k;
        if (bigInteger != null) {
            return bigInteger;
        }
        throw new IllegalStateException(Crypt.a(Crypt.xrc("Mdh\u001a0:I1;N0f\u001efnKb9A3;\u001bknJkiKcjJem\u001e39O3jHa:Lel@kn\u001a7hH0oA6kLem\u0019c9M6>\u0019klJ7gOcoJejKgoNe=J6kI39OdkN6=")));
    }

    public void init(SecureRandom secureRandom) {
        this.k = null;
        BigInteger bigInteger = new BigInteger(this.p.bitLength() - 1, secureRandom);
        this.x = bigInteger;
        this.e = this.g.modPow(bigInteger, this.p);
    }

    public void setF(BigInteger bigInteger) {
        if (this.e == null) {
            throw new IllegalStateException(Crypt.a(Crypt.xrc("\u00190;LfkK4=\u001e3k\u001ea=N`=Lf9L4iKgiL7hOclNfg\u001djj\u0019d=\u001d1lH6>\u001e4;\u001cjn@ciH1=I7m\u001c")));
        }
        if (BigInteger.valueOf(0L).compareTo(bigInteger) >= 0 || this.p.compareTo(bigInteger) <= 0) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("KelJc=Lcg\u0019`o\u001a0hLk>KgoKbi\u001e3hJg=@7<\u001d0fO3k\u001cgh\u001a7<NfnI09O6<Jen\u001b1g\u001ef;\u001e")));
        }
        this.f = bigInteger;
        this.k = bigInteger.modPow(this.x, this.p);
    }
}
