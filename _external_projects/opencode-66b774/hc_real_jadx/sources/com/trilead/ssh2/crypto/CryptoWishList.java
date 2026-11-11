package com.trilead.ssh2.crypto;

import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.digest.MessageMac;
import java.util.List;
import p131.p225.p226.p228.C2729;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CryptoWishList {
    public String[] c2s_enc_algos;
    public String[] c2s_mac_algos;
    public String[] kexAlgorithms;
    public String[] s2c_enc_algos;
    public String[] s2c_mac_algos;
    public String[] serverHostKeyAlgorithms;

    public CryptoWishList() {
        C2773 c2773 = C2729.f10234;
        this.kexAlgorithms = new String[]{Crypt.a(Crypt.xrc("Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4k\u001b69I6:Hf>\u0019kf\u001a7nJa;\u001a0g\u001a`<I0>\u001b6:ManL6n\u001dblJemL`>\u001eb>O7:I`>\u001bao@joN6g")), Crypt.a(Crypt.xrc("Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4k\u001b69I6:Hf>\u0019kf\u001a7nJa;\u001a0g\u001a`<I0>\u001b6:M`k\u001c1j\u001bkm\u001ekfI4>N`iJdh\u001c1nL1h@kjJ7<")), Crypt.a(Crypt.xrc("Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4o\u00193jKj;\u001eekAgiAb;K1o@jnA0jJf<@d:O")), Crypt.a(Crypt.xrc("Jbi\u0019f<@`;Idj\u0019b9JkiO0nNe;Kbj\u001c4gO4>Ic;\u001a4hLfnK1n@6i\u001d6k\u001be;\u0019ghHdjOjg\u001b"))};
        List<String> list = C2729.f10235;
        this.serverHostKeyAlgorithms = (String[]) list.toArray(new String[list.size()]);
        this.c2s_enc_algos = BlockCipherFactory.getDefaultCipherList();
        this.s2c_enc_algos = BlockCipherFactory.getDefaultCipherList();
        this.c2s_mac_algos = MessageMac.getMacs();
        this.s2c_mac_algos = MessageMac.getMacs();
    }
}
