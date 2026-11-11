package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;
import p034.p105.p106.AbstractC1780;
import p034.p105.p106.AbstractC1788;
import p034.p105.p106.LayoutInflaterFactory2C1815;
import p131.p155.p156.p157.C2098;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f1260;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ArrayList<C0175> f1261;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public TabHost.OnTabChangeListener f1262;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public FrameLayout f1263;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public AbstractC1780 f1264;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f1265;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Context f1266;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0174();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public String f1267;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0174 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1267 = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("FragmentTabHost.SavedState{");
            m4207.append(Integer.toHexString(System.identityHashCode(this)));
            m4207.append(" curTab=");
            return C2098.m4198(m4207, this.f1267, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1267);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0175 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Fragment f1268;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f1261 = new ArrayList<>();
        m555(context, null);
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1261 = new ArrayList<>();
        m555(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f1261.size();
        for (int i = 0; i < size; i++) {
            C0175 c0175 = this.f1261.get(i);
            AbstractC1780 abstractC1780 = this.f1264;
            c0175.getClass();
            Fragment mo3822 = abstractC1780.mo3822(null);
            c0175.f1268 = mo3822;
            if (mo3822 != null && !mo3822.f1210) {
                throw null;
            }
        }
        this.f1260 = true;
        AbstractC1788 m554 = m554(currentTabTag, null);
        if (m554 != null) {
            m554.mo3837();
            LayoutInflaterFactory2C1815 layoutInflaterFactory2C1815 = (LayoutInflaterFactory2C1815) this.f1264;
            layoutInflaterFactory2C1815.m3931();
            layoutInflaterFactory2C1815.m3903();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1260 = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f1267);
    }

    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1267 = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        AbstractC1788 m554;
        if (this.f1260 && (m554 = m554(str, null)) != null) {
            m554.mo3837();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f1262;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f1262 = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, AbstractC1780 abstractC1780) {
        m553(context);
        super.setup();
        this.f1266 = context;
        this.f1264 = abstractC1780;
        m552();
    }

    @Deprecated
    public void setup(Context context, AbstractC1780 abstractC1780, int i) {
        m553(context);
        super.setup();
        this.f1266 = context;
        this.f1264 = abstractC1780;
        this.f1265 = i;
        m552();
        this.f1263.setId(i);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m552() {
        if (this.f1263 == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f1265);
            this.f1263 = frameLayout;
            if (frameLayout != null) {
                return;
            }
            StringBuilder m4207 = C2098.m4207("No tab content FrameLayout found for id ");
            m4207.append(this.f1265);
            throw new IllegalStateException(m4207.toString());
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m553(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f1263 = frameLayout2;
            frameLayout2.setId(this.f1265);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final AbstractC1788 m554(String str, AbstractC1788 abstractC1788) {
        if (this.f1261.size() <= 0) {
            return null;
        }
        this.f1261.get(0).getClass();
        throw null;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m555(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f1265 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }
}
