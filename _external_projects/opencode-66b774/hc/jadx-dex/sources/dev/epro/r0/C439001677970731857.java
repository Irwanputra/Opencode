package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class C439001677970731857 implements java.lang.Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ C439001677970731857(java.lang.Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                ads_mobile_sdk.ew1 ew1Var = (ads_mobile_sdk.ew1) obj;
                synchronized (ew1Var) {
                    try {
                        if (ew1Var.d.get()) {
                            return;
                        }
                        android.content.Context context = ew1Var.b.getContext();
                        if (context != null) {
                            android.view.View view = ew1Var.e;
                            if (view == null) {
                                view = new android.view.View(context);
                                view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, 0));
                                ew1Var.e = view;
                            }
                            if (!ew1Var.b.equals(view.getParent())) {
                                ew1Var.b.addView(ew1Var.e);
                            }
                            break;
                        }
                        return;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            case 1:
                ads_mobile_sdk.f32 f32Var = (ads_mobile_sdk.f32) obj;
                android.net.ConnectivityManager.NetworkCallback l14793767707362067090 = new dev.epro.r0.L14793767707362067090(f32Var, (byte) 1);
                try {
                    java.lang.Object systemService = f32Var.a.getSystemService("connectivity");
                    systemService.getClass();
                    ((android.net.ConnectivityManager) systemService).registerDefaultNetworkCallback(l14793767707362067090);
                    return;
                } catch (java.lang.Throwable unused) {
                    return;
                }
            case 2:
                ((java.net.HttpURLConnection) obj).disconnect();
                return;
            case 3:
                ads_mobile_sdk.ul2 ul2Var = (ads_mobile_sdk.ul2) obj;
                ads_mobile_sdk.zm3 zm3Var = (ads_mobile_sdk.zm3) ul2Var.a.get();
                long j = ul2Var.e;
                if (j > 0) {
                    zm3Var.e.a(new dev.epro.r0.C439001677970731857(zm3Var, (byte) 4), j);
                    return;
                } else {
                    zm3Var.a();
                    return;
                }
            default:
                ((ads_mobile_sdk.zm3) obj).a();
                return;
        }
    }
}
