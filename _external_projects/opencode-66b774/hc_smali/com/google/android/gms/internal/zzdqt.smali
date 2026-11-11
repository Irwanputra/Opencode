.class public final Lcom/google/android/gms/internal/zzdqt;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final logger:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-class v0, Lcom/google/android/gms/internal/zzdqt;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/zzdqt;->logger:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/zzdpx;)Lcom/google/android/gms/internal/zzdpv;
    .registers 2

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/zzdqe;->zza(Lcom/google/android/gms/internal/zzdpx;Lcom/google/android/gms/internal/zzdpw;)Lcom/google/android/gms/internal/zzdqc;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/internal/zzdqu;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzdqu;-><init>(Lcom/google/android/gms/internal/zzdqc;)V

    return-object v0
.end method
