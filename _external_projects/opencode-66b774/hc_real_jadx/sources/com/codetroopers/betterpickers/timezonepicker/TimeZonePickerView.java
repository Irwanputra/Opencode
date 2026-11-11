package com.codetroopers.betterpickers.timezonepicker;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TimeZonePickerView extends LinearLayout implements TextWatcher, AdapterView.OnItemClickListener, View.OnClickListener {
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean getHideFilterSearchOnStart() {
        return false;
    }

    public String getLastFilterString() {
        return null;
    }

    public int getLastFilterTime() {
        return -1;
    }

    public int getLastFilterType() {
        return -1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        throw null;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.toString();
        throw null;
    }
}
