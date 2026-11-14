package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B16530580336360837432 implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
    public android.widget.SpinnerAdapter a;
    public android.widget.ListAdapter b;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        android.widget.ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        android.widget.ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
