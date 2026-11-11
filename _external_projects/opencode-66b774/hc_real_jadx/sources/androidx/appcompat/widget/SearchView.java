package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p034.p035.p045.C1096;
import p034.p050.C1145;
import p034.p050.C1147;
import p034.p050.C1148;
import p034.p050.C1264;
import p034.p050.C1268;
import p034.p050.C1285;
import p034.p050.p051.InterfaceC1150;
import p034.p050.p053.C1209;
import p034.p050.p053.C1260;
import p034.p050.p053.ViewOnClickListenerC1207;
import p034.p103.p104.AbstractC1777;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC1150 {

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public static final C0100 f482;

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public final Runnable f483;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public CharSequence f484;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public SearchableInfo f485;

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public InterfaceC0096 f486;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public final ImageView f487;

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public View.OnClickListener f488;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public int[] f489;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public C0092 f490;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public final TextView.OnEditorActionListener f491;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public InterfaceC0102 f492;

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public AbstractC1777 f493;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final View f494;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final SearchAutoComplete f495;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public final AdapterView.OnItemSelectedListener f496;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final int f497;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public final CharSequence f498;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public int f499;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public final View.OnClickListener f500;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public Runnable f501;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public CharSequence f502;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public boolean f503;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public final Intent f504;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public View.OnFocusChangeListener f505;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public boolean f506;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final View f507;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public CharSequence f508;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public final ImageView f509;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final View f510;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final ImageView f511;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public boolean f512;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final int f513;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public boolean f514;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public boolean f515;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final ImageView f516;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public int[] f517;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public final WeakHashMap<String, Drawable.ConstantState> f518;

    /* renamed from: ながふずは, reason: contains not printable characters */
    public InterfaceC0098 f519;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public Rect f520;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public TextWatcher f521;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public int f522;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public View.OnKeyListener f523;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final View f524;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public Bundle f525;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public boolean f526;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public Rect f527;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public final AdapterView.OnItemClickListener f528;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public final ImageView f529;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public final Intent f530;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public boolean f531;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public final Drawable f532;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0086();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f533;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public class C0086 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f533 = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m4207 = C2098.m4207("SearchView.SavedState{");
            m4207.append(Integer.toHexString(System.identityHashCode(this)));
            m4207.append(" isIconified=");
            m4207.append(this.f533);
            m4207.append("}");
            return m4207.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeValue(Boolean.valueOf(this.f533));
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final Runnable f534;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean f535;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f536;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public SearchView f537;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$げつ〴ぬぐ, reason: contains not printable characters */
        public class RunnableC0087 implements Runnable {
            public RunnableC0087() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f535) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f535 = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1264.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f534 = new RunnableC0087();
            this.f536 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f536 <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f535) {
                removeCallbacks(this.f534);
                post(this.f534);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f537;
            searchView.m195(searchView.f514);
            searchView.post(searchView.f483);
            if (searchView.f495.hasFocus()) {
                searchView.m206();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f537.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f537.hasFocus() && getVisibility() == 0) {
                this.f535 = true;
                Context context = getContext();
                C0100 c0100 = SearchView.f482;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m210();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f535 = false;
                removeCallbacks(this.f534);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f535 = true;
                    return;
                }
                this.f535 = false;
                removeCallbacks(this.f534);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f537 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f536 = i;
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m210() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0100 c0100 = SearchView.f482;
            c0100.getClass();
            C0100.m216();
            Method method = c0100.f555;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$〳ぜぞぜべっ, reason: contains not printable characters */
    public class C0088 implements TextView.OnEditorActionListener {
        public C0088() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m192();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$〺つふすそ, reason: contains not printable characters */
    public class RunnableC0089 implements Runnable {
        public RunnableC0089() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m204();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$ぁごぐすすぃ, reason: contains not printable characters */
    public class ViewOnKeyListenerC0090 implements View.OnKeyListener {
        public ViewOnKeyListenerC0090() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f485 == null) {
                return false;
            }
            if (searchView.f495.isPopupShowing() && SearchView.this.f495.getListSelection() != -1) {
                return SearchView.this.m207(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.f495.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m197(0, null, searchView2.f495.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$いいにぽつ, reason: contains not printable characters */
    public class C0091 implements AdapterView.OnItemSelectedListener {
        public C0091() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m208(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$おぐぴう〸ず, reason: contains not printable characters */
    public static class C0092 extends TouchDelegate {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final Rect f543;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final Rect f544;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final View f545;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final int f546;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public boolean f547;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Rect f548;

        public C0092(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f546 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f543 = new Rect();
            this.f548 = new Rect();
            this.f544 = new Rect();
            m211(rect, rect2);
            this.f545 = view;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f547;
                    if (z2 && !this.f548.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f547;
                        this.f547 = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f543.contains(x, y)) {
                    this.f547 = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f544.contains(x, y)) {
                Rect rect = this.f544;
                f = x - rect.left;
                i = y - rect.top;
            } else {
                f = this.f545.getWidth() / 2;
                i = this.f545.getHeight() / 2;
            }
            motionEvent.setLocation(f, i);
            return this.f545.dispatchTouchEvent(motionEvent);
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void m211(Rect rect, Rect rect2) {
            this.f543.set(rect);
            this.f548.set(rect);
            Rect rect3 = this.f548;
            int i = this.f546;
            rect3.inset(-i, -i);
            this.f544.set(rect2);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$くし〴〺ぅ, reason: contains not printable characters */
    public class RunnableC0093 implements Runnable {
        public RunnableC0093() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1777 abstractC1777 = SearchView.this.f493;
            if (abstractC1777 instanceof ViewOnClickListenerC1207) {
                abstractC1777.mo2685(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0094 implements TextWatcher {
        public C0094() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f495.getText();
            searchView.f502 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.m209(z);
            searchView.m201(!z);
            searchView.m205();
            searchView.m200();
            if (searchView.f486 != null && !TextUtils.equals(charSequence, searchView.f484)) {
                searchView.f486.m213(charSequence.toString());
            }
            searchView.f484 = charSequence.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$づざかべべ, reason: contains not printable characters */
    public class ViewOnLayoutChangeListenerC0095 implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0095() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.f494.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f524.getPaddingLeft();
                Rect rect = new Rect();
                boolean m2693 = C1209.m2693(searchView);
                int dimensionPixelSize = searchView.f515 ? resources.getDimensionPixelSize(C1285.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C1285.abc_dropdownitem_icon_width) : 0;
                searchView.f495.getDropDownBackground().getPadding(rect);
                searchView.f495.setDropDownHorizontalOffset(m2693 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f495.setDropDownWidth((((searchView.f494.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$てぜきぽく, reason: contains not printable characters */
    public interface InterfaceC0096 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        boolean m212(String str);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        boolean m213(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$なぎぱいぢぎ, reason: contains not printable characters */
    public class ViewOnClickListenerC0097 implements View.OnClickListener {
        public ViewOnClickListenerC0097() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f509) {
                searchView.m193();
                return;
            }
            if (view == searchView.f529) {
                searchView.m198();
                return;
            }
            if (view == searchView.f516) {
                searchView.m192();
                return;
            }
            if (view != searchView.f487) {
                if (view == searchView.f495) {
                    searchView.m206();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.f485;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m199(searchView.f504, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f530);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$のぷのちつ, reason: contains not printable characters */
    public interface InterfaceC0098 {
        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        boolean m214(int i);

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        boolean m215(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$びぐびあび, reason: contains not printable characters */
    public class ViewOnFocusChangeListenerC0099 implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0099() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f505;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$へぬ〴づぞ, reason: contains not printable characters */
    public static class C0100 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Method f554;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public Method f555;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public Method f556;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0100() {
            this.f556 = null;
            this.f554 = null;
            this.f555 = null;
            m216();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f556 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f554 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f555 = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static void m216() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$ぺぁあねじ, reason: contains not printable characters */
    public class C0101 implements AdapterView.OnItemClickListener {
        public C0101() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m203(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$ぺふねづ〺, reason: contains not printable characters */
    public interface InterfaceC0102 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        boolean m217();
    }

    static {
        f482 = Build.VERSION.SDK_INT < 29 ? new C0100() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f527 = new Rect();
        this.f520 = new Rect();
        this.f517 = new int[2];
        this.f489 = new int[2];
        this.f483 = new RunnableC0089();
        this.f501 = new RunnableC0093();
        this.f518 = new WeakHashMap<>();
        ViewOnClickListenerC0097 viewOnClickListenerC0097 = new ViewOnClickListenerC0097();
        this.f500 = viewOnClickListenerC0097;
        this.f523 = new ViewOnKeyListenerC0090();
        C0088 c0088 = new C0088();
        this.f491 = c0088;
        C0101 c0101 = new C0101();
        this.f528 = c0101;
        C0091 c0091 = new C0091();
        this.f496 = c0091;
        this.f521 = new C0094();
        C1260 c1260 = new C1260(context, context.obtainStyledAttributes(attributeSet, C1148.SearchView, i, 0));
        LayoutInflater.from(context).inflate(c1260.m2922(C1148.SearchView_layout, C1147.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C1268.search_src_text);
        this.f495 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f510 = findViewById(C1268.search_edit_frame);
        View findViewById = findViewById(C1268.search_plate);
        this.f524 = findViewById;
        View findViewById2 = findViewById(C1268.submit_area);
        this.f507 = findViewById2;
        ImageView imageView = (ImageView) findViewById(C1268.search_button);
        this.f509 = imageView;
        ImageView imageView2 = (ImageView) findViewById(C1268.search_go_btn);
        this.f516 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C1268.search_close_btn);
        this.f529 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C1268.search_voice_btn);
        this.f487 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C1268.search_mag_icon);
        this.f511 = imageView5;
        C1096.m2484(findViewById, c1260.m2913(C1148.SearchView_queryBackground));
        C1096.m2484(findViewById2, c1260.m2913(C1148.SearchView_submitBackground));
        int i2 = C1148.SearchView_searchIcon;
        imageView.setImageDrawable(c1260.m2913(i2));
        imageView2.setImageDrawable(c1260.m2913(C1148.SearchView_goIcon));
        imageView3.setImageDrawable(c1260.m2913(C1148.SearchView_closeIcon));
        imageView4.setImageDrawable(c1260.m2913(C1148.SearchView_voiceIcon));
        imageView5.setImageDrawable(c1260.m2913(i2));
        this.f532 = c1260.m2913(C1148.SearchView_searchHintIcon);
        C2786.m4764(imageView, getResources().getString(C1145.abc_searchview_description_search));
        this.f497 = c1260.m2922(C1148.SearchView_suggestionRowLayout, C1147.abc_search_dropdown_item_icons_2line);
        this.f513 = c1260.m2922(C1148.SearchView_commitIcon, 0);
        imageView.setOnClickListener(viewOnClickListenerC0097);
        imageView3.setOnClickListener(viewOnClickListenerC0097);
        imageView2.setOnClickListener(viewOnClickListenerC0097);
        imageView4.setOnClickListener(viewOnClickListenerC0097);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0097);
        searchAutoComplete.addTextChangedListener(this.f521);
        searchAutoComplete.setOnEditorActionListener(c0088);
        searchAutoComplete.setOnItemClickListener(c0101);
        searchAutoComplete.setOnItemSelectedListener(c0091);
        searchAutoComplete.setOnKeyListener(this.f523);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0099());
        setIconifiedByDefault(c1260.m2918(C1148.SearchView_iconifiedByDefault, true));
        int m2921 = c1260.m2921(C1148.SearchView_android_maxWidth, -1);
        if (m2921 != -1) {
            setMaxWidth(m2921);
        }
        this.f498 = c1260.m2916(C1148.SearchView_defaultQueryHint);
        this.f508 = c1260.m2916(C1148.SearchView_queryHint);
        int m2914 = c1260.m2914(C1148.SearchView_android_imeOptions, -1);
        if (m2914 != -1) {
            setImeOptions(m2914);
        }
        int m29142 = c1260.m2914(C1148.SearchView_android_inputType, -1);
        if (m29142 != -1) {
            setInputType(m29142);
        }
        setFocusable(c1260.m2918(C1148.SearchView_android_focusable, true));
        c1260.f6162.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f530 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f504 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f494 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0095());
        }
        m195(this.f515);
        m191();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1285.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1285.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f495.setText(charSequence);
        this.f495.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f531 = true;
        super.clearFocus();
        this.f495.clearFocus();
        this.f495.setImeVisibility(false);
        this.f531 = false;
    }

    public int getImeOptions() {
        return this.f495.getImeOptions();
    }

    public int getInputType() {
        return this.f495.getInputType();
    }

    public int getMaxWidth() {
        return this.f522;
    }

    public CharSequence getQuery() {
        return this.f495.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f508;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f485;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f498 : getContext().getText(this.f485.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f513;
    }

    public int getSuggestionRowLayout() {
        return this.f497;
    }

    public AbstractC1777 getSuggestionsAdapter() {
        return this.f493;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f483);
        post(this.f501);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f495;
            Rect rect = this.f527;
            searchAutoComplete.getLocationInWindow(this.f517);
            getLocationInWindow(this.f489);
            int[] iArr = this.f517;
            int i5 = iArr[1];
            int[] iArr2 = this.f489;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f520;
            Rect rect3 = this.f527;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0092 c0092 = this.f490;
            if (c0092 != null) {
                c0092.m211(this.f520, this.f527);
                return;
            }
            C0092 c00922 = new C0092(this.f520, this.f527, this.f495);
            this.f490 = c00922;
            setTouchDelegate(c00922);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f514
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f522
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f522
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f522
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        m195(savedState.f533);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f533 = this.f514;
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f483);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f531 || !isFocusable()) {
            return false;
        }
        if (this.f514) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f495.requestFocus(i, rect);
        if (requestFocus) {
            m195(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f525 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m198();
        } else {
            m193();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f515 == z) {
            return;
        }
        this.f515 = z;
        m195(z);
        m191();
    }

    public void setImeOptions(int i) {
        this.f495.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f495.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f522 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0102 interfaceC0102) {
        this.f492 = interfaceC0102;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f505 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0096 interfaceC0096) {
        this.f486 = interfaceC0096;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f488 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0098 interfaceC0098) {
        this.f519 = interfaceC0098;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.f495.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f495;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f502 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m192();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f508 = charSequence;
        m191();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f506 = z;
        AbstractC1777 abstractC1777 = this.f493;
        if (abstractC1777 instanceof ViewOnClickListenerC1207) {
            ((ViewOnClickListenerC1207) abstractC1777).f5972 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f485 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f495
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f495
            android.app.SearchableInfo r3 = r6.f485
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f485
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f485
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f495
            r3.setInputType(r7)
            づざかべべ.ぺぁあねじ.げつ〴ぬぐ.げつ〴ぬぐ r7 = r6.f493
            if (r7 == 0) goto L42
            r7.mo2685(r2)
        L42:
            android.app.SearchableInfo r7 = r6.f485
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            づざかべべ.〺つふすそ.ぉざぅち〻.ぇ〳〲〺すっ r7 = new づざかべべ.〺つふすそ.ぉざぅち〻.ぇ〳〲〺すっ
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f485
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f518
            r7.<init>(r3, r6, r4, r5)
            r6.f493 = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f495
            r3.setAdapter(r7)
            づざかべべ.ぺぁあねじ.げつ〴ぬぐ.げつ〴ぬぐ r7 = r6.f493
            づざかべべ.〺つふすそ.ぉざぅち〻.ぇ〳〲〺すっ r7 = (p034.p050.p053.ViewOnClickListenerC1207) r7
            boolean r3 = r6.f506
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = 1
        L69:
            r7.f5972 = r3
        L6b:
            r6.m191()
        L6e:
            android.app.SearchableInfo r7 = r6.f485
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.f485
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.f530
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.f485
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.f504
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = 0
        La0:
            r6.f503 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f495
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.f514
            r6.m195(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f526 = z;
        m195(this.f514);
    }

    public void setSuggestionsAdapter(AbstractC1777 abstractC1777) {
        this.f493 = abstractC1777;
        this.f495.setAdapter(abstractC1777);
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public void m190(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final void m191() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f495;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f515 && this.f532 != null) {
            double textSize = searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i = (int) (textSize * 1.25d);
            this.f532.setBounds(0, 0, i, i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f532), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public void m192() {
        Editable text = this.f495.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0096 interfaceC0096 = this.f486;
        if (interfaceC0096 == null || !interfaceC0096.m212(text.toString())) {
            if (this.f485 != null) {
                m197(0, null, text.toString());
            }
            this.f495.setImeVisibility(false);
            this.f495.dismissDropDown();
        }
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public void m193() {
        m195(false);
        this.f495.requestFocus();
        this.f495.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f488;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final Intent m194(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f502);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f525;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f485.getSearchActivity());
        return intent;
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public final void m195(boolean z) {
        this.f514 = z;
        int i = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f495.getText());
        this.f509.setVisibility(i);
        m209(z2);
        this.f510.setVisibility(z ? 8 : 0);
        this.f511.setVisibility((this.f511.getDrawable() == null || this.f515) ? 8 : 0);
        m205();
        m201(!z2);
        m200();
    }

    @Override // p034.p050.p051.InterfaceC1150
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void mo196() {
        if (this.f512) {
            return;
        }
        this.f512 = true;
        int imeOptions = this.f495.getImeOptions();
        this.f499 = imeOptions;
        this.f495.setImeOptions(imeOptions | 33554432);
        this.f495.setText("");
        setIconified(false);
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void m197(int i, String str, String str2) {
        getContext().startActivity(m194("android.intent.action.SEARCH", null, null, str2, i, null));
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void m198() {
        if (!TextUtils.isEmpty(this.f495.getText())) {
            this.f495.setText("");
            this.f495.requestFocus();
            this.f495.setImeVisibility(true);
        } else if (this.f515) {
            InterfaceC0102 interfaceC0102 = this.f492;
            if (interfaceC0102 == null || !interfaceC0102.m217()) {
                clearFocus();
                m195(true);
            }
        }
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final Intent m199(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f525;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public final void m200() {
        int i = 0;
        if (!((this.f526 || this.f503) && !this.f514) || (this.f516.getVisibility() != 0 && this.f487.getVisibility() != 0)) {
            i = 8;
        }
        this.f507.setVisibility(i);
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public final void m201(boolean z) {
        int i = 8;
        if (this.f503 && !this.f514 && z) {
            this.f516.setVisibility(8);
            i = 0;
        }
        this.f487.setVisibility(i);
    }

    @Override // p034.p050.p051.InterfaceC1150
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void mo202() {
        setQuery("", false);
        clearFocus();
        m195(true);
        this.f495.setImeOptions(this.f499);
        this.f512 = false;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public boolean m203(int i) {
        String m2684;
        InterfaceC0098 interfaceC0098 = this.f519;
        if (interfaceC0098 != null && interfaceC0098.m214(i)) {
            return false;
        }
        Cursor cursor = this.f493.f8004;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                try {
                    int i2 = ViewOnClickListenerC1207.f5964;
                    String m26842 = ViewOnClickListenerC1207.m2684(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (m26842 == null) {
                        m26842 = this.f485.getSuggestIntentAction();
                    }
                    if (m26842 == null) {
                        m26842 = "android.intent.action.SEARCH";
                    }
                    String str = m26842;
                    String m26843 = ViewOnClickListenerC1207.m2684(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (m26843 == null) {
                        m26843 = this.f485.getSuggestIntentData();
                    }
                    if (m26843 != null && (m2684 = ViewOnClickListenerC1207.m2684(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        m26843 = m26843 + "/" + Uri.encode(m2684);
                    }
                    intent = m194(str, m26843 == null ? null : Uri.parse(m26843), ViewOnClickListenerC1207.m2684(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC1207.m2684(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException unused3) {
                    String str2 = "Failed launch activity: " + intent;
                }
            }
        }
        this.f495.setImeVisibility(false);
        this.f495.dismissDropDown();
        return true;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public void m204() {
        int[] iArr = this.f495.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f524.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f507.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public final void m205() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f495.getText());
        if (!z2 && (!this.f515 || this.f512)) {
            z = false;
        }
        this.f529.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f529.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void m206() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f495.refreshAutoCompleteResults();
            return;
        }
        C0100 c0100 = f482;
        SearchAutoComplete searchAutoComplete = this.f495;
        c0100.getClass();
        C0100.m216();
        Method method = c0100.f556;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0100 c01002 = f482;
        SearchAutoComplete searchAutoComplete2 = this.f495;
        c01002.getClass();
        C0100.m216();
        Method method2 = c01002.f554;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public boolean m207(int i, KeyEvent keyEvent) {
        if (this.f485 != null && this.f493 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m203(this.f495.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f495.setSelection(i == 21 ? 0 : this.f495.length());
                this.f495.setListSelection(0);
                this.f495.clearListSelection();
                this.f495.m210();
                return true;
            }
            if (i != 19 || this.f495.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public boolean m208(int i) {
        CharSequence mo2687;
        InterfaceC0098 interfaceC0098 = this.f519;
        if (interfaceC0098 != null && interfaceC0098.m215(i)) {
            return false;
        }
        Editable text = this.f495.getText();
        Cursor cursor = this.f493.f8004;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i) || (mo2687 = this.f493.mo2687(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(mo2687);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r2.f503 == false) goto L19;
     */
    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m209(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f526
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f503
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f514
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f503
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f516
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.m209(boolean):void");
    }
}
