package dev.epro.r0;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C17043661415424084515 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ O8953140192291099683 a;
    public final /* synthetic */ V4825737980590471194 b;

    public C17043661415424084515(V4825737980590471194 v4825737980590471194, O8953140192291099683 o8953140192291099683) {
        this.b = v4825737980590471194;
        this.a = o8953140192291099683;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        V4825737980590471194 v4825737980590471194 = this.b;
        DialogInterface.OnClickListener onClickListener = v4825737980590471194.h;
        O8953140192291099683 o8953140192291099683 = this.a;
        onClickListener.onClick(o8953140192291099683.b, i);
        if (v4825737980590471194.i) {
            return;
        }
        o8953140192291099683.b.dismiss();
    }
}
