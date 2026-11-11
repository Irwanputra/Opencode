.class public final Lcom/google/android/gms/internal/zzze;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzys;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzys<",
        "Lcom/google/android/gms/internal/zzon;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzcln:Z


# direct methods
.method public constructor <init>(Z)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzze;->zzcln:Z

    return-void
.end method

.method private static zza(Lづざかべべ/づざかべべ/〳ぜぞぜべっ;)Lづざかべべ/づざかべべ/〳ぜぞぜべっ;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063<",
            "TK;",
            "Ljava/util/concurrent/Future<",
            "TV;>;>;)",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    const/4 v1, 0x0

    .line 1
    :goto_6
    iget v2, p0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->びぐびあび:I

    if-ge v1, v2, :cond_1e

    .line 2
    invoke-virtual {p0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->ぺふねづ〺(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/Future;

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_1e
    return-object v0
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/zzym;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzou;
    .registers 13

    new-instance v0, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    new-instance v4, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    invoke-direct {v4}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;-><init>()V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzym;->zzh(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v1

    const-string v2, "video"

    invoke-virtual {p1, p2, v2}, Lcom/google/android/gms/internal/zzym;->zzc(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/zzakv;

    move-result-object v2

    const-string v3, "custom_assets"

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    const/4 v5, 0x0

    :goto_1b
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_78

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "type"

    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "string"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "name"

    if-eqz v8, :cond_43

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "string_value"

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v7, v6}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_75

    :cond_43
    const-string v8, "image"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5b

    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-boolean v8, p0, Lcom/google/android/gms/internal/zzze;->zzcln:Z

    const-string v9, "image_value"

    invoke-virtual {p1, v6, v9, v8}, Lcom/google/android/gms/internal/zzym;->zza(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;

    move-result-object v6

    invoke-virtual {v0, v7, v6}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_75

    :cond_5b
    const-string v6, "Unknown custom asset type: "

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_6c

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_72

    :cond_6c
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v6}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v6, v7

    :goto_72
    invoke-static {v6}, Lcom/google/android/gms/internal/zzakb;->zzcu(Ljava/lang/String;)V

    :goto_75
    add-int/lit8 v5, v5, 0x1

    goto :goto_1b

    :cond_78
    invoke-static {v2}, Lcom/google/android/gms/internal/zzym;->zzb(Lcom/google/android/gms/internal/zzakv;)Lcom/google/android/gms/internal/zzanh;

    move-result-object p1

    new-instance v8, Lcom/google/android/gms/internal/zzon;

    const-string v2, "custom_template_id"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/google/android/gms/internal/zzze;->zza(Lづざかべべ/づざかべべ/〳ぜぞぜべっ;)Lづざかべべ/づざかべべ/〳ぜぞぜべっ;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Lcom/google/android/gms/internal/zzog;

    const/4 p2, 0x0

    if-eqz p1, :cond_98

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzanh;->zzsg()Lcom/google/android/gms/internal/zzaoa;

    move-result-object v0

    move-object v6, v0

    goto :goto_99

    :cond_98
    move-object v6, p2

    :goto_99
    if-eqz p1, :cond_9f

    check-cast p1, Landroid/view/View;

    move-object v7, p1

    goto :goto_a0

    :cond_9f
    move-object v7, p2

    :goto_a0
    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/zzon;-><init>(Ljava/lang/String;Lづざかべべ/づざかべべ/〳ぜぞぜべっ;Lづざかべべ/づざかべべ/〳ぜぞぜべっ;Lcom/google/android/gms/internal/zzog;Lcom/google/android/gms/internal/zzll;Landroid/view/View;)V

    return-object v8
.end method
