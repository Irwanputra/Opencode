.class public final Lcom/google/android/gms/internal/zzfr;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation


# instance fields
.field private final zzavk:Ljava/lang/String;

.field private final zzavl:Lorg/json/JSONObject;

.field private final zzavm:Ljava/lang/String;

.field private final zzavn:Ljava/lang/String;

.field private final zzavo:Z

.field private final zzavp:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzakd;Ljava/lang/String;Lorg/json/JSONObject;ZZ)V
    .registers 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p2, p2, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzfr;->zzavn:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzfr;->zzavl:Lorg/json/JSONObject;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfr;->zzavm:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzfr;->zzavk:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzfr;->zzavo:Z

    iput-boolean p6, p0, Lcom/google/android/gms/internal/zzfr;->zzavp:Z

    return-void
.end method


# virtual methods
.method public final zzfr()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfr;->zzavk:Ljava/lang/String;

    return-object v0
.end method

.method public final zzfs()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfr;->zzavn:Ljava/lang/String;

    return-object v0
.end method

.method public final zzft()Lorg/json/JSONObject;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfr;->zzavl:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final zzfu()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfr;->zzavm:Ljava/lang/String;

    return-object v0
.end method

.method public final zzfv()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzfr;->zzavo:Z

    return v0
.end method

.method public final zzfw()Z
    .registers 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzfr;->zzavp:Z

    return v0
.end method
