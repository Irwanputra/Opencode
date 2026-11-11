package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p034.p035.p042.C1052;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.p166.C2114;
import p131.p161.p162.p163.p166.C2128;
import p131.p161.p162.p163.p166.C2131;
import p131.p161.p162.p163.p166.C2142;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Calendar f3248;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0433 extends C1102 {
        public C0433(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            c1084.m2456(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3248 = C2131.m4222();
        if (C2142.m4229(getContext())) {
            setNextFocusLeftId(C2248.cancel_button);
            setNextFocusRightId(C2248.confirm_button);
        }
        C1096.m2490(this, new C0433(this));
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int m4217;
        int width;
        int m42172;
        int width2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C2128 adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f8952;
        C2114 c2114 = adapter.f8954;
        Long item = adapter.getItem(adapter.m4217());
        Long item2 = adapter.getItem(adapter.m4216());
        for (C1052<Long, Long> c1052 : dateSelector.m1402()) {
            Long l = c1052.f5499;
            if (l != null) {
                if (c1052.f5498 == null) {
                    continue;
                } else {
                    long longValue = l.longValue();
                    long longValue2 = c1052.f5498.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    int i = 1;
                    if (item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue()) {
                        return;
                    }
                    if (longValue < item.longValue()) {
                        m4217 = adapter.m4217();
                        width = m4217 % adapter.f8951.f3253 == 0 ? 0 : materialCalendarGridView.getChildAt(m4217 - 1).getRight();
                    } else {
                        materialCalendarGridView.f3248.setTimeInMillis(longValue);
                        m4217 = (materialCalendarGridView.f3248.get(5) - 1) + adapter.m4217();
                        View childAt = materialCalendarGridView.getChildAt(m4217);
                        width = (childAt.getWidth() / 2) + childAt.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        m42172 = Math.min(adapter.m4216(), getChildCount() - 1);
                        width2 = (m42172 + 1) % adapter.f8951.f3253 == 0 ? getWidth() : materialCalendarGridView.getChildAt(m42172).getRight();
                    } else {
                        materialCalendarGridView.f3248.setTimeInMillis(longValue2);
                        m42172 = (materialCalendarGridView.f3248.get(5) - 1) + adapter.m4217();
                        View childAt2 = materialCalendarGridView.getChildAt(m42172);
                        width2 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                    }
                    int itemId = (int) adapter.getItemId(m4217);
                    int itemId2 = (int) adapter.getItemId(m42172);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - i;
                        View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > m4217 ? 0 : width, childAt3.getTop() + c2114.f8920.f8936.top, m42172 > numColumns2 ? getWidth() : width2, childAt3.getBottom() - c2114.f8920.f8936.bottom, c2114.f8916);
                        itemId++;
                        i = 1;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int m4217;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            m4217 = getAdapter().m4216();
        } else {
            if (i != 130) {
                super.onFocusChanged(true, i, rect);
                return;
            }
            m4217 = getAdapter().m4217();
        }
        setSelection(m4217);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m4217()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().m4217());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C2128)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C2128.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().m4217()) {
            i = getAdapter().m4217();
        }
        super.setSelection(i);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C2128 getAdapter2() {
        return (C2128) super.getAdapter();
    }
}
