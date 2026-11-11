package p000.p001.p007;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p000.C0582;
import p000.C0706;
import p000.C0710;
import p000.p001.AbstractC0631;
import p000.p001.C0629;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.なぎぱいぢぎ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0642 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f4367 = 0;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f4368;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final List<C0582> f4369;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f4370;

    public C0642(List<C0582> list) {
        this.f4369 = list;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public C0582 m1846(SSLSocket sSLSocket) {
        C0582 c0582;
        boolean z;
        int i = this.f4367;
        int size = this.f4369.size();
        while (true) {
            if (i >= size) {
                c0582 = null;
                break;
            }
            c0582 = this.f4369.get(i);
            if (c0582.m1718(sSLSocket)) {
                this.f4367 = i + 1;
                break;
            }
            i++;
        }
        if (c0582 == null) {
            StringBuilder m4207 = C2098.m4207("Unable to find acceptable protocols. isFallback=");
            m4207.append(this.f4370);
            m4207.append(", modes=");
            m4207.append(this.f4369);
            m4207.append(", supported protocols=");
            m4207.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(m4207.toString());
        }
        int i2 = this.f4367;
        while (true) {
            if (i2 >= this.f4369.size()) {
                z = false;
                break;
            }
            if (this.f4369.get(i2).m1718(sSLSocket)) {
                z = true;
                break;
            }
            i2++;
        }
        this.f4368 = z;
        AbstractC0631 abstractC0631 = AbstractC0631.f4356;
        boolean z2 = this.f4370;
        ((C0706.C0708) abstractC0631).getClass();
        String[] m1815 = c0582.f4215 != null ? C0629.m1815(C0710.f4731, sSLSocket.getEnabledCipherSuites(), c0582.f4215) : sSLSocket.getEnabledCipherSuites();
        String[] m18152 = c0582.f4217 != null ? C0629.m1815(C0629.f4345, sSLSocket.getEnabledProtocols(), c0582.f4217) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Comparator<String> comparator = C0710.f4731;
        byte[] bArr = C0629.f4347;
        int length = supportedCipherSuites.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (((C0710.C0711) comparator).compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z2 && i3 != -1) {
            String str = supportedCipherSuites[i3];
            int length2 = m1815.length + 1;
            String[] strArr = new String[length2];
            System.arraycopy(m1815, 0, strArr, 0, m1815.length);
            strArr[length2 - 1] = str;
            m1815 = strArr;
        }
        boolean z3 = c0582.f4216;
        if (!z3) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (m1815.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        String[] strArr2 = (String[]) m1815.clone();
        if (!z3) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (m18152.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        String[] strArr3 = (String[]) m18152.clone();
        if (strArr3 != null) {
            sSLSocket.setEnabledProtocols(strArr3);
        }
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        return c0582;
    }
}
