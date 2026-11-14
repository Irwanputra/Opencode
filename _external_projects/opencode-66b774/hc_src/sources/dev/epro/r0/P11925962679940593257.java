package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class P11925962679940593257 implements A8947685337014270457 {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final K12477491117444883648 c;

    static {
        A1960181136934585864 a2 = K12477491117444883648.a();
        a2.a(S14062146164092607729.a, V11865174435555805371.b);
        a2.a(S14062146164092607729.b, V11865174435555805371.c);
        a2.a(S14062146164092607729.c, V11865174435555805371.d);
        c = a2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[Catch: NoSuchProviderException -> 0x003f, TryCatch #0 {NoSuchProviderException -> 0x003f, blocks: (B:2:0x0000, B:4:0x0010, B:7:0x0023, B:11:0x0032, B:14:0x0037, B:15:0x003e, B:16:0x001d, B:17:0x002c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: NoSuchProviderException -> 0x003f, TryCatch #0 {NoSuchProviderException -> 0x003f, blocks: (B:2:0x0000, B:4:0x0010, B:7:0x0023, B:11:0x0032, B:14:0x0037, B:15:0x003e, B:16:0x001d, B:17:0x002c), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.A8947685337014270457 b(dev.epro.r0.G5183794802785878636 r5) {
        /*
            int r0 = dev.epro.r0.Z12670897225348479586.a     // Catch: java.security.NoSuchProviderException -> L3f
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch: java.security.NoSuchProviderException -> L3f
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)     // Catch: java.security.NoSuchProviderException -> L3f
            if (r1 == 0) goto L2c
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.security.NoSuchProviderException -> L3f
            boolean r0 = java.util.Objects.equals(r0, r2)     // Catch: java.security.NoSuchProviderException -> L3f
            r1 = 0
            if (r0 != 0) goto L1d
            r0 = r1
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchProviderException -> L3f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.security.NoSuchProviderException -> L3f
        L23:
            int r0 = r0.intValue()     // Catch: java.security.NoSuchProviderException -> L3f
            r2 = 21
            if (r0 > r2) goto L2c
            goto L30
        L2c:
            java.security.Provider r1 = dev.epro.r0.C775827382551829194.U()     // Catch: java.security.NoSuchProviderException -> L3f
        L30:
            if (r1 == 0) goto L37
            dev.epro.r0.F493162347567989037 r5 = dev.epro.r0.F493162347567989037.b(r5, r1)     // Catch: java.security.NoSuchProviderException -> L3f
            return r5
        L37:
            java.security.NoSuchProviderException r0 = new java.security.NoSuchProviderException     // Catch: java.security.NoSuchProviderException -> L3f
            java.lang.String r1 = "RSA-PKCS1.5 using Conscrypt is not supported."
            r0.<init>(r1)     // Catch: java.security.NoSuchProviderException -> L3f
            throw r0     // Catch: java.security.NoSuchProviderException -> L3f
        L3f:
            dev.epro.r0.W8357658991043002609 r0 = dev.epro.r0.W8357658991043002609.f
            java.lang.String r1 = "RSA"
            dev.epro.r0.L509554291772586163 r0 = r0.a
            java.lang.Object r0 = r0.a(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r5.k
            dev.epro.r0.C5880096771922761272 r3 = r5.j
            java.math.BigInteger r4 = r3.b
            r1.<init>(r2, r4)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            dev.epro.r0.O6180150081584389963 r1 = new dev.epro.r0.O6180150081584389963
            dev.epro.r0.K12477491117444883648 r2 = dev.epro.r0.P11925962679940593257.c
            dev.epro.r0.V11865174435555805371 r4 = r3.d
            java.lang.Enum r2 = r2.c(r4)
            dev.epro.r0.S14062146164092607729 r2 = (dev.epro.r0.S14062146164092607729) r2
            dev.epro.r0.J4250663911053539605 r5 = r5.l
            byte[] r5 = r5.b()
            dev.epro.r0.D14731132657808549702 r3 = r3.c
            dev.epro.r0.D14731132657808549702 r4 = dev.epro.r0.D14731132657808549702.r0
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7b
            byte[] r3 = dev.epro.r0.P11925962679940593257.b
            goto L7d
        L7b:
            byte[] r3 = dev.epro.r0.P11925962679940593257.a
        L7d:
            r1.<init>(r0, r2, r5, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P11925962679940593257.b(dev.epro.r0.G5183794802785878636):dev.epro.r0.A8947685337014270457");
    }
}
