.class public final enum Lcom/google/android/gms/internal/zzdtb;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfga;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/zzdtb;",
        ">;",
        "Lcom/google/android/gms/internal/zzfga;"
    }
.end annotation


# static fields
.field private static final zzbcl:Lcom/google/android/gms/internal/zzfgb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfgb<",
            "Lcom/google/android/gms/internal/zzdtb;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum zzlwl:Lcom/google/android/gms/internal/zzdtb;

.field public static final enum zzlwm:Lcom/google/android/gms/internal/zzdtb;

.field private static enum zzlwn:Lcom/google/android/gms/internal/zzdtb;

.field private static enum zzlwo:Lcom/google/android/gms/internal/zzdtb;

.field public static final enum zzlwp:Lcom/google/android/gms/internal/zzdtb;

.field private static final synthetic zzlwq:[Lcom/google/android/gms/internal/zzdtb;


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .registers 10

    new-instance v0, Lcom/google/android/gms/internal/zzdtb;

    const-string v1, "UNKNOWN_STATUS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdtb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/zzdtb;->zzlwl:Lcom/google/android/gms/internal/zzdtb;

    new-instance v1, Lcom/google/android/gms/internal/zzdtb;

    const-string v3, "ENABLED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/zzdtb;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/zzdtb;->zzlwm:Lcom/google/android/gms/internal/zzdtb;

    new-instance v3, Lcom/google/android/gms/internal/zzdtb;

    const-string v5, "DISABLED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/zzdtb;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/zzdtb;->zzlwn:Lcom/google/android/gms/internal/zzdtb;

    new-instance v3, Lcom/google/android/gms/internal/zzdtb;

    const-string v5, "DESTROYED"

    const/4 v7, 0x3

    invoke-direct {v3, v5, v7, v7}, Lcom/google/android/gms/internal/zzdtb;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/zzdtb;->zzlwo:Lcom/google/android/gms/internal/zzdtb;

    new-instance v3, Lcom/google/android/gms/internal/zzdtb;

    const-string v5, "UNRECOGNIZED"

    const/4 v8, 0x4

    const/4 v9, -0x1

    invoke-direct {v3, v5, v8, v9}, Lcom/google/android/gms/internal/zzdtb;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/zzdtb;->zzlwp:Lcom/google/android/gms/internal/zzdtb;

    const/4 v5, 0x5

    new-array v5, v5, [Lcom/google/android/gms/internal/zzdtb;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    sget-object v0, Lcom/google/android/gms/internal/zzdtb;->zzlwn:Lcom/google/android/gms/internal/zzdtb;

    aput-object v0, v5, v6

    sget-object v0, Lcom/google/android/gms/internal/zzdtb;->zzlwo:Lcom/google/android/gms/internal/zzdtb;

    aput-object v0, v5, v7

    aput-object v3, v5, v8

    sput-object v5, Lcom/google/android/gms/internal/zzdtb;->zzlwq:[Lcom/google/android/gms/internal/zzdtb;

    new-instance v0, Lcom/google/android/gms/internal/zzdtc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdtc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdtb;->zzbcl:Lcom/google/android/gms/internal/zzfgb;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/zzdtb;->value:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/zzdtb;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdtb;->zzlwq:[Lcom/google/android/gms/internal/zzdtb;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/zzdtb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/zzdtb;

    return-object v0
.end method

.method public static zzfu(I)Lcom/google/android/gms/internal/zzdtb;
    .registers 2

    if-eqz p0, :cond_16

    const/4 v0, 0x1

    if-eq p0, v0, :cond_13

    const/4 v0, 0x2

    if-eq p0, v0, :cond_10

    const/4 v0, 0x3

    if-eq p0, v0, :cond_d

    const/4 p0, 0x0

    return-object p0

    :cond_d
    sget-object p0, Lcom/google/android/gms/internal/zzdtb;->zzlwo:Lcom/google/android/gms/internal/zzdtb;

    return-object p0

    :cond_10
    sget-object p0, Lcom/google/android/gms/internal/zzdtb;->zzlwn:Lcom/google/android/gms/internal/zzdtb;

    return-object p0

    :cond_13
    sget-object p0, Lcom/google/android/gms/internal/zzdtb;->zzlwm:Lcom/google/android/gms/internal/zzdtb;

    return-object p0

    :cond_16
    sget-object p0, Lcom/google/android/gms/internal/zzdtb;->zzlwl:Lcom/google/android/gms/internal/zzdtb;

    return-object p0
.end method


# virtual methods
.method public final zzhq()I
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdtb;->zzlwp:Lcom/google/android/gms/internal/zzdtb;

    if-eq p0, v0, :cond_7

    iget v0, p0, Lcom/google/android/gms/internal/zzdtb;->value:I

    return v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
