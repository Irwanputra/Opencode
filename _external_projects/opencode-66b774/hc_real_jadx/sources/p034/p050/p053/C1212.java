package p034.p050.p053;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p034.p035.p047.C1125;
import p034.p050.C1264;
import p034.p050.p057.p058.C1273;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1212 extends ListView {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Field f5990;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Rect f5991;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f5992;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f5993;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f5994;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f5995;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f5996;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f5997;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C1125 f5998;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f5999;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public RunnableC1213 f6000;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1214 f6001;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f6002;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぉざぅち〻$〺つふすそ, reason: contains not printable characters */
    public class RunnableC1213 implements Runnable {
        public RunnableC1213() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1212 c1212 = C1212.this;
            c1212.f6000 = null;
            c1212.drawableStateChanged();
        }
    }

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぉざぅち〻$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1214 extends C1273 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f6004;

        public C1214(Drawable drawable) {
            super(drawable);
            this.f6004 = true;
        }

        @Override // p034.p050.p057.p058.C1273, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f6004) {
                this.f6223.draw(canvas);
            }
        }

        @Override // p034.p050.p057.p058.C1273, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f6004) {
                C2786.m4821(this.f6223, f, f2);
            }
        }

        @Override // p034.p050.p057.p058.C1273, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f6004) {
                C2786.m4777(this.f6223, i, i2, i3, i4);
            }
        }

        @Override // p034.p050.p057.p058.C1273, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f6004) {
                return this.f6223.setState(iArr);
            }
            return false;
        }

        @Override // p034.p050.p057.p058.C1273, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f6004) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public C1212(Context context, boolean z) {
        super(context, null, C1264.dropDownListViewStyle);
        this.f5991 = new Rect();
        this.f5994 = 0;
        this.f5999 = 0;
        this.f5995 = 0;
        this.f5997 = 0;
        this.f6002 = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f5990 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private void setSelectorEnabled(boolean z) {
        C1214 c1214 = this.f6001;
        if (c1214 != null) {
            c1214.f6004 = z;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f5991.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f5991);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f6000 != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m2699();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f6002 || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f6002 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f6002 || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f6002 && this.f5993) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f6000 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f6000 == null) {
            RunnableC1213 runnableC1213 = new RunnableC1213();
            this.f6000 = runnableC1213;
            post(runnableC1213);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m2699();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5992 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1213 runnableC1213 = this.f6000;
        if (runnableC1213 != null) {
            C1212 c1212 = C1212.this;
            c1212.f6000 = null;
            c1212.removeCallbacks(runnableC1213);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f5993 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1214 c1214 = drawable != null ? new C1214(drawable) : null;
        this.f6001 = c1214;
        super.setSelector(c1214);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5994 = rect.left;
        this.f5999 = rect.top;
        this.f5995 = rect.right;
        this.f5997 = rect.bottom;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r2 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0142  */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2698(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1212.m2698(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m2699() {
        Drawable selector = getSelector();
        if (selector != null && this.f5996 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m2700(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i4;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < count) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return (i3 < 0 || i5 <= i3 || i7 <= 0 || i4 == i2) ? i2 : i7;
            }
            if (i3 >= 0 && i5 >= i3) {
                i7 = i4;
            }
            i5++;
        }
        return i4;
    }
}
