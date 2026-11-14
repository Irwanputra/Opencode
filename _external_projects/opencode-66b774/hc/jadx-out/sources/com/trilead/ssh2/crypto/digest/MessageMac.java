package com.trilead.ssh2.crypto.digest;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10973172697741180971;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class MessageMac extends MAC {
    private final byte[] buffer;
    private boolean encryptThenMac;
    private final Mac messageMac;
    private final int outSize;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public enum Hmac {
        HMAC_MD5_96("hmac-md5-96", "HmacMD5", 16, false),
        HMAC_MD5("hmac-md5", "HmacMD5", 16, false),
        HMAC_SHA1_96("hmac-sha1-96", "HmacSHA1", 20, false),
        HMAC_SHA1("hmac-sha1", "HmacSHA1", 20, false),
        HMAC_SHA2_256("hmac-sha2-256", "HmacSHA256", 32, false),
        HMAC_SHA2_512("hmac-sha2-512", "HmacSHA512", 64, false),
        HMAC_SHA2_256_ETM("hmac-sha2-256-etm@openssh.com", "HmacSHA256", 32, true),
        HMAC_SHA2_512_ETM("hmac-sha2-512-etm@openssh.com", "HmacSHA512", 64, true);

        private String algorithm;
        private boolean isEtm;
        private int length;
        private String type;

        Hmac(String str, String str2, int i, boolean z) {
            this.type = str;
            this.algorithm = str2;
            this.length = i;
            this.isEtm = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Hmac getHmac(String str) {
            for (Hmac hmac : values()) {
                if (hmac.getType().equals(str)) {
                    return hmac;
                }
            }
            S10973172697741180971.j(G6547577305291411977.C("Invalid HMAC type: ", str));
            return null;
        }

        public String getAlgorithm() {
            return this.algorithm;
        }

        public int getLength() {
            return this.length;
        }

        public String getType() {
            return this.type;
        }

        public boolean isEtm() {
            return this.isEtm;
        }
    }

    public MessageMac(String str, byte[] bArr) {
        super(str, bArr);
        this.encryptThenMac = false;
        try {
            Mac mac = Mac.getInstance(Hmac.getHmac(str).getAlgorithm());
            this.messageMac = mac;
            int macLength = mac.getMacLength();
            if (str.endsWith("-96")) {
                this.outSize = 12;
                this.buffer = new byte[macLength];
            } else {
                this.outSize = macLength;
                this.buffer = null;
            }
            this.encryptThenMac = Hmac.getHmac(str).isEtm();
            mac.init(new SecretKeySpec(bArr, str));
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("Could not create Mac", e);
        }
    }

    public static void checkMacs(String[] strArr) {
        for (String str : strArr) {
            Hmac.getHmac(str);
        }
    }

    public static int getKeyLength(String str) {
        return Hmac.getHmac(str).getLength();
    }

    public static String[] getMacs() {
        ArrayList arrayList = new ArrayList();
        for (Hmac hmac : Hmac.values()) {
            arrayList.add(0, hmac.getType());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void getMac(byte[] bArr, int i) {
        try {
            byte[] bArr2 = this.buffer;
            Mac mac = this.messageMac;
            if (bArr2 == null) {
                mac.doFinal(bArr, i);
            } else {
                mac.doFinal(bArr2, 0);
                System.arraycopy(this.buffer, 0, bArr, i, bArr.length - i);
            }
        } catch (ShortBufferException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void initMac(int i) {
        this.messageMac.reset();
        this.messageMac.update((byte) (i >> 24));
        this.messageMac.update((byte) (i >> 16));
        this.messageMac.update((byte) (i >> 8));
        this.messageMac.update((byte) i);
    }

    public final boolean isEncryptThenMac() {
        return this.encryptThenMac;
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final int size() {
        return this.outSize;
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void update(byte[] bArr, int i, int i2) {
        this.messageMac.update(bArr, i, i2);
    }
}
