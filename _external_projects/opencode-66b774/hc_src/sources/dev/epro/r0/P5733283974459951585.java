package dev.epro.r0;

import ads_mobile_sdk.n30;
import ads_mobile_sdk.rw0;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P5733283974459951585 implements L9201360080215238538, S76089685918653100, R12081023847482212386, P6802326504044700406, B4259731004323267459, G3906313092368799651 {
    public static P5733283974459951585 b;
    public final /* synthetic */ byte a;

    public /* synthetic */ P5733283974459951585(byte b2) {
        this.a = b2;
    }

    public static Uri b(Uri uri, String str) {
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        int W = M8927913404651150384.W(uri2, "&adurl", 0, false, 6);
        if (W == -1) {
            W = M8927913404651150384.W(uri2, "?adurl=", 0, false, 6);
        }
        if (W == -1) {
            Uri build = uri.buildUpon().appendQueryParameter("ms", str).build();
            build.getClass();
            return build;
        }
        StringBuilder sb = new StringBuilder(str.length() + uri2.length() + 2 + 2);
        int i = W + 1;
        sb.append(uri2.substring(0, i));
        sb.append("ms=");
        sb.append(str);
        sb.append("&");
        sb.append(uri2.substring(i));
        return Uri.parse(sb.toString());
    }

    public static String d(Context context) {
        String string;
        context.getClass();
        AtomicReference atomicReference = rw0.g;
        String str = (String) atomicReference.get();
        if (str != null) {
            return str;
        }
        String str2 = "B3EEABB8EE11C2BE770B684D95219ECB";
        if (!Y2666402291564931474.f() && (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) != null && string.length() != 0) {
            str2 = j(string);
        }
        atomicReference.set(str2);
        return (String) atomicReference.get();
    }

    public static boolean e(Context context, String str) {
        context.getClass();
        return context.checkSelfPermission(str) == 0;
    }

    public static String f(String str, String str2) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        Matcher matcher = compile.matcher(str2);
        matcher.getClass();
        U12307647644992999381 l = U8836654130139556418.l(matcher, 0, str2);
        if (l == null) {
            return null;
        }
        Collection a = l.a();
        U2917286957277769200 u2917286957277769200 = (U2917286957277769200) a;
        if (u2917286957277769200.a() < 2) {
            return null;
        }
        int a2 = u2917286957277769200.a();
        for (int i = 1; i < a2; i++) {
            A10468597346719636873 a10468597346719636873 = (A10468597346719636873) a;
            if (!M8927913404651150384.Y((CharSequence) a10468597346719636873.get(i))) {
                return (String) a10468597346719636873.get(i);
            }
        }
        return null;
    }

    public static String h(String str) {
        X13869420807587484607 b2;
        str.getClass();
        U12307647644992999381 b3 = H5336160545165318150.b(rw0.i, str);
        if (b3 == null || (b2 = b3.c.b(1)) == null) {
            return null;
        }
        return b2.a;
    }

    public static String j(String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bytes = str.getBytes(F16059529287866721367.a);
                bytes.getClass();
                messageDigest.update(bytes);
                return String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    @Override // dev.epro.r0.L9201360080215238538
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            dev.epro.r0.W18281264110575237506 r4 = (dev.epro.r0.W18281264110575237506) r4
            dev.epro.r0.W18281264110575237506 r5 = (dev.epro.r0.W18281264110575237506) r5
            r3 = 0
            r0 = 1
            if (r4 == 0) goto L2d
            if (r5 == 0) goto L2d
            dev.epro.r0.N1420218926656397722 r1 = r4.a
            dev.epro.r0.N1420218926656397722 r2 = r5.a
            if (r1 != r2) goto L3b
            dev.epro.r0.S16571168858015125610 r1 = r4.b
            dev.epro.r0.S16571168858015125610 r2 = r5.b
            boolean r1 = dev.epro.r0.S10823041268949770285.t(r1, r2)
            if (r1 == 0) goto L3b
            boolean r1 = r4.c
            boolean r2 = r5.c
            if (r1 != r2) goto L3b
            boolean r1 = r4.d
            boolean r2 = r5.d
            if (r1 != r2) goto L3b
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 != r5) goto L3b
            goto L3a
        L2d:
            if (r4 != 0) goto L31
            r4 = r0
            goto L32
        L31:
            r4 = r3
        L32:
            if (r5 != 0) goto L36
            r5 = r0
            goto L37
        L36:
            r5 = r3
        L37:
            r4 = r4 ^ r5
            if (r4 != 0) goto L3b
        L3a:
            return r0
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P5733283974459951585.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r5, dev.epro.r0.F4096073349764486348 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.mw0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.mw0 r0 = (ads_mobile_sdk.mw0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.mw0 r0 = new ads_mobile_sdk.mw0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.a
            int r8 = r0.c
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L2e
            if (r8 != r2) goto L28
            dev.epro.r0.E17665849472693074628.k(r4)     // Catch: dev.epro.r0.P2480554073835519965 -> L26
            goto L42
        L26:
            r4 = move-exception
            goto L48
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r1
        L2e:
            dev.epro.r0.E17665849472693074628.k(r4)
            dev.epro.r0.X15965119713728731855 r4 = new dev.epro.r0.X15965119713728731855     // Catch: dev.epro.r0.P2480554073835519965 -> L26
            r8 = 2
            r4.<init>(r7, r1, r8)     // Catch: dev.epro.r0.P2480554073835519965 -> L26
            r0.c = r2     // Catch: dev.epro.r0.P2480554073835519965 -> L26
            java.lang.Object r4 = dev.epro.r0.V16504496955554646429.r(r5, r4, r0)     // Catch: dev.epro.r0.P2480554073835519965 -> L26
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L42
            return r5
        L42:
            ads_mobile_sdk.xu0 r5 = new ads_mobile_sdk.xu0     // Catch: dev.epro.r0.P2480554073835519965 -> L26
            r5.<init>(r4)     // Catch: dev.epro.r0.P2480554073835519965 -> L26
            return r5
        L48:
            ads_mobile_sdk.yu0 r5 = new ads_mobile_sdk.yu0
            r5.<init>(r4, r2)
            ads_mobile_sdk.th3 r6 = ads_mobile_sdk.ji3.a()
            ads_mobile_sdk.cc2 r7 = r6.e()
            r8 = 0
            r7.m = r8
            r6.a(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P5733283974459951585.c(long, dev.epro.r0.F4096073349764486348, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.G3906313092368799651
    public N17310361809908093775 g(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // dev.epro.r0.G3906313092368799651
    public boolean i(Class cls) {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // dev.epro.r0.B4259731004323267459
    public Object a(int i) {
        n30 n30Var;
        n30 n30Var2 = n30.UNSPECIFIED;
        if (i == 0) {
            n30Var = n30Var2;
        } else if (i == 1) {
            n30Var = n30.TAILORED_WARNING_CT_BASE;
        } else if (i == 2) {
            n30Var = n30.TAILORED_WARNING_CT;
        } else if (i == 3) {
            n30Var = n30.TAILORED_WARNING_CT_ACCOUNT_INFO;
        } else if (i != 4) {
            n30Var = i != 5 ? null : n30.TAILORED_WARNING_SUSPICIOUS;
        } else {
            n30Var = n30.TAILORED_WARNING_SUSPICIOUS_BASE;
        }
        return n30Var == null ? n30Var2 : n30Var;
    }

    @Override // dev.epro.r0.P6802326504044700406
    public /* synthetic */ Object a() {
        return new P8755783434649014957("StandardIntegrity");
    }
}
