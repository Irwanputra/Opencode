package p131.p225.p226.p227;

import com.trilead.ssh2.crypto.CertificateDecoder;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import p131.p225.p226.p229.C2742;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2725 extends AbstractC2723<EdDSAPublicKey, EdDSAPrivateKey> {

    /* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public class C2726 extends AbstractC2705 {
        public C2726(C2725 c2725, String str) {
            super(str);
        }

        @Override // p131.p225.p226.p227.AbstractC2705
        /* renamed from: げつ〴ぬぐ */
        public KeyPair mo4659(C2742 c2742) {
            EdDSANamedCurveSpec byName = EdDSANamedCurveTable.getByName(Crypt.a(Crypt.xrc("LkiKc;Hk<\u001dblN1nJ4lMk:L7g\u001b4;\u001b1iOg")));
            byte[] m4696 = c2742.m4696();
            byte[] m46962 = c2742.m4696();
            EdDSAPublicKeySpec edDSAPublicKeySpec = new EdDSAPublicKeySpec(m4696, byName);
            EdDSAPrivateKeySpec edDSAPrivateKeySpec = new EdDSAPrivateKeySpec(Arrays.copyOfRange(m46962, 0, 32), byName);
            KeyFactory keyFactory = KeyFactory.getInstance(Crypt.a(Crypt.xrc("I7jH7iL3g\u001b3<\u001dehJ1fNc:O`;\u0019djJcf@j")), new EdDSASecurityProvider());
            return new KeyPair(keyFactory.generatePublic(edDSAPublicKeySpec), keyFactory.generatePrivate(edDSAPrivateKeySpec));
        }
    }

    public C2725() {
        super(Crypt.a(Crypt.xrc("@`n\u001den\u001e6hI`=Ibh\u001ceoO7f@ci\u001d4k\u001c4o\u001ea")), Crypt.a(Crypt.xrc("N1gL`n\u0019ejAfgKf>@1o\u001cgmI7;\u001a4nLjn\u001a1")), EdDSAPrivateKey.class, new EdDSASecurityProvider());
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: 〺つふすそ */
    public byte[] mo4656(byte[] bArr) {
        C2742 c2742 = new C2742(bArr);
        if (!c2742.m4694().equals(Crypt.a(Crypt.xrc("N1gL`n\u0019ejAfgKf>@1o\u001cgmI7;\u001a4nLjn\u001a1")))) {
            throw new IOException(Crypt.a(Crypt.xrc("\u0019ck\u001b4<\u001cgoMej\u001d3m\u0019fj\u001eb=\u001bgk\u001b79KefJ1f\u001cjf\u001djkOk=O6lNdg\u0019d<\u001cefM3<Na9Ifh\u001d")));
        }
        byte[] m4696 = c2742.m4696();
        if (c2742.m4695() == 0) {
            return m4696;
        }
        throw new IOException(Crypt.a(Crypt.xrc("Hd;\u001d`gI6fJd=O3=Hf:\u001e7kA`jM7;\u001bd>KfjL3g@`;\u001a1m\u00197<Kk:@1<\u001b`n\u001d3o\u001a7h\u001b09\u001a")));
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: くし〴〺ぅ */
    public List<CertificateDecoder> mo4657() {
        return Collections.singletonList(new C2726(this, Crypt.a(Crypt.xrc("N1gL`n\u0019ejAfgKf>@1o\u001cgmI7;\u001a4nLjn\u001a1"))));
    }

    @Override // p131.p225.p226.p227.AbstractC2723
    /* renamed from: げつ〴ぬぐ */
    public EdDSAPublicKey mo4658(byte[] bArr) {
        C2742 c2742 = new C2742(bArr);
        if (!c2742.m4694().equals(Crypt.a(Crypt.xrc("N1gL`n\u0019ejAfgKf>@1o\u001cgmI7;\u001a4nLjn\u001a1")))) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001dkm\u001c`kLd:\u001aeiI7;@7=Lb<Ken\u001ccm\u00190i\u001ef;\u0019khMb=OdiLc9\u0019kgN1g\u001bj;\u001eg;Aej\u001eklO")));
        }
        byte[] m4696 = c2742.m4696();
        if (c2742.m4695() == 0) {
            return new EdDSAPublicKey(new EdDSAPublicKeySpec(m4696, EdDSANamedCurveTable.getByName(Crypt.a(Crypt.xrc("LkiKc;Hk<\u001dblN1nJ4lMk:L7g\u001b4;\u001b1iOg")))));
        }
        throw new IOException(Crypt.a(Crypt.xrc("Hd;\u001d`gI6fJd=O3=Hf:\u001e7kA`jM7;\u001bd>Kfj\u00190l@e=\u0019jg\u0019`iO3f\u0019f;Ij<\u001bf9\u001bch\u001b4gHjnJeoLeo\u001b3nO3>Oe;\u00197jL7f\u001cjhNdj\u0019bg")));
    }
}
