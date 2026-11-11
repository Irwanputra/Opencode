package p237.p238.p239.p241.p242;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;
import p034.p080.C1502;
import p237.p238.p239.p241.p242.AbstractC2787;
import p237.p238.p239.p241.p242.InterfaceC2781;

/* renamed from: びぐびあび.げつ〴ぬぐ.げつ〴ぬぐ.げつ〴ぬぐ.ぁごぐすすぃ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2795<T extends InterfaceC2781> extends MediaController.Callback {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final T f10461;

    public C2795(T t) {
        this.f10461 = t;
    }

    @Override // android.media.session.MediaController.Callback
    public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        T t = this.f10461;
        playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        if ((audioAttributes.getFlags() & 1) != 1 && (audioAttributes.getFlags() & 4) != 4) {
            audioAttributes.getUsage();
        }
        playbackInfo.getVolumeControl();
        playbackInfo.getMaxVolume();
        playbackInfo.getCurrentVolume();
        ((AbstractC2787.C2789) t).f10460.get();
    }

    @Override // android.media.session.MediaController.Callback
    public void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.m31(bundle);
        ((AbstractC2787.C2789) this.f10461).f10460.get();
    }

    @Override // android.media.session.MediaController.Callback
    public void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((AbstractC2787.C2789) this.f10461).f10460.get() != null) {
            C1502<String, Integer> c1502 = MediaMetadataCompat.f53;
            if (mediaMetadata == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.getClass();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        AbstractC2787 abstractC2787 = ((AbstractC2787.C2789) this.f10461).f10460.get();
        if (abstractC2787 == null || abstractC2787.f10458 != null) {
            return;
        }
        if (playbackState == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction2 : customActions) {
                if (customAction2 == null || Build.VERSION.SDK_INT < 21) {
                    customAction = null;
                } else {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    customAction = new PlaybackStateCompat.CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), customAction3.getExtras());
                    customAction.f88 = customAction2;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), Build.VERSION.SDK_INT >= 22 ? playbackState.getExtras() : null);
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueChanged(List<MediaSession.QueueItem> list) {
        MediaSessionCompat.QueueItem queueItem;
        if (((AbstractC2787.C2789) this.f10461).f10460.get() == null || list == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaSession.QueueItem queueItem2 : list) {
            if (queueItem2 == null || Build.VERSION.SDK_INT < 21) {
                queueItem = null;
            } else {
                MediaSession.QueueItem queueItem3 = queueItem2;
                queueItem = new MediaSessionCompat.QueueItem(queueItem2, MediaDescriptionCompat.m22(queueItem3.getDescription()), queueItem3.getQueueId());
            }
            arrayList.add(queueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public void onQueueTitleChanged(CharSequence charSequence) {
        ((AbstractC2787.C2789) this.f10461).f10460.get();
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionDestroyed() {
        ((AbstractC2787.C2789) this.f10461).f10460.get();
    }

    @Override // android.media.session.MediaController.Callback
    public void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.m31(bundle);
        AbstractC2787 abstractC2787 = ((AbstractC2787.C2789) this.f10461).f10460.get();
        if (abstractC2787 != null) {
            InterfaceC2790 interfaceC2790 = abstractC2787.f10458;
        }
    }
}
