package dev.epro.r0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M11787204309148171275 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ E4608116865152724952 b;

    public M11787204309148171275(E4608116865152724952 e4608116865152724952) {
        this.b = e4608116865152724952;
        a();
    }

    public final void a() {
        T8605657386197958581 t8605657386197958581 = this.b.c;
        I4217019646703278835 i4217019646703278835 = t8605657386197958581.v;
        if (i4217019646703278835 != null) {
            t8605657386197958581.i();
            ArrayList arrayList = t8605657386197958581.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((I4217019646703278835) arrayList.get(i)) == i4217019646703278835) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final I4217019646703278835 getItem(int i) {
        T8605657386197958581 t8605657386197958581 = this.b.c;
        t8605657386197958581.i();
        ArrayList arrayList = t8605657386197958581.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (I4217019646703278835) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        T8605657386197958581 t8605657386197958581 = this.b.c;
        t8605657386197958581.i();
        int size = t8605657386197958581.j.size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((G16868612739316221327) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
