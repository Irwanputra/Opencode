package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class c6 {
    public final java.io.File a;
    public volatile boolean b;

    public c6(android.content.Context context) {
        context.getClass();
        this.a = new java.io.File(context.getCacheDir(), "gma_ad_responses");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #2 {all -> 0x0025, blocks: (B:3:0x000b, B:11:0x0027, B:13:0x002d, B:28:0x006d, B:30:0x0071, B:14:0x0035, B:16:0x003b, B:18:0x0043, B:20:0x0049, B:22:0x0053, B:25:0x005d, B:27:0x0064, B:6:0x0011, B:8:0x001d), top: B:63:0x000b, inners: #1 }] */
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

    public final dev.epro.r0.M16184408391440927034 b(java.lang.String str, java.lang.String str2) {
        dev.epro.r0.M16184408391440927034 tu0Var;
        java.io.File fileB;
        dev.epro.r0.M16184408391440927034 qu0Var;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        str2.getClass();
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_PERSISTENT_CACHE_FILE_WRITE;
        java.util.WeakHashMap weakHashMap = ads_mobile_sdk.ji3.a;
        ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, dev.epro.r0.O2161699089510411363.a, true);
        try {
            if (this.b) {
                tu0Var = new ads_mobile_sdk.xu0(o9245300239821758723);
            } else {
                if (!this.b) {
                    this.b = this.a.exists();
                    if (!this.b && !this.a.mkdirs()) {
                        tu0Var = new ads_mobile_sdk.tu0("Failed to create cache directory", 1);
                    }
                }
                this.b = true;
                tu0Var = new ads_mobile_sdk.xu0(o9245300239821758723);
            }
            if (tu0Var instanceof ads_mobile_sdk.pu0) {
                qu0Var = (ads_mobile_sdk.pu0) tu0Var;
            } else {
                java.lang.String strA = a(str2);
                if (strA == null) {
                    qu0Var = new ads_mobile_sdk.tu0("Failed to calculate checksum", 1);
                } else {
                    java.io.File fileB2 = b(str.concat(".tmp"));
                    if (fileB2 == null || (fileB = b(str)) == null) {
                        ads_mobile_sdk.tu0 tu0Var2 = new ads_mobile_sdk.tu0("Invalid filename", 1);
                        qu0Var = tu0Var2;
                    } else {
                        try {
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileB2);
                            try {
                                byte[] bytes = str2.getBytes(dev.epro.r0.F16059529287866721367.a);
                                bytes.getClass();
                                fileOutputStream.write(bytes);
                                fileOutputStream.close();
                                if (fileB2.renameTo(fileB)) {
                                    qu0Var = new ads_mobile_sdk.xu0(strA);
                                } else {
                                    fileB2.delete();
                                    qu0Var = new ads_mobile_sdk.tu0("Failed to rename temp file", 1);
                                }
                            } finally {
                            }
                        } catch (java.io.IOException e) {
                            fileB2.delete();
                            qu0Var = new ads_mobile_sdk.qu0(e, 0, "Failed to write to temp file", 2);
                        }
                    }
                }
            }
            if (qu0Var instanceof ads_mobile_sdk.pu0) {
                ads_mobile_sdk.zi3.a((ads_mobile_sdk.pu0) qu0Var, false);
            }
            th3VarA.close();
            return qu0Var;
        } catch (java.lang.Throwable th) {
            try {
                th3VarA.b(th);
                if (th instanceof dev.epro.r0.N340633841638932414) {
                    throw th;
                }
                if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                    th3VarA.a(th);
                }
                if (th instanceof dev.epro.r0.P2480554073835519965) {
                    throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                }
                if (th instanceof java.util.concurrent.CancellationException) {
                    throw new ads_mobile_sdk.du0(th);
                }
                if (th instanceof ads_mobile_sdk.dv0) {
                    throw th;
                }
                throw new ads_mobile_sdk.iu0(th);
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
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

    public static java.lang.String a(java.lang.String str) {
        str.getClass();
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(dev.epro.r0.F16059529287866721367.a);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                sb.append(java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1)));
            }
            return sb.toString();
        } catch (java.lang.Exception e) {
            ads_mobile_sdk.zi3.a(4, "Failed to calculate checksum", e);
            return null;
        }
    }

    public final java.io.File b(java.lang.String str) {
        java.io.File file = this.a;
        java.io.File file2 = new java.io.File(file, str);
        try {
            java.lang.String canonicalPath = file2.getCanonicalPath();
            canonicalPath.getClass();
            java.lang.String canonicalPath2 = file.getCanonicalPath();
            canonicalPath2.getClass();
            if (dev.epro.r0.Z13168519540281190457.F(canonicalPath, canonicalPath2, false)) {
                return file2;
            }
            ads_mobile_sdk.zi3.a(6, "Path traversal detected: " + str, null);
            return null;
        } catch (java.io.IOException e) {
            ads_mobile_sdk.zi3.a(4, "Failed to resolve canonical path for " + str, e);
            return null;
        }
    }
}
