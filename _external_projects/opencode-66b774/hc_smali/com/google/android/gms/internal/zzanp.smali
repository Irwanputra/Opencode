.class public final Lcom/google/android/gms/internal/zzanp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/overlay/zzn;


# instance fields
.field private zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

.field private zzdlg:Lcom/google/android/gms/internal/zzanh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzanh;Lcom/google/android/gms/ads/internal/overlay/zzn;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzanp;->zzdlg:Lcom/google/android/gms/internal/zzanh;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzanp;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    return-void
.end method


# virtual methods
.method public final onPause()V
    .registers 1

    return-void
.end method

.method public final onResume()V
    .registers 1

    return-void
.end method

.method public final zzcg()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanp;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzn;->zzcg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanp;->zzdlg:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->zzss()V

    return-void
.end method

.method public final zzch()V
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanp;->zzbyj:Lcom/google/android/gms/ads/internal/overlay/zzn;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/overlay/zzn;->zzch()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzanp;->zzdlg:Lcom/google/android/gms/internal/zzanh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzanh;->zzmz()V

    return-void
.end method
