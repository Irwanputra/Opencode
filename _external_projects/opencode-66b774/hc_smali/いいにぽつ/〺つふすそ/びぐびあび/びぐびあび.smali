.class public Lいいにぽつ/〺つふすそ/びぐびあび/びぐびあび;
.super Lいいにぽつ/〺つふすそ/びぐびあび/ぇぬぎばつ;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/ぇぬぎばつ;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public ぇぬぎばつ()Ljava/lang/String;
    .registers 2

    const-string v0, "#cdata"

    return-object v0
.end method

.method public ざとぅぼこ〺(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    const-string p2, "<![CDATA["

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    .line 1
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->ぶでにく〼〳()Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public は〲ぱなで(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    :try_start_0
    const-string p2, "]]>"

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_5} :catch_6

    return-void

    :catch_6
    move-exception p1

    new-instance p2, Lいいにぽつ/〺つふすそ/〺つふすそ;

    invoke-direct {p2, p1}, Lいいにぽつ/〺つふすそ/〺つふすそ;-><init>(Ljava/io/IOException;)V

    throw p2
.end method
