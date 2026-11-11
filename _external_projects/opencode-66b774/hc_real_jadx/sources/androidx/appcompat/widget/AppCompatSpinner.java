package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import p034.p035.p045.C1096;
import p034.p035.p045.InterfaceC1119;
import p034.p050.C1264;
import p034.p050.p053.AbstractViewOnTouchListenerC1249;
import p034.p050.p053.C1212;
import p034.p050.p053.C1253;
import p034.p050.p053.InterfaceC1244;
import p034.p050.p055.p056.C1266;
import p034.p050.p060.DialogInterfaceC1343;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AppCompatSpinner extends Spinner implements InterfaceC1119 {

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final int[] f365 = {R.attr.spinnerMode};

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f366;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1253 f367;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public InterfaceC0072 f368;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Context f369;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public SpinnerAdapter f370;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean f371;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public AbstractViewOnTouchListenerC1249 f372;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Rect f373;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0068();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f374;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0068 implements Parcelable.Creator<SavedState> {
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
            this.f374 = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f374 ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$〺つふすそ, reason: contains not printable characters */
    public class DialogInterfaceOnClickListenerC0069 implements InterfaceC0072, DialogInterface.OnClickListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public DialogInterfaceC1343 f375;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ListAdapter f376;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public CharSequence f378;

        public DialogInterfaceOnClickListenerC0069() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        public void dismiss() {
            DialogInterfaceC1343 dialogInterfaceC1343 = this.f375;
            if (dialogInterfaceC1343 != null) {
                dialogInterfaceC1343.dismiss();
                this.f375 = null;
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f376.getItemId(i));
            }
            DialogInterfaceC1343 dialogInterfaceC1343 = this.f375;
            if (dialogInterfaceC1343 != null) {
                dialogInterfaceC1343.dismiss();
                this.f375 = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public void mo151(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean mo152() {
            DialogInterfaceC1343 dialogInterfaceC1343 = this.f375;
            if (dialogInterfaceC1343 != null) {
                return dialogInterfaceC1343.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public void mo153(CharSequence charSequence) {
            this.f378 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: いいにぽつ, reason: contains not printable characters */
        public void mo154(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public void mo155(ListAdapter listAdapter) {
            this.f376 = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public int mo156() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: づざかべべ, reason: contains not printable characters */
        public Drawable mo157() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: てぜきぽく, reason: contains not printable characters */
        public void mo158(int i, int i2) {
            if (this.f376 == null) {
                return;
            }
            DialogInterfaceC1343.C1344 c1344 = new DialogInterfaceC1343.C1344(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f378;
            if (charSequence != null) {
                c1344.f6452.f174 = charSequence;
            }
            ListAdapter listAdapter = this.f376;
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            AlertController.C0038 c0038 = c1344.f6452;
            c0038.f175 = listAdapter;
            c0038.f166 = this;
            c0038.f169 = selectedItemPosition;
            c0038.f165 = true;
            DialogInterfaceC1343 m3031 = c1344.m3031();
            this.f375 = m3031;
            ListView listView = m3031.f6450.f118;
            if (Build.VERSION.SDK_INT >= 17) {
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
            }
            this.f375.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: のぷのちつ, reason: contains not printable characters */
        public int mo159() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
        public CharSequence mo160() {
            return this.f378;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: ぺぁあねじ, reason: contains not printable characters */
        public void mo161(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: ぺふねづ〺, reason: contains not printable characters */
        public void mo162(int i) {
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0070 implements ListAdapter, SpinnerAdapter {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public SpinnerAdapter f379;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public ListAdapter f380;

        public C0070(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f379 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f380 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof InterfaceC1244) {
                    InterfaceC1244 interfaceC1244 = (InterfaceC1244) spinnerAdapter;
                    if (interfaceC1244.getDropDownViewTheme() == null) {
                        interfaceC1244.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f380;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f379;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f379;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f379;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f379;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f379;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f379;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f380;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f379;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f379;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC0071 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0071() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo152()) {
                AppCompatSpinner.this.m149();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC0072 {
        void dismiss();

        /* renamed from: 〳ぜぞぜべっ */
        void mo151(Drawable drawable);

        /* renamed from: 〺つふすそ */
        boolean mo152();

        /* renamed from: ぁごぐすすぃ */
        void mo153(CharSequence charSequence);

        /* renamed from: いいにぽつ */
        void mo154(int i);

        /* renamed from: おぐぴう〸ず */
        void mo155(ListAdapter listAdapter);

        /* renamed from: げつ〴ぬぐ */
        int mo156();

        /* renamed from: づざかべべ */
        Drawable mo157();

        /* renamed from: てぜきぽく */
        void mo158(int i, int i2);

        /* renamed from: のぷのちつ */
        int mo159();

        /* renamed from: へぬ〴づぞ */
        CharSequence mo160();

        /* renamed from: ぺぁあねじ */
        void mo161(int i);

        /* renamed from: ぺふねづ〺 */
        void mo162(int i);
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$びぐびあび, reason: contains not printable characters */
    public class C0073 extends ListPopupWindow implements InterfaceC0072 {

        /* renamed from: ぉひのべい, reason: contains not printable characters */
        public final Rect f382;

        /* renamed from: じぜこほぱ, reason: contains not printable characters */
        public CharSequence f383;

        /* renamed from: せづっ〸ちね, reason: contains not printable characters */
        public int f384;

        /* renamed from: ぺづげぺが, reason: contains not printable characters */
        public ListAdapter f386;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$びぐびあび$〺つふすそ, reason: contains not printable characters */
        public class ViewTreeObserverOnGlobalLayoutListenerC0074 implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserverOnGlobalLayoutListenerC0074() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0073 c0073 = C0073.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                c0073.getClass();
                if (!(C1096.m2507(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(c0073.f382))) {
                    C0073.this.dismiss();
                } else {
                    C0073.this.m163();
                    C0073.this.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$びぐびあび$くし〴〺ぅ, reason: contains not printable characters */
        public class C0075 implements PopupWindow.OnDismissListener {

            /* renamed from: 〺つふすそ, reason: contains not printable characters */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f388;

            public C0075(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f388 = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f388);
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0076 implements AdapterView.OnItemClickListener {
            public C0076(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0073 c0073 = C0073.this;
                    AppCompatSpinner.this.performItemClick(view, i, c0073.f386.getItemId(i));
                }
                C0073.this.dismiss();
            }
        }

        public C0073(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f382 = new Rect();
            this.f436 = AppCompatSpinner.this;
            m180(true);
            this.f437 = 0;
            this.f441 = new C0076(AppCompatSpinner.this);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: ぁごぐすすぃ */
        public void mo153(CharSequence charSequence) {
            this.f383 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: いいにぽつ */
        public void mo154(int i) {
            this.f384 = i;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: おぐぴう〸ず */
        public void mo155(ListAdapter listAdapter) {
            super.mo155(listAdapter);
            this.f386 = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: てぜきぽく */
        public void mo158(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean mo176 = mo176();
            m163();
            this.f448.setInputMethodMode(2);
            show();
            C1212 c1212 = this.f449;
            c1212.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                c1212.setTextDirection(i);
                c1212.setTextAlignment(i2);
            }
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            C1212 c12122 = this.f449;
            if (mo176() && c12122 != null) {
                c12122.setListSelectionHidden(false);
                c12122.setSelection(selectedItemPosition);
                if (c12122.getChoiceMode() != 0) {
                    c12122.setItemChecked(selectedItemPosition, true);
                }
            }
            if (mo176 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC0074 viewTreeObserverOnGlobalLayoutListenerC0074 = new ViewTreeObserverOnGlobalLayoutListenerC0074();
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0074);
            this.f448.setOnDismissListener(new C0075(viewTreeObserverOnGlobalLayoutListenerC0074));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
        /* renamed from: は〲ぱなで, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m163() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m181()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.f373
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = p034.p050.p053.C1209.m2693(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f373
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f373
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.f373
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.f366
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f386
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m181()
                int r4 = r4.m150(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.f373
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.m178(r4)
                goto L85
            L82:
                r8.m178(r5)
            L85:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = p034.p050.p053.C1209.m2693(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.f445
                int r3 = r3 - r0
                int r0 = r8.f384
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.f384
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.f431 = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.C0073.m163():void");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0072
        /* renamed from: へぬ〴づぞ */
        public CharSequence mo160() {
            return this.f383;
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.spinnerStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r4 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f373 = r0
            android.content.Context r0 = r7.getContext()
            p034.p050.p053.C1252.m2892(r7, r0)
            int[] r0 = p034.p050.C1148.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r9, r0, r10, r1)
            づざかべべ.〺つふすそ.ぉざぅち〻.びぐびあび r2 = new づざかべべ.〺つふすそ.ぉざぅち〻.びぐびあび
            r2.<init>(r7)
            r7.f367 = r2
            int r2 = p034.p050.C1148.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2f
            づざかべべ.〺つふすそ.ぇぬぎばつ.くし〴〺ぅ r3 = new づざかべべ.〺つふすそ.ぇぬぎばつ.くし〴〺ぅ
            r3.<init>(r8, r2)
            r7.f369 = r3
            goto L31
        L2f:
            r7.f369 = r8
        L31:
            r2 = 0
            r3 = -1
            int[] r4 = androidx.appcompat.widget.AppCompatSpinner.f365     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r4, r10, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L50
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            if (r5 == 0) goto L53
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L47
            goto L53
        L44:
            r8 = move-exception
            r2 = r4
            goto L4a
        L47:
            goto L51
        L49:
            r8 = move-exception
        L4a:
            if (r2 == 0) goto L4f
            r2.recycle()
        L4f:
            throw r8
        L50:
            r4 = r2
        L51:
            if (r4 == 0) goto L56
        L53:
            r4.recycle()
        L56:
            r4 = 1
            if (r3 == 0) goto L96
            if (r3 == r4) goto L5c
            goto La6
        L5c:
            androidx.appcompat.widget.AppCompatSpinner$びぐびあび r3 = new androidx.appcompat.widget.AppCompatSpinner$びぐびあび
            android.content.Context r5 = r7.f369
            r3.<init>(r5, r9, r10)
            android.content.Context r5 = r7.f369
            int[] r6 = p034.p050.C1148.Spinner
            づざかべべ.〺つふすそ.ぉざぅち〻.ぺづげぺが r1 = p034.p050.p053.C1260.m2910(r5, r9, r6, r10, r1)
            int r5 = p034.p050.C1148.Spinner_android_dropDownWidth
            r6 = -2
            int r5 = r1.m2920(r5, r6)
            r7.f366 = r5
            int r5 = p034.p050.C1148.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r1.m2913(r5)
            android.widget.PopupWindow r6 = r3.f448
            r6.setBackgroundDrawable(r5)
            int r5 = p034.p050.C1148.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.f383 = r5
            android.content.res.TypedArray r1 = r1.f6162
            r1.recycle()
            r7.f368 = r3
            づざかべべ.〺つふすそ.ぉざぅち〻.いいにぽつ r1 = new づざかべべ.〺つふすそ.ぉざぅち〻.いいにぽつ
            r1.<init>(r7, r7, r3)
            r7.f372 = r1
            goto La6
        L96:
            androidx.appcompat.widget.AppCompatSpinner$〺つふすそ r1 = new androidx.appcompat.widget.AppCompatSpinner$〺つふすそ
            r1.<init>()
            r7.f368 = r1
            int r3 = p034.p050.C1148.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r1.mo153(r3)
        La6:
            int r1 = p034.p050.C1148.Spinner_android_entries
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lbe
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r8, r5, r1)
            int r8 = p034.p050.C1147.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r8)
            r7.setAdapter(r3)
        Lbe:
            r0.recycle()
            r7.f371 = r4
            android.widget.SpinnerAdapter r8 = r7.f370
            if (r8 == 0) goto Lcc
            r7.setAdapter(r8)
            r7.f370 = r2
        Lcc:
            づざかべべ.〺つふすそ.ぉざぅち〻.びぐびあび r8 = r7.f367
            r8.m2901(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1253 c1253 = this.f367;
        if (c1253 != null) {
            c1253.m2898();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 != null) {
            return interfaceC0072.mo156();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 != null) {
            return interfaceC0072.mo159();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f368 != null) {
            return this.f366;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final InterfaceC0072 getInternalPopup() {
        return this.f368;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 != null) {
            return interfaceC0072.mo157();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f369;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0072 interfaceC0072 = this.f368;
        return interfaceC0072 != null ? interfaceC0072.mo160() : super.getPrompt();
    }

    @Override // p034.p035.p045.InterfaceC1119
    public ColorStateList getSupportBackgroundTintList() {
        C1253 c1253 = this.f367;
        if (c1253 != null) {
            return c1253.m2895();
        }
        return null;
    }

    @Override // p034.p035.p045.InterfaceC1119
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1253 c1253 = this.f367;
        if (c1253 != null) {
            return c1253.m2897();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 == null || !interfaceC0072.mo152()) {
            return;
        }
        this.f368.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f368 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m150(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f374 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0071());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0072 interfaceC0072 = this.f368;
        savedState.f374 = interfaceC0072 != null && interfaceC0072.mo152();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC1249 abstractViewOnTouchListenerC1249 = this.f372;
        if (abstractViewOnTouchListenerC1249 == null || !abstractViewOnTouchListenerC1249.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 == null) {
            return super.performClick();
        }
        if (interfaceC0072.mo152()) {
            return true;
        }
        m149();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f371) {
            this.f370 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f368 != null) {
            Context context = this.f369;
            if (context == null) {
                context = getContext();
            }
            this.f368.mo155(new C0070(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1253 c1253 = this.f367;
        if (c1253 != null) {
            c1253.m2899();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1253 c1253 = this.f367;
        if (c1253 != null) {
            c1253.m2900(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 != null) {
            interfaceC0072.mo154(i);
            this.f368.mo162(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 != null) {
            interfaceC0072.mo161(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f368 != null) {
            this.f366 = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 != null) {
            interfaceC0072.mo151(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1266.m2928(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0072 interfaceC0072 = this.f368;
        if (interfaceC0072 != null) {
            interfaceC0072.mo153(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1253 c1253 = this.f367;
        if (c1253 != null) {
            c1253.m2894(colorStateList);
        }
    }

    @Override // p034.p035.p045.InterfaceC1119
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1253 c1253 = this.f367;
        if (c1253 != null) {
            c1253.m2902(mode);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m149() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f368.mo158(getTextDirection(), getTextAlignment());
        } else {
            this.f368.mo158(-1, -1);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m150(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f373);
        Rect rect = this.f373;
        return i2 + rect.left + rect.right;
    }
}
