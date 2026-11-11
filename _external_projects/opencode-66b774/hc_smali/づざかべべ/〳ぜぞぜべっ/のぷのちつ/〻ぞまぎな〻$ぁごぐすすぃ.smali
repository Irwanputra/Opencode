.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$ぁごぐすすぃ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$なぎぱいぢぎ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Landroid/view/WindowInsets;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$なぎぱいぢぎ;-><init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$ぁごぐすすぃ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(IIII)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 6

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぺふねづ〺(Landroid/view/WindowInsets;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object p1

    return-object p1
.end method

.method public づざかべべ()Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;
    .registers 5

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$ぁごぐすすぃ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    if-nez v0, :cond_18

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$びぐびあび;->〺つふすそ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    .line 1
    iget v1, v0, Landroid/graphics/Insets;->left:I

    iget v2, v0, Landroid/graphics/Insets;->top:I

    iget v3, v0, Landroid/graphics/Insets;->right:I

    iget v0, v0, Landroid/graphics/Insets;->bottom:I

    invoke-static {v1, v2, v3, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ(IIII)Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$ぁごぐすすぃ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    :cond_18
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$ぁごぐすすぃ;->づざかべべ:Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;

    return-object v0
.end method
