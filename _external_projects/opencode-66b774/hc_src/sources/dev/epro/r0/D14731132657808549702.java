package dev.epro.r0;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.io.InputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D14731132657808549702 implements V14977941268796428117, H3430986877638506198 {
    public static final D14731132657808549702 A;
    public static final D14731132657808549702 A0;
    public static final D14731132657808549702 B;
    public static final D14731132657808549702 B0;
    public static final D14731132657808549702 C;
    public static final D14731132657808549702 D;
    public static final D14731132657808549702 E;
    public static final D14731132657808549702 F;
    public static final D14731132657808549702 G;
    public static final D14731132657808549702 H;
    public static final D14731132657808549702 I;
    public static final D14731132657808549702 J;
    public static final D14731132657808549702 K;
    public static final D14731132657808549702 L;
    public static final D14731132657808549702 M;
    public static final D14731132657808549702 N;
    public static final D14731132657808549702 O;
    public static final D14731132657808549702 P;
    public static final D14731132657808549702 Q;
    public static final D14731132657808549702 R;
    public static final D14731132657808549702 S;
    public static final D14731132657808549702 T;
    public static final D14731132657808549702 U;
    public static final D14731132657808549702 V;
    public static final D14731132657808549702 W;
    public static final D14731132657808549702 X;
    public static final D14731132657808549702 Y;
    public static final D14731132657808549702 Z;
    public static final D14731132657808549702 a0;
    public static final D14731132657808549702 b0;
    public static final D14731132657808549702 c;
    public static final D14731132657808549702 c0;
    public static final D14731132657808549702 d;
    public static final D14731132657808549702 d0;
    public static final D14731132657808549702 e;
    public static final D14731132657808549702 e0;
    public static final D14731132657808549702 f;
    public static final D14731132657808549702 f0;
    public static final D14731132657808549702 g;
    public static final D14731132657808549702 g0;
    public static final D14731132657808549702 h;
    public static final D14731132657808549702 h0;
    public static final D14731132657808549702 i;
    public static final D14731132657808549702 i0;
    public static final D14731132657808549702 j;
    public static final D14731132657808549702 j0;
    public static final D14731132657808549702 k;
    public static final D14731132657808549702 k0;
    public static final D14731132657808549702 l;
    public static final D14731132657808549702 l0;
    public static final D14731132657808549702 m;
    public static final D14731132657808549702 m0;
    public static final D14731132657808549702 n;
    public static final D14731132657808549702 n0;

    /* renamed from: o, reason: collision with root package name */
    public static final D14731132657808549702 f196o;
    public static final D14731132657808549702 o0;
    public static final D14731132657808549702 p;
    public static final D14731132657808549702 p0;
    public static final D14731132657808549702 q;
    public static final D14731132657808549702 q0;
    public static final D14731132657808549702 r;
    public static final D14731132657808549702 r0;
    public static final D14731132657808549702 s;
    public static final D14731132657808549702 s0;
    public static final D14731132657808549702 t;
    public static final D14731132657808549702 t0;
    public static final D14731132657808549702 u;
    public static final D14731132657808549702 u0;
    public static final D14731132657808549702 v;
    public static final D14731132657808549702 v0;
    public static final D14731132657808549702 w;
    public static final D14731132657808549702 w0;
    public static final D14731132657808549702 x;
    public static final D14731132657808549702 x0;
    public static final D14731132657808549702 y;
    public static final D14731132657808549702 y0;
    public static final D14731132657808549702 z;
    public static final D14731132657808549702 z0;
    public final /* synthetic */ byte a;
    public String b;

    static {
        byte b = 0;
        c = new D14731132657808549702("TINK", b);
        d = new D14731132657808549702("CRUNCHY", b);
        e = new D14731132657808549702("LEGACY", b);
        f = new D14731132657808549702("NO_PREFIX", b);
        byte b2 = 1;
        g = new D14731132657808549702("SHA1", b2);
        h = new D14731132657808549702("SHA224", b2);
        i = new D14731132657808549702("SHA256", b2);
        j = new D14731132657808549702("SHA384", b2);
        k = new D14731132657808549702("SHA512", b2);
        byte b3 = 2;
        l = new D14731132657808549702("TINK", b3);
        m = new D14731132657808549702("CRUNCHY", b3);
        n = new D14731132657808549702("NO_PREFIX", b3);
        byte b4 = 3;
        f196o = new D14731132657808549702("TINK", b4);
        p = new D14731132657808549702("CRUNCHY", b4);
        q = new D14731132657808549702("NO_PREFIX", b4);
        byte b5 = 4;
        r = new D14731132657808549702("TINK", b5);
        s = new D14731132657808549702("CRUNCHY", b5);
        t = new D14731132657808549702("NO_PREFIX", b5);
        byte b6 = 5;
        u = new D14731132657808549702("TINK", b6);
        v = new D14731132657808549702("CRUNCHY", b6);
        w = new D14731132657808549702("NO_PREFIX", b6);
        byte b7 = 6;
        x = new D14731132657808549702("TINK", b7);
        y = new D14731132657808549702("CRUNCHY", b7);
        z = new D14731132657808549702("NO_PREFIX", b7);
        byte b8 = 7;
        A = new D14731132657808549702("SHA256", b8);
        B = new D14731132657808549702("SHA384", b8);
        C = new D14731132657808549702("SHA512", b8);
        byte b9 = 8;
        D = new D14731132657808549702("IEEE_P1363", b9);
        E = new D14731132657808549702("DER", b9);
        byte b10 = 9;
        F = new D14731132657808549702("TINK", b10);
        G = new D14731132657808549702("CRUNCHY", b10);
        H = new D14731132657808549702("LEGACY", b10);
        I = new D14731132657808549702("NO_PREFIX", b10);
        byte b11 = 10;
        J = new D14731132657808549702("TINK", b11);
        K = new D14731132657808549702("CRUNCHY", b11);
        L = new D14731132657808549702("LEGACY", b11);
        M = new D14731132657808549702("NO_PREFIX", b11);
        byte b12 = 11;
        N = new D14731132657808549702("TINK", b12);
        O = new D14731132657808549702("CRUNCHY", b12);
        P = new D14731132657808549702("LEGACY", b12);
        Q = new D14731132657808549702("NO_PREFIX", b12);
        byte b13 = 12;
        R = new D14731132657808549702("ENABLED", b13);
        S = new D14731132657808549702("DISABLED", b13);
        T = new D14731132657808549702("DESTROYED", b13);
        byte b14 = 13;
        U = new D14731132657808549702("TINK", b14);
        V = new D14731132657808549702("NO_PREFIX", b14);
        byte b15 = 14;
        W = new D14731132657808549702("ASSUME_AES_GCM", b15);
        X = new D14731132657808549702("ASSUME_XCHACHA20POLY1305", b15);
        Y = new D14731132657808549702("ASSUME_CHACHA20POLY1305", b15);
        Z = new D14731132657808549702("ASSUME_AES_CTR_HMAC", b15);
        a0 = new D14731132657808549702("ASSUME_AES_EAX", b15);
        b0 = new D14731132657808549702("ASSUME_AES_GCM_SIV", b15);
        byte b16 = 15;
        c0 = new D14731132657808549702("TINK", b16);
        d0 = new D14731132657808549702("NO_PREFIX", b16);
        byte b17 = 16;
        e0 = new D14731132657808549702("UNKNOWN_KEYMATERIAL", b17);
        f0 = new D14731132657808549702("SYMMETRIC", b17);
        g0 = new D14731132657808549702("ASYMMETRIC_PRIVATE", b17);
        h0 = new D14731132657808549702("ASYMMETRIC_PUBLIC", b17);
        i0 = new D14731132657808549702("REMOTE", b17);
        byte b18 = 17;
        j0 = new D14731132657808549702("UNKNOWN_PREFIX", b18);
        k0 = new D14731132657808549702("TINK", b18);
        l0 = new D14731132657808549702("LEGACY", b18);
        m0 = new D14731132657808549702("RAW", b18);
        n0 = new D14731132657808549702("CRUNCHY", b18);
        o0 = new D14731132657808549702("WITH_ID_REQUIREMENT", b18);
        byte b19 = 18;
        p0 = new D14731132657808549702("TINK", b19);
        q0 = new D14731132657808549702("CRUNCHY", b19);
        r0 = new D14731132657808549702("LEGACY", b19);
        s0 = new D14731132657808549702("NO_PREFIX", b19);
        byte b20 = 19;
        t0 = new D14731132657808549702("TINK", b20);
        u0 = new D14731132657808549702("CRUNCHY", b20);
        v0 = new D14731132657808549702("LEGACY", b20);
        w0 = new D14731132657808549702("NO_PREFIX", b20);
        byte b21 = 20;
        x0 = new D14731132657808549702("TINK", b21);
        y0 = new D14731132657808549702("NO_PREFIX", b21);
        byte b22 = 21;
        z0 = new D14731132657808549702("TINK", b22);
        A0 = new D14731132657808549702("CRUNCHY", b22);
        B0 = new D14731132657808549702("NO_PREFIX", b22);
    }

    public static final int b(InputStream inputStream, byte[] bArr) {
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                Q11088980322693754445.h("Premature connection close");
                return 0;
            }
            int i4 = i2 + 1;
            bArr[i2] = (byte) read;
            if (read == 13) {
                i2 = i4;
                z2 = true;
            } else {
                if (read == 10) {
                    return i3;
                }
                if (z2) {
                    Q11088980322693754445.h("Malformed line sent by the server, the line does not end correctly.");
                    return 0;
                }
                i3++;
                if (i4 >= bArr.length) {
                    Q11088980322693754445.h("The server sent a too long line: ".concat(new String(bArr, "ISO-8859-1")));
                    return 0;
                }
                i2 = i4;
            }
        }
    }

    @Override // dev.epro.r0.H3430986877638506198
    public Object f() {
        HandlerThread handlerThread = new HandlerThread(this.b, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    @Override // dev.epro.r0.V14977941268796428117
    public boolean g(CharSequence charSequence, int i2, int i3, D14027398382627356533 d14027398382627356533) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.b)) {
            return true;
        }
        d14027398382627356533.c = (d14027398382627356533.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 4:
                return this.b;
            case 5:
                return this.b;
            case 6:
                return this.b;
            case 7:
                return this.b;
            case 8:
                return this.b;
            case 9:
                return this.b;
            case 10:
                return this.b;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b;
            case 14:
                return this.b;
            case 15:
                return this.b;
            case 16:
                return this.b;
            case 17:
                return this.b;
            case 18:
                return this.b;
            case 19:
                return this.b;
            case 20:
                return this.b;
            case 21:
                return this.b;
            case 22:
            case 23:
            case 24:
            default:
                return super.toString();
            case 25:
                return "<" + this.b + '>';
        }
    }

    public /* synthetic */ D14731132657808549702(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // dev.epro.r0.V14977941268796428117
    public Object a() {
        return this;
    }
}
