package p034.p050.p060;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1336 implements AbsListView.OnScrollListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ View f6438;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ View f6439;

    public C1336(AlertController alertController, View view, View view2) {
        this.f6438 = view;
        this.f6439 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m67(absListView, this.f6438, this.f6439);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
