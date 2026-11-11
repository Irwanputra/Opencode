.class public final enum Lcom/google/android/gms/internal/zzdso;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfga;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/zzdso;",
        ">;",
        "Lcom/google/android/gms/internal/zzfga;"
    }
.end annotation


# static fields
.field private static final zzbcl:Lcom/google/android/gms/internal/zzfgb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfgb<",
            "Lcom/google/android/gms/internal/zzdso;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum zzlvg:Lcom/google/android/gms/internal/zzdso;

.field private static enum zzlvh:Lcom/google/android/gms/internal/zzdso;

.field public static final enum zzlvi:Lcom/google/android/gms/internal/zzdso;

.field public static final enum zzlvj:Lcom/google/android/gms/internal/zzdso;

.field public static final enum zzlvk:Lcom/google/android/gms/internal/zzdso;

.field public static final enum zzlvl:Lcom/google/android/gms/internal/zzdso;

.field private static final synthetic zzlvm:[Lcom/google/android/gms/internal/zzdso;


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .registers 13

    new-instance v0, Lcom/google/android/gms/internal/zzdso;

    const-string v1, "UNKNOWN_CURVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdso;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/zzdso;->zzlvg:Lcom/google/android/gms/internal/zzdso;

    new-instance v1, Lcom/google/android/gms/internal/zzdso;

    const-string v3, "NIST_P224"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/zzdso;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/zzdso;->zzlvh:Lcom/google/android/gms/internal/zzdso;

    new-instance v1, Lcom/google/android/gms/internal/zzdso;

    const-string v3, "NIST_P256"

    const/4 v5, 0x2

    invoke-direct {v1, v3, v5, v5}, Lcom/google/android/gms/internal/zzdso;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/zzdso;->zzlvi:Lcom/google/android/gms/internal/zzdso;

    new-instance v3, Lcom/google/android/gms/internal/zzdso;

    const-string v6, "NIST_P384"

    const/4 v7, 0x3

    invoke-direct {v3, v6, v7, v7}, Lcom/google/android/gms/internal/zzdso;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/zzdso;->zzlvj:Lcom/google/android/gms/internal/zzdso;

    new-instance v6, Lcom/google/android/gms/internal/zzdso;

    const-string v8, "NIST_P521"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v9, v9}, Lcom/google/android/gms/internal/zzdso;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/zzdso;->zzlvk:Lcom/google/android/gms/internal/zzdso;

    new-instance v8, Lcom/google/android/gms/internal/zzdso;

    const-string v10, "UNRECOGNIZED"

    const/4 v11, 0x5

    const/4 v12, -0x1

    invoke-direct {v8, v10, v11, v12}, Lcom/google/android/gms/internal/zzdso;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/zzdso;->zzlvl:Lcom/google/android/gms/internal/zzdso;

    const/4 v10, 0x6

    new-array v10, v10, [Lcom/google/android/gms/internal/zzdso;

    aput-object v0, v10, v2

    sget-object v0, Lcom/google/android/gms/internal/zzdso;->zzlvh:Lcom/google/android/gms/internal/zzdso;

    aput-object v0, v10, v4

    aput-object v1, v10, v5

    aput-object v3, v10, v7

    aput-object v6, v10, v9

    aput-object v8, v10, v11

    sput-object v10, Lcom/google/android/gms/internal/zzdso;->zzlvm:[Lcom/google/android/gms/internal/zzdso;

    new-instance v0, Lcom/google/android/gms/internal/zzdsp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdsp;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdso;->zzbcl:Lcom/google/android/gms/internal/zzfgb;

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

    iput p3, p0, Lcom/google/android/gms/internal/zzdso;->value:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/zzdso;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdso;->zzlvm:[Lcom/google/android/gms/internal/zzdso;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/zzdso;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/zzdso;

    return-object v0
.end method

.method public static zzfq(I)Lcom/google/android/gms/internal/zzdso;
    .registers 2

    if-eqz p0, :cond_1c

    const/4 v0, 0x1

    if-eq p0, v0, :cond_19

    const/4 v0, 0x2

    if-eq p0, v0, :cond_16

    const/4 v0, 0x3

    if-eq p0, v0, :cond_13

    const/4 v0, 0x4

    if-eq p0, v0, :cond_10

    const/4 p0, 0x0

    return-object p0

    :cond_10
    sget-object p0, Lcom/google/android/gms/internal/zzdso;->zzlvk:Lcom/google/android/gms/internal/zzdso;

    return-object p0

    :cond_13
    sget-object p0, Lcom/google/android/gms/internal/zzdso;->zzlvj:Lcom/google/android/gms/internal/zzdso;

    return-object p0

    :cond_16
    sget-object p0, Lcom/google/android/gms/internal/zzdso;->zzlvi:Lcom/google/android/gms/internal/zzdso;

    return-object p0

    :cond_19
    sget-object p0, Lcom/google/android/gms/internal/zzdso;->zzlvh:Lcom/google/android/gms/internal/zzdso;

    return-object p0

    :cond_1c
    sget-object p0, Lcom/google/android/gms/internal/zzdso;->zzlvg:Lcom/google/android/gms/internal/zzdso;

    return-object p0
.end method


# virtual methods
.method public final zzhq()I
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdso;->zzlvl:Lcom/google/android/gms/internal/zzdso;

    if-eq p0, v0, :cond_7

    iget v0, p0, Lcom/google/android/gms/internal/zzdso;->value:I

    return v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
