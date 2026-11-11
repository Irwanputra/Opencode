package p131.p150.p151.p152;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import p131.p150.p151.C2086;
import p131.p150.p151.C2088;
import p131.p150.p151.p153.C2089;
import p131.p150.p151.p154.C2094;
import p131.p155.p156.p157.C2098;

/* renamed from: なぎぱいぢぎ.くし〴〺ぅ.げつ〴ぬぐ.いいにぽつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2083 extends Fragment {

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public RecyclerView f8885;

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public C2089 f8886;

    @Override // androidx.fragment.app.Fragment
    /* renamed from: けときぜと */
    public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2086.crash_log, viewGroup, false);
        this.f8885 = (RecyclerView) inflate.findViewById(C2088.crashRecyclerView);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: せづっ〸ちね */
    public void mo510(Bundle bundle) {
        super.mo510(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ち〴みぎ〻び */
    public void mo511() {
        this.f1196 = true;
        FragmentActivity m525 = m525();
        RecyclerView recyclerView = this.f8885;
        this.f8886 = new C2089(m525, m4172());
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(this.f8886);
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public final ArrayList<File> m4172() {
        String m4173 = TextUtils.isEmpty(null) ? C2094.m4173() : null;
        File file = new File(m4173);
        if (!file.exists() || !file.isDirectory()) {
            throw new RuntimeException(C2098.m4205("The path provided doesn't exists : ", m4173));
        }
        ArrayList<File> arrayList = new ArrayList<>(Arrays.asList(file.listFiles()));
        Iterator<File> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().getName().contains("_exception")) {
                it.remove();
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList;
    }
}
