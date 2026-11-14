package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.F16059529287866721367;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.Z13168519540281190457;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class c6 {
    public final File a;
    public volatile boolean b;

    public c6(Context context) {
        context.getClass();
        this.a = new File(context.getCacheDir(), "gma_ad_responses");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #2 {all -> 0x0025, blocks: (B:3:0x000b, B:6:0x0027, B:8:0x002d, B:9:0x006d, B:11:0x0071, B:16:0x0035, B:18:0x003b, B:20:0x0043, B:22:0x0049, B:24:0x0053, B:25:0x005d, B:29:0x0064, B:30:0x0011, B:32:0x001d), top: B:2:0x000b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.M16184408391440927034 a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            ads_mobile_sdk.wv0 r0 = ads_mobile_sdk.wv0.CUI_NAME_PERSISTENT_CACHE_FILE_READ
            java.util.WeakHashMap r1 = ads_mobile_sdk.ji3.a
            dev.epro.r0.O2161699089510411363 r1 = dev.epro.r0.O2161699089510411363.a
            r2 = 1
            ads_mobile_sdk.th3 r0 = ads_mobile_sdk.ji3.a(r0, r1, r2)
            boolean r1 = r4.b     // Catch: java.lang.Throwable -> L25
            r3 = 0
            if (r1 == 0) goto L11
            goto L27
        L11:
            java.io.File r1 = r4.a     // Catch: java.lang.Throwable -> L25
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> L25
            r4.b = r1     // Catch: java.lang.Throwable -> L25
            boolean r1 = r4.b     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L27
            ads_mobile_sdk.tu0 r4 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "Cache directory not found"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L25
            goto L6d
        L25:
            r4 = move-exception
            goto L7b
        L27:
            java.io.File r4 = r4.b(r5)     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L35
            ads_mobile_sdk.tu0 r4 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "Invalid filename"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L25
            goto L6d
        L35:
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto L43
            ads_mobile_sdk.tu0 r4 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "File not found"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L25
            goto L6d
        L43:
            java.lang.String r4 = dev.epro.r0.Z860808776098365610.L(r4)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L5b
            if (r6 == 0) goto L5d
            java.lang.String r5 = a(r4)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L5b
            boolean r5 = dev.epro.r0.S10823041268949770285.t(r5, r6)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L5b
            if (r5 != 0) goto L5d
            ads_mobile_sdk.tu0 r4 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L5b
            java.lang.String r5 = "Checksum mismatch for file"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L5b
            goto L6d
        L5b:
            r4 = move-exception
            goto L64
        L5d:
            ads_mobile_sdk.xu0 r5 = new ads_mobile_sdk.xu0     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L5b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L5b
        L62:
            r4 = r5
            goto L6d
        L64:
            ads_mobile_sdk.qu0 r5 = new ads_mobile_sdk.qu0     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "Failed to read file"
            r1 = 2
            r5.<init>(r4, r3, r6, r1)     // Catch: java.lang.Throwable -> L25
            goto L62
        L6d:
            boolean r5 = r4 instanceof ads_mobile_sdk.pu0     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L77
            r5 = r4
            ads_mobile_sdk.pu0 r5 = (ads_mobile_sdk.pu0) r5     // Catch: java.lang.Throwable -> L25
            ads_mobile_sdk.zi3.a(r5, r3)     // Catch: java.lang.Throwable -> L25
        L77:
            r0.close()
            return r4
        L7b:
            r0.b(r4)     // Catch: java.lang.Throwable -> L8e
            boolean r5 = r4 instanceof dev.epro.r0.N340633841638932414     // Catch: java.lang.Throwable -> L8e
            if (r5 != 0) goto Lb3
            boolean r5 = r4 instanceof dev.epro.r0.P2480554073835519965     // Catch: java.lang.Throwable -> L8e
            if (r5 != 0) goto L90
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L8e
            if (r5 != 0) goto L90
            r0.a(r4)     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r4 = move-exception
            goto Lb4
        L90:
            boolean r5 = r4 instanceof dev.epro.r0.P2480554073835519965     // Catch: java.lang.Throwable -> L8e
            if (r5 != 0) goto Lab
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L8e
            if (r5 != 0) goto La3
            boolean r5 = r4 instanceof ads_mobile_sdk.dv0     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto L9d
            throw r4     // Catch: java.lang.Throwable -> L8e
        L9d:
            ads_mobile_sdk.iu0 r5 = new ads_mobile_sdk.iu0     // Catch: java.lang.Throwable -> L8e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L8e
            throw r5     // Catch: java.lang.Throwable -> L8e
        La3:
            ads_mobile_sdk.du0 r5 = new ads_mobile_sdk.du0     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4     // Catch: java.lang.Throwable -> L8e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L8e
            throw r5     // Catch: java.lang.Throwable -> L8e
        Lab:
            ads_mobile_sdk.lw0 r5 = new ads_mobile_sdk.lw0     // Catch: java.lang.Throwable -> L8e
            dev.epro.r0.P2480554073835519965 r4 = (dev.epro.r0.P2480554073835519965) r4     // Catch: java.lang.Throwable -> L8e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L8e
            throw r5     // Catch: java.lang.Throwable -> L8e
        Lb3:
            throw r4     // Catch: java.lang.Throwable -> L8e
        Lb4:
            throw r4     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r5 = move-exception
            dev.epro.r0.Z1953481206310471956.z(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c6.a(java.lang.String, java.lang.String):dev.epro.r0.M16184408391440927034");
    }

    public final M16184408391440927034 b(String str, String str2) {
        M16184408391440927034 tu0Var;
        M16184408391440927034 qu0Var;
        tu0 tu0Var2;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        str2.getClass();
        wv0 wv0Var = wv0.CUI_NAME_PERSISTENT_CACHE_FILE_WRITE;
        WeakHashMap weakHashMap = ji3.a;
        th3 a = ji3.a(wv0Var, O2161699089510411363.a, true);
        try {
            if (this.b) {
                tu0Var = new xu0(o9245300239821758723);
            } else {
                if (!this.b) {
                    this.b = this.a.exists();
                    if (!this.b && !this.a.mkdirs()) {
                        tu0Var = new tu0("Failed to create cache directory", 1);
                    }
                }
                this.b = true;
                tu0Var = new xu0(o9245300239821758723);
            }
            int i = 0;
            if (tu0Var instanceof pu0) {
                qu0Var = (pu0) tu0Var;
            } else {
                String a2 = a(str2);
                if (a2 == null) {
                    qu0Var = new tu0("Failed to calculate checksum", 1);
                } else {
                    File b = b(str.concat(".tmp"));
                    if (b == null) {
                        tu0Var2 = new tu0("Invalid filename", 1);
                    } else {
                        File b2 = b(str);
                        if (b2 == null) {
                            tu0Var2 = new tu0("Invalid filename", 1);
                        } else {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(b);
                                try {
                                    byte[] bytes = str2.getBytes(F16059529287866721367.a);
                                    bytes.getClass();
                                    fileOutputStream.write(bytes);
                                    fileOutputStream.close();
                                    if (b.renameTo(b2)) {
                                        qu0Var = new xu0(a2);
                                    } else {
                                        b.delete();
                                        qu0Var = new tu0("Failed to rename temp file", 1);
                                    }
                                } finally {
                                }
                            } catch (IOException e) {
                                b.delete();
                                qu0Var = new qu0(e, i, "Failed to write to temp file", 2);
                            }
                        }
                    }
                    qu0Var = tu0Var2;
                }
            }
            if (qu0Var instanceof pu0) {
                zi3.a((pu0) qu0Var, false);
            }
            a.close();
            return qu0Var;
        } catch (Throwable th) {
            try {
                a.b(th);
                if (th instanceof N340633841638932414) {
                    throw th;
                }
                if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                    a.a(th);
                }
                if (th instanceof P2480554073835519965) {
                    throw new lw0(th);
                }
                if (th instanceof CancellationException) {
                    throw new du0(th);
                }
                if (th instanceof dv0) {
                    throw th;
                }
                throw new iu0(th);
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r2.b == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a() {
        /*
            r2 = this;
            dev.epro.r0.O2161699089510411363 r0 = dev.epro.r0.O2161699089510411363.a
            boolean r1 = r2.b
            if (r1 == 0) goto L7
            goto L14
        L7:
            java.io.File r1 = r2.a
            boolean r1 = r1.exists()
            r2.b = r1
            boolean r1 = r2.b
            if (r1 != 0) goto L14
            goto L21
        L14:
            java.io.File r2 = r2.a
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L21
            java.util.List r2 = dev.epro.r0.O5378677881740157249.U0(r2)
            return r2
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c6.a():java.util.List");
    }

    public static String a(String str) {
        str.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(F16059529287866721367.a);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            return sb.toString();
        } catch (Exception e) {
            zi3.a(4, "Failed to calculate checksum", e);
            return null;
        }
    }

    public final File b(String str) {
        File file = this.a;
        File file2 = new File(file, str);
        try {
            String canonicalPath = file2.getCanonicalPath();
            canonicalPath.getClass();
            String canonicalPath2 = file.getCanonicalPath();
            canonicalPath2.getClass();
            if (Z13168519540281190457.F(canonicalPath, canonicalPath2, false)) {
                return file2;
            }
            zi3.a(6, "Path traversal detected: " + str, null);
            return null;
        } catch (IOException e) {
            zi3.a(4, "Failed to resolve canonical path for " + str, e);
            return null;
        }
    }
}
