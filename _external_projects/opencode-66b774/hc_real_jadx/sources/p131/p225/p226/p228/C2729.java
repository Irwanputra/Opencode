package p131.p225.p226.p228;

import androidx.core.app.NotificationCompat;
import com.trilead.ssh2.crypto.CryptoWishList;
import com.trilead.ssh2.crypto.KeyMaterial;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.cipher.NullCipher;
import com.trilead.ssh2.crypto.digest.MessageMac;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.C2698;
import p131.p225.p226.C2772;
import p131.p225.p226.InterfaceC2775;
import p131.p225.p226.p227.AbstractC2723;
import p131.p225.p226.p227.C2724;
import p131.p225.p226.p233.C2773;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぉざぅち〻.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2729 implements InterfaceC2737 {

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final C2773 f10234 = new C2773(C2729.class);

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final List<String> f10235;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final C2731 f10239;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final SecureRandom f10240;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final int f10241;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public KeyMaterial f10242;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C2739 f10243;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public C2736 f10244;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public InterfaceC2775 f10247;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public byte[] f10248;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final String f10249;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public CryptoWishList f10251;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f10237 = 0;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Object f10246 = new Object();

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C2698 f10238 = null;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f10236 = false;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f10250 = false;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C2772 f10245 = new C2772();

    static {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC2723<PublicKey, PrivateKey>> it = C2724.f10215.iterator();
        while (it.hasNext()) {
            arrayList.add(arrayList.size(), it.next().f10212);
        }
        f10235 = arrayList;
    }

    public C2729(C2731 c2731, C2736 c2736, CryptoWishList cryptoWishList, String str, int i, InterfaceC2775 interfaceC2775, SecureRandom secureRandom) {
        this.f10239 = c2731;
        this.f10244 = c2736;
        this.f10251 = cryptoWishList;
        this.f10249 = str;
        this.f10241 = i;
        this.f10247 = interfaceC2775;
        this.f10240 = secureRandom;
    }

    @Override // p131.p225.p226.p228.InterfaceC2737
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo4665(Throwable th) {
        synchronized (this.f10246) {
            this.f10236 = true;
            this.f10246.notifyAll();
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final boolean m4666(byte[] bArr, byte[] bArr2) {
        for (AbstractC2723<PublicKey, PrivateKey> abstractC2723 : C2724.f10215) {
            if (abstractC2723.f10212.equals(this.f10243.f10301.f10255)) {
                PublicKey mo4658 = abstractC2723.mo4658(bArr2);
                byte[] mo4656 = abstractC2723.mo4656(bArr);
                byte[] bArr3 = this.f10243.f10304;
                try {
                    Provider provider = abstractC2723.f10213;
                    Signature signature = provider == null ? Signature.getInstance(abstractC2723.f10214) : Signature.getInstance(abstractC2723.f10214, provider);
                    signature.initVerify(mo4658);
                    signature.update(bArr3);
                    return signature.verify(mo4656);
                } catch (GeneralSecurityException e) {
                    throw new IOException(Crypt.a(Crypt.xrc("\u001d`<Nb=@c;Okf\u0019eo\u001c1n\u001919@3=\u0019ji\u001e3hM1i\u001e0jJgj\u001dkgN1;\u001bafNk<AbnIb;H7g@7=H")), e);
                }
            }
        }
        throw new IOException(C2098.m4198(C2098.m4207("Unknown server host key algorithm '"), this.f10243.f10301.f10255, "'"));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m4667(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null) {
            throw new IllegalArgumentException();
        }
        if (strArr.length == 0 && strArr2.length == 0) {
            return true;
        }
        if (strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        return strArr[0].equals(strArr2[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        r0 = new p131.p225.p226.p228.C2739();
        r13.f10243 = r0;
        r0.f10300 = r13.f10245;
        r0 = new p131.p225.p226.p229.C2743(r13.f10251, r13.f10240);
        r13.f10243.f10302 = r0;
        r13.f10239.m4681(r0.m4702());
     */
    @Override // p131.p225.p226.p228.InterfaceC2737
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void mo4668(byte[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p225.p226.p228.C2729.mo4668(byte[], int):void");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final String m4669(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null) {
            throw new IllegalArgumentException();
        }
        if (strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (str.equals(str2)) {
                    return str;
                }
            }
        }
        throw new C2738();
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C2730 m4670(C2735 c2735, C2735 c27352) {
        C2730 c2730 = new C2730();
        try {
            c2730.f10253 = m4669(c2735.f10284, c27352.f10284);
            C2773 c2773 = f10234;
            c2773.m4754(30, Crypt.a(Crypt.xrc("I4f\u001de>Jfm@6kA3=Kfg\u001c0=\u001ebkN4o\u001b3mOe")) + c2730.f10253);
            c2730.f10255 = m4669(c2735.f10287, c27352.f10287);
            c2773.m4754(30, Crypt.a(Crypt.xrc("Lk=\u001b7nKdj\u001a3j@3m\u001dcnL3gHjo\u001ej>N1kLao\u001eafNjiIb;Hd:\u00190k\u001c4j\u001denNglM`:Igm\u0019")) + c2730.f10255);
            c2730.f10259 = m4669(c2735.f10293, c27352.f10293);
            c2730.f10257 = m4669(c2735.f10289, c27352.f10289);
            c2773.m4754(30, Crypt.a(Crypt.xrc("He:N`gIb:A3lA4mHkk@gfHc=K`mL7=\u00193m\u001cdjIelL6kLei\u001a`9\u001eb:\u001ac;\u0019bfNgg\u001ce>\u0019")) + c2730.f10259);
            c2773.m4754(30, Crypt.a(Crypt.xrc("MgnLbnO3h@ah\u001c0f\u001bj:\u0019dkIgmMe=\u001e`>OaiLggHkhM3jOfn\u001ac9\u001cf9Lb=L3>I0>\u001c6gI")) + c2730.f10257);
            c2730.f10258 = m4669(c2735.f10291, c27352.f10291);
            c2730.f10254 = m4669(c2735.f10285, c27352.f10285);
            c2773.m4754(30, Crypt.a(Crypt.xrc("JglMknM3gKcgJjk@knJaiJd;\u001b4hM3:\u001a3lLei@7<\u001c`:\u001bj<A1i\u001c3=@a=H1fL3iIj9N")) + c2730.f10258);
            c2773.m4754(30, Crypt.a(Crypt.xrc("\u001b4f\u001c1;Aj>\u001afo\u001eaiN3=Lgg@1;@69Lgk\u001cc:N7:\u001dao@ah\u001a7>\u001ben\u001e1=HjmOj;Og>@fl\u001c")) + c2730.f10254);
            c2730.f10252 = m4669(c2735.f10283, c27352.f10283);
            c2730.f10260 = m4669(c2735.f10294, c27352.f10294);
            c2773.m4754(30, Crypt.a(Crypt.xrc("\u00191=\u001camK7;\u001c09JfgM6f\u001d`i\u001df=\u001befOko\u001dgi\u001bdhN3:I1iAeoI`gKjnN7gMj=\u001a1iN1m\u001c")) + c2730.f10252);
            c2773.m4754(30, Crypt.a(Crypt.xrc("IaoMgm\u00193nKdnOa:HeoIg=Hdi@aj\u001c`g\u001c69K6m\u0019doKc<LbiK`mOc;\u001c6=\u001eenO0mN4:A")) + c2730.f10260);
            try {
                m4669(c2735.f10286, c27352.f10286);
            } catch (C2738 unused) {
            }
            try {
                m4669(c2735.f10295, c27352.f10295);
            } catch (C2738 unused2) {
            }
            boolean z = false;
            if (m4667(c2735.f10284, c27352.f10284) && m4667(c2735.f10287, c27352.f10287)) {
                z = true;
            }
            if (z) {
                c2730.f10256 = true;
            }
            return c2730;
        } catch (C2738 unused3) {
            return null;
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m4671() {
        if (this.f10248 == null) {
            this.f10248 = this.f10243.f10304;
        }
        try {
            int keyLength = MessageMac.getKeyLength(this.f10243.f10301.f10258);
            int keySize = BlockCipherFactory.getKeySize(this.f10243.f10301.f10259);
            int blockSize = BlockCipherFactory.getBlockSize(this.f10243.f10301.f10259);
            int keyLength2 = MessageMac.getKeyLength(this.f10243.f10301.f10254);
            int keySize2 = BlockCipherFactory.getKeySize(this.f10243.f10301.f10257);
            int blockSize2 = BlockCipherFactory.getBlockSize(this.f10243.f10301.f10257);
            C2739 c2739 = this.f10243;
            this.f10242 = KeyMaterial.create(c2739.f10307, c2739.f10304, c2739.f10303, this.f10248, keySize, blockSize, keyLength, keySize2, blockSize2, keyLength2);
        } catch (IllegalArgumentException unused) {
        }
        C2731 c2731 = this.f10239;
        byte[] bArr = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        bArr[0] = (byte) 21;
        byte[] bArr2 = new byte[1];
        System.arraycopy(bArr, 0, bArr2, 0, 1);
        c2731.m4681(bArr2);
        try {
            String str = this.f10243.f10301.f10259;
            KeyMaterial keyMaterial = this.f10242;
            BlockCipher createCipher = BlockCipherFactory.createCipher(str, true, keyMaterial.enc_key_client_to_server, keyMaterial.initial_iv_client_to_server);
            MessageMac messageMac = new MessageMac(this.f10243.f10301.f10258, this.f10242.integrity_key_client_to_server);
            C2728 c2728 = this.f10239.f10266;
            c2728.getClass();
            if (!(createCipher instanceof NullCipher)) {
                c2728.f10226 = true;
            }
            c2728.f10230.changeCipher(createCipher);
            c2728.f10228 = messageMac;
            c2728.f10219 = new byte[messageMac.size()];
            int blockSize3 = createCipher.getBlockSize();
            c2728.f10217 = blockSize3;
            if (blockSize3 < 8) {
                c2728.f10217 = 8;
            }
            C2731 c27312 = this.f10239;
            synchronized (c27312.f10265) {
                c27312.f10263 = false;
                c27312.f10265.notifyAll();
            }
        } catch (IllegalArgumentException unused2) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001afg\u001ab;Mai\u001ef:@1gKg:O3jLj<@goIc>@0j\u001c`l\u001c0kNbj\u001d39\u00196;AfhNa9@en\u001abi\u001afhK")));
        }
    }
}
