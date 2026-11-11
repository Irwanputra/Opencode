.class public final Lcom/google/android/gms/internal/zzry;
.super Lcom/google/android/gms/internal/zzalf;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzalf<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic zzbyu:Lcom/google/android/gms/internal/zzrx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzrx;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzry;->zzbyu:Lcom/google/android/gms/internal/zzrx;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzalf;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzry;->zzbyu:Lcom/google/android/gms/internal/zzrx;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzrx;->zza(Lcom/google/android/gms/internal/zzrx;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/zzalf;->cancel(Z)Z

    move-result p1

    return p1
.end method
