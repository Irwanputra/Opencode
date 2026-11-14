package com.google.android.libraries.ads.mobile.sdk.common;

import ads_mobile_sdk.ci3;
import ads_mobile_sdk.db0;
import ads_mobile_sdk.gu0;
import ads_mobile_sdk.j0;
import ads_mobile_sdk.l0;
import ads_mobile_sdk.xv;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import dev.epro.r0.G16212247282630895364;
import dev.epro.r0.H8032588520594078423;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.T17336508261397230716;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z1555232923955070058;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class AdActivity extends T17336508261397230716 {
    public H8032588520594078423 u;

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onConfigurationChanged(configuration);
        }
    }

    @Override // dev.epro.r0.T17336508261397230716, dev.epro.r0.A13924955594853091425, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        Z1555232923955070058.a.getClass();
        if (gu0.b.a == null) {
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        R4833348786910499294 r4833348786910499294 = null;
        Integer valueOf = (extras == null || (bundle2 = extras.getBundle("ad_activity_delegate_bundle")) == null) ? null : Integer.valueOf(bundle2.getInt("ad_activity_delegate"));
        if (valueOf == null) {
            ((ci3) ((db0) gu0.a()).F.get()).a("AdActivityMissingDelegateKey", (Throwable) new Exception("AdActivityMissingDelegateKey"));
            xv.a("Could not retrieve AdActivityDelegate key", (Exception) null);
            finish();
            return;
        }
        j0 j0Var = (j0) ((l0) ((db0) gu0.a()).Q.get()).d.remove(valueOf);
        if (j0Var != null) {
            j0Var.b.c(null);
        }
        H8032588520594078423 h8032588520594078423 = j0Var != null ? j0Var.a : null;
        if (h8032588520594078423 == null) {
            ((ci3) ((db0) gu0.a()).F.get()).a("AdActivityMissingDelegate", (Throwable) new Exception("AdActivityMissingDelegate"));
            xv.a("No AdActivityDelegate associated with key", (Exception) null);
            finish();
            return;
        }
        this.u = h8032588520594078423;
        byte b = 1;
        requestWindowFeature(1);
        try {
            getWindow().getDecorView().getClass();
            h8032588520594078423.a(this);
        } catch (Exception e) {
            Z1555232923955070058.a.getClass();
            ((ci3) ((db0) gu0.a()).F.get()).a("AdActivityDecorViewWorkaround", (Throwable) e);
            xv.a("Failed to get DecorView", e);
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) ((db0) gu0.a()).u.get();
            G16212247282630895364 g16212247282630895364 = new G16212247282630895364(h8032588520594078423, r4833348786910499294, (byte) 24);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(g16212247282630895364, r4833348786910499294, b), 2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onDestroy();
        }
        this.u = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.c();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onResume();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.a$2();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onStop();
        }
        super.onStop();
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.b();
        }
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.e();
        }
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.e();
        }
    }

    @Override // dev.epro.r0.T17336508261397230716, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.e();
        }
    }
}
