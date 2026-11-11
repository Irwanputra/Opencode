package p034.p050.p060;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1319 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ View f6342;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ View f6343;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ AlertController f6344;

    public RunnableC1319(AlertController alertController, View view, View view2) {
        this.f6344 = alertController;
        this.f6342 = view;
        this.f6343 = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m67(this.f6344.f150, this.f6342, this.f6343);
    }
}
