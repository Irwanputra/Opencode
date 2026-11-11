package p034.p103.p104;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p034.p103.p104.C1774;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ぺぁあねじ.げつ〴ぬぐ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class AbstractC1777 extends BaseAdapter implements Filterable, C1774.InterfaceC1775 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public DataSetObserver f7998;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f7999;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C1779 f8000;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f8001;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Context f8002;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f8003;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Cursor f8004;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public C1774 f8005;

    /* renamed from: づざかべべ.ぺぁあねじ.げつ〴ぬぐ.げつ〴ぬぐ$〺つふすそ, reason: contains not printable characters */
    public class C1778 extends DataSetObserver {
        public C1778() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC1777 abstractC1777 = AbstractC1777.this;
            abstractC1777.f7999 = true;
            abstractC1777.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC1777 abstractC1777 = AbstractC1777.this;
            abstractC1777.f7999 = false;
            abstractC1777.notifyDataSetInvalidated();
        }
    }

    /* renamed from: づざかべべ.ぺぁあねじ.げつ〴ぬぐ.げつ〴ぬぐ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C1779 extends ContentObserver {
        public C1779() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            AbstractC1777 abstractC1777 = AbstractC1777.this;
            if (!abstractC1777.f8001 || (cursor = abstractC1777.f8004) == null || cursor.isClosed()) {
                return;
            }
            abstractC1777.f7999 = abstractC1777.f8004.requery();
        }
    }

    public AbstractC1777(Context context, Cursor cursor, boolean z) {
        C1778 c1778;
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.f8001 = true;
        } else {
            this.f8001 = false;
        }
        boolean z2 = cursor != null;
        this.f8004 = cursor;
        this.f7999 = z2;
        this.f8002 = context;
        this.f8003 = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f8000 = new C1779();
            c1778 = new C1778();
        } else {
            c1778 = null;
            this.f8000 = null;
        }
        this.f7998 = c1778;
        if (z2) {
            C1779 c1779 = this.f8000;
            if (c1779 != null) {
                cursor.registerContentObserver(c1779);
            }
            DataSetObserver dataSetObserver = this.f7998;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f7999 || (cursor = this.f8004) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f7999) {
            return null;
        }
        this.f8004.moveToPosition(i);
        if (view == null) {
            AbstractC1776 abstractC1776 = (AbstractC1776) this;
            view = abstractC1776.f7996.inflate(abstractC1776.f7997, viewGroup, false);
        }
        mo2688(view, this.f8002, this.f8004);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f8005 == null) {
            this.f8005 = new C1774(this);
        }
        return this.f8005;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f7999 || (cursor = this.f8004) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f8004;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f7999 && (cursor = this.f8004) != null && cursor.moveToPosition(i)) {
            return this.f8004.getLong(this.f8003);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f7999) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f8004.moveToPosition(i)) {
            throw new IllegalStateException(C2098.m4208("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = mo2691(this.f8002, this.f8004, viewGroup);
        }
        mo2688(view, this.f8002, this.f8004);
        return view;
    }

    /* renamed from: 〺つふすそ */
    public void mo2685(Cursor cursor) {
        Cursor cursor2 = this.f8004;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C1779 c1779 = this.f8000;
                if (c1779 != null) {
                    cursor2.unregisterContentObserver(c1779);
                }
                DataSetObserver dataSetObserver = this.f7998;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f8004 = cursor;
            if (cursor != null) {
                C1779 c17792 = this.f8000;
                if (c17792 != null) {
                    cursor.registerContentObserver(c17792);
                }
                DataSetObserver dataSetObserver2 = this.f7998;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f8003 = cursor.getColumnIndexOrThrow("_id");
                this.f7999 = true;
                notifyDataSetChanged();
            } else {
                this.f8003 = -1;
                this.f7999 = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: くし〴〺ぅ */
    public abstract CharSequence mo2687(Cursor cursor);

    /* renamed from: げつ〴ぬぐ */
    public abstract void mo2688(View view, Context context, Cursor cursor);

    /* renamed from: びぐびあび */
    public abstract View mo2691(Context context, Cursor cursor, ViewGroup viewGroup);
}
