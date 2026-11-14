package com.trilead.ssh2.crypto;

import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.dh.Curve25519Exchange;
import com.trilead.ssh2.crypto.digest.MessageMac;
import dev.epro.r0.B13201512628139951868;
import dev.epro.r0.K5292665450222291626;
import dev.epro.r0.L7126738165466160659;
import dev.epro.r0.M18133917112013001009;
import dev.epro.r0.P6459795353910001516;
import dev.epro.r0.T7214607849133703773;
import dev.epro.r0.Z17301329922361444493;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class CryptoWishList {
    public String[] c2s_comp_algos;
    public String[] c2s_enc_algos;
    public String[] c2s_mac_algos;
    public String[] kexAlgorithms;
    public String[] s2c_comp_algos;
    public String[] s2c_enc_algos;
    public String[] s2c_mac_algos;
    public String[] serverHostKeyAlgorithms;

    public CryptoWishList() {
        Z17301329922361444493 z17301329922361444493 = M18133917112013001009.f366o;
        String[] strArr = {"diffie-hellman-group-exchange-sha256", "diffie-hellman-group-exchange-sha1", "diffie-hellman-group14-sha1", "diffie-hellman-group1-sha1", "ecdh-sha2-nistp256", "ecdh-sha2-nistp384", "ecdh-sha2-nistp521", Curve25519Exchange.NAME, Curve25519Exchange.ALT_NAME};
        ArrayList arrayList = T7214607849133703773.a;
        this.kexAlgorithms = new P6459795353910001516(T7214607849133703773.class.getName(), T7214607849133703773.a).a(strArr);
        ArrayList arrayList2 = M18133917112013001009.q;
        String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        List list = B13201512628139951868.a;
        this.serverHostKeyAlgorithms = new P6459795353910001516(B13201512628139951868.class.getName(), B13201512628139951868.a).a(strArr2);
        String[] defaultCipherList = BlockCipherFactory.getDefaultCipherList();
        List list2 = L7126738165466160659.a;
        String name = L7126738165466160659.class.getName();
        List list3 = L7126738165466160659.a;
        this.c2s_enc_algos = new P6459795353910001516(name, list3).a(defaultCipherList);
        this.s2c_enc_algos = new P6459795353910001516(L7126738165466160659.class.getName(), list3).a(BlockCipherFactory.getDefaultCipherList());
        String[] macs = MessageMac.getMacs();
        ArrayList arrayList3 = K5292665450222291626.a;
        String name2 = K5292665450222291626.class.getName();
        ArrayList arrayList4 = K5292665450222291626.a;
        this.c2s_mac_algos = new P6459795353910001516(name2, arrayList4).a(macs);
        this.s2c_mac_algos = new P6459795353910001516(K5292665450222291626.class.getName(), arrayList4).a(MessageMac.getMacs());
        this.c2s_comp_algos = new String[]{"none"};
        this.s2c_comp_algos = new String[]{"none"};
    }
}
