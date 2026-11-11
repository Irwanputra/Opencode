.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3033\u305c\u305e\u305c\u3079\u3063"
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/util/regex/Pattern;

.field public げつ〴ぬぐ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/regex/Pattern;)V
    .registers 3

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;-><init>()V

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->くねねぱす〻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/String;

    iput-object p2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;->〺つふすそ:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;->〺つふすそ:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/util/regex/Pattern;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "[%s~=%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 4

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->てぜきぽく(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1c

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;->〺つふすそ:Ljava/util/regex/Pattern;

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$〳ぜぞぜべっ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_1c

    const/4 p1, 0x1

    goto :goto_1d

    :cond_1c
    const/4 p1, 0x0

    :goto_1d
    return p1
.end method
