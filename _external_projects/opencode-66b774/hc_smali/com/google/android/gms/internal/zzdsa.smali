.class public final enum Lcom/google/android/gms/internal/zzdsa;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzfga;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/zzdsa;",
        ">;",
        "Lcom/google/android/gms/internal/zzfga;"
    }
.end annotation


# static fields
.field private static final zzbcl:Lcom/google/android/gms/internal/zzfgb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzfgb<",
            "Lcom/google/android/gms/internal/zzdsa;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum zzluk:Lcom/google/android/gms/internal/zzdsa;

.field public static final enum zzlul:Lcom/google/android/gms/internal/zzdsa;

.field public static final enum zzlum:Lcom/google/android/gms/internal/zzdsa;

.field public static final enum zzlun:Lcom/google/android/gms/internal/zzdsa;

.field private static final synthetic zzluo:[Lcom/google/android/gms/internal/zzdsa;


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .registers 10

    new-instance v0, Lcom/google/android/gms/internal/zzdsa;

    const-string v1, "UNKNOWN_FORMAT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/zzdsa;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/zzdsa;->zzluk:Lcom/google/android/gms/internal/zzdsa;

    new-instance v1, Lcom/google/android/gms/internal/zzdsa;

    const-string v3, "UNCOMPRESSED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/zzdsa;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/zzdsa;->zzlul:Lcom/google/android/gms/internal/zzdsa;

    new-instance v3, Lcom/google/android/gms/internal/zzdsa;

    const-string v5, "COMPRESSED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/zzdsa;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/zzdsa;->zzlum:Lcom/google/android/gms/internal/zzdsa;

    new-instance v5, Lcom/google/android/gms/internal/zzdsa;

    const-string v7, "UNRECOGNIZED"

    const/4 v8, 0x3

    const/4 v9, -0x1

    invoke-direct {v5, v7, v8, v9}, Lcom/google/android/gms/internal/zzdsa;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/zzdsa;->zzlun:Lcom/google/android/gms/internal/zzdsa;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/google/android/gms/internal/zzdsa;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/google/android/gms/internal/zzdsa;->zzluo:[Lcom/google/android/gms/internal/zzdsa;

    new-instance v0, Lcom/google/android/gms/internal/zzdsb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzdsb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzdsa;->zzbcl:Lcom/google/android/gms/internal/zzfgb;

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

    iput p3, p0, Lcom/google/android/gms/internal/zzdsa;->value:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/zzdsa;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzdsa;->zzluo:[Lcom/google/android/gms/internal/zzdsa;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/zzdsa;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/zzdsa;

    return-object v0
.end method

.method public static zzfn(I)Lcom/google/android/gms/internal/zzdsa;
    .registers 2

    if-eqz p0, :cond_10

    const/4 v0, 0x1

    if-eq p0, v0, :cond_d

    const/4 v0, 0x2

    if-eq p0, v0, :cond_a

    const/4 p0, 0x0

    return-object p0

    :cond_a
    sget-object p0, Lcom/google/android/gms/internal/zzdsa;->zzlum:Lcom/google/android/gms/internal/zzdsa;

    return-object p0

    :cond_d
    sget-object p0, Lcom/google/android/gms/internal/zzdsa;->zzlul:Lcom/google/android/gms/internal/zzdsa;

    return-object p0

    :cond_10
    sget-object p0, Lcom/google/android/gms/internal/zzdsa;->zzluk:Lcom/google/android/gms/internal/zzdsa;

    return-object p0
.end method


# virtual methods
.method public final zzhq()I
    .registers 3

    sget-object v0, Lcom/google/android/gms/internal/zzdsa;->zzlun:Lcom/google/android/gms/internal/zzdsa;

    if-eq p0, v0, :cond_7

    iget v0, p0, Lcom/google/android/gms/internal/zzdsa;->value:I

    return v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
