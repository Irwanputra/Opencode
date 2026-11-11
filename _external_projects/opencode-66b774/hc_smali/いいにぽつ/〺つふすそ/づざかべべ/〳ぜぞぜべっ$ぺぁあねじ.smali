.class public abstract Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;
.super Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u307a\u3041\u3042\u306d\u3058"
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:Ljava/lang/String;

.field public ぁごぐすすぃ:Z

.field public いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

.field public くし〴〺ぅ:Ljava/lang/String;

.field public づざかべべ:Ljava/lang/StringBuilder;

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public びぐびあび:Ljava/lang/String;

.field public ぺぁあねじ:Z


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;-><init>(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$げつ〴ぬぐ;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ぁごぐすすぃ:Z

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〳ぜぞぜべっ:Z

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ぺぁあねじ:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic ぁごぐすすぃ()Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->は〲ぱなで()Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;

    move-result-object v0

    return-object v0
.end method

.method public final いいにぽつ(C)V
    .registers 3

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->おぐぴう〸ず()V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ぇぬぎばつ()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〺つふすそ:Ljava/lang/String;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_b

    goto :goto_d

    :cond_b
    const/4 v0, 0x0

    goto :goto_e

    :cond_d
    :goto_d
    const/4 v0, 0x1

    :goto_e
    if-nez v0, :cond_13

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〺つふすそ:Ljava/lang/String;

    return-object v0

    .line 1
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must be false"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ぉざぅち〻(Ljava/lang/String;)Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;
    .registers 2

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〺つふすそ:Ljava/lang/String;

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のね〱ばぁぢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    return-object p0
.end method

.method public final おぐぴう〸ず()V
    .registers 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〳ぜぞぜべっ:Z

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->なぎぱいぢぎ:Ljava/lang/String;

    if-eqz v0, :cond_f

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->なぎぱいぢぎ:Ljava/lang/String;

    :cond_f
    return-void
.end method

.method public final ざとぅぼこ〺()V
    .registers 5

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    if-nez v0, :cond_b

    new-instance v0, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    invoke-direct {v0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    :cond_b
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->びぐびあび:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_41

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_41

    iget-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_32

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_2f

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3a

    :cond_2f
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->なぎぱいぢぎ:Ljava/lang/String;

    goto :goto_3a

    :cond_32
    iget-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ぁごぐすすぃ:Z

    if-eqz v0, :cond_39

    const-string v0, ""

    goto :goto_3a

    :cond_39
    move-object v0, v1

    :goto_3a
    iget-object v2, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    iget-object v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;->ぺふねづ〺(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    :cond_41
    iput-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->びぐびあび:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ぁごぐすすぃ:Z

    iput-boolean v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〳ぜぞぜべっ:Z

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-static {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(Ljava/lang/StringBuilder;)V

    iput-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->なぎぱいぢぎ:Ljava/lang/String;

    return-void
.end method

.method public final てぜきぽく([I)V
    .registers 6

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->おぐぴう〸ず()V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_11

    aget v2, p1, v1

    iget-object v3, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_11
    return-void
.end method

.method public final のぷのちつ(C)V
    .registers 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->へぬ〴づぞ(Ljava/lang/String;)V

    return-void
.end method

.method public は〲ぱなで()Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;
    .registers 3

    const/4 v0, 0x0

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〺つふすそ:Ljava/lang/String;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->びぐびあび:Ljava/lang/String;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-static {v1}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(Ljava/lang/StringBuilder;)V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->なぎぱいぢぎ:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ぁごぐすすぃ:Z

    iput-boolean v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〳ぜぞぜべっ:Z

    iput-boolean v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->ぺぁあねじ:Z

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->いいにぽつ:Lいいにぽつ/〺つふすそ/びぐびあび/〺つふすそ;

    return-object p0
.end method

.method public final へぬ〴づぞ(Ljava/lang/String;)V
    .registers 3

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〺つふすそ:Ljava/lang/String;

    if-nez v0, :cond_5

    goto :goto_9

    :cond_5
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_9
    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->〺つふすそ:Ljava/lang/String;

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のね〱ばぁぢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->くし〴〺ぅ:Ljava/lang/String;

    return-void
.end method

.method public final ぺぁあねじ(C)V
    .registers 3

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    .line 1
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->びぐびあび:Ljava/lang/String;

    if-nez v0, :cond_9

    goto :goto_d

    :cond_9
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_d
    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->びぐびあび:Ljava/lang/String;

    return-void
.end method

.method public final ぺふねづ〺(Ljava/lang/String;)V
    .registers 3

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->おぐぴう〸ず()V

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_e

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->なぎぱいぢぎ:Ljava/lang/String;

    goto :goto_13

    :cond_e
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$ぺぁあねじ;->づざかべべ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_13
    return-void
.end method
