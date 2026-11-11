.class public final enum Lcom/google/android/gms/internal/zzdsq;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfga;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/zzdsq;",
        ">;",
        "Lcom/google/android/gms/internal/zzfga;"
    }
.end annotation


# static fields
.field private static final zzbcl:Lcom/google/android/gms/internal/zzfgb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfgb<",
            "Lcom/google/android/gms/internal/zzdsq;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum zzlvn:Lcom/google/android/gms/internal/zzdsq;

.field public static final enum zzlvo:Lcom/google/android/gms/internal/zzdsq;

.field private static enum zzlvp:Lcom/google/android/gms/internal/zzdsq;

.field public static final enum zzlvq:Lcom/google/android/gms/internal/zzdsq;

.field public static final enum zzlvr:Lcom/google/android/gms/internal/zzdsq;

.field public static final enum zzlvs:Lcom/google/android/gms/internal/zzdsq;

.field private static final synthetic zzlvt:[Lcom/google/android/gms/internal/zzdsq;


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .registers 13

    new-instance v0, Lcom/google/android/gms/internal/zzdsq;

    const-string v1, "UNKNOWN_HASH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsq;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/zzdsq;->zzlvn:Lcom/google/android/gms/internal/zzdsq;

    new-instance v1, Lcom/google/android/gms/internal/zzdsq;

    const-string v3, "SHA1"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/zzdsq;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/zzdsq;->zzlvo:Lcom/google/android/gms/internal/zzdsq;

    new-instance v3, Lcom/google/android/gms/internal/zzdsq;

    const-string v5, "SHA224"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/zzdsq;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/zzdsq;->zzlvp:Lcom/google/android/gms/internal/zzdsq;

    new-instance v3, Lcom/google/android/gms/internal/zzdsq;

    const-string v5, "SHA256"

    const/4 v7, 0x3

    invoke-direct {v3, v5, v7, v7}, Lcom/google/android/gms/internal/zzdsq;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/zzdsq;->zzlvq:Lcom/google/android/gms/internal/zzdsq;

    new-instance v5, Lcom/google/android/gms/internal/zzdsq;

    const-string v8, "SHA512"

    const/4 v9, 0x4

    invoke-direct {v5, v8, v9, v9}, Lcom/google/android/gms/internal/zzdsq;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/zzdsq;->zzlvr:Lcom/google/android/gms/internal/zzdsq;

    new-instance v8, Lcom/google/android/gms/internal/zzdsq;

    const-string v10, "UNRECOGNIZED"

    const/4 v11, 0x5

    const/4 v12, -0x1

    invoke-direct {v8, v10, v11, v12}, Lcom/google/android/gms/internal/zzdsq;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/zzdsq;->zzlvs:Lcom/google/android/gms/internal/zzdsq;

    const/4 v10, 0x6

    new-array v10, v10, [Lcom/google/android/gms/internal/zzdsq;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    sget-object v0, Lcom/google/android/gms/internal/zzdsq;->zzlvp:Lcom/google/android/gms/internal/zzdsq;

    aput-object v0, v10, v6

    aput-object v3, v10, v7

    aput-object v5, v10, v9

    aput-object v8, v10, v11

    sput-object v10, Lcom/google/android/gms/internal/zzdsq;->zzlvt:[Lcom/google/android/gms/internal/zzdsq;

    new-instance v0, Lcom/google/android/gms/internal/zzdsr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdsr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdsq;->zzbcl:Lcom/google/android/gms/internal/zzfgb;

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

    iput p3, p0, Lcom/google/android/gms/internal/zzdsq;->value:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/zzdsq;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsq;->zzlvt:[Lcom/google/android/gms/internal/zzdsq;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/zzdsq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/zzdsq;

    return-object v0
.end method

.method public static zzfr(I)Lcom/google/android/gms/internal/zzdsq;
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
    sget-object p0, Lcom/google/android/gms/internal/zzdsq;->zzlvr:Lcom/google/android/gms/internal/zzdsq;

    return-object p0

    :cond_13
    sget-object p0, Lcom/google/android/gms/internal/zzdsq;->zzlvq:Lcom/google/android/gms/internal/zzdsq;

    return-object p0

    :cond_16
    sget-object p0, Lcom/google/android/gms/internal/zzdsq;->zzlvp:Lcom/google/android/gms/internal/zzdsq;

    return-object p0

    :cond_19
    sget-object p0, Lcom/google/android/gms/internal/zzdsq;->zzlvo:Lcom/google/android/gms/internal/zzdsq;

    return-object p0

    :cond_1c
    sget-object p0, Lcom/google/android/gms/internal/zzdsq;->zzlvn:Lcom/google/android/gms/internal/zzdsq;

    return-object p0
.end method


# virtual methods
.method public final zzhq()I
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdsq;->zzlvs:Lcom/google/android/gms/internal/zzdsq;

    if-eq p0, v0, :cond_7

    iget v0, p0, Lcom/google/android/gms/internal/zzdsq;->value:I

    return v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
