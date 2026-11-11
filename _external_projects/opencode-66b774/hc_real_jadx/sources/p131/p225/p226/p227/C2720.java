package p131.p225.p226.p227;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.util.Arrays;
import java.util.List;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.C2697;
import p131.p225.p226.p229.C2742;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2720 extends AbstractC2723<DSAPublicKey, DSAPrivateKey> {

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public static class C2721 extends CertificateDecoder {
        public C2721(C2722 c2722) {
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public KeyPair createKeyPair(PEMStructure pEMStructure) {
            SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
            byte[] readSequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            int available = simpleDERReader.available();
            String a = Crypt.a(Crypt.xrc("Ij<L`n\u001d6hN3hKa:Mb=Aal\u001cdo@jgN`o\u001e4j@bnO6>A0l\u001dd>K0fIg9Jdo\u001bcgJd;\u001akiNemMbk\u001bb>Afk\u00194hM0mHb<L4g\u001c6j\u00196j\u001a4;"));
            if (available != 0) {
                throw new IOException(a);
            }
            simpleDERReader.resetInput(readSequenceAsByteArray);
            BigInteger readInt = simpleDERReader.readInt();
            if (readInt.compareTo(BigInteger.ZERO) != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("\u0019dl\u001e1>M`<\u001c7jKb>J1=M7kIcmM6n\u001del\u001cc")) + readInt + Crypt.a(Crypt.xrc("\u001b4<Kc=N0:M1oI7;J`g@ejNfk\u001dghM1<\u00194:\u001c0>K`;Hg<O1l\u001ee;Lc9Kk=MjfMcn\u001c6>I0m\u001c`:\u001e4>\u001bf9\u001a1:IkmA1kL6>L19Ac;Adk")));
            }
            BigInteger readInt2 = simpleDERReader.readInt();
            BigInteger readInt3 = simpleDERReader.readInt();
            BigInteger readInt4 = simpleDERReader.readInt();
            BigInteger readInt5 = simpleDERReader.readInt();
            BigInteger readInt6 = simpleDERReader.readInt();
            if (simpleDERReader.available() != 0) {
                throw new IOException(a);
            }
            try {
                DSAPrivateKeySpec dSAPrivateKeySpec = new DSAPrivateKeySpec(readInt6, readInt2, readInt3, readInt4);
                DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(readInt5, readInt2, readInt3, readInt4);
                KeyFactory keyFactory = KeyFactory.getInstance(Crypt.a(Crypt.xrc("Jb;Oa:\u001dd=Mfn\u001a69\u001e4kKd>LcjJjlN6j\u001dj")));
                return new KeyPair(keyFactory.generatePublic(dSAPublicKeySpec), keyFactory.generatePrivate(dSAPrivateKeySpec));
            } catch (GeneralSecurityException unused) {
                throw new IOException(Crypt.a(Crypt.xrc("Lbo\u0019fmJ6o\u001abk\u001dd>O4m@7jMbkHjm\u001e3:@ch\u001bf<Lbm\u0019gf@dgO3iO7fIjk\u00193n\u001cc9\u001akf\u001d")));
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getEndLine() {
            return Crypt.a(Crypt.xrc("Ob:\u001ed:\u00194<M6kMboLc>H`jIb:Lg=\u001dj9\u001c3hOdgN6=Nd=\u0019d9\u001ccmMkiH`;\u0019a;\u001da:Meo\u001b"));
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getStartLine() {
            return Crypt.a(Crypt.xrc("\u00196oI`f\u001baj\u001cbiId=\u001b`f\u001c`oHkhHcmO0<H6i\u001cgn\u001b`g\u001ce9Hbo\u001ab:KamAdgMa=\u001aci\u001dg=H"));
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2722 extends AbstractC2705 {
        public C2722(C2720 c2720, String str) {
            super(str);
        }

        @Override // p131.p225.p226.p227.AbstractC2705
        /* renamed from: げつ〴ぬぐ */
        public KeyPair mo4659(C2742 c2742) {
            BigInteger m4698 = c2742.m4698();
            BigInteger m46982 = c2742.m4698();
            BigInteger m46983 = c2742.m4698();
            BigInteger m46984 = c2742.m4698();
            DSAPrivateKeySpec dSAPrivateKeySpec = new DSAPrivateKeySpec(c2742.m4698(), m4698, m46982, m46983);
            DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(m46984, m4698, m46982, m46983);
            KeyFactory keyFactory = KeyFactory.getInstance(Crypt.a(Crypt.xrc("Jb;Oa:\u001dd=Mfn\u001a69\u001e4kKd>LcjJjlN6j\u001dj")));
            return new KeyPair(keyFactory.generatePublic(dSAPublicKeySpec), keyFactory.generatePrivate(dSAPrivateKeySpec));
        }
    }

    public C2720() {
        super(Crypt.a(Crypt.xrc("Mbg\u001c6nLj>\u001ek9I3;Kfm\u001cd=Nc:\u001bd>Ak9Ma")), Crypt.a(Crypt.xrc("\u001e7<\u001b1kO`>Nci\u001e7kH`nL4=N3=\u001cegOai\u00193")), DSAPrivateKey.class);
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: 〺つふすそ */
    public byte[] mo4656(byte[] bArr) {
        int length = bArr.length;
        String a = Crypt.a(Crypt.xrc("\u001bjiM4;M`iJgf@bk\u0019ajH1>H4g@b9Ij9AciJ0>\u001d0<N6oMdnMkiKchNd>\u001b`h\u001b1fKdfM"));
        if (length != 40) {
            C2742 c2742 = new C2742(bArr);
            if (!c2742.m4694().equals(this.f10212)) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001d6h\u001e7lKd>O0j\u001ba:I4gMahJ6jOa;KgnJ3<\u001a3f\u001a7lK09\u001efn\u0019`h\u001bdg\u001d3lJ3:\u001bf=Jfl\u00194j\u0019`gHdg\u001bafNjmHglAb=I1h\u001deo@e:\u001a4h")));
            }
            bArr = c2742.m4696();
            if (bArr.length != 40) {
                throw new IOException(a);
            }
            if (c2742.m4695() != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("N4;\u001919MefLjk\u001dc;\u001b3fIeoA4n\u0019giOf:\u0019kj\u001ca:M4iKkhIb9@1oOe9J7=O3jJ7nAkfA")));
            }
        }
        if (bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0) {
            int i = (((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255)) + 4;
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = ((bArr[i] << 24) & (-16777216)) | ((bArr[i2] << 16) & 16711680);
            int i5 = i3 + 1;
            int i6 = i4 | ((bArr[i3] << 8) & 65280);
            int i7 = i5 + 1;
            int i8 = i6 | (bArr[i5] & Base64.BASELENGTH);
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            bArr = bArr2;
        }
        byte b = (bArr[0] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte b2 = (bArr[20] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte[] bArr3 = new byte[C2098.m4176(bArr.length, 6, b, b2)];
        bArr3[0] = 48;
        if (bArr.length != 40) {
            throw new IOException(a);
        }
        bArr3[1] = 44;
        bArr3[1] = (byte) (bArr3[1] + b);
        bArr3[1] = (byte) (bArr3[1] + b2);
        bArr3[2] = 2;
        bArr3[3] = 20;
        bArr3[3] = (byte) (bArr3[3] + b);
        System.arraycopy(bArr, 0, bArr3, b + 4, 20);
        bArr3[bArr3[3] + 4] = 2;
        bArr3[bArr3[3] + 5] = 20;
        int i9 = bArr3[3] + 5;
        bArr3[i9] = (byte) (bArr3[i9] + b2);
        System.arraycopy(bArr, 20, bArr3, bArr3[3] + 6 + b2, 20);
        return bArr3;
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: くし〴〺ぅ */
    public List<CertificateDecoder> mo4657() {
        return Arrays.asList(new C2721(null), new C2722(this, this.f10212));
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: げつ〴ぬぐ */
    public DSAPublicKey mo4658(byte[] bArr) {
        C2742 c2742 = new C2742(bArr);
        String m4694 = c2742.m4694();
        if (!m4694.equals(this.f10212)) {
            throw new C2697("Unsupported key format found '" + m4694 + "' while expecting " + this.f10212);
        }
        BigInteger m4698 = c2742.m4698();
        BigInteger m46982 = c2742.m4698();
        BigInteger m46983 = c2742.m4698();
        BigInteger m46984 = c2742.m4698();
        if (c2742.m4695() != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001dc9\u001c0h@ckKg9\u0019ag\u001a3<\u001aff\u001c`kAdm\u001a3oN4>NjfO7g\u001ebnO`<N7fLc9Og=\u001c4m\u001ecj\u001bd:@")));
        }
        try {
            return (DSAPublicKey) KeyFactory.getInstance(Crypt.a(Crypt.xrc("Jb;Oa:\u001dd=Mfn\u001a69\u001e4kKd>LcjJjlN6j\u001dj"))).generatePublic(new DSAPublicKeySpec(m46984, m4698, m46982, m46983));
        } catch (GeneralSecurityException e) {
            throw new IOException(Crypt.a(Crypt.xrc("O1gL`=@1>\u0019a=\u001bjj\u001cj;K`gNalH1:\u001c0kNj>HdlIg=\u001d3g\u001c`j\u001cj9Hd<Hk9I0nOdkAk<M")), e);
        }
    }
}
