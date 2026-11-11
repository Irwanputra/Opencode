package p131.p161.p162.p163.p185;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p051.p052.SubMenuC1180;
import p034.p065.p066.C1369;
import p131.p161.p162.p163.C2110;
import p131.p161.p162.p163.C2324;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2272 implements InterfaceC1186 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f9466;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public NavigationMenuView f9467;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public LayoutInflater f9468;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ColorStateList f9469;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f9470;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f9472;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public LinearLayout f9473;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f9474;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f9476;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f9477;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Drawable f9478;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C2277 f9480;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f9481;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f9482;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1164 f9483;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f9484;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f9485;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public ColorStateList f9486;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f9471 = true;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f9475 = -1;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final View.OnClickListener f9479 = new ViewOnClickListenerC2278();

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C2273 extends C1369 {
        public C2273(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // p034.p065.p066.C1369, p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            super.mo431(view, c1084);
            C2277 c2277 = C2272.this.f9480;
            int i = C2272.this.f9473.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C2272.this.f9480.mo888(); i2++) {
                if (C2272.this.f9480.mo887(i2) == 0) {
                    i++;
                }
            }
            c1084.m2456(Build.VERSION.SDK_INT >= 19 ? new C1084.C1085(AccessibilityNodeInfo.CollectionInfo.obtain(i, 0, false)) : new C1084.C1085(null));
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$〺つふすそ, reason: contains not printable characters */
    public static class C2274 extends AbstractC2280 {
        public C2274(View view) {
            super(view);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$ぁごぐすすぃ, reason: contains not printable characters */
    public static class C2275 implements InterfaceC2279 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f9488;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final C1197 f9489;

        public C2275(C1197 c1197) {
            this.f9489 = c1197;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$いいにぽつ, reason: contains not printable characters */
    public static class C2276 extends AbstractC2280 {
        public C2276(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C2110.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$くし〴〺ぅ, reason: contains not printable characters */
    public class C2277 extends RecyclerView.AbstractC0228<AbstractC2280> {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final ArrayList<InterfaceC2279> f9490 = new ArrayList<>();

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public boolean f9491;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public C1197 f9493;

        public C2277() {
            m4445();
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public void m4444(C1197 c1197) {
            if (this.f9493 == c1197 || !c1197.isCheckable()) {
                return;
            }
            C1197 c11972 = this.f9493;
            if (c11972 != null) {
                c11972.setChecked(false);
            }
            this.f9493 = c1197;
            c1197.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
        /* renamed from: 〺つふすそ */
        public long mo886(int i) {
            return i;
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final void m4445() {
            if (this.f9491) {
                return;
            }
            this.f9491 = true;
            this.f9490.clear();
            this.f9490.add(new C2282());
            int i = -1;
            int size = C2272.this.f9483.m2625().size();
            boolean z = false;
            int i2 = 0;
            boolean z2 = false;
            int i3 = 0;
            while (i2 < size) {
                C1197 c1197 = C2272.this.f9483.m2625().get(i2);
                if (c1197.isChecked()) {
                    m4444(c1197);
                }
                if (c1197.isCheckable()) {
                    c1197.m2672(z);
                }
                if (c1197.hasSubMenu()) {
                    SubMenuC1180 subMenuC1180 = c1197.f5920;
                    if (subMenuC1180.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.f9490.add(new C2281(C2272.this.f9474, z ? 1 : 0));
                        }
                        this.f9490.add(new C2275(c1197));
                        int size2 = subMenuC1180.size();
                        int i4 = 0;
                        boolean z3 = false;
                        while (i4 < size2) {
                            C1197 c11972 = (C1197) subMenuC1180.getItem(i4);
                            if (c11972.isVisible()) {
                                if (!z3 && c11972.getIcon() != null) {
                                    z3 = true;
                                }
                                if (c11972.isCheckable()) {
                                    c11972.m2672(z);
                                }
                                if (c1197.isChecked()) {
                                    m4444(c1197);
                                }
                                this.f9490.add(new C2275(c11972));
                            }
                            i4++;
                            z = false;
                        }
                        if (z3) {
                            int size3 = this.f9490.size();
                            for (int size4 = this.f9490.size(); size4 < size3; size4++) {
                                ((C2275) this.f9490.get(size4)).f9488 = true;
                            }
                        }
                    }
                } else {
                    int i5 = c1197.f5911;
                    if (i5 != i) {
                        i3 = this.f9490.size();
                        z2 = c1197.getIcon() != null;
                        if (i2 != 0) {
                            i3++;
                            ArrayList<InterfaceC2279> arrayList = this.f9490;
                            int i6 = C2272.this.f9474;
                            arrayList.add(new C2281(i6, i6));
                        }
                    } else if (!z2 && c1197.getIcon() != null) {
                        int size5 = this.f9490.size();
                        for (int i7 = i3; i7 < size5; i7++) {
                            ((C2275) this.f9490.get(i7)).f9488 = true;
                        }
                        z2 = true;
                    }
                    C2275 c2275 = new C2275(c1197);
                    c2275.f9488 = z2;
                    this.f9490.add(c2275);
                    i = i5;
                }
                i2++;
                z = false;
            }
            this.f9491 = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
        /* renamed from: くし〴〺ぅ */
        public int mo887(int i) {
            InterfaceC2279 interfaceC2279 = this.f9490.get(i);
            if (interfaceC2279 instanceof C2281) {
                return 2;
            }
            if (interfaceC2279 instanceof C2282) {
                return 3;
            }
            if (interfaceC2279 instanceof C2275) {
                return ((C2275) interfaceC2279).f9489.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
        /* renamed from: げつ〴ぬぐ */
        public int mo888() {
            return this.f9490.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
        /* renamed from: づざかべべ */
        public AbstractC2280 mo889(ViewGroup viewGroup, int i) {
            AbstractC2280 c2283;
            if (i == 0) {
                C2272 c2272 = C2272.this;
                c2283 = new C2283(c2272.f9468, viewGroup, c2272.f9479);
            } else if (i == 1) {
                c2283 = new C2284(C2272.this.f9468, viewGroup);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new C2274(C2272.this.f9473);
                }
                c2283 = new C2276(C2272.this.f9468, viewGroup);
            }
            return c2283;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
        /* renamed from: なぎぱいぢぎ */
        public void mo890(AbstractC2280 abstractC2280) {
            AbstractC2280 abstractC22802 = abstractC2280;
            if (abstractC22802 instanceof C2283) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC22802.f1476;
                FrameLayout frameLayout = navigationMenuItemView.f3338;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f3333.setCompoundDrawables(null, null, null, null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
        /* renamed from: びぐびあび */
        public void mo891(AbstractC2280 abstractC2280, int i) {
            AbstractC2280 abstractC22802 = abstractC2280;
            int mo887 = mo887(i);
            if (mo887 != 0) {
                if (mo887 == 1) {
                    ((TextView) abstractC22802.f1476).setText(((C2275) this.f9490.get(i)).f9489.f5926);
                    return;
                } else {
                    if (mo887 != 2) {
                        return;
                    }
                    C2281 c2281 = (C2281) this.f9490.get(i);
                    abstractC22802.f1476.setPadding(0, c2281.f9496, 0, c2281.f9495);
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC22802.f1476;
            navigationMenuItemView.setIconTintList(C2272.this.f9486);
            C2272 c2272 = C2272.this;
            if (c2272.f9485) {
                navigationMenuItemView.setTextAppearance(c2272.f9466);
            }
            ColorStateList colorStateList = C2272.this.f9469;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = C2272.this.f9478;
            Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                navigationMenuItemView.setBackground(newDrawable);
            } else {
                navigationMenuItemView.setBackgroundDrawable(newDrawable);
            }
            C2275 c2275 = (C2275) this.f9490.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(c2275.f9488);
            navigationMenuItemView.setHorizontalPadding(C2272.this.f9481);
            navigationMenuItemView.setIconPadding(C2272.this.f9484);
            C2272 c22722 = C2272.this;
            if (c22722.f9470) {
                navigationMenuItemView.setIconSize(c22722.f9472);
            }
            navigationMenuItemView.setMaxLines(C2272.this.f9476);
            navigationMenuItemView.mo88(c2275.f9489, 0);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC2278 implements View.OnClickListener {
        public ViewOnClickListenerC2278() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            C2272.this.m4442(true);
            C1197 itemData = ((NavigationMenuItemView) view).getItemData();
            C2272 c2272 = C2272.this;
            boolean m2631 = c2272.f9483.m2631(itemData, c2272, 0);
            if (itemData != null && itemData.isCheckable() && m2631) {
                C2272.this.f9480.m4444(itemData);
            } else {
                z = false;
            }
            C2272.this.m4442(false);
            if (z) {
                C2272.this.mo119(false);
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC2279 {
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$てぜきぽく, reason: contains not printable characters */
    public static abstract class AbstractC2280 extends RecyclerView.AbstractC0207 {
        public AbstractC2280(View view) {
            super(view);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$なぎぱいぢぎ, reason: contains not printable characters */
    public static class C2281 implements InterfaceC2279 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final int f9495;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final int f9496;

        public C2281(int i, int i2) {
            this.f9496 = i;
            this.f9495 = i2;
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$びぐびあび, reason: contains not printable characters */
    public static class C2282 implements InterfaceC2279 {
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$ぺぁあねじ, reason: contains not printable characters */
    public static class C2283 extends AbstractC2280 {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C2283(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.view.View.OnClickListener r5) {
            /*
                r2 = this;
                int r0 = p131.p161.p162.p163.C2110.design_navigation_item
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p185.C2272.C2283.<init>(android.view.LayoutInflater, android.view.ViewGroup, android.view.View$OnClickListener):void");
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.びぐびあび$ぺふねづ〺, reason: contains not printable characters */
    public static class C2284 extends AbstractC2280 {
        public C2284(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C2110.design_navigation_item_subheader, viewGroup, false));
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    public int getId() {
        return this.f9477;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: 〳ぜぞぜべっ */
    public boolean mo117() {
        return false;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4440(int i) {
        this.f9481 = i;
        mo119(false);
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぁごぐすすぃ */
    public void mo119(boolean z) {
        C2277 c2277 = this.f9480;
        if (c2277 != null) {
            c2277.m4445();
            c2277.f1556.m810();
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
        this.f9468 = LayoutInflater.from(context);
        this.f9483 = c1164;
        this.f9474 = context.getResources().getDimensionPixelOffset(C2324.design_navigation_separator_vertical_padding);
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: げつ〴ぬぐ */
    public void mo123(C1164 c1164, boolean z) {
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: づざかべべ */
    public boolean mo124(SubMenuC1180 subMenuC1180) {
        return false;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public void m4441(int i) {
        this.f9484 = i;
        mo119(false);
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public void m4442(boolean z) {
        C2277 c2277 = this.f9480;
        if (c2277 != null) {
            c2277.f9491 = z;
        }
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: びぐびあび */
    public void mo127(Parcelable parcelable) {
        C1197 c1197;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        C1197 c11972;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f9467.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C2277 c2277 = this.f9480;
                c2277.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    c2277.f9491 = true;
                    int size = c2277.f9490.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        InterfaceC2279 interfaceC2279 = c2277.f9490.get(i2);
                        if ((interfaceC2279 instanceof C2275) && (c11972 = ((C2275) interfaceC2279).f9489) != null && c11972.f5922 == i) {
                            c2277.m4444(c11972);
                            break;
                        }
                        i2++;
                    }
                    c2277.f9491 = false;
                    c2277.m4445();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = c2277.f9490.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        InterfaceC2279 interfaceC22792 = c2277.f9490.get(i3);
                        if ((interfaceC22792 instanceof C2275) && (c1197 = ((C2275) interfaceC22792).f9489) != null && (actionView = c1197.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(c1197.f5922)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f9473.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final void m4443() {
        int i = (this.f9473.getChildCount() == 0 && this.f9471) ? this.f9482 : 0;
        NavigationMenuView navigationMenuView = this.f9467;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺぁあねじ */
    public Parcelable mo129() {
        Bundle bundle = new Bundle();
        if (this.f9467 != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f9467.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C2277 c2277 = this.f9480;
        if (c2277 != null) {
            c2277.getClass();
            Bundle bundle2 = new Bundle();
            C1197 c1197 = c2277.f9493;
            if (c1197 != null) {
                bundle2.putInt("android:menu:checked", c1197.f5922);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = c2277.f9490.size();
            for (int i = 0; i < size; i++) {
                InterfaceC2279 interfaceC2279 = c2277.f9490.get(i);
                if (interfaceC2279 instanceof C2275) {
                    C1197 c11972 = ((C2275) interfaceC2279).f9489;
                    View actionView = c11972 != null ? c11972.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(c11972.f5922, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f9473 != null) {
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>();
            this.f9473.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺふねづ〺 */
    public boolean mo243(C1164 c1164, C1197 c1197) {
        return false;
    }
}
