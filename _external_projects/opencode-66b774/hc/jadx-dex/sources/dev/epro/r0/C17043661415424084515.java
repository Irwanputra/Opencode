package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C17043661415424084515 implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ dev.epro.r0.O8953140192291099683 a;
    public final /* synthetic */ dev.epro.r0.V4825737980590471194 b;

    public C17043661415424084515(dev.epro.r0.V4825737980590471194 v4825737980590471194, dev.epro.r0.O8953140192291099683 o8953140192291099683) {
        this.b = v4825737980590471194;
        this.a = o8953140192291099683;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        dev.epro.r0.V4825737980590471194 v4825737980590471194 = this.b;
        android.content.DialogInterface.OnClickListener onClickListener = v4825737980590471194.h;
        dev.epro.r0.O8953140192291099683 o8953140192291099683 = this.a;
        onClickListener.onClick(o8953140192291099683.b, i);
        if (v4825737980590471194.i) {
            return;
        }
        o8953140192291099683.b.dismiss();
    }
}
