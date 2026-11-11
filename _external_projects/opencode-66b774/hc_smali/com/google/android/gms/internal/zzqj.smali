.class public abstract Lcom/google/android/gms/internal/zzqj;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzqi;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.formats.client.INativeContentAd"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzev;->zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    const/4 v0, 0x1

    if-eqz p4, :cond_8

    return v0

    :cond_8
    packed-switch p1, :pswitch_data_96

    const/4 p1, 0x0

    return p1

    :pswitch_d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_84

    :pswitch_13
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->zzjx()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    goto/16 :goto_8f

    :pswitch_19
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->zzjy()Lcom/google/android/gms/internal/zzpm;

    move-result-object p1

    goto/16 :goto_8f

    :pswitch_1f
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzqi;->reportTouchEvent(Landroid/os/Bundle;)V

    goto :goto_52

    :pswitch_2b
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzqi;->recordImpression(Landroid/os/Bundle;)Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Z)V

    goto :goto_95

    :pswitch_3e
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzqi;->performClick(Landroid/os/Bundle;)V

    goto :goto_52

    :pswitch_4a
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->getVideoController()Lcom/google/android/gms/internal/zzll;

    move-result-object p1

    goto :goto_8f

    :pswitch_4f
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->destroy()V

    :goto_52
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_95

    :pswitch_56
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto :goto_95

    :pswitch_61
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->getAdvertiser()Ljava/lang/String;

    move-result-object p1

    goto :goto_84

    :pswitch_66
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->getCallToAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_84

    :pswitch_6b
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->zzjz()Lcom/google/android/gms/internal/zzpq;

    move-result-object p1

    goto :goto_8f

    :pswitch_70
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->getBody()Ljava/lang/String;

    move-result-object p1

    goto :goto_84

    :pswitch_75
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->getImages()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    goto :goto_95

    :pswitch_80
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->getHeadline()Ljava/lang/String;

    move-result-object p1

    :goto_84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_95

    :pswitch_8b
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzqi;->zzjt()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    :goto_8f
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/IInterface;)V

    :goto_95
    return v0

    :pswitch_data_96
    .packed-switch 0x2
        :pswitch_8b
        :pswitch_80
        :pswitch_75
        :pswitch_70
        :pswitch_6b
        :pswitch_66
        :pswitch_61
        :pswitch_56
        :pswitch_4f
        :pswitch_4a
        :pswitch_3e
        :pswitch_2b
        :pswitch_1f
        :pswitch_19
        :pswitch_13
        :pswitch_d
    .end packed-switch
.end method
