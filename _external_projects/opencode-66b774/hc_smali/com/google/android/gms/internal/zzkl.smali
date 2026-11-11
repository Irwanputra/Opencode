.class public abstract Lcom/google/android/gms/internal/zzkl;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzkk;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.client.IAdLoader"

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
    if-eq p1, v0, :cond_43

    const/4 p4, 0x2

    if-eq p1, p4, :cond_38

    const/4 p4, 0x3

    if-eq p1, p4, :cond_2d

    const/4 p4, 0x4

    if-eq p1, p4, :cond_28

    const/4 p4, 0x5

    if-eq p1, p4, :cond_18

    const/4 p1, 0x0

    return p1

    :cond_18
    sget-object p1, Lcom/google/android/gms/internal/zzjj;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzjj;

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p2

    invoke-interface {p0, p1, p2}, Lcom/google/android/gms/internal/zzkk;->zza(Lcom/google/android/gms/internal/zzjj;I)V

    goto :goto_4e

    :cond_28
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkk;->zzcp()Ljava/lang/String;

    move-result-object p1

    goto :goto_3c

    :cond_2d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkk;->isLoading()Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Z)V

    goto :goto_51

    :cond_38
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzkk;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object p1

    :goto_3c
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_51

    :cond_43
    sget-object p1, Lcom/google/android/gms/internal/zzjj;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzjj;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzkk;->zzd(Lcom/google/android/gms/internal/zzjj;)V

    :goto_4e
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    :goto_51
    return v0
.end method
