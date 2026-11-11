package com.trilead.ssh2.crypto.digest;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class MessageMac extends MAC {
    private final Mac messageMac;

    public enum Hmac {
        HMAC_MD5_96(Crypt.a(Crypt.xrc("M0=\u0019agNg;J3>\u001bdhOal\u001acl\u00193f\u001cgg\u001e`:Lf")), Crypt.a(Crypt.xrc("\u001e4;M4oOj;M3m\u001eaiH09N0j\u001a4>H7kJ7l\u001bf")), 16),
        HMAC_MD5(Crypt.a(Crypt.xrc("\u001ckf\u001ca=\u001b1<OfnA0f\u001adgOflJ3mA1=L0=\u001de")), Crypt.a(Crypt.xrc("\u001e4;M4oOj;M3m\u001eaiH09N0j\u001a4>H7kJ7l\u001bf")), 16),
        HMAC_SHA1_96(Crypt.a(Crypt.xrc("\u001de>N`gHgi\u001c7oMgl\u001ee>M3l\u001d7g\u001aciOgkIf")), Crypt.a(Crypt.xrc("\u001e6:\u001b7=J7;Lg=H4g\u001bcm\u001dd<M`hK0l\u001cf<Jj")), 20),
        HMAC_SHA1(Crypt.a(Crypt.xrc("L7n@gn\u001d1iLgi\u001d3>\u001ebfOc9Nd9\u001dfiLj=\u00194")), Crypt.a(Crypt.xrc("\u001e6:\u001b7=J7;Lg=H4g\u001bcm\u001dd<M`hK0l\u001cf<Jj")), 20),
        HMAC_SHA2_256(Crypt.a(Crypt.xrc("OcoO`jI1kJ19L0oL`f\u001a1jN4n\u001dff\u001ej>L0")), Crypt.a(Crypt.xrc("O`g\u001efn@3oNf>H1f\u001ea9I4<\u001d6n\u001ad:Ak>\u0019k")), 32),
        HMAC_SHA2_512(Crypt.a(Crypt.xrc("\u001e1jOa<@0mL6f\u00194<\u001d6>JelO6mJ3o\u001ejiJg")), Crypt.a(Crypt.xrc("IjkA6;O7:\u001bdnI`oOg=\u001bel@dk\u001b6;Hj<I0")), 64);

        private String algorithm;
        private int length;
        private String type;

        Hmac(String str, String str2, int i) {
            this.type = str;
            this.algorithm = str2;
            this.length = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Hmac getHmac(String str) {
            Hmac[] values = values();
            for (int i = 0; i < 6; i++) {
                Hmac hmac = values[i];
                if (hmac.getType().equals(str)) {
                    return hmac;
                }
            }
            throw new IllegalArgumentException(C2098.m4205(Crypt.a(Crypt.xrc("HelHcl\u001ca=K4o@7<\u001c7<\u001d7>\u001cgjH3=@jmAa<@6kM6:Keg\u00197hJ6h\u0019joKknJ4g\u001a4kMbkH")), str));
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
    }

    public MessageMac(String str, byte[] bArr) {
        super(str, bArr);
        try {
            Mac mac = Mac.getInstance(Hmac.getHmac(str).getAlgorithm());
            this.messageMac = mac;
            mac.init(new SecretKeySpec(bArr, str));
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("@6<\u001b0jAc>\u001a1o\u001bjmKgi\u001e7hNgkJfiL6l\u001a0jM0oLbmNekOgiK6mO`n\u001ejkNkn\u001dclKen\u001c")), e);
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
        Hmac[] values = Hmac.values();
        for (int i = 0; i < 6; i++) {
            arrayList.add(0, values[i].getType());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void getMac(byte[] bArr, int i) {
        byte[] doFinal = this.messageMac.doFinal();
        System.arraycopy(doFinal, i, bArr, 0, doFinal.length - i);
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void initMac(int i) {
        this.messageMac.reset();
        this.messageMac.update((byte) (i >> 24));
        this.messageMac.update((byte) (i >> 16));
        this.messageMac.update((byte) (i >> 8));
        this.messageMac.update((byte) i);
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final int size() {
        return this.messageMac.getMacLength();
    }

    @Override // com.trilead.ssh2.crypto.digest.MAC
    public final void update(byte[] bArr, int i, int i2) {
        this.messageMac.update(bArr, i, i2);
    }
}
