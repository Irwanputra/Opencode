.class public final synthetic Lcom/google/android/gms/internal/zzaae;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzit;


# static fields
.field public static final zzcmt:Lcom/google/android/gms/internal/zzit;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/google/android/gms/internal/zzaae;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzaae;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzaae;->zzcmt:Lcom/google/android/gms/internal/zzit;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzjc;)V
    .registers 3

    iget-object p1, p1, Lcom/google/android/gms/internal/zzjc;->zzbcz:Lcom/google/android/gms/internal/zzja;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/zzja;->zzbct:Ljava/lang/Integer;

    return-void
.end method
