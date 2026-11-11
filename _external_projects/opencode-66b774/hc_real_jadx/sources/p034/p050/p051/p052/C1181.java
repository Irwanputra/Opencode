package p034.p050.p051.p052;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;
import p034.p050.C1147;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p051.p052.InterfaceC1195;
import p034.p050.p060.DialogInterfaceC1343;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1181 implements InterfaceC1186, AdapterView.OnItemClickListener {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public C1182 f5844;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Context f5845;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public InterfaceC1186.InterfaceC1187 f5846;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public LayoutInflater f5847;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ExpandedMenuView f5848;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f5849;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1164 f5850;

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1182 extends BaseAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f5851 = -1;

        public C1182() {
            m2651();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            C1164 c1164 = C1181.this.f5850;
            c1164.m2636();
            int size = c1164.f5769.size();
            C1181.this.getClass();
            int i = size + 0;
            return this.f5851 < 0 ? i : i - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C1181 c1181 = C1181.this;
                view = c1181.f5847.inflate(c1181.f5849, viewGroup, false);
            }
            ((InterfaceC1195.InterfaceC1196) view).mo88(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m2651();
            super.notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        /* renamed from: 〺つふすそ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C1197 getItem(int i) {
            C1164 c1164 = C1181.this.f5850;
            c1164.m2636();
            ArrayList<C1197> arrayList = c1164.f5769;
            C1181.this.getClass();
            int i2 = i + 0;
            int i3 = this.f5851;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m2651() {
            C1164 c1164 = C1181.this.f5850;
            C1197 c1197 = c1164.f5780;
            if (c1197 != null) {
                c1164.m2636();
                ArrayList<C1197> arrayList = c1164.f5769;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == c1197) {
                        this.f5851 = i;
                        return;
                    }
                }
            }
            this.f5851 = -1;
        }
    }

    public C1181(Context context, int i) {
        this.f5849 = i;
        this.f5845 = context;
        this.f5847 = LayoutInflater.from(context);
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    public int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f5850.m2631(this.f5844.getItem(i), this, 0);
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: 〳ぜぞぜべっ */
    public boolean mo117() {
        return false;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ListAdapter m2649() {
        if (this.f5844 == null) {
            this.f5844 = new C1182();
        }
        return this.f5844;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぁごぐすすぃ */
    public void mo119(boolean z) {
        C1182 c1182 = this.f5844;
        if (c1182 != null) {
            c1182.notifyDataSetChanged();
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: いいにぽつ */
    public boolean mo242(C1164 c1164, C1197 c1197) {
        return false;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: くし〴〺ぅ */
    public void mo122(Context context, C1164 c1164) {
        if (this.f5845 != null) {
            this.f5845 = context;
            if (this.f5847 == null) {
                this.f5847 = LayoutInflater.from(context);
            }
        }
        this.f5850 = c1164;
        C1182 c1182 = this.f5844;
        if (c1182 != null) {
            c1182.notifyDataSetChanged();
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: げつ〴ぬぐ */
    public void mo123(C1164 c1164, boolean z) {
        InterfaceC1186.InterfaceC1187 interfaceC1187 = this.f5846;
        if (interfaceC1187 != null) {
            interfaceC1187.mo132(c1164, z);
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: づざかべべ */
    public boolean mo124(SubMenuC1180 subMenuC1180) {
        if (!subMenuC1180.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC1162 dialogInterfaceOnKeyListenerC1162 = new DialogInterfaceOnKeyListenerC1162(subMenuC1180);
        DialogInterfaceC1343.C1344 c1344 = new DialogInterfaceC1343.C1344(subMenuC1180.f5774);
        C1181 c1181 = new C1181(c1344.f6452.f168, C1147.abc_list_menu_item_layout);
        dialogInterfaceOnKeyListenerC1162.f5754 = c1181;
        c1181.f5846 = dialogInterfaceOnKeyListenerC1162;
        C1164 c1164 = dialogInterfaceOnKeyListenerC1162.f5752;
        c1164.m2610(c1181, c1164.f5774);
        ListAdapter m2649 = dialogInterfaceOnKeyListenerC1162.f5754.m2649();
        AlertController.C0038 c0038 = c1344.f6452;
        c0038.f175 = m2649;
        c0038.f166 = dialogInterfaceOnKeyListenerC1162;
        View view = subMenuC1180.f5772;
        if (view != null) {
            c0038.f170 = view;
        } else {
            c0038.f167 = subMenuC1180.f5786;
            c0038.f174 = subMenuC1180.f5782;
        }
        c0038.f173 = dialogInterfaceOnKeyListenerC1162;
        DialogInterfaceC1343 m3031 = c1344.m3031();
        dialogInterfaceOnKeyListenerC1162.f5753 = m3031;
        m3031.setOnDismissListener(dialogInterfaceOnKeyListenerC1162);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC1162.f5753.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC1162.f5753.show();
        InterfaceC1186.InterfaceC1187 interfaceC1187 = this.f5846;
        if (interfaceC1187 == null) {
            return true;
        }
        interfaceC1187.mo131(subMenuC1180);
        return true;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: てぜきぽく */
    public void mo2608(InterfaceC1186.InterfaceC1187 interfaceC1187) {
        this.f5846 = interfaceC1187;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: びぐびあび */
    public void mo127(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f5848.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺぁあねじ */
    public Parcelable mo129() {
        if (this.f5848 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f5848;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺふねづ〺 */
    public boolean mo243(C1164 c1164, C1197 c1197) {
        return false;
    }
}
