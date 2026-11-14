package com.trilead.ssh2.crypto;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class CryptoWishList {
    public java.lang.String[] c2s_comp_algos;
    public java.lang.String[] c2s_enc_algos;
    public java.lang.String[] c2s_mac_algos;
    public java.lang.String[] kexAlgorithms;
    public java.lang.String[] s2c_comp_algos;
    public java.lang.String[] s2c_enc_algos;
    public java.lang.String[] s2c_mac_algos;
    public java.lang.String[] serverHostKeyAlgorithms;

    public CryptoWishList() {
        dev.epro.r0.Z17301329922361444493 z17301329922361444493 = dev.epro.r0.M18133917112013001009.o;
        java.lang.String[] strArr = {"diffie-hellman-group-exchange-sha256", "diffie-hellman-group-exchange-sha1", "diffie-hellman-group14-sha1", "diffie-hellman-group1-sha1", "ecdh-sha2-nistp256", "ecdh-sha2-nistp384", "ecdh-sha2-nistp521", com.trilead.ssh2.crypto.dh.Curve25519Exchange.NAME, com.trilead.ssh2.crypto.dh.Curve25519Exchange.ALT_NAME};
        java.util.ArrayList arrayList = dev.epro.r0.T7214607849133703773.a;
        this.kexAlgorithms = new dev.epro.r0.P6459795353910001516(dev.epro.r0.T7214607849133703773.class.getName(), dev.epro.r0.T7214607849133703773.a).a(strArr);
        java.util.ArrayList arrayList2 = dev.epro.r0.M18133917112013001009.q;
        java.lang.String[] strArr2 = (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]);
        java.util.List list = dev.epro.r0.B13201512628139951868.a;
        this.serverHostKeyAlgorithms = new dev.epro.r0.P6459795353910001516(dev.epro.r0.B13201512628139951868.class.getName(), dev.epro.r0.B13201512628139951868.a).a(strArr2);
        java.lang.String[] defaultCipherList = com.trilead.ssh2.crypto.cipher.BlockCipherFactory.getDefaultCipherList();
        java.util.List list2 = dev.epro.r0.L7126738165466160659.a;
        java.lang.String name = dev.epro.r0.L7126738165466160659.class.getName();
        java.util.List list3 = dev.epro.r0.L7126738165466160659.a;
        this.c2s_enc_algos = new dev.epro.r0.P6459795353910001516(name, list3).a(defaultCipherList);
        this.s2c_enc_algos = new dev.epro.r0.P6459795353910001516(dev.epro.r0.L7126738165466160659.class.getName(), list3).a(com.trilead.ssh2.crypto.cipher.BlockCipherFactory.getDefaultCipherList());
        java.lang.String[] macs = com.trilead.ssh2.crypto.digest.MessageMac.getMacs();
        java.util.ArrayList arrayList3 = dev.epro.r0.K5292665450222291626.a;
        java.lang.String name2 = dev.epro.r0.K5292665450222291626.class.getName();
        java.util.ArrayList arrayList4 = dev.epro.r0.K5292665450222291626.a;
        this.c2s_mac_algos = new dev.epro.r0.P6459795353910001516(name2, arrayList4).a(macs);
        this.s2c_mac_algos = new dev.epro.r0.P6459795353910001516(dev.epro.r0.K5292665450222291626.class.getName(), arrayList4).a(com.trilead.ssh2.crypto.digest.MessageMac.getMacs());
        this.c2s_comp_algos = new java.lang.String[]{"none"};
        this.s2c_comp_algos = new java.lang.String[]{"none"};
    }
}
