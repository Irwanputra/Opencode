package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class SearchView$SearchAutoComplete extends dev.epro.r0.S15286651319405213936 {
    public int e;
    public boolean f;
    public final dev.epro.r0.U3594978070141619353 g;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchView$SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new dev.epro.r0.U3594978070141619353(this, (byte) 8);
        this.e = getThreshold();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getSearchViewTextMinWidthDp() {
        android.content.res.Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i2 < 480) ? 160 : 192;
        }
        return 192;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean enoughToFilter() {
        return this.e <= 0 || super/*android.widget.AutoCompleteTextView*/.enoughToFilter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f) {
            dev.epro.r0.U3594978070141619353 u3594978070141619353 = this.g;
            removeCallbacks(u3594978070141619353);
            post(u3594978070141619353);
        }
        return inputConnectionOnCreateInputConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setMinWidth((int) android.util.TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super/*android.view.View*/.onFocusChanged(z, i, rect);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super/*android.view.View*/.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.view.View*/.onWindowFocusChanged(z);
        if (z) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImeVisibility(boolean z) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        dev.epro.r0.U3594978070141619353 u3594978070141619353 = this.g;
        if (!z) {
            this.f = false;
            removeCallbacks(u3594978070141619353);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f = true;
                return;
            }
            this.f = false;
            removeCallbacks(u3594978070141619353);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setThreshold(int i) {
        super/*android.widget.AutoCompleteTextView*/.setThreshold(i);
        this.e = i;
    }

    public SearchView$SearchAutoComplete(android.content.Context context) {
        this(context, null);
    }

    public final void performCompletion() {
    }

    public final void replaceText(java.lang.CharSequence charSequence) {
    }

    public void setSearchView(dev.epro.r0.P2409794268255183280 p2409794268255183280) {
    }
}
