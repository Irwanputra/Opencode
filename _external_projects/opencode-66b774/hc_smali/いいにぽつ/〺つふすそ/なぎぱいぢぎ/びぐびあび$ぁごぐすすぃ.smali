.class public final Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$ぁごぐすすぃ;
.super Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$くし〴〺ぅ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "[%s$=%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public げつ〴ぬぐ(Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;Lいいにぽつ/〺つふすそ/びぐびあび/ぺぁあねじ;)Z
    .registers 3

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->てぜきぽく(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1c

    iget-object p1, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lいいにぽつ/〺つふすそ/びぐびあび/へぬ〴づぞ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->のね〱ばぁぢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lいいにぽつ/〺つふすそ/なぎぱいぢぎ/びぐびあび$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1c

    const/4 p1, 0x1

    goto :goto_1d

    :cond_1c
    const/4 p1, 0x0

    :goto_1d
    return p1
.end method
