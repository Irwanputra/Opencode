.class public final synthetic Lcom/google/android/gms/internal/zzacc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzakg;


# static fields
.field public static final zzcrn:Lcom/google/android/gms/internal/zzakg;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/google/android/gms/internal/zzacc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzacc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzacc;->zzcrn:Lcom/google/android/gms/internal/zzakg;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzakv;
    .registers 2

    check-cast p1, Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/google/android/gms/internal/zzacb;->zzm(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzakv;

    move-result-object p1

    return-object p1
.end method
