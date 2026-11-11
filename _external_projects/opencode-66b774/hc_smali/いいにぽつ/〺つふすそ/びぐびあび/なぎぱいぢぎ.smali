.class public Lいいにぽつ/〺つふすそ/びぐびあび/なぎぱいぢぎ;
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

    const-string v0, "#data"

    return-object v0
.end method

.method public ざとぅぼこ〺(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lいいにぽつ/〺つふすそ/びぐびあび/てぜきぽく;->ぶでにく〼〳()Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public は〲ぱなで(Ljava/lang/Appendable;ILいいにぽつ/〺つふすそ/びぐびあび/ぁごぐすすぃ$げつ〴ぬぐ;)V
    .registers 4

    return-void
.end method
