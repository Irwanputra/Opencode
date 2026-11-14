package dev.epro.r0;

import android.view.View;
import android.view.ViewGroup;
import dev.epro.httpcustom.MainActivity;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U15108547266844314449 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ MainActivity a;

    public U15108547266844314449(N17157817114855916481 n17157817114855916481, MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (R10617406068291706632.u(view2)) {
            N17157817114855916481.H(R10617406068291706632.o(view2));
            View decorView = this.a.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
