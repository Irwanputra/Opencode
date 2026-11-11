package p034.p050.p051;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p034.p035.p036.p037.InterfaceMenuC1002;
import p034.p035.p036.p037.InterfaceMenuItemC1000;
import p034.p050.p051.AbstractC1154;
import p034.p050.p051.p052.MenuC1177;
import p034.p050.p051.p052.MenuItemC1167;
import p034.p080.C1493;

/* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1156 extends ActionMode {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final AbstractC1154 f5699;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f5700;

    /* renamed from: づざかべべ.〺つふすそ.ぇぬぎばつ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1157 implements AbstractC1154.InterfaceC1155 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Context f5701;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final ActionMode.Callback f5703;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final ArrayList<C1156> f5702 = new ArrayList<>();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final C1493<Menu, Menu> f5704 = new C1493<>();

        public C1157(Context context, ActionMode.Callback callback) {
            this.f5701 = context;
            this.f5703 = callback;
        }

        @Override // p034.p050.p051.AbstractC1154.InterfaceC1155
        /* renamed from: 〺つふすそ */
        public void mo2597(AbstractC1154 abstractC1154) {
            this.f5703.onDestroyActionMode(m2601(abstractC1154));
        }

        @Override // p034.p050.p051.AbstractC1154.InterfaceC1155
        /* renamed from: くし〴〺ぅ */
        public boolean mo2598(AbstractC1154 abstractC1154, MenuItem menuItem) {
            return this.f5703.onActionItemClicked(m2601(abstractC1154), new MenuItemC1167(this.f5701, (InterfaceMenuItemC1000) menuItem));
        }

        @Override // p034.p050.p051.AbstractC1154.InterfaceC1155
        /* renamed from: げつ〴ぬぐ */
        public boolean mo2599(AbstractC1154 abstractC1154, Menu menu) {
            return this.f5703.onPrepareActionMode(m2601(abstractC1154), m2602(menu));
        }

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public ActionMode m2601(AbstractC1154 abstractC1154) {
            int size = this.f5702.size();
            for (int i = 0; i < size; i++) {
                C1156 c1156 = this.f5702.get(i);
                if (c1156 != null && c1156.f5699 == abstractC1154) {
                    return c1156;
                }
            }
            C1156 c11562 = new C1156(this.f5701, abstractC1154);
            this.f5702.add(c11562);
            return c11562;
        }

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final Menu m2602(Menu menu) {
            Menu orDefault = this.f5704.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            MenuC1177 menuC1177 = new MenuC1177(this.f5701, (InterfaceMenuC1002) menu);
            this.f5704.put(menu, menuC1177);
            return menuC1177;
        }

        @Override // p034.p050.p051.AbstractC1154.InterfaceC1155
        /* renamed from: びぐびあび */
        public boolean mo2600(AbstractC1154 abstractC1154, Menu menu) {
            return this.f5703.onCreateActionMode(m2601(abstractC1154), m2602(menu));
        }
    }

    public C1156(Context context, AbstractC1154 abstractC1154) {
        this.f5700 = context;
        this.f5699 = abstractC1154;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f5699.mo2588();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f5699.mo2593();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC1177(this.f5700, (InterfaceMenuC1002) this.f5699.mo2589());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f5699.mo2591();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f5699.mo2584();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f5699.f5697;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f5699.mo2583();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f5699.f5698;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f5699.mo2595();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f5699.mo2585();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f5699.mo2596(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f5699.mo2590(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f5699.mo2592(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f5699.f5697 = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f5699.mo2594(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f5699.mo2587(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f5699.mo2586(z);
    }
}
