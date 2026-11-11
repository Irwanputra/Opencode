package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import p000.p001.C0629;

/* renamed from: 〳ぜぞぜべっ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0582 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final C0582 f4210;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final C0582 f4211;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final C0710[] f4212;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final C0582 f4213;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean f4214;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    @Nullable
    public final String[] f4215;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean f4216;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    @Nullable
    public final String[] f4217;

    /* renamed from: 〳ぜぞぜべっ.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0583 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        @Nullable
        public String[] f4218;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        @Nullable
        public String[] f4219;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f4220;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f4221;

        public C0583(C0582 c0582) {
            this.f4220 = c0582.f4216;
            this.f4218 = c0582.f4215;
            this.f4219 = c0582.f4217;
            this.f4221 = c0582.f4214;
        }

        public C0583(boolean z) {
            this.f4220 = z;
        }

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0583 m1719(C0710... c0710Arr) {
            if (!this.f4220) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[c0710Arr.length];
            for (int i = 0; i < c0710Arr.length; i++) {
                strArr[i] = c0710Arr[i].f4751;
            }
            m1721(strArr);
            return this;
        }

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public C0583 m1720(String... strArr) {
            if (!this.f4220) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f4219 = (String[]) strArr.clone();
            return this;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C0583 m1721(String... strArr) {
            if (!this.f4220) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f4218 = (String[]) strArr.clone();
            return this;
        }

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C0583 m1722(EnumC0724... enumC0724Arr) {
            if (!this.f4220) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[enumC0724Arr.length];
            for (int i = 0; i < enumC0724Arr.length; i++) {
                strArr[i] = enumC0724Arr[i].f4805;
            }
            m1720(strArr);
            return this;
        }
    }

    static {
        C0710[] c0710Arr = {C0710.f4735, C0710.f4746, C0710.f4740, C0710.f4738, C0710.f4743, C0710.f4739, C0710.f4748, C0710.f4736, C0710.f4730, C0710.f4749, C0710.f4741, C0710.f4744, C0710.f4747};
        f4212 = c0710Arr;
        C0583 c0583 = new C0583(true);
        c0583.m1719(c0710Arr);
        EnumC0724 enumC0724 = EnumC0724.TLS_1_0;
        c0583.m1722(EnumC0724.TLS_1_3, EnumC0724.TLS_1_2, EnumC0724.TLS_1_1, enumC0724);
        if (!c0583.f4220) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0583.f4221 = true;
        C0582 c0582 = new C0582(c0583);
        f4213 = c0582;
        C0583 c05832 = new C0583(c0582);
        c05832.m1722(enumC0724);
        if (!c05832.f4220) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c05832.f4221 = true;
        f4211 = new C0582(c05832);
        f4210 = new C0582(new C0583(false));
    }

    public C0582(C0583 c0583) {
        this.f4216 = c0583.f4220;
        this.f4215 = c0583.f4218;
        this.f4217 = c0583.f4219;
        this.f4214 = c0583.f4221;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0582)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0582 c0582 = (C0582) obj;
        boolean z = this.f4216;
        if (z != c0582.f4216) {
            return false;
        }
        return !z || (Arrays.equals(this.f4215, c0582.f4215) && Arrays.equals(this.f4217, c0582.f4217) && this.f4214 == c0582.f4214);
    }

    public int hashCode() {
        if (this.f4216) {
            return ((((527 + Arrays.hashCode(this.f4215)) * 31) + Arrays.hashCode(this.f4217)) * 31) + (!this.f4214 ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        List list;
        if (!this.f4216) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f4215;
        List list2 = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr != null) {
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str3 : strArr) {
                    arrayList.add(C0710.m1972(str3));
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = "[all enabled]";
        }
        String[] strArr2 = this.f4217;
        if (strArr2 != null) {
            if (strArr2 != null) {
                ArrayList arrayList2 = new ArrayList(strArr2.length);
                for (String str4 : strArr2) {
                    arrayList2.add(EnumC0724.m1983(str4));
                }
                list2 = Collections.unmodifiableList(arrayList2);
            }
            str2 = list2.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f4214 + ")";
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m1718(SSLSocket sSLSocket) {
        if (!this.f4216) {
            return false;
        }
        String[] strArr = this.f4217;
        if (strArr != null && !C0629.m1813(C0629.f4345, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f4215;
        return strArr2 == null || C0629.m1813(C0710.f4731, strArr2, sSLSocket.getEnabledCipherSuites());
    }
}
