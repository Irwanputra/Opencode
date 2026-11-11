.class public final Lcom/google/android/gms/internal/zzsy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zztc;


# instance fields
.field private synthetic zzbzh:Lcom/google/android/gms/internal/zzadh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzst;Lcom/google/android/gms/internal/zzadh;)V
    .registers 3

    iput-object p2, p0, Lcom/google/android/gms/internal/zzsy;->zzbzh:Lcom/google/android/gms/internal/zzadh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/internal/zztd;)V
    .registers 3

    iget-object p1, p1, Lcom/google/android/gms/internal/zztd;->zzbzn:Lcom/google/android/gms/internal/zzadp;

    if-eqz p1, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/zzsy;->zzbzh:Lcom/google/android/gms/internal/zzadh;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/zzadp;->zza(Lcom/google/android/gms/internal/zzadh;)V

    :cond_9
    return-void
.end method
