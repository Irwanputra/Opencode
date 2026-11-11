.class public abstract enum Lcom/google/android/gms/internal/zzfje;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/zzfje;",
        ">;"
    }
.end annotation


# static fields
.field private static enum zzpmv:Lcom/google/android/gms/internal/zzfje;

.field public static final enum zzpmw:Lcom/google/android/gms/internal/zzfje;

.field private static enum zzpmx:Lcom/google/android/gms/internal/zzfje;

.field private static final synthetic zzpmy:[Lcom/google/android/gms/internal/zzfje;


# direct methods
.method public static constructor <clinit>()V
    .registers 7

    new-instance v0, Lcom/google/android/gms/internal/zzfjf;

    const-string v1, "LOOSE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzfjf;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzfje;->zzpmv:Lcom/google/android/gms/internal/zzfje;

    new-instance v0, Lcom/google/android/gms/internal/zzfjg;

    const-string v1, "STRICT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/zzfjg;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zzfje;->zzpmw:Lcom/google/android/gms/internal/zzfje;

    new-instance v1, Lcom/google/android/gms/internal/zzfjh;

    const-string v4, "LAZY"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v5}, Lcom/google/android/gms/internal/zzfjh;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/gms/internal/zzfje;->zzpmx:Lcom/google/android/gms/internal/zzfje;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/google/android/gms/internal/zzfje;

    sget-object v6, Lcom/google/android/gms/internal/zzfje;->zzpmv:Lcom/google/android/gms/internal/zzfje;

    aput-object v6, v4, v2

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    sput-object v4, Lcom/google/android/gms/internal/zzfje;->zzpmy:[Lcom/google/android/gms/internal/zzfje;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/google/android/gms/internal/zzfix;)V
    .registers 4

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzfje;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/zzfje;
    .registers 1

    sget-object v0, Lcom/google/android/gms/internal/zzfje;->zzpmy:[Lcom/google/android/gms/internal/zzfje;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/zzfje;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/zzfje;

    return-object v0
.end method


# virtual methods
.method public abstract zza(Lcom/google/android/gms/internal/zzffb;)Ljava/lang/Object;
.end method
