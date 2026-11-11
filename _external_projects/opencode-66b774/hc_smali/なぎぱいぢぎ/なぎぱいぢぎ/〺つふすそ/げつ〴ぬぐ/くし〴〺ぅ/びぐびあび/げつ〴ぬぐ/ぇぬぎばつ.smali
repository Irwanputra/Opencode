.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/ぇぬぎばつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic 〺つふすそ:Lorg/json/JSONObject;

.field public synthetic くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/おぐぴう〸ず;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/おぐぴう〸ず;Lorg/json/JSONObject;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/ぇぬぎばつ;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/おぐぴう〸ず;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/ぇぬぎばつ;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/おぐぴう〸ず;

    iget-object v0, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/おぐぴう〸ず;->くし〴〺ぅ:Lcom/google/android/gms/ads/internal/js/zza;

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/げつ〴ぬぐ/ぇぬぎばつ;->〺つふすそ:Lorg/json/JSONObject;

    const-string v2, "fetchHttpRequestCompleted"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/ads/internal/js/zza;->zza(Ljava/lang/String;Lorg/json/JSONObject;)V

    const-string v0, "Dispatched http response."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzakb;->zzbx(Ljava/lang/String;)V

    return-void
.end method
