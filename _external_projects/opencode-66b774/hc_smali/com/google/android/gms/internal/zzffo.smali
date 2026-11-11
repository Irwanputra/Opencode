.class public final Lcom/google/android/gms/internal/zzffo;
.super Lcom/google/android/gms/internal/zzffn;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzffn<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzffn;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzcn(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzffq;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/internal/zzffq<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/zzffu$zzd;

    iget-object p1, p1, Lcom/google/android/gms/internal/zzffu$zzd;->zzpgz:Lcom/google/android/gms/internal/zzffq;

    return-object p1
.end method

.method public final zzh(Ljava/lang/Class;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/zzffu$zzd;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method
