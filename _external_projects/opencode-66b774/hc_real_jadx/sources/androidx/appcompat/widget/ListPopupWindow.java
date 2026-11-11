package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p034.p035.p045.C1096;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.p051.p052.InterfaceC1173;
import p034.p050.p053.C1212;
import p034.p050.p053.C1224;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ListPopupWindow implements InterfaceC1173 {

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public static Method f425;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static Method f426;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static Method f427;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f428;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Context f429;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final Rect f430;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f431;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f432;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public boolean f433;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public DataSetObserver f434;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public Rect f435;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public View f436;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f437;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ListAdapter f438;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final ViewOnTouchListenerC0082 f439;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final C0079 f440;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public AdapterView.OnItemClickListener f441;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f442;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f443;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final RunnableC0080 f444;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f445;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f446;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final RunnableC0081 f447;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public PopupWindow f448;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C1212 f449;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final Handler f450;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f451;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f452;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f453;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$〺つふすそ, reason: contains not printable characters */
    public class C0078 extends DataSetObserver {
        public C0078() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.mo176()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$くし〴〺ぅ, reason: contains not printable characters */
    public class C0079 implements AbsListView.OnScrollListener {
        public C0079() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                if ((ListPopupWindow.this.f448.getInputMethodMode() == 2) || ListPopupWindow.this.f448.getContentView() == null) {
                    return;
                }
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f450.removeCallbacks(listPopupWindow.f447);
                ListPopupWindow.this.f447.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0080 implements Runnable {
        public RunnableC0080() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1212 c1212 = ListPopupWindow.this.f449;
            if (c1212 != null) {
                c1212.setListSelectionHidden(true);
                c1212.requestLayout();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$づざかべべ, reason: contains not printable characters */
    public class RunnableC0081 implements Runnable {
        public RunnableC0081() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1212 c1212 = ListPopupWindow.this.f449;
            if (c1212 == null || !C1096.m2507(c1212) || ListPopupWindow.this.f449.getCount() <= ListPopupWindow.this.f449.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f449.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f451) {
                listPopupWindow.f448.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$びぐびあび, reason: contains not printable characters */
    public class ViewOnTouchListenerC0082 implements View.OnTouchListener {
        public ViewOnTouchListenerC0082() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f448) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f448.getWidth() && y >= 0 && y < ListPopupWindow.this.f448.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f450.postDelayed(listPopupWindow.f447, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.f450.removeCallbacks(listPopupWindow2.f447);
            return false;
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f427 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f425 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f426 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f442 = -2;
        this.f445 = -2;
        this.f452 = 1002;
        this.f446 = 0;
        this.f451 = Integer.MAX_VALUE;
        this.f437 = 0;
        this.f447 = new RunnableC0081();
        this.f439 = new ViewOnTouchListenerC0082();
        this.f440 = new C0079();
        this.f444 = new RunnableC0080();
        this.f430 = new Rect();
        this.f429 = context;
        this.f450 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1148.ListPopupWindow, i, i2);
        this.f431 = obtainStyledAttributes.getDimensionPixelOffset(C1148.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C1148.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f428 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f432 = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f448 = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    public void dismiss() {
        this.f448.dismiss();
        this.f448.setContentView(null);
        this.f449 = null;
        this.f450.removeCallbacks(this.f447);
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    public void show() {
        int i;
        int maxAvailableHeight;
        int i2;
        int paddingBottom;
        C1212 c1212;
        if (this.f449 == null) {
            C1212 mo177 = mo177(this.f429, !this.f433);
            this.f449 = mo177;
            mo177.setAdapter(this.f438);
            this.f449.setOnItemClickListener(this.f441);
            this.f449.setFocusable(true);
            this.f449.setFocusableInTouchMode(true);
            this.f449.setOnItemSelectedListener(new C1224(this));
            this.f449.setOnScrollListener(this.f440);
            this.f448.setContentView(this.f449);
        }
        Drawable background = this.f448.getBackground();
        if (background != null) {
            background.getPadding(this.f430);
            Rect rect = this.f430;
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.f432) {
                this.f428 = -i3;
            }
        } else {
            this.f430.setEmpty();
            i = 0;
        }
        boolean z = this.f448.getInputMethodMode() == 2;
        View view = this.f436;
        int i4 = this.f428;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f426;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.f448, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            maxAvailableHeight = this.f448.getMaxAvailableHeight(view, i4);
        } else {
            maxAvailableHeight = this.f448.getMaxAvailableHeight(view, i4, z);
        }
        if (this.f442 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i5 = this.f445;
            if (i5 != -2) {
                i2 = 1073741824;
                if (i5 == -1) {
                    int i6 = this.f429.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f430;
                    i5 = i6 - (rect2.left + rect2.right);
                }
            } else {
                int i7 = this.f429.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f430;
                i5 = i7 - (rect3.left + rect3.right);
                i2 = Integer.MIN_VALUE;
            }
            int m2700 = this.f449.m2700(View.MeasureSpec.makeMeasureSpec(i5, i2), maxAvailableHeight - 0, -1);
            paddingBottom = m2700 + (m2700 > 0 ? this.f449.getPaddingBottom() + this.f449.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = this.f448.getInputMethodMode() == 2;
        C2786.m4826(this.f448, this.f452);
        if (this.f448.isShowing()) {
            if (C1096.m2507(this.f436)) {
                int i8 = this.f445;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = this.f436.getWidth();
                }
                int i9 = this.f442;
                if (i9 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.f448.setWidth(this.f445 == -1 ? -1 : 0);
                        this.f448.setHeight(0);
                    } else {
                        this.f448.setWidth(this.f445 == -1 ? -1 : 0);
                        this.f448.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    paddingBottom = i9;
                }
                this.f448.setOutsideTouchable(true);
                this.f448.update(this.f436, this.f431, this.f428, i8 < 0 ? -1 : i8, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i10 = this.f445;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.f436.getWidth();
        }
        int i11 = this.f442;
        if (i11 == -1) {
            paddingBottom = -1;
        } else if (i11 != -2) {
            paddingBottom = i11;
        }
        this.f448.setWidth(i10);
        this.f448.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f427;
            if (method2 != null) {
                try {
                    method2.invoke(this.f448, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            this.f448.setIsClippedToScreen(true);
        }
        this.f448.setOutsideTouchable(true);
        this.f448.setTouchInterceptor(this.f439);
        if (this.f443) {
            C2786.m4769(this.f448, this.f453);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f425;
            if (method3 != null) {
                try {
                    method3.invoke(this.f448, this.f435);
                } catch (Exception unused3) {
                }
            }
        } else {
            this.f448.setEpicenterBounds(this.f435);
        }
        PopupWindow popupWindow = this.f448;
        View view2 = this.f436;
        int i12 = this.f431;
        int i13 = this.f428;
        int i14 = this.f446;
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view2, i12, i13, i14);
        } else {
            if ((C2786.m4775(i14, C1096.m2491(view2)) & 7) == 5) {
                i12 -= popupWindow.getWidth() - view2.getWidth();
            }
            popupWindow.showAsDropDown(view2, i12, i13);
        }
        this.f449.setSelection(-1);
        if ((!this.f433 || this.f449.isInTouchMode()) && (c1212 = this.f449) != null) {
            c1212.setListSelectionHidden(true);
            c1212.requestLayout();
        }
        if (this.f433) {
            return;
        }
        this.f450.post(this.f444);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m175(Drawable drawable) {
        this.f448.setBackgroundDrawable(drawable);
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean mo176() {
        return this.f448.isShowing();
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public C1212 mo177(Context context, boolean z) {
        return new C1212(context, z);
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void m178(int i) {
        Drawable background = this.f448.getBackground();
        if (background == null) {
            this.f445 = i;
            return;
        }
        background.getPadding(this.f430);
        Rect rect = this.f430;
        this.f445 = rect.left + rect.right + i;
    }

    /* renamed from: おぐぴう〸ず */
    public void mo155(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f434;
        if (dataSetObserver == null) {
            this.f434 = new C0078();
        } else {
            ListAdapter listAdapter2 = this.f438;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f438 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f434);
        }
        C1212 c1212 = this.f449;
        if (c1212 != null) {
            c1212.setAdapter(this.f438);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m179() {
        return this.f431;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void m180(boolean z) {
        this.f433 = z;
        this.f448.setFocusable(z);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Drawable m181() {
        return this.f448.getBackground();
    }

    @Override // p034.p050.p051.p052.InterfaceC1173
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ListView mo182() {
        return this.f449;
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int m183() {
        if (this.f432) {
            return this.f428;
        }
        return 0;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public void m184(int i) {
        this.f428 = i;
        this.f432 = true;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public void m185(int i) {
        this.f431 = i;
    }
}
