.class public final Lcom/google/android/gms/internal/zzaik;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzdbo:Lcom/google/android/gms/internal/zzaig;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaig;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaik;->zzdbo:Lcom/google/android/gms/internal/zzaig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzer()Lcom/google/android/gms/internal/zzaim;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaik;->zzdbo:Lcom/google/android/gms/internal/zzaig;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzaig;->zzd(Lcom/google/android/gms/internal/zzaig;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaik;->zzdbo:Lcom/google/android/gms/internal/zzaig;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzaig;->zze(Lcom/google/android/gms/internal/zzaig;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzaik;->zzdbo:Lcom/google/android/gms/internal/zzaig;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzaig;->zzf(Lcom/google/android/gms/internal/zzaig;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzaim;->zzg(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
