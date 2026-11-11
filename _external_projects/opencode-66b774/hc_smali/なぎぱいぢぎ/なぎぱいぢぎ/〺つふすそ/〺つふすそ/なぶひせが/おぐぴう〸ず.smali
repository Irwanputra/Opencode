.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;


# instance fields
.field public final synthetic 〺つふすそ:Z

.field public final synthetic くし〴〺ぅ:Z

.field public final synthetic げつ〴ぬぐ:Z

.field public final synthetic びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;


# direct methods
.method public constructor <init>(ZZZLなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;)V
    .registers 5

    iput-boolean p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;->げつ〴ぬぐ:Z

    iput-boolean p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;->〺つふすそ:Z

    iput-boolean p3, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;->くし〴〺ぅ:Z

    iput-object p4, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 7

    iget-boolean v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;->げつ〴ぬぐ:Z

    if-eqz v0, :cond_d

    iget v0, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->びぐびあび:I

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->〺つふすそ()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->びぐびあび:I

    :cond_d
    invoke-static {p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->えがぐせほち(Landroid/view/View;)Z

    move-result v0

    iget-boolean v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;->〺つふすそ:Z

    if-eqz v1, :cond_2a

    if-eqz v0, :cond_21

    iget v1, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->くし〴〺ぅ:I

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->くし〴〺ぅ:I

    goto :goto_2a

    :cond_21
    iget v1, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->げつ〴ぬぐ:I

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->くし〴〺ぅ()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->げつ〴ぬぐ:I

    :cond_2a
    :goto_2a
    iget-boolean v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;->くし〴〺ぅ:Z

    if-eqz v1, :cond_43

    if-eqz v0, :cond_3a

    iget v0, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->げつ〴ぬぐ:I

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->げつ〴ぬぐ:I

    goto :goto_43

    :cond_3a
    iget v0, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->くし〴〺ぅ:I

    invoke-virtual {p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->びぐびあび()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->くし〴〺ぅ:I

    :cond_43
    :goto_43
    invoke-virtual {p3, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;->げつ〴ぬぐ(Landroid/view/View;)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/おぐぴう〸ず;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;

    if-eqz v0, :cond_4e

    invoke-interface {v0, p1, p2, p3}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ざとぅぼこ〺;->げつ〴ぬぐ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/は〲ぱなで;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object p2

    :cond_4e
    return-object p2
.end method
