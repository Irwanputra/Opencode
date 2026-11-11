package p034.p050.p060;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1300 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ View f6304;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ View f6305;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ AlertController f6306;

    public RunnableC1300(AlertController alertController, View view, View view2) {
        this.f6306 = alertController;
        this.f6304 = view;
        this.f6305 = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m67(this.f6306.f118, this.f6304, this.f6305);
    }
}
