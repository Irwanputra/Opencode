package dev.epro.r0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U12409389856179902213 extends BaseAdapter {
    public final T8605657386197958581 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public U12409389856179902213(T8605657386197958581 t8605657386197958581, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = t8605657386197958581;
        this.f = i;
        a();
    }

    public final void a() {
        T8605657386197958581 t8605657386197958581 = this.a;
        I4217019646703278835 i4217019646703278835 = t8605657386197958581.v;
        if (i4217019646703278835 != null) {
            t8605657386197958581.i();
            ArrayList arrayList = t8605657386197958581.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((I4217019646703278835) arrayList.get(i)) == i4217019646703278835) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final I4217019646703278835 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        T8605657386197958581 t8605657386197958581 = this.a;
        if (z) {
            t8605657386197958581.i();
            l = t8605657386197958581.j;
        } else {
            l = t8605657386197958581.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (I4217019646703278835) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        T8605657386197958581 t8605657386197958581 = this.a;
        if (z) {
            t8605657386197958581.i();
            l = t8605657386197958581.j;
        } else {
            l = t8605657386197958581.l();
        }
        return this.b < 0 ? l.size() : l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        G16868612739316221327 g16868612739316221327 = (G16868612739316221327) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        g16868612739316221327.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
