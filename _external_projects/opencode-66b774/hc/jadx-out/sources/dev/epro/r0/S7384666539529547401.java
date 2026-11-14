package dev.epro.r0;

import java.io.OutputStream;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S7384666539529547401 {
    public InetAddress a;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;

    public S7384666539529547401(int i, InetAddress inetAddress, int i2) {
        this.e = null;
        this.f = null;
        this.d = i;
        this.a = inetAddress;
        this.c = i2;
    }

    public static final String a(byte[] bArr) {
        int i = bArr[0] & 255;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String string = sb.toString();
        for (int i2 = 1; i2 < 4; i2++) {
            string = string + "." + (bArr[i2] & 255);
        }
        return string;
    }

    public abstract void b(OutputStream outputStream);

    public String toString() {
        int i = this.b;
        int i2 = this.d;
        String strValueOf = String.valueOf(this.a);
        int i3 = this.c;
        String str = this.f;
        StringBuilder sbP = E12098517352909843120.p(i, i2, "Proxy Message:\nVersion:", "\nCommand:", "\nIP:     ");
        X2485016533998461232.k(sbP, strValueOf, "\nPort:   ", i3, "\nUser:   ");
        return G6547577305291411977.u(sbP, str, "\n");
    }

    public S7384666539529547401() {
        this.a = null;
        this.e = null;
        this.f = null;
    }
}
