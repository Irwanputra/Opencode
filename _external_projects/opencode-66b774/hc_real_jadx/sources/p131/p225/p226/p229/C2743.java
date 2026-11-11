package p131.p225.p226.p229;

import com.trilead.ssh2.crypto.CryptoWishList;
import java.io.IOException;
import java.security.SecureRandom;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.p228.C2735;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.おぐぴう〸ず.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2743 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C2735 f10313;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public byte[] f10314;

    public C2743(CryptoWishList cryptoWishList, SecureRandom secureRandom) {
        C2735 c2735 = new C2735();
        this.f10313 = c2735;
        byte[] bArr = new byte[16];
        c2735.f10288 = bArr;
        secureRandom.nextBytes(bArr);
        C2735 c27352 = this.f10313;
        c27352.f10284 = cryptoWishList.kexAlgorithms;
        c27352.f10287 = cryptoWishList.serverHostKeyAlgorithms;
        c27352.f10293 = cryptoWishList.c2s_enc_algos;
        c27352.f10289 = cryptoWishList.s2c_enc_algos;
        c27352.f10291 = cryptoWishList.c2s_mac_algos;
        c27352.f10285 = cryptoWishList.s2c_mac_algos;
        String a = Crypt.a(Crypt.xrc("\u001aaiHg:A4m\u001cb;MakI3lH7i\u001dj:Kj<\u0019kgNj"));
        c27352.f10283 = new String[]{a};
        c27352.f10294 = new String[]{a};
        c27352.f10286 = new String[0];
        c27352.f10295 = new String[0];
        c27352.f10290 = false;
        c27352.f10292 = 0;
    }

    public C2743(byte[] bArr, int i, int i2) {
        this.f10313 = new C2735();
        byte[] bArr2 = new byte[i2];
        this.f10314 = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        C2742 c2742 = new C2742(bArr, i, i2);
        int m4693 = c2742.m4693();
        if (m4693 != 20) {
            throw new IOException(C2098.m4185(Crypt.a(Crypt.xrc("\u0019a:\u001a1jI4jJ0>M`=\u001agj\u001d4nJel@bh\u001da:\u001c0:Mf9\u001ab;\u001dcnLkjHa;\u001c7<O`gJ3lHghA0h\u001a")), m4693, Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        this.f10313.f10288 = c2742.m4700(16);
        this.f10313.f10284 = c2742.m4699();
        this.f10313.f10287 = c2742.m4699();
        this.f10313.f10293 = c2742.m4699();
        this.f10313.f10289 = c2742.m4699();
        this.f10313.f10291 = c2742.m4699();
        this.f10313.f10285 = c2742.m4699();
        this.f10313.f10283 = c2742.m4699();
        this.f10313.f10294 = c2742.m4699();
        this.f10313.f10286 = c2742.m4699();
        this.f10313.f10295 = c2742.m4699();
        this.f10313.f10290 = c2742.m4697();
        this.f10313.f10292 = c2742.m4701();
        if (c2742.m4695() != 0) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001b`j\u001c1k\u001agiI3:HfoNb=JaoIcl\u001ddjHfm\u001af;Og9@cl\u001cjl\u00193gL0fJe;\u001cb9M1;Ajj\u001ac:A")));
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public byte[] m4702() {
        if (this.f10314 == null) {
            C2744 c2744 = new C2744();
            c2744.m4712(20);
            c2744.m4710(this.f10313.f10288, 0, 16);
            c2744.m4707(this.f10313.f10284);
            c2744.m4707(this.f10313.f10287);
            c2744.m4707(this.f10313.f10293);
            c2744.m4707(this.f10313.f10289);
            c2744.m4707(this.f10313.f10291);
            c2744.m4707(this.f10313.f10285);
            c2744.m4707(this.f10313.f10283);
            c2744.m4707(this.f10313.f10294);
            c2744.m4707(this.f10313.f10286);
            c2744.m4707(this.f10313.f10295);
            c2744.m4708(this.f10313.f10290);
            c2744.m4713(this.f10313.f10292);
            this.f10314 = c2744.m4709();
        }
        return this.f10314;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m4703() {
        return this.f10313.f10290;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2735 m4704() {
        return this.f10313;
    }
}
