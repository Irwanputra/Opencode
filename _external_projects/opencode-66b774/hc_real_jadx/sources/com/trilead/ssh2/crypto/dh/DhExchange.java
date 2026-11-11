package com.trilead.ssh2.crypto.dh;

import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import java.math.BigInteger;
import java.security.SecureRandom;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DhExchange {
    public BigInteger e;
    public BigInteger f;
    private final String hashAlgorithm;
    public BigInteger k;
    public BigInteger p;
    public BigInteger x;
    private static final C2773 log = new C2773(DhExchange.class);
    public static final BigInteger p1 = new BigInteger(Crypt.a(Crypt.xrc("@emJ4=A3i\u001b3>Kek\u001b4gLen\u001dgoO`jI3>\u001e3kJ19\u001bjgM7mL49\u001cj:@3=Ib:Hf<I1o\u001c0:N`;M4o\u001b6hM6jN1<\u0019koL3gNg=Ngf@e>IdiK3<Ae=\u001bfk\u001b0jMkhA4k\u001ae;\u001adnA19\u001b3mM3k\u001dcg\u001denNj:Af;\u001bk<I6k@0mNdfHglJbjK`hMgoLcmJ`>J7<\u001c7o@j=\u001d7g\u001ef;\u001afh\u00190=\u001b0jAeiN`;KbhHk>N0jIfo\u001bdnL7lA6j\u0019ef\u001c1;Ijk\u00193i\u001da:I1;Hf>Mfh\u001a7lMehMkj\u001d`f\u001b`f@6fM`=Jb;Ic;\u001e`mJ`mM6:H4oI69@7;\u001b6oLc<KdnLakK`jMkk\u001eao@6<M0n@k:K`>I7f@ejM4<\u001e0<NejL49OeiK1oN4h\u001d3:HjkHehNdm@3lM3jId:@6lIg;L39\u001e3fO7>Jco\u001d1hMfjAemK6kH4=HcfOdfI7l\u001c`n\u001ajlHfkNd;\u0019g;@0kJ1g\u001c`lJbfH3>\u001eei\u001aj=\u001d3hJ1j@k<Lfh@c>K7<@eh\u001c1jI1mK`mLai\u00194k\u001c1gKgfLfkMd>O0h\u001dfoL0lIek\u001e0l\u001e0k\u0019gmIc9\u001b4gJ7f\u001e`:M4>\u001b1l\u001bkg\u0019gfIdl\u001ekjOfj\u001d0mLk;N`l\u001ee:@blHe=M1l\u001bekLa;\u001dj<I1gM7<Ngg@7<\u001dd;Nf;L0f@coI`hI3<HjgKegKgg\u001d1o\u00194gL7oNkf@jkMcjH")));
    public static final BigInteger p14 = new BigInteger(Crypt.a(Crypt.xrc("Hg=Hd=\u001deg\u001cki\u001c49\u001adjK7iLeo\u001d`9\u001a0jObm\u001e6hOfgIfjN4k\u0019al\u001efmLagJcoNdg@d;\u001de9Lkg\u001bj=@6mLb<Oc;KejKg;\u001d6>\u001b3j@4iKg>Mb<\u001c3oN`<K4>H6iN`fJ1;Ial\u0019j=Kcm\u001a6g\u001e6kHagOkmJ`k@7i\u001c0g\u0019a9IkgKd:H3j@k;Lci\u001dgn\u001e4mH3kHb9\u001deiJkmIbhIblA6jI3=KfjKj;Of;\u001a`i\u001eekJfnO3=\u0019khNcn@emA69L19A1;K3gMji\u001ef9\u001a4;\u001aj<\u00197>\u001ac<\u001a6=MjkH6iMc<\u001ajfN4kHki\u001a0;\u001a4>A3oH1gHd<LkkJai\u001e`gMj:Mdj@b;Lb:\u001ca<Ako\u001bj:\u001begKf=N3gK39Hk9\u001agn\u001dd<@4l\u001bbjM09\u001d1<\u001ajnAjn\u001c4m\u0019`9\u001aajNc<\u001ejmOdf@aj@jj\u001c1m\u001bg;A`9\u001d1hMak\u001c3oL6l\u00190:N6k\u001b7hJanKc>\u001ae;\u001ccjOejL3=Je9Ia<Jjj\u001cgjNe9\u001bdg\u001af9\u001eemLc<M4oJ6fMc<@dnM1<MejH4lIkfLdn\u0019g:\u00193hIj>\u001ajn\u001a4<Ndi\u001cfi\u001dc=N3>N6h\u001dg:OcgJkj\u001c`h\u0019kn\u001df<Mdn\u001c7iLd:\u001cefK6i\u001adlIjf\u001cjnIeg@3hI0>O4mOc;A4iA1j@jm\u001d79H4iA4=\u00193o\u00193;\u001d`<Ij=HkgN1m\u001e0fHd;\u001e7gOag\u001ck;Kb9\u0019a>Hg:\u001dfhM1jHd9O7g\u0019bg\u00194mO6nH7hLbi\u001bjm\u001d1iM4g\u001cglLa:\u001a4:\u001d4fK6f\u001degNc9@3h\u001ef>@kjNjkO4o\u001b`=OfoIeiJj:\u001d7mKb<\u001b`<O7gJef\u0019`<\u001dd<\u001eco@7mMjf\u001eck\u001ebh\u001c`:\u001b0<OaoAb=\u001d1gHdjLajH1hH0=NahKd>I7=\u001bkiN3g@cmNemM7m\u001ab=\u001a`iIe=K7iK19\u001c1=N6l\u001b6nJb>Ne9L6;Mal@4j\u0019chNkk\u0019cgKk:\u001dghNfmHa>Od>H1g\u00191h\u001achI`mM49Oj;\u00190nOk=Jf=\u001d0<\u0019ej\u001cg;\u001eff\u001a1f\u00196o\u001aaiM7n\u001dk:J3lA0:Nf=\u001af<\u001a6g\u001a0fN1;L4kAc9KglKei\u001cd<\u001ak>Oa<I1mAj;Lao\u001aj=Hfg\u001ad=H39Lbj\u001aafAf=\u001bj9K6;\u001b7lOj>@4i\u001e7i\u001cjg\u001ekoHe=@k>\u001a1lIk;Oc:\u001b0n\u001d`o@3nOff\u001bdmMa9L1k")), 16);
    public static final BigInteger g = new BigInteger(Crypt.a(Crypt.xrc("J4;\u001b19Aj>HdfLjjLeiNalLd;\u001bdk\u001dbhJk")));

    @Deprecated
    public DhExchange() {
        this(Crypt.a(Crypt.xrc("\u001ea>Ad:N6oAf9Nbn@a<Acl\u001dbhA6h\u001c`h\u001a4")));
    }

    public DhExchange(String str) {
        this.hashAlgorithm = str;
    }

    public byte[] calculateH(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(getHashAlgorithm());
        C2773 c2773 = log;
        c2773.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("Client: '");
        String a = Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"));
        sb.append(new String(bArr, a));
        sb.append("'");
        c2773.m4754(90, sb.toString());
        c2773.m4754(90, "Server: '" + new String(bArr2, a) + "'");
        hashForSSH2Types.updateByteString(bArr);
        hashForSSH2Types.updateByteString(bArr2);
        hashForSSH2Types.updateByteString(bArr3);
        hashForSSH2Types.updateByteString(bArr4);
        hashForSSH2Types.updateByteString(bArr5);
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
        throw new IllegalStateException(Crypt.a(Crypt.xrc("I19Oj<\u001e0mM3g\u001d`jJciIbfN`>Lg9\u001dbo\u001d4=Og>Nk9\u001dej\u0019c=K4iL39\u001d3g\u001a1jKk>Oa:@")));
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

    public void init(int i, SecureRandom secureRandom) {
        BigInteger bigInteger;
        this.k = null;
        if (i == 1) {
            bigInteger = p1;
        } else {
            if (i != 14) {
                throw new IllegalArgumentException(C2098.m4208(Crypt.a(Crypt.xrc("M0mIejAfoL39L`=\u001aj=\u001a`kJgkH1k\u001a`<Lan\u0019fgM`n\u001aakHc>O3jKafO3lId9A4oLkm\u001b")), i));
            }
            bigInteger = p14;
        }
        this.p = bigInteger;
        BigInteger bigInteger2 = new BigInteger(this.p.bitLength() - 1, secureRandom);
        this.x = bigInteger2;
        this.e = g.modPow(bigInteger2, this.p);
    }

    public void setF(BigInteger bigInteger) {
        if (this.e == null) {
            throw new IllegalStateException(Crypt.a(Crypt.xrc("I19Oj<\u001e0mM3g\u001d`jJciIbfN`>Lg9\u001dbo\u001d4=Og>Nk9\u001dej\u0019c=K4iL39\u001d3g\u001a1jKk>Oa:@")));
        }
        if (BigInteger.valueOf(0L).compareTo(bigInteger) >= 0 || this.p.compareTo(bigInteger) <= 0) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("KelJc=Lcg\u0019`o\u001a0hLk>KgoKbi\u001e3hJg=@7<\u001d0fO3k\u001cgh\u001a7<NfnI09O6<Jen\u001b1g\u001ef;\u001e")));
        }
        this.f = bigInteger;
        this.k = bigInteger.modPow(this.x, this.p);
    }
}
