package p131.p225.p226.p227;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.List;
import p131.p225.p226.C2697;
import p131.p225.p226.p229.C2742;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2701 extends AbstractC2723<RSAPublicKey, RSAPrivateKey> {

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.〳ぜぞぜべっ$〺つふすそ, reason: contains not printable characters */
    public static class C2702 extends CertificateDecoder {
        public C2702(C2703 c2703) {
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public KeyPair createKeyPair(PEMStructure pEMStructure) {
            SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
            byte[] readSequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001be<\u001edmHe9\u001b7:\u001dg:@kmLf>\u001b3;\u001cdkHdm\u001ckh@km\u001dd:J6oL3:I7kHf;Ka9\u001bjh@c<@1k\u001a4g\u001ab<\u001b1nHkj\u0019ch\u001bkkM`k\u001cc<\u0019kfKd;Ia<")));
            }
            simpleDERReader.resetInput(readSequenceAsByteArray);
            BigInteger readInt = simpleDERReader.readInt();
            if (readInt.compareTo(BigInteger.ZERO) != 0 && readInt.compareTo(BigInteger.ONE) != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("\u0019dl\u001e1>M`<\u001c7jKb>J1=M7kIcmM6n\u001del\u001cc")) + readInt + Crypt.a(Crypt.xrc("Jbf\u0019`;\u00193>NanI7nMc;IgnKcnIk=Lj>\u00197=L7nAjn\u001balH1gLgm\u001d3mK3oMd>\u001e4k@7;\u001dgjKj=O4=@4iJbhO7nMgoNgmO`iLfnLj9")));
            }
            BigInteger readInt2 = simpleDERReader.readInt();
            BigInteger readInt3 = simpleDERReader.readInt();
            try {
                RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = new RSAPrivateCrtKeySpec(readInt2, readInt3, simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt());
                RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(readInt2, readInt3);
                KeyFactory keyFactory = KeyFactory.getInstance(Crypt.a(Crypt.xrc("J7=\u001dkn\u001c4h\u001ab>\u001dfh\u0019dkLcn\u001eah\u001aj;\u001e6kH6")));
                return new KeyPair(keyFactory.generatePublic(rSAPublicKeySpec), keyFactory.generatePrivate(rSAPrivateCrtKeySpec));
            } catch (GeneralSecurityException unused) {
                throw new IOException(Crypt.a(Crypt.xrc("Lbo\u0019fmJ6o\u001abk\u001dd>O4m@7jMbkHjm\u001e3:@coNg>\u001aak\u001ejm\u0019fnHk;Mkk\u001ag9LjgIgg\u00196>\u001b")));
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getEndLine() {
            return Crypt.a(Crypt.xrc("I7;Hdh\u00191kNc:\u001ce=A4iHj>\u001d69\u001ceh\u001ea:AenNd<\u001cfj\u001djjLj>O4f\u001db<\u001cjnAe;@1fKdlI"));
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getStartLine() {
            return Crypt.a(Crypt.xrc("Ifm\u001b0hJghNc;Okf@djMf:@e<\u001e3=Hfh\u001ck:HbmH79Mj<Hjf\u001ce<\u001bekA0f\u001dcnMboJ4fJ"));
        }
    }

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2703 extends AbstractC2705 {
        public C2703(C2701 c2701, String str) {
            super(str);
        }

        @Override // p131.p225.p226.p227.AbstractC2705
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public KeyPair mo4659(C2742 c2742) {
            KeySpec rSAPrivateKeySpec;
            BigInteger m4698 = c2742.m4698();
            BigInteger m46982 = c2742.m4698();
            BigInteger m46983 = c2742.m4698();
            BigInteger m46984 = c2742.m4698();
            BigInteger m46985 = c2742.m4698();
            RSAPublicKeySpec rSAPublicKeySpec = new RSAPublicKeySpec(m4698, m46982);
            if (m46985 == null || m46984 == null) {
                rSAPrivateKeySpec = new RSAPrivateKeySpec(m4698, m46983);
            } else {
                BigInteger modInverse = m46984.modInverse(m46985);
                BigInteger bigInteger = BigInteger.ONE;
                rSAPrivateKeySpec = new RSAPrivateCrtKeySpec(m4698, m46982, m46983, m46985, modInverse, m46983.mod(m46985.subtract(bigInteger)), m46983.mod(modInverse.subtract(bigInteger)), m46984);
            }
            KeyFactory keyFactory = KeyFactory.getInstance(Crypt.a(Crypt.xrc("J7=\u001dkn\u001c4h\u001ab>\u001dfh\u0019dkLcn\u001eah\u001aj;\u001e6kH6")));
            return new KeyPair(keyFactory.generatePublic(rSAPublicKeySpec), keyFactory.generatePrivate(rSAPrivateKeySpec));
        }
    }

    public C2701() {
        super(Crypt.a(Crypt.xrc("@fj\u001b39Lc>\u001cc<\u001d7k\u001919\u0019bl\u001ebjL0mH1gO4")), Crypt.a(Crypt.xrc("O4hL`f\u001ejn\u001bf<I6iO7:Jb;Ad>\u001d0<\u001e3i\u001cf")), RSAPrivateKey.class);
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public byte[] mo4656(byte[] bArr) {
        C2742 c2742 = new C2742(bArr);
        if (!c2742.m4694().equals(this.f10212)) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001d6h\u001e7lKd>O0j\u001ba:I4gMahJ6jOa;KgnJ3<\u001a3f\u001a7lK09\u001efn\u0019`h\u001bdg\u001d3lJ3:\u001bf=Jfl\u00194j\u0019`gHdg\u001bafNjmHglAb=I1h\u001deo@e:\u001a4h")));
        }
        byte[] m4696 = c2742.m4696();
        if (m4696.length == 0) {
            throw new IOException(Crypt.a(Crypt.xrc("Kkg\u001c6=@egOgf\u001a1hNalJbl\u001bfg\u001bf;Kj:\u001dfoI0j\u0019kkM`oJkiJ`fH0nH3n\u001b1hMcm\u001d3>MjlA1;\u001egf\u001dgjHjiNa>Ogl\u001b6l\u001ad>NbgMeo")));
        }
        if (c2742.m4695() == 0) {
            return m4696;
        }
        throw new IOException(Crypt.a(Crypt.xrc("M69\u001bdh\u001e0hAg9@6lJbj\u001d6k\u001d79Akn\u001ec;Ie<\u001dd=@ef\u001b3mM7<Oe=I0;MfhH1=\u0019ag\u001c0n\u0019")));
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public List<CertificateDecoder> mo4657() {
        return Arrays.asList(new C2702(null), new C2703(this, Crypt.a(Crypt.xrc("O4hL`f\u001ejn\u001bf<I6iO7:Jb;Ad>\u001d0<\u001e3i\u001cf"))));
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public RSAPublicKey mo4658(byte[] bArr) {
        C2742 c2742 = new C2742(bArr);
        String m4694 = c2742.m4694();
        if (!m4694.equals(this.f10212)) {
            throw new C2697("Unsupported key format found '" + m4694 + "' while expecting " + this.f10212);
        }
        BigInteger m4698 = c2742.m4698();
        BigInteger m46982 = c2742.m4698();
        if (c2742.m4695() != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("Ig<@fk\u001ec>K6l\u001bc9NgmN1f\u001bak\u001a4fIefK3gNgm\u001e1<Jkf\u001achA`=\u001e`mAgi\u001dkkNb;A4m\u001c")));
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance(Crypt.a(Crypt.xrc("J7=\u001dkn\u001c4h\u001ab>\u001dfh\u0019dkLcn\u001eah\u001aj;\u001e6kH6"))).generatePublic(new RSAPublicKeySpec(m46982, m4698));
        } catch (GeneralSecurityException e) {
            throw new IOException(Crypt.a(Crypt.xrc("O1gL`=@1>\u0019a=\u001bjj\u001cj;K`gNalH1:\u001c0kNjkL6oA6<N`<@kh\u001b`kLjhIch\u0019fmKdg@jo\u001c")), e);
        }
    }
}
