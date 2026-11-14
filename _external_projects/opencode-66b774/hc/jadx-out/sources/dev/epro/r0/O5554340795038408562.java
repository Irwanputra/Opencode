package dev.epro.r0;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O5554340795038408562 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O5554340795038408562(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                H13521189488363841561 h13521189488363841561 = (H13521189488363841561) obj;
                T4056244775750501969 t4056244775750501969 = h13521189488363841561.G;
                t4056244775750501969.setSelection(i);
                if (t4056244775750501969.getOnItemClickListener() != null) {
                    t4056244775750501969.performItemClick(view, i, h13521189488363841561.D.getItemId(i));
                }
                h13521189488363841561.dismiss();
                break;
            default:
                E13336915040001677500 e13336915040001677500 = (E13336915040001677500) obj;
                M10701816181309613444 m10701816181309613444 = e13336915040001677500.e;
                e13336915040001677500.setText(e13336915040001677500.convertSelectionToString(i < 0 ? !m10701816181309613444.z.isShowing() ? null : m10701816181309613444.c.getSelectedItem() : e13336915040001677500.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = e13336915040001677500.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !m10701816181309613444.z.isShowing() ? null : m10701816181309613444.c.getSelectedView();
                        i = !m10701816181309613444.z.isShowing() ? -1 : m10701816181309613444.c.getSelectedItemPosition();
                        j = !m10701816181309613444.z.isShowing() ? Long.MIN_VALUE : m10701816181309613444.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(m10701816181309613444.c, view, i, j);
                }
                m10701816181309613444.dismiss();
                break;
        }
    }
}
