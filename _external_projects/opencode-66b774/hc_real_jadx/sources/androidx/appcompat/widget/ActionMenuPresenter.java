package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p034.p035.p045.AbstractC1069;
import p034.p050.C1147;
import p034.p050.C1264;
import p034.p050.p051.p052.AbstractC1163;
import p034.p050.p051.p052.AbstractC1199;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1183;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1173;
import p034.p050.p051.p052.InterfaceC1186;
import p034.p050.p051.p052.InterfaceC1195;
import p034.p050.p051.p052.SubMenuC1180;
import p034.p050.p053.AbstractViewOnTouchListenerC1249;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ActionMenuPresenter extends AbstractC1163 implements AbstractC1069.InterfaceC1071 {

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public RunnableC0051 f269;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final C0054 f270;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f271;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public C0050 f272;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f273;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean f274;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f275;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final SparseBooleanArray f276;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f277;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Drawable f278;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public C0053 f279;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f280;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f281;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f282;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public C0052 f283;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f284;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public C0055 f285;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0049();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f286;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0049 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f286 = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f286);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$〺つふすそ, reason: contains not printable characters */
    public class C0050 extends ActionMenuItemView.AbstractC0042 {
        public C0050() {
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$くし〴〺ぅ, reason: contains not printable characters */
    public class RunnableC0051 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public C0053 f288;

        public RunnableC0051(C0053 c0053) {
            this.f288 = c0053;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1164.InterfaceC1166 interfaceC1166;
            C1164 c1164 = ActionMenuPresenter.this.f5762;
            if (c1164 != null && (interfaceC1166 = c1164.f5778) != null) {
                interfaceC1166.mo141(c1164);
            }
            View view = (View) ActionMenuPresenter.this.f5763;
            if (view != null && view.getWindowToken() != null && this.f288.m2655()) {
                ActionMenuPresenter.this.f279 = this.f288;
            }
            ActionMenuPresenter.this.f269 = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0052 extends C1183 {
        public C0052(Context context, SubMenuC1180 subMenuC1180, View view) {
            super(context, subMenuC1180, view, false, C1264.actionOverflowMenuStyle, 0);
            if (!subMenuC1180.f5843.m2663()) {
                View view2 = ActionMenuPresenter.this.f285;
                this.f5861 = view2 == null ? (View) ActionMenuPresenter.this.f5763 : view2;
            }
            m2656(ActionMenuPresenter.this.f270);
        }

        @Override // p034.p050.p051.p052.C1183
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public void mo130() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f283 = null;
            actionMenuPresenter.f282 = 0;
            super.mo130();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$づざかべべ, reason: contains not printable characters */
    public class C0053 extends C1183 {
        public C0053(Context context, C1164 c1164, View view, boolean z) {
            super(context, c1164, view, z, C1264.actionOverflowMenuStyle, 0);
            this.f5855 = 8388613;
            m2656(ActionMenuPresenter.this.f270);
        }

        @Override // p034.p050.p051.p052.C1183
        /* renamed from: くし〴〺ぅ */
        public void mo130() {
            C1164 c1164 = ActionMenuPresenter.this.f5762;
            if (c1164 != null) {
                c1164.m2619(true);
            }
            ActionMenuPresenter.this.f279 = null;
            super.mo130();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0054 implements InterfaceC1186.InterfaceC1187 {
        public C0054() {
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean mo131(C1164 c1164) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (c1164 == actionMenuPresenter.f5762) {
                return false;
            }
            actionMenuPresenter.f282 = ((SubMenuC1180) c1164).f5843.f5922;
            InterfaceC1186.InterfaceC1187 interfaceC1187 = actionMenuPresenter.f5761;
            if (interfaceC1187 != null) {
                return interfaceC1187.mo131(c1164);
            }
            return false;
        }

        @Override // p034.p050.p051.p052.InterfaceC1186.InterfaceC1187
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo132(C1164 c1164, boolean z) {
            if (c1164 instanceof SubMenuC1180) {
                c1164.mo2637().m2619(false);
            }
            InterfaceC1186.InterfaceC1187 interfaceC1187 = ActionMenuPresenter.this.f5761;
            if (interfaceC1187 != null) {
                interfaceC1187.mo132(c1164, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$びぐびあび, reason: contains not printable characters */
    public class C0055 extends AppCompatImageView implements ActionMenuView.InterfaceC0059 {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0056 extends AbstractViewOnTouchListenerC1249 {
            public C0056(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
            /* renamed from: 〺つふすそ */
            public InterfaceC1173 mo89() {
                C0053 c0053 = ActionMenuPresenter.this.f279;
                if (c0053 == null) {
                    return null;
                }
                return c0053.m2653();
            }

            @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
            /* renamed from: くし〴〺ぅ */
            public boolean mo90() {
                ActionMenuPresenter.this.m120();
                return true;
            }

            @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
            /* renamed from: びぐびあび, reason: contains not printable characters */
            public boolean mo133() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f269 != null) {
                    return false;
                }
                actionMenuPresenter.m126();
                return true;
            }
        }

        public C0055(Context context) {
            super(context, null, C1264.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C2786.m4764(this, getContentDescription());
            setOnTouchListener(new C0056(this, ActionMenuPresenter.this));
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m120();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C2786.m4777(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0059
        /* renamed from: 〺つふすそ */
        public boolean mo83() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0059
        /* renamed from: げつ〴ぬぐ */
        public boolean mo85() {
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C1147.abc_action_menu_layout, C1147.abc_action_menu_item_layout);
        this.f276 = new SparseBooleanArray();
        this.f270 = new C0054();
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean mo117() {
        ArrayList<C1197> arrayList;
        int i;
        int i2;
        boolean z;
        C1164 c1164 = this.f5762;
        if (c1164 != null) {
            arrayList = c1164.m2625();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.f277;
        int i4 = this.f273;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f5763;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C1197 c1197 = arrayList.get(i5);
            int i8 = c1197.f5918;
            if ((i8 & 2) == 2) {
                i7++;
            } else if ((i8 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.f281 && c1197.f5929) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f284 && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i9 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.f276;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C1197 c11972 = arrayList.get(i10);
            int i12 = c11972.f5918;
            if ((i12 & 2) == i2) {
                View m125 = m125(c11972, null, viewGroup);
                m125.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m125.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = c11972.f5911;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c11972.m2666(z);
            } else if ((i12 & 1) == z) {
                int i14 = c11972.f5911;
                boolean z3 = sparseBooleanArray.get(i14);
                boolean z4 = (i9 > 0 || z3) && i4 > 0;
                if (z4) {
                    View m1252 = m125(c11972, null, viewGroup);
                    m1252.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = m1252.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 &= i4 + i11 > 0;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z3) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i10; i15++) {
                        C1197 c11973 = arrayList.get(i15);
                        if (c11973.f5911 == i14) {
                            if (c11973.m2663()) {
                                i9++;
                            }
                            c11973.m2666(false);
                        }
                    }
                }
                if (z4) {
                    i9--;
                }
                c11972.m2666(z4);
            } else {
                c11972.m2666(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return true;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m118() {
        return m126() | m128();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void mo119(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f5763;
        ArrayList<C1197> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            C1164 c1164 = this.f5762;
            if (c1164 != null) {
                c1164.m2636();
                ArrayList<C1197> m2625 = this.f5762.m2625();
                int size = m2625.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1197 c1197 = m2625.get(i2);
                    if (c1197.m2663()) {
                        View childAt = viewGroup.getChildAt(i);
                        C1197 itemData = childAt instanceof InterfaceC1195.InterfaceC1196 ? ((InterfaceC1195.InterfaceC1196) childAt).getItemData() : null;
                        View m125 = m125(c1197, childAt, viewGroup);
                        if (c1197 != itemData) {
                            m125.setPressed(false);
                            m125.jumpDrawablesToCurrentState();
                        }
                        if (m125 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) m125.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(m125);
                            }
                            ((ViewGroup) this.f5763).addView(m125, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f285) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f5763).requestLayout();
        C1164 c11642 = this.f5762;
        if (c11642 != null) {
            c11642.m2636();
            ArrayList<C1197> arrayList2 = c11642.f5787;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC1069 abstractC1069 = arrayList2.get(i3).f5934;
                if (abstractC1069 != null) {
                    abstractC1069.f5530 = this;
                }
            }
        }
        C1164 c11643 = this.f5762;
        if (c11643 != null) {
            c11643.m2636();
            arrayList = c11643.f5769;
        }
        if (this.f284 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f5929;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        C0055 c0055 = this.f285;
        if (z3) {
            if (c0055 == null) {
                this.f285 = new C0055(this.f5756);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f285.getParent();
            if (viewGroup3 != this.f5763) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f285);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f5763;
                C0055 c00552 = this.f285;
                ActionMenuView.LayoutParams generateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f309 = true;
                actionMenuView.addView(c00552, generateDefaultLayoutParams);
            }
        } else if (c0055 != null) {
            Object parent = c0055.getParent();
            Object obj = this.f5763;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f285);
            }
        }
        ((ActionMenuView) this.f5763).setOverflowReserved(this.f284);
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean m120() {
        C1164 c1164;
        if (!this.f284 || m121() || (c1164 = this.f5762) == null || this.f5763 == null || this.f269 != null) {
            return false;
        }
        c1164.m2636();
        if (c1164.f5769.isEmpty()) {
            return false;
        }
        RunnableC0051 runnableC0051 = new RunnableC0051(new C0053(this.f5759, this.f5762, this.f285, true));
        this.f269 = runnableC0051;
        ((View) this.f5763).post(runnableC0051);
        return true;
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public boolean m121() {
        C0053 c0053 = this.f279;
        return c0053 != null && c0053.m2652();
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo122(Context context, C1164 c1164) {
        this.f5759 = context;
        LayoutInflater.from(context);
        this.f5762 = c1164;
        Resources resources = context.getResources();
        if (!this.f274) {
            this.f284 = Build.VERSION.SDK_INT < 19 ? true ^ ViewConfiguration.get(context).hasPermanentMenuKey() : true;
        }
        int i = 2;
        this.f271 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f277 = i;
        int i4 = this.f271;
        if (this.f284) {
            if (this.f285 == null) {
                C0055 c0055 = new C0055(this.f5756);
                this.f285 = c0055;
                if (this.f280) {
                    c0055.setImageDrawable(this.f278);
                    this.f278 = null;
                    this.f280 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f285.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f285.getMeasuredWidth();
        } else {
            this.f285 = null;
        }
        this.f273 = i4;
        this.f275 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo123(C1164 c1164, boolean z) {
        m118();
        InterfaceC1186.InterfaceC1187 interfaceC1187 = this.f5761;
        if (interfaceC1187 != null) {
            interfaceC1187.mo132(c1164, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean mo124(SubMenuC1180 subMenuC1180) {
        boolean z = false;
        if (!subMenuC1180.hasVisibleItems()) {
            return false;
        }
        SubMenuC1180 subMenuC11802 = subMenuC1180;
        while (true) {
            C1164 c1164 = subMenuC11802.f5842;
            if (c1164 == this.f5762) {
                break;
            }
            subMenuC11802 = (SubMenuC1180) c1164;
        }
        C1197 c1197 = subMenuC11802.f5843;
        ViewGroup viewGroup = (ViewGroup) this.f5763;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC1195.InterfaceC1196) && ((InterfaceC1195.InterfaceC1196) childAt).getItemData() == c1197) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f282 = subMenuC1180.f5843.f5922;
        int size = subMenuC1180.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = subMenuC1180.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C0052 c0052 = new C0052(this.f5759, subMenuC1180, view);
        this.f283 = c0052;
        c0052.f5853 = z;
        AbstractC1199 abstractC1199 = c0052.f5856;
        if (abstractC1199 != null) {
            abstractC1199.mo2639(z);
        }
        if (!this.f283.m2655()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        InterfaceC1186.InterfaceC1187 interfaceC1187 = this.f5761;
        if (interfaceC1187 != null) {
            interfaceC1187.mo131(subMenuC1180);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [づざかべべ.〺つふすそ.ぇぬぎばつ.ぺぁあねじ.へぬ〴づぞ$げつ〴ぬぐ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public View m125(C1197 c1197, View view, ViewGroup viewGroup) {
        View actionView = c1197.getActionView();
        if (actionView == null || c1197.m2667()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1195.InterfaceC1196 ? (InterfaceC1195.InterfaceC1196) view : (InterfaceC1195.InterfaceC1196) this.f5760.inflate(this.f5755, viewGroup, false);
            actionMenuItemView.mo88(c1197, 0);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f5763);
            if (this.f272 == null) {
                this.f272 = new C0050();
            }
            actionMenuItemView2.setPopupCallback(this.f272);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c1197.f5929 ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean m126() {
        Object obj;
        RunnableC0051 runnableC0051 = this.f269;
        if (runnableC0051 != null && (obj = this.f5763) != null) {
            ((View) obj).removeCallbacks(runnableC0051);
            this.f269 = null;
            return true;
        }
        C0053 c0053 = this.f279;
        if (c0053 == null) {
            return false;
        }
        if (c0053.m2652()) {
            c0053.f5856.dismiss();
        }
        return true;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void mo127(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f286) > 0 && (findItem = this.f5762.findItem(i)) != null) {
            mo124((SubMenuC1180) findItem.getSubMenu());
        }
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean m128() {
        C0052 c0052 = this.f283;
        if (c0052 == null) {
            return false;
        }
        if (!c0052.m2652()) {
            return true;
        }
        c0052.f5856.dismiss();
        return true;
    }

    @Override // p034.p050.p051.p052.InterfaceC1186
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Parcelable mo129() {
        SavedState savedState = new SavedState();
        savedState.f286 = this.f282;
        return savedState;
    }
}
