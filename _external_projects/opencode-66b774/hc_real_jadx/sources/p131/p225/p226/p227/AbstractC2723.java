package p131.p225.p226.p227;

import com.trilead.ssh2.crypto.CertificateDecoder;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.List;

/* renamed from: なぎぱいぢぎ.ぺぁあねじ.げつ〴ぬぐ.ぇぬぎばつ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC2723<U extends PublicKey, R extends PrivateKey> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f10212;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Provider f10213;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f10214;

    public AbstractC2723(String str, String str2, Class<R> cls) {
        this.f10214 = str;
        this.f10212 = str2;
        this.f10213 = null;
    }

    public AbstractC2723(String str, String str2, Class<R> cls, Provider provider) {
        this.f10214 = str;
        this.f10212 = str2;
        this.f10213 = provider;
    }

    /* renamed from: 〺つふすそ */
    public abstract byte[] mo4656(byte[] bArr);

    /* renamed from: くし〴〺ぅ */
    public abstract List<CertificateDecoder> mo4657();

    /* renamed from: げつ〴ぬぐ */
    public abstract U mo4658(byte[] bArr);
}
