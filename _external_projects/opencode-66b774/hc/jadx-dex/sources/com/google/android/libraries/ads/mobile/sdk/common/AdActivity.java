package com.google.android.libraries.ads.mobile.sdk.common;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class AdActivity extends dev.epro.r0.T17336508261397230716 {
    public dev.epro.r0.H8032588520594078423 u;

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.onCreate(bundle);
        dev.epro.r0.Z1555232923955070058.a.getClass();
        if (ads_mobile_sdk.gu0.b.a == null) {
            finish();
            return;
        }
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.Integer numValueOf = (extras == null || (bundle2 = extras.getBundle("ad_activity_delegate_bundle")) == null) ? null : java.lang.Integer.valueOf(bundle2.getInt("ad_activity_delegate"));
        if (numValueOf == null) {
            ((ads_mobile_sdk.ci3) ((ads_mobile_sdk.db0) ads_mobile_sdk.gu0.a()).F.get()).a("AdActivityMissingDelegateKey", (java.lang.Throwable) new java.lang.Exception("AdActivityMissingDelegateKey"));
            ads_mobile_sdk.xv.a("Could not retrieve AdActivityDelegate key", (java.lang.Exception) null);
            finish();
            return;
        }
        ads_mobile_sdk.j0 j0Var = (ads_mobile_sdk.j0) ((ads_mobile_sdk.l0) ((ads_mobile_sdk.db0) ads_mobile_sdk.gu0.a()).Q.get()).d.remove(numValueOf);
        if (j0Var != null) {
            j0Var.b.c((java.util.concurrent.CancellationException) null);
        }
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = j0Var != null ? j0Var.a : null;
        if (h8032588520594078423 == null) {
            ((ads_mobile_sdk.ci3) ((ads_mobile_sdk.db0) ads_mobile_sdk.gu0.a()).F.get()).a("AdActivityMissingDelegate", (java.lang.Throwable) new java.lang.Exception("AdActivityMissingDelegate"));
            ads_mobile_sdk.xv.a("No AdActivityDelegate associated with key", (java.lang.Exception) null);
            finish();
            return;
        }
        this.u = h8032588520594078423;
        requestWindowFeature(1);
        try {
            getWindow().getDecorView().getClass();
            h8032588520594078423.a(this);
        } catch (java.lang.Exception e) {
            dev.epro.r0.Z1555232923955070058.a.getClass();
            ((ads_mobile_sdk.ci3) ((ads_mobile_sdk.db0) ads_mobile_sdk.gu0.a()).F.get()).a("AdActivityDecorViewWorkaround", (java.lang.Throwable) e);
            ads_mobile_sdk.xv.a("Failed to get DecorView", e);
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) ((ads_mobile_sdk.db0) ads_mobile_sdk.gu0.a()).u.get();
            dev.epro.r0.G16212247282630895364 g16212247282630895364 = new dev.epro.r0.G16212247282630895364(h8032588520594078423, (dev.epro.r0.R4833348786910499294) null, (byte) 24);
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(g16212247282630895364, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onDestroy();
        }
        this.u = null;
        super/*android.app.Activity*/.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onPause();
        }
        super/*android.app.Activity*/.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestart() {
        super/*android.app.Activity*/.onRestart();
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*android.app.Activity*/.onResume();
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onResume();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super/*android.app.Activity*/.onStart();
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.a$2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStop() {
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.onStop();
        }
        super/*android.app.Activity*/.onStop();
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.b();
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.e();
        }
    }

    public final void setContentView(android.view.View view) {
        super.setContentView(view);
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.e();
        }
    }

    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        dev.epro.r0.H8032588520594078423 h8032588520594078423 = this.u;
        if (h8032588520594078423 != null) {
            h8032588520594078423.e();
        }
    }
}
