package p131.p225.p226.p227;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.cipher.CBCMode;
import com.trilead.ssh2.crypto.cipher.DES;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import p015.p021.p022.C0980;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.p229.C2742;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2705 extends CertificateDecoder {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f10196;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ$〺つふすそ, reason: contains not printable characters */
    public static abstract class EnumC2706 {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public static final EnumC2706 f10197;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public static final EnumC2706 f10198;

        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public static final /* synthetic */ EnumC2706[] f10199;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public static final EnumC2706 f10200;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public static final EnumC2706 f10201;

        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public static final EnumC2706 f10202;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final String[] f10203;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f10204;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final int f10205;

        /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ$〺つふすそ$〺つふすそ, reason: contains not printable characters */
        public enum C2707 extends EnumC2706 {
            public C2707(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, null);
            }

            @Override // p131.p225.p226.p227.AbstractC2705.EnumC2706
            /* renamed from: げつ〴ぬぐ */
            public BlockCipher mo4660(byte[] bArr, byte[] bArr2, boolean z) {
                DES des = new DES();
                des.init(z, bArr);
                return new CBCMode(des, bArr2, z);
            }
        }

        /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ$〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
        public enum C2708 extends EnumC2706 {
            public C2708(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, null);
            }

            @Override // p131.p225.p226.p227.AbstractC2705.EnumC2706
            /* renamed from: げつ〴ぬぐ */
            public BlockCipher mo4660(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher(Crypt.a(Crypt.xrc("Ndi@j9\u001bkn\u001bg:I6:\u001b0n\u001ee<J09\u001ce:\u00191h\u001a1")), z, bArr, bArr2);
            }
        }

        /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ$〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
        public enum C2709 extends EnumC2706 {
            public C2709(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, null);
            }

            @Override // p131.p225.p226.p227.AbstractC2705.EnumC2706
            /* renamed from: げつ〴ぬぐ */
            public BlockCipher mo4660(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher(Crypt.a(Crypt.xrc("Akf\u001eenJf>\u001e0g\u001d1k\u001b3=Lc=JgmN7<Ngm\u001cb")), z, bArr, bArr2);
            }
        }

        /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ$〺つふすそ$づざかべべ, reason: contains not printable characters */
        public enum C2710 extends EnumC2706 {
            public C2710(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, null);
            }

            @Override // p131.p225.p226.p227.AbstractC2705.EnumC2706
            /* renamed from: げつ〴ぬぐ */
            public BlockCipher mo4660(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher(Crypt.a(Crypt.xrc("\u001cc=L4<\u001d79KckH7l\u001c3jN0>\u001ee:Hbm\u001a7gLd")), z, bArr, bArr2);
            }
        }

        /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.ぁごぐすすぃ$〺つふすそ$びぐびあび, reason: contains not printable characters */
        public enum C2711 extends EnumC2706 {
            public C2711(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, null);
            }

            @Override // p131.p225.p226.p227.AbstractC2705.EnumC2706
            /* renamed from: げつ〴ぬぐ */
            public BlockCipher mo4660(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher(Crypt.a(Crypt.xrc("\u001db=JdoO0;\u001bg>\u001ea9AcoMkm\u001cbi\u001e0mIjh\u001e6")), z, bArr, bArr2);
            }
        }

        static {
            C2709 c2709 = new C2709(Crypt.a(Crypt.xrc("\u001e1<J1<@0oH6hN`iJknMf:Hf;\u00197l\u001deiMg")), 0, 24, 8, Crypt.a(Crypt.xrc("\u00196;Jd=@a9M`fNcgOg9LbfKg:Ic=AjmJc")), new String[0]);
            f10200 = c2709;
            C2707 c2707 = new C2707(Crypt.a(Crypt.xrc("\u001a6=I0:J1=\u001bdmMgf\u001ac=\u001dek\u001b`o\u001a1k\u001egh\u001cb")), 1, 8, 8, Crypt.a(Crypt.xrc("Kk=LanNe=@0<\u001b3l\u001cgoAck\u001dj<\u001ed;IboJk")), new String[0]);
            f10201 = c2707;
            C2708 c2708 = new C2708(Crypt.a(Crypt.xrc("Ic:N09Og=MgjMfiMjjM7gI1;K7j\u001cen@k")), 2, 16, 16, Crypt.a(Crypt.xrc("L1mJckIamHbiO09O1i\u0019kf\u001ckmKff@0mJa")), Crypt.a(Crypt.xrc("Ndi@j9\u001bkn\u001bg:I6:\u001b0n\u001ee<J09\u001ce:\u00191h\u001a1")));
            f10198 = c2708;
            C2711 c2711 = new C2711(Crypt.a(Crypt.xrc("Jg;Jd=\u001949A6<\u001bam\u001bji@1fJd:\u00191f@ao\u001d6")), 3, 24, 16, Crypt.a(Crypt.xrc("Hbh\u001c`<A4mKe;AckIjf\u00194:M1o\u001a6:NfiL4")), Crypt.a(Crypt.xrc("\u001db=JdoO0;\u001bg>\u001ea9AcoMkm\u001cbi\u001e0mIjh\u001e6")));
            f10197 = c2711;
            C2710 c2710 = new C2710(Crypt.a(Crypt.xrc("@d9N6<A3>Ifj@a;\u001bbmNdn\u001c3fLc<Ka<N`")), 4, 32, 16, Crypt.a(Crypt.xrc("\u001a`g\u0019a>J1m\u001d`;\u0019goM7jM0:\u0019`j\u001dc=Le>A1")), Crypt.a(Crypt.xrc("\u001cc=L4<\u001d79KckH7l\u001c3jN0>\u001ee:Hbm\u001a7gLd")));
            f10202 = c2710;
            f10199 = new EnumC2706[]{c2709, c2707, c2708, c2711, c2710};
        }

        public EnumC2706(String str, int i, int i2, int i3, String str2, String[] strArr, C2712 c2712) {
            this.f10204 = i2;
            this.f10205 = i3;
            String[] strArr2 = new String[(strArr == null ? 0 : strArr.length) + 1];
            strArr2[0] = str2;
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            }
            this.f10203 = strArr2;
        }

        public static EnumC2706 valueOf(String str) {
            return (EnumC2706) Enum.valueOf(EnumC2706.class, str);
        }

        public static EnumC2706[] values() {
            return (EnumC2706[]) f10199.clone();
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public abstract BlockCipher mo4660(byte[] bArr, byte[] bArr2, boolean z);
    }

    public AbstractC2705(String str) {
        this.f10196 = str;
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public KeyPair createKeyPair(PEMStructure pEMStructure) {
        return null;
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public KeyPair createKeyPair(PEMStructure pEMStructure, String str) {
        C2742 c2742;
        byte[] bArr;
        C2742 c27422 = new C2742(pEMStructure.getData());
        if (!Crypt.a(Crypt.xrc("M7nJj9Ac;@am\u00196kHenJ4g\u001abk@f;KelJ3")).equals(new String(c27422.m4700(15), StandardCharsets.UTF_8).trim())) {
            throw new IOException(Crypt.a(Crypt.xrc("\u00196=H1i@cmId=\u001cgm\u001cffI1nMg;H3h\u001a6:H1j\u001e`m\u001bel\u001e6>O0hMa=\u001d3iN1h@3fIbmI0:\u001efgOg9@1=Ig:\u001c3o\u00196>KdfOjf\u001c`o\u0019b;Adk")));
        }
        String m4694 = c27422.m4694();
        String m46942 = c27422.m4694();
        byte[] m4696 = c27422.m4696();
        if (c27422.m4701() != 1) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001ec=O7m\u001b09H`>\u001cbgOb=\u001cbiN`hI4iH`iH6hN6<Mgf@cmM1nJkiOk>IbhKfoLfo\u001e3<\u001b3fKekL3k\u001ddm\u001a6m\u00190iKg:\u001c1l@7>Ob>N0<")));
        }
        c27422.m4696();
        byte[] m46962 = c27422.m4696();
        if (Crypt.a(Crypt.xrc("J1oNfg\u00193lJc:@cj\u001d`<IfoNjh\u001bjiI0kLj")).equals(m46942)) {
            if (str == null) {
                throw new IOException(Crypt.a(Crypt.xrc("@jlAbh\u001ca<OjlOjoHa:Nj9Af;Ian\u001cjgJ3>M3:\u001eboHaf\u001agmJ`hJcn\u0019ak\u001dghAcfO7iO1gNkg\u001ddj\u001b6f\u001cbnHa<Nkn\u001dekKfo\u001c1=H0f\u001ej:K3fJ4fAbiN4gNkk@f>\u001ce>\u001af>N3oIb")));
            }
            C2742 c27423 = new C2742(m4696);
            byte[] m46963 = c27423.m4696();
            int m4701 = c27423.m4701();
            EnumC2706[] values = EnumC2706.values();
            for (int i = 0; i < 5; i++) {
                EnumC2706 enumC2706 = values[i];
                for (String str2 : enumC2706.f10203) {
                    if (str2.equalsIgnoreCase(m4694)) {
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        int i2 = enumC2706.f10204 + enumC2706.f10205;
                        byte[] bArr2 = new byte[i2];
                        C0980 c0980 = new C0980();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u0019b<\u001a3:\u001bbnN0m\u001aekIj;\u001cahJf=\u001d7mK0:Na")));
                            int i3 = (i2 + 31) / 32;
                            byte[] digest = messageDigest.digest(bytes);
                            byte[] bArr3 = new byte[64];
                            byte[] bArr4 = new byte[4];
                            byte[] bArr5 = new byte[32];
                            byte[] bArr6 = new byte[32];
                            c2742 = c27422;
                            int i4 = 1;
                            while (i4 <= i3) {
                                bArr4[0] = (byte) ((i4 >> 24) & Base64.BASELENGTH);
                                bArr4[1] = (byte) ((i4 >> 16) & Base64.BASELENGTH);
                                bArr4[2] = (byte) ((i4 >> 8) & Base64.BASELENGTH);
                                byte[] bArr7 = m46962;
                                bArr4[3] = (byte) (i4 & Base64.BASELENGTH);
                                messageDigest.reset();
                                messageDigest.update(m46963);
                                messageDigest.update(bArr4);
                                int i5 = 0;
                                messageDigest.digest(bArr3, 0, 64);
                                c0980.m2309(digest, bArr3, bArr5);
                                System.arraycopy(bArr5, 0, bArr6, 0, 32);
                                int i6 = 1;
                                while (i6 < m4701) {
                                    messageDigest.reset();
                                    messageDigest.update(bArr6);
                                    int i7 = m4701;
                                    messageDigest.digest(bArr3, i5, 64);
                                    c0980.m2309(digest, bArr3, bArr6);
                                    int i8 = 0;
                                    for (int i9 = 32; i8 < i9; i9 = 32) {
                                        bArr5[i8] = (byte) (bArr5[i8] ^ bArr6[i8]);
                                        i8++;
                                    }
                                    i6++;
                                    i5 = 0;
                                    m4701 = i7;
                                }
                                int i10 = m4701;
                                for (int i11 = 0; i11 < 32; i11++) {
                                    int i12 = (i4 - 1) + (i11 * i3);
                                    if (i12 < i2) {
                                        bArr2[i12] = bArr5[i11];
                                    }
                                }
                                i4++;
                                m46962 = bArr7;
                                m4701 = i10;
                            }
                            byte[] bArr8 = m46962;
                            int i13 = enumC2706.f10204;
                            byte[] bArr9 = new byte[i13];
                            int i14 = enumC2706.f10205;
                            byte[] bArr10 = new byte[i14];
                            System.arraycopy(bArr2, 0, bArr9, 0, i13);
                            System.arraycopy(bArr2, i13, bArr10, 0, i14);
                            BlockCipher mo4660 = enumC2706.mo4660(bArr9, bArr10, false);
                            byte[] bArr11 = new byte[bArr8.length];
                            for (int i15 = 0; i15 < bArr8.length / mo4660.getBlockSize(); i15++) {
                                mo4660.transformBlock(bArr8, mo4660.getBlockSize() * i15, bArr11, mo4660.getBlockSize() * i15);
                            }
                            bArr = bArr11;
                        } catch (DigestException e) {
                            throw new RuntimeException(e);
                        } catch (NoSuchAlgorithmException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
            throw new IllegalArgumentException(C2098.m4205(Crypt.a(Crypt.xrc("J3g\u00194i\u001ckkMdi\u001c0:Lc;\u001eb=\u0019c>\u001akf\u001dc;Ad>\u001cb9\u001d7jM0=\u001ca=Ad=\u001e3jA4kO7=Na;Ibg@")), m4694));
        }
        c2742 = c27422;
        String a = Crypt.a(Crypt.xrc("\u001aaiHg:A4m\u001cb;MakI3lH7i\u001dj:Kj<\u0019kgNj"));
        if (!a.equals(m4694) || !a.equals(m46942)) {
            throw new IOException(Crypt.a(Crypt.xrc("Jg:\u001a3h\u0019cf\u001b4hAkiK1mIk<OcoIei\u001ebiM4g\u001bdgM0n\u001daiA4k@a<NeiO7hM1;\u001ecoOa:J0n@0:I7:Mg=H3fJgj\u001cknIfi\u001d1:Ik:Kem")));
        }
        bArr = m46962;
        C2742 c27424 = new C2742(bArr);
        if (c27424.m4701() != c27424.m4701()) {
            throw new IOException("Check integers didn't match");
        }
        String m46943 = c27424.m4694();
        if (!m46943.equals(this.f10196)) {
            throw new IOException(C2098.m4205(Crypt.a(Crypt.xrc("\u001dkm\u001c`kLd:\u001aeiI7;@7=Lb<Ken\u001ccm\u00190i\u001ef=\u001cjmLj9L1h\u001a3j\u001ajk\u001dkfL7lH6f\u001b4<\u0019k:J")), m46943));
        }
        try {
            KeyPair mo4659 = mo4659(c27424);
            c27424.m4696();
            int i16 = 0;
            while (i16 < c2742.m4695()) {
                i16++;
                if (i16 != c2742.m4693()) {
                    throw new IOException(Crypt.a(Crypt.xrc("Kbk\u001bgk\u001d19I3>\u001bckJb<Nak\u001c4f\u001bkoOgfI0g\u0019chM6i@4k\u001c6nN`fNg>\u0019`hIgg\u001a1oH7:Ieo\u001b1>Mfk\u001cem\u001eg9\u001e0n\u00193<H6:\u001afiH7h\u001b7f")));
                }
            }
            return mo4659;
        } catch (GeneralSecurityException e3) {
            throw new IOException(Crypt.a(Crypt.xrc("@6<\u001b0jAc>\u001a1o\u001bjmKgi\u001e7hNgkJfiL6l\u001a0k@6j\u001c4g\u001ckgOkg\u0019c:@`f\u001ec>K6>\u00190k\u001b`f@")), e3);
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public String getEndLine() {
        return Crypt.a(Crypt.xrc("H1oIfgMc;\u001ecl\u001dbj\u001d0nA49\u001ag;O`iL`jH1=\u001c7i\u0019k=I39LjgHc<Hf<@ao\u001cc>Kjh\u001d7nJjl\u001e1;\u0019foN3=J4l\u001djoAdfM`l\u001a0>Kci\u001ce="));
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public String getStartLine() {
        return Crypt.a(Crypt.xrc("\u001cdo\u0019kkK3<Ja>J1oN1j\u001cdi\u001a1mIco\u0019`h\u001ck:A1n@7jHfkKc:HfkMjj\u00193g\u001c7mL4i\u001dk;@0oKj:L4>K0<I3o\u001ekn@fo\u001cd=LbnIaf\u001ajl"));
    }

    /* renamed from: げつ〴ぬぐ */
    public abstract KeyPair mo4659(C2742 c2742);
}
