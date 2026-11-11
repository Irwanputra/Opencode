package p034.p050.p053;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p034.p050.C1268;
import p034.p103.p104.AbstractC1776;

@SuppressLint({"RestrictedAPI"})
/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぇ〳〲〺すっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC1207 extends AbstractC1776 implements View.OnClickListener {

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public static final /* synthetic */ int f5964 = 0;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f5965;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final WeakHashMap<String, Drawable.ConstantState> f5966;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f5967;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final int f5968;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final Context f5969;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f5970;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f5971;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f5972;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f5973;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final SearchView f5974;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ColorStateList f5975;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f5976;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final SearchableInfo f5977;

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.ぇ〳〲〺すっ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C1208 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final TextView f5978;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final ImageView f5979;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final TextView f5980;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final ImageView f5981;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final ImageView f5982;

        public C1208(View view) {
            this.f5980 = (TextView) view.findViewById(R.id.text1);
            this.f5978 = (TextView) view.findViewById(R.id.text2);
            this.f5979 = (ImageView) view.findViewById(R.id.icon1);
            this.f5982 = (ImageView) view.findViewById(R.id.icon2);
            this.f5981 = (ImageView) view.findViewById(C1268.edit_query);
        }
    }

    public ViewOnClickListenerC1207(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f5972 = 1;
        this.f5970 = -1;
        this.f5971 = -1;
        this.f5973 = -1;
        this.f5976 = -1;
        this.f5965 = -1;
        this.f5967 = -1;
        this.f5974 = searchView;
        this.f5977 = searchableInfo;
        this.f5968 = searchView.getSuggestionCommitIconResId();
        this.f5969 = context;
        this.f5966 = weakHashMap;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static String m2684(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p034.p103.p104.AbstractC1777, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.f7996.inflate(this.f7997, viewGroup, false);
            if (inflate != null) {
                ((C1208) inflate.getTag()).f5980.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // p034.p103.p104.AbstractC1777, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View mo2691 = mo2691(this.f8002, this.f8004, viewGroup);
            ((C1208) mo2691.getTag()).f5980.setText(e.toString());
            return mo2691;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2692(this.f8004);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2692(this.f8004);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5974.m190((CharSequence) tag);
        }
    }

    @Override // p034.p103.p104.AbstractC1777
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void mo2685(Cursor cursor) {
        try {
            super.mo2685(cursor);
            if (cursor != null) {
                this.f5970 = cursor.getColumnIndex("suggest_text_1");
                this.f5971 = cursor.getColumnIndex("suggest_text_2");
                this.f5973 = cursor.getColumnIndex("suggest_text_2_url");
                this.f5976 = cursor.getColumnIndex("suggest_icon_1");
                this.f5965 = cursor.getColumnIndex("suggest_icon_2");
                this.f5967 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Cursor m2686(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f8002.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p034.p103.p104.AbstractC1777
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public CharSequence mo2687(Cursor cursor) {
        String m2684;
        String m26842;
        if (cursor == null) {
            return null;
        }
        String m26843 = m2684(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m26843 != null) {
            return m26843;
        }
        if (this.f5977.shouldRewriteQueryFromData() && (m26842 = m2684(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return m26842;
        }
        if (!this.f5977.shouldRewriteQueryFromText() || (m2684 = m2684(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return m2684;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    @Override // p034.p103.p104.AbstractC1777
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2688(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.ViewOnClickListenerC1207.mo2688(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Drawable m2689(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f8002.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m2690(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.ViewOnClickListenerC1207.m2690(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // p034.p103.p104.AbstractC1776, p034.p103.p104.AbstractC1777
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public View mo2691(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f7996.inflate(this.f7995, viewGroup, false);
        inflate.setTag(new C1208(inflate));
        ((ImageView) inflate.findViewById(C1268.edit_query)).setImageResource(this.f5968);
        return inflate;
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final void m2692(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }
}
