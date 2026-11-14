package com.google.android.play.core.hsdp.service;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class HsdpLoadingPanelContainer extends android.widget.FrameLayout {
    public java.lang.Runnable a;

    public HsdpLoadingPanelContainer(android.content.Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        java.lang.Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.a);
        }
    }

    public void setOnConfigurationChangedListener(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    public HsdpLoadingPanelContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
