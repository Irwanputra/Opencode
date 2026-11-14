package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class c7 implements dev.epro.r0.K16859880908517287624, dev.epro.r0.T10029384717875810847, dev.epro.r0.K4548097313143615345, androidx.webkit.WebViewCompat.WebViewStartUpCallback, dev.epro.r0.P14171055790411190215 {
    public static final java.lang.Object b = new java.lang.Object();
    public static ads_mobile_sdk.c7 c;
    public java.lang.Object a;
    public final /* synthetic */ byte d;

    public c7(byte b2) {
        this.d = b2;
        switch (b2) {
            case 21:
                this.a = new int[2];
                break;
            case 27:
                this.a = new java.util.concurrent.atomic.AtomicBoolean(true);
                break;
            default:
                this.a = new java.util.concurrent.atomic.AtomicReference(null);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(android.view.View view, org.json.JSONObject jSONObject, ads_mobile_sdk.tj3 tj3Var, boolean z, boolean z2) {
        int i = 0;
        switch (this.d) {
            case 21:
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    if (z) {
                        java.util.HashMap map = new java.util.HashMap();
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            android.view.View childAt = viewGroup.getChildAt(i2);
                            java.util.ArrayList arrayList = (java.util.ArrayList) map.get(java.lang.Float.valueOf(childAt.getZ()));
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                                map.put(java.lang.Float.valueOf(childAt.getZ()), arrayList);
                            }
                            arrayList.add(childAt);
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(map.keySet());
                        java.util.Collections.sort(arrayList2);
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            java.lang.Object obj = arrayList2.get(i3);
                            i3++;
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) map.get((java.lang.Float) obj);
                            int size2 = arrayList3.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                java.lang.Object obj2 = arrayList3.get(i4);
                                i4++;
                                tj3Var.a((android.view.View) obj2, this, jSONObject, z2);
                            }
                        }
                    } else {
                        while (i < viewGroup.getChildCount()) {
                            tj3Var.a(viewGroup.getChildAt(i), this, jSONObject, z2);
                            i++;
                        }
                    }
                    break;
                }
                break;
            default:
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                ads_mobile_sdk.n6 n6Var = ads_mobile_sdk.n6.c;
                if (n6Var != null) {
                    java.util.Collection collectionUnmodifiableCollection = java.util.Collections.unmodifiableCollection(n6Var.b);
                    java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap((collectionUnmodifiableCollection.size() * 2) + 3);
                    java.util.Iterator it = collectionUnmodifiableCollection.iterator();
                    while (it.hasNext()) {
                        android.view.View view2 = (android.view.View) ((ads_mobile_sdk.m6) it.next()).c.get();
                        if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                            android.view.View view3 = view2;
                            while (true) {
                                if (view3 != null) {
                                    if (view3.getAlpha() == 0.0f) {
                                    }
                                    java.lang.Object parent = view3.getParent();
                                    view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
                                    break;
                                } else {
                                    android.view.View rootView = view2.getRootView();
                                    if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                        identityHashMap.put(rootView, rootView);
                                        float z3 = rootView.getZ();
                                        int size3 = arrayList4.size();
                                        while (size3 > 0 && ((android.view.View) arrayList4.get(size3 - 1)).getZ() > z3) {
                                            size3--;
                                        }
                                        arrayList4.add(size3, rootView);
                                    }
                                }
                            }
                        }
                    }
                }
                int size4 = arrayList4.size();
                while (i < size4) {
                    java.lang.Object obj3 = arrayList4.get(i);
                    i++;
                    tj3Var.a((android.view.View) obj3, (ads_mobile_sdk.c7) this.a, jSONObject, z2);
                }
                break;
        }
    }

    public ads_mobile_sdk.oj0 b() {
        switch (this.d) {
            case 2:
                return new ads_mobile_sdk.oj0(((dev.epro.r0.N5829968851568792302) this.a).d());
            default:
                java.util.List listUnmodifiableList = java.util.Collections.unmodifiableList(((ads_mobile_sdk.dq) ((dev.epro.r0.K18029266284685972839) this.a).b).thirdPartySdk_);
                listUnmodifiableList.getClass();
                return new ads_mobile_sdk.oj0(listUnmodifiableList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(dev.epro.r0.R4833348786910499294 r10) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c7.d(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public void onFailure(java.lang.Throwable th) {
        switch (this.d) {
            case 8:
                break;
            default:
                ads_mobile_sdk.sh3 sh3Var = (ads_mobile_sdk.sh3) this.a;
                sh3Var.a(th);
                sh3Var.a();
                break;
        }
    }

    @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
    public void onSuccess(androidx.webkit.WebViewStartUpResult webViewStartUpResult) {
        webViewStartUpResult.getClass();
        ads_mobile_sdk.gq3 gq3Var = (ads_mobile_sdk.gq3) this.a;
        if (gq3Var != null) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = ads_mobile_sdk.lp3.a;
            gq3Var.a.resumeWith(new ads_mobile_sdk.xu0(new ads_mobile_sdk.kp3(webViewStartUpResult)));
        }
    }

    public long size() {
        return ((java.nio.ByteBuffer) this.a).capacity();
    }

    public /* synthetic */ c7(java.lang.Object obj, byte b2) {
        this.d = b2;
        this.a = obj;
    }

    public c7(ads_mobile_sdk.jx1 jx1Var) {
        this.d = (byte) 29;
        jx1Var.getClass();
        this.a = jx1Var;
    }

    public c7(ads_mobile_sdk.k8 k8Var) {
        this.d = (byte) 20;
        k8Var.getClass();
        this.a = k8Var;
    }

    public c7(ads_mobile_sdk.w81 w81Var) {
        this.d = (byte) 17;
        w81Var.getClass();
        this.a = w81Var;
    }

    public c7(ads_mobile_sdk.xj xjVar) {
        this.d = (byte) 14;
        xjVar.getClass();
        this.a = xjVar;
    }

    public c7(android.content.Context context, ads_mobile_sdk.fi0 fi0Var) {
        this.d = (byte) 12;
        context.getClass();
        fi0Var.getClass();
        this.a = fi0Var;
    }

    public c7(ads_mobile_sdk.r80 r80Var) {
        this.d = (byte) 0;
        this.a = (ads_mobile_sdk.f7) r80Var.C.get();
    }

    public /* synthetic */ c7(java.io.ByteArrayOutputStream byteArrayOutputStream, int i) {
        this.d = (byte) 28;
        this.a = byteArrayOutputStream;
    }

    public c7(java.util.HashMap map) {
        this.d = (byte) 15;
        this.a = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
    }

    public c7(int i) {
        this.d = (byte) 7;
        this.a = dev.epro.r0.O14838623545224379975.h(i);
    }

    public /* synthetic */ c7(byte b2, boolean z) {
        this.d = b2;
    }

    public c7(java.nio.ByteBuffer byteBuffer) {
        this.d = (byte) 4;
        this.a = byteBuffer.slice();
    }

    private final void onFailure$ads_mobile_sdk$fa3(java.lang.Throwable th) {
    }

    public void a(android.widget.ImageView.ScaleType scaleType) {
        scaleType.getClass();
        ads_mobile_sdk.ew1 nativeAdViewContainer = ((dev.epro.r0.U7463707071975914439) this.a).getNativeAdViewContainer();
        nativeAdViewContainer.getClass();
        synchronized (nativeAdViewContainer) {
            if (nativeAdViewContainer.d.get()) {
                return;
            }
            nativeAdViewContainer.f = scaleType;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public java.lang.Object m1a() {
        return (ads_mobile_sdk.rm2) this.a;
    }

    public void a(java.lang.String str, dev.epro.r0.V2597580950516131749 v2597580950516131749) {
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.a;
        if (v2597580950516131749 != null) {
            linkedHashMap.put(str, v2597580950516131749);
        } else {
            dev.epro.r0.Z3383101362411723454.k("provider");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.Q12322214121031392374 */
    public java.lang.Object a(java.io.FileInputStream fileInputStream) throws dev.epro.r0.Q12322214121031392374 {
        try {
            ads_mobile_sdk.bu0 bu0VarI = ((ads_mobile_sdk.rm2) this.a).i();
            ads_mobile_sdk.nl0 nl0VarA = ads_mobile_sdk.nl0.a();
            bu0VarI.getClass();
            ads_mobile_sdk.su suVar = new ads_mobile_sdk.su(fileInputStream);
            ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(bu0VarI.a, suVar, nl0VarA);
            suVar.a(0);
            if (ads_mobile_sdk.cu0.m2a(cu0VarA)) {
                return cu0VarA;
            }
            throw new ads_mobile_sdk.yi1(new dev.epro.r0.B13173120941733133417().getMessage());
        } catch (ads_mobile_sdk.yi1 e) {
            throw new dev.epro.r0.Q12322214121031392374("Cannot read proto.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.c7 r7, dev.epro.r0.I16631908410500040363 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.qx1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.qx1 r0 = (ads_mobile_sdk.qx1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.qx1 r0 = new ads_mobile_sdk.qx1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L8b
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L2e:
            dev.epro.r0.E17665849472693074628.k(r9)
            java.lang.String r9 = "name"
            java.lang.String r1 = ""
            java.lang.String r9 = ads_mobile_sdk.d62.a(r8, r9, r1)
            int r4 = r9.length()
            if (r4 != 0) goto L40
            goto L94
        L40:
            java.lang.String r4 = "type"
            java.lang.String r4 = ads_mobile_sdk.d62.a(r8, r4, r1)
            java.lang.String r5 = "string"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L5a
            ads_mobile_sdk.o70 r7 = new ads_mobile_sdk.o70
            java.lang.String r0 = "string_value"
            java.lang.String r8 = ads_mobile_sdk.d62.a(r8, r0, r1)
            r7.<init>(r9, r8)
            return r7
        L5a:
            java.lang.String r1 = "image"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L94
            java.lang.Object r7 = r7.a
            ads_mobile_sdk.jx1 r7 = (ads_mobile_sdk.jx1) r7
            java.lang.String r1 = "image_value"
            r0.a = r9
            r0.d = r3
            r7.getClass()
            if (r8 != 0) goto L72
            goto L77
        L72:
            dev.epro.r0.I16631908410500040363 r8 = r8.y(r1)     // Catch: java.lang.Exception -> L77
            goto L78
        L77:
            r8 = r2
        L78:
            dev.epro.r0.P16188089657974175786 r1 = r7.a
            dev.epro.r0.T18375584833185129273 r1 = (dev.epro.r0.T18375584833185129273) r1
            boolean r1 = r1.l
            java.lang.Object r7 = r7.a(r8, r1, r0)
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r8) goto L88
            r2 = r8
            goto L94
        L88:
            r6 = r9
            r9 = r7
            r7 = r6
        L8b:
            ads_mobile_sdk.wf1 r9 = (ads_mobile_sdk.wf1) r9
            if (r9 == 0) goto L94
            ads_mobile_sdk.n70 r2 = new ads_mobile_sdk.n70
            r2.<init>(r7, r9)
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c7.a(ads_mobile_sdk.c7, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public void a(java.lang.Object obj, java.io.FileOutputStream fileOutputStream) {
        ((ads_mobile_sdk.g) obj).a(fileOutputStream);
    }

    public void a(ads_mobile_sdk.hi2 hi2Var) {
        ads_mobile_sdk.tl2 tl2Var = (ads_mobile_sdk.tl2) this.a;
        ads_mobile_sdk.tl2.c.getClass();
        ads_mobile_sdk.k33 k33Var = tl2Var.a;
        if (k33Var == null) {
            return;
        }
        dev.epro.r0.M17133811648581684718 m17133811648581684718 = new dev.epro.r0.M17133811648581684718();
        k33Var.b(new ads_mobile_sdk.e33(k33Var, m17133811648581684718, m17133811648581684718, new ads_mobile_sdk.e33(tl2Var, m17133811648581684718, hi2Var, m17133811648581684718)));
    }

    public org.json.JSONObject a(android.view.View view) {
        switch (this.d) {
            case 21:
                int[] iArr = (int[]) this.a;
                if (view == null) {
                    return ads_mobile_sdk.c72.a(0, 0, 0, 0);
                }
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationOnScreen(iArr);
                return ads_mobile_sdk.c72.a(iArr[0], iArr[1], width, height);
            default:
                org.json.JSONObject jSONObjectA = ads_mobile_sdk.c72.a(0, 0, 0, 0);
                try {
                    jSONObjectA.put("noOutputDevice", dev.epro.r0.T1335862270807194835.e(ads_mobile_sdk.xv.a() != 1 ? (byte) 2 : dev.epro.r0.E2166724654553415323.b) == 0);
                    break;
                } catch (org.json.JSONException unused) {
                }
                return jSONObjectA;
        }
    }

    public void a(ads_mobile_sdk.oj0 oj0Var, ads_mobile_sdk.yw ywVar) {
        ywVar.getClass();
        dev.epro.r0.N5829968851568792302 n5829968851568792302 = (dev.epro.r0.N5829968851568792302) this.a;
        n5829968851568792302.b();
        ((ads_mobile_sdk.ax) n5829968851568792302.b).a(ywVar);
    }

    public ads_mobile_sdk.cw0 a() {
        switch (this.d) {
            case 12:
                return ads_mobile_sdk.cw0.DEVICE_TIER;
            case 14:
                return ads_mobile_sdk.cw0.MEMORY;
            case 17:
                return ads_mobile_sdk.cw0.INSPECTOR_SIGNAL;
            default:
                return ads_mobile_sdk.cw0.AD_SPAM;
        }
    }

    public void a(int i) {
        ads_mobile_sdk.fb1 fb1Var = (ads_mobile_sdk.fb1) this.a;
        dev.epro.r0.R7033599853981556291.E(fb1Var.c, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.bb1(fb1Var, i, null), 3);
    }

    public void a(ads_mobile_sdk.oj0 oj0Var, ads_mobile_sdk.cq cqVar) {
        dev.epro.r0.K18029266284685972839 k18029266284685972839 = (dev.epro.r0.K18029266284685972839) this.a;
        k18029266284685972839.b();
        ((ads_mobile_sdk.dq) k18029266284685972839.b).a(cqVar);
    }

    public java.lang.Object a(java.lang.String str) {
        java.lang.Object obj;
        synchronized (this) {
            obj = this.a;
            if (obj == null) {
                throw new java.lang.IllegalStateException(str.toString());
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r10 == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r10 == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:32:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(dev.epro.r0.I16631908410500040363 r8, java.lang.String r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.rx1
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.rx1 r0 = (ads_mobile_sdk.rx1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.rx1 r0 = new ads_mobile_sdk.rx1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            java.util.Iterator r7 = r0.b
            java.util.Collection r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L85
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L35:
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L5e
        L39:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.P16422848101170923038 r8 = ads_mobile_sdk.d62.e(r8, r9)
            if (r8 != 0) goto L43
            goto L4b
        L43:
            java.util.ArrayList r9 = r8.a
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L4e
        L4b:
            dev.epro.r0.O2161699089510411363 r7 = dev.epro.r0.O2161699089510411363.a
            return r7
        L4e:
            dev.epro.r0.B5703672629416386538 r9 = new dev.epro.r0.B5703672629416386538
            r10 = 8
            r9.<init>(r8, r7, r2, r10)
            r0.e = r4
            java.lang.Object r10 = dev.epro.r0.O8620973563946607355.B(r9, r0)
            if (r10 != r5) goto L5e
            goto L84
        L5e:
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r10.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L6c:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r7.next()
            dev.epro.r0.X11644140690951955496 r9 = (dev.epro.r0.X11644140690951955496) r9
            r0.a = r8
            r0.b = r7
            r0.e = r3
            java.lang.Object r10 = r9.s(r0)
            if (r10 != r5) goto L85
        L84:
            return r5
        L85:
            dev.epro.r0.H9465056496122534476 r10 = (dev.epro.r0.H9465056496122534476) r10
            if (r10 == 0) goto L6c
            r8.add(r10)
            goto L6c
        L8d:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c7.a(dev.epro.r0.I16631908410500040363, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public void a(java.security.MessageDigest[] messageDigestArr, long j, int i) {
        java.nio.ByteBuffer byteBufferSlice;
        synchronized (((java.nio.ByteBuffer) this.a)) {
            int i2 = (int) j;
            ((java.nio.ByteBuffer) this.a).position(i2);
            ((java.nio.ByteBuffer) this.a).limit(i2 + i);
            byteBufferSlice = ((java.nio.ByteBuffer) this.a).slice();
        }
        for (java.security.MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
