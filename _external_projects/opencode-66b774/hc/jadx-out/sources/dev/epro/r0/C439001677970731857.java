package dev.epro.r0;

import ads_mobile_sdk.ew1;
import ads_mobile_sdk.f32;
import ads_mobile_sdk.ul2;
import ads_mobile_sdk.zm3;
import android.content.Context;
import android.net.ConnectivityManager;
import android.view.View;
import android.widget.FrameLayout;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C439001677970731857 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C439001677970731857(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ew1 ew1Var = (ew1) obj;
                synchronized (ew1Var) {
                    try {
                        if (ew1Var.d.get()) {
                            return;
                        }
                        Context context = ew1Var.b.getContext();
                        if (context != null) {
                            View view = ew1Var.e;
                            if (view == null) {
                                view = new View(context);
                                view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                                ew1Var.e = view;
                            }
                            if (!ew1Var.b.equals(view.getParent())) {
                                ew1Var.b.addView(ew1Var.e);
                            }
                            break;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                f32 f32Var = (f32) obj;
                L14793767707362067090 l14793767707362067090 = new L14793767707362067090(f32Var, (byte) 1);
                try {
                    Object systemService = f32Var.a.getSystemService("connectivity");
                    systemService.getClass();
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(l14793767707362067090);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                ((HttpURLConnection) obj).disconnect();
                return;
            case 3:
                ul2 ul2Var = (ul2) obj;
                zm3 zm3Var = (zm3) ul2Var.a.get();
                long j = ul2Var.e;
                if (j > 0) {
                    zm3Var.e.a(new C439001677970731857(zm3Var, (byte) 4), j);
                    return;
                } else {
                    zm3Var.a();
                    return;
                }
            default:
                ((zm3) obj).a();
                return;
        }
    }
}
