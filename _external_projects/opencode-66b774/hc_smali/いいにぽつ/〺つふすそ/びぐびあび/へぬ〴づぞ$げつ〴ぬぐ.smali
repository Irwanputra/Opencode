.class public Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/づざかべべ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

.field public げつ〴ぬぐ:Ljava/lang/Appendable;


# direct methods
.method public constructor <init>(Ljava/lang/Appendable;Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Appendable;

    iput-object p2, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-virtual {p2}, Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ()Ljava/nio/charset/CharsetEncoder;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;I)V
    .registers 5

    invoke-virtual {p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#text"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    :try_start_c
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Appendable;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-virtual {p1, v0, p2, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->は〲ぱなで(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_13} :catch_14

    goto :goto_1b

    :catch_14
    move-exception p1

    new-instance p2, Lいいにぽつ/〺つふすそ/げつ〴ぬぐ;

    invoke-direct {p2, p1}, Lいいにぽつ/〺つふすそ/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_1b
    :goto_1b
    return-void
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;I)V
    .registers 5

    :try_start_0
    iget-object v0, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/Appendable;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ$げつ〴ぬぐ;->〺つふすそ:Lいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-virtual {p1, v0, p2, v1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->ざとぅぼこ〺(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_7} :catch_8

    return-void

    :catch_8
    move-exception p1

    new-instance p2, Lいいにぽつ/〺つふすそ/げつ〴ぬぐ;

    invoke-direct {p2, p1}, Lいいにぽつ/〺つふすそ/げつ〴ぬぐ;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
