package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class A12732730042960812466 implements dev.epro.r0.B17882008330949896466, dev.epro.r0.R5909351061398077004, dev.epro.r0.B14351301772695273662, dev.epro.r0.Y16033830328113725410, dev.epro.r0.P7827270438547540384 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ A12732730042960812466(java.lang.Object obj, java.lang.Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // dev.epro.r0.B14351301772695273662
    public java.lang.Object a(dev.epro.r0.X627358512999327803 x627358512999327803) {
        java.lang.String str;
        java.lang.String str2;
        byte b = this.a;
        dev.epro.r0.A3452148295251753522 a3452148295251753522 = dev.epro.r0.A3452148295251753522.a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        int i = 0;
        switch (b) {
            case 3:
                java.util.concurrent.Executor executor = (java.util.concurrent.Executor) obj2;
                dev.epro.r0.G11788314460893114611 g11788314460893114611 = (dev.epro.r0.G11788314460893114611) obj;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                dev.epro.r0.K14036692014295902585 k14036692014295902585 = new dev.epro.r0.K14036692014295902585(atomicBoolean, (byte) 0);
                dev.epro.r0.W8823188230031025271 w8823188230031025271 = x627358512999327803.c;
                if (w8823188230031025271 != null) {
                    w8823188230031025271.a(k14036692014295902585, a3452148295251753522);
                }
                executor.execute(new dev.epro.r0.E138661690457992157(atomicBoolean, x627358512999327803, g11788314460893114611, (byte) 5));
                return "setForegroundAsync";
            case 7:
                java.util.concurrent.Executor executor2 = (java.util.concurrent.Executor) obj2;
                dev.epro.r0.B13729205492206812220 b13729205492206812220 = (dev.epro.r0.B13729205492206812220) obj;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(false);
                dev.epro.r0.K14036692014295902585 k140366920142959025852 = new dev.epro.r0.K14036692014295902585(atomicBoolean2, (byte) 1);
                dev.epro.r0.W8823188230031025271 w88231882300310252712 = x627358512999327803.c;
                if (w88231882300310252712 != null) {
                    w88231882300310252712.a(k140366920142959025852, a3452148295251753522);
                }
                executor2.execute(new dev.epro.r0.E138661690457992157(atomicBoolean2, x627358512999327803, b13729205492206812220, (byte) 10));
                return dev.epro.r0.O9245300239821758723.a;
            default:
                android.content.Context context = (android.content.Context) obj2;
                ads_mobile_sdk.j7 j7Var = (ads_mobile_sdk.j7) obj;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    try {
                        java.lang.String packageName = context.getPackageName();
                        java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
                        java.lang.String[] strArr = {j7Var.K(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
                        int i2 = 0;
                        while (true) {
                            if (i2 < 2) {
                                str = strArr[i2];
                                if (android.text.TextUtils.isEmpty(str)) {
                                    i2++;
                                }
                            } else {
                                str = "";
                            }
                        }
                        byte[] bArrA = dev.epro.r0.W1349480363743553773.f.f().a(str);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrA)));
                        if (!android.os.Build.TYPE.equals("user")) {
                            java.lang.String[] strArr2 = {j7Var.u(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
                            while (true) {
                                if (i < 2) {
                                    str2 = strArr2[i];
                                    if (android.text.TextUtils.isEmpty(str2)) {
                                        i++;
                                    }
                                } else {
                                    str2 = "";
                                }
                            }
                            arrayList.add(certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(dev.epro.r0.W1349480363743553773.f.f().a(str2))));
                        }
                        dev.epro.r0.R10617406068291706632.q(context.getPackageManager(), packageName, arrayList, new dev.epro.r0.R7063295220064303126(x627358512999327803));
                    } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NoClassDefFoundError | java.security.cert.CertificateException unused) {
                        x627358512999327803.a("");
                    }
                    break;
                } else {
                    x627358512999327803.a("");
                }
                return "";
        }
    }

    public java.lang.Object b(dev.epro.r0.Y8831258500803408458 y8831258500803408458) {
        java.lang.Class<dev.epro.r0.W5605385477019102368> cls;
        dev.epro.r0.C3286149729114985901 c3286149729114985901 = (dev.epro.r0.C3286149729114985901) this.b;
        dev.epro.r0.G153318823017092791 g153318823017092791 = (dev.epro.r0.G153318823017092791) this.c;
        dev.epro.r0.Z1953481206310471956 z1953481206310471956 = y8831258500803408458.a;
        switch (g153318823017092791.a) {
            case 0:
                cls = dev.epro.r0.Q18154916179356040156.class;
                break;
            case 1:
                cls = dev.epro.r0.Y7661440305297242229.class;
                break;
            case 2:
                cls = dev.epro.r0.B5876679728636531530.class;
                break;
            case 3:
                cls = dev.epro.r0.W5605385477019102368.class;
                break;
            default:
                cls = dev.epro.r0.A8947685337014270457.class;
                break;
        }
        return c3286149729114985901.a(z1953481206310471956, cls);
    }

    public boolean c() {
        dev.epro.r0.X8133657484919231199 x8133657484919231199 = (dev.epro.r0.X8133657484919231199) this.b;
        dev.epro.r0.U6606854693644295176 u6606854693644295176 = (dev.epro.r0.U6606854693644295176) this.c;
        boolean z = x8133657484919231199.q;
        if (z) {
            return z;
        }
        x8133657484919231199.h();
        long jA = dev.epro.r0.U6606854693644295176.a(x8133657484919231199.o, u6606854693644295176.a);
        u6606854693644295176.a = jA;
        boolean z2 = !x8133657484919231199.g(x8133657484919231199.n, jA + u6606854693644295176.b);
        x8133657484919231199.q = z2;
        return z2;
    }

    public void onComplete(dev.epro.r0.S14461012662136963693 s14461012662136963693) {
        ads_mobile_sdk.k33 k33Var = (ads_mobile_sdk.k33) this.b;
        dev.epro.r0.M17133811648581684718 m17133811648581684718 = (dev.epro.r0.M17133811648581684718) this.c;
        synchronized (k33Var.f) {
            k33Var.e.remove(m17133811648581684718);
        }
    }

    /* JADX INFO: renamed from: run, reason: collision with other method in class */
    public void m24run() throws java.io.IOException {
        int i;
        dev.epro.r0.Z11821137052809198413 z11821137052809198413 = (dev.epro.r0.Z11821137052809198413) this.b;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.c;
        java.nio.channels.ReadableByteChannel readableByteChannel = z11821137052809198413.n;
        if (readableByteChannel != null) {
            z11821137052809198413.w++;
            i = readableByteChannel.read(byteBuffer);
        } else {
            i = -1;
        }
        dev.epro.r0.R9704326227384281667 r9704326227384281667 = z11821137052809198413.a;
        if (i != -1) {
            dev.epro.r0.N12175049621887677679 n12175049621887677679 = z11821137052809198413.o;
            r9704326227384281667.getClass();
            r9704326227384281667.b(new dev.epro.r0.M11115334227134251595(r9704326227384281667, n12175049621887677679, byteBuffer, (byte) 3), "onReadCompleted");
            return;
        }
        java.nio.channels.ReadableByteChannel readableByteChannel2 = z11821137052809198413.n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (z11821137052809198413.f.compareAndSet(5, 7)) {
            z11821137052809198413.c(new dev.epro.r0.G15717426683772243395(z11821137052809198413, (byte) 2), "fireDisconnect");
            dev.epro.r0.N12175049621887677679 n121750496218876776792 = z11821137052809198413.o;
            r9704326227384281667.getClass();
            r9704326227384281667.c(new dev.epro.r0.S1496729237269593071(r9704326227384281667, n121750496218876776792, (byte) 1), "onSucceeded");
        }
    }

    @Override // dev.epro.r0.B17882008330949896466
    public java.lang.Object run() {
        byte b = this.a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((dev.epro.r0.F10736675061244242991) obj2).a.openConnection((java.net.URL) obj);
            default:
                dev.epro.r0.R6413645163672196790 r6413645163672196790 = (dev.epro.r0.R6413645163672196790) obj2;
                r6413645163672196790.a.onResponseStarted(r6413645163672196790.b, dev.epro.r0.V14822036933104273045.b((android.net.http.UrlResponseInfo) obj));
                return null;
        }
    }
}
