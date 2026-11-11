.class public final L〳ぜぞぜべっ/ぉ〲なぱぽた;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/String;

.field public final くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

.field public final づざかべべ:Ljava/lang/Object;

.field public volatile なぎぱいぢぎ:L〳ぜぞぜべっ/くし〴〺ぅ;

.field public final びぐびあび:L〳ぜぞぜべっ/びえぁぜい;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->〺つふすそ:Ljava/lang/String;

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/String;

    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;

    .line 1
    new-instance v1, L〳ぜぞぜべっ/ぉざぅち〻;

    invoke-direct {v1, v0}, L〳ぜぞぜべっ/ぉざぅち〻;-><init>(L〳ぜぞぜべっ/ぉざぅち〻$げつ〴ぬぐ;)V

    .line 2
    iput-object v1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

    iget-object v0, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->びぐびあび:L〳ぜぞぜべっ/びえぁぜい;

    iget-object p1, p1, L〳ぜぞぜべっ/ぉ〲なぱぽた$げつ〴ぬぐ;->づざかべべ:Ljava/lang/Object;

    if-eqz p1, :cond_1d

    goto :goto_1e

    :cond_1d
    move-object p1, p0

    :goto_1e
    iput-object p1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->づざかべべ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "Request{method="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->げつ〴ぬぐ:L〳ぜぞぜべっ/ざとぅぼこ〺;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->づざかべべ:Ljava/lang/Object;

    if-eq v1, p0, :cond_1f

    goto :goto_20

    :cond_1f
    const/4 v1, 0x0

    :goto_20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ()L〳ぜぞぜべっ/くし〴〺ぅ;
    .registers 2

    iget-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->なぎぱいぢぎ:L〳ぜぞぜべっ/くし〴〺ぅ;

    if-eqz v0, :cond_5

    goto :goto_d

    :cond_5
    iget-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->くし〴〺ぅ:L〳ぜぞぜべっ/ぉざぅち〻;

    invoke-static {v0}, L〳ぜぞぜべっ/くし〴〺ぅ;->げつ〴ぬぐ(L〳ぜぞぜべっ/ぉざぅち〻;)L〳ぜぞぜべっ/くし〴〺ぅ;

    move-result-object v0

    iput-object v0, p0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->なぎぱいぢぎ:L〳ぜぞぜべっ/くし〴〺ぅ;

    :goto_d
    return-object v0
.end method
