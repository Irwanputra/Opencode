.class public Lいいにぽつ/〺つふすそ/びぐびあび/〳ぜぞぜべっ;
.super Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;
.source ""


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;-><init>()V

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    invoke-static {p2}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    invoke-static {p3}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ずまげせび〳(Ljava/lang/Object;)V

    const-string v0, "name"

    invoke-virtual {p0, v0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    const-string p1, "publicId"

    invoke-virtual {p0, p1, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    .line 1
    invoke-virtual {p0, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_29

    const-string p1, "pubSysKey"

    const-string p2, "PUBLIC"

    .line 2
    invoke-virtual {p0, p1, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    :cond_29
    const-string p1, "systemId"

    invoke-virtual {p0, p1, p3}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;)Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;

    return-void
.end method


# virtual methods
.method public ぇぬぎばつ()Ljava/lang/String;
    .registers 2

    const-string v0, "#doctype"

    return-object v0
.end method

.method public ざとぅぼこ〺(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 7

    .line 1
    iget-object p2, p3, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->〳ぜぞぜべっ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;

    .line 2
    sget-object p3, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ$げつ〴ぬぐ;

    const-string v0, "systemId"

    const-string v1, "publicId"

    if-ne p2, p3, :cond_25

    .line 3
    invoke-virtual {p0, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-nez p2, :cond_25

    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-nez p2, :cond_25

    const-string p2, "<!doctype"

    goto :goto_27

    :cond_25
    const-string p2, "<!DOCTYPE"

    .line 4
    :goto_27
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const-string p2, "name"

    .line 5
    invoke-virtual {p0, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    const-string v2, " "

    if-eqz p3, :cond_45

    .line 6
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p3

    invoke-virtual {p0, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_45
    const-string p2, "pubSysKey"

    .line 7
    invoke-virtual {p0, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_5e

    .line 8
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p3

    invoke-virtual {p0, p2}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 9
    :cond_5e
    invoke-virtual {p0, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    const/16 p3, 0x22

    const-string v2, " \""

    if-eqz p2, :cond_7d

    .line 10
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-virtual {p0, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 11
    :cond_7d
    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lいいにぽつ/〺つふすそ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ(Ljava/lang/String;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_98

    .line 12
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-virtual {p0, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_98
    const/16 p2, 0x3e

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public は〲ぱなで(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    return-void
.end method
