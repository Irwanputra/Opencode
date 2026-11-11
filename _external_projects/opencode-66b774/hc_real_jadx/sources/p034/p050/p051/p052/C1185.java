package p034.p050.p051.p052;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
import p034.p050.p051.p052.InterfaceC1195;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1185 extends BaseAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public C1164 f5866;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f5867;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f5868 = -1;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean f5869;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final LayoutInflater f5870;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f5871;

    public C1185(C1164 c1164, LayoutInflater layoutInflater, boolean z, int i) {
        this.f5869 = z;
        this.f5870 = layoutInflater;
        this.f5866 = c1164;
        this.f5867 = i;
        m2658();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C1197> m2625;
        if (this.f5869) {
            C1164 c1164 = this.f5866;
            c1164.m2636();
            m2625 = c1164.f5769;
        } else {
            m2625 = this.f5866.m2625();
        }
        int i = this.f5868;
        int size = m2625.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5870.inflate(this.f5867, viewGroup, false);
        }
        int i2 = getItem(i).f5911;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f5866.mo2630() && i2 != (i3 >= 0 ? getItem(i3).f5911 : i2));
        InterfaceC1195.InterfaceC1196 interfaceC1196 = (InterfaceC1195.InterfaceC1196) view;
        if (this.f5871) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1196.mo88(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m2658();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* renamed from: 〺つふすそ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C1197 getItem(int i) {
        ArrayList<C1197> m2625;
        if (this.f5869) {
            C1164 c1164 = this.f5866;
            c1164.m2636();
            m2625 = c1164.f5769;
        } else {
            m2625 = this.f5866.m2625();
        }
        int i2 = this.f5868;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m2625.get(i);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m2658() {
        C1164 c1164 = this.f5866;
        C1197 c1197 = c1164.f5780;
        if (c1197 != null) {
            c1164.m2636();
            ArrayList<C1197> arrayList = c1164.f5769;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == c1197) {
                    this.f5868 = i;
                    return;
                }
            }
        }
        this.f5868 = -1;
    }
}
