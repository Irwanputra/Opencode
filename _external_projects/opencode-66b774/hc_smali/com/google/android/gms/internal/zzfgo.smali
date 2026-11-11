.class public final Lcom/google/android/gms/internal/zzfgo;
.super Lcom/google/android/gms/internal/zzfgm;
.source ""


# static fields
.field private static final zzpid:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/zzfgo;->zzpid:Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzfgm;-><init>(Lcom/google/android/gms/internal/zzfgn;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/zzfgn;)V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzfgo;-><init>()V

    return-void
.end method
