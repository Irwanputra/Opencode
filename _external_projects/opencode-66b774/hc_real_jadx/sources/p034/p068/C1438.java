package p034.p068;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: づざかべべ.おぐぴう〸ず.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1438<T> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public MediaBrowserService.Result f6718;

    public C1438(MediaBrowserService.Result result) {
        this.f6718 = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m3187(T t) {
        ArrayList arrayList = null;
        if (!(t instanceof List)) {
            if (!(t instanceof Parcel)) {
                this.f6718.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t;
            parcel.setDataPosition(0);
            this.f6718.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        MediaBrowserService.Result result = this.f6718;
        List<Parcel> list = (List) t;
        if (list != null) {
            arrayList = new ArrayList();
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }
}
