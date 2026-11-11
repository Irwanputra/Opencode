package p034.p068;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: づざかべべ.おぐぴう〸ず.ぶでにく〼〳, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1440 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static Field f6724;

    /* renamed from: づざかべべ.おぐぴう〸ず.ぶでにく〼〳$〺つふすそ, reason: contains not printable characters */
    public static class C1441 {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public MediaBrowserService.Result f6725;

        public C1441(MediaBrowserService.Result result) {
            this.f6725 = result;
        }
    }

    /* renamed from: づざかべべ.おぐぴう〸ず.ぶでにく〼〳$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC1442 extends InterfaceC1435 {
        /* renamed from: びぐびあび */
        void mo583(String str, C1441 c1441, Bundle bundle);
    }

    /* renamed from: づざかべべ.おぐぴう〸ず.ぶでにく〼〳$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1443 extends C1431 {
        public C1443(Context context, InterfaceC1442 interfaceC1442) {
            super(context, interfaceC1442);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.m31(bundle);
            ((InterfaceC1442) this.f6705).mo583(str, new C1441(result), bundle);
        }
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f6724 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }
}
