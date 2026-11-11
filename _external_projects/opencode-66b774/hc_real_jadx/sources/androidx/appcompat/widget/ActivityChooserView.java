package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import p034.p035.p045.AbstractC1069;
import p034.p035.p045.C1096;
import p034.p050.C1147;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.C1268;
import p034.p050.C1285;
import p034.p050.p051.p052.InterfaceC1173;
import p034.p050.p053.AbstractViewOnTouchListenerC1249;
import p034.p050.p053.C1219;
import p034.p050.p055.p056.C1266;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final FrameLayout f314;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0066 f315;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final ImageView f316;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int f317;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f318;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f319;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f320;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ViewOnClickListenerC0062 f321;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f322;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Drawable f323;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final DataSetObserver f324;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final FrameLayout f325;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f326;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final View f327;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public ListPopupWindow f328;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final ImageView f329;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public AbstractC1069 f330;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static final int[] f331 = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int resourceId;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f331);
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C1266.m2928(context, resourceId));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$〺つふすそ, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC0061 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0061() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.m143()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                AbstractC1069 abstractC1069 = ActivityChooserView.this.f330;
                if (abstractC1069 != null) {
                    abstractC1069.m2416(true);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$ぁごぐすすぃ, reason: contains not printable characters */
    public class ViewOnClickListenerC0062 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public ViewOnClickListenerC0062() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f314) {
                activityChooserView.m145();
                ActivityChooserView.this.f315.getClass();
                throw null;
            }
            if (view != activityChooserView.f325) {
                throw new IllegalArgumentException();
            }
            activityChooserView.m146(activityChooserView.f318);
            throw null;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f320;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            AbstractC1069 abstractC1069 = ActivityChooserView.this.f330;
            if (abstractC1069 != null) {
                abstractC1069.m2416(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (((C0066) adapterView.getAdapter()).f339) {
                throw null;
            }
            ActivityChooserView.this.m145();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            activityChooserView.getClass();
            boolean z = activityChooserView.f315.f337;
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f314) {
                throw new IllegalArgumentException();
            }
            activityChooserView.f315.getClass();
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$くし〴〺ぅ, reason: contains not printable characters */
    public class C0063 extends View.AccessibilityDelegate {
        public C0063(ActivityChooserView activityChooserView) {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 19) {
                accessibilityNodeInfo.setCanOpenPopup(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0064 extends DataSetObserver {
        public C0064() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f315.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f315.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$づざかべべ, reason: contains not printable characters */
    public class C0065 extends DataSetObserver {
        public C0065() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f315.getClass();
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0066 extends BaseAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f336 = 4;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f337;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f339;

        public C0066() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (this.f339) {
                throw null;
            }
            boolean z = this.f337;
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (this.f339) {
                throw null;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (this.f339) {
                throw null;
            }
            if (view == null || view.getId() != C1268.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C1147.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            ActivityChooserView.this.getContext().getPackageManager();
            if (this.f339) {
                throw null;
            }
            throw null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$びぐびあび, reason: contains not printable characters */
    public class C0067 extends AbstractViewOnTouchListenerC1249 {
        public C0067(View view) {
            super(view);
        }

        @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
        /* renamed from: 〺つふすそ */
        public InterfaceC1173 mo89() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
        /* renamed from: くし〴〺ぅ */
        public boolean mo90() {
            ActivityChooserView.this.m144();
            return true;
        }

        @Override // p034.p050.p053.AbstractViewOnTouchListenerC1249
        /* renamed from: びぐびあび */
        public boolean mo133() {
            ActivityChooserView.this.m145();
            return true;
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f324 = new C0064();
        this.f326 = new ViewTreeObserverOnGlobalLayoutListenerC0061();
        this.f318 = 4;
        int[] iArr = C1148.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C1096.m2493(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        this.f318 = obtainStyledAttributes.getInt(C1148.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1148.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C1147.abc_activity_chooser_view, (ViewGroup) this, true);
        ViewOnClickListenerC0062 viewOnClickListenerC0062 = new ViewOnClickListenerC0062();
        this.f321 = viewOnClickListenerC0062;
        View findViewById = findViewById(C1268.activity_chooser_view_content);
        this.f327 = findViewById;
        this.f323 = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C1268.default_activity_button);
        this.f314 = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC0062);
        frameLayout.setOnLongClickListener(viewOnClickListenerC0062);
        int i2 = C1268.image;
        this.f329 = (ImageView) frameLayout.findViewById(i2);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C1268.expand_activities_button);
        frameLayout2.setOnClickListener(viewOnClickListenerC0062);
        frameLayout2.setAccessibilityDelegate(new C0063(this));
        frameLayout2.setOnTouchListener(new C0067(frameLayout2));
        this.f325 = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i2);
        this.f316 = imageView;
        imageView.setImageDrawable(drawable);
        C0066 c0066 = new C0066();
        this.f315 = c0066;
        c0066.registerDataSetObserver(new C0065());
        Resources resources = context.getResources();
        this.f317 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1285.abc_config_prefDialogWidth));
    }

    public C1219 getDataModel() {
        this.f315.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f328 == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext(), null, C1264.listPopupWindowStyle);
            this.f328 = listPopupWindow;
            listPopupWindow.mo155(this.f315);
            ListPopupWindow listPopupWindow2 = this.f328;
            listPopupWindow2.f436 = this;
            listPopupWindow2.m180(true);
            ListPopupWindow listPopupWindow3 = this.f328;
            ViewOnClickListenerC0062 viewOnClickListenerC0062 = this.f321;
            listPopupWindow3.f441 = viewOnClickListenerC0062;
            listPopupWindow3.f448.setOnDismissListener(viewOnClickListenerC0062);
        }
        return this.f328;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f315.getClass();
        this.f319 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f315.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f326);
        }
        if (m143()) {
            m145();
        }
        this.f319 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f327.layout(0, 0, i3 - i, i4 - i2);
        if (m143()) {
            return;
        }
        m145();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.f327;
        if (this.f314.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C1219 c1219) {
        C0066 c0066 = this.f315;
        ActivityChooserView.this.f315.getClass();
        if (c1219 != null && ActivityChooserView.this.isShown()) {
            DataSetObserver dataSetObserver = ActivityChooserView.this.f324;
            throw null;
        }
        c0066.notifyDataSetChanged();
        if (m143()) {
            m145();
            m144();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f322 = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f316.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f316.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f318 = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f320 = onDismissListener;
    }

    public void setProvider(AbstractC1069 abstractC1069) {
        this.f330 = abstractC1069;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean m143() {
        return getListPopupWindow().mo176();
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m144() {
        if (m143() || !this.f319) {
            return false;
        }
        m146(this.f318);
        throw null;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m145() {
        if (!m143()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f326);
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m146(int i) {
        this.f315.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }
}
