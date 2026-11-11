.class public final Lcom/google/android/gms/internal/zzaej;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zzaox:Lcom/google/android/gms/internal/zzafo;

.field private synthetic zzcwa:Lcom/google/android/gms/internal/zzaei;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaei;Lcom/google/android/gms/internal/zzafo;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaej;->zzcwa:Lcom/google/android/gms/internal/zzaei;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaej;->zzaox:Lcom/google/android/gms/internal/zzafo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaej;->zzcwa:Lcom/google/android/gms/internal/zzaei;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaei;->zza(Lcom/google/android/gms/internal/zzaei;)Lcom/google/android/gms/internal/zzade;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaej;->zzaox:Lcom/google/android/gms/internal/zzafo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzd;->zzb(Lcom/google/android/gms/internal/zzafo;)V

    return-void
.end method
