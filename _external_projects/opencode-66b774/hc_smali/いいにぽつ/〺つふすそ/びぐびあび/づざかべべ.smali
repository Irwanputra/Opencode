.class public Lいいにぽつ/〺つふすそ/びぐびあび/づざかべべ;
.super Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;-><init>()V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->びぐびあび:Ljava/lang/Object;

    return-void
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

    const-string v0, "#comment"

    return-object v0
.end method

.method public ざとぅぼこ〺(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 5

    .line 1
    iget-boolean v0, p3, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_7

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->へぬ〴づぞ(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V

    :cond_7
    const-string p2, "<!--"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->ぶでにく〼〳()Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, "-->"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public は〲ぱなで(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    return-void
.end method
