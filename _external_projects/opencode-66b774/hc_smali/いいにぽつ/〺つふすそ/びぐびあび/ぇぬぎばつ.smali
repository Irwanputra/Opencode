.class public Lいいにぽつ/〺つふすそ/びぐびあび/ぇぬぎばつ;
.super Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;-><init>()V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    return-void
.end method

.method public static ぉ〲なぱぽた(Ljava/lang/StringBuilder;)Z
    .registers 3

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_15

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_15

    goto :goto_16

    :cond_15
    const/4 v1, 0x0

    :goto_16
    return v1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぉざぅち〻()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ぇぬぎばつ()Ljava/lang/String;
    .registers 2

    const-string v0, "#text"

    return-object v0
.end method

.method public ざとぅぼこ〺(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 10

    .line 1
    iget-boolean v0, p3, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_24

    .line 2
    iget v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->くし〴〺ぅ:I

    if-nez v0, :cond_24

    .line 3
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    instance-of v1, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    if-eqz v1, :cond_24

    check-cast v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    .line 4
    iget-object v0, v0, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->びぐびあび:Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;

    .line 5
    iget-boolean v0, v0, Lいいにぽつ/〺つふすそ/づざかべべ/ぁごぐすすぃ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_24

    .line 6
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->ぶでにく〼〳()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    goto :goto_24

    .line 7
    :cond_21
    invoke-virtual {p0, p1, p2, p3}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->へぬ〴づぞ(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V

    .line 8
    :cond_24
    :goto_24
    iget-boolean p2, p3, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-eqz p2, :cond_37

    .line 9
    iget-object p2, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    .line 10
    instance-of v0, p2, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;

    if-eqz v0, :cond_37

    invoke-static {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;->ぺづげぺが(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;)Z

    move-result p2

    if-nez p2, :cond_37

    const/4 p2, 0x1

    const/4 v4, 0x1

    goto :goto_39

    :cond_37
    const/4 p2, 0x0

    const/4 v4, 0x0

    :goto_39
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->ぶでにく〼〳()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, p3

    invoke-static/range {v0 .. v5}, Lいいにぽつ/〺つふすそ/びぐびあび/いいにぽつ;->〺つふすそ(Ljava/lang/Appendable;Ljava/lang/String;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;ZZZ)V

    return-void
.end method

.method public は〲ぱなで(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    return-void
.end method
